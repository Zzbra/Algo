import java.util.ArrayList;
import java.util.Random;

public class Sequence {

    private ArrayList<Integer> sequenceInt ;

    public Sequence(int randMin, int randMax, int size)
    {
        ArrayList<Integer> randIntTab = new ArrayList<Integer>();
        int nimbleMax = randMax - randMin +1;
        Random random = new Random();

        for(int i=0; i<size; i++){
            randIntTab.add(random.nextInt(nimbleMax)+randMin);
        }
        this.sequenceInt=randIntTab;

    }

    public void print()
    {
        for(Integer i : sequenceInt)
          System.out.print(i+" ");
        System.out.println();
    }

   public ArrayList<Integer> getArray(){
        return this.sequenceInt;
   }


}
