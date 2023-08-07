package org.tatek;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tatek on 8/3/2023
 */

public class CandidateDetails {
    private String consultantName;
    private String phoneNumber;
    private String email;
    private String skills;
    private String location;
    private String EmploymentForm;

    static ArrayList<CandidateDetails> candidates = new ArrayList<>();

    public CandidateDetails() {
    }

    public CandidateDetails(String consultantName, String phoneNumber, String email, String skills, String location) {
        this.consultantName = consultantName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.skills = skills;
        this.location = location;
    }

    public void add(CandidateDetails candidateDetails){
        candidates.add(candidateDetails);
    }

    public static List <CandidateDetails> getCandidates(){
        return candidates;
    }

    public  String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getEmploymentForm() {
        return EmploymentForm;
    }

    public void setEmploymentForm(String employmentForm) {
        EmploymentForm = employmentForm;
    }
    @Override
    public String toString() {
        return "CandidatesData{" +
                "consultantName='" + consultantName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skills='" + skills + '\'' +
                ", location='" + location + '\'' +
                ", EmploymentForm='" + EmploymentForm + '\'' +
                '}';
    }
}
