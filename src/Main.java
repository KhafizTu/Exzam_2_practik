import classes.Flower;
import impl.FlowerServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        FlowerServiceImpl flowerService = new FlowerServiceImpl();

        List<Flower> list = new ArrayList<>();


        System.out.println("----AddFlowers----");
        flowerService.addFlowers();
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("---GetAllFlower----");
        flowerService.getAllFlowers();
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("----GetFlowersFinByColor");
        System.out.println("Введите цвет которую хотите вывести на консоль: ");
        flowerService.getFlowersFinByColor(scanner.next().toUpperCase());
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("GroupingFlowersByColor");
        flowerService.groupingFlowersByColor();
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("GetSumAllFlowers");
        flowerService.getSumAllFlowers();
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("----getAllFlowersSortByPrice----");
        System.out.println("Введите команду по которой хотите сортировать :  asc || desc");
        flowerService.getAllFlowersSortByPrice(scanner.next());







    }
}