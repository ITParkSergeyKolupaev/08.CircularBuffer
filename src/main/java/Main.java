import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Object> cBuffer = new ArrayDeque<>(10) ;
        for (int i = 1; i < 15; i++) {
            cBuffer.add(i);
            if (cBuffer.size() > 10) cBuffer.remove();
        }
        System.out.println(new ArrayList(cBuffer));
    }
}
