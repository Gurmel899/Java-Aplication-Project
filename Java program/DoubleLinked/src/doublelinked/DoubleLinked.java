package doublelinked;

public class DoubleLinked {

    Node head;

    class Node {
        String data;
        Node prev;
        Node next;
        Node(String d) {
            data = d;
        }
    }

    public void push(String new_data) {

        Node new_Node = new Node(new_data);

        new_Node.next = head;
        new_Node.prev = null;

        if (head != null) {
            head.prev = new_Node;
        }

        head = new_Node;
    }
    
    public void sisip_depan(String data) {
        Node new_node = new Node(data);
        Node last = head;
        new_node.prev = null;
        if (head == null) {
            new_node.next = null;
            head = new_node;
            return;
        }
        while (last.prev != null) {
            last = last.prev;
        }

        last.prev = new_node;

        new_node.next = last;
    }

    public void sisip_setelah(Node prev_Node, String new_data) {

        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }
    
    public void hapus(Node del){
        if (del.next != null)
            del.next.prev = del.prev;
 
        if (del.prev != null)
            del.prev.next = del.next;
 
        del = null;
    }
    
    public void hapus_depan() {
        if (head == null) {
            return;
        }
        while (head.next != null) {
            head = head.next;
        }
        
        head.next = null;
    }
    
    public void hapus_setelah(int n){
        if (head == null || n <= 0)
            return;
        Node current= head;
        int i;
        for (i = 1; current != null && i < n; i++)
        {
            current = current.next;
        }
        if (current == null)
            return;
        hapus(current);
    }
    
    public void append(String new_data) {
        Node new_node = new Node(new_data);
        Node last = head;
        new_node.next = null;
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;

        new_node.prev = last;
    }

    public void cetak(Node node) {
        Node last = null;
        System.out.println("\n\nList Traversal dari depan : ");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("List Traversal dari belakang : ");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
        DoubleLinked data = new DoubleLinked();
       data.append("Naruto");
        data.append("Sasuke");
        data.append("Sakura");
        data.append("Itachi");
       data.append("Jiraya");
        
       data.cetak(data.head);
       data.sisip_setelah(data.head, "Shikamaru");
        data.cetak(data.head);
        
      data.hapus_setelah(3);
        data.cetak(data.head);
        
       data.sisip_depan("Kiba");
      data.cetak(data.head);
        
      data.hapus_depan();
       data.cetak(data.head);
        
       data.append("Choji");
      data.append("Kankuro");
       data.cetak(data.head);
        
        
    }

}
