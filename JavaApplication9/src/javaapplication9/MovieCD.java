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
public class MovieCD extends CD {

    String desctription;

    String getDesctription() {
        return desctription;
    }

    void setDesctription(String _desctription) {
        desctription = _desctription;
    }
    
    @Override
    
    public String toString(){
        String n3= System.getProperty("line.separator");
        return getClass().getSimpleName()+ "title: " + title + n3 + "price: " + price
                + "description: " + desctription;
    }
}