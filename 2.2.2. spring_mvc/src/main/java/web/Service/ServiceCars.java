package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCars {

    Car mazda = new Car("Mazda","CX8","Red");
    Car opel = new Car("Opel","Astra","Orange");
    Car renault = new Car("Renault","Daster","Yellow");
    Car sitroen = new Car("Sitroen","C4","Green");
    Car vaz = new Car("Vaz","Patriot","Blue");

    public List<Car> AddCars(){
        List<Car> cars = new ArrayList<>();

        cars.add(mazda);
        cars.add(opel);
        cars.add(renault);
        cars.add(sitroen);
        cars.add(vaz);

        return cars;
    }



}
