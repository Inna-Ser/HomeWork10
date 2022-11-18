public class Main {
    public static void main(String[] args) {
    // Task 1 Данные сотрудников
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    // Task 2 Ф.И.О. заглавными буквами
        String capitalLetterName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + capitalLetterName);
    }
}