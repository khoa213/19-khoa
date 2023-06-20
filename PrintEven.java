public class PrintEven {
    public static void main(String[] args) {
        printEven(9);
    }
    public static void printEven (int n) {
        for (int i=0;i<=n;i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
}
