public class LinkedListMemTest2{
    static class Point_3d{
        double x,y,z;

        public Point_3d(){
            x = Math.random()*200-100;
            y = Math.random()*200-100;
            z = Math.random()*200-100;
        }
    }
    public static void main(String[] args){
        System.out.println("\t--------------for Liekd mem test 2-------------");
         Runtime runtime = Runtime.getRuntime();

        runtime.gc();

        long totalmemory = runtime.totalMemory();
        long freememory = runtime.freeMemory();
        long maxmemory = runtime.maxMemory();

        long usedmemory = totalmemory - freememory;
        System.out.println("used memory: " + (usedmemory / (1024 * 1024)));
        System.out.println("freememory: " + (freememory / (1024 * 1024)));
        System.out.println("totalmemory: " + (totalmemory / (1024 * 1024)));
        System.out.println("maxmemory: " + (maxmemory / (1024 * 1024)));

        LinkedList<Integer> obj = new LinkedList<>();

        runtime.gc();

        totalmemory = runtime.totalMemory();
        freememory = runtime.freeMemory();
        maxmemory = runtime.maxMemory();

        usedmemory = totalmemory-freememory;
        System.out.println("mmeory used: "+(usedmemory/(1024.0*1024.0))+" mb");

        for(int i = 0;i<20;i++){
            int random = (int)(Math.random()*100);
            obj.append(random);
        }

        runtime.gc();

        totalmemory = runtime.totalMemory();
        freememory = runtime.freeMemory();
        maxmemory = runtime.maxMemory();

        usedmemory = totalmemory - freememory;

        System.out.println("mmeory used: "+(usedmemory/(1024.0*1024.0)+" mb"));



    }
}