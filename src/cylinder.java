public class cylinder {

    public static void main(String[] args) {
        //顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        final double PI = 3.1415926;

        float r=sc.nextFloat();
        float h=sc.nextFloat();

        System.out.println(Math.PI*Math.pow(r,2)*h);

    }
}
