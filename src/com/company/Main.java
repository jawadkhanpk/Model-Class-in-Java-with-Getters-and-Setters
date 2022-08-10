package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ModelClass md = new ModelClass();
        md.setName("Jawad Khan");
        md.setAddress("Abbottabad KPK");
        md.setAge(22);
        md.setPhoneNumber("+923489438548");
        md.setStudentNumber("FA197191");

        System.out.println("Student Name: "+ md.getName());
        System.out.println("Student Address: "+ md.getAddress());
        System.out.println("Student Age: "+md.getAge());
        System.out.println("Student Phone Number: "+md.getPhoneNumber());
        System.out.println("Student Number: "+md.getStudentNumber());



    }
}
