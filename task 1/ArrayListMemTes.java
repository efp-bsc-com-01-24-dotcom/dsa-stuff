public class ArrayListMemTes {
    public static void main(String[] args) {

        // Get the Java runtime instance
        Runtime runtime = Runtime.getRuntime();

        // Run the garbage collector to get a more accurate reading (optional)
        runtime.gc();

        // Calculate used memory in bytes
        long totalMemory = runtime.totalMemory(); // Current heap allocated to JVM
        long freeMemory = runtime.freeMemory(); // Free memory within the allocated heap
        long maxMemory = runtime.maxMemory(); // Maximum heap the JVM will attempt to use

        long usedMemory = totalMemory - freeMemory;
        System.out.println("Used Memory: " + (usedMemory / (1024 * 1024)) + " MB");
        System.out.println("Free Memory: " + (freeMemory / (1024 * 1024)) + " MB");
        System.out.println("Total Allocated Memory: " + (totalMemory / (1024 * 1024)) + " MB");
        System.out.println("Max Usable Memory (-Xmx): " + (maxMemory / (1024 * 1024)) + " MB");
        System.out.println("\t!!!!!!!!!!memory info bfore the array of list!!!!!!!!!!!!!");

        ArrayList<Integer> obj = new ArrayList<>(20); // an object

        // we measure the run time agin for the array
        runtime.gc();
        usedMemory = totalMemory - freeMemory;
        System.out.println("used memory: "+usedMemory);
        System.out.println("\t!!!!!!!!!!memory info for the array of list!!!!!!!!!!!!!");

        for(int i = 0; i <=20; i++){ //append 20 random items
            int  random = (int) (Math.random()*100);

            obj.append(random);
        }
        // we measure the run time agin for the array
        runtime.gc();
        usedMemory= totalMemory - freeMemory;
        System.out.println("used memory: "+usedMemory);
        obj.print();




    }
}