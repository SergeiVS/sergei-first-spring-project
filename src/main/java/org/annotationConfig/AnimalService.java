package org.annotationConfig;

import org.springframework.stereotype.Component;

@Component
public class AnimalService {
    private final DogAnnConfig dog;

    public AnimalService(DogAnnConfig dog) {
        this.dog = dog;
    }

    public void printAnimalData() {
        System.out.println("Dog`s name: " + dog.getName());
    }
}
