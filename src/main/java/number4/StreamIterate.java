package number4;

public class StreamIterate {
    private long x;
    private  long a;
    private long c;
    private  long m;

    public StreamIterate(long a, long m,long c, long seed){
        this.a = a;
        this.m = m;
        this.x = seed;
        this.c = c;
    }

 public long next(){
     x = (a * x + c) % m;
     return x;
 }
}
