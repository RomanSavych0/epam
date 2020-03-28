package model;

public class Passenger {
    private int  passengerCode;
    private  String name;
    private  String surname;
    private  boolean privilege;

    public int getPassengerCode() {
        return passengerCode;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerCode=" + passengerCode +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", privilege=" + privilege +
                '}';
    }

    public void setPassengerCode(int passengerCode) {
        this.passengerCode = passengerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isPrivilege() {
        return privilege;
    }

    public void setPrivilege(boolean privilege) {
        this.privilege = privilege;
    }

    public Passenger(int passengerCode, String name, String surname, boolean privilege) {
        this.passengerCode = passengerCode;
        this.name = name;
        this.surname = surname;
        this.privilege = privilege;
    }

    public Passenger(String name, String surname, boolean privilege) {
        this.name = name;
        this.surname = surname;
        this.privilege = privilege;
    }
}
