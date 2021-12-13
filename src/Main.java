public class Test{
public static void main(String[] args) {
    Pirogue p= new Pirogue ("Blanche", "Rectangulaire"); 
    System.out.println(p.presenter());

    p.sedeplacer();
    p.Accelerer();
    p.Ramer();

    Yauth y= new Yauth ("Rose", "Triangulaire"); 
    System.out.println(y.presenter());

    y.Sedeplacer();
    y.Accelerer();
    y.Floter();
    
}
}

