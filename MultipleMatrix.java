public class MultipleMatrix {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        sum(a,b);
        minus(a,b);
    }
    public static void sum(int a,int b) {
        System.out.println(a+b);
    }
    public static void minus(int a,int b) {
        System.out.println(a-b);
    }
}
