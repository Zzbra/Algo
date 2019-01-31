import java.util.ArrayList;


public class Main {



    public static void main(String[] args){

        Tri tri = new Tri();
       Sequence intSequence = new Sequence(0,100,50);

       intSequence.print();
       tri.triFusion(intSequence.getArray());
       intSequence.print();
    }



}
