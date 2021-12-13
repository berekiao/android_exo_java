 abstract class Bateau {
    protected String Color ;
    protected String forme;
    //abstract String Sedeplacer();
    //abstract String Accelerer();
    

public String presenter() {
    String str = "Cest un bateau de type" + this.getClass() + " de couleur  " + this.Color ;
    return str ;
}
}
