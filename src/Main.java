public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("rose", "Black", "Holand", 35.59);
        Flower hrizantema = new Flower("hrizantema", null, null, 15, 5);
        Flower pion = new Flower("pion", null, "England", 0);
        pion.setCost(69.9);
        Flower gipsofila = new Flower("gipsofila", null, "Turkish", 19.5);
        gipsofila.setLifeSpan(10);
        flower(rose);
        flower(hrizantema);
        flower(pion);
        flower(gipsofila);
        System.out.println();
        calculateBuketFlowers(
                rose, rose, rose,
                hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                gipsofila
        );

    }

    private static void calculateBuketFlowers(Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета: " + "%.2f\n", totalCost);
        System.out.println("Срок стояния букета: " + minLifeSpan);
    }

    private static void flower(Flower flower) {
        System.out.println("Цветок: " + flower.getFlower() +
                " Цвет: " + flower.getFlowerColor() +
                " Страна: " + flower.getCountry() +
                " Стоимость: " + flower.getCost() +
                " срок стояния: " + flower.getLifeSpan());
    }

}