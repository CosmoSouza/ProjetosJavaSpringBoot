package io.github.cosmosouza.pedido.entites;

public class Order {
    private Integer code;
    private double basic;
    private double discount;

    public Order(double basic, Integer code, double discount) {
        this.basic = basic;
        this.code = code;
        this.discount = discount;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Pedido codigo " + code;
    }
}
