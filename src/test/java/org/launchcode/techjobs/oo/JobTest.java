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

}
