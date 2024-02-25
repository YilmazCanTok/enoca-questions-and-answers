import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String args[]){
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int x;
        for (int i = 0 ; i<100; i++){
            x = random.nextInt(1000);
            arrayList.add(x);
        }
        ArrayList<Integer> secondArrayList = new ArrayList<>(arrayList);
        System.out.println("Arraylistlerin 1. Durumdaki İndekslerinin Değerleri: ");
        for (int c = 0 ; c<100; c++){
            System.out.println(c+". indeks değerleri :"+arrayList.get(c)+" + "+secondArrayList.get(c));
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        int z = random.nextInt(100);
        secondArrayList.remove(z);
        secondArrayList.add(0);
        resultFinder(arrayList,secondArrayList);
    }
    public static void resultFinder(ArrayList a, ArrayList b){
        for (int p = 0 ; p<100; p++){
            System.out.println(p+". indeks değerleri :"+a.get(p)+" + "+b.get(p));
        }
        System.out.println();
        for (int i = 0; i<100 ; i++){
            if(!(a.get(i)==b.get(i))){
                System.out.println(i+". indeksteki eleman değiştirilmiştir. Bu değer ise: "+a.get(i)+" sayısıdır.");
                return;
            }
        }
    }
}
