
// my project :)
public class testList{

    public static void main(String[] args){
        ArrayList<Integer> obj = new ArrayList<>(20); // an object
        for(int i = 0; i <=22; i++){
            int  random = (int) (Math.random()*100);

            obj.append(random);
        }
        obj.print();

        System.out.println();

        obj.setPos(12);
        obj.insert(57);

        System.out.println("\n\t\t====================new section======================\n");
        obj.print();

        System.out.println();

        obj.setPos(24); // will bring an error saying "index 24 out of bounce" since the maxLength of the list is 20
        obj.insert(114);

        System.out.println("\n\t\t====================new section======================\n");
        obj.print();


    }
}   