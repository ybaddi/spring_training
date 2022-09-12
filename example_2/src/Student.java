public class Student {

    // TODO field

    public ImiseEnForm imiseEnForm = new ImiseEnForm() {
        @Override
        public void afficherDetails() {
            System.out.println("hello world from function interface");
        }
    };

    public ImiseEnForm imiseEnForm2 = () -> {
        System.out.println("hello world from function interface");
    };

    public static void main(String[] args) {
        Student st = new Student();

        st.imiseEnForm2.afficherDetails();

        ICalcule plus = (int x, int y) -> x+y; // { return x+y;};

        System.out.println(plus.operationBinaire(3,5));
        System.out.println(plus.getClass());
        System.out.println(plus.getClass().getSuperclass());

        IcalculeVoid plusVoid = (int x, int y) -> System.out.println(x+y); // { return x+y;};

        plusVoid.operationBinaire(3,5);
        System.out.println(plusVoid.getClass());
        System.out.println(plusVoid.getClass().getSuperclass());

        int i=2, j=3;
        ICalculeComplexe plusComplexe = (int x, int y) -> {
            final int k = i+1;
            x++;
            return x * k + y * j;
        };

        System.out.println(plusComplexe.operationBinaire(i,5));
        System.out.println(i);
        System.out.println(plusComplexe.getClass());
        System.out.println(plusComplexe.getClass().getSuperclass());


    }
}
