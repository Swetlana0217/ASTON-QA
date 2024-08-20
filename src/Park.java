public class Park {
    String attraction = "Качели";
    String attraction1 = "Карусель";
    String attraction2 = "Горки";
    String attraction3 = "Колесо обозрения";
    String attraction4 = "Комната смеха";
    String attraction5 = "Тир";

    public Park(String attraction, String attraction1, String attraction2, String attraction3, String attraction4, String attraction5) {
        this.attraction = attraction;
        this.attraction1 = attraction1;
        this.attraction2 = attraction2;
        this.attraction3 = attraction3;
        this.attraction4 = attraction4;
        this.attraction5 = attraction5;
    }
    // constructors, methods
    public class Price {
        int time = 5;
        int time1 = 6;
        int time2 = 10;
        int time3 = 20;
        int time4 = 12;
        int time5 = 10;
        int price = 50;
        int price1 = 55;
        int price2 = 70;
        int price3 = 100;
        int price4 = 65;
        int price5 = 45;

        public Price(int time, int price, int time1, int price1, int time2, int price2, int time3, int price3, int time4, int price4, int time5, int price5) {
            this.time = price;
            this.time1 = time1;
            this.time2 = time2;
            this.time3 = time3;
            this.time4 = time4;
            this.time5 = time5;
            this.price = price;
            this.price1 = price1;
            this.price2 = price2;
            this.price3 = price3;
            this.price4 = price4;
            this.price5 = price5;
        }

        public void infoPark() {
            System.out.println(attraction + time+ price);
            System.out.println(attraction1 + time1 + price1);
            System.out.println(attraction2 + time2 + price2);
            System.out.println(attraction3 + time3 + price3);
            System.out.println(attraction4 + time4 + price4);
            System.out.println(attraction5 + time5 + price5);
        }
    }
}
