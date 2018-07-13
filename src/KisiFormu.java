
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DecimalFormat;
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
        btnZemin = new javax.swing.JPanel();
        btnKaydet = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        btnKapat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblIban = new javax.swing.JLabel();
        lblSendika = new javax.swing.JLabel();
        lblBes = new javax.swing.JLabel();
        lblAGI = new javax.swing.JLabel();
        lblCocukSayisi = new javax.swing.JLabel();
        lblMedeniDurum = new javax.swing.JLabel();
        lblUnvan = new javax.swing.JLabel();
        lblAdSoyad = new javax.swing.JLabel();
        lblTcNo = new javax.swing.JLabel();
        tfTcNo = new JNumberTextField();
        tfAdSoyad = new JHarfTextField();
        cmbUnvan = new javax.swing.JComboBox<>();
        cmbMedeniDurum = new javax.swing.JComboBox<>();
        cmbCocukSayisi = new javax.swing.JComboBox<>();
        cmbAgi = new javax.swing.JComboBox<>();
        cmbBes = new javax.swing.JComboBox<>();
        cmbSendika = new javax.swing.JComboBox<>();
        tfIban = new javax.swing.JTextField();
        lblGVOrani = new javax.swing.JLabel();
        cmbGVOrani = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbNormalGun = new javax.swing.JComboBox<>();
        cmbHaftaTatili = new javax.swing.JComboBox<>();
        cmbYemekVerilecekGun = new javax.swing.JComboBox<>();
        cmbToplamGun = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cmbDonem = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        lblHakEdisToplami = new javax.swing.JLabel();
        tfHakedisToplami = new javax.swing.JTextField();
        tfKesintiToplami = new javax.swing.JTextField();
        lblKesintiToplami = new javax.swing.JLabel();
        tfNetOdenen = new javax.swing.JTextField();
        lblNetOdenen = new javax.swing.JLabel();
        jButton1 = new IsciButon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sürekli İşçi Maaş Programı");
        setResizable(false);
        setSize(800,600);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnZemin.setBackground(new java.awt.Color(102, 102, 102));
        btnZemin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        javax.swing.GroupLayout btnZeminLayout = new javax.swing.GroupLayout(btnZemin);
        btnZemin.setLayout(btnZeminLayout);
        btnZeminLayout.setHorizontalGroup(
            btnZeminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnZeminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnZeminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(btnTemizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKapat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnZeminLayout.setVerticalGroup(
            btnZeminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnZeminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKapat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kişi Bilgileri"));

        lblIban.setText("IBAN Numarası");

        lblSendika.setText("Sendika Kaydı");

        lblBes.setText("BES (Zorunlu Bireysel Emeklilik)");

        lblAGI.setText("Asgari Geçim İndirimi");

        lblCocukSayisi.setText("Çocuk Sayısı");

        lblMedeniDurum.setText("Medeni Durumu");

        lblUnvan.setText("Ünvanı");

        lblAdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdSoyad.setText("Adı Soyadı");

        lblTcNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTcNo.setText("T.C. Kimlik No");

        cmbUnvan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sürekli İşçi" }));

        cmbMedeniDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekar", "Evli" }));

        cmbCocukSayisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        cmbAgi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekar", "Evli ve eşi çalışmayan", "Evli ve eşi çalışmayan 1 çocuklu", "Evli ve eşi çalışmayan 2 çocuklu", "Evli ve eşi çalışmayan 3 çocuklu", "Evli ve eşi çalışmayan 4 çocuklu", "Evli ve eşi çalışmayan 5 çocuklu", "Evli ve eşi çalışan", "Evli ve eşi çalışan 1 çocuklu", "Evli ve eşi çalışan 2 çocuklu", "Evli ve eşi çalışan 3 çocuklu", "Evli ve eşi çalışan 4 çocuklu", "Evli ve eşi çalışan 5 çocuklu" }));

        cmbBes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yok", "Var" }));

        cmbSendika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yok", "Var" }));

        lblGVOrani.setText("Gelir Vergisi Oranı");

        cmbGVOrani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "20", "27", "30" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBes)
                    .addComponent(lblSendika)
                    .addComponent(lblIban)
                    .addComponent(lblAGI)
                    .addComponent(lblUnvan)
                    .addComponent(lblCocukSayisi)
                    .addComponent(lblAdSoyad)
                    .addComponent(lblTcNo)
                    .addComponent(lblMedeniDurum)
                    .addComponent(lblGVOrani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbGVOrani, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfIban)
                    .addComponent(cmbSendika, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAgi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCocukSayisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbMedeniDurum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbUnvan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfAdSoyad)
                    .addComponent(tfTcNo))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTcNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdSoyad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnvan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedeniDurum)
                    .addComponent(cmbMedeniDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCocukSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCocukSayisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGVOrani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGVOrani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAGI)
                    .addComponent(cmbAgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBes)
                    .addComponent(cmbBes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSendika)
                    .addComponent(cmbSendika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIban)
                    .addComponent(tfIban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Günler"));

        jLabel1.setText("Normal Gün");

        jLabel2.setText("Yemek Verilecek Gün");

        jLabel3.setText("Hafta Tatili");

        jLabel4.setText("Toplam Gün");

        cmbNormalGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        cmbHaftaTatili.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        cmbYemekVerilecekGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        cmbToplamGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbNormalGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cmbHaftaTatili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cmbYemekVerilecekGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbToplamGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(cmbNormalGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHaftaTatili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbYemekVerilecekGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbToplamGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cmbDonem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 Aralık - 14 Ocak", "15 Ocak - 14 Şubat", "15 Şubat - 14 Mart", "15 Mart - 14 Nisan", "15 Nisan - 14 Mayıs", "15 Mayıs - 14 Haziran", "15 Haziran - 14 Temmuz", "15 Temmuz - 15 Ağustos", "15 Ağustos - 14 Eylül", "15 Eylül - 14 Ekim", "15 Ekim - 14 Kasım", "15 Kasım - 14 Aralık" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbDonem, 0, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbDonem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblHakEdisToplami.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHakEdisToplami.setForeground(new java.awt.Color(255, 255, 0));
        lblHakEdisToplami.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHakEdisToplami.setText("HAKEDİŞ TOPLAMI");

        tfHakedisToplami.setEditable(false);
        tfHakedisToplami.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfHakedisToplami.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfKesintiToplami.setEditable(false);
        tfKesintiToplami.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfKesintiToplami.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblKesintiToplami.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKesintiToplami.setForeground(new java.awt.Color(255, 255, 0));
        lblKesintiToplami.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKesintiToplami.setText("KESİNTİ TOPLAMI");

        tfNetOdenen.setEditable(false);
        tfNetOdenen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfNetOdenen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblNetOdenen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNetOdenen.setForeground(new java.awt.Color(255, 255, 0));
        lblNetOdenen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNetOdenen.setText("NET ÖDENEN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHakEdisToplami, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(tfHakedisToplami)
                    .addComponent(lblKesintiToplami, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfKesintiToplami)
                    .addComponent(lblNetOdenen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNetOdenen))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHakEdisToplami)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHakedisToplami, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKesintiToplami)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfKesintiToplami, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblNetOdenen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNetOdenen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Çıkış");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnZemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(60, 60, 60))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapatActionPerformed
        int sonuc = JOptionPane.showConfirmDialog(this, "Form Kapatılacak!!\nEmin misiniz ?","UYARI",2);
        if (sonuc==0) {
            this.dispose();
        }

    }//GEN-LAST:event_btnKapatActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        int sonuc = JOptionPane.showConfirmDialog(this, "Tüm alanlar temizlenecek!\nEmin misiniz ?","UYARI", 2);
        if (sonuc==0) {
            Sifirla();
        }
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        jButton1.setBackground(Color.RED);
        DecimalFormat df = new DecimalFormat("#.##");
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
                Gun gun = new Gun(Integer.valueOf(cmbNormalGun.getSelectedItem().toString()), Integer.valueOf(cmbYemekVerilecekGun.getSelectedItem().toString()), Integer.valueOf(cmbHaftaTatili.getSelectedItem().toString()), Integer.valueOf(cmbToplamGun.getSelectedItem().toString()));
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
                hesap.gelirVergisi(Integer.parseInt(cmbGVOrani.getSelectedItem().toString()), cmbAgi.getSelectedIndex());

               

                tfHakedisToplami.setText(String.valueOf(df.format(hesap.hakedisToplami(asy, ysy))));
                tfKesintiToplami.setText(String.valueOf(df.format(hesap.kesintiToplami(asy, ysy))));
                tfNetOdenen.setText(String.valueOf(df.format(hesap.netOdenen(asy, ysy))));
                
                
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

            int sonuc = JOptionPane.showConfirmDialog(this, "Kayıt Başarıyla İşlendi.\nAlanlar sıfırlansın mı ?","UYARI",2);
            if (sonuc == 0) {
                Sifirla();
            };
            
        } else {
            JOptionPane.showMessageDialog(this, "Tüm alanları eksiksiz doldurun!");
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

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
    private javax.swing.JComboBox<String> cmbGVOrani;
    private javax.swing.JComboBox<String> cmbHaftaTatili;
    private javax.swing.JComboBox<String> cmbMedeniDurum;
    private javax.swing.JComboBox<String> cmbNormalGun;
    private javax.swing.JComboBox<String> cmbSendika;
    private javax.swing.JComboBox<String> cmbToplamGun;
    private javax.swing.JComboBox<String> cmbUnvan;
    private javax.swing.JComboBox<String> cmbYemekVerilecekGun;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAGI;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblBes;
    private javax.swing.JLabel lblCocukSayisi;
    private javax.swing.JLabel lblGVOrani;
    private javax.swing.JLabel lblHakEdisToplami;
    private javax.swing.JLabel lblIban;
    private javax.swing.JLabel lblKesintiToplami;
    private javax.swing.JLabel lblMedeniDurum;
    private javax.swing.JLabel lblNetOdenen;
    private javax.swing.JLabel lblSendika;
    private javax.swing.JLabel lblTcNo;
    private javax.swing.JLabel lblUnvan;
    private javax.swing.JTextField tfAdSoyad;
    private javax.swing.JTextField tfHakedisToplami;
    private javax.swing.JTextField tfIban;
    private javax.swing.JTextField tfKesintiToplami;
    private javax.swing.JTextField tfNetOdenen;
    private javax.swing.JTextField tfTcNo;
    // End of variables declaration//GEN-END:variables
}
