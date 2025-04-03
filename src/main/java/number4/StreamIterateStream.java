package number4;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterateStream {
    private long x;
    private  long a;
    private long c;
    private  long m;

    public static void main(String[] args) {

        StreamIterateStream r = new StreamIterateStream  (25214903917L, 281474976710656L, 11, 0);

       r.iterate().limit(10).peek(System.out::println).collect(Collectors.toList());
    }
    public StreamIterateStream(long a, long m,long c, long seed){
        this.a = a;
        this.m = m;
        this.x = seed;
        this.c = c;
    }
    public Stream<Long> iterate(){
        return Stream.iterate(x, x -> (a * x + c) % m);
    }
}
