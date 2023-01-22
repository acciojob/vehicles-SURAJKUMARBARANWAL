package com.driver;

public class F1 extends Car {


    public F1(String name, boolean isManual) {
      super(name,isManual);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        newSpeed=this.getCurrentSpeed()+rate;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed <=50) {
            //Stop the car, set gear as 1
            this.setGears(1);
        }
        else if(newSpeed > 50 && newSpeed<=100) {
            this.setGears(2);
        }
        else if(newSpeed > 100 && newSpeed<=150){
            this.setGears(3);
        }
        else if(newSpeed > 150 && newSpeed<=200){
            this.setGears(4);
        }
        else if(newSpeed >200 && newSpeed<=250){
            this.setGears(5);
        }
        else this.setGears(6);
        changeSpeed(newSpeed, getCurrentDirection());
    }
}
