
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import java.util.function.IntFunction;
import java.util.function.Supplier;

public class Student {

    private int id;
    private String nom;
    private String prenom;

    public int age ;


    public Student(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<String> listToListString(List<Student> sts){
        Function<Student, String> studentToString = st -> st.getNom();
        List<String> noms = new ArrayList<String>();
        for(Student st: sts){
            noms.add(studentToString.apply(st));
        }
        return noms;
    }

    public static String listToString(List<String> ststr){
        Function<Student, String> studentToString = st -> st.getNom();
        String noms = "";
        for(String item: ststr){
            noms += " ," + item;
        }
        return noms;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Function<Student,String> studentToString = (Student st) ->
                st.getNom()+ " " + st.getPrenom();

        Student st = new Student(1, "baddi", "youssef");
        st.setAge(24);

        System.out.println(studentToString.apply(st));

        Student st1 = new Student(1, "baddi", "youssef");
        Student st2 = new Student(2, "baddi", "youssef");
        Student st3 = new Student(3, "baddi", "youssef");
        List<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        listToListString(students);
//        System.out.println(listToString(students));

        Function<List<Student>,String> listStudentToString = (List<Student> sts) -> {
            String noms="";
            for (Student item : sts){
                noms += item.getNom() + ", ";
            }
            return noms;

        };

//        //////////////////////
        Function<List<Student>,List<String>> listStudentToListStringComplexe = (List<Student> sts) -> {
            List<String> noms= new ArrayList<String>();
            for (Student item : sts){
                noms.add(item.getNom() + ", ");
            }
            return noms;

        };


        Function<List<String>, String> listStringToString = strlist -> {
            String noms = "";
            for(String item: strlist){
                noms += " ," + item;
            }
            return noms;
        };



        System.out.println(listStudentToString.apply(students));

        List<String> strList = listToListString(students);
        String names = listToString(strList);
        System.out.println(names);

        Function<List<Student>, String> listToStringComplexe =
                listStudentToListStringComplexe.andThen(listStringToString);

        System.out.println(listToStringComplexe.apply(students));

        Consumer<Student> ageIncrement = s -> s.age= s.age + 1; // s.setAge(s.getAge() + 1)

        Consumer<Student> nameIncrement = s -> s.setNom("happy");

        ageIncrement.accept(st);
        nameIncrement.accept(st);
        System.out.println(st);

        IntFunction<String> testParite = i -> (i % 2 ==0)?"pair":"impaire";
        System.out.println(testParite.apply(2));

        Supplier<Double> randomValue = () -> Math.random() * 100 ;

        System.out.println(randomValue.get());
    }
}

// Exercices
/*
listToString
param listof student
retourn string of names merjded by ","
 */

/*
Bifunction<T1, T2, R> avec la function apply
BinaryOperator<T> avec la function apply(T)

BinaryOperator<Integer> somme = a -> a+10;

some.apply(5) // return 15

Consumer<T>   avec methode accept(T) qui return void

function f(name, calback){calback(name)}

f("happy", function g(var x){
console.log(x);
})

Predicate<T>  return bool  avec la finction test
BiPredicate<T,R>  return bool  avec la finction test


intFunction<T> avec la function apply(integer t)


 */