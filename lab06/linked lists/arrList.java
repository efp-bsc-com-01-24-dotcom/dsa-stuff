
interface arrList<E> {

    public void clear();

    public void append(E item);

    public void insert(E item);

    public E remove();

    public void setFirst();

    public void next();

    public void prev();

    public int length();

    public void setPos(int pos);

    public void setValue(E val);

    public E currValue();

    public boolean isEmpty();

    public boolean isInList();

    public void print();

}
