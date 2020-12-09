package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.ServiceCars;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarContoller {

    @Autowired
    ServiceCars serviceCars;

    @GetMapping(value = "/cars")
    public String SetCar(@RequestParam(value = "count",required = false) Integer count, Model model) {
        if(count==null){
            count=5;
        }
        List<Car> cars = new ArrayList<>();
        cars = serviceCars.AddCars();

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
