package com.maksim;

import com.maksim.model.Phone;

public class Main {

    public static void main(String[] args) {
        Phone[] subscribers = createSubscribers();
        showSubscribersWithInCityCallsDurationGreaterThan(subscribers, 20);
        showSubscribersWhoUsedInterCityCalls(subscribers);
        showSubscribersWhomAccountNumberIsBetween(subscribers, 1000,5000);
    }

    private static void showSubscribersWhomAccountNumberIsBetween(Phone[] subscribers, int start, int end) {
        System.out.printf("Subscribers whom account number is between %d and %d:%n", start, end);
        for (Phone subscriber : subscribers) {
            int accountNumber = subscriber.getAccountNumber();
            if (accountNumber >= start && accountNumber <= end) {
                System.out.println(subscriber.toString());
            }
        }
        System.out.println();
    }

    private static void showSubscribersWhoUsedInterCityCalls(Phone[] subscribers) {
        System.out.println("Subscribers who used inter city calls: ");
        for (Phone subscriber : subscribers) {
            if (subscriber.getInterCityCallsMinutes() > 0) {
                System.out.println(subscriber.toString());
            }
        }
        System.out.println();
    }

    private static void showSubscribersWithInCityCallsDurationGreaterThan(Phone[] subscribers, int duration) {
        System.out.printf("Subscribers with in city calls duration greater than %d minutes:%n", duration);
        for (Phone subscriber : subscribers) {
            if (subscriber.getInCityCallsMinutes() > duration) {
                System.out.println(subscriber.toString());
            }
        }
        System.out.println();
    }

    private static Phone[] createSubscribers() {
        return new Phone[]{
                new Phone(1, "Alex", "Petrov", "Ivanovich", 1543, 15, 0),
                new Phone(2, "Oleg", "Ivanov", "Olegovich", 1209, 56, 20),
                new Phone(3, "Alina", "Nikolaeva", "Alexandrovna", 9012, 0, 96),
                new Phone(4, "Maksim", "Vlasenko", "Sergeevich", 4389, 90, 6),
                new Phone(5, "Olga", "Alekseeva", "Vitalievna", 7805, 3, 0),
        };
    }

}
