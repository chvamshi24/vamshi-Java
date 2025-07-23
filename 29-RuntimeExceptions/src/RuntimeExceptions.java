public class RuntimeExceptions {
    public static void main(String[] args) {

        /*String text = null;
        System.out.println(text.length());*/

        String[] texts = {"one", "two", "three"};
        try {
            System.out.println(texts[3]);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
