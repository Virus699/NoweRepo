/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication9;

/**
 *
 * @author Virus
 */
public class CD {

    String title;
    int price;

    public CD(){
        price=5;
    }
    String getTitle() {
        return title;
    }

    void setTitle(String _title) {
        title = _title;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int _price) {
        price = _price;

    }

    @Override
    public String toString() {
        String n1 = System.getProperty("line.separator");
        return getClass().getSimpleName() + "title: " + title + n1 + "price: " + price;
    }
}
