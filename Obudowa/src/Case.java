public class Case {

    float haight, depth, witragh, weight;

    public Case(){
        this(100);
    }
    public Case(float h){
        this(h,100);
    }
    public Case(float h, float d){
        this (h,d,100);
    }
    public Case(float h, float d, float w){
        this(h,d, w,100);
    }


    public Case (float h, float d, float w, float wg){
        haight = h;
        depth = d;
        witragh = w;
        weight = wg;
    }

    void dismision(){
        System.out.println("Wysokość: "+haight);
        System.out.println("Głebokosc: "+ depth);
        System.out.println("Szerokość: "+ witragh);
    }
    void weight(){
        System.out.println("Waga wynosi: "+ weight);
    }

}
