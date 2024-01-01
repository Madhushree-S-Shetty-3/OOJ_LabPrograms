import java.util.Scanner;
class Book
{
String name,author;double price;int num_pages;
void Book(){
name="";author="";price=0.0;num_pages=0;}

void set(String nme,String authr,double pric,int pages){
this.name=nme;this.author=authr;this.price=pric;this.num_pages=pages;}

/*void display(){
System.out.println("Name of the book:"+name);
System.out.println("Author of the book:"+author);
System.out.println("Price of the book:"+price);
System.out.println("Number of pages of the book:"+num_pages);
}*/

public String toString()
{
 return "\nDetails of the book:\nName of the book:"+name+"\nAuthor of the book:"+author+"\nPrice of the book:"+price+"\nNumber of pages of the book:"+num_pages;
}

void get(){
Scanner sc=new Scanner(System.in);
String nme;String authr;double pric;int pages;
System.out.println("Enter the number of books:");
int n=sc.nextInt();
Book a[]=new Book[n];

for(int i=0;i<n;i++){
System.out.println("Enter the name of the book:");
nme=sc.next();
System.out.println("Enter the name of the author of the book:");
authr=sc.next();
System.out.println("Enter the price of the book:");
pric=sc.nextDouble();
System.out.println("Enter the number of pages of the book:");
pages=sc.nextInt();
a[i]=new Book();
a[i].set(nme,authr,pric,pages);}
for(int i=0;i<n;i++){
System.out.println(a[i].toString());
}
}
}


class BookD
{
public static void main(String args[])
{
Book b=new Book();
b.get();
}
}
