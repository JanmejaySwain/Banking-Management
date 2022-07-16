package com.basicbankingmanagement.Model;


public class HistoryModel {
    private String time;
    private String user1;
    private String user2;
    private String isSucess;
    private String amount;

    public HistoryModel(String t, String u1, String u2, String a, String s) {
        time = t;
        user1 = u1;
        user2 = u2;
        amount = s;
        isSucess = a;


    }


    //Getter and Setter Methods
    //=========================
    public String getTime() {
        return time;
    }


    public String getUser1() {
        return user1;
    }


    public String getUser2() {
        return user2;
    }



    public String getAmount() {
        return amount;
    }

}
