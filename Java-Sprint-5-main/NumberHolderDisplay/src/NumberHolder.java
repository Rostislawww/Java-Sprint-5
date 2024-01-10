public class NumberHolder{
    private int anInt;
    private float aFloat;
    public static void main(String[] args) {
        NumberHolder holder = new NumberHolder();
        holder.anInt = 10;
        holder.aFloat = 10.01f;
        System.out.println("Integer number = " + holder.anInt);
        System.out.println("Float number = " + holder.aFloat);
    }
}