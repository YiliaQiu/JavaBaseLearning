/*
* 测试if单分支结构
* 写个掷骰子游戏：
*   1.如果3次的和加起来大雨15，则手气不错
*   2.如果3次的和值在10-15之间，一般
*   3.如果3次的和在：10以下，不怎么样

 */

public class TestIf01 {
    public static void main(String[] args){
        int i = (int)(Math.random()*6+1);
        int j = (int)(Math.random()*6+1);
        int k = (int)(Math.random()*6+1);

        int count = i+j+k;
        System.out.println("第1次掷骰子:"+i);
        System.out.println("第2次掷骰子:"+j);
        System.out.println("第3次掷骰子:"+k);
        if(count>=15){
            System.out.println("手气不错");
        }
        if (count>=10&&count<15) {
            System.out.println("手气一般");
        }
        if(count<10){
            System.out.println("手气不怎么样");
        }

        System.out.println("今天得分："+count);
    }
}
