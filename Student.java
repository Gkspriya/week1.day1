package week1.day1;


public class Student {
	
	static String student_Name="Shanmugapriya k";
	static int stud_Rollno=4786;
public static void main(String[] args) {
	Student Obj=new Student();
	Obj.college();
	System.out.println("Student Name: "+ student_Name);
	System.out.println("Student RollNo: "+stud_Rollno);
	}	
 
public void college() {
	String college_Name="SLCS College";
	System.out.println("Name of the college:" +college_Name);
	
}
}
