package student.student;
import java.util.*;
class Student
{
        private String name;
        private String grade;
        private double GPA;
        public Student()
        {
        }
        public Student(String name,String grade,double GPA)
        {
                this.name=name;
                this.grade=grade;
                this.GPA=GPA;
        }
        public double updateGPA(double newGPA)
        {
                this.GPA=newGPA;
                return this.GPA;
        }
        public void display()
        {
                System.out.print("\nStudent name: "+name+"\nGrade: "+grade+"\nCurrent GPA: "+GPA);
        }
        public static void main(String ...args)
        {
                Scanner sin=new Scanner(System.in);
                System.out.print("Enter name\n");
                String name=sin.next();
                System.out.print("Enter grade\n");
                String grade=sin.next();
                System.out.print("Enter GPA\n");
                double GPA=sin.nextDouble();
                Student s=new Student(name,grade,GPA);
                s.display();
                System.out.print("\nEnter the GPA to update\n");
                double newGPA=sin.nextDouble();
                s.updateGPA(newGPA);
                s.display();
                System.out.print("\n"+name+" has a "+s.updateGPA(newGPA)+" GPA");
        }
}