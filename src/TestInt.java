public class TestInt {
    public static void main(String[] args){

        int a = 100;  //十进制
        int b = 015;  //八进制
        int c = 0xff; //十六进制
        int d = 0b1001010101; //二进制

        byte e = 50;
        short f = 300;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int salary = 30000;  //默认类型是int
        long yearSalary = 3000000000L; //把整型变量定义为long类型
        System.out.println("你的年薪："+yearSalary);

    }
}
