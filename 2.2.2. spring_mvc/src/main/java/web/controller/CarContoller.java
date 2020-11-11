package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller

public class CarContoller {

    Car mazda = new Car("Mazda","CX8","Red");
    Car opel = new Car("Opel","Astra","Orange");
    Car renault = new Car("Renault","Daster","Yellow");
    Car sitroen = new Car("Sitroen","C4","Green");
    Car vaz = new Car("Vaz","Patriot","Blue");


    @GetMapping(value = "/cars")
    public String SetCar(@RequestParam(value = "count",required = false) Integer count, Model model) {
        if(count==null){
            count=5;
        }
        List<Car> cars = new ArrayList<>();

        cars.add(mazda);
        cars.add(opel);
        cars.add(renault);
        cars.add(sitroen);
        cars.add(vaz);

        if(count >= 5 ){
            model.addAttribute("cars",cars);
            return "cars";
        }
        else if(count < 5) {

            List<Car> cars1 = new ArrayList<>(count);

            for(int i = 0 ; i < count ; i++) {
                cars1.add(cars.get(i));
            }

            model.addAttribute("cars",cars1);
            return "cars";

        }

            return "cars";

    }
}
