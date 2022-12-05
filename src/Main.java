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


//        int []numbers=new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//
//            linkedList.add(0,1);
//            arrayList.add(0,2);
//            numbers[i]= random.nextInt(0,2);
//
////            Collections.sort(linkedList);
////            System.out.println(linkedList);
//
//            sort(arrayList);
//            sort(linkedList);
//        }
//    }public static void sort(ArrayList<Integer>arrayList){
//        Collections.sort(arrayList);
//        for (Integer a:arrayList) {
//            System.out.println(a);
//        }
//    }public static void sort(LinkedList<Integer>linkedList){
//        Collections.sort(linkedList);
//        for (Integer b:linkedList) {
//            System.out.println(b);
//        }

    }
}