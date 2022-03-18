package com.syntax.class14;

public class HWClass13 {
	
	int largerNumber(int num1, int num2) {
		if (num1>num2)
			return num1;
		else
			return num2;

	}
	void evenOrOdd(int num3) {
		if (num3%2==0)
			System.out.println(num3+" is even.");
		else
			System.out.println(num3+" is odd.");
	}
	
	String sayHello (String countryName){
		if (("Turkey").equalsIgnoreCase(countryName))
			return "Merhaba";
		else if (("USA").equalsIgnoreCase(countryName))
			return "Hello";
		else if (("Germany").equalsIgnoreCase(countryName))
			return "Hallo";
		else
			return "Invalid";		
	}
	
	void createEmail(String name, String lname, String mail) {
		
		System.out.println(name + lname+"@"+mail+".com");

	}
	boolean primeOrNot(int num4) {
		
		boolean flag = false;
	    for (int i = 2; i <= num4 / 2; ++i) {
	      // condition for nonprime number
	      if (num4 % i == 0) {
	        flag = true;
	      }
	    }

	    if (!flag) {
	    	return true;
		}
	    else {
	    	return false;
	    }
	 
	}

	public static void main(String[] args) {
		
		HWClass13 hw = new HWClass13();
		System.out.println(	hw.largerNumber(35,67) );
		hw.evenOrOdd(859);
		
		System.out.println(hw.sayHello("Germany"));
		hw.createEmail("sakir", "sahin", "hotmail");
		System.out.println(hw.primeOrNot(57));
		Student s= new Student();
		s.score=74;
		s.getGrade();






	}

		
		
	
}



