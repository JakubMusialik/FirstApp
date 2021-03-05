import Clients.Clients;
import Projects.Projects;
import WorkersList.Workers;

public class Main {
    public static void main(String[] args) {

        int[] amount1 = new int[440];
        int[] amount2 = new int[540];
        Projects project = new Projects("Projekt 1", 3500, amount1, 14);
        Projects projects = new Projects("Projekt 2", 6700, amount2, 21);
        project.printProjectInfo();
        System.out.println();
        projects.printProjectInfo();
        System.out.println();

        Workers worker1 = new Workers("Kuba", "Musialik", 1);
        String worker1Info = worker1.printInfo();
        System.out.println(worker1Info);
        System.out.println();

        Clients clients1 = new Clients("Apple");
        Clients clients2 = new Clients("Asus");

        ClientList.addClients(clients1);
        ClientList.addClients(clients2);
        ClientList.printClients();
    }
}
/*   CO DALEJ
1.implementacja listy pracowników przypisanych do projektu  OK
2.w klasie worker brakująca metoda string join OK
3.Metoda random w klasie projects - FIX     OK
4.Jak powiązać klasę CLIENTS z PROJECTS ?? lista klientów w której przypiszemy każdemu K dany projekt OK.
5.Zastanowić się co z TaskListą
6.Jeśli na ten moment wszystko gotowe, zagadać do Tomka o review.
 */