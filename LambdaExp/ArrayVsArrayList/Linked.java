package ArrayVsArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Linked {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Read a book");
        tasks.add("Watch a movie");
        tasks.add("Go for a walk");
        tasks.add("Go to the gym");
        System.out.println("All tasks before removing the first task:" + tasks);//Here we print all the tasks from LinkedList
        tasks.poll();//Here we are removing the first task
        System.out.println("Tasks after remmoving the first task:" + tasks);;
    }
}
