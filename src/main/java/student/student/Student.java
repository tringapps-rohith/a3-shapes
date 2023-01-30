package student.student;
import java.util.*;
import java.util.logging.Logger;
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
                l.log(Level.INFO,()-> "\nStudent name: "+name+"\nGrade: "+grade+"\nCurrent GPA: "+GPA);
        }
        public static void main(String ...args)
        {
                Scanner sin=new Scanner(System.in);
				Logger l=Logger.getLogger("com.api.jar");
                l.info("Enter name\n");
                String name=sin.next();
                l.info("Enter grade\n");
                String grade=sin.next();
                l.info("Enter GPA\n");
                double GPA=sin.nextDouble();
                Student s=new Student(name,grade,GPA);
                s.display();
                l.info("\nEnter the GPA to update\n");
                double newGPA=sin.nextDouble();
                s.updateGPA(newGPA);
                s.display();
                l.log(Level.INFO,()-> "\n"+name+" has a "+s.updateGPA(newGPA)+" GPA");
        }
}
