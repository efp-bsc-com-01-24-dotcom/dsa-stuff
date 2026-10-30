public class TestLinkList{
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();

        for(int i = 0;i<18;i++){
            int random = (int) (Math.random()*100);
            obj.append(random);
        }
        obj.set_pos(12);
        obj.insert(57);

        obj.set_pos(24);
        obj.insert(114);

        
        obj.print();
    }
}