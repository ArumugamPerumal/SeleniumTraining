package org.uni;

public class InternDetails {
     private void internName() {
		System.out.println("Raja");
     }
     private void internDob() {
		System.out.println("2nd oct 1990");
	}
     private void internEducation() {
	    System.out.println("Bachelor of Engineering");

	}
     private void internPhone() {
	    System.out.println("9876543210");

	}
     private void internEmail() {
	    System.out.println("raja12@gmail.com");

	}
     private void internGender() {
	    System.out.println("Male");

	}
     
     private void internAddress() {
		System.out.println("Chennai");

	}
     public static void main(String[] args) {
    	 InternDetails i =new InternDetails();
    	 i.internName();
    	 i.internDob();
    	 i.internEducation();
    	 i.internPhone();
    	 i.internEmail();
    	 i.internGender();
    	 i.internAddress();
	}
}
