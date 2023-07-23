package org.example;


import org.example.CRUDService.ClientCrudService;
import org.example.CRUDService.PlanetCrudService;
import org.example.Hibernate.HibernateUtils;

public class Main {
    public static void main(String[] args) {

        ClientCrudService client = new ClientCrudService();
        PlanetCrudService planet = new PlanetCrudService();
        client.getAllClient();
        client.addClient("John");
        client.getAllClient();
        client.getClient(5L);
        client.updateClient(15L, "Marc");
        client.deleteClient(15L);
        client.getAllClient();


        planet.getAllPlanet();
        planet.addPlanet("URAN", "Uranus");
        planet.getPlanet("URAN");
        planet.updatePlanet("URAN", "URANUS");
        planet.deletePlanet("URAN");
        planet.getAllPlanet();


        HibernateUtils.getInstance().closeSessionFactory();
    }
}