package House;

public class Son {
    public static void main(String[] args) {
        Father father = new Father();
        father.money(); //Father has a private access modifier so can not give money o he son
    }
}
