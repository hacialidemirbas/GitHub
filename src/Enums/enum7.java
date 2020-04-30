package Enums;

public class enum7 {
    enum WeekDays{
        SUNDAY("Sunday Funday", true),
        MONDAY("Marketing Monday"),
        THUESDAY("Trendy Tuesday"),
        WEDNESDAY("Wellnes Wednesday"),
        THURSDAY("Thankfull Thursday"),
        FRIDAY("Foodie"),
        SATURDAY("Social Saturday",true);

        WeekDays(String daysGreeting) {

        }
        WeekDays(String daysGreeting, final boolean isWeekend) {

        }

    }
}
