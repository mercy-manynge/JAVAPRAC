package OcaExamPrep;

public class ObjectsCasting {
    class MaiMickey{
        public void mai(){
            System.out.println("Mai vaMickey");
        }
    }
    class Mickey extends MaiMickey{
        public void mwana() {
            System.out.println("Mwana wamai Mickey");
        }
    }
    
    public static void main(String[] args) {
    //create an instance of ObjectCasting to access inner classes
    ObjectsCasting hukama = new ObjectsCasting();
    //Upcasting
    MaiMickey tariro = hukama.new Mickey();
    tariro.mai();//valid because mai is a method in MaiMickey
    //tariro.mwana();//Invalid because mwana is not a method in MaiMickey
    //DownCasting so that you can print mwana
    ((Mickey)tariro).mwana();
    System.out.println("Mickey mwana waMaiMickey");
    }
}
