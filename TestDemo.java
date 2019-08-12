import java.util.Scanner;

//Author Rahib Amin
//Session 2 Assignment 4

public class TestDemo {

	public static void main(String[] args) {
		
		double grade1,grade2,grade3;
		double gradeAverage;
		String Sub1,Sub2,Sub3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter your First Subject: ");
		Sub1 = sc.next();
		
		System.out.print("Please Enter your First Subject's Score: ");
		grade1 = sc.nextDouble();
		if (grade1 == 0 ) {
			System.out.println("You have Entered Zero");
			System.out.print("Please Try agian: ");
			grade1 = sc.nextDouble();
		}
		else if(grade1 < 0 ) {
			System.out.println("You have Entered Negative Value ");
			System.out.print("Please Try agian: ");
			grade1 = sc.nextDouble();
		}
		else if(grade1 > 0 ) {
			
			System.out.println("You have Entered Positive Value ");
		}
		else {
			System.out.println("Invalid");
		}
		
		 if (grade1 > 70&& grade1 <= 100) {
			System.out.println("Your Grade in " + Sub1 + " is an A");
		}
		else if (61 < grade1  && grade1 < 70) {
			System.out.println("Your Grade in " + Sub1 + " is a B");
		}
		else if (grade1 > 0 && grade1 < 61) {
			System.out.println("Your Grade in " + Sub1 + " is a C");
		}
		 
		 System.out.println();	
		System.out.print("Please Enter your Second Subject: ");
		Sub2 = sc.next();
		
		System.out.print("Please Enter your Second Subject's Score: ");
		grade2 = sc.nextDouble();
		
		if (grade2 == 0) {
			System.out.println("You have Entered Zero");
			System.out.print("Please Try agian: ");
			grade2 = sc.nextDouble();
		}
		else if(grade2 < 0) {
			System.out.println("You have Entered Negative Value ");
			System.out.print("Please Try agian: ");
			grade2 = sc.nextDouble();
		}
		else if(grade2 > 0) {
			System.out.println("You have Entered Positive Value ");
		}
		else {
			System.out.println("Invalid");
		}
		
		if (grade2 > 70&& grade2 <= 100) {
			System.out.println("Your Grade in " + Sub2 + " is an A");
		}
		else if (61 < grade2  && grade2 < 70) {
			System.out.println("Your Grade in " + Sub2 + " is a B");
		}
		else if (grade2 > 0 && grade2 < 61) {
			System.out.println("Your Grade in " + Sub2 + " is a C");
		}
		
		System.out.println();	
		System.out.print("Please Enter your Third Subject: ");
		Sub3 = sc.next();
		
		System.out.print("Please Enter your Third Subject's Score: ");
		grade3 = sc.nextDouble();
		
		if (grade3 == 0) {
			System.out.println("You have Entered Zero");
			System.out.print("Please Try agian: ");
			grade3 = sc.nextDouble();
		}
		else if(grade3 < 0) {
			System.out.println("You have Entered Negative Value ");
			System.out.print("Please Try agian: ");
			grade3 = sc.nextDouble();
		}
		else if(grade3 > 0) {
			System.out.println("You have Entered Positive Value ");
		}
		else {
			System.out.println("Invalid");
		}
		if (grade3 > 70&& grade3 <= 100) {
			System.out.println("Your Grade in " + Sub3 + " is an A");
		}
		else if (61 < grade3  && grade3 < 70) {
			System.out.println("Your Grade in " + Sub3 + " is a B");
		}
		else if (grade3 > 0 && grade3 < 61) {
			System.out.println("Your Grade in " + Sub3 + " is a C");
		}
		else {
			System.out.println("Invalid");
		}
		
		
		
		gradeAverage = ((grade1+grade2+grade3)/3);
		System.out.println();	
		System.out.println("Your AVAERGAE for " + Sub1 + "," + Sub2 + "," + Sub3 + ", is " + gradeAverage);
	
		if (gradeAverage > 70&& gradeAverage <= 100) {
			System.out.println("Your overall avaergae is " + gradeAverage + " which is an A");
		}
		else if (61 < gradeAverage  && gradeAverage < 70) {
			System.out.println("Your overall avaergae is " + gradeAverage + " which is a B");
		}
		else if (gradeAverage > 0 && gradeAverage < 61) {
			System.out.println("Your overall avaergae is " + gradeAverage + " which is a C");
		}
	}

}

