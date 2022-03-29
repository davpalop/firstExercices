package org.kairos.firstVideo;

import java.io.FileFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SecondExercice {

    static DirectoryToTextFile dttf = new DirectoryToTextFile();

    public static void main(String[] args) throws IOException {

        Path home = Paths.get(".");

        //false para rutas absolutas y true para relativas, está definido dentro del if
        dttf.processDir(home, false, fileName -> fileName.startsWith("f"));
        dttf.processDir(home, true);
    }

    public static DirectoryToTextFile getDttf() {
        return dttf;
    }

    public static void setDttf(DirectoryToTextFile dttf) {
        SecondExercice.dttf = dttf;
    }
}
