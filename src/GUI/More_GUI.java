/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.AuthorBUS;
import BUS.CategoryBUS;
import BUS.PublisherBUS;
import BUS.RolePermissionBUS;
import BUS.SupplierBUS;
import BUS.SupplyCardBUS;
import DTO.entities.Account;
import MyDesign.ScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import DTO.entities.Author;
import DTO.entities.Category;
import DTO.entities.Publisher;
import DTO.entities.Supplier;
import DTO.entities.SupplyCard;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QUANG DIEN
 */
public class More_GUI extends javax.swing.JPanel {
    private Account user;
    private AuthorBUS authorBUS;
    private SupplyCardBUS supplyCardBUS;
    private CategoryBUS categoryBUS;
    private PublisherBUS publisherBUS;
    private SupplierBUS supplierBUS;
    private List<Category> listCategory;
    private List<Author> listAuthor;    
    private List<Publisher> listPublisher;
    private List<Supplier> listSupplier;

    DefaultTableModel authorsModel;    
    DefaultTableModel categoriesModel;
    DefaultTableModel publishersModel;
    DefaultTableModel suppliersModel;
    private RolePermissionBUS rolePermissionBUS;

    /**
     * Creates new form More_GUI
     */
    public More_GUI() throws SQLException, IOException, ClassNotFoundException {
        initComponents();
        styles();
        initTableAuthor();
        initTableCategory();
        initTablePublisher();
        initTableSupplier();
        
    }
    public More_GUI(Account user) throws SQLException, IOException, ClassNotFoundException {
        initComponents();
        this.user = user;
        this.rolePermissionBUS = new RolePermissionBUS();
        styles();
        initTableAuthor();
        initTableCategory();
        initTablePublisher();
        initTableSupplier();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new MyDesign.PanelBorder();
        jLabel5 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        tbTacGia = new MyDesign.MyTable();
        lbXoaTacGia = new javax.swing.JLabel();
        lbThemTacGia = new javax.swing.JLabel();
        panelBorder2 = new MyDesign.PanelBorder();
        jLabel6 = new javax.swing.JLabel();
        spTable1 = new javax.swing.JScrollPane();
        tbTheLoaiSach = new MyDesign.MyTable();
        lbXoaTheLoai = new javax.swing.JLabel();
        lbThemTheLoai = new javax.swing.JLabel();
        panelBorder3 = new MyDesign.PanelBorder();
        jLabel7 = new javax.swing.JLabel();
        spTable2 = new javax.swing.JScrollPane();
        tbNhaXuatBan = new MyDesign.MyTable();
        lbXoaNXB = new javax.swing.JLabel();
        lbThemNXB = new javax.swing.JLabel();
        panelBorder4 = new MyDesign.PanelBorder();
        jLabel8 = new javax.swing.JLabel();
        spTable3 = new javax.swing.JScrollPane();
        tbNhaCungCap = new MyDesign.MyTable();
        lbThemNCC = new javax.swing.JLabel();
        lbXoaNCC = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(127, 127, 127));
        jLabel5.setText("Tác giả");

        spTable.setBorder(null);

        tbTacGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên tác giả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(tbTacGia);

        lbXoaTacGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoaTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/action-delete.png"))); // NOI18N
        lbXoaTacGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        lbXoaTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXoaTacGiaMouseClicked(evt);
            }
        });

        lbThemTacGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemTacGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        lbThemTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemTacGiaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbXoaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbThemTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lbXoaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbThemTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(127, 127, 127));
        jLabel6.setText("Thể loại sách");

        spTable1.setBorder(null);

        tbTheLoaiSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Thể loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable1.setViewportView(tbTheLoaiSach);

        lbXoaTheLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoaTheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/action-delete.png"))); // NOI18N
        lbXoaTheLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        lbXoaTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXoaTheLoaiMouseClicked(evt);
            }
        });

        lbThemTheLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemTheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemTheLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        lbThemTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemTheLoaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(lbXoaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbThemTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(lbXoaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbThemTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(127, 127, 127));
        jLabel7.setText("Nhà xuất bản");

        spTable2.setBorder(null);

        tbNhaXuatBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Nhà xuất bản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable2.setViewportView(tbNhaXuatBan);

        lbXoaNXB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoaNXB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/action-delete.png"))); // NOI18N
        lbXoaNXB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        lbXoaNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXoaNXBMouseClicked(evt);
            }
        });

        lbThemNXB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemNXB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemNXB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        lbThemNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemNXBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbXoaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbThemNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(lbXoaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbThemNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(127, 127, 127));
        jLabel8.setText("Nhà cung cấp");

        spTable3.setBorder(null);

        tbNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Nhà cung cấp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable3.setViewportView(tbNhaCungCap);

        lbThemNCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemNCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        lbThemNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemNCCMouseClicked(evt);
            }
        });

        lbXoaNCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoaNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/action-delete.png"))); // NOI18N
        lbXoaNCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        lbXoaNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXoaNCCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder4Layout = new javax.swing.GroupLayout(panelBorder4);
        panelBorder4.setLayout(panelBorder4Layout);
        panelBorder4Layout.setHorizontalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelBorder4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(lbXoaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbThemNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder4Layout.setVerticalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(lbXoaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbThemNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
//    Group add
    private void lbThemTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemTacGiaMouseClicked
       if(evt.getClickCount()==1 || evt.getClickCount()==2)
        {
            setVisible(false);
            WareHouseAddNewReader_Dialog r;
           try { 
               r = new WareHouseAddNewReader_Dialog(null,"more_gui", true);
               r.setVisible(true);
           } catch (SQLException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_lbThemTacGiaMouseClicked

    private void lbThemTheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemTheLoaiMouseClicked
        if(evt.getClickCount()==1 || evt.getClickCount()==2)
        {
            setVisible(false);
            WareHouseAddNewTypeBook_Dialog r;
           try { 
               r = new WareHouseAddNewTypeBook_Dialog(null,"more_gui", true);
               r.setVisible(true);
           } catch (SQLException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_lbThemTheLoaiMouseClicked

    private void lbThemNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemNCCMouseClicked
        if(evt.getClickCount()==1 || evt.getClickCount()==2)
        {
            setVisible(false);
            WareHouseAddNCC_Dialog r;
           try { 
               r = new WareHouseAddNCC_Dialog(null,"more_gui","add", true);
               r.setVisible(true);
           } catch (SQLException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_lbThemNCCMouseClicked

    private void lbThemNXBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemNXBMouseClicked
        if(evt.getClickCount()==1 || evt.getClickCount()==2)
        {
            setVisible(false);
            WareHouseAddNXB_Dialog r;
           try { 
               r = new WareHouseAddNXB_Dialog(null,"more_gui","add  ", true);
               r.setVisible(true);
           } catch (SQLException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_lbThemNXBMouseClicked

//    Group detele
    private void lbXoaTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXoaTacGiaMouseClicked
        if(evt.getClickCount()==1 || evt.getClickCount()==2){
            int selectedRow = tbTacGia.getSelectedRow();
            if (selectedRow != -1) {
                String tacGia = tbTacGia.getValueAt(selectedRow, 1).toString();
                int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa tác giả " + tacGia + "?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    try {
                        authorBUS = new AuthorBUS();
                        boolean check = authorBUS.deteleByAuthorName(tacGia);
                        if(check == true){
                            JOptionPane.showMessageDialog(panelBorder1, "Đã xóa thành công", "Xác nhận xóa", HEIGHT);
                            DefaultTableModel model = (DefaultTableModel) tbTacGia.getModel();
                            model.setRowCount(0);
                            initTableAuthor();
                        }
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_lbXoaTacGiaMouseClicked

    private void lbXoaTheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXoaTheLoaiMouseClicked
        if(evt.getClickCount()==1 || evt.getClickCount()==2){
            int selectedRow = tbTheLoaiSach.getSelectedRow();
            if (selectedRow != -1) {
                String theloai = tbTheLoaiSach.getValueAt(selectedRow, 1).toString();
                int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa thể loại " + theloai + "?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    try {
                        categoryBUS = new CategoryBUS();
                        boolean check;
                        try {
                            check = categoryBUS.deleteByCategoryName(theloai);
                            if(check == true){
                                JOptionPane.showMessageDialog(panelBorder1, "Đã xóa thành công", "Xác nhận xóa", HEIGHT);
                                DefaultTableModel model = (DefaultTableModel) tbTheLoaiSach.getModel();
                                model.setRowCount(0);
                                initTableCategory();
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_lbXoaTheLoaiMouseClicked

    private void lbXoaNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXoaNCCMouseClicked
        if(evt.getClickCount()==1 || evt.getClickCount()==2){
            int selectedRow = tbNhaCungCap.getSelectedRow();
            if (selectedRow != -1) {
                String supplier = tbNhaCungCap.getValueAt(selectedRow, 1).toString();
                int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa thể loại " + supplier + "?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    try {
                        supplierBUS = new SupplierBUS();
                        boolean check;
                        check = supplierBUS.deteleBySupplierName(supplier);
                        if(check == true){
                            JOptionPane.showMessageDialog(panelBorder1, "Đã xóa thành công", "Xác nhận xóa", HEIGHT);
                            DefaultTableModel model = (DefaultTableModel) tbTheLoaiSach.getModel();
                            model.setRowCount(0);
                            initTableCategory();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_lbXoaNCCMouseClicked

    private void lbXoaNXBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXoaNXBMouseClicked
       if(evt.getClickCount()==1 || evt.getClickCount()==2){
            int selectedRow = tbNhaXuatBan.getSelectedRow();
            if (selectedRow != -1) {
                String nhaxuatban = tbNhaXuatBan.getValueAt(selectedRow, 1).toString();
                int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhà xuất bản " + nhaxuatban + "?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    try {
                        publisherBUS = new PublisherBUS();
                        boolean check;
                        check = publisherBUS.deleteByPublisherName(nhaxuatban);
                        if(check == true){
                            JOptionPane.showMessageDialog(panelBorder1, "Đã xóa thành công", "Xác nhận xóa", HEIGHT);
                            DefaultTableModel model = (DefaultTableModel) tbNhaXuatBan.getModel();
                            model.setRowCount(0);
                            initTablePublisher();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(More_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_lbXoaNXBMouseClicked
    public void initTableAuthor() throws SQLException, IOException{
        authorBUS = new AuthorBUS();
        listAuthor = authorBUS.getAllName();
        authorsModel = (DefaultTableModel) tbTacGia.getModel();
        String authorName;
        int stt = 1;
        for (Author author : listAuthor){
            if(author.isStatus() == 1){
                authorName = author.getName();
                authorsModel.addRow(new Object[]{stt++,authorName});
            }
            
        }
    }
    public void initTableCategory() throws SQLException, IOException{
        categoryBUS = new CategoryBUS();
        listCategory = categoryBUS.getAll();
        categoriesModel = (DefaultTableModel) tbTheLoaiSach.getModel();
        String categoryName;
        int stt = 1;
        for(Category category : listCategory){
            if(category.isStatus() == 1){
                categoryName = category.getName();
                categoriesModel.addRow(new Object[]{stt++,categoryName});
            }
            
        }
               
    
    }
    public void initTablePublisher() throws SQLException, IOException{
        publisherBUS = new PublisherBUS();
        listPublisher = publisherBUS.getAllName();
        publishersModel = (DefaultTableModel) tbNhaXuatBan.getModel();
        String publisherName;
        int stt = 1;
        for(Publisher publisher : listPublisher){
            if(publisher.isStatus() == 1){
                publisherName = publisher.getName();
                publishersModel.addRow(new Object[]{stt++, publisherName});
            }
            
        }
    
    }
    public void initTableSupplier() throws SQLException, IOException, ClassNotFoundException{
        supplierBUS = new SupplierBUS();
        listSupplier = supplierBUS.getAllName();
        suppliersModel = (DefaultTableModel) tbNhaCungCap.getModel();
        String supplierName;
        int stt = 1;
        for(Supplier supplier : listSupplier){
            if(supplier.getSupplier_status() == 1){
                supplierName = supplier.getSupplier_name();
                suppliersModel.addRow(new Object[]{stt++,supplierName});
            }
        }
    }
    
    
    public void styles(){
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        spTable1.setVerticalScrollBar(new ScrollBar());
        spTable1.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable1.getViewport().setBackground(Color.WHITE);
        p.setBackground(Color.WHITE);
        spTable1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        spTable2.setVerticalScrollBar(new ScrollBar());
        spTable2.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable2.getViewport().setBackground(Color.WHITE);
        p.setBackground(Color.WHITE);
        spTable2.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        spTable3.setVerticalScrollBar(new ScrollBar());
        spTable3.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable3.getViewport().setBackground(Color.WHITE);
        p.setBackground(Color.WHITE);
        spTable3.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        if(rolePermissionBUS.hasPerCreate(this.user.getRoleID(), 8)){
            lbThemNCC.setEnabled(true);
            lbThemNXB.setEnabled(true);
            lbThemTacGia.setEnabled(true);
            lbThemTheLoai.setEnabled(true);
        }
        else{
            lbThemNCC.setEnabled(false);
            lbThemNXB.setEnabled(false);
            lbThemTacGia.setEnabled(false);
            lbThemTheLoai.setEnabled(false);
        }
        if(rolePermissionBUS.hasPerDelete(this.user.getRoleID(), 8)){
            lbXoaNCC.setEnabled(true);
            lbXoaNXB.setEnabled(true);
            lbXoaTacGia.setEnabled(true);
            lbXoaTheLoai.setEnabled(true);
        }
        else{
            lbXoaNCC.setEnabled(false);
            lbXoaNXB.setEnabled(false);
            lbXoaTacGia.setEnabled(false);
            lbXoaTheLoai.setEnabled(false);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbThemNCC;
    private javax.swing.JLabel lbThemNXB;
    private javax.swing.JLabel lbThemTacGia;
    private javax.swing.JLabel lbThemTheLoai;
    private javax.swing.JLabel lbXoaNCC;
    private javax.swing.JLabel lbXoaNXB;
    private javax.swing.JLabel lbXoaTacGia;
    private javax.swing.JLabel lbXoaTheLoai;
    private MyDesign.PanelBorder panelBorder1;
    private MyDesign.PanelBorder panelBorder2;
    private MyDesign.PanelBorder panelBorder3;
    private MyDesign.PanelBorder panelBorder4;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JScrollPane spTable1;
    private javax.swing.JScrollPane spTable2;
    private javax.swing.JScrollPane spTable3;
    private MyDesign.MyTable tbNhaCungCap;
    private MyDesign.MyTable tbNhaXuatBan;
    MyDesign.MyTable tbTacGia;
    private MyDesign.MyTable tbTheLoaiSach;
    // End of variables declaration//GEN-END:variables
}
