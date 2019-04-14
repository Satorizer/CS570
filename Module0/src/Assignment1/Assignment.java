package Assignment1;

import java.util.Random;
import java.util.Vector;

public class Assignment {
    public static void main(String[] args) {
        try {
            new Assignment().run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /***
     * Step a:
     * Return a Vector of objects that are in either of the two argument Vectors.
     * @param a
     * @param b
     * @return
     */
    public static Vector union(Vector a, Vector b){
        Vector c = new Vector();
        //Todo: Return a Vector of objects that are in either of the two argument Vectors.
        if (a.size() < b.size()){
            c = a;
        }else {
            c = b;
        }
        return c;
    }

    /***
     * Step b:
     * Possible fault 0: It just says the method should return one of them, but tt does not specify which one to return based on certain requirements, or a random return.
     * Possible fault 1: The above method uses a method of comparing the sizes of a and b to determine which one to output. But it ignores the case where the sizes of a and b are the same.
     *
     */

    /***
     * Step c:
     *
     */
    public void test(){
        //For possible fault 0: Since there is no provision on how to choose which one between the two, I decided to choose a method of random selection.

        //For possible fault 1: Missing the same size of a and b
        Vector a = new Vector();
        Vector b = new Vector();

        a.addElement(new Integer(1));
        b.addElement(new Integer(1));
        a.addElement(new Integer(2));
        b.addElement(new Integer(2));
        a.addElement(new Integer(3));
        b.addElement(new Integer(3));

        Vector c = union(a,b);
        if (c.equals(a)){
            System.out.println("The return object is a");
        }else if(c.equals(b)){
            System.out.println("The return object is b");
        }else{
            System.out.println("Something going wrong");
        }
    }

    /***
     * Step d:
     * @param a
     * @param b
     * @return
     */
    public static Vector myUnion(Vector a, Vector b){
        Vector c = new Vector();
        Random random = new Random();
        int i = random.nextBoolean()?1:0;
        switch (i) {
            case 0:
                System.out.println("0");
//                c = a;
                break;
            case 1:
                System.out.println("1");
//                c = b;
                break;
        }

        return c;
    }

    public void run() throws Exception{

    }
}
