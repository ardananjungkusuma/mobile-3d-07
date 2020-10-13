package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
        this.meter = 0;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setInch(double meter){
        this.meter = meter / 39.3701;
    }

    public void setMile(double meter){
        this.meter = meter / 0.000621371;
    }

    public void setFoot(double meter){
        this.meter = meter / 3.28084;
    }

    public double getMeter() {
        return meter;
    }

    public double getInch() {
        return meter*39.3701;
    }

    public double getMile() {
        return meter*0.000621371;
    }

    public double getFoot() {
        return meter*3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value){
        switch (oriUnit){
            case "Mtr":
                setMeter(value);
                break;
            case "Inc":
                setInch(value);
                break;
            case "Mil":
                setMile(value);
                break;
            case "Ft":
                setFoot(value);
                break;
        }

        switch (convUnit){
            case "Mtr":
                return getMeter();
            case "Inc":
                return  getInch();
            case "Mil":
                return getMile();
            default:
                return getFoot();
        }
    }
}
