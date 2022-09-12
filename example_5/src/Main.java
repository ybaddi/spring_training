import java.util.*;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>(Arrays.asList(2,7,1,3,4,9));

        liste.forEach( item -> System.out.println(item));

        liste.forEach(System.out::println);

        List<Student> listStudents = new ArrayList<Student>(Arrays.asList(new Student(), new Student(), new Student()));

        listStudents.forEach( item -> System.out.println(item.getNom()));

        listStudents.forEach( item -> item.setId(3));

        listStudents.forEach(System.out::println);

        // stream intermidiare

                         // map

                         // filter(Predicat)

        // stream consumer
                // foreach
                // reduce
                // count
                // collect
                // .......

        Stream st1 = Stream.of(1,3,4,7,"hello");
        int[] tab = {1,4,5,2,7};
        Stream st2 = Stream.of(tab);
        List<Integer> listeInteger = Arrays.asList(2,7,1,3,4,9);
        Stream<Integer> st3 = listeInteger.stream();
//        long size = st3.count();
//        System.out.println(size);
//        st3.forEach(item -> System.out.println(item));
//        st3.forEach(System.out::println);

//        st3.map(item -> item+2).forEach(System.out::println);
//        st3.map(item -> item+2)
//                .filter(item -> item > 7)
//                .forEach(System.out::println);


        System.out.println("============");
        int somme = st3.map(item -> item+2)
                .filter(item -> item > 6)
                .reduce((a,b) -> a+b)
                .orElse(0);

        System.out.println(somme);
//        if(somme.isPresent()){
//            System.out.println(somme.get());
//        }


        List<Student> listeStudents = Arrays.asList(new Student(1),
                new Student(2),
                new Student(3));
        Stream<Student> st4 = listeStudents.stream();

        st4
                .filter(item -> item.getId() > 1)
                .reduce((a,b) -> {
                    return new Student(a.getId()+b.getId());
                }).ifPresent(System.out::println);

//        if(sommeIdsStudents.isPresent()){
//            System.out.println(sommeIdsStudents.get().getId());
//        }


        listeInteger.forEach(System.out::println);
        Stream<Integer> st5 = listeInteger.stream();
//        listeInteger = st5.map(item -> item+2)
//                .filter(item -> item > 6)
//                .collect(Collectors.toList());
        System.out.println("=======");
        listeInteger.forEach(System.out::println);

        System.out.println("=======");
        Stream<Integer> st6 = listeInteger.stream();
//        int maxnmb = st6.map(item -> item+2)
        boolean isequalTo9 = st6.map(item -> item+2)
                .filter(item -> {return item > 6;})
//                .max(Comparator.naturalOrder()).get();
                .anyMatch(item -> item==9);
        System.out.println("=======");
//        System.out.println(maxnmb);
        System.out.println(isequalTo9);
        /*
        for(Integer item : list){
         System.out.println(item)
         }
         */
    }
}
