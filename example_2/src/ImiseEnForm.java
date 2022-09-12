@FunctionalInterface
public interface ImiseEnForm {
    public void afficherDetails();
    default  public void afficherMoreDetails(String nom, String prenom){
        System.out.println(nom + " " + prenom);
    }

    default  public void afficherMoreDetails2(String nom, String prenom){
        System.out.println(nom + " " + prenom);
    }
}
