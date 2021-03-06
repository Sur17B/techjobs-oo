package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import org.launchcode.models.Job;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by LaunchCode
 */

public class JobForm {

    @NotNull
    @Size(min=1, message = "Name may not be empty")
    private String name;

    @NotNull
    private int employerId;

    @NotNull
    private String Employer;

    @NotNull
    private String Location;

    @NotNull
    private String coreCompetency;

    @NotNull
    private String positionType;

    /*
        TODO #3 - Included other fields needed to create a job,
        with correct validation attributes and display names.
        Don't forget to add getters and setters
     */

    public String getEmployer() {return Employer; }
    public void setEmployer(String Employer) {this.Employer = Employer;}

    public String getLocation() {return Location; }
    public void setLocation(String Location) {this.Location = Location;}

    public String getCoreCompetency() {return coreCompetency; }
    public void setCoreCompetency(String coreCompetency) {this.coreCompetency = coreCompetency;}

    public String getPositionType() {return positionType; }
    public void setPositionType(String positionType) {this.positionType = positionType;}

    //    ----------------------

    private ArrayList<Employer> employers;
    private ArrayList<Location> locations;
    private ArrayList<CoreCompetency> coreCompetencies;
    private ArrayList<PositionType> positionTypes;

    public JobForm() {

        JobData jobData = JobData.getInstance();

        /*
            TODO #4 - populate the other ArrayList collections needed in the view
        */

        employers = jobData.getEmployers().findAll();
        locations = jobData.getLocations().findAll();
        coreCompetencies = jobData.getCoreCompetencies().findAll();
        positionTypes = jobData.getPositionTypes().findAll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }

    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }

    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}