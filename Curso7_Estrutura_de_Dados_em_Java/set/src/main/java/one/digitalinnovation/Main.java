package one.digitalinnovation;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Carro> hasSetCarros = new HashSet<>();

        hasSetCarros.add(new Carro("Ford"));
        hasSetCarros.add(new Carro("Chevrolet"));
        hasSetCarros.add(new Carro("Fiat"));
        hasSetCarros.add(new Carro("Peugeot"));
        hasSetCarros.add(new Carro("Zip"));
        hasSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hasSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);

    }
}
