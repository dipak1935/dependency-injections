package com.engineeringDigest.vehicles;

public class Car implements Vehicle{

    private DiscountService discountService;
    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Car(DiscountService discountService) {
        this.discountService = discountService;
    }

    public Car(){

    }

    public DiscountService getDiscountService() {
        return discountService;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public String getMileage() {
        return "30kmpl";
    }

    @Override
    public String getDiscountMessage() {
        return "Car"+this.discountService.getDiscountMessage();
    }

}
