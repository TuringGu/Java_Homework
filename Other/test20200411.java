import java.util.Scanner;

public class test20200411 {
    public static void main(String[] args) {
        int the19900101 = 0;
        //int today = 0;
        int flagYear = 1990;
        int flagMonth = 1;
        int passDay = 0;

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=sc.nextInt();
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        System.out.println("请输入日：");
        int day=sc.nextInt();

        // The day pass
        while(flagYear < year) {
            int yearDayNumber = 0;
            if(flagYear % 400 == 0 || (flagYear % 4 == 0 && flagYear % 100 != 0)) {
                // Leap year
                yearDayNumber = 366;
            } else {
                // Not leap year
                yearDayNumber = 365;
            }

            passDay = passDay + yearDayNumber;
            flagYear++;
        }

        while(flagMonth <= month) {
            switch(flagMonth) {
                case 12:
                    passDay=passDay+30;
                case 11:
                    passDay=passDay+31;
                case 10:
                    passDay=passDay+30;
                case 9:
                    passDay=passDay+31;
                case 8:
                    passDay=passDay+31;
                case 7:
                    passDay=passDay+30;
                case 6:
                    passDay=passDay+31;
                case 5:
                    passDay=passDay+30;
                case 4:	
                    passDay=passDay+31;
                case 3:
                    passDay=passDay+29;
                case 2:
                    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        passDay=passDay+29;
                    }else {
                        passDay=passDay+28;
                    }
                case 1:
                    passDay=passDay+day;
            }
            flagMonth++;
        }

        System.out.printf("今天星期%d\n",(the19900101+passDay)%7+1);
    }
}