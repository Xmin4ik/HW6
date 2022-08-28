import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача №1");
        System.out.print("random:"+"\n" );
       int [] dayMoney = new int [30];

       for (int i=0;i<dayMoney.length;i++){
           dayMoney[i]=(int)( Math.random () * ( 200_000 - 100_000+1)+100_000);
           System.out.println(i+1 +" = "+dayMoney[i]);}
       int sum = 0;
        for (int d=0 ; d<dayMoney.length;d++) {
            sum = sum+dayMoney[d];

        }

        System.out.println("Сумма трат за месяц составила - "+sum +" рублей.");


        System.out.println("Задача №2");
int minDayMoney=200000000;
int maxDayMoney=-10;
        for (int i = 0; i < dayMoney.length;i++) {
            if (dayMoney[i]>maxDayMoney) {
                maxDayMoney = dayMoney[i];
            ;}if(dayMoney[i]<minDayMoney)
            minDayMoney=dayMoney[i];
                    }
        System.out.println("Минимальная сумма трат за день составила - "+minDayMoney+
                " рублей. Максимальная сумма трат за день составила - "+maxDayMoney+" рублей");
        System.out.println("Задача №3");
       double average = sum / dayMoney.length;
        System.out.println("Средняя сумма трат за месяц составила - "+average+" рублей");

        System.out.println("Задача №4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int v = reverseFullName.length-1;v>=0 ; v--) {
            System.out.print(reverseFullName[v]);
        }

    }
}