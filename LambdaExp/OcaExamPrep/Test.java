package OcaExamPrep;

public class Test {
    static int count = 0;//static variable, can be shared among all instances of Test class
    int i = 0;//instance variable, each instance of Test will have its own i

    public void changeCount (){
        while (i < 5) {//changeCount increments i and count while i is less than 5
            i++;
            count++;//count is static, every increment affects the shared count variable.
        }
    }

    public static void main(String[] args){
        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + ":" + check2.count);

        System.out.println("------------------------");

        int a = 10;
        int b = 20;
 
        if (++a <= 10 && --b < 20) {}
          System.out.println("Output of && operator: "
                           + "a = " + a + " b = " + b);
        System.out.println("YARAMBA");
 
        a = 10;
        b = 20;
        if (++a <= 10 & --b < 20) {}
          System.out.println("Output of & operator: "
                          + "a = " + a + " b = " + b);
        System.out.println("-------------------");

        //Variables
        //Local Variables
        for(int i = 0; i < 3; i++){
            String loopMessage ="iteration" + i;//loopMessage is a local variable
            System.out.println(loopMessage);
        }
        System.out.println("----------------------");
        int x =10;
        int y =2;
        try{
        for(y=2; y >= 0; y--){
            int ans = x / y;
            System.out.println(ans+ " ");
        }
    } catch (ArithmeticException e1){
        System.out.println("E1");
    } catch (Exception e2){
        System.out.println("E2");
    }
    System.out.println("----------------------");
    int i1 = 123456;
    int i2 = 123_456;
    System.out.println(i1 == i2);
    }
    

}
