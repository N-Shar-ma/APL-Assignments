package Vaccination;

public abstract class Citizen {
    String name, aadharNo, phoneNo;
    int age;

    Citizen(String name, String aadharNo, String phoneNo, int age) {
        this.name = name;
        this.aadharNo = aadharNo;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public abstract void verifyAge() throws Exception;
}