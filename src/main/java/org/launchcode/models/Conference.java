package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Conference {
    @Id
    @GeneratedValue
    public int id;
    @NotNull
    public String conferenceName;
    @NotNull
    public Date conferenceStartDate;    //Change to a class consisting in M, D, Y
    public Date conferenceEndDate;
    //public Location conferenceLocation;
    public String conferenceDescription;
    public String conferenceOpenTo;
    //public String presentationType; (talk, poster, symposium?)
    public String conferenceWebsite;

    public Date submissionDate;
    public ArrayList<String> submissionType;
    //public Blah submissionLength;
    public String sendSubmissionTo;
    public String contact;


    public Conference(){}

    public Conference(String conferenceName, Date conferenceStartDate, Date conferenceEndDate,
                      Location conferenceLocation, String conferenceOpenTo,
                      String conferenceDescription, String conferenceWebsite, Date submissionDate,
                      ArrayList<String> submissionType, String sendSubmissionTo, String contact){
        this.conferenceName = conferenceName;
        this.conferenceStartDate = conferenceStartDate;
        this.conferenceEndDate = conferenceEndDate;
        //this.conferenceLocation = conferenceLocation;
        this.conferenceDescription = conferenceDescription;
        this.conferenceWebsite = conferenceWebsite;
        this.submissionDate = submissionDate;
        this.submissionType = submissionType;
        this.sendSubmissionTo = sendSubmissionTo;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public String getConferenceName() {
        return conferenceName;
    }
    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public Date getConferenceStartDate() {
        return conferenceStartDate;
    }
    public void setConferenceStartDate(Date conferenceStartDate) {
        this.conferenceStartDate = conferenceStartDate;
    }

    public Date getConferenceEndDate() { return conferenceEndDate; }
    public void setConferenceEndDate(Date conferenceEndDate) {
        this.conferenceEndDate = conferenceEndDate;
    }

    //public Location getConferenceLocation() { return conferenceLocation; }
    //public void setConferenceLocation(Location conferenceLocation) {this.conferenceLocation = conferenceLocation; }

    public String getConferenceDescription() {
        return conferenceDescription;
    }
    public void setConferenceDescription(String conferenceDescription) {
        this.conferenceDescription = conferenceDescription;
    }

    public String getConferenceOpenTo() {
        return conferenceOpenTo;
    }
    public void setConferenceOpenTo(String conferenceOpenTo) {
        if (conferenceOpenTo.equals("everyone") || conferenceOpenTo.equals("onlyGrads")
            || conferenceOpenTo.equals("other")){
            this.conferenceOpenTo = conferenceOpenTo;
        }
        else {
            this.conferenceOpenTo = null;
        }
    }

    public String getConferenceWebsite() {
        return conferenceWebsite;
    }
    public void setConferenceWebsite(String conferenceWebsite) {
        this.conferenceWebsite = conferenceWebsite;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }
    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }


    public ArrayList<String> getSubmissionType() {
        return submissionType;
    }
    public void setSubmissionType(ArrayList<String> submissionType) {
        this.submissionType = submissionType;
        for (String type : submissionType) {
            if (type.equals("paper") == false && type.equals("abstract") == false
                    && type.equals("other") == false) { both, either....match html
                this.submissionType = null;
                break;
            }
        }
    }

    public String getSendSubmissionTo() {
        return sendSubmissionTo;
    }
    public void setSendSubmissionTo(String sendSubmissionTo) {
        this.sendSubmissionTo = sendSubmissionTo;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

}
