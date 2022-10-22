/*
测试多分支结构
 */

public class TestIf03 {
    public static void main(String[] args){
//        1掷骰子
        int i = (int)(Math.random()*6+1);
        int j = (int)(Math.random()*6+1);
        int k = (int)(Math.random()*6+1);

        int count = i+j+k;
        System.out.println("第1次掷骰子:"+i);
        System.out.println("第2次掷骰子:"+j);
        System.out.println("第3次掷骰子:"+k);
        if(count>=15){
            System.out.println("手气不错");
        } else if (count>=10) {
            System.out.println("手气一般");
        }
        else{
            System.out.println("手气不怎么样");
        }

        System.out.println("今天得分："+count);
//        买票
        int age = (int)(120*Math.random());
        System.out.println("年龄是："+age);
        if(age<15){
            System.out.println("儿童，好好玩！");
        } else if (age<25) {
            System.out.println("青年，好好学，还来得及！不要被社会毒害");
        } else if (age<45) {
            System.out.println("中年，好好工作，被社会毒害了吗？");
        } else if (age<65) {
            System.out.println("中老年");
        } else if (age<85) {
            System.out.println("老年");
        } else if (age<100) {
            System.out.println("长寿");
        } else if (age<110) {
            System.out.println("颐养天年");
        }
    }
}
