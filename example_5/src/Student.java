public class Student {
    private int id;
    private String nom;

    public Student() {
    }

    public Student(int id) {
        this.id=id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
