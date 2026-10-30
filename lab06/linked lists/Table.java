public class Table{
    public ArrayList<LinkedList<Integer>> table;
    public Table(){
        table = new ArrayList<>();

        for(int i =0;i<20;i++){
            table.append(new LickedList<Integer>());
        }
    }

    public void inset(int k){
        table.set_pos((k*13)%10);

        ArrayList<LinkedList<Integer>> val = table.curr_value();
        list.append();
    }
}