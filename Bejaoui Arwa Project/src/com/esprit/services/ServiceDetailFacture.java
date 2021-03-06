/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.services;
import com.esprit.models.Article;
import com.esprit.models.Stock;
import com.esprit.models.Detail_facture;
import com.esprit.models.Entete_facture;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ArwaBj
 */
public class ServiceDetailFacture implements IServiceDetailFacture<Detail_facture> {
    Connection cnx = DataSource.getInstance().getCnx();
    private boolean id_article;

    @Override
    public void ajouter(Detail_facture t) {
        try {
           
            String requete = "INSERT INTO detail_facture (libelle,num_piece ,qt,type) VALUES (?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            
            
            pst.setString(1, t.getLibelle());
            pst.setInt(2, t.getNum_piece());
            pst.setInt(3, t.getQt());
           pst.setString(4, t.getType());
            pst.executeUpdate();
            System.out.println("Article ajoutée dans la facture !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void supprimer(Detail_facture t) {
        try {
            String requete = "DELETE FROM detail_facture WHERE num_piece=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, t.getNum_piece());
            pst.executeUpdate();
            System.out.println("Article supprimée de facture !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Detail_facture t) {
        try {
            String requete = "UPDATE detail_facture SET libelle=?,qt=?,type=? WHERE num_piece=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(4, t.getNum_piece());
            pst.setString(1, t.getLibelle());
        
            pst.setInt(2, t.getQt());
            pst.setString(3, t.getType());
            pst.executeUpdate();
            System.out.println("Aricle  modifiée dans la facture !");
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
 
    }

    @Override
    public List<Detail_facture> afficher() {
List<Detail_facture> list = new ArrayList<>();

        try {
            String requete = "SELECT * FROM detail_facture";
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new Detail_facture(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getInt(4), rs.getString(5)));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list;
    }

    @Override
    public void modifier_stock(Detail_facture t) {
//    
//
//    List<Detail_facture> list = new ArrayList<>();
//
//        try {
//            String requete = "SELECT * FROM detail_facture  ";
//            PreparedStatement pst = cnx.prepareStatement(requete);
//            ResultSet rs = pst.executeQuery();
//            while (rs.next()) {
//                list.add(new Detail_facture(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getInt(4), rs.getString(5)));
//            }
//            
//            for(int i = 0 ; i < list.size(); i++){
//                String requete2 = "UPDATE article  SET LIBELLE=?,CATEGORIE=? , IMAGE_ARTICLE=? , PRIX=? ,QT_ARTICLE+= '"+qt[i]+"' where id =  '"+id_article[i]+"' ";
//            PreparedStatement pst2 = cnx.prepareStatement(requete2);
//                        pst2.executeUpdate();
//            }
//                     
//
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//
//   
//    
//       
//    
    }
}
    

 

   
   
    
    