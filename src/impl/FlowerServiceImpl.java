package impl;

import classes.Carnation;
import classes.Flower;
import classes.Rose;
import classes.Tulip;
import enums.Color;
import enums.Country;
import org.w3c.dom.ls.LSOutput;
import servise.FlowerService;

import javax.crypto.spec.PSource;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class FlowerServiceImpl implements FlowerService {
    Scanner scanner = new Scanner(System.in);

    Rose rose1 = new Rose(Country.KAZAKHSTAN, LocalDate.of(2023, 3, 12), Color.WHITE, 1200);
    Rose rose2 = new Rose(Country.KYRGYZSTAN, LocalDate.of(2023, 3, 24), Color.YELLOW, 1500);
    Rose rose3 = new Rose(Country.USA, LocalDate.of(2023, 3, 18), Color.RED, 1400);

    Carnation carnation1 = new Carnation(Country.USA, LocalDate.of(2021, 12, 12), Color.RED, 1200);
    Carnation carnation2 = new Carnation(Country.KYRGYZSTAN, LocalDate.of(2022, 2, 21), Color.YELLOW, 1300);
    Carnation carnation3 = new Carnation(Country.USA, LocalDate.of(2023, 9, 24), Color.WHITE, 1000);

    Tulip tulip1 = new Tulip(Country.KAZAKHSTAN, LocalDate.of(2023, 7, 7), Color.WHITE, 900);
    Tulip tulip2 = new Tulip(Country.USA, LocalDate.of(2023, 9, 10), Color.RED, 1000);
    Tulip tulip3 = new Tulip(Country.KYRGYZSTAN, LocalDate.of(2023, 8, 3), Color.YELLOW, 900);


    List<Flower> flowerList = new ArrayList<>();


    @Override
    public String addFlowers() {

        System.out.print("Введите название цветка :");
        String name = scanner.next();
        System.out.print("Введите страну : ");
        String count = scanner.next();

        System.out.print("Введите цвет: ");
        String colorr = scanner.next();
        System.out.print("Введите цену цветка: ");
        int pir = scanner.nextInt();

        if (name.equalsIgnoreCase("rose")) {
            Rose rose4 = new Rose(Country.valueOf(count.toUpperCase()), LocalDate.of(2023, 3, 27), Color.valueOf(colorr.toUpperCase()), pir);
            flowerList.add(rose4);

        } else if (name.equalsIgnoreCase("carnation")) {
            Carnation carnation4 = new Carnation(Country.valueOf(count.toUpperCase()), LocalDate.of(2023, 3, 27), Color.valueOf(colorr.toUpperCase()), pir);
            flowerList.add(carnation4);

        } else if (name.equalsIgnoreCase("tulip")) {
            Tulip tulip4 = new Tulip(Country.valueOf(count.toUpperCase()), LocalDate.of(2023, 3, 27), Color.valueOf(colorr.toUpperCase()), pir);
            flowerList.add(tulip4);

            System.out.println("Цветок успешно добавлен !!!");

        }


//        for (Flower d :flowerList) {
//            System.out.println( d );
//        }
        return null;
    }


    @Override
    public List getAllFlowers() {
        flowerList.add(rose1);
        flowerList.add(rose2);
        flowerList.add(rose3);
        flowerList.add(tulip1);
        flowerList.add(tulip2);
        flowerList.add(tulip3);
        flowerList.add(carnation1);
        flowerList.add(carnation2);
        flowerList.add(carnation3);

        for (Flower d : flowerList) {
            System.out.println(d);
        }
        return null;
    }

    @Override
    public List getFlowersFinByColor(String color) {

        if (color.equalsIgnoreCase("red")) {
            flowerList.stream()
                    .filter(m -> m.getColor().equals(Color.RED))
                    .forEach(System.out::println);
        } else if (color.equalsIgnoreCase("yellow")) {
            flowerList.stream()
                    .filter(m -> m.getColor().equals(Color.YELLOW))
                    .forEach(System.out::println);
        } else if (color.equalsIgnoreCase("white")) {
            flowerList.stream()
                    .filter(m -> m.getColor().equals(Color.WHITE))
                    .forEach(System.out::println);
        }else {
            System.out.println("Мындай тус жок !");
        }

        return null;
    }

    @Override
    public Map<String, List> groupingFlowersByColor() {

        System.out.println("RED group : ");
        flowerList.stream()
                .filter(m -> m.getColor().equals(Color.RED))
                .forEach(System.out::println);
        System.out.println("YELLOW group: ");
        flowerList.stream()
                .filter(m -> m.getColor().equals(Color.YELLOW))
                .forEach(System.out::println);
        System.out.println("WHITE group: ");
        flowerList.stream()
                .filter(m -> m.getColor().equals(Color.WHITE))
                .forEach(System.out::println);


        return null;
    }

    @Override
    public int getSumAllFlowers() {
        int sum = 0;
        for (Flower f : flowerList) {
            sum += f.getPrice();
        }
        int sum2 = 0;
        sum2 += sum;
        System.out.println("Сумма всех цветов: " + sum2);


        return 0;
    }

    @Override
    public List getAllFlowersSortByPrice(String ascendingOrDescending) {

        if (ascendingOrDescending.equalsIgnoreCase("asc")) {

            Comparator<Flower> comparator = new Comparator<Flower>() {

                @Override
                public int compare(Flower o1, Flower o2) {
                    return o1.getPrice() - o2.getPrice();
                }
            };

        flowerList.stream()
                .sorted(comparator)
                .forEach(System.out::println);

    }else if(ascendingOrDescending.equalsIgnoreCase("desc")){

        Comparator<Flower> comparator = new Comparator<Flower>() {

            @Override
            public int compare(Flower o1, Flower o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };

        flowerList.stream().sorted(comparator).forEach(System.out::println);
    }

       return null;
}



}
