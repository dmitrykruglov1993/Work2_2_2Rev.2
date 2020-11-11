package web.model;

public class Car {

    String Car_model;
    String Car_serias;
    String Car_color;

    public Car(){}
    public Car(String Car_model,String Car_serias,String Car_color){
        this.Car_model=Car_model;
        this.Car_serias=Car_serias;
        this.Car_color=Car_color;
    }

    public String getCar_model() {
        return Car_model;
    }

    public void setCar_model(String car_model) {
        Car_model = car_model;
    }

    public String getCar_serias() {
        return Car_serias;
    }

    public void setCar_serias(String car_serias) {
        Car_serias = car_serias;
    }

    public String getCar_color() {
        return Car_color;
    }

    public void setCar_color(String car_color) {
        Car_color = car_color;
    }
}
