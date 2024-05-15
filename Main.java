
public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();
        dll.deleteLast();
        
        split(dll);
        
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        //lanjutkan dengan memanggil method merge, split
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        //complete this method
    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        if (dll.isEmpty() || dll.head == dll.tail) {
        } else {
            DoubleLinkedList dll2 = new DoubleLinkedList();
            Node half = dll.head;
            Node full = dll.head;

            while (full.n != null && full.n.n != null) {
                half = half.n;
                full = full.n.n;
            }

            dll2.head = half.n;
            dll2.head.p = null;
            half.n = null;
            dll2.tail = dll.tail;
            dll2.size = dll.size - (dll.size / 2);
            dll.size = dll.size / 2;

            System.out.println("List 1:");
            dll.print();
            System.out.println("List 2:");
            dll2.print();
        }
    }

        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4

        

         
}

