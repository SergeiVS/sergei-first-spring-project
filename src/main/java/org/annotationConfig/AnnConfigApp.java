package org.annotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnConfigApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.annotationConfig");
        CatAnnConfig cat = context.getBean(CatAnnConfig.class);
        DogAnnConfig dog = (DogAnnConfig) context.getBean("dog");
        ParrotAnnConfig parrot = context.getBean(ParrotAnnConfig.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

//        AnimalService animalService= new AnimalService(dog);
//        animalService.printAnimalData();

        AnimalService animalService = context.getBean(AnimalService.class);
        animalService.printAnimalData();
    }
}
