import java.util.ArrayList;
import java.util.Scanner;

public class IArrayLIist {
    public static void main(String[] args) {
        ArrayList<Integer>obj=new ArrayList<>(20);
        Scanner sc =new Scanner(System.in);
        obj.add(sc.nextInt());//non-primitive because collection framework deals with object
        obj.add(20);
        obj.add(sc.nextInt());
        obj.add(40);
        obj.add(1,78);
        obj.remove(0);
        System.out.println(obj.size());
        //traversal operation performed here
        for(Integer res:obj) {

            System.out.println(res + " ");
        }


    }
}
