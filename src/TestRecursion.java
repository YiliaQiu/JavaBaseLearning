/*
测试递归
 */

public class TestRecursion {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); //当前时刻
        long result = factorial(5);
        long endTime = System.currentTimeMillis(); //当前时刻
        System.out.println(result);
        System.out.println("递归耗时"+(endTime-startTime));
    }
    public static long factorial(int n){
        if (n==1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
