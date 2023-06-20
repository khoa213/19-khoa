public class ConvertStringToChar {
    public static void main(String[] args) {
        String str = "abc";
        char[] charArr = new char[str.length()];
        for (int i=0;i<str.length();i++) {
            charArr[i] = str.charAt(i);
            System.out.println(charArr[i]);
        }
        System.out.println(charArr);
        System.out.println(charArr.getClass());
    }
}
