package jom.com.softserve.s1.task5;

enum Color {
    WHITE, RED, BLUE
}

enum Type {
    RARE, ORDINARY
}

class Plant {
    private Type type;
    private Color color;
    private String name;
    public Plant(String type, String color, String name) throws ColorException, TypeException {
        this.name = name;
        this.color = convertToColor(color);
        this.type = convertToType(type);
    }

    @Override
    public String toString() {
        return "{" +
                "type: " + type +
                ", color: " + color +
                ", name: " + name +
                '}';
    }

    private Color convertToColor(String color) throws ColorException {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Invalid value " + color + " for field color");
        }
    }

    private Type convertToType(String type) throws TypeException {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Invalid value " + type + " for field type");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}
