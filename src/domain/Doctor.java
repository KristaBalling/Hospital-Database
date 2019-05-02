package domain;

public class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }

    private void prescribeMedicine(){
        System.out.println("Diagnosing Patient");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing patient area");
    }
}
