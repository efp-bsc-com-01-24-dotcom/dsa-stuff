
interface List<E> {

    public void clear();

    public void setFirst();

    public void setValue(E val);

    public E currValue();

    public boolean isEmpty();

    public boolean isInList();

    public void prev();

    public void insert(E item);

    public E remove();

    public void append(E item);

    public void print();

    public void set_pos(int pos);

    public E curr_value();

    public void next();
}
