
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.JTextField;



public class KisiFormu extends javax.swing.JFrame {

    public KisiFormu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        Zemin1 = new javax.swing.JPanel();
        lblTcNo = new javax.swing.JLabel();
        tfTcNo = new JNumberTextField();
        lblAdSoyad = new javax.swing.JLabel();
        tfAdSoyad = new JHarfTextField();
        lblMedeniDurum = new javax.swing.JLabel();
        cmbMedeniDurum = new javax.swing.JComboBox<>();
        tfIban = new javax.swing.JTextField();
        lblIban = new javax.swing.JLabel();
        lblUnvan = new javax.swing.JLabel();
        cmbUnvan = new javax.swing.JComboBox<>();
        cmbBes = new javax.swing.JComboBox<>();
        lblBes = new javax.swing.JLabel();
        cmbCocukSayisi = new javax.swing.JComboBox<>();
        lblCocukSayisi = new javax.swing.JLabel();
        lblSendika = new javax.swing.JLabel();
        cmbSendika = new javax.swing.JComboBox<>();
        btnKaydet = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTcNo.setText("T.C. Kimlik No");

        lblAdSoyad.setText("Adı Soyadı");

        lblMedeniDurum.setText("Medeni Durumu");

        cmbMedeniDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekar", "Evli" }));

        lblIban.setText("IBAN Numarası");

        lblUnvan.setText("Ünvanı");

        cmbUnvan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sürekli İşçi" }));

