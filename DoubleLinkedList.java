
public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    DoubleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        head = head.n;
        head.p = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    //Soal No 1 Kode Ganjil
    void addLast(int data){
        
    }
    //Soal No 1 Kode Genap
    void deleteLast(){
        if (isEmpty()) {
            System.out.println("Isi list kosong");
            return;
        } else if (head.n == null) {
            head = null;
            size--;
            return;
        } 
        Node tmp = head;
        while (tmp.n.n != null) {
            tmp = tmp.n;
        }
        tmp.n = null;
        size--;
       
    }
    //Soal No 2 Kode Ganjil dan Genap
    void printFromTail(){
        Node tmp = tail;
        while(tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.p;
        }
    }
    
}
