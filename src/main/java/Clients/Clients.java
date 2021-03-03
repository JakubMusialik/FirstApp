package Clients;

import java.util.HashSet;
import java.util.Set;

public class Clients {
    private final String name;
    private double valueOfOrders;
    private boolean realised;
    private Set<Clients> clients = new HashSet<>();

    public Clients(String name) {
        this.name = name;
    }

    public void addClients(Clients client) {
        clients.add(client);
    }

    public void printClients() {
        for (Clients client : clients) {
            System.out.println(client);
        }
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