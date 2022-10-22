/*
计算100之内的累加和、所有奇数和、所有偶数和
 */
public class Sum100 {
    public static void main(String[] args){
        int sum=0;
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0;i<=100;i++){
            sum+=i;
            if(i%2==0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println(sum);
        System.out.println("100以内所有偶数和： "+evenSum);
        System.out.println("100以内所有奇数和： "+oddSum);
    }
}
