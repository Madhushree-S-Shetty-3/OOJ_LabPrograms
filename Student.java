/*Create a package CIE which has two classes- Student and Internals. The class Student has members like usn, name, sem. The class internals has an array that stores the 
internal marks scored in five courses of the current semester of the student. Create another package SEE which has the class External which is a derived class of Student. This class has an array that stores the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses.*/

package CIE;
public class Student{
public int usn,sem;public String name;
Student(){}
Student(String name,int usn,int sem)
{this.name=name;this.usn=usn;this.sem=sem;
}
}