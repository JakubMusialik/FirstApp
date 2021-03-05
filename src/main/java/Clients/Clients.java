package Clients;

import Projects.Projects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Clients {
    private final String name;
    private double valueOfOrders;
    private boolean realised;
    private Set<Clients> clients = new HashSet<>();
    private List<Projects> orders = new ArrayList<>();

    public Clients(String name) {
        this.name = name;
    }

    public void addProjects(Projects projects) {
        orders.add(projects);
    }

    public void removeProjects(Projects projects) {
        orders.remove(projects);
    }

    public void printProjects() {
        for (Projects order : orders) {
            System.out.println(order);
        }
    }

    @Override
    public String toString() {
        return "Klient:" +  "\n" +
                "Nazwa: '" + name + '\'' +
                ", Łączna wartość zamówień: " + valueOfOrders +
                ", Stopień realizacji: " + realised +
                ", Zamówienia: " + orders.size();
    }
}



/*   CLIENTS
Dodawanie klienta ok
Nadawanie statusu klienta (zrealizowany/niezrealizowany) ok
Podgląd zamowień danego klienta
Historia płatności
Dane kontaktowe

//  ZAPYTAĆ O SQL INJECTION !!!

            KLIENT X - 3 ZAMOWIENIA - STATUS FALSE
                           1 ZAMOWIENIE - GOTOWE
                                   2 ZAMOWIENIE - GOTOWE
                                           3 ZAMOWIENIE - NIE GOTOWE  <---- GOTOWE STATUS KLIENTA TRUE

 */