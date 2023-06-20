public class Evaluate {
    public static void main(String[] args) {
        evaluate(82);
    }
    public static void evaluate (int score) {
        if (score>=0 && score<=19) {
            System.out.println("Grade E");
        } else if (score>=20 && score<=39) {
            System.out.println("Grade D");
        } else if (score>=40 && score<=59) {
            System.out.println("Grade C");
        } else if (score>=60 && score<=79) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade A");
        }
    }
}
