/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system.dboperation;

import billing_system.models.ComponentDetails;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class DBOperations {

    String url = "jdbc:mysql://localhost:3306/test";
    String username = "root";
    String password = null;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean addComponentDetails(ComponentDetails cd ) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO stock(productcode , productname , unitprice , quantity , last_update) VALUES (?,?,?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setString(1, cd.getQuickCode());
            pst.setString(2, cd.getProductName());
            pst.setDouble(3, cd.getUnitPrice());
            pst.setDouble(4, cd.getQuantity());
            pst.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            pst.execute();
            System.out.println("Add a Component");
            return true;
        } catch (Exception e) {
            System.out.println("error:" + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    public ArrayList<String> selectComponents() throws SQLException{
        con = (Connection) DriverManager.getConnection(url, username, password);
        ArrayList<String> namelist = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT productname FROM stock");
        while (rs.next()) {
            namelist.add(rs.getString("productname"));
        }
        return namelist;
    }
    
    public boolean updateComponentDetails(ComponentDetails cd, String state ) throws SQLException {
        try{
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "update stock set productcode = ? , unitcost = ?, unitprice = ?, quantity = ?, last_update = ? where productname = ?";
        pst = (PreparedStatement) con.prepareStatement(query);
        
        PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT quantity FROM stock where productname = ?");    
        statement.setString(1, cd.getProductName());    
        ResultSet rs = statement.executeQuery();
        rs.next();
        double newquantity = 0;
        switch(state){
            case "buy":
                newquantity = cd.getQuantity() + rs.getDouble("quantity");
                break;

            case "sell":
                newquantity = rs.getDouble("quantity") - cd.getQuantity();
                break;

        }
        pst.setString(1, cd.getQuickCode());
        pst.setDouble(2, cd.getUnitCost());
        pst.setDouble(3, cd.getUnitPrice());
        pst.setDouble(4, newquantity);
        pst.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
        pst.setString(6, cd.getProductName());

        pst.executeUpdate();
        System.out.println("update a Component");
        return true;
        } catch (Exception e) {
            System.out.println("error:" + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public boolean addcreditbuyer(int sellerid, double balance){
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO grocery(buyerid , balance , last_update) VALUES (?,?,?)";
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, sellerid);
            pst.setDouble(2, balance);
            pst.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            pst.execute();
            System.out.println("Add a buyer");
            return true;
        } catch (Exception e) {
            System.out.println("error:" + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public ArrayList<Integer> selectbuyer() throws SQLException{
        con = (Connection) DriverManager.getConnection(url, username, password);
        ArrayList<Integer> buyerlist = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT buyerid FROM grocery");
        while (rs.next()) {
            buyerlist.add(rs.getInt("buyerid"));
        }
        return buyerlist;
    }
    
    public boolean updatecreditbuyer(int sellerid, double balance) throws SQLException {
        try{
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "update grocery set balance = ?, last_update = ? where buyerid = ?";
        PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
        
        PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT balance FROM grocery where buyerid = ?");    
        statement.setInt(1, sellerid);    
        ResultSet rs = statement.executeQuery();
        rs.next();
        double newbalance = balance + rs.getDouble("balance");
             
        preparedStmt.setDouble(1,newbalance);
        preparedStmt.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
        preparedStmt.setInt(3, sellerid);

        preparedStmt.executeUpdate();
        System.out.println("update a buyer");
        return true;
        } catch (Exception e) {
            System.out.println("error:" + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    public String applyName(String code) throws SQLException{
        con = (Connection) DriverManager.getConnection(url, username, password);
        PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT productname FROM productcodes where code = ?");
        statement.setString(1, code);
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            return rs.getString("productname");
        }else{
            return "NAME NOT FOUND";
        }   
    }
    
    public ResultSet cloneStockData(ComponentDetails cdtl) throws SQLException{
        try{
        con = (Connection) DriverManager.getConnection(url, username, password);
        pst = (PreparedStatement) con.prepareStatement("SELECT * FROM stock where productname = ?");
        pst.setString(1, cdtl.getProductName());
        ResultSet rs = pst.executeQuery();
        return rs;
//        if (rs.next()){
//            return rs.getString("productname");
//        }else{
//            return "NAME NOT FOUND";
//        }
        } catch (Exception e) {
            System.out.println("error:" + e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
        
    }

    public int enterBuyersDeal(String suplier_name, double total, ArrayList<ComponentDetails> trancations, int bool) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO goodexpenses (buyer_id, total, trancation, status, date) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);

            PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT Reg_ID FROM regbuyers WHERE Buyer_Name = ?");    
            statement.setString(1, suplier_name);    
            ResultSet rs = statement.executeQuery();
            rs.next();
            int Reg_ID = rs.getInt("Reg_ID");

            Gson gsonBuilder = new GsonBuilder().create();
            String jsonFromJavaArrayList = gsonBuilder.toJson(trancations);
           
            preparedStmt.setInt(1, Reg_ID);
            preparedStmt.setDouble(2, total);
            preparedStmt.setString(3, jsonFromJavaArrayList);
            preparedStmt.setInt(4, bool);
            preparedStmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            preparedStmt.execute();
            System.out.println(jsonFromJavaArrayList);
            return Reg_ID;
        } catch (SQLException e) {
            System.out.println("error:" + e);
            return -1;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }        
        }
    }

    public int enterCustomersDeal(String customer_name, double total, ArrayList<ComponentDetails> trancations, int bool) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO goodincomes (customerid, total, trancation, status, date) VALUES (?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT Reg_ID FROM regborrowers WHERE Name = ?");    
            statement.setString(1, customer_name);    
            ResultSet rs = statement.executeQuery();
            rs.next();
            int Reg_ID = rs.getInt("Reg_ID");

            Gson gsonBuilder = new GsonBuilder().create();
            String jsonFromJavaArrayList = gsonBuilder.toJson(trancations);
           
            pst.setInt(1, Reg_ID);
            pst.setDouble(2, total);
            pst.setString(3, jsonFromJavaArrayList);
            pst.setInt(4, bool);
            pst.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            pst.execute();
            System.out.println(jsonFromJavaArrayList);
            return Reg_ID;
        } catch (SQLException e) {
            System.out.println("error:" + e);
            return -1;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }        }
    }
    
    
    
    public boolean journalized(double doubleValue, String state) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = null;
            switch(state){
            case "expense":
                query = "INSERT INTO journal(expense , date) VALUES (?,?)";
                break;

            case "income":
                query = "INSERT INTO journal(income , date) VALUES (?,?)";
                break;

            }
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            pst.setDouble(1, doubleValue);
            pst.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            pst.execute();
            System.out.println("Add a Component");
            return true;
        }catch (SQLException e) {
            System.out.println("error:" + e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }        }
    }
}
