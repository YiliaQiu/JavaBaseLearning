public class TestTypeCast {
    public static void main(String[] args){
        double a = 3.94152;
        int b  = (int) a;
        System.out.println(b);

        int c = 97;
        char d = (char)c;
        System.out.println(d);

//        强制转型，超过了表数范围，会转成一个完全不同的值
        byte e = (byte)300;
        System.out.println(e);

//        测试常见错误--溢出
        int money = 1000000000; //10亿
        int years = 20;
        int total = money * years;
        System.out.println("total="+total);
//        返回的total是负数，超过了int的范围
        long total1 = money*years;
        System.out.println("total1="+total1);
//        仍然是负数
        long total2 = money * ((long)years);
        System.out.println("total2="+total2);
    }
}
