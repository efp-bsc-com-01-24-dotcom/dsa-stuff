
// my project :)
public class testList{

    public static void main(String[] args){
        ArrayList<Integer> obj = new ArrayList<>(20); // an object
        for(int i = 0; i <20; i++){
            int  random = (int) (Math.random()*100);

            obj.append(random);
        }
        
    
    }
}   