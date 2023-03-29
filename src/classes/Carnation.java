package classes;

import enums.Color;
import enums.Country;

import java.time.LocalDate;

public class Carnation extends Flower{
    public Carnation(Country manufacturerCountry, LocalDate shelfLifeInDays, Color color, int price) {
        super(manufacturerCountry, shelfLifeInDays, color, price);
    }
}
