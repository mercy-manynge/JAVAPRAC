//Return statement with try-catch block
package OcaExamPrep; 
public class Exceptions {
    public static void main(String[] args) {
        int n = returnTest(4);
        System.out.println(n);
    }
    public static int returnTest(int number) {
        int returnNumber = 0;//primitive value
        try{
            if(number % 2 == 0){
                throw new Exception("Exception Thrown");
            } else {
                return returnNumber;
            }
        } catch (Exception e){// this value is returned
            return returnNumber;//the primitive value initialised as 1 above
        } finally {
            returnNumber = 1;//primitive value is subsequently changed in the finally block form 0 to 1
        }
    }//returned 0 because the value of the int variable changed
}
