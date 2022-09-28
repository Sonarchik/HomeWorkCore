package Fourth;

public class Fourth {

    public static void main(String[] args) {
        long a = 25214903917L;
        int c = 11;
        int m = (int) Math.pow(2, 48);
        long seed = 20L;
        int maxSizeGen = 50;
        Generate.gen(a, c, m, maxSizeGen, seed).forEach(x -> System.out.print(x + " "));
    }
}
