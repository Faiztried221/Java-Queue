public class Queue {

    private static class ListNode {
        Object data;
        ListNode next;

        ListNode(Object data) {
            this.data = data;
        }
    }

    private ListNode front;
    private ListNode end;
    private int size;

    public Queue() {
        front = null;
        end = null;
        size = 0;
    }

    public void add(Object obj) {
        ListNode node = new ListNode(obj);
        if (isEmpty()) {
            front = node;
        } else {
            end.next = node;
        }
        end = node;
        size++;
    }

    public Object remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue kosong");
        }
        Object data = front.data;
        front = front.next;
        if (front == null) {
            end = null;
        }
        size--;
        return data;
    }

    public Object getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue kosong");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add('a');
        q.add('b');
        q.add('c');
        q.add('d');

        System.out.println("front     : " + q.getFront());
        System.out.println("remove    : " + q.remove());

        q.add('e');
        q.add('f');

        System.out.println("remove    : " + q.remove());
        System.out.println("front now : " + q.getFront());
        System.out.println("size      : " + q.size());
        System.out.print("isi queue : ");
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
