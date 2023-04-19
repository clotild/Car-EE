package service;

import com.example.voitures.model.Car;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CarService {
    private static long idSequence = 0;
    private static List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(++idSequence, "Electrique","Polestar 2", " voiture électrique perfectionnée disponible en versions standard et longue autonomie. Cette bicorps entièrement électrique redéfinit le design et les performances.", 70000.5,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.macg.co%2Failleurs%2F2017%2F07%2Ftesla-officialise-la-model-3-et-devoile-ses-caracteristiques-99273%3Fpage%3D3&psig=AOvVaw32UyeyVrZtPsuxFBbW4m0M&ust=1682025246533000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJiA3rzutv4CFQAAAAAdAAAAABAS"),
            new Car(++idSequence, "Electrique","Kia EV6", "Crossover 100 % électrique qui ouvre une nouvelle ère et s’impose comme la référence pour les années à venir. Son design séduisant et distinctif ne manquera pas de susciter votre inspiration.", 47990.0, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.macg.co%2Failleurs%2F2017%2F07%2Ftesla-officialise-la-model-3-et-devoile-ses-caracteristiques-99273%3Fpage%3D3&psig=AOvVaw32UyeyVrZtPsuxFBbW4m0M&ust=1682025246533000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJiA3rzutv4CFQAAAAAdAAAAABAS"),
            new Car(++idSequence, "Hybride","Jaguar F-Pace P400e", "SUV de luxe performant qui conjugue design primé, efficacité et technologies intuitives.", 72290.0, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.macg.co%2Failleurs%2F2017%2F07%2Ftesla-officialise-la-model-3-et-devoile-ses-caracteristiques-99273%3Fpage%3D3&psig=AOvVaw32UyeyVrZtPsuxFBbW4m0M&ust=1682025246533000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJiA3rzutv4CFQAAAAAdAAAAABAS")
            ));
    public List<Car> fetchAllPosts() {
        return cars;
    }
    public Car createCar (String category, String name, String description, Double price, String image) {
        Car c = new Car(++idSequence, category, name, description, price, image);
        cars.add(c);
        return c;
    }
}
