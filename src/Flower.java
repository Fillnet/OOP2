public class Flower {
    private String flower;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String flower, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null) {
            this.flowerColor = "white";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Russia";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan < 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        this.lifeSpan = lifeSpan;
        this.flower = flower;
    }

    public Flower(String flower,String flowerColor, String country, double cost) {
        this(flower,flowerColor, country, cost, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = "white";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Russia";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

//    void flower() {
//        System.out.println("Цветок: "+getFlower()+" Цвет: "+getFlowerColor()+" Страна: "+getCountry()+" Стоимость: "+getCost()+" срок стояния: "+getLifeSpan());

}
