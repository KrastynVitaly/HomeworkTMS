package Homework7;

public class Therapist extends Doctor {
    public void heal() {
        System.out.println("Терапевт лечит!");
    }

    public void changeDoctor(Patient patient) {
        Doctor doctor = switch (patient.getTreatmentPlan()) {
            case 1 -> new Surgeon();
            case 2 -> new Dentist();
            default -> this;
        };
        patient.setDoctor(doctor);
        doctor.heal();
    }
}
