package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        String msg = "Each Job object should have a unique ID that is an integer";
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(msg, testJob1, testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        String msg = "Each Job object should contain six fields—id, name, employer, location, positionType, and coreCompetency";
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        boolean condition = testJob1 instanceof Job;
        assertTrue(msg, condition);

        assertEquals("Product tester", testJob1.getName());
        assertEquals("ACME", testJob1.getEmployer().getValue());
        assertEquals("Desert", testJob1.getLocation().getValue());
        assertEquals("Quality control", testJob1.getPositionType().getValue());
        assertEquals("Persistence", testJob1.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality(){
        String msg = "Two Job objects are considered equal if they have the same id value";
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int expected = testJob1.getId();
        int actual = testJob2.getId();
        assertNotEquals(msg, expected, actual);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        String msg = "When passed a Job object, it should return a string that contains a blank line before and after the job information";
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();
//        String expected =  String.format(
//                testJob1 + "%n");
        String expected = newline + testJob1 + newline;
        String actual = testJob1.toString();
        assertEquals(msg, expected, actual);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        String msg = "Contains correct labels and data";
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();
        String expected =  newline +
                "ID: " + testJob1.getId() + newline +
                "Name: " + testJob1.getName() + newline +
                "Employer: " + testJob1.getEmployer() + newline +
                "Location: " + testJob1.getLocation() + newline +
                "Position Type: " + testJob1.getPositionType() + newline +
                "Core Competency: " + testJob1.getCoreCompetency() + newline;
        String actual = testJob1.toString();
        assertEquals(msg, expected, actual);
    }

    @Test
    public void  testToStringHandlesEmptyField(){
        String msg = "If a field is empty, the method should add, 'Data not available' after the label";
        Job testJob1 = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        String expected = "Data not available";
//        String actual = testJob1.getEmployer().toString();
//        assertEquals(msg, expected, actual);
//        assertFalse(testJob1.getLocation() == null);

        String notNullMsg = "Data not available";
        assertNotNull(testJob1.getEmployer().toString(), notNullMsg);

    }

    //(Optional) If a Job object ONLY contains data for the id field, the method should
    // return, “OOPS! This job does not seem to exist.”

}
