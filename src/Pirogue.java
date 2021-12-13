public class Pirogue extends Bateau implements Rame{
    public  Pirogue(){}
    public  Pirogue(String Color , String forme ){
        this.Color = Color;
        this.forme = forme;
    }

    void sedeplacer(){
        System.out.println("Je me deplace");
    }

    void Accelerer(){
        System.out.println("Jaccelere");
    }

    public void Ramer(){
        System.out.println("Je me deplace avec une rame");

    }

}



