package MyLinkedList;

class MyLinkedList extends MyIterator {
    class Node {
        int data;
        int pos;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() { return data; }
        public void setData(int data) { this.data = data; }
        public int getPos() { return pos; }
        public void setPos(int pos) { this.pos = pos; }
        public Node getPrevious() { return previous; }
        public Node getNext() { return next; }
    }

    public Node head, tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            head.previous = newNode;
        }
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        newNode.previous = tail;
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void insert(int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            if (head != null) {
                head.previous = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }
        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; ++i) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Error: Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        newNode.previous = current;
        if (current.next != null) {
            current.next.previous = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    public String display() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        if (head == null) {
            return "List is empty";
        }
        System.out.print("List elements: ");
        while (current != null) {
            result.append(current.data).append(", ");
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        return result.toString().trim();
    }

    public void reverse() {
        Node current = tail;
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Reversed: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        System.out.println("\nLenght: " + size);
        return size;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                head = head.next;
                head.previous = null;
            } else {
                head = tail = null;
            }
        }
    }

    public void deleteLast() {
        if (tail == null) {
            return;
        } else {
            if (head != tail) {
                tail = tail.previous;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }

    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                break;
            }
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        Node del = current.next;
        current.next = del.next;
        if (del.next != null) {
            del.next.previous = current;
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public int min() {
        if (head == null)
            System.out.println("List is empty");
        int min = head.data;
        Node current = head;
        while (current != null) {
            if (current.data < min)
                min = current.data;
            current = current.next;
        }
        System.out.println("Minim: " + min);
        return min;
    }

    public int max() {
        if (head == null)
            System.out.println("List is empty");
        int max = head.data;
        Node current = head;
        while (current != null) {
            if (current.data > max)
                max = current.data;
            current = current.next;
        }
        System.out.println("Maxim: " + max);
        return max;
    }

    public int sum() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        System.out.println("Sum: " + sum);
        return sum;
    }

    public MyLinkedList copy(){
        MyLinkedList newList = new MyLinkedList();
        Node current = head;
        while(current != null){
            newList.add(current.data);
            current = current.next;
        }
        return newList;
    }

    public int lenght() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public Node set(int pos, int newData) {
        if( pos <= 0 || pos > lenght() ){
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if( pos < lenght() /2 ){
            current = head;
            for(int i = 0; i < pos; i++){
                current = current.next;}
        } else {
            current = tail;
            for (int i = lenght() -1; i > pos; i--){
                current = current.previous;
            }
        }
        current.data = newData;
        return current;
    }

    public void sort(int order){
        Node current = null, pos = null;
        int temp;
        if(head == null){
            System.out.println("List is empty.");
        }
        if(order != 1 && order != -1){
            System.out.println("Incorrect order. Chose -1 for descending order or 1 for ascending order.");
        }
        if(order == 1){
            for(current = head; current != null; current = current.next){
                for(pos = current; pos != null; pos = pos.next){
                    if(current.data > pos.data){
                        temp = current.data;
                        current.data = pos.data;
                        pos.data = temp;
                    }
                }
            }
        }
        if (order == -1){
            for(current = head; current != null; current = current.next){
                for(pos = current; pos != null; pos = pos.next){
                    if(current.data < pos.data){
                        temp = current.data;
                        current.data = pos.data;
                        pos.data = temp;
                    }
                }
            }
        }
    }

    public int get(int pos){
        if(pos <= 0 || pos > lenght() ){
            throw new IndexOutOfBoundsException("Invalid index: " + pos);
        }
        Node current = head;
        int index = 0;
        while(current != null){
            if(pos == index){
                System.out.println("Index: " + pos + " , data: " + current.data);
                return current.data;
            }
            current = current.next;
            index++;
        }
        throw new IllegalStateException("Position not found.");
    }

    public MyLinkedList sublist(int start, int end){
        MyLinkedList sublist = new MyLinkedList();
        if(start < 0 || end > this.lenght() || start >= end){
            throw new IllegalArgumentException("Illegal start or end index.");
        }
        Node current = head;
        int currentIndex = 0;
        while(currentIndex < start && current != null){
            current = current.next;
            currentIndex++;
        }
        while (currentIndex <= end && current != null){
            sublist.add(current.data);
            current = current.next;
            currentIndex++;
        }
        return sublist;
    }
}
