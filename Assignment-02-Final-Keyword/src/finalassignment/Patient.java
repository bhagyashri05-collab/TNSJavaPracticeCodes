package hospital;

class Patient {

    // Final variable
    final int registrationFee = 500;

    // Final method
    final void registerPatient(String name) {

        System.out.println("Patient Name : " + name);
        System.out.println("Registration Fee : ₹" + registrationFee);
        System.out.println("Patient Registered Successfully");
    }
}