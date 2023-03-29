package classes;

import enums.Color;
import enums.Country;

import java.time.LocalDate;

public class Tulip extends Flower{
    public Tulip(Country manufacturerCountry, LocalDate shelfLifeInDays, Color color, int price) {
        super(manufacturerCountry, shelfLifeInDays, color, price);
    }
}
