/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

/**
 *
 * @author gilberto-pedraza
 */
public class NameHandler {
    private String name;

    public NameHandler() {
        name=null;
    }

    public NameHandler(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("valor: "+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
