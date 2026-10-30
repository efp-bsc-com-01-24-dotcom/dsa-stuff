
public class LinkedList<E> implements List<E> {

    public LinkNode<E> head;
    public LinkNode<E> tail;
    public LinkNode<E> curr;

    private int count;

    public LinkedList() {
        count = 0;
        head = new LinkNode<E>(null);
        curr = head;
        tail = curr;
    }

    @Override
    public void clear() {
        count = 0;
        head = tail = curr;
        head.setNext(null);
    }

    @Override
    public void setFirst() {
        curr = head;
    }

    @Override
    public void setValue(E val) {
        assert curr != null : "invalid postion";
        assert curr.next() != null : "invalid postion";
        curr.next().set_Element(val);
    }

    @Override
    public E currValue() {
        assert curr != null : "invalid postion";
        assert curr.next() != null : "invalid postion";
        return curr.next().element();
    }

    @Override
    public boolean isEmpty() {
        return head.next() == null;
    }

    @Override
    public boolean isInList() {
        return curr != null && curr.next() !=null;
    }

    @Override
    public void prev() {
        if (curr == null || curr == head) {
            curr = null;
            return;
        }
        LinkNode<E> temp = head;

        while (temp != null && temp.next() != null) {
            temp = temp.next();
        }
        curr = temp;
    }

    @Override
    public void insert(E item) {
        assert curr != null : "invalid postion";
        count++;
        LinkNode<E> newNode = new LinkNode<>(item, curr.next());
        curr.setNext(newNode);

        if (curr == tail) {
            tail.setNext(tail.next());
        }
    }

    @Override
    public E remove() {
        if (curr == null || isEmpty()) {
            return null;
        }
        LinkNode<E> temp = curr.next();
        curr.setNext(temp.next());

        temp.setNext(null);
        count--;
        if (temp == tail) {
            tail = curr;
        }
        return temp.element();
    }

    @Override
    public void append(E item) {
        tail.setNext(new LinkNode<E>(item, null));

        tail = tail.next();
        count++;

    }

    @Override
    public void print() {
        LinkNode<E> temp = head.next();
        System.out.print("( ");
        while (temp != null) {
            
                System.out.print(temp.element() + " ");
            
            temp = temp.next();
        }

        System.out.println(")");
    }
    @Override
    public void next() {
        if (curr.next() != null) {
            curr = curr.next();
        }
    }

    @Override
    public void set_pos(int pos){
        assert pos<0 || pos > count : "invalid postion";
        curr = head;

        for (int i =0;i<pos;i++){
            curr = curr.next();
        }
    }
    @Override
    public E curr_value(){
        assert isInList() : "invalid postion";
        return curr.next().element();
    }
}
