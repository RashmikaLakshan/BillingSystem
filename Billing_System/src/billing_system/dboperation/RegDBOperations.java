package billing_system.dboperation;

import billing_system.models.RegDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegDBOperations {

    String url = "jdbc:mysql://localhost:3306/test";
    String username = "root";
    String password = null;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int count = 0;
    int count1 = 0;
    int count2 = 0;

    // START OF BORROWER OPERATIONS-----------------------------------------------------------------------------------------------------------
    public int addRegDetails(RegDetails rd) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO regborrowers VALUES (?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, rd.getRegID());
            pst.setString(2, rd.getBorrowerCode());
            pst.setString(3, rd.getName());
            pst.setInt(4, rd.getNIC_Number());
            pst.setString(5, rd.getGender());
            pst.setInt(6, rd.getTP_Mobile());
            pst.setInt(7, rd.getTP_Land());
            pst.setString(8, rd.getAdderess());
            pst.executeUpdate();

            return 1;

        } catch (Exception e) {
            System.out.println("error:" + e);

            return 2;

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

    public void SetUpdateTxtFieldsOfBorrowers(String Name, RegDetails rd) {
        try {
            if (Name.equals("")) {

                //return 2;
            } else {
                con = (Connection) DriverManager.getConnection(url, username, password);
                String query = "SELECT * FROM regborrowers WHERE Name = ?";

                pst = (PreparedStatement) con.prepareStatement(query);
                pst.setString(1, Name);
                rs = pst.executeQuery();
                rs.next();

                rd.setBorrowerCode(rs.getString("Borrower_Code"));
                rd.setName(rs.getString("Name"));
                rd.setNIC_Number(Integer.parseInt(rs.getString("NIC_Number")));
                rd.setGender(rs.getString("Gender"));
                rd.setTP_Mobile(Integer.parseInt(rs.getString("TP_Mobile")));
                rd.setTP_Land(Integer.parseInt(rs.getString("TP_Land")));
                rd.setAdderess(rs.getString("Adderess"));

                //return 0;
            }

        } catch (SQLException e) {
            System.out.println("error:" + e);
            //return 1;

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

    public int UpdateBorrowerDetails(RegDetails rd, String name) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "update regborrowers set Borrower_code = ?, NIC_Number = ?, Gender = ?, TP_Mobile = ?, TP_Land = ?, Adderess = ? ,Name = ? where Reg_ID = ?";
            pst = (PreparedStatement) con.prepareStatement(query);

            PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT Reg_ID FROM regborrowers where Name = ?");
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            rs.next();
            int rid = rs.getInt("Reg_ID");
            //System.out.println(rid);

            //pst.setInt(1, rd.getRegID());
            pst.setString(1, rd.getBorrowerCode());
            pst.setInt(2, rd.getNIC_Number());
            pst.setString(3, rd.getGender());
            pst.setInt(4, rd.getTP_Mobile());
            pst.setInt(5, rd.getTP_Land());
            pst.setString(6, rd.getAdderess());
            pst.setString(7, rd.getName());
            pst.setInt(8, rid);
            pst.executeUpdate();
            //System.out.println("update RegDetails");

            return 1;
        } catch (SQLException e) {
            System.out.println("error:" + e);

            return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

            }

        }
    }

    public ArrayList<RegDetails> getBorrowers() {

        try {
            ArrayList<RegDetails> list = new ArrayList<RegDetails>();
            count = 0;

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "Select Borrower_Code,Name,NIC_Number,Gender,TP_Mobile,TP_Land,Adderess FROM regborrowers";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                RegDetails rd = new RegDetails();

                rd.setBorrowerCode(rs.getString(1));
                rd.setName(rs.getString(2));
                rd.setNIC_Number(rs.getInt(3));
                rd.setGender(rs.getString(4));
                rd.setTP_Mobile(rs.getInt(5));
                rd.setTP_Land(rs.getInt(6));
                rd.setAdderess(rs.getString(7));

                list.add(rd);
                count++;
            }
            //System.out.println(count);
            return list;

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

    public String getQuentityOfBorrowerList() {
        String str = count + "";
        return str;
    }

    public void DeleteBorrower(RegDetails rd) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM regborrowers where Name ='" + rd.getName() + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("error:" + e);
            //return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

            }

        }
    }

    // START OF BUYER OPERATIONS-----------------------------------------------------------------------------------------------------------
    public int addBuyerRegDetails(RegDetails rd) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO regbuyers VALUES (?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, rd.getRegID());
            pst.setString(2, rd.getBuyerCode());
            pst.setString(3, rd.getName());

            String SettlingTime = rd.getSettelingTime() + "  " + rd.getTimeUnit();

            pst.setString(4, SettlingTime);
            pst.setString(5, rd.getType());
            pst.setInt(6, rd.getTP_Mobile());
            pst.setInt(7, rd.getTP_Land());
            pst.setString(8, rd.getAdderess());
            pst.executeUpdate();

            return 1;

        } catch (Exception e) {
            System.out.println("error:" + e);

            return 2;

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

    public ArrayList<RegDetails> getBuyers() {

        try {
            ArrayList<RegDetails> list = new ArrayList<RegDetails>();
            count1 = 0;

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "Select Buyer_Code,Buyer_Name,Settling_Time,Type,TP_Mobile,TP_MobileFixed,AdderessEmail FROM regbuyers";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                RegDetails rd = new RegDetails();

                rd.setBuyerCode(rs.getString(1));
                rd.setName(rs.getString(2));
                rd.setSettleTime(rs.getString(3));
                rd.setType(rs.getString(4));
                rd.setTP_Mobile(rs.getInt(5));
                rd.setTP_Land(rs.getInt(6));
                rd.setAdderess(rs.getString(7));

                list.add(rd);
                count1++;
            }
            //System.out.println(count);
            return list;

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

    public String getQuentityOfBuyerList() {
        String str = count1 + "";
        return str;
    }

    public int UpdateBuyerDetails(RegDetails rd, String name) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "update regbuyers set Buyer_code = ?, Settling_Time = ?, Type = ?, TP_Mobile = ?, TP_MobileFixed = ?, AdderessEmail = ? ,Buyer_Name = ? where Reg_ID = ?";
            pst = (PreparedStatement) con.prepareStatement(query);

            PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT Reg_ID FROM regbuyers where Buyer_Name = ?");
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            rs.next();
            int rid = rs.getInt("Reg_ID");
            //System.out.println(rid);

            //pst.setInt(1, rd.getRegID());
            pst.setString(1, rd.getBuyerCode());

            String SettlingTime = rd.getSettelingTime() + "  " + rd.getTimeUnit();

            pst.setString(2, SettlingTime);
            pst.setString(3, rd.getType());
            pst.setInt(4, rd.getTP_Mobile());
            pst.setInt(5, rd.getTP_Land());
            pst.setString(6, rd.getAdderess());
            pst.setString(7, rd.getName());
            pst.setInt(8, rid);
            pst.executeUpdate();
            //System.out.println("update RegDetails");

            return 1;
        } catch (SQLException e) {
            System.out.println("error:" + e);

            return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

            }

        }
    }

    public void SetUpdateTxtFieldsOfBuyers(String Name, RegDetails rd) {
        try {
            if (Name.equals("")) {

                //return 2;
            } else {
                con = (Connection) DriverManager.getConnection(url, username, password);
                String query = "SELECT * FROM regbuyers WHERE Buyer_Name = ?";

                pst = (PreparedStatement) con.prepareStatement(query);
                pst.setString(1, Name);
                rs = pst.executeQuery();
                rs.next();

                rd.setBuyerCode(rs.getString("Buyer_Code"));
                rd.setName(rs.getString("Buyer_Name"));
                rd.setSettleTime(rs.getString("Settling_Time"));
                rd.setType(rs.getString("Type"));
                rd.setTP_Mobile(Integer.parseInt(rs.getString("TP_Mobile")));
                rd.setTP_Land(Integer.parseInt(rs.getString("TP_MobileFixed")));
                rd.setAdderess(rs.getString("AdderessEmail"));

                //return 0;
            }

        } catch (SQLException e) {
            System.out.println("error:" + e);
            //return 1;

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

    public void DeleteBuyer(RegDetails rd) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM regbuyers where Buyer_Name ='" + rd.getName() + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("error:" + e);
            //return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

            }

        }
    }

    // START OF ITEM OPERATIONS-----------------------------------------------------------------------------------------------------------
    public int addItemRegDetails(RegDetails rd) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO regItems VALUES (?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, rd.getRegID());
            pst.setString(2, rd.getProductCode());
            pst.setString(3, rd.getName());
            pst.setString(4, rd.getCategory());
            pst.setString(5, rd.getDefaultUnit());
            pst.setInt(6, rd.getUnitPrice());
            pst.setInt(7, rd.getPurchingPrice());
            pst.setInt(8, rd.getWarningRate());
            pst.executeUpdate();

            return 1;

        } catch (Exception e) {
            System.out.println("error:" + e);

            return 2;

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

    public ArrayList<RegDetails> getItems() {

        try {
            ArrayList<RegDetails> list = new ArrayList<RegDetails>();
            count2 = 0;

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "Select Product_Code,Product_Name,Category,Default_Unit,Unit_Price,Purching_Price,Warning_Rate FROM regitems";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                RegDetails rd = new RegDetails();

                rd.setProductCode(rs.getString(1));
                rd.setName(rs.getString(2));
                rd.setCategory(rs.getString(3));
                rd.setDefaultUnit(rs.getString(4));
                rd.setUnitPrice(rs.getInt(5));
                rd.setPurchingPrice(rs.getInt(6));
                rd.setWarningRate(rs.getInt(7));

                list.add(rd);
                count2++;
            }
            //System.out.println(count);
            return list;

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

    public String getQuentityOfItemList() {
        String str = count2 + "";
        return str;
    }

    public int UpdateItemDetails(RegDetails rd, String name) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "update regitems set Product_code = ?, Category = ?, Defaulu_Unit = ?,Unit_Price = ?, Purching_Price = ?, Warning_Rate = ? ,Product_Name = ? where Reg_ID = ?";
            pst = (PreparedStatement) con.prepareStatement(query);

            PreparedStatement statement = (PreparedStatement) con.prepareStatement("SELECT Reg_ID FROM regitems where Product_Name = ?");
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            rs.next();
            int rid = rs.getInt("Reg_ID");
            //System.out.println(rid);

            //pst.setInt(1, rd.getRegID());
            pst.setString(1, rd.getProductCode());
            pst.setString(2, rd.getCategory());
            pst.setString(3, rd.getDefaultUnit());
            pst.setInt(4, rd.getUnitPrice());
            pst.setInt(5, rd.getPurchingPrice());
            pst.setInt(6, rd.getWarningRate());
            pst.setString(7, rd.getName());
            pst.setInt(8,rid);
            pst.executeUpdate();
            //System.out.println("update RegDetails");

            return 1;
        } catch (SQLException e) {
            System.out.println("error:" + e);

            return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

            }

        }
    }

    public void SetUpdateTxtFieldsOfItems(String Name, RegDetails rd) {
        try {
            if (Name.equals("")) {

                //return 2;
            } else {
                con = (Connection) DriverManager.getConnection(url, username, password);
                String query = "SELECT * FROM regItems WHERE Product_Name = ?";

                pst = (PreparedStatement) con.prepareStatement(query);
                pst.setString(1, Name);
                rs = pst.executeQuery();
                rs.next();

                rd.setProductCode(rs.getString("Product_Code"));
                rd.setName(rs.getString("Product_Name"));
                rd.setCategory(rs.getString("Category"));
                rd.setDefaultUnit(rs.getString("Default_Unit"));
                rd.setUnitPrice(rs.getInt("Unit_Price"));
                rd.setPurchingPrice(rs.getInt("Purching_Price"));
                rd.setWarningRate(rs.getInt("Warning_Rate"));

                //return 0;
            }

        } catch (SQLException e) {
            System.out.println("error:" + e);
            //return 1;

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

    public void DeleteItems(RegDetails rd) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM regitems where Product_Name ='" + rd.getName() + "'";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("error:" + e);
            //return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {

            }

        }
    }

    //Others----------------------------------------------------------------------------------------------------------------------
    
    public ArrayList<RegDetails> ProductNameSearch(String st) {
        
        try {
            ArrayList<RegDetails> list = new ArrayList<RegDetails>();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String query = "Select Product_Code,Product_Name,Unit_Price from regitems where Product_Name like '" + st + "%'";
            pst = (PreparedStatement) con.prepareStatement(query);
            rs = pst.executeQuery();


            while (rs.next()) {
                
                RegDetails rd = new RegDetails();
                rd.setProductCode(rs.getString(1));
                rd.setName(rs.getString(2));
                rd.setUnitPrice(rs.getInt(3));

                list.add(rd);
            }
            
            /*String query2 = "Select Product_Code,Product_Name,Unit_Price from regitems where Product_Code like '" + st + "%'";
            pst = (PreparedStatement) con.prepareStatement(query2);
            rs = pst.executeQuery();

            while (rs.next()) {
                for (RegDetails r : list) {
                    if (r.getName().equals(rs.getString(2))) {
                        RegDetails rds = new RegDetails();
                        rds.setProductCode(rs.getString(1));
                        rds.setName(rs.getString(2));
                        rds.setUnitPrice(rs.getInt(3));

                        list.add(rds);
                    }
                }
            }*/
            //System.out.println(count);
            return list;

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
}
