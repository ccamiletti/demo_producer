package cl.spring.contractexample.demo.service;

import cl.spring.contractexample.demo.model.Car;
import cl.spring.contractexample.demo.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository carRepository;

    public Car findById(Long id) {
        return Car.builder()
                .id(1L)
                .brand("AUDI")
                .color("WHITE")
                .model("STORM")
                .build();
    }
}
