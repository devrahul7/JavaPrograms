class Student{
    String name;
    int age;
    public void printname(){
        System.out.println(this.name);
        System.out.println(this.age);
}}

public class OOPS{

    public static void main (String args[]){

        Student s1 = new Student();
        s1.name = "shradha";
        s1.age = 21;

        s1.printname();
        
    }

} 