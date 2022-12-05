import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        LinkedList<Integer>linkedList=new LinkedList<>();
        ArrayList<Integer>arrayList=new ArrayList<>();
        int []num = new int[10];
        for (int i = 0; i < num.length; i++) {
            linkedList.add(random.nextInt(0,2));
            arrayList.add(random.nextInt(0,2));
            num[i] = random.nextInt(0,2);

        }
        System.out.println("ArrayList: "+arrayList);
        System.out.println("LinketList: "+linkedList);
        System.out.println("Arrays: "+Arrays.toString(num));
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        Arrays.sort(num);
        System.out.println("ArrayList  Sort:"+arrayList);
        System.out.println("LinketList Sort: "+linkedList);
        System.out.println("Arrays  Sort : "+Arrays.toString(num));


    }
}