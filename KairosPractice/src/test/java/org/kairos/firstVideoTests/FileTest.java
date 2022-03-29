package org.kairos.firstVideoTests;

import junit.framework.TestCase;
import org.kairos.firstVideo.SecondExercice;
import org.springframework.beans.factory.annotation.Autowired;

public class FileTest extends TestCase {

    @Autowired
    SecondExercice secondExercice = new SecondExercice();

    public void testSecondExercice() {
//            secondExercice.getDttf().processDir(".", false, fileName -> fileName.startsWith("f"));
    }

}
