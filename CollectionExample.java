import org.w3c.dom.Node;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Chon bai: ");
        int choice = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);

        switch (choice) {
            case 1:
                System.out.println("Bai 1");

                sum(numbers);
                break;
            case 2:
                System.out.println("Bai 2");
                convertArrayListToHashSet(numbers);
                break;
            case 3:
                System.out.println("Bai 3");
                LinkedList<String> str = new LinkedList<>();
                str.add("khoa");
                str.add("bao");
                str.add("nghi");
                str.add("thanh");
                reverseLinkedList(str);
                break;
            case 4:
                System.out.println("bai 4");
                findMax(numbers);
                break;
            case 5:
                System.out.println("bai 5");
                HashMap<String,Integer> point = new HashMap<>();

                point.put("bao",10);
                point.put("khoa",6);
                point.put("dat",7);

                printPoint(point);
                break;
            case 6:
                System.out.println("bai 6");
                contain(numbers,9);
                break;
            case 7:
                System.out.println("bai 7");
                ArrayList<String> strToSort = new ArrayList<>();
                strToSort.add("khoa");
                strToSort.add("bao");
                strToSort.add("dat");
                sortArr(strToSort);
                break;
            case 8:
                System.out.println("bai 8");
                sortedTreeSet(numbers);
                break;
            case 10:
                System.out.println("bai 10");
                removedDuplicate(numbers);
                break;
            case 13:
                System.out.println("bai 13");
                LinkedList<Integer> numberList = new LinkedList<>();
                numberList.add(1);
                numberList.add(1);
                numberList.add(2);
                numberList.add(3);
                occurence(numberList,2);
        }
    }
    public static void sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum = "+sum);
    }
    public static void convertArrayListToHashSet(ArrayList<Integer> numbers) {
        HashSet<Integer> hashSetNum = new HashSet<>();
        hashSetNum.addAll(numbers);
        System.out.println("element: "+ hashSetNum);
    }
    public static void reverseLinkedList(LinkedList<String> str) {
        LinkedList<String> newStr = new LinkedList<>();
        Iterator it = str.descendingIterator();
        while (it.hasNext()) {
            newStr.add((String) it.next());
        }
        System.out.println("after reversed: "+newStr);
    }
    public static void findMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i=1;i< numbers.size();i++) {
            if (numbers.get(i)>max) {
                max= numbers.get(i);
            }
        }
        System.out.println("max: "+max);
    }

    public static void printPoint(HashMap<String,Integer> point) {
        System.out.println("point: " +point);
    }
    public static void contain(ArrayList<Integer> numbers,int num) {
        System.out.println("is " +num+ " contain? "+ numbers.contains(num));
    }
    public static void sortArr(ArrayList<String> str) {
        Collections.sort(str);
        System.out.println("After sorted: "+str);
    }
    public static void sortedTreeSet(ArrayList<Integer> numbers) {
        TreeSet<Integer> treeSet = new TreeSet<>(numbers);
        Iterator i = treeSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    public static void removedDuplicate(ArrayList<Integer> numbers) {
        ArrayList<Integer> afterRemoved = new ArrayList<>();
        for (int number:numbers) {
            if (!afterRemoved.contains(number)) {
                afterRemoved.add(number);
            }
        }
        System.out.println("after removed: "+afterRemoved);
    }
//    public static void countAppearance(TreeMap<String,Integer> map,String str) {
//        String[] strArr= str.split(" ");
//        for (Map.Entry<String,Integer> entry: map.entrySet()) {
//            map.put(strArr)
//        }
//    }
    public static void occurence (LinkedList<Integer> numbers,int num) {
        int occurences = Collections.frequency(numbers,num);
        System.out.println("Occurence: "+occurences);
    }
}


