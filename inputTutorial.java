public class inputTutorial {
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50};
        System.out.println("ค่าที่มากที่สุดคือ "+findMaxInArray(numberA));
        System.out.println("ค่าที่น้อยที่สุดคือ "+findMinInArray(numberA));
        System.out.println("--------------");
        int [] numberB = {-10,-20,-30,-40,-50};
        System.out.println("ค่าที่มากที่สุดคือ "+findMaxInArray(numberB));
        System.out.println("ค่าที่น้อยที่สุดคือ "+findMinInArray(numberB));
        System.out.println("--------------");
        int [] numberC = {100,200,300,400,500};
        System.out.println("ค่าที่มากที่สุดคือ "+findMaxInArray(numberC));
        System.out.println("ค่าที่น้อยที่สุดคือ "+findMinInArray(numberC));
        System.out.println("--------------");
         
    }
    static void displayArray(int [] arr){
        System.out.println("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(",");    
            
        }
        System.out.println("}");
    }
    static int findMaxInArray(int[] arr){
        //ค้นหาค่าที่มากที่สุดใน Array
        //ได้ค่ามากที่สุด
        int maxValue = arr[0]; //เก็บค่าสูงสุงเอาไว้เป็นค่าเริ่มต้น
        for(int i =0; i<arr.length;i++){
            if (arr[i]>maxValue) {
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
    static int findMinInArray(int[] arr){
        //ค้นหาค่าที่มากที่สุดใน Array
        //ได้ค่าน้อยที่สุด
        int minValue = arr[0]; //เก็บค่าสูงสุงเอาไว้เป็นค่าเริ่มต้น
        for(int i =0; i<arr.length;i++){
            if (arr[i]<minValue) {
                minValue=arr[i];
            }
        }
        return minValue;
    }
}