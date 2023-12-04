interface Bill {
    void discount();
    void finalBill();
}

class Grocery implements Bill {
    private double amount;

    Grocery(double amount) {
        this.amount = amount;
    }

    
    public void discount() {
        this.amount *= 0.9;
    }

    
    public void finalBill() {
        System.out.println("Final bill for Grocery: " + this.amount);
    }
}

class Fashion implements Bill {
    private double amount;

    Fashion(double amount) {
        this.amount = amount;
    }

    
    public void discount() {
        if (this.amount > 1000) {
            this.amount *= 0.85;
        } else {
            this.amount *= 0.95;
        }
    }

    
    public void finalBill() {
        System.out.println("Final bill for Fashion: " + this.amount);
    }
}

class Main {
    public static void main(String[] args) {
        Grocery groceryBill = new Grocery(1200);
        groceryBill.discount();
        groceryBill.finalBill();

        Fashion fashionBill = new Fashion(800);
        fashionBill.discount();
        fashionBill.finalBill();
    }
}
