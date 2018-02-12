package org.launchcode.models;


public class Location {
    private String venue;
    private String city;
    private String state;
    private String country;

    //public Location(){}
    public Location(String venue, String city, String state, String country){
        this.venue = venue;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
