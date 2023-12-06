package jom.com.softserve.s1.task6;

public class Plant {
    public static Plant tryCreatePlant(String type, String color, String name) throws ColorException, TypeException {
        try {
            return new Plant(type, color, name);
        } catch (ColorException ex) {
            try {
                return new Plant(type, "Red", name);
            } catch (ColorException | TypeException exs) {
                return new Plant("Ordinary", "Red", name);
            }

        } catch (TypeException ex) {
            try {
                return new Plant("Ordinary", color, name);
            } catch (ColorException | TypeException exs) {
                return new Plant("Ordinary", "Red", name);
            }
        }
    }
}