package sort;

public class Test1 {

    public static void main(String[] args) {

        String hex = "ff 55 66";
        System.out.println(Integer.parseInt(hex.substring(3,5),16));
        String f = "16.5";
        float f1 = Float.valueOf(f);
        System.out.println(f1);
    }
    private Person person;
    public interface Person{
        void name();
        void age();
    }
    private   void print(){
        person.name();
    }
}
