
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.playerdetail;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Nihal Anand
 */
public class product {
    private SimpleStringProperty productname;
    private SimpleStringProperty productbirth_place;
    private SimpleStringProperty productrole;
    private SimpleStringProperty productbatting;
    private SimpleStringProperty productbowling;
    private SimpleStringProperty productteam;
    private SimpleIntegerProperty productmatch;
    private SimpleIntegerProperty productruns;
    private SimpleIntegerProperty productwickets;
    private SimpleDoubleProperty productsr;
    private SimpleDoubleProperty productecon;
    private SimpleDoubleProperty productbatavg;
    private SimpleDoubleProperty productbowlavg;

    public product(String productname, String productbirth_place, String productrole, String productbatting, String productbowling, String productteam, int productmatch, int productruns, int productwickets, double productsr, double productecon, double productbatavg, double productbowlavg) {
        this.productname =new SimpleStringProperty (productname);
        this.productbirth_place =new SimpleStringProperty (productbirth_place);
        this.productrole = new SimpleStringProperty (productrole);
        this.productbatting = new SimpleStringProperty (productbatting);
        this.productbowling = new SimpleStringProperty(productbowling);
        this.productteam =new SimpleStringProperty (productteam);
        this.productmatch = new SimpleIntegerProperty (productmatch);
        this.productruns = new SimpleIntegerProperty (productruns);
        this.productwickets =new SimpleIntegerProperty (productwickets);
        this.productsr = new SimpleDoubleProperty (productsr);
        this.productecon = new SimpleDoubleProperty (productecon);
        this.productbatavg =new SimpleDoubleProperty (productbatavg);
        this.productbowlavg =new SimpleDoubleProperty (productbowlavg);
    }

  

    public String getProductname() {
        return productname.get();
    }

    public void setProductname(String productname) {
        this.productname =new SimpleStringProperty (productname);
    }

    public String getProductbirth_place() {
        return productbirth_place.get();
    }

    public void setProductbirth_place(String productbirth_place) {
        this.productbirth_place =new SimpleStringProperty (productbirth_place);
    }

    public String getProductrole() {
        return productrole.get();
    }

    public void setProductrole(String productrole) {
        this.productrole =new SimpleStringProperty (productrole);
    }

    public String getProductbatting() {
        return productbatting.get();
    }

    public void setProductbatting(String productbatting) {
        this.productbatting =new SimpleStringProperty (productbatting);
    }

    public String getProductbowling() {
        return productbowling.get();
    }

    public void setProductbowling(String productbowling) {
        this.productbowling =new SimpleStringProperty (productbowling);
    }

    public String getProductteam() {
        return productteam.get();
    }

    public void setProductteam(String productteam) {
        this.productteam =new SimpleStringProperty (productteam);
    }

    public int getProductmatch() {
        return productmatch.get();
    }

    public void setProductmatch(int productmatch) {
        this.productmatch =new SimpleIntegerProperty (productmatch);
    }

    public int getProductruns() {
        return productruns.get();
    }

    public void setProductruns(int productruns) {
        this.productruns =new SimpleIntegerProperty (productruns);
    }

    public int getProductwickets() {
        return productwickets.get();
    }

    public void setProductwickets(int productwickets) {
        this.productwickets =new SimpleIntegerProperty (productwickets);
    }

    public double getProductsr() {
        return productsr.get();
    }

    public void setProductsr(double productsr) {
        this.productsr =new SimpleDoubleProperty (productsr);
    }

    public double getProductecon() {
        return productecon.get();
    }

    public void setProductecon(double productecon) {
        this.productecon =new SimpleDoubleProperty (productecon);
    }

    public double getProductbatavg() {
        return productbatavg.get();
    }

    public void setProductbatavg(double productbatavg) {
        this.productbatavg =new SimpleDoubleProperty (productbatavg);
    }

    public double getProductbowlavg() {
        return productbowlavg.get();
    }

    public void setProductbowlavg(double productbowlavg) {
        this.productbowlavg =new SimpleDoubleProperty (productbowlavg);
    }
     
           
    
    
}
