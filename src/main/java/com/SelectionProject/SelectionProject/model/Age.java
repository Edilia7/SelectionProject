package com.SelectionProject.SelectionProject.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
//@Table(name="TB_AGE")
public class Age implements Serializable {

//    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String bornDate;
    @NotNull
    private int age;
    @NotNull
    private int points;



//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setBornDate(String bornDate) {
//        this.bornDate = bornDate;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge(){
//        return this.age;
//    }
//
//    public int getPoints() {
//        return points;
//    }
//
//    public void setPoints(int points) {
//        int get_age = this.getAge();
//        if(get_age >= 18 && get_age <= 35){
//            points = 16;
//        }else if(age == 36){
//            points = 14;
//        }else if(age == 37){
//            points = 12;
//        }else if(age == 38){
//            points = 10;
//        }else if(age == 39){
//            points = 8;
//        }else if(age == 40){
//            points = 6;
//        }else if(age == 41){
//            points = 4;
//        }else if(age == 42){
//            points = 2;
//        }else if(age >= 43){
//            points = 0;
//        }
//        System.out.println("TEST"+points);
//    }
}
