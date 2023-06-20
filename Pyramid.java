public class Pyramid {
    public static void main(String[] args) {
        pyramid(9);
    }
    public static void pyramid(int n) {
        for (int i=1;i<=n;i++) {
//            System.out.print(i+" ");
            for (int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
