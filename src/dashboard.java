
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class dashboard extends javax.swing.JFrame {

    private double total = 0.0;
    private int x = 0;
    private double tax = 0.0;

    public dashboard() {
        initComponents();
        setTime();

        jTextArea1.setEditable(false);
        jTextFieldTax.setEditable(false);
        jTextFieldTotal.setEditable(false);
        jTextFieldsubTotal.setEditable(false);
    }

    public void totalbutton() {
        jSpinner1.setEnabled(false);
        jSpinner2.setEnabled(false);
        jSpinner3.setEnabled(false);
        jSpinner4.setEnabled(false);
        jSpinner5.setEnabled(false);
        jSpinner6.setEnabled(false);
        jSpinner7.setEnabled(false);
        jSpinner8.setEnabled(false);
        jSpinner9.setEnabled(false);
        jSpinner10.setEnabled(false);
        jSpinner11.setEnabled(false);
        jSpinner12.setEnabled(false);
        jSpinner13.setEnabled(false);
        jSpinner14.setEnabled(false);
        jSpinner15.setEnabled(false);
        jSpinner16.setEnabled(false);
        jSpinner17.setEnabled(false);
        jSpinner18.setEnabled(false);
        jSpinner19.setEnabled(false);
        jSpinner20.setEnabled(false);
        jSpinner21.setEnabled(false);
        jSpinner22.setEnabled(false);
        jSpinner23.setEnabled(false);
        jSpinner24.setEnabled(false);
        jSpinner25.setEnabled(false);
        jSpinner26.setEnabled(false);
        jSpinner27.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        jCheckBox11.setEnabled(false);
        jCheckBox12.setEnabled(false);
        jCheckBox13.setEnabled(false);
        jCheckBox14.setEnabled(false);
        jCheckBox15.setEnabled(false);
        jCheckBox16.setEnabled(false);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(false);
        jCheckBox20.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(false);
        jCheckBox25.setEnabled(false);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(false);
        btnReceipt.setEnabled(false);

    }

    public boolean qtyisZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please increase the item quantity");
            return false;
        }
        return true;
    }

    public void reset() {
        btntotal.setEnabled(true);
        x = 0;
        total = 0.0;
        tax = 0.0;
        jSpinner19.setValue(0);
        jSpinner22.setValue(0);
        jSpinner23.setValue(0);
        jSpinner20.setValue(0);
        jSpinner24.setValue(0);
        jSpinner25.setValue(0);
        jSpinner21.setValue(0);
        jSpinner26.setValue(0);
        jSpinner27.setValue(0);
        jSpinner5.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner11.setValue(0);
        jSpinner15.setValue(0);
        jSpinner16.setValue(0);
        jSpinner12.setValue(0);
        jSpinner17.setValue(0);
        jSpinner18.setValue(0);
        jSpinner1.setValue(0);
        jSpinner4.setValue(0);
        jSpinner6.setValue(0);
        jSpinner2.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner3.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jTextFieldTax.setText("0.0");
        jTextFieldTotal.setText("0.0");
        jTextFieldsubTotal.setText("0.0");
        jTextFieldcash.setText("0.0");
        jLabelbalance.setText("0.0");
        jTextArea1.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
        jCheckBox16.setSelected(false);
        jCheckBox17.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);
        jCheckBox20.setSelected(false);
        jCheckBox21.setSelected(false);
        jCheckBox22.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);
        jCheckBox26.setSelected(false);
        jCheckBox27.setSelected(false);
        jSpinner1.setEnabled(true);
        jSpinner2.setEnabled(true);
        jSpinner3.setEnabled(true);
        jSpinner4.setEnabled(true);
        jSpinner5.setEnabled(true);
        jSpinner6.setEnabled(true);
        jSpinner7.setEnabled(true);
        jSpinner8.setEnabled(true);
        jSpinner9.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true);
        jSpinner12.setEnabled(true);
        jSpinner13.setEnabled(true);
        jSpinner14.setEnabled(true);
        jSpinner15.setEnabled(true);
        jSpinner16.setEnabled(true);
        jSpinner17.setEnabled(true);
        jSpinner18.setEnabled(true);
        jSpinner19.setEnabled(true);
        jSpinner20.setEnabled(true);
        jSpinner21.setEnabled(true);
        jSpinner22.setEnabled(true);
        jSpinner23.setEnabled(true);
        jSpinner24.setEnabled(true);
        jSpinner25.setEnabled(true);
        jSpinner26.setEnabled(true);
        jSpinner27.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(true);
        jCheckBox8.setEnabled(true);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(true);
        jCheckBox18.setEnabled(true);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(true);
        jCheckBox21.setEnabled(true);
        jCheckBox22.setEnabled(true);
        jCheckBox23.setEnabled(true);
        jCheckBox24.setEnabled(true);
        jCheckBox25.setEnabled(true);
        jCheckBox26.setEnabled(true);
        jCheckBox27.setEnabled(true);
        btnReceipt.setEnabled(true);

    }

    public void dudate() {
        jTextFieldTax.setText(String.valueOf(tax));
        jTextFieldsubTotal.setText(String.valueOf(total));
        jTextFieldTotal.setText(String.valueOf(total + tax));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel45 = new javax.swing.JPanel();
        jLabel201 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jSpinner19 = new javax.swing.JSpinner();
        jCheckBox19 = new javax.swing.JCheckBox();
        jPanel18 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jSpinner20 = new javax.swing.JSpinner();
        jCheckBox20 = new javax.swing.JCheckBox();
        jPanel19 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jSpinner21 = new javax.swing.JSpinner();
        jCheckBox21 = new javax.swing.JCheckBox();
        jPanel37 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jSpinner22 = new javax.swing.JSpinner();
        jCheckBox22 = new javax.swing.JCheckBox();
        jPanel38 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jSpinner23 = new javax.swing.JSpinner();
        jCheckBox23 = new javax.swing.JCheckBox();
        jPanel39 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jSpinner24 = new javax.swing.JSpinner();
        jCheckBox24 = new javax.swing.JCheckBox();
        jPanel40 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jSpinner25 = new javax.swing.JSpinner();
        jCheckBox25 = new javax.swing.JCheckBox();
        jPanel41 = new javax.swing.JPanel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jSpinner26 = new javax.swing.JSpinner();
        jCheckBox26 = new javax.swing.JCheckBox();
        jPanel42 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jSpinner27 = new javax.swing.JSpinner();
        jCheckBox27 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel29 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jCheckBox11 = new javax.swing.JCheckBox();
        jPanel30 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jCheckBox12 = new javax.swing.JCheckBox();
        jPanel31 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jCheckBox13 = new javax.swing.JCheckBox();
        jPanel32 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel33 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jCheckBox15 = new javax.swing.JCheckBox();
        jPanel34 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jCheckBox16 = new javax.swing.JCheckBox();
        jPanel35 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jCheckBox17 = new javax.swing.JCheckBox();
        jPanel36 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        jCheckBox18 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel23 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel24 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btntotal = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldsubTotal = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTxTime = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabelbalance = new javax.swing.JLabel();
        jTextFieldcash = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1500, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1500, 900));

        jPanel45.setBackground(new java.awt.Color(209, 66, 6));

        jLabel201.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Restaurant Twitter Post Design - Made with PosterMyWall.jpg"))); // NOI18N
        jLabel201.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", jPanel45);

        jPanel14.setPreferredSize(new java.awt.Dimension(1065, 900));

        jPanel15.setBackground(new java.awt.Color(255, 204, 204));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel131.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel131.setText("Royal Food Corner");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.setPreferredSize(new java.awt.Dimension(1053, 850));

        jLabel132.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel132.setText("Lunch Menu Items");

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel17.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fried chicken.jpg"))); // NOI18N

        jLabel134.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel134.setText("Name");

        jLabel135.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel135.setText("Price");

        jLabel136.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel136.setText("Quantity");

        jLabel137.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel137.setText("Purchase");

        jLabel138.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel138.setText("Fried chicken");

        jLabel139.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel139.setText("600.00");

        jSpinner19.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox19, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(jLabel138))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(jLabel139))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox19)
                    .addComponent(jLabel137))
                .addGap(38, 38, 38))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel18.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rice and curry (Custom).jpg"))); // NOI18N

        jLabel141.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel141.setText("Name");

        jLabel142.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel142.setText("Price");

        jLabel143.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel143.setText("Quantity");

        jLabel144.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel144.setText("Purchase");

        jLabel145.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel145.setText("Rice and Curry");

        jLabel146.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel146.setText("300.00");

        jSpinner20.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel145))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(jLabel145))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142)
                    .addComponent(jLabel146))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143)
                    .addComponent(jSpinner20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox20)
                    .addComponent(jLabel144))
                .addGap(38, 38, 38))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel19.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images (1) (Custom).jpeg"))); // NOI18N

        jLabel148.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel148.setText("Name");

        jLabel149.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel149.setText("Price");

        jLabel150.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel150.setText("Quantity");

        jLabel151.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel151.setText("Purchase");

        jLabel152.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel152.setText("Biriyani");

        jLabel153.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel153.setText("1000.00");

        jSpinner21.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel152)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel153, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner21, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel148)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149)
                    .addComponent(jLabel153))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel150)
                    .addComponent(jSpinner21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox21)
                    .addComponent(jLabel151))
                .addGap(38, 38, 38))
        );

        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel37.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/idiyappam.jpg"))); // NOI18N

        jLabel155.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel155.setText("Name");

        jLabel156.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel156.setText("Price");

        jLabel157.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel157.setText("Quantity");

        jLabel158.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel158.setText("Purchase");

        jLabel159.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel159.setText("String hoppers");

        jLabel160.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel160.setText("50.00");

        jSpinner22.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel160, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner22, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(jLabel159))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel156)
                    .addComponent(jLabel160))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157)
                    .addComponent(jSpinner22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox22)
                    .addComponent(jLabel158))
                .addGap(38, 38, 38))
        );

        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel38.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fried rice.jpg"))); // NOI18N

        jLabel162.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel162.setText("Name");

        jLabel163.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel163.setText("Price");

        jLabel164.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel164.setText("Quantity");

        jLabel165.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel165.setText("Purchase");

        jLabel166.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel166.setText("Fried rice");

        jLabel167.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel167.setText("550.00");

        jSpinner23.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel166)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel167)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox23)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel162)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel163)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel164)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel165)
                        .addGap(52, 52, 52))))
        );

        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel39.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parotta (Custom).jpeg"))); // NOI18N

        jLabel169.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel169.setText("Name");

        jLabel170.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel170.setText("Price");

        jLabel171.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel171.setText("Quantity");

        jLabel172.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel172.setText("Purchase");

        jLabel173.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel173.setText("Parotta");

        jLabel174.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel174.setText("100.00");

        jSpinner24.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel169)
                    .addComponent(jLabel173))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel170)
                    .addComponent(jLabel174))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(jSpinner24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox24)
                    .addComponent(jLabel172))
                .addGap(38, 38, 38))
        );

        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel40.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noodles.jpg"))); // NOI18N

        jLabel176.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel176.setText("Name");

        jLabel177.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel177.setText("Price");

        jLabel178.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel178.setText("Quantity");

        jLabel179.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel179.setText("Purchase");

        jLabel180.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel180.setText("Noodles");

        jLabel181.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel181.setText("300.00");

        jSpinner25.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                                .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel176)
                    .addComponent(jLabel180))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel177)
                    .addComponent(jLabel181))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel178)
                    .addComponent(jSpinner25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox25)
                    .addComponent(jLabel179))
                .addGap(38, 38, 38))
        );

        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel41.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.jpeg"))); // NOI18N

        jLabel183.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel183.setText("Name");

        jLabel184.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel184.setText("Price");

        jLabel185.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel185.setText("Quantity");

        jLabel186.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel186.setText("Purchase");

        jLabel187.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel187.setText("puttu");

        jLabel188.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel188.setText("120.00");

        jSpinner26.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel182, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel183)
                    .addComponent(jLabel187))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel184)
                    .addComponent(jLabel188))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel185)
                    .addComponent(jSpinner26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox26)
                    .addComponent(jLabel186))
                .addGap(38, 38, 38))
        );

        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel42.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chicken_Kottu.jpg"))); // NOI18N

        jLabel190.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel190.setText("Name");

        jLabel191.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel191.setText("Price");

        jLabel192.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel192.setText("Quantity");

        jLabel193.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel193.setText("Purchase");

        jLabel194.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel194.setText("Kottu");

        jLabel195.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel195.setText("600.00");

        jSpinner27.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel189, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox27, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel194, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel190)
                    .addComponent(jLabel194))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel191)
                    .addComponent(jLabel195))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel192)
                    .addComponent(jSpinner27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox27)
                    .addComponent(jLabel193))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(80, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lunch", jPanel2);

        jPanel25.setPreferredSize(new java.awt.Dimension(1065, 900));

        jPanel26.setBackground(new java.awt.Color(255, 204, 204));
        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setText("Royal Food Corner");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(204, 204, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel27.setPreferredSize(new java.awt.Dimension(1053, 850));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setText("Desert Menu Items");

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel28.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brownies (Custom).jpeg"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("Name");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Price");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Quantity");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Purchase");

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel73.setText("Brownies");

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel74.setText("150.00");

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jLabel37))
                .addGap(38, 38, 38))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel29.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doughnuts (Custom).jpeg"))); // NOI18N

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel76.setText("Name");

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel77.setText("Price");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel78.setText("Quantity");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel79.setText("Purchase");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel80.setText("Doughnuts");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel81.setText("300.00");

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11)
                    .addComponent(jLabel79))
                .addGap(38, 38, 38))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel30.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/oreo icecream (Custom).jpeg"))); // NOI18N

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel83.setText("Name");

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel84.setText("Price");

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel85.setText("Quantity");

        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel86.setText("Purchase");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel87.setText("Oreo icecream");

        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel88.setText("650.00");

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel87))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox12)
                    .addComponent(jLabel86))
                .addGap(38, 38, 38))
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel31.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apple pie (Custom).jpg"))); // NOI18N

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel90.setText("Name");

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel91.setText("Price");

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel92.setText("Quantity");

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel93.setText("Purchase");

        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel94.setText("Apple pie");

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel95.setText("1600.00");

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner13, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jLabel94))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jLabel95))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox13)
                    .addComponent(jLabel93))
                .addGap(38, 38, 38))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel32.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candy (Custom).jpeg"))); // NOI18N

        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel97.setText("Name");

        jLabel98.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel98.setText("Price");

        jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel99.setText("Quantity");

        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel100.setText("Purchase");

        jLabel101.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel101.setText("Candy");

        jLabel102.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel102.setText("30.00");

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox14)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel100)
                        .addGap(52, 52, 52))))
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel33.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/macarons (Custom).jpeg"))); // NOI18N

        jLabel104.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel104.setText("Name");

        jLabel105.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel105.setText("Price");

        jLabel106.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel106.setText("Quantity");

        jLabel107.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel107.setText("Purchase");

        jLabel108.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel108.setText("Macrons");

        jLabel109.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel109.setText("100.00");

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox15)
                    .addComponent(jLabel107))
                .addGap(38, 38, 38))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel34.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marshmallow (Custom).jpeg"))); // NOI18N

        jLabel111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel111.setText("Name");

        jLabel112.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel112.setText("Price");

        jLabel113.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel113.setText("Quantity");

        jLabel114.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel114.setText("Purchase");

        jLabel115.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel115.setText("Marshmallow");

        jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel116.setText("50.00");

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jLabel115))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox16)
                    .addComponent(jLabel114))
                .addGap(38, 38, 38))
        );

        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel35.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pan cake (Custom).jpg"))); // NOI18N

        jLabel118.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel118.setText("Name");

        jLabel119.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel119.setText("Price");

        jLabel120.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel120.setText("Quantity");

        jLabel121.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel121.setText("Purchase");

        jLabel122.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel122.setText("Pancake");

        jLabel123.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel123.setText("460.00");

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(jLabel122))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox17)
                    .addComponent(jLabel121))
                .addGap(38, 38, 38))
        );

        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel36.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dg-Tall-and-Creamy-Cheesecake-superJumbo (Custom).jpg"))); // NOI18N

        jLabel125.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel125.setText("Name");

        jLabel126.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel126.setText("Price");

        jLabel127.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel127.setText("Quantity");

        jLabel128.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel128.setText("Purchase");

        jLabel129.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel129.setText("Cheese cake");

        jLabel130.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel130.setText("325.00");

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox18, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(jLabel129))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(jLabel130))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox18)
                    .addComponent(jLabel128))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(80, Short.MAX_VALUE))))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Desert", jPanel3);

        jPanel8.setPreferredSize(new java.awt.Dimension(1065, 900));

        jPanel20.setBackground(new java.awt.Color(255, 204, 204));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Royal Food Corner");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(204, 204, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.setPreferredSize(new java.awt.Dimension(1053, 850));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Drink Menu Items");

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel22.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/strawberry smoothie (Custom) - Copy.jpeg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Purchase");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Strawberry smoothie");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("150.00");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel23.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iced tea.jpg"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Price");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Quantity");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Purchase");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Iced tea");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("150.00");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel14))
                .addGap(38, 38, 38))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel24.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orange juice.jpg"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Name");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Price");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Quantity");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Purchase");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Orange juice");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("650.00");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel21))
                .addGap(38, 38, 38))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel7.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/herbal tea.jpeg"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Name");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Price");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Quantity");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Purchase");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Herbal tea");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("200.00");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel28))
                .addGap(38, 38, 38))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel9.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hot chocolate.jpg"))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setText("Name");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setText("Price");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Quantity");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Purchase");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Hot chocolate");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("600.00");

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addGap(52, 52, 52))))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel10.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mango milkshake.jpeg"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setText("Name");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setText("Price");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setText("Quantity");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel49.setText("Purchase");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel50.setText("Mango milkshake");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel51.setText("350.00");

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addComponent(jLabel49))
                .addGap(38, 38, 38))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel11.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mojito.jpeg"))); // NOI18N

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setText("Name");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Price");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Quantity");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Purchase");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel57.setText("Mojito");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel58.setText("300.00");

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8)
                    .addComponent(jLabel56))
                .addGap(38, 38, 38))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel12.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pineapple juice.jpeg"))); // NOI18N

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setText("Name");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setText("Price");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Quantity");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel63.setText("Purchase");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel64.setText("Pineapple juice");

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setText("400.00");

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox9)
                    .addComponent(jLabel63))
                .addGap(38, 38, 38))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel13.setPreferredSize(new java.awt.Dimension(240, 262));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red wine.jpeg"))); // NOI18N

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel67.setText("Name");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel68.setText("Price");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel69.setText("Quantity");

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel70.setText("Purchase");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel71.setText("Red wine");

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel72.setText("900.00");

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10)
                    .addComponent(jLabel70))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(80, Short.MAX_VALUE))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Drink", jPanel6);

        jPanel44.setBackground(new java.awt.Color(204, 204, 204));
        jPanel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btntotal.setBackground(new java.awt.Color(204, 255, 204));
        btntotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btntotal.setForeground(new java.awt.Color(255, 102, 102));
        btntotal.setText("Total");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        btnReceipt.setBackground(new java.awt.Color(204, 204, 255));
        btnReceipt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReceipt.setForeground(new java.awt.Color(255, 102, 102));
        btnReceipt.setText("Receipt");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 204, 204));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngegg (4) (Custom).png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(204, 204, 204));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngegg (5) (Custom).png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel196.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel196.setText("Tax");

        jLabel197.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel197.setText("Sub Total");

        jLabel198.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel198.setText("Total");

        jTextFieldTax.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextFieldTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTax.setText("0.0");
        jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxActionPerformed(evt);
            }
        });

        jTextFieldsubTotal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextFieldsubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldsubTotal.setText("0.0");
        jTextFieldsubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsubTotalActionPerformed(evt);
            }
        });

        jTextFieldTotal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setText("0.0");
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jTxTime.setBackground(new java.awt.Color(255, 255, 255));
        jTxTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTxTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTxTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTxtDate.setBackground(new java.awt.Color(255, 255, 255));
        jTxtDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTxtDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTxtDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel199.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel199.setText("Balance");

        jLabel200.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel200.setText("Cash");

        jLabelbalance.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelbalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelbalance.setText("0.0");
        jLabelbalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextFieldcash.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextFieldcash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldcash.setText("0.0");
        jTextFieldcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(btntotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReceipt))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldcash, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxTime, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jTxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntotal)
                            .addComponent(btnReceipt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnExit))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel196)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel197)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel198)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel200, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldcash, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel199)
                    .addComponent(jLabelbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        String itemName = jLabel8.getText();
        double itemPrice = 150.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox1.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox1.setSelected(false);
        } else {
            jCheckBox1.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        if (total == 0) {
            tax = 0;
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

        int qty = Integer.parseInt(jSpinner2.getValue().toString());
        String itemName = jLabel15.getText();
        double itemPrice = 150.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox2.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox2.setSelected(false);
        } else {
            jCheckBox2.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        int qty = Integer.parseInt(jSpinner3.getValue().toString());
        String itemName = jLabel22.getText();
        double itemPrice = 650.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox3.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox3.setSelected(false);
        } else {
            jCheckBox3.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int qty = Integer.parseInt(jSpinner4.getValue().toString());
        String itemName = jLabel29.getText();
        double itemPrice = 200.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox4.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox4.setSelected(false);
        } else {
            jCheckBox4.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        int qty = Integer.parseInt(jSpinner6.getValue().toString());
        String itemName = jLabel43.getText();
        double itemPrice = 600.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox6.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox6.setSelected(false);
        } else {
            jCheckBox6.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        int qty = Integer.parseInt(jSpinner7.getValue().toString());
        String itemName = jLabel50.getText();
        double itemPrice = 350.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox7.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox7.setSelected(false);
        } else {
            jCheckBox7.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        int qty = Integer.parseInt(jSpinner8.getValue().toString());
        String itemName = jLabel57.getText();
        double itemPrice = 300.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox8.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox8.setSelected(false);
        } else {
            jCheckBox8.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        int qty = Integer.parseInt(jSpinner9.getValue().toString());
        String itemName = jLabel64.getText();
        double itemPrice = 400.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox9.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox9.setSelected(false);
        } else {
            jCheckBox9.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        int qty = Integer.parseInt(jSpinner10.getValue().toString());
        String itemName = jLabel71.getText();
        double itemPrice = 900.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox10.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox10.setSelected(false);
        } else {
            jCheckBox10.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        int qty = Integer.parseInt(jSpinner5.getValue().toString());
        String itemName = jLabel73.getText();
        double itemPrice = 150.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox5.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox5.setSelected(false);
        } else {
            jCheckBox5.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        int qty = Integer.parseInt(jSpinner11.getValue().toString());
        String itemName = jLabel80.getText();
        double itemPrice = 300.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox11.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox11.setSelected(false);
        } else {
            jCheckBox11.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        int qty = Integer.parseInt(jSpinner12.getValue().toString());
        String itemName = jLabel87.getText();
        double itemPrice = 650.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox12.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox12.setSelected(false);
        } else {
            jCheckBox12.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        int qty = Integer.parseInt(jSpinner13.getValue().toString());
        String itemName = jLabel94.getText();
        double itemPrice = 1600.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox13.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox13.setSelected(false);
        } else {
            jCheckBox13.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        int qty = Integer.parseInt(jSpinner14.getValue().toString());
        String itemName = jLabel101.getText();
        double itemPrice = 30.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox14.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox14.setSelected(false);
        } else {
            jCheckBox14.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        int qty = Integer.parseInt(jSpinner15.getValue().toString());
        String itemName = jLabel108.getText();
        double itemPrice = 100.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox15.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox15.setSelected(false);
        } else {
            jCheckBox15.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        int qty = Integer.parseInt(jSpinner16.getValue().toString());
        String itemName = jLabel115.getText();
        double itemPrice = 50.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox16.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox16.setSelected(false);
        } else {
            jCheckBox16.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        int qty = Integer.parseInt(jSpinner17.getValue().toString());
        String itemName = jLabel122.getText();
        double itemPrice = 460.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox17.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox17.setSelected(false);
        } else {
            jCheckBox17.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        int qty = Integer.parseInt(jSpinner18.getValue().toString());
        String itemName = jLabel129.getText();
        double itemPrice = 325.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox18.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox18.setSelected(false);
        } else {
            jCheckBox18.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        int qty = Integer.parseInt(jSpinner19.getValue().toString());
        String itemName = jLabel138.getText();
        double itemPrice = 600.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox19.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox19.setSelected(false);
        } else {
            jCheckBox19.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        int qty = Integer.parseInt(jSpinner20.getValue().toString());
        String itemName = jLabel145.getText();
        double itemPrice = 300.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox20.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox20.setSelected(false);
        } else {
            jCheckBox20.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        int qty = Integer.parseInt(jSpinner21.getValue().toString());
        String itemName = jLabel152.getText();
        double itemPrice = 1000.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox21.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox21.setSelected(false);
        } else {
            jCheckBox21.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        int qty = Integer.parseInt(jSpinner22.getValue().toString());
        String itemName = jLabel159.getText();
        double itemPrice = 50.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox22.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox22.setSelected(false);
        } else {
            jCheckBox22.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        int qty = Integer.parseInt(jSpinner23.getValue().toString());
        String itemName = jLabel166.getText();
        double itemPrice = 550.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox23.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox23.setSelected(false);
        } else {
            jCheckBox23.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        int qty = Integer.parseInt(jSpinner24.getValue().toString());
        String itemName = jLabel173.getText();
        double itemPrice = 100.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox24.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox24.setSelected(false);
        } else {
            jCheckBox24.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        int qty = Integer.parseInt(jSpinner25.getValue().toString());
        String itemName = jLabel180.getText();
        double itemPrice = 300.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox25.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox25.setSelected(false);
        } else {
            jCheckBox25.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox26ActionPerformed
        int qty = Integer.parseInt(jSpinner26.getValue().toString());
        String itemName = jLabel187.getText();
        double itemPrice = 120.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox26.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox26.setSelected(false);
        } else {
            jCheckBox26.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
        int qty = Integer.parseInt(jSpinner27.getValue().toString());
        String itemName = jLabel194.getText();
        double itemPrice = 200.00;
        double price = qty * itemPrice;

        // Find if the item already exists in the bill
        String[] billLines = jTextArea1.getText().split("\n");
        boolean itemExists = false;
        int itemIndex = -1;
        double oldPrice = 0.0;

        for (int i = 0; i < billLines.length; i++) {
            if (billLines[i].contains(itemName)) {
                itemExists = true;
                itemIndex = i;
                // Extract the old price from the bill line
                String[] lineParts = billLines[i].split("\t\t");
                oldPrice = Double.parseDouble(lineParts[1]);
                break;
            }
        }

        if (qty > 0 && jCheckBox27.isSelected()) {
            if (itemExists) {
                // Update the existing item quantity and price
                billLines[itemIndex] = itemName + "\t\t\t" + price;
                total = total - oldPrice + price;
            } else {
                // Add the new item to the bill
                x++;
                if (x == 1) {
                    royalCafe();
                }
                jTextArea1.append(itemName + "\t\t\t" + price + "\n");
                total += price;
            }
        } else if (qty == 0 && itemExists) {
            // Remove the item from the bill
            total -= oldPrice;
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i != itemIndex) {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
            jCheckBox27.setSelected(false);
        } else {
            jCheckBox27.setSelected(false);
        }

        // Update the bill text area with the updated lines
        if (itemExists && qty > 0) {
            StringBuilder updatedBill = new StringBuilder();
            for (int i = 0; i < billLines.length; i++) {
                if (i == itemIndex) {
                    updatedBill.append(itemName + "\t\t\t" + price + "\n");
                } else {
                    updatedBill.append(billLines[i] + "\n");
                }
            }
            jTextArea1.setText(updatedBill.toString());
        }

        // Update tax and due date
        if (total == 0) {
            tax = 0;  // Set tax to 0 if the total is 0
        } else {
            getTax(total);
        }
        dudate();
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaxActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void jTextFieldsubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsubTotalActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "You haven't selected any item");
        } else {
            jTextArea1.setText(jTextArea1.getText()
                    + "\n******************************************************************************\n"
                    + "tax: \t\t\t" + tax + "\n"
                    + "Sub Total: \t\t\t" + total + "\n"
                    + "Total: \t\t\t" + (total + tax) + "\n\n"
                    + "********************************Thank You***********************************"
            );
            btntotal.setEnabled(false);
        }
        totalbutton();


    }//GEN-LAST:event_btntotalActionPerformed

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        if (total != 0) {
            if (!btntotal.isEnabled()) {
                try {
                    jTextArea1.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "First,you should calculate the total price");
            }

        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchase any product");
        }

    }//GEN-LAST:event_btnReceiptActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.valueOf(s);
            this.setOpacity(f);

            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcashActionPerformed
        double pay = Double.valueOf(jTextFieldcash.getText());
        double balance = pay - Double.valueOf(jTextFieldTotal.getText());
        DecimalFormat df = new DecimalFormat();
        jLabelbalance.setText(String.valueOf(df.format(balance)) + ".00");
        if (balance < 0) {
            JOptionPane.showMessageDialog(null, "The amount the customer gave is not enought for his purchase", "Warning", 2);
            btnReceipt.setEnabled(false);
        }
        else {
            btnReceipt.setEnabled(true);
        }
    }//GEN-LAST:event_jTextFieldcashActionPerformed

    public void getTax(double t) {
        if (t >= 10.00 && t <= 100.00) {
            tax = 47.00;
        } else if (t > 100.00 && t <= 500.00) {
            tax = 62.00;
        } else if (t > 500.00 && t <= 800.00) {
            tax = 84.00;
        } else if (t > 800.00 && t <= 1500.00) {
            tax = 105.00;
        } else if (t > 1500.00 && t <= 2000.00) {
            tax = 127.00;
        } else {
            tax = 150.00;
        }
    }

    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyy");
                    String time = tf.format(date);
                    jTxTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));
                }
            }
        }).start();
    }

    public void royalCafe() {
        int purchaseid = 15020 + (int) (Math.random() * 80800);
        jTextArea1.setText("*****************************Royal Food Corner*****************************\n" + "Time: " + jTxTime.getText() + "\t" + " Date: " + jTxtDate.getText() + "\n" + "Purchase Id:  " + purchaseid + "\n" + "Cashier: D_I_N_U" + "\n" + "******************************************************************************\n" + "Item Name:\t\t\t" + "Price(LKR)\n");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btntotal;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelbalance;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldcash;
    private javax.swing.JTextField jTextFieldsubTotal;
    private javax.swing.JLabel jTxTime;
    private javax.swing.JLabel jTxtDate;
    // End of variables declaration//GEN-END:variables

    private SimpleDateFormat SimpleDateFormat(String yyyyMMMdd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
