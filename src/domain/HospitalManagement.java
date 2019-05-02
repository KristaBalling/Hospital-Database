package domain;

public class HospitalManagement {

    public void callUpon(Employee employee){
        if(employee instanceof Nurse){
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        }else if(employee instanceof Doctor){
            prescribeMedicine();
            diagnosePatients();
        }
    }

    //Nurses
    private void checkVitalSigns(){
        System.out.println("checking vitals");
    }

    private void drawBlood(){
        System.out.println("drawing blood");
    }

    private void cleanPatientArea(){
        System.out.println("cleaning patient area");
    }

    //Doctors
    private void prescribeMedicine(){
        System.out.println("Diagnosing Patient");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing patient area");
    }

}
