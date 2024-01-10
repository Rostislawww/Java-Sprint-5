public class Main  {
    public static void main(String[] args) {
        CharSequences Char = new CharSequences("Most of the time people are hurt by what is not happening – they are hurt by their own expectations.");
        System.out.println(Char.toString());
        System.out.println((Char.charAt(1)));
        System.out.println(Char.length());
        System.out.println(Char.subSequence(0,15));
        System.out.println(Char.isEmpty());

    }
}