package MyLinkedList;

import MyLinkedList.MyLinkedList;

class Main{
    public static void main(String[] args) {

        /*MyLinkedList myList = new MyLinkedList();

        myList.display();
        //myList.size();
        myList.addFirst(1);
        myList.display();*/
        /*myList.size();

        myList.add(2);
        myList.display();
        myList.size();

        myList.insert(1,4);
        myList.display();
        myList.size();

        MyLinkedList myList1 = myList.copy();
        myList1.display();

        myList.set(2, 19);
        myList.display();

        myList.sort(-1);
        myList.display();*/

        /*myList.add(5);
        myList.add(7);
        myList.add(26);
        myList.add(12);
        myList.add(9);
        myList.add(18);*/

        /*myList.sublist(2,6).display();
        myList.get(5);*/

        /*MyLinkedList myList1 = new MyLinkedList();
        myList1.add(100);
        myList1.add(99);
        myList1.add(98);
        myList1.add(96);
        myList1.add(65);

        myList.display();
        myList1.display();*/

        /*MyLinkedList[] lists = new MyLinkedList[2];
        lists[0] = myList;
        lists[1] = myList1;
        MyListGeneric.printAll(lists);*/

        MyLinkedList list1 = new MyLinkedList();
        list1.add(999);
        list1.size();
        list1.add(789);
        list1.add(567);
        list1.display();
        list1.insert(1, 344);
        list1.display();
        list1.set(2,555);
        list1.display();
        list1.delete(999);
        list1.display();
        list1.reverse();
        list1.display();

        list1.addFirst(666);
        list1.addLast(777);
        list1.display();
    }
}
