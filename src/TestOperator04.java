public class TestOperator04 {
    public static void main(String[] args){
        //    测试逻辑运算符
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2);
        System.out.println(b1|b2);
        System.out.println(!b2);
        System.out.println(b1^b2);
//        短路与、短路或

//        int b3 = 3/0;//会报不能除以0的异常
        boolean b3 = 1>2 & (4<3/0);
        System.out.println(b3);
    }
}

