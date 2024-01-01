import java.util.Scanner;
class Sgpa
{
String usn,name;int credits[]=new int[100];float marks[]=new float[100];
void Sgpa(){}
	
int accept(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name and usn of the student:");
name=sc.nextLine();
usn=sc.next();
System.out.println("Enter the number of the subjects:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.println("Enter the credits of the subject followed by the marks obtained in the subject:");
credits[i]=sc.nextInt();
marks[i]=sc.nextFloat();}
return n;
}

void display(int n){
System.out.println("Name of the student:"+name+"\nUSN of the student:"+usn);
for(int i=0;i<n;i++)
System.out.println("Credits of subject"+(i+1)+":"+credits[i]+"\tMarks of subject"+(i+1)+":"+marks[i]);
}

double sgpa_cal(int n){
double agg=0.0,s=0.0;int cr=0,crsum=0;
for(int i=0;i<n;i++){
if(marks[i]>=90)
cr=10;
else if(marks[i]>=80 && marks[i]<90)
cr=9;
else if(marks[i]>=70 && marks[i]<80)
cr=8;
else if(marks[i]>=60 && marks[i]<70)
cr=7;
else if(marks[i]>=50 && marks[i]<60)
cr=6;
else if(marks[i]>=40 && marks[i]<50)
cr=5;
else 
cr=0;
agg+=credits[i]*cr;
crsum+=credits[i];
s=(agg/crsum);}
return s;
}
}
class Sgpa_main
{
public static void main(String args[]){
Sgpa a=new Sgpa();
int n=a.accept();
a.display(n);
System.out.println("SGPA :"+(a.sgpa_cal(n)));}
}


