public interface IMiseFormInterface {
        public abstract void afficherDetail();
        default public void afficherMoreDetail(){
             System.out.println("hello wolrd");
         }
    }
