package com.maksim;

import com.maksim.model.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Phone[] subscribers = main.createSubscribers();
        Phone[] subscribers1 = main.getSubscribersWithInCityCallsDurationGreaterThan(subscribers, 20);
        System.out.printf("Subscribers with in city calls duration greater than %d minutes:%n", 20);
        main.printSubscribers(subscribers1);
        Phone[] subscribers2 = main.getSubscribersWhoUsedInterCityCalls(subscribers);
        System.out.println("Subscribers who used inter city calls: ");
        main.printSubscribers(subscribers2);
        Phone[] subscribers3 = main.getSubscribersWhomAccountNumberIsBetween(subscribers, 1000, 5000);
        System.out.printf("Subscribers whom account number is between %d and %d:%n", 1000, 5000);
        main.printSubscribers(subscribers3);
    }

    private void printSubscribers(Phone[] subscribers) {
        for (Phone phone : subscribers) {
            System.out.println(phone);
        }
    }

    private Phone[] getSubscribersWhomAccountNumberIsBetween(Phone[] subscribers, int start, int end) {
        List<Phone> results = new ArrayList<>();
        for (Phone subscriber : subscribers) {
            int accountNumber = subscriber.getAccountNumber();
            if (accountNumber >= start && accountNumber <= end) {
                results.add(subscriber);
            }
        }
        return results.toArray(new Phone[0]);
    }

    private Phone[] getSubscribersWhoUsedInterCityCalls(Phone[] subscribers) {
        List<Phone> results = new ArrayList<>();
        for (Phone subscriber : subscribers) {
            if (subscriber.getInterCityCallsMinutes() > 0) {
                results.add(subscriber);
            }
        }
        return results.toArray(new Phone[0]);
    }

    private Phone[] getSubscribersWithInCityCallsDurationGreaterThan(Phone[] subscribers, int duration) {
        List<Phone> results = new ArrayList<>();
        for (Phone subscriber : subscribers) {
            if (subscriber.getInCityCallsMinutes() > duration) {
                results.add(subscriber);
            }
        }
        return results.toArray(new Phone[0]);
    }

    private Phone[] createSubscribers() {
        return new Phone[]{
                new Phone(1, "Alex", "Petrov", "Ivanovich", 1543, 15, 0),
                new Phone(2, "Oleg", "Ivanov", "Olegovich", 1209, 56, 20),
                new Phone(3, "Alina", "Nikolaeva", "Alexandrovna", 9012, 0, 96),
                new Phone(4, "Maksim", "Vlasenko", "Sergeevich", 4389, 90, 6),
                new Phone(5, "Olga", "Alekseeva", "Vitalievna", 7805, 3, 0),
        };
    }

}
