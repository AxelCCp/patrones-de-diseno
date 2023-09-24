package com.builder.domain;

public class Address {

    public Address() {
    }

    public Address(String address, String ciudad, String pais, String cp) {
        this.address = address;
        this.ciudad = ciudad;
        this.pais = pais;
        this.cp = cp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }

    private String address;
    private String ciudad;
    private String pais;
    private String cp;

}
