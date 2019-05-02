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


}
