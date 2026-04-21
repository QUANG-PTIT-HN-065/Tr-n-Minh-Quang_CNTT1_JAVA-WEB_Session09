package com.restaurant.session09.bt04;

public class SellerForm {

    private String fullName;
    private String email;
    private String shopName;
    private String address;

    public SellerForm() {
    }

    public SellerForm(String fullName, String email, String shopName, String address) {
        this.fullName = fullName;
        this.email = email;
        this.shopName = shopName;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
