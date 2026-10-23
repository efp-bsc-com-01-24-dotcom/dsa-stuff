//the question asweres are int the readme.md file

public class ArrayListMemTest2 {

     static class Point_3D{ //static class
        double x;
        double y;
        double z;

        Point_3D() { // default constructor
            x = (Math.random()*200 - 100);
            y = (Math.random()*200 - 100);
            z = (Math.random()*200 - 100);
        }
        Point_3D(double x, double y, double z) { // parameterized constructor
            this.x = x;
            this.y = y;
            this.z = z;
        }


    }

        public static void main(String[] args){
            Runtime  runtime = Runtime.getRuntime(); 
            runtime.gc();

            long totalMemory = runtime.totalMemory();
            long freeMemory = runtime.freeMemory();
            long maxMemory = runtime.maxMemory();

            long usedMemory = totalMemory - freeMemory;

            System.out.println("usedMemory: " + (usedMemory / (1024 * 1024)) + " MB");
            System.out.println("freeMemory: "+(freeMemory/(1024*1024))+"mb");
            System.out.println("totalMemory: "+ (totalMemory/(1024*1024))+"mb");
            System.out.println("maxMemory: "+ (maxMemory/(1024*1024))+"mb");

            ArrayList<Point_3D> obj = new ArrayList<>(20);

            runtime.gc();

            totalMemory = runtime.totalMemory();
            freeMemory = runtime.freeMemory();
            usedMemory = totalMemory - freeMemory;

            

            for(int i = 0 ; i<20; i++){ //to append 20 items int the array list
                obj.append(new Point_3D());
            }
            

            System.out.println("\t-------------after aarray list implementation-------------");
            System.out.println("usedMemory: "+(usedMemory/(1024*1024))+"mb");

            obj.print(); //  output is weird.

            
        }
}