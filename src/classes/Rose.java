package classes;

import enums.Color;
import enums.Country;

import java.time.LocalDate;

public class Rose extends Flower{
    public Rose(Country manufacturerCountry, LocalDate shelfLifeInDays, Color color, int price) {
        super(manufacturerCountry, shelfLifeInDays, color, price);
    }
}
