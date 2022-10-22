/*
测试嵌套循环
 */
public class TestLoop {
    public static void main(String[] args){

/*        for (int m=1;m<=5;m++){
            for (int i=0;i<=5;i++){
                System.out.print(1+"\t");
            }
            System.out.println();
        }
*/
        for (int i =1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
