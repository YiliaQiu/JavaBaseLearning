public class Print0_130By5 {
    public static void main(String[] args){
        int i = 1;
        while(i<=300){
            System.out.print(i+"\t");
            if (i%5==0){
                System.out.println();
            }
            i++;
        }
    }
}
