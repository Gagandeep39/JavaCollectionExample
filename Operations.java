/**

Made by GAgandeep Singh
*/
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Operations {

	Student addStudent() {

		Scanner sc = new Scanner(System.in);

		System.out.print("RollNo:");
		int rollNo = sc.nextInt();

		System.out.print("Name:");
		String name = sc.next();

		System.out.print("Marks:");
		double marks = sc.nextDouble();

		Student obj = new Student(rollNo, name, marks);
		return obj;
	}

	void deleteStudent(int rollno) {
		for(Student s : Teacher.studentDb)
		{
			if (s.rollNo == rollno) {
				int index = Teacher.studentDb.indexOf(s);
				Teacher.studentDb.remove(index);
			 break;
			}
		}
	}

	Student searchStudent(int rollno) {
		Student st = null;
			
		for(Student s:Teacher.studentDb){
			
			if (s.rollNo == rollno) {
				st=s;

				break;

			}
			
			
		}
		return st;

	}

	ArrayList<Student>failedStudents(double pm) {
		
		ArrayList<Student> v = new ArrayList<Student>();
		
		
			
		for(Student s:Teacher.studentDb)
		{
			if (s.marks< pm) {

				v.add(s);

			}
			
		}

		return v;
	}

	
	void display(ArrayList<Student> v)
	{
		
		for(Student s : v){
			System.out.println("Element in ArrayList" + s);
		}

		
	}
}


