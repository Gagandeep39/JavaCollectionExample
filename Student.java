/**
Made by Gagandeep Singh
*/
public class Student{

    public int rollNo;
    public String name;
    public double marks;

    public Student(int rollNo, String name, double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", marks="
                + marks + "]";
    }


}
