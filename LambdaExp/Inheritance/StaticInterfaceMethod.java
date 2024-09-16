package Inheritance;

public interface StaticInterfaceMethod {
    static int getJumpHeight(){//This method is assumed to be public and can not be inherited by an methods implementing the interface "StaticInterfaceMethod"
        return 10;
    }
}
class Stationary implements StaticInterfaceMethod{// a class can implement an interface
    public void getJumpHeight(){
        System.out.println(getJumpHeight());//this does not compile because there is no explicit refernce to the name of the interface like the below
        System.out.println(StaticInterfaceMethod.getJumpHeight());
    }
}
