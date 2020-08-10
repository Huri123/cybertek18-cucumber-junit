package com.cybertek.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepDefinitions {
    @Then("User should see below words displayed")
    //public void user_should_see_below_words_displayed(io.cucumber.datatable.DataTable dataTable) { //boyleydi
    public void user_should_see_below_words_displayed(List<String>fruitList) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


        //bunlari biz ekledik:
        //print out the size of the list
        //fruitList.size().soutv
        System.out.println("fruitList.size() = " + fruitList.size());
        //fruitList.soutv
        System.out.println("fruitList = " + fruitList);

    }

}
/*
Gurhan'in Kodlari:

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepDefinitions {

    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> fruitList) {

        //print out the size of the list

        System.out.println("fruitList.size() = " + fruitList.size());

        System.out.println("fruitList = " + fruitList);

    }

}
 */
