package com.ibm.bean;

/**
 * @author dva
 * @create 2019-03-26 10:27
 */
public class UserCart {

//    private int id;
//    使用联合主键
    private int userid;
    private int productid;
    private int amount;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "UserCart{" +
                "userid=" + userid +
                ", productid=" + productid +
                ", amount=" + amount +
                '}';
    }
}
