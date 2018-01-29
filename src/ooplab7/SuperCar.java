package ooplab7;

public class SuperCar {
    private String carBrand;
    private String carColor;
    private String engSize;
    private String maxSpeed;
    private String country;


    //constructor คือ เมดธอดที่มีชื่อเดียวกันกับ class
    public SuperCar(){}
    public SuperCar(String b,String c, String e, String m, String cr){
        this.carBrand = b;
        this.carColor = c;
        this.engSize = e;
        this.maxSpeed = m;
        this.country = cr;
    }

    //getter and setter methods
    // carColor
    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    // carBrand
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    // Engsize
    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }

    // max Speed
    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSuperCarInfo() {
        return "Super Car info {" +
                "Car Brand ='" + carBrand + '\'' +
                ",Car Colo='" + carColor + '\'' +
                ", Engine Size='" + engSize + '\'' +
                ", Max Speed='" + maxSpeed + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}