package com.company;

public class Main {

    public static void main(String[] args) {

    	Monitor m1 = new Monitor("white", 364.8f, 614.2f, "1080p");
		Monitor m2 = new Monitor("black", 548f, 903f, "4K UHD");

		m1.setResolution("2K");
		System.out.println(m1.getResolution());

	    University u1 = new University("UTM", 1945);
	    University u2 = new University("USM", 1954);
	    University u3 = new University("ULIM", 1920);

	    u1.addStudent("Serghei Petrov", 20, 9.3f);
        u1.addStudent("Ion Creanga", 23,8.2f);
	    System.out.println(u1.average());
    }
}
