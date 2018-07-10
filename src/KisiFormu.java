
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JTextField;




public class KisiFormu extends javax.swing.JFrame {

    public KisiFormu() {
        initComponents();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tfTcNo = new JNumberTextField();
        tfAdSoyad = new JHarfTextField();
        lblAdSoyad = new javax.swing.JLabel();
        lblTcNo = new javax.swing.JLabel();
        lblUnvan = new javax.swing.JLabel();
        cmbUnvan = new javax.swing.JComboBox<>();
        btnZemin = new javax.swing.JPanel();
        btnKaydet = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        btnKapat = new javax.swing.JButton();
        cmbDonem = new javax.swing.JComboBox<>();
        lblDonem = new javax.swing.JLabel();
        lblAGI = new javax.swing.JLabel();
        cmbAgi = new javax.swing.JComboBox<>();
        lblBes = new javax.swing.JLabel();
        cmbBes = new javax.swing.JComboBox<>();
        lblSendika = new javax.swing.JLabel();
        cmbSendika = new javax.swing.JComboBox<>();
        lblIban = new javax.swing.JLabel();
        tfIban = new javax.swing.JTextField();
        lblCocukSayisi = new javax.swing.JLabel();
        cmbCocukSayisi = new javax.swing.JComboBox<>();
        lblMedeniDurum = new javax.swing.JLabel();
        cmbMedeniDurum = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sürekli İşçi Maaş Programı");
        setResizable(false);
        setSize(800,600);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblAdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdSoyad.setText("Adı Soyadı");

        lblTcNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTcNo.setText("T.C. Kimlik No");

        lblUnvan.setText("Ünvanı");

        cmbUnvan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sürekli İşçi" }));

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

        btnKapat.setText("Formu Kapat");
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });

        cmbDonem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 Aralık - 14 Ocak", "15 Ocak - 14 Şubat", "15 Şubat - 14 Mart", "15 Mart - 14 Nisan", "15 Nisan - 14 Mayıs", "15 Mayıs - 14 Haziran", "15 Haziran - 14 Temmuz", "15 Temmuz - 15 Ağustos", "15 Ağustos - 14 Eylül", "15 Eylül - 14 Ekim", "15 Ekim - 14 Kasım", "15 Kasım - 14 Aralık" }));

        lblDonem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDonem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonem.setText("Dönem");

        javax.swing.GroupLayout btnZeminLayout = new javax.swing.GroupLayout(btnZemin);
        btnZemin.setLayout(btnZeminLayout);
        btnZeminLayout.setHorizontalGroup(
            btnZeminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnZeminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnZeminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTemizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKapat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDonem, 0, 154, Short.MAX_VALUE)
                    .addComponent(lblDonem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnZeminLayout.setVerticalGroup(
            btnZeminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnZeminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDonem)
                .addGap(18, 18, 18)
                .addComponent(cmbDonem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKapat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblAGI.setText("Asgari Geçim İndirimi");

        cmbAgi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekar", "Evli ve eşi çalışmayan", "Evli ve eşi çalışmayan 1 çocuklu", "Evli ve eşi çalışmayan 2 çocuklu", "Evli ve eşi çalışmayan 3 çocuklu", "Evli ve eşi çalışmayan 4 çocuklu", "Evli ve eşi çalışmayan 5 çocuklu", "Evli ve eşi çalışan", "Evli ve eşi çalışan 1 çocuklu", "Evli ve eşi çalışan 2 çocuklu", "Evli ve eşi çalışan 3 çocuklu", "Evli ve eşi çalışan 4 çocuklu", "Evli ve eşi çalışan 5 çocuklu", " " }));

        lblBes.setText("BES (Zorunlu Bireysel Emeklilik)");

        cmbBes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yok", "Var" }));

        lblSendika.setText("Sendika Kaydı");

        cmbSendika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yok", "Var" }));

        lblIban.setText("IBAN Numarası");

        lblCocukSayisi.setText("Çocuk Sayısı");

        cmbCocukSayisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        lblMedeniDurum.setText("Medeni Durumu");

        cmbMedeniDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekar", "Evli" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBes)
                    .addComponent(lblSendika)
                    .addComponent(lblIban)
                    .addComponent(lblAGI)
                    .addComponent(lblUnvan)
                    .addComponent(lblCocukSayisi)
                    .addComponent(lblAdSoyad)
                    .addComponent(lblTcNo)
                    .addComponent(lblMedeniDurum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIban)
                    .addComponent(cmbSendika, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAgi, 0, 335, Short.MAX_VALUE)
                    .addComponent(cmbCocukSayisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbMedeniDurum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbUnvan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfAdSoyad)
                    .addComponent(tfTcNo))
                .addGap(18, 18, 18)
                .addComponent(btnZemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTcNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdSoyad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnvan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedeniDurum)
                            .addComponent(cmbMedeniDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbCocukSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCocukSayisi)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAGI)
                            .addComponent(cmbAgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBes)
                            .addComponent(cmbBes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnZemin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSendika)
                    .addComponent(cmbSendika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIban)
                    .addComponent(tfIban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        int sonuc = JOptionPane.showConfirmDialog(this, "Tüm alanlar temizlenecek!\nEmin misiniz ?","UYARI", 2);
        if (sonuc==0) {
            Sifirla();
        }
    }//GEN-LAST:event_btnTemizleActionPerformed

    
    public int agiler (AGILER agi) {
        if (agi == agi.EVLI_ESI_CALISAN_1_COCUKLU) {
            return 1; 
        } else if(agi == agi.EVLI_ESI_CALISAN_2_COCUKLU) {
            return 2; 
        } else if(agi == agi.EVLI_ESI_CALISAN_3_COCUKLU) {
            return 3; 
        } else if(agi == agi.EVLI_ESI_CALISAN_4_COCUKLU) {
            return 4;
        } else if(agi == agi.EVLI_ESI_CALISAN_5_COCUKLU) {
            return 5; 
        } else if (agi == agi.EVLI_ESI_CALISMAYAN_1_COCUKLU) {
            return 1;
        } else if( agi == agi.EVLI_ESI_CALISMAYAN_2_COCUKLU) {
            return 2;
        } else if ( agi == agi.EVLI_ESI_CALISMAYAN_3_COCUKLU) {
            return 3;
        } else if ( agi == agi.EVLI_ESI_CALISMAYAN_4_COCUKLU) {
            return 4;
        } else if ( agi == agi.EVLI_ESI_CALISMAYAN_5_COCUKLU) {
            return 5;
        } else return 0; 
    }
    
    
    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed

        boolean kontrol = Kontrol();
        if (kontrol) {
            Connection c = null;
            Statement stmt = null;

            try {
                boolean sendika,bes;
                //Kisi kisi1=new Hesaplamalar(TCNO, adSoyad, medeniDurum, IBAN, unvani, kontrol, kontrol, SOMEBITS)

                String sendikatxt = cmbSendika.getSelectedItem().toString();
                String bestxt = cmbBes.getSelectedItem().toString();

                if (sendikatxt=="Yok") {
                    sendika=false;
                } else sendika=true;

                if (bestxt == "Yok") {
                    bes=false;
                } else bes = true;

                
                
                
                //tanımlamalar
                Kisi kisi = new Kisi(tfTcNo.getText(),tfAdSoyad.getText(), "Evli", tfIban.getText(), cmbUnvan.getSelectedItem().toString(), bes, sendika, Integer.valueOf(cmbCocukSayisi.getSelectedItem().toString()));
                Gun gun = new Gun(21, 21, 9, 30);
                AylikSosyalYardimlar asy = new AylikSosyalYardimlar();
                YillikSosyalYardimlar ysy = new YillikSosyalYardimlar();
                OlayaBagliYardimlar oby = new OlayaBagliYardimlar();
                AGI agi = new AGI();
                Hesaplamalar hesap = new Hesaplamalar(tfTcNo.getText(),tfAdSoyad.getText(), "Evli", tfIban.getText(), cmbUnvan.getSelectedItem().toString(), bes, sendika, Integer.valueOf(cmbCocukSayisi.getSelectedItem().toString()));
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

                System.out.println(asy.getCocukYardimi());
                System.out.println("Hakediş Toplamı : "+hesap.hakedisToplami(asy, ysy));
                System.out.println("Hakediş Toplamı : " +hesap.netOdenen(asy, ysy));

                Class.forName("org.sqlite.JDBC");
                String url = "jdbc:sqlite:db\\db.db";
                c = DriverManager.getConnection(url);
                c.setAutoCommit(false);
                stmt = c.createStatement();
                String sql = "Insert into KisiBilgileri (adsoyad, tcNo, unvan, medeniDurum, cocukSayisi, bes, sendika, IBAN, maasDonemi) values (?,?,?,?,?,?,?,?,?)";
                PreparedStatement psmt=c.prepareStatement(sql);
                psmt.setString(1, tfAdSoyad.getText());
                psmt.setString(2, tfTcNo.getText());
                psmt.setString(3, cmbUnvan.getSelectedItem().toString());
                psmt.setString(4, cmbMedeniDurum.getSelectedItem().toString());
                psmt.setString(5, cmbCocukSayisi.getSelectedItem().toString());
                psmt.setString(6, cmbBes.getSelectedItem().toString());
                psmt.setString(7, cmbSendika.getSelectedItem().toString());
                psmt.setString(8, tfIban.getText());
                psmt.setString(9, cmbDonem.getSelectedItem().toString());
                psmt.executeUpdate();
                stmt.close();
                c.commit();
                c.close();
            } catch (Exception e) {
                System.out.println(e);
            }

            JOptionPane.showMessageDialog(this, "Kayıt Başarıyla İşlendi...");
            Sifirla();
        } else {
            JOptionPane.showMessageDialog(this, "Tüm alanları eksiksiz doldurun!");
        }

    }//GEN-LAST:event_btnKaydetActionPerformed
    

    
    private void btnKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnKapatActionPerformed

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
    

    
    public static void main(String args[]) {      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              new KisiFormu().setVisible(true);      
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKapat;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JPanel btnZemin;
    private javax.swing.JComboBox<String> cmbAgi;
    private javax.swing.JComboBox<String> cmbBes;
    private javax.swing.JComboBox<String> cmbCocukSayisi;
    private javax.swing.JComboBox<String> cmbDonem;
    private javax.swing.JComboBox<String> cmbMedeniDurum;
    private javax.swing.JComboBox<String> cmbSendika;
    private javax.swing.JComboBox<String> cmbUnvan;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAGI;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblBes;
    private javax.swing.JLabel lblCocukSayisi;
    private javax.swing.JLabel lblDonem;
    private javax.swing.JLabel lblIban;
    private javax.swing.JLabel lblMedeniDurum;
    private javax.swing.JLabel lblSendika;
    private javax.swing.JLabel lblTcNo;
    private javax.swing.JLabel lblUnvan;
    private javax.swing.JTextField tfAdSoyad;
    private javax.swing.JTextField tfIban;
    private javax.swing.JTextField tfTcNo;
    // End of variables declaration//GEN-END:variables
}
