import java.lang.CharSequence;
public class CharSequences implements CharSequence {
    String line;
    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }
    public CharSequences() {}
    public CharSequences(String line) {
        this.line = line;
    }
    @Override
    public int length() {
        int value = 0;
        for (int i = 0; i < line.length(); i++){
            value++;
        }
            return value;
    }
    private int searchIndex(int index) {
        return line.length() - line.length() + index;
    }
    @Override
    public char charAt(int index) {
        if (index < 0 && index > line.length() - 1) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return line.charAt(index);
    }
    @Override
    public String toString() {
        return line;

    }
    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > line.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder sub =
                new StringBuilder(line.subSequence((start), searchIndex(end)));
        return sub.reverse();
    }
}
