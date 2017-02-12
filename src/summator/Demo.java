package summator;

/**
 * Created by clouway on 12.02.17.
 */
public class Demo {

    public static void main(String[] args) {

        Summator summing = new Summator();
        System.out.println(summing.sum(5,10));
        System.out.println(summing.sum(50,100));
        System.out.println(summing.sum(500,1000));
        System.out.println(summing.sum(5000,10000));
        System.out.println(summing.sum(50000,100000));

    }

}
