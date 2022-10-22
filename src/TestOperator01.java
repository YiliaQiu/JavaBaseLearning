public class TestOperator01 {
    public static void main(String[] args){
        int a = 4;
        long b = 4;
        long c = a + b;

        double d  = 3 + 3.14;
        double d2 = 31/3;
        double d3 = 31.0/3;
        System.out.println(d2);
        System.out.println(d3);

//        +,-,*
// 取余数
        int e = 10%3; //取余操作。结果符合和左边数相同
        System.out.println(e);
        int g = 30;
        g++; //相当于g=g+1
        g--; //相当于g=g-1

        g=10;
        int h = g++; //g++先赋值，后自增
        g=10;
        int i = ++g; //++g先自增，后赋值
        System.out.println(h);
        System.out.println(i);
    }
}
