package jom.com.softserve.s1.task6;

public class Plant {
    public static Plant tryCreatePlant(String type, String color, String name) {
        Plant plant = null;
        try {
            plant = new Plant(type, color, name);
        } catch (ColorException ce) {
            plant = tryCreatePlant(type, "Red", name);
        } catch (TypeException te) {
            plant = tryCreatePlant("Ordinary", color, name);
        }
        return plant;
    }