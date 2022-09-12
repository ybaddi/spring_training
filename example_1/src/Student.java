public class Student {

    private int id;
    private String firstName;
    private String secondName;

    public IMiseForme iMiseForm = new IMiseForme() {
        @Override
        public void afficherDetail() {
            System.out.println("hello world");
        }
    };

    public IMiseForme iMiseFormExtend = new IMiseForme() {
        @Override
        public void afficherDetail() {
            System.out.println("hello world from iMiseFormExtend");
        }
    };

    public Student(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }


}




