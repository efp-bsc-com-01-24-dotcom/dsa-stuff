public class ArrayList<E> implements List<E> {
    private int arrSize;
    private E[] listArray; // array declaration
    private int listSize;
    private int curr;

    private static int defaultSize = 20;

    public ArrayList() {
        listArray = (E[]) new Object[defaultSize];
        arrSize = defaultSize;
        listSize = 0;
        curr = 0;
    }

    public ArrayList(int maxListSize) {
        listArray = (E[]) new Object[maxListSize];
        arrSize = defaultSize;
        listSize = 0;
        curr = 0;
    }

    //implement append
    @Override
    public void append(E item) {

    }

    @Override
    public void clear() {
        listSize = 0;
        curr = 0;
    }

    @Override
    public void insert(E item) {
        assert listSize < arrSize : "list is full";
        assert curr >= 0 && curr < listSize : "invalid position i guess";
        for (int i = listSize - 1; i > curr; i--) {
            listArray[i] = listArray[i - 1];
        }
        listArray[curr] = item;
        listSize++;
    }

    @Override
    public E remove() {
        assert listSize > 0 : "list is empy";
        assert curr >= 0 && curr < listSize : "invalid";

        E removedItem = listArray[curr];

        for (int i = curr; i < listSize; i++) {
            listArray[i] = listArray[i - 1];
        }
        listSize--;

        return removedItem;
    }

    @Override
    public void setFirst() {
        curr = 0; //ste posion to index 0
    }

    @Override
    public void next() {
        curr += 1;
    }

    @Override
    public void prev() {
        curr -= 1;
    }

     
    @Override
    public int length() {
        return listSize;
    }

    public void setPos(int pos) {
        assert curr >= 0 && curr < listSize : "empty";
        curr = pos;
    }

    @Override
    public void setValue(E val) {
        assert curr >= 0 && curr < listSize : "empty";
        listArray[curr] = val;
    }
    @Override
    public E currValue(){
         
    }

}   

