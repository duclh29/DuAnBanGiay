/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duanbangiay.service;

import duanbangiay.domainmodel.SanPham;
import java.util.ArrayList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface SanPhamService {

    ArrayList<SanPham> getAll();

    String add(SanPham sanPham);

    String delete(String id);

    String update(String id, SanPham sanPham);

    ArrayList<SanPham> find(String ten);
}
