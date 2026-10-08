import java.util.Scanner;

class Student {
String studentName;
int rollNumber;
int marks;
String courseName;
int courseCredits;
Student(String studentName, int rollNumber, int marks, String courseName, int courseCredits) {
this.studentName = studentName;
this.rollNumber = rollNumber;
this.marks = marks;
this.courseName = courseName;
this.courseCredits = courseCredits;
}
int calculateFee() {
return courseCredits * 1500;
}
boolean checkEligibility() {
return marks >= 50;
}
double calculateScholarship(int fee) {
if (marks >= 85) {
return fee * 0.20; 
}
else if (marks >= 70) {
return fee * 0.10; 
}
else {
return 0;
 }
 }
double calculateFinalFee(int fee, double scholarship) {
return fee - scholarship;
}
void displayDetails() {
int fee = calculateFee();
double scholarship = calculateScholarship(fee);
double finalFee = calculateFinalFee(fee, scholarship);
System.out.println("Student Name: " + studentName);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Marks: " + marks);
System.out.println("Course Name: " + courseName);
System.out.println("Course Credits: " + courseCredits);
System.out.println("Eligibility: " + (checkEligibility() ? "Eligible" : "Not Eligible"));
System.out.println("Total Fee: Rs. " + fee);
System.out.println("Scholarship: Rs. " + scholarship);
System.out.println("Final Fee: Rs. " + finalFee);
}
}
public class StudentCourseRegistration {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Student Name: ");
String name = sc.nextLine();
System.out.print("Enter Roll Number: ");
int roll = sc.nextInt();
System.out.print("Enter Marks: ");
int marks = sc.nextInt();
sc.nextLine(); 
System.out.print("Enter Course Name: ");
String course = sc.nextLine();
System.out.print("Enter Course Credits: ");
int credits = sc.nextInt();
Student s = new Student(name, roll, marks, course, credits);
if (s.checkEligibility()) {
s.displayDetails();
}
else {
System.out.println("\nStudent is NOT eligible for registration (marks below 50).");
}
sc.close();
}
}