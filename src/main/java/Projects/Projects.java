package Projects;

import java.util.Arrays;
import java.util.Random;

public class Projects {
    private static String projectName;           //nazwa
    private static int price;                   //koszt
    private static int[] amount;                 //ilość
    private static int deadline;                 //czas realizacji


    public Projects(String projectName, int price, int[] amount, int deadline) {
        this.projectName = projectName;
        this.price = price;
        this.amount = amount;
        this.deadline = deadline;

    }

    public static String getProjectName() {
        return projectName;
    }

    public static int getPrice() {
        return price;
    }

//    public static int getAmount() {
//        return amount;
//    }

    public static int getDeadline() {
        return deadline;
    }

    public static void setDeadline(int deadline) {
        Projects.deadline = deadline;
    }

    public void newBiggerPrice(int percent) {             // METODA DO PODWYŻSZANIA CENY PROJEKTU
        price = price + ((price * percent) / 100);
    }

    public void newLowerPrice(int percent) {              // METODA DO OBNIŻANIA CENY PROJEKTU
        price = price - ((price * percent) / 100);
    }

//    public int[] tab(int product) {                     //METODA DO PRZEWIDYWANIA USTERKI + ZWIĘKSZANIA TABLICY
//        Random random = new Random();
//        int number = random.nextInt();
//        if (product <= 100 && product > 0) {
//            int number = random.nextInt(5);
//            int[] amountOfProducts = Arrays.copyOf(amount, product + number);
//        } else if (product <= 250 && product > 0) {
//            int number = random.nextInt(12);
//            int[] amountOfProducts = Arrays.copyOf(amount, product + number);
//        } else if (product <= 500 && product > 0) {
//            int number = random.nextInt(25);
//            int[] amountOfProducts = Arrays.copyOf(amount, product + number);
//        } else {
//            int number = random.nextInt(50);
//            int[] amountOfProducts = Arrays.copyOf(amount, product + number);
//        }
//        amount = Arrays.copyOf(amount, product + number);
////        int[] amountOfProducts = Arrays.copyOf(amount, product + number);
//        return amountOfProducts;
//    }
}
/* PROJECTS
Dodawanie projektu do Klienta (LEGIA WARSZAWA(K) KOLEKCJA LATO(P))    MAPA
KOSZT PROJEKTU
ILOŚĆ PRODUKTU
CZAS REALIZACJI
ALGORYTM OBLICZANIA ZAROBKU FIRMY (KOSZT CAŁKOWITY PRODUKCJI VS CENA ZAMÓWIENIA(UWZGLĘDNIAJĄC TRANSPORT)) METODA
SYSTEM PROMOCYJNY(SUMA ZAMÓWIEŃ KLIENTA) METODA
 */