package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        id = nextId;
        nextId++;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();

//        if (getName().isEmpty()){
//            setName("Data not available");
//        }
//
//        if (employer.getValue() == null){
//            employer.setValue("Data not available");
//        }
//
//        if (location.getValue().isEmpty()){
//            location.setValue("Data not available");
//        }
//
//        if (positionType.getValue().isEmpty()){
//            positionType.setValue("Data not available");
//        }

//
//        return String.format("%nID: " + getId()+
//                "%nName: " + (name.isEmpty() ? "Data not available" : name) +
//                "%nEmployer: " + (employer.getValue().isEmpty() ? "Data not available" : employer) +
//                "%nLocation: " + (location.getValue().isEmpty() ? "Data not available" : location) +
//                "%nPosition Type: " + (positionType.getValue().isEmpty() ? "Data not available" : positionType) +
//                "%nCore Competency: " + (coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency) + "%n");

        return newline +
                "ID: " + getId() + newline +
                "Name: " + (name.isEmpty() ? "Data not available" : name) + newline +
                "Employer: " + (employer.getValue().isEmpty() ? "Data not available" : employer) + newline +
                "Location: " + (location.getValue().isEmpty() ? "Data not available" : location) + newline +
                "Position Type: " + (positionType.getValue().isEmpty() ? "Data not available" : positionType) + newline +
                "Core Competency: " + (coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency) + newline;

//
//        return newline +
//                "ID: " + getId() + newline +
//                "Name: " + getName() + newline +
//                "Employer: " + getEmployer() + newline +
//                "Location: " + getLocation() + newline +
//                "Position Type: " + getPositionType() + newline +
//                "Core Competency: " + getCoreCompetency() + newline;
    }
}
