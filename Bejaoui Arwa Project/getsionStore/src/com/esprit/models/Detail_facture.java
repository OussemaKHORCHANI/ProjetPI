/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.models;

/**
 *
 * @author ArwaBj
 */
public class Detail_facture {
    private int id_article ;
    private String libelle;
    private int num_piece;
    private int qt;
    private String type;
 private int ref_article ;
    public Detail_facture(int id_article, String libelle, int num_piece, int qt, String type,int ref_article ) {
        this.id_article = id_article;
        this.libelle = libelle;
        this.num_piece = num_piece;
        this.qt = qt;
        this.type = type;
                this.ref_article = ref_article;

    }

    public Detail_facture(String libelle, int num_piece, int qt, String type, int ref_article) {
        this.libelle = libelle;
        this.num_piece = num_piece;
        this.qt = qt;
        this.type = type;
        this.ref_article = ref_article;

    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setNum_piece(int num_piece) {
        this.num_piece = num_piece;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId_article() {
        return id_article;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getNum_piece() {
        return num_piece;
    }

    public int getQt() {
        return qt;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Detail_facture{" + "id_article=" + id_article + ", libelle=" + libelle + ", num_piece=" + num_piece + ", qt=" + qt + ", type=" + type + ", ref_article=" + ref_article + '}';
    }

    public int getRef_article() {
        return ref_article;
    }

    public void setRef_article(int ref_article) {
        this.ref_article = ref_article;
    }
    
    
}
