package com.syntax.class14;

public class Student {
	int score;
	
	void getGrade() {
	if (score>90)
	{		
		System.out.println("A");
	}
	else if(score>80) {
		System.out.println("B");

	}
	else if(score>70) {
		System.out.println("C");

	}
	else if(score>50) {
		System.out.println("D");

	}
	else {
		System.out.println("F");
	}
	}
}
