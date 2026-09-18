import java.util.ArrayList;
import java.util.List;

class Worker {
    private String name;
    private double baseSalary;
    private double complement;

    public Worker(String name, double baseSalary, double complement) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.complement = complement;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getComplement() {
        return complement;
    }

    public double calculateTotalSalary() {
        return baseSalary + complement;
    }

    public void printInformation() {
        System.out.printf(
                "Name: %-15s Base salary: %.2f  Complement: %.2f  Total: %.2f%n",
                name,
                baseSalary,
                complement,
                calculateTotalSalary()
        );
    }
}


class Company {
    private List<Worker> workers;

    public Company() {
        workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public double calculateGlobalSalary() {
        double total = 0;

        for (Worker worker : workers) {
            total += worker.calculateTotalSalary();
        }

        return total;
    }

    public void printWorkers() {
        System.out.println("WORKERS");
        System.out.println("-----------------------------------------------");

        for (Worker worker : workers) {
            worker.printInformation();
        }

        System.out.println("-----------------------------------------------");
        System.out.printf(
                "Global total salary: %.2f%n",
                calculateGlobalSalary()
        );
    }
}


public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        company.addWorker(new Worker("Alice", 2500, 300));
        company.addWorker(new Worker("Bob", 2200, 250));
        company.addWorker(new Worker("Charlie", 3100, 450));
        company.addWorker(new Worker("David", 2800, 350));

        company.printWorkers();
    }
}