package com.example.expandablerecyclerviewtask;

public class TouristModel {

     String tpname1;
     int downArrow1;
     int call1;
     int map1;
     int browse1;
     int tImage;
     String moNumber;
     double latitude;
     double longitude;
     String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(String moNumber) {
        this.moNumber = moNumber;
    }

    boolean expanded;

    public int gettImage() {
        return tImage;
    }

    public void settImage(int tImage) {
        this.tImage = tImage;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }



    public TouristModel(int tImage, String tpname1, int downArrow1, int call1, int map1, int browse1,String moNumber, double latitude, double longitude, String link) {
        this.moNumber = moNumber;
        this.tImage = tImage;
        this.tpname1 = tpname1;
        this.downArrow1 = downArrow1;
        this.call1 = call1;
        this.map1 = map1;
        this.browse1 = browse1;
        this.latitude = latitude;
        this.longitude = longitude;
        this.link = link;
        this.expanded = false;
    }

    public String getTpname1() {
        return tpname1;
    }

    public void setTpname1(String tpname1) {
        this.tpname1 = tpname1;
    }

    public int getDownArrow1() {
        return downArrow1;
    }

    public void setDownArrow1(int downArrow1) {
        this.downArrow1 = downArrow1;
    }

    public int getCall1() {
        return call1;
    }

    public void setCall1(int call1) {
        this.call1 = call1;
    }

    public int getMap1() {
        return map1;
    }

    public void setMap1(int map1) {
        this.map1 = map1;
    }

    public int getBrowse1() {
        return browse1;
    }

    public void setBrowse1(int browse1) {
        this.browse1 = browse1;
    }
}
