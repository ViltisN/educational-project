// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                int eaters = 5; // сколько людей будут есть

                int water = 3000; // миллилитров воды
                int potatoes = 5; // картофелин
                int chicken = 6; // куриных бёдер
                int spices = 10; // ложек специй

                System.out.println("Сварили суп. На одного человека вышло:");
                System.out.println((water / eaters) + " миллилитров(а) воды");
                System.out.println((potatoes / eaters) + " картофелин(а/ы)");
                System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
                System.out.println((spices / eaters) + " ложек(ки/ка) специй");

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}