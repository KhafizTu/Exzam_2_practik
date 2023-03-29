package classes;

import enums.Color;
import enums.Country;

import java.time.LocalDate;

public class Flower {
    private Country manufacturerCountry;
    private LocalDate shelfLifeInDays;
    private Color color;
    private int price;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Country getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(Country manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public LocalDate getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(LocalDate shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flower(Country manufacturerCountry, LocalDate shelfLifeInDays, Color color, int price) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLifeInDays = shelfLifeInDays;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return  getClass().getName()+ ": "+
                "manufacturerCountry=" + manufacturerCountry +
                ", shelfLifeInDays=" + shelfLifeInDays +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
