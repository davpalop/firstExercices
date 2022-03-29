package org.kairos.firstVideoTests;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.kairos.firstVideo.StreamExercice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

    StreamExercice streamExercice = new StreamExercice();

    @Test
    public void testStream() {
        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(30, 8, 2, 3, 6, 21, 300, 201,8, 12, 11));
        streamExercice.counterOver10WithStream(intList);
    }


}
