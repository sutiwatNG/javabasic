public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ห้ามหารด้วย 0 ");
        }finally{
            System.out.println("ทำงานอย่างอื่น");
        }

    }
}
