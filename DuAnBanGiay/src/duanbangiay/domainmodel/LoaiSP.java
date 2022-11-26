/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package duanbangiay.domainmodel;

import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LoaiSP {
private String id;
private String ma;
private String ten;
private int trangThai;
private Date ngayTao;
private Date ngaySua;

    public LoaiSP() {
    }

    public LoaiSP(String id, String ma, String ten, int trangThai, Date ngayTao, Date ngaySua) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }
public String chuyenTrangthai(){
    if (trangThai==1) {
        return "Đẹp";
    }else{
        return "OK";
    }
}











}
