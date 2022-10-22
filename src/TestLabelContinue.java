/*
带标签的continue，帮助我们葱内部循环跳到外部循环！
 */

public class TestLabelContinue {
    public static void main(String[] args) {
        outer: for (int i=101;i<150;i++){
         for(int j=2;j<i/2;j++){
             if(i%j==0){
                 continue outer; //符合某条件，题哦啊到外部循环继续
             }
         }
         System.out.print(i+" ");
        }

    }
}