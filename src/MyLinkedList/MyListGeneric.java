package MyLinkedList;

public class MyListGeneric extends MyLinkedList {
    public static <T extends MyLinkedList> void printAll(T[] lists){
        System.out.print("\n---------------------------------\n");

        for(T list : lists)
            System.out.println(list + ": " + list.display());
        System.out.println("---------------------------------");
    }
}
