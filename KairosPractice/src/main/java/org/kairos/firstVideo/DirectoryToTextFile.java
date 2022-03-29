package org.kairos.firstVideo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryToTextFile {

    public static void processDir(Path dir, boolean relative, FileFilter filter) {
        //definimos cual es el path al que se va a aplicar el printwriter
        Path files = Paths.get("files.txt");

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(files))) {

            //clase anonima de la que cogemos el metodo visitFile
            Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
                //cambiamos el metodo para que haga lo que nosotros queramos
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
                    //Especificamos la condicion de que tiene que ser null el prefijo o por el contrario tener un String
                    if (filter == null || filter.accept(path.getFileName().toString())) {
                        //Comprueba si la ruta es absoluta y sino la convierte
                        if (!relative) {
                            path = path.toAbsolutePath().normalize();
                        }
                        //Imprimiendo en pantalla los resultados
                        System.out.println(path);
                        //Escribiendo en el archivo los resultados
                        pw.println(path);
                    }

                    return FileVisitResult.CONTINUE;

                }

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    File file = new File(String.valueOf(dir));
                    if (file.isDirectory()) {
                        System.out.println(file.getName());
                        pw.println(file.getName());
                    }
                    return super.preVisitDirectory(dir, attrs);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processDir(Path path, boolean relative) throws IOException {
        processDir(path, relative, null);
    }

    interface FileFilter {
        boolean accept(String fileName);
    }


}
