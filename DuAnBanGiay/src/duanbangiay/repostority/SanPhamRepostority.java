/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duanbangiay.repostority;

import duanbangiay.Untilities.Dbconnection;
import duanbangiay.domainmodel.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SanPhamRepostority {

    /**
     * @param args the command line arguments
     */
    public ArrayList<SanPham> getAll() {
        String sql = " select Id,Ma,Ten,NgayTao,NgaySua,TrangThai from SanPham";
        try ( Connection con = Dbconnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            ArrayList<SanPham> listQLSanPham = new ArrayList<>();
            while (rs.next()) {
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getString(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getString(3));
                sanPham.setNgayTao(rs.getDate(4));
                sanPham.setNgaySua(rs.getDate(5));
                sanPham.setTrangThai(rs.getInt(6));
                listQLSanPham.add(sanPham);
            }
            return listQLSanPham;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return null;
    }

    public boolean add(SanPham sanPham) {
        String query = "insert into SanPham(Ma,Ten,NgayTao,NgaySua,TrangThai) values (?,?)";
        try ( Connection con = Dbconnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sanPham.getMa());
            ps.setObject(2, sanPham.getTen());

            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.getMessage();
            ex.printStackTrace(System.out);
            return false;
        }
    }

    public boolean delete(String id) {
        String query = "delete SanPham where Id =?";
        try ( Connection con = Dbconnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.getMessage();
            return false;
        }
    }

    public boolean update(String id, SanPham sanPham) {
        String query = "update  SanPham set Ma=?, Ten=?, NgayTao=?, NgaySua=?, TrangThai=? where Id=? ";
        try ( Connection con = Dbconnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sanPham.getMa());
            ps.setObject(2, sanPham.getTen());
            ps.setObject(3, sanPham.getNgayTao());
            ps.setObject(4, sanPham.getNgaySua());
            ps.setObject(5, sanPham.getTrangThai());
            ps.setObject(6, id);
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public ArrayList<SanPham> find(String ten) {
        String sql = " Select  * From SanPham where Ten LIKE '%" + ten + "%'";
        ArrayList<SanPham> listQLSanPham = new ArrayList<>();
        try ( Connection con = Dbconnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanPham = new SanPham();
                sanPham.setId(rs.getString(1));
                sanPham.setMa(rs.getString(2));
                sanPham.setTen(rs.getString(3));
                sanPham.setTrangThai(rs.getInt(4));
                sanPham.setNgayTao(rs.getDate(5));
                sanPham.setNgaySua(rs.getDate(6));
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace(System.out);
        }
        return listQLSanPham;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> list = new SanPhamRepostority().getAll();
        for (SanPham sanPham : list) {
            System.out.println(sanPham.toString());
        }
    }

}
