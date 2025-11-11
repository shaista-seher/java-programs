class Doctor {
    void consultationFee() {
        System.out.println("General Doctor consultation fee: Rs. 400");
    }
}

class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist consultation fee: Rs. 500");
    }
}

class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: Rs. 800");
    }
}

class Surgeon extends Doctor {
    void consultationFee() {
        System.out.println("Surgeon consultation fee: Rs. 1000");
    }

    public static void main(String[] args) {
        Dentist d = new Dentist();
        Cardiologist c = new Cardiologist();
        Surgeon s = new Surgeon();

        d.consultationFee();
        c.consultationFee();
        s.consultationFee();
    }
}
