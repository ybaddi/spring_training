public class Main {

    public static void main(String[] args) {
        Student st = new Student(1, "baddi", "youssef");
        st.iMiseForm.afficherDetail();
        System.out.println(st.iMiseForm.getClass());
        System.out.println(st.iMiseForm.getClass().getSuperclass());

        st.iMiseFormExtend.afficherDetail();
        System.out.println(st.iMiseFormExtend.getClass());
        System.out.println(st.iMiseFormExtend.getClass().getSuperclass());
        st.iMiseFormExtend.afficherMoreDetail();
    }
}
