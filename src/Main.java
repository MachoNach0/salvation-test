import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("There are many people that have made magic");
        System.out.println("therein lies the pain in my heart that makes me feel so regardless");
        System.out.println("touche fagirantiesret");

        ArrayList<String> holderOfString = new ArrayList<>();
        String a = "t";
        String b = "b";
        String c = "mmmmmmmmm";

        holderOfString.add(a);
        holderOfString.add(b);
        holderOfString.add(c);
        int x = 0;
        while (x < 5){
            for (String string : holderOfString) {
                System.out.println(string);
            }
            System.out.println("This is a new line of code");
            x++;
        }
    }


}