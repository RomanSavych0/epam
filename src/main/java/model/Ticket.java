package model;

public class Ticket {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int id;
private String from;
private String to;
private int price;
private  String date;
private String time;
private  int amount;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Ticket(int id , String from, String to, int price, String date, String time, int amount) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.date = date;
        this.time = time;
        this.amount = amount;
    }

    public Ticket() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAmout() {
        return amount;
    }

    public void setAmout(int amount) {
        this.amount = amount;
    }
}
