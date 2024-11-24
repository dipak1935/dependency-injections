package com.engineeringDigest.vehicles;

public class Bus implements Vehicle{

    private DiscountService discountService;
    private String brandName;

    @Override
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Bus(){

    }

    public Bus(DiscountService discountService) {
        this.discountService = discountService;
    }


    public DiscountService getDiscountService() {
        return discountService;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public String getMileage() {

        return "20kmpl";
    }

    @Override
    public String getDiscountMessage() {

        return "Bus "+this.discountService.getDiscountMessage();

    }




}
