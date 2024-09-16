package Polymorphism;
public class Casting {
    public boolean hasHair() {
      return true;
    }
  }
   interface HasTail {
    public boolean isTailStriped();
  }
   class Lemur extends Casting implements HasTail {
    public boolean isTailStriped() {
      return false;
    }
    public int age = 10;
    public static void main(String[] args) {
      Lemur lemur = new Lemur();
      Casting casting = lemur;
      Lemur lemur3 = (Lemur)casting;// casting from the superclass(casting) to the subclass(Lemur) that explicit casting
      System.out.println(lemur3.age);
      System.out.println(lemur.age);
      HasTail hasTail = lemur;
      System.out.println(hasTail.isTailStriped());
      Casting primate = lemur;
      System.out.println(primate.hasHair());
      }
  }