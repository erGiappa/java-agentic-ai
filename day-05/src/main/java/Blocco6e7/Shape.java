package Blocco6e7;

public abstract  class Shape {

    protected String color;

    public Shape(String color){
        this.color = color;
    }
    public abstract double area();

    public abstract void descrivi();

    public String getColor() {
        return color;
    }

    public String toString(){
        return "Tipo: " + getClass().getSimpleName()
        + " Area: " + area()
                + " Color: " + color;

    }

}
