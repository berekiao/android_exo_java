public class Yauth extends Bateau implements Flote{
    public  Yauth(){}
    public  Yauth(String Color , String forme ){
        this.Color = Color;
        this.forme = forme;
    }

    void Sedeplacer(){
        System.out.println("Je me deplace");
    }

    void Accelerer(){
        System.out.println("Jaccelere");
    }

     public void Floter(){
        System.out.println("Je me deplace avec une machine");

    }

}
