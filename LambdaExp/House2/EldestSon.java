package House2;

import House.Mother;
public class EldestSon extends Mother {// here it mens whatever present in he mother class will be present in the eldest son by default
    public static void main(String[] args) {
        // Mother mother = new Mother(); Doesn't compile because youhave to access the money method using the Eldestson class because the mother is inherited 
        // mother.money;
        EldestSon son = new EldestSon();
        son.money();
    }
}
