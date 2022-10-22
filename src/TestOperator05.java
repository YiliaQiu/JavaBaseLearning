public class TestOperator05 {
    public static void main(String[] args){
        int a = 7;
        int b = 8;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~b);

        //移位
        int c = 5 <<1; //5*2
        System.out.println(c);
        int d = 5 <<2; //5*2*2
        System.out.println(d);

        //字符串连接符
        String e  = "3";
        int f = 4;
        System.out.println(e+f);

        //条件是String，不是char。若是char，则仍然是假发
        char c1 = 'h';
        char c2 = 'i';
        System.out.println(c1+c2);
        System.out.println(""+c1+c2);//通过加空连接符，让整个+变成连接符

        //测试条件（三元）连接符的用法
        int score = 90;
        String res = score<60?"不及格":"及格";
        System.out.println(res);

        if (score<60){
            res = "不及格";
        }else{
            res = "及格";
        }

        int x = -100;
        int flag = x>0?1:(x==0?0:-1);
        System.out.println(flag);
        ;
    }
}
