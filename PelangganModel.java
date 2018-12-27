/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sitisafira.latihanmvc.model;

import edu.sitisafira.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SITOY
 */
public class PelangganModel {
    
    private string nama;
    private string email;
    private string noTelp;

    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
           
    
    public string getNama() {
        return nama;
    }

    public void setNama(string nama) {
        this.nama = nama;
        fireOnChange ();
    }

    public string getEmail() {
        return email;
    }

    public void setEmail(string email) {
        this.email = email;
        fireOnChange ();
    }

    public string getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(string noTelp) {
        this.noTelp = noTelp;
        fireOnChange ();
    }

    protected void fireOnChange (){
        if (pelangganListener != null) {
            pelangganListener.onChange(this);
        }
    }
    public void resetForm (){
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berasil Disimpan");
    }

    private static class string {

        public string() {
        }
    }
    
}
