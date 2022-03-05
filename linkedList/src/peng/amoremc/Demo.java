package peng.amoremc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//linkList 就是一个指向下一个，用内存地址做指针，而不是index做指针

public class Demo {

    //"psvm" + TAB -> 快速创建public static void main函数
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne ");
        addInOrder(placesToVisit, "Brisbane ");
        addInOrder(placesToVisit, "Perth ");
        addInOrder(placesToVisit, "Canberra ");
        addInOrder(placesToVisit, "adelaide ");
        addInOrder(placesToVisit, "Darwin ");

        printList(placesToVisit);

        placesToVisit.add(1, "beautifulPlace");//add a new entry and a new record
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("adelaide");
//        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "hhhhh");//add a new entry and a new record
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        //iterator = for loop; but ListIterator has more function than normal iterator;
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){//hasNext: is there another entry?
            System.out.println("Now has " + i.next());//.next(): move to the next entry, but before moving to the next entry, return the current value
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newItem){
        //create a new ListIterator, but now we do not point to the first record;
        //only after the first .next(), we point to the first record;
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparision = stringListIterator.next().compareTo(newItem);//return 0 is the current value is equal to the newItem;
            //.compareTo(target): compare in lexicographical order;递归，按字典顺序一个字符一个字符的对比
            if(comparision == 0){
                //equal, do not add
                System.out.println(newItem +  " is already included.");
                return false;
            }else if (comparision > 0){
                //new item should be appear
                //the entry has been moved to next with .next(), so we need to come back to previous entry;
                stringListIterator.previous();
                stringListIterator.add(newItem);
                return true;
            }else if (comparision < 0){
                //move on next item;
                //the .next() has already move to the next entry, so do not need to do anything here;
            }
        }

        return true;

    }
}
