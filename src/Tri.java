import java.util.ArrayList;
import java.util.Arrays;

public class Tri {


    public void triBulle(ArrayList<Integer> tableau)
    {
        int n = tableau.size();
        for(int j=n-1; j>1; j--)
        {
            for(int i=0; i<j; i++)
            {
                if(tableau.get(i) > tableau.get(i+1))
                {
                    int temp = tableau.get(i);
                    tableau.set(i, tableau.get(i+1));
                    tableau.set(i+1, temp);
                }
            }
        }


    }

    public void triInsertion(ArrayList<Integer> tableau)
    {
        int n = tableau.size();
        for(int j=1; j<=n-1; j++)
        {
            int key = tableau.get(j);
            int i = j-1;
            while(i>=0 && tableau.get(i)>key)
            {
                tableau.set(i+1, tableau.get(i));
                i--;
            }
            tableau.set(i+1, key);
        }

    }

    public void triFusion(ArrayList<Integer> tableau)
    {
        int n = tableau.size();
        if (n>1)
        {
            int n1, n2;

            n1=n/2;
            n2=n/2+(n%2);


            ArrayList<Integer> tableau1 = new ArrayList<>();
            ArrayList<Integer> tableau2 = new ArrayList<>();
            for(int i=0; i<n1; i++)
            {
                tableau1.add(tableau.get(i));
            }
            for(int j=n2; j<n; j++)
            {
                tableau2.add(tableau.get(j));
            }

            triFusion(tableau1);
            triFusion(tableau2);
            ArrayList<Integer> concat = new ArrayList<>(tableau1);
            concat.addAll(tableau2);
            fusion(concat, n1);

        }
    }

    public void fusion(ArrayList<Integer> tab1, int med)
    {
        ArrayList<Integer> buffer = new ArrayList(tab1);
        int n1 = med;
        int n2 = tab1.size()-med;
        int i=0;
        int j=med;
        for(int k=0; k<tab1.size(); k++)
        {
            if(tab1.get(i)<=tab1.get(j))
            {
                buffer.set(k,tab1.get(i));
                i++;
            }
            else
            {
                buffer.set(k, tab1.get(j));
                j++;
            }
        }
        tab1=buffer;
    }

    //public void triFusion(ArrayList<Integer>)

}
