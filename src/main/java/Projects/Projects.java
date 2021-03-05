package Projects;

import WorkersList.Workers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Projects {

    private String projectName;           //nazwa
    private int price;                   //koszt
    private int[] amount;                 //ilość
    private int deadline;                 //czas realizacji
    private List<Workers> projectWorkers = new ArrayList<>();


    public Projects(String projectName, int price, int[] amount, int deadline) {
        this.projectName = projectName;
        this.price = price;
        this.amount = amount;
        this.deadline = deadline;

    }

    public String getProjectName() {
        return projectName;
    }

    public int getPrice() {
        return price;
    }

//    public static int getAmount() {
//        return amount;
//    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public void newBiggerPrice(int percent) {             // METODA DO PODWYŻSZANIA CENY PROJEKTU
        price = price + ((price * percent) / 100);
    }

    public void newLowerPrice(int percent) {              // METODA DO OBNIŻANIA CENY PROJEKTU
        price = price - ((price * percent) / 100);
    }

    private int product(int numberOfProduct) {
        Random random = new Random();
        if (numberOfProduct <= 100 && numberOfProduct > 0) {
            int i = random.nextInt(5);
            amount = Arrays.copyOf(amount, amount.length + i);
        } else if (numberOfProduct <= 250 && numberOfProduct > 0) {
            int i = random.nextInt(12);
            amount = Arrays.copyOf(amount, amount.length + i);
        } else if (numberOfProduct <= 500 && numberOfProduct > 0) {
            int i = random.nextInt(25);
            amount = Arrays.copyOf(amount, amount.length + i);
        } else {
            int i = random.nextInt(50);
            amount = Arrays.copyOf(amount, amount.length + i);
        }
        return amount.length;
    }

    public void signWorker(Workers workers) {
        projectWorkers.add(workers);
    }

    public void removeWorkers(Workers workers) {
        projectWorkers.remove(workers);
    }

    public void printProjectWorkers() {
        for (Workers workers : projectWorkers) {
            System.out.println(workers);
        }
    }

    public void printProjectInfo() {

        System.out.println("Nazwa projektu: " + projectName);
        System.out.println("Cena projektu: " + price);
        System.out.println("Ilość produktów w zamówieniu: " + amount.length);
        System.out.println("Przewidywana ilość produktów (z uwzględnieniem wadliwych sztuk): " + product(amount.length));
        System.out.println("Czas realizacji: " + deadline);
        for (Workers workers : projectWorkers) {
            System.out.print("Pracownicy: " + workers + ", ");
        }

    }
}
/* PROJECTS
Dodawanie projektu do Klienta (LEGIA WARSZAWA(K) KOLEKCJA LATO(P))    MAPA
KOSZT PROJEKTU
ILOŚĆ PRODUKTU
CZAS REALIZACJI
ALGORYTM OBLICZANIA ZAROBKU FIRMY (KOSZT CAŁKOWITY PRODUKCJI VS CENA ZAMÓWIENIA(UWZGLĘDNIAJĄC TRANSPORT)) METODA
SYSTEM PROMOCYJNY(SUMA ZAMÓWIEŃ KLIENTA) METODA
 */