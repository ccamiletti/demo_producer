package cl.spring.contractexample.demo.controller;

import cl.spring.contractexample.demo.model.Car;
import cl.spring.contractexample.demo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars-producer")
public class CarController {
    private final CarService carService;

    @GetMapping()
    public ResponseEntity<Car> getCarById() {
        Car car = carService.findById(1L);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }
}
