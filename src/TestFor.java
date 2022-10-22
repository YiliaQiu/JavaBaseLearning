/*
测试for循环
 */

public class TestFor {
    public static void main(String[] args){
/*
        int a = 0; //初始化部分
        while (a<3){
            System.out.println("I love U!---"+a);
            a++;

        }

 */
        for(int a=0;a<3;a++){
            System.out.println("I love U!---"+a);
        }

        int sum = 0;
        for (int i = 0;i<=100;i++){
            sum=sum+i;
        }
        System.out.println("1累积到100的和："+sum);

        //输出9-1之间的数
        for(int i=9;i>0;i--){
            System.out.println(i+"\t");
        }
        System.out.println();

        //输出90-1之间能被3整除的数
        for(int i=90;i>0;i--){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
