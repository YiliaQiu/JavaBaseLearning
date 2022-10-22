/*
测试while语句
 */
public class TestWhile {
    public static void main(String[] args){
        /*
        int a = 0;
        while (a<3){
            System.out.println("I love U!---"+a);
            a++;

        }
         */
//        累加1+2+3+4+...+100
        int i = 0;
        int sum = 0;
        while (i<=100){
            sum+=i;
            i++;
        }
        System.out.println("1累加到100的和： "+sum);
    }
}
