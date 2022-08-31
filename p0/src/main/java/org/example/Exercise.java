package org.example;
import java.lang.*;
import java.util.*;

public class Exercise {

        //private  int id ;
        public String name ;

        private int reps;




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   /*public int getId() {
        return id;
    }
    public void seId(int id) {
        this.id = id;
    }

    /*public int getRep() {
        return reps;
    }
    public void seRep(int Rep) {
        this.reps = Rep;
    }*/


    public Exercise(String name){
        //this.id=id;
        this.name=name;
       //this.reps=reps;

}


    @Override
    public String toString(){
        return "Exercise[name=" + name + "]";
    }


}

