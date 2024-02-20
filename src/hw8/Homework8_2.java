package hw8;

import java.util.*;

public class Homework8_2 {
    public static void main(String[] args) {
        Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
        Train t3 = new Train(118, "自強", "高雄", "台北", 500);
        Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
        Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
        Train t6 = new Train(1222, "區間", "屏東", "基隆", 700);
        Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

        List<Train> trains = new ArrayList<>();
        trains.add(t1);
        trains.add(t2);
        trains.add(t3);
        trains.add(t4);
        trains.add(t5);
        trains.add(t6);
        trains.add(t7);

        // 印出不重複的Train物件
        Set<Train> unrepeatedTrains = new HashSet<>(trains);
        System.out.println("不重複的Train: ");
        for (Train t : unrepeatedTrains) {
            System.out.println(
                    t.getNumber()
                            + " "
                            + t.getType()
                            + " "
                            + t.getStart()
                            + " "
                            + t.getDest()
                            + " "
                            + t.getPrice());
        }
        System.out.println("==============================");

        // 以班次編號由大到小印出Train物件
        Collections.sort(trains);
        System.out.println("班次編號由大到小的Train: ");
        for (Train t : trains) {
            System.out.println(
                    t.getNumber()
                            + " "
                            + t.getType()
                            + " "
                            + t.getStart()
                            + " "
                            + t.getDest()
                            + " "
                            + t.getPrice());
        }
        System.out.println("==============================");

        // 以班次編號由大到小印出Train物件, 且Train物件不重複
        Set<Train> unrepeatedTrains2 = new TreeSet<>(trains);
        System.out.println("以班次編號由大到小且不重複的Train: ");
        for (Train t : unrepeatedTrains2) {
            System.out.println(
                    t.getNumber()
                            + " "
                            + t.getType()
                            + " "
                            + t.getStart()
                            + " "
                            + t.getDest()
                            + " "
                            + t.getPrice());
        }
        System.out.println("==============================");
    }
}
