package Inheritance;

public interface AbstractMethodsAndInheritance {
    public String name();
}
interface Person{
    int name();
    /*void name();
     * the two methods above will not compile together because in java you can not define
     * two methods with the same name but different return types
    */
    public String name(String name);
}
interface Parents {
    public void name();
}
interface Mother extends AbstractMethodsAndInheritance, Parents{}//Throws an exception because you can not define interface or abstract class that inherits from two conflicting interfaces
abstract class Father implements AbstractMethodsAndInheritance, Parents{// throws an exception
    public String name(){
        System.out.println("Mercy");
        return "String";
    }
    public void name(){
        return "maize";
    }
    /*the above two methods do not compile because the name methods are two conflicting interfaces 
     * you can not define two methods with the same name but different return types
     */
}