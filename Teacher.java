/**
Made by Gagandeep Singh
*/
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Teacher {

	//static Vector studentDb = new Vector();
	static ArrayList <Student> studentDb = new ArrayList <Student>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	Operations obj= new Operations();
		int rollNo;
		Student s;
		
		while (true) {
			System.out.println("Select Operation");
			System.out.println("1. Add new student");
			System.out.println("2. Delete Student");
			System.out.println("3. Search Student");
			System.out.println("4. List failed Students");
			System.out.println("5. Exit");
			System.out.println("Enter Choice");

			int ch;

			ch = sc.nextInt();

			switch (ch) {
			case 1:

				
				 s = obj.addStudent();

				studentDb.add(s);
				obj.display(studentDb);

				break;
			case 2:

				System.out.println("enter roll no to delete");
				rollNo = sc.nextInt();
				
				obj.deleteStudent(rollNo);
				obj.display(studentDb);

				break;

			case 3:
				

				System.out.println("enter roll no to search");
				rollNo = sc.nextInt();
				s = obj.searchStudent(rollNo);
				System.out.println(s);
				
				break;
			case 4:
				
				System.out.println("enter pass marks");
				double pm = sc.nextDouble();
				/*Vector v  =obj.failedStudents(pm);*/
				
				ArrayList<Student> v = obj.failedStudents(pm);
				
				obj.display(v);
				
				break;

			}
			if (ch == 5) {
				break;
			}

		}

	
	}
}

