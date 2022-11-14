/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuki.relasiclass.tugas1;

/**
 *
 * @author ACER
 */
public class Pengapian {
    private String type;
    private String limit;
    
    public Pengapian(String type, String limit){
        this.type = type;
        this.limit = limit;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
    public void setLimit(String limit){
        this.limit = limit;
    }
    
    public String getLimit(){
        return limit;
    }
    
    public String info(){
        String info = "";
        info += "Type Pengapian : "+type+"\n";
        info += "Limit Pengapian: "+limit+"\n";
        return info;
    }
}
