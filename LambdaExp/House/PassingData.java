package House;

public class PassingData {
    public static void main(String[] args) {
        int x = 5;
        change(x);//I passed the value of x and not the location of x so x is 5
        System.out.println(x);// we are passing the value and not the refence

        String webby = "Webby";
        stringChange(webby);
        System.out.println(webby);

        webby = stringChangeReturn(webby);//reassigning it to the original variable
        System.out.println(webby);// here returns bird because the variable on "return" is returning a new value which is   
        
        StringBuilder builder = new StringBuilder("Mickey");
        changeStringBuilder(builder);
        System.out.println(builder);

        PassingData now = new PassingData();
        now.callMethods();
    }
    void callMethods(){
        fly(10);//Autoboxing happens here when int 10 is coverted to an integer automatically
    }
    static void change(int num){
        num = 10;
    }
    static void stringChange(String webby){
        webby = "bird";
    }
    static String stringChangeReturn(String webby){//assigning the parameter webby
        webby = "bird";//changing it to bird 
        return webby;//return bird
    }
    static void changeStringBuilder(StringBuilder builder){
        builder.append(" Mercy");
    }
    public void fly(Integer numFeet){
        System.out.println("Integer numFeet is called");
    }
}
