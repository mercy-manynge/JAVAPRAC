package OcaExamPrep;

public class ConstructorChaining {
    int x, y;
    public ConstructorChaining(){
        System.out.println("Default constructor");
    }
    public ConstructorChaining(int x){
        // new ConstructorChaining();//This is wrong beacause you are creating a new object of constructor class using the default constructor, this is wrong for the exam
        this();//Is calling the default constructor with no parameters
        this.x = x;
    }
    public ConstructorChaining(int x, int y){
        this(x);//when we call the above constructor here we don't have to asign it to a value because it has already been asigned a value above
        this.y = y;// so here we just asign a value to y and thats the advantage of method chaining
    }

    public static void main(String[] args) {
        ConstructorChaining c = new ConstructorChaining(10, 20);// this is the most relevant also prints the default constructor
        new ConstructorChaining(10, 20);//This will print what is in the default constructor

        System.out.println(c.x);
        System.out.println(c.y);
    }
}