        cmbBes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "false", "true" }));

        lblBes.setText("BES (Zorunlu Bireysel Emeklilik)");

        cmbCocukSayisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        lblCocukSayisi.setText("Çocuk Sayısı");

        lblSendika.setText("Sendika Kaydı");

        cmbSendika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "false", "true" }));

        btnKaydet.setText("Veritabanına Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnTemizle.setText("Formu Temizle");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Zemin1Layout = new javax.swing.GroupLayout(Zemin1);
        Zemin1.setLayout(Zemin1Layout);
        Zemin1Layout.setHorizontalGroup(
            Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Zemin1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTcNo)
                    .addComponent(lblAdSoyad)
                    .addComponent(lblMedeniDurum)
                    .addComponent(lblIban)
                    .addComponent(lblUnvan)
                    .addComponent(lblBes)
                    .addComponent(lblCocukSayisi)
                    .addComponent(lblSendika))
                .addGap(25, 25, 25)
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbSendika, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCocukSayisi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbMedeniDurum, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfAdSoyad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Zemin1Layout.createSequentialGroup()
                        .addComponent(tfTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbUnvan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfIban, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTemizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(129, 129, 129))
        );
        Zemin1Layout.setVerticalGroup(
            Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Zemin1Layout.createSequentialGroup()
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Zemin1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTcNo)
                            .addComponent(tfTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdSoyad)
                            .addComponent(tfAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Zemin1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnvan)
                    .addComponent(cmbUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedeniDurum)
                    .addComponent(cmbMedeniDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCocukSayisi)
                    .addComponent(cmbCocukSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBes)
                    .addComponent(cmbBes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSendika)
                    .addComponent(cmbSendika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Zemin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIban)
                    .addComponent(tfIban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tab.addTab("Kişi Kayıt Ekranı", Zemin1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class JNumberTextField extends JTextField {
       //private static final long serialVersionUID = 1L;

        @Override
        protected void processKeyEvent(KeyEvent e) {
            if (Character.isDigit(e.getKeyChar()) || (Character.isIdentifierIgnorable(e.getKeyChar()))) /*e.getKeyChar()==KeyEvent.VK_BACK_SPACE || e.getKeyChar()==KeyEvent.VK_LEFT)*/ {
                super.processKeyEvent(e); //To change body of generated methods, choose Tools | Templates.
            }
            
            if (getText().length()>11) {
                JOptionPane.showMessageDialog(this, "Bu alan 11'den büyük olamaz!");
                setText(getText().substring(0,getText().length()-1));
            }
            e.consume();
            return; 
        }
    }
    
    public class JHarfTextField extends JTextField {

        @Override
        protected void processKeyEvent(KeyEvent e) {      
            if (!Character.isDigit(e.getKeyChar())) {
                super.processKeyEvent(e); //To change body of generated methods, choose Tools | Templates.
            } 
            e.consume();
            return;             
        }
    }

    public boolean Kontrol(){
        if (!tfAdSoyad.getText().equals("") && !tfTcNo.getText().equals("") && !tfIban.getText().equals("")) {
            return true;
        } else return false; 
    }
    
    public void Sifirla() {
        tfAdSoyad.setText("");
        tfTcNo.setText("");
        tfIban.setText("");
        tfTcNo.requestFocus();
    }
    
    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
    
        boolean kontrol = Kontrol();
        if (kontrol) {
            Connection c = null;
            Statement stmt = null;
            

        try {
            //Kisi kisi1=new Hesaplamalar(TCNO, adSoyad, medeniDurum, IBAN, unvani, kontrol, kontrol, SOMEBITS)
            boolean sendika = Boolean.valueOf(cmbSendika.getSelectedItem().toString());
            boolean bes = Boolean.valueOf(cmbBes.getSelectedItem().toString());
            //tanımlamalar
            Kisi kisi = new Kisi(tfTcNo.getText(),tfAdSoyad.getText(), cmbMedeniDurum.getSelectedItem().toString(), tfIban.getText(), cmbUnvan.getSelectedItem().toString(), bes, sendika, Integer.valueOf(cmbCocukSayisi.getSelectedItem().toString()) );
            Gun gun = new Gun(21, 21, 9, 30);
            AylikSosyalYardimlar asy = new AylikSosyalYardimlar();
            YillikSosyalYardimlar ysy = new YillikSosyalYardimlar();
            OlayaBagliYardimlar oby = new OlayaBagliYardimlar();
            AGI agi = new AGI();
            Hesaplamalar hesap = new Hesaplamalar(tfTcNo.getText(),tfAdSoyad.getText(), cmbMedeniDurum.getSelectedItem().toString(), tfIban.getText(), cmbUnvan.getSelectedItem().toString(), bes, sendika, Integer.valueOf(cmbCocukSayisi.getSelectedItem().toString()));
            // tanımlama sonu
            
            //setlemeler
            asy.setCocukYardimi(kisi);
            asy.setYakacakYardimi(30);
            asy.setYemekYardimi(gun);
                
            hesap.setBrutUcret(4);
            hesap.setGunlukUcret(gun);
            hesap.SGK_Matrahi(asy);
            hesap.gelirVergisi(15, AGILER.EVLI_ESI_CALISAN_2_COCUKLU);
            
            System.out.println("SGK %1 : " + hesap.sgk1());
            System.out.println("SGK %2 : " + hesap.sgk2());
            
            System.out.println("Hakediş Toplamı : "+hesap.hakedisToplami(asy, ysy));
            System.out.println("Hakediş Toplamı : " +hesap.netOdenen(asy, ysy));
                    

            
            /*
            
            
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:db\\db.db";
            c = DriverManager.getConnection(url);
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String sql = "Insert into KisiBilgileri (adsoyad, tcNo, unvan, medeniDurum, cocukSayisi, bes, sendika, IBAN) values (?,?,?,?,?,?,?,?)";
            PreparedStatement psmt=c.prepareStatement(sql);            
            psmt.setString(1, tfAdSoyad.getText());
            psmt.setString(2, tfTcNo.getText());
            psmt.setString(3, cmbUnvan.getSelectedItem().toString());
            psmt.setString(4, cmbMedeniDurum.getSelectedItem().toString());
            psmt.setString(5,cmbCocukSayisi.getSelectedItem().toString());
            psmt.setString(6, cmbBes.getSelectedItem().toString());
            psmt.setString(7, cmbSendika.getSelectedItem().toString());
            psmt.setString(8, tfIban.getText());
            psmt.executeUpdate();
            stmt.close();
            c.commit();
            c.close();*/
        } catch (Exception e) {
            System.out.println(e);
        }

        JOptionPane.showMessageDialog(this, "Kayıt Başarıyla İşlendi...");
        Sifirla();
        } else {
            JOptionPane.showMessageDialog(this, "Tüm alanları eksiksiz doldurun!");
        }
        
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        int sonuc = JOptionPane.showConfirmDialog(this, "Tüm alanlar temizlenecek!\nEmin misiniz ?","UYARI", 2);
        if (sonuc==0) {
            Sifirla();
        } 
    }//GEN-LAST:event_btnTemizleActionPerformed


    
    public static void main(String args[]) {                
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              new KisiFormu().setVisible(true);              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Zemin1;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cmbBes;
    private javax.swing.JComboBox<String> cmbCocukSayisi;
    private javax.swing.JComboBox<String> cmbMedeniDurum;
    private javax.swing.JComboBox<String> cmbSendika;
    private javax.swing.JComboBox<String> cmbUnvan;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblBes;
    private javax.swing.JLabel lblCocukSayisi;
    private javax.swing.JLabel lblIban;
    private javax.swing.JLabel lblMedeniDurum;
    private javax.swing.JLabel lblSendika;
    private javax.swing.JLabel lblTcNo;
    private javax.swing.JLabel lblUnvan;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField tfAdSoyad;
    private javax.swing.JTextField tfIban;
    private javax.swing.JTextField tfTcNo;
    // End of variables declaration//GEN-END:variables
}
