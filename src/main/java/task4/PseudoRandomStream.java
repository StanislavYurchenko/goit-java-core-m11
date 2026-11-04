package task4;

import java.util.stream.Stream;

public class PseudoRandomStream {
    private final long seed;

    public PseudoRandomStream(long seed) {
        this.seed = seed;
    }

    public PseudoRandomStream() {
        this.seed = 0;
    }

    public Stream<Long> generate(long a, long c, long m) {
       return Stream.iterate(seed, x -> calculateNext(x, a, c, m));
    }

    private long calculateNext(long current, long a, long c, long m) {
        return Math.floorMod(a * current + c, m);
    }
}
