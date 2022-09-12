import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

    public static int somme (int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
         Icalcule iCalcule = Main::somme;

//         iCalcule.somme()

        Consumer<String> display = System.out::println;
        display.accept("hello");

        Supplier<Student> construct = Student::new;

        Student st = construct.get();
        System.out.println(st);
    }
}
