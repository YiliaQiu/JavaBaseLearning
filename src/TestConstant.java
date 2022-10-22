public class TestConstant {
    public static void main(String[] args){
        final double pi = 3.14;
//        pi = 3.1415; //无法为常量再次分配值
        int r=4;
        double area = pi*r*r;
        double circle=2*pi*r;
        System.out.println(area);
        System.out.println(circle);
    }
}
