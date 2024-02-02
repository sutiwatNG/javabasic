import java.util.Scanner;
class Variable {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.print("money : ");
        int money=kb.nextInt();
        System.out.println("count of money ="+money);
        
        if (money>=1000) {
            System.out.println("1000 = "+(money/1000)+" Bai");
            money%=1000;
        }
        if (money>=500) {
            System.out.println("500 = "+(money/500)+" Bai");
            money%=500;
        }
    }
}
