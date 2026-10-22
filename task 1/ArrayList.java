public class ArrayList<E> implements List<E> {
    private int arrSize;
    // array declaration
    private int listSize;
    private int curr;

    private static int maxLen = 20;
    private E[] listArray;

    public ArrayList() {
        listArray = (E[]) new Object[maxLen];
        arrSize = maxLen;
        listSize = 0;
        curr = 0;
    }

    public ArrayList(int maxListSize) {
        listArray = (E[]) new Object[maxLen];
        arrSize = maxLen;
        listSize = 0;
        curr = 0;
    }

    //implement append
    @Override
    public void append(E item) {
        assert curr >= 0 && curr < listSize : "invalid position i guess";
        listArray[listSize] = item;
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
        assert curr >= 0 && curr < listSize : "wrong index";
        return listArray[curr];
    }
    @Override // check if empty
    public boolean isEmpty(){
        if(listSize != 0){
            return false;
        }else{
            return true;
        }
    }

    @Override //chec if the an item is int the curent position
    public boolean isInList(){
          if(curr >= 0 && curr < listSize){
            return true ;
          }else{return  false;}
    }

    @Override //print all elements
    public void print(){
        if(isEmpty()){ //check if empty
            System.out.println("()");
        }else{
            System.out.print("(");
            for(int i = 0 ;i< listSize-1;i++){
                System.out.print(listArray[i]+" , ");
            }
            System.out.print(listArray[listSize-1]+")");
        }
    }

}   

