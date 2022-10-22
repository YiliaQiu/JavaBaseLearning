/*
定义一个公司迟到问题的处理
 */

public class TestMethod2 {
    public static int handleLate(int lateMinute,int monthSalary) {
        int fakuan = 0;
        int daySalary = (int) (monthSalary / 22.5);
        System.out.println("迟到分钟数:" + lateMinute);
        System.out.println("月薪：" + monthSalary);

        if (lateMinute < 10) {
            System.out.println("警告！");
        } else if (lateMinute <= 20) {
            System.out.println("罚款100元");
            fakuan = 100;
        } else if (lateMinute <= 30) {
            System.out.println("罚款200元");
            fakuan = 200;
        } else if (lateMinute <= 60) {
            System.out.println("罚款半日工资");
            fakuan = daySalary/2 ;
        }else {
            System.out.println("扣除1日工资");
            fakuan = daySalary;
        }
        return fakuan;
    }
    public static void main(String[] args){
        int a = handleLate(25,8000);
        int b = handleLate(8,10000);
        int c = handleLate(45,20000);
        System.out.println("今日罚款："+(a+b+c));

    }
}
