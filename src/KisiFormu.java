
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class KisiFormu extends javax.swing.JFrame {

    public KisiFormu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        Zemin2 = new javax.swing.JPanel();
        Zemin1 = new javax.swing.JPanel();
        lblTcNo = new javax.swing.JLabel();
        tfTcNo = new javax.swing.JTextField();
        lblAdSoyad = new javax.swing.JLabel();
        tfAdSoyad = new javax.swing.JTextField();
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

        javax.swing.GroupLayout Zemin2Layout = new javax.swing.GroupLayout(Zemin2);
        Zemin2.setLayout(Zemin2Layout);
        Zemin2Layout.setHorizontalGroup(
            Zemin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        Zemin2Layout.setVerticalGroup(
            Zemin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        tab.addTab("Gün Bilgileri", Zemin2);

        lblTcNo.setText("T.C. Kimlik No");

        lblAdSoyad.setText("Adı Soyadı");

        lblMedeniDurum.setText("Medeni Durumu");

        cmbMedeniDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekar", "Evli" }));

        lblIban.setText("IBAN Numarası");

        lblUnvan.setText("Ünvanı");

        cmbUnvan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sürekli İşçi" }));

        cmbBes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yok", "Var" }));

        lblBes.setText("BES (Zorunlu Bireysel Emeklilik)");

        cmbCocukSayisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Çocuk Yok", "1", "2", "3", "4", "5" }));

        lblCocukSayisi.setText("Çocuk Sayısı");

        lblSendika.setText("Sendika Kaydı");

        cmbSendika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yok", "Var" }));

        btnKaydet.setText("Veritabanına Kaydet");

        btnTemizle.setText("Formu Temizle");

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

        tab.addTab("Kişi Bilgileri", Zemin1);

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


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new KisiFormu().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Zemin1;
    private javax.swing.JPanel Zemin2;
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
