package WorkersList;

import java.util.ArrayList;
import java.util.List;

public class WorkersList {
    private List<Workers> workersList = new ArrayList<>();

    public void addWorkers(Workers workers) {
        workersList.add(workers);
    }

    public void removeWorkers(Workers workers) {
        workersList.remove(workers);
    }

    public void showWorkers() {
        for(Workers workers : workersList) {
            System.out.println(workers);
        }
    }
}