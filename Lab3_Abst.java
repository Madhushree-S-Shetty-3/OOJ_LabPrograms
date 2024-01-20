/*Develop a Java program to create an abstract class named Shape that contains two 
integers and an empty method named printArea( ). Provide three classes named 
Rectangle, Triangle and Circle such that each one of the classes extends the class 
Shape. Each one of the classes contain only the method printArea( ) that prints the 
area of the given shape.*/

import java.util.Scanner;
abstract class Shape
{
int a,b;
abstract void printArea();
}
class Rectangle extends Shape
{ void printArea(){
 System.out.println("Area of Rectangle:" + (a*b));}
}
class Triangle extends Shape
{ void printArea(){
System.out.println("Area of Triangle:" + (.5*a*b));}
}
class Circle extends Shape
{ void printArea(){ 
System.out.println("Area of Circle:" +((22.0/7)*a*a));}
}

class Abs
{
public static void main(String args[])
{ Scanner sc= new Scanner(System.in);
Rectangle aa=new Rectangle(); 
Triangle bb=new Triangle();
Circle cc=new Circle();
System.out.println("Enter 1.Area of Rectangle\n2.Area of Triangle\n2.Area of Circle");
int n=sc.nextInt();
switch(n)
{case 1:
System.out.println("Enter length and breadth of rectangle:");
aa.a=sc.nextInt();
aa.b=sc.nextInt();
aa.printArea();
break;

case 2:
System.out.println("Enter length and height of triangle:");
bb.a=sc.nextInt();
bb.b=sc.nextInt();
bb.printArea();
break;

case 3:
System.out.println("Enter radius of circle:");
cc.a=sc.nextInt();
cc.printArea();
break;

default:System.out.println("Invalid choice");
}
}
}