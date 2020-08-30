package com.dat19c;

public class Member extends Person{
    Boolean isBasic;

    public Member() {
    }

    public Member(String name, String cpr) {
        super(name, cpr);
    }
    public String memberShip(){
        String memberShipString;
        if (isBasic)
            memberShipString = "Basic";
        else
            memberShipString = "Premium";

        return memberShipString;
    }

    public Member(String name, String cpr, Boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public Boolean getBasic() {
        return isBasic;
    }

    public void setBasic(Boolean basic) {
        isBasic = basic;
    }

    @Override
    public String toString() {
        return "Member{" +
                "isBasic=" + isBasic +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }

    public int monthlyFee(){

        int basic = 199;
        int full = 299;

        if (isBasic){
            return basic;
        }
        else return full;
    }

}
