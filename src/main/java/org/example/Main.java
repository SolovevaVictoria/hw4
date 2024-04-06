package org.example;

public class Main {
    public static void main(String[] args) {
        Directory directoryWorker = new Directory();

        Worker worker1 = new Worker("Vova",1234,"4444",5);
        Worker worker2 = new Worker("Vika",1234,"5555",10);
        Worker worker3 = new Worker("Artem",3333,"88888",5);
        Worker worker4 = new Worker("Vova",1284,"7343",3);
        Worker worker5 = new Worker("Anna",1284,"43437",3);

        directoryWorker.add(worker1);
        directoryWorker.add(worker2);
        directoryWorker.add(worker3);
        directoryWorker.add(worker4);
        directoryWorker.add(worker5);
        System.out.println(directoryWorker.getWorkers());  // все
        System.out.println(directoryWorker.searchByExperience(5));  // с опытом 5 лет
        directoryWorker.phoneWorker("Artem");  // номер Артёма
        directoryWorker.searchTabelNumber(1234);  // сотрудник по номеру

    }
}