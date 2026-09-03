package interface_assignment;

class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    AirIndia() {
    }

    AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public double calculateAmount() {
        return hours * costPerHour;
    }
}