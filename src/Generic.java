import java.util.Random;

public class Generic implements Genericable{
    @Override
    public <T> void genericMethod(T[] t) {
        int first = 0;
        int last = 0;
        for (int i = 0; i < t.length; i++) {
            first = (int) t[0];
            last = (int) t[t.length-1];
            System.out.print(" "+t[i]);
        }
        System.out.println();
        System.out.println("First element "+first);
        System.out.println("Last element "+last);
    }
}
