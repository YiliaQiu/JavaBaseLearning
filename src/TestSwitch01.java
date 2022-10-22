/*
测试switch语句的用法
 */
public class TestSwitch01 {
    public static void main(String[] args){
        int grade = (int)(Math.random()*4)+1; //大学的年级
        switch (grade){
            case 1:
                System.out.println("大一！不要迷茫，好好学，差距就是大一开始的");
                break;
            case 2:
                System.out.println("大二！");
                break;
            case 3:
                System.out.println("大三！");
                break;
//            case 4:
            default:
                System.out.println("大四！时间过得真的快，就要工作了");
                break;
        }
    }
}
