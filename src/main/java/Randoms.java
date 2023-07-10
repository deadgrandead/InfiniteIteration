import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                // бесконечная последовательность
                return true;
            }

            @Override
            public Integer next() {
                // генерируем случайное число в заданном диапазоне
                return random.nextInt(max - min + 1) + min;
            }
        };
    }
}
