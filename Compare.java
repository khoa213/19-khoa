public class Compare {
    public static void main(String[] args) {
        System.out.println(compare(4,2));
    }
    public static int compare (int a,int b) {
        int result = 5;
        if (a<b) {
            result = -1;
        } else if (a==b) {
            result = 0;
        } else {
            result = 1;
        }

        return result;
    }
}
