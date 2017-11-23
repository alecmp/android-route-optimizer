package com.alessandro.easygarbagecollection;

/**
 * Created by alessandro.campanell on 20/11/2017.
 */

public class TrashCan {

    private String code;
    private double fillingLevel;
    private double latitude;
    private double longitude;


    //required empty constructor
    public TrashCan() {
    }

    public TrashCan(String code, double fillingLevel, double latitude, double longitude) {
        this.code = code;
        this.fillingLevel = fillingLevel;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getFillingLevel() {
        return fillingLevel;
    }

    public void setFillingLevel(double fillingLevel) {
        this.fillingLevel = fillingLevel;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}