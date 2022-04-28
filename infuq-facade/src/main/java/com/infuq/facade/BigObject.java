package com.infuq.facade;

public class BigObject {

    private String address;

    private Integer year;

    private byte[] padding = new byte[3 * 1024 * 1024];

    public BigObject() { }

    public BigObject(String address, Integer year) {
        this.address = address;
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
