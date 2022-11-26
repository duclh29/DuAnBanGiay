/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanbangiay.service.impl;

import duanbangiay.domainmodel.SanPham;
import duanbangiay.repostority.SanPhamRepostority;
import duanbangiay.service.SanPhamService;
import java.util.ArrayList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepostority sanPhamRepostority = new SanPhamRepostority();

    @Override
    public ArrayList<SanPham> getAll() {
        return sanPhamRepostority.getAll();
    }

    @Override
    public String add(SanPham sanPham) {
        boolean addSP = sanPhamRepostority.add(sanPham);
        if (addSP) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String delete(String id) {
        boolean xoaSP = sanPhamRepostority.delete(id);
        if (xoaSP) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

    @Override
    public String update(String id, SanPham sanPham) {
        boolean update = sanPhamRepostority.update(id, sanPham);
        if (update) {
            return "Cập nhật thành công";
        }
        return "Cập nhật thất bại";
    }

    @Override
    public ArrayList<SanPham> find(String ten) {
        return sanPhamRepostority.find(ten);
    }

}
