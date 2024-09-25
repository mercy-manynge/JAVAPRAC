package ConditionalStatements;

public class IfElse {
    private int salary;

    public void setSalary(int salary){
        if(salary > 0){
            this.salary = salary;
        } else{
            System.out.println("Salary cannot be negative");
            System.out.println("Invalid Salary");
        }
    }
    public int getSalary(){
        return salary;
    }
}
class Main{
    public static void main(String[] args) {
        IfElse ifelse = new IfElse();
        ifelse.setSalary(2000);
        System.out.println("Salary is : " + ifelse.getSalary());//If you ommit this SOUT statement the code will print nothing
        //if you ommit the + for concatination the code will return an exception
    }
}
