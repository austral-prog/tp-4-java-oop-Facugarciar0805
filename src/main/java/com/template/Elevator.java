package com.template;

public class Elevator {
    int min;
    int max;
    int current;
    int passengers;
    int maxpassangers;
    public Elevator(int min, int max, int maxpassengers) {
        this.min = min;
        this.max = max;
        this.current = 0;
        this.passengers = 0;
        this.maxpassangers = maxpassengers;
    }
    public void moveToFloor(int piso){
        if ((piso<=this.max) && (piso>=this.min )){
            this.current = piso;
        }
    }
    public int getCurrentFloor() {
        return this.current;
    }
    public int getPassengerCount() {
        return this.passengers;
    }
    public void addPassenger(){
       if(this.passengers<this.maxpassangers){
           this.passengers++;
       }

    }
    public void removePassenger(){
        if (this.passengers > 0){
            passengers--;
        }
    }





    // Implement this class by observing the tests in this repo. From those you will be able
    // to pick what the constructors params are, what the methods are and what they should do.


}
