package com.learn.java.part2.onlinestore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlineStore {
    private String name;
    private String phoneNumber;

    private List<Good> goods = new ArrayList<Good>();
    private List<Order> orders = new ArrayList<Order>();

    public void order(Good good, int quantity, Date date, String name) {
    }

    public void cancelOrder(Good good, int quantity, Date date, String name){
    }

    public void editOrder(Good good, int quantity, Date date, String name) {
    }
}
