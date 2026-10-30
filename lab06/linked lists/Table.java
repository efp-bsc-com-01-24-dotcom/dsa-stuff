
public class Table {

    public ArrayList<LinkedList<Integer>> table;

    public Table() {
        table = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            table.append(new LinkedList<Integer>());
        }
    }

    public void insert(int k) {
        int pos = (k * 13) % 10;

        table.setPos(pos);

        LinkedList<Integer> val = table.currValue();

        val.append(k);
    }

    //add print out of own accord
    public void print(){
        for (int i=0; i<10;i++){
            table.setPos(i);

            System.out.println(" "+i);

            table.currValue().print();
        }
    }
    public boolean remove(int k) {
        int pos = (k * 13) % 10;

        table.setPos(pos);

        LinkedList<Integer> val = table.currValue();

        val.set_pos(0);
        while (val.isInList()) { 
            if(val.curr_value()==k){
                val.remove();
                return true;
            }
            val.next();
        }
        return false;
    }

    public static void main(String[] args){
        Table obj = new Table();

        for(int i=0;i<30;i++){
            int rand = (int) (Math.random()*100);
            obj.insert(rand);
        }
        System.out.println(obj.remove(25));
        System.out.println(obj.remove(3));
        obj.print();

    }
}
