package Vaccination;

public class Vaccine extends Citizen {
    public Vaccine(String name, String aadharNo, String phoneNo, int age) {
        super(name, aadharNo, phoneNo, age);
    }
    public void verifyAge() throws Exception {
        if(age<18) throw new Exception(name + ", " + age + ", is too young for vaccination");
        System.out.println(name + ", " + age + ", can be vaccinated");
    }
}
