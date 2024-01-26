/*Create a package CIE which has two classes- Student and Internals. The class Student has members like usn, name, sem. The class internals has an array that stores the internal marks scored in five courses of the current semester of the student. Create another package SEE which has the class External which is a derived class of Student. This class has an array that stores the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses.*/

import java.util.Scanner;
import CIE.Student;import CIE.Internals;import SEE.External;

class LabQ6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String name;int usn,sem;
System.out.println("Enter the number of students:");
int n=sc.nextInt();
Internals in[]=new Internals[n];
External ex[]=new External[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the name of the student "+(i+1)+":");
name=sc.next();
System.out.println("Enter the usn of the student "+(i+1)+":");
usn=sc.nextInt();
System.out.println("Enter the sem of the student "+(i+1)+":");
sem=sc.nextInt();
in[i]=new Internals(name,usn,sem);
ex[i]=new External();
System.out.println("Enter the internal marks of the student in 5 subjects:");
for(int j=0;j<5;j++)
in[i].imarks[j]=sc.nextInt();
System.out.println("Enter the external marks of the student in 5 subjects:");
for(int j=0;j<5;j++)
ex[i].emarks[j]=sc.nextInt();
}

for(int i=0;i<n;i++)
{
System.out.println("\nDetails of student "+(i+1)+":");
System.out.print("Name:"+in[i].name+"\t");
System.out.print("USN:"+in[i].usn+"\t");
System.out.print("Sem:"+in[i].sem+"\t");
System.out.println("\nInternal marks:");
for(int j=0;j<5;j++)
System.out.print("Subject "+(j+1)+":"+in[i].imarks[j]+"\t");
System.out.println("\nExternal marks:");
for(int j=0;j<5;j++)
System.out.print("Subject "+(j+1)+":"+ex[i].emarks[j]+"\t");
System.out.println("Final marks:");
for(int j=0;j<5;j++)
System.out.println("Subject "+(j+1)+":"+(in[i].imarks[j]+ex[i].emarks[j]));
}
}
}