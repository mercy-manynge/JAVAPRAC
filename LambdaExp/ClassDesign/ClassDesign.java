package ClassDesign;

public class ClassDesign {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){//Stters can not have a return type, if you add a return type it will return an exception
        this.name = name;
    }
    public String getName(){
        return name; 
    }
 
}
class Person{
    public static void main(String[] args){
        ClassDesign aws = new ClassDesign();
        aws.setAge(25);
        System.out.println(aws.getAge());
        aws.setName("Mickeillah");
        System.out.println(aws.getName());
    }
}