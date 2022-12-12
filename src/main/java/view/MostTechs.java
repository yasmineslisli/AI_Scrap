/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static com.google.common.io.Files.map;
import static database.HandleDB.fetchRequirements;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author ryota
 */
public class MostTechs extends javax.swing.JFrame {

    /**
     * Creates new form MostTechs
     */
    public MostTechs() {
        initComponents();
        fetchTechs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(33, 120, 219));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 120, 219));
        jLabel1.setText("Most Wanted Technologies");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jButton1.setBackground(new java.awt.Color(33, 120, 219));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(276, 276, 276))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(259, 259, 259))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(41, 41, 41)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        PreTraining cp = null;
        cp = new PreTraining();
        cp.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    private void fetchTechs() {

        HashMap<Integer, Integer> wanted = new HashMap<Integer, Integer>();
        ArrayList<String> requirements = fetchRequirements();
        int count = 0;
        int size = requirements.size();
        System.out.println(size);

        for (int i = 0; i < 45; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                String requi = requirements.get(j).split(" ")[i];
                if (requi.equals("1")) {
                    sum++;
                }

            }
            double frequence = sum / size;
            wanted.put(i, sum);
        }

        // for(Map.Entry m : wanted.entrySet()){
        //
        // int fre = (int) m.getValue();
        // double data = fre*1000 / size*1000 ;
        // System.out.println(m.getKey()+" -> "+m.getValue()+"--->"+data);
        // //System.out.println(data);
        // }

        // sorting
        Object[] a = wanted.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<Integer, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<Integer, Integer>) o1).getValue());
            }
        });

        HashMap<Integer, String> maxesWanted = new HashMap<Integer, String>();
        int k = 0;
        String[] technologies = { "react", "angular", "vuejs", "html", "css", "javascript", "python", "sql", "java",
                "node", "typescript", "c#", "bash", "shell", "c++", "php", "flutter", "go", "kotlin", "rust", "ruby",
                "dart", "assembly", "swift", "matlab", "mysql", "postgresql", "sqlite", "mongodb", "redis", "firebase",
                "oracle",
                "aws", "docker", "heroku", "kubernetes", "linux", "flask", "django", "asp.net", "spring", "laravel",
                "tensorflow", "react native", "keras" };
        for (Object e : a) {
            String impo = ((Map.Entry<Integer, Integer>) e).getKey() + " : "
                    + ((Map.Entry<Integer, Integer>) e).getValue();

            maxesWanted.put(++k, impo);

        }
        int t3awed = 0;
        for (Map.Entry m : maxesWanted.entrySet()) {
            // System.out.println(m.getValue());
            int val = Integer.parseInt(m.getValue().toString().split(":")[1].trim());
            // System.out.println(val);
            double ij = val * 1.0 / size;
            int res = (int) (ij * 10);
            res *= 100;
            System.out.println("res : " + res);
            int index = Integer.parseInt(m.getValue().toString().split(":")[0].trim());
            if (t3awed == 1) {

                jLabel6.setText(technologies[index]);
                JPanel panelf = new JPanel();
                panelf.setBounds(202, 100, res, 27);
                panelf.setBackground(new java.awt.Color(33,120,219));
                jPanel1.add(panelf);
                jLabel7.setText(res / 10 + "%");

            } else if (t3awed == 2) {
                jLabel2.setText(technologies[index]);
                JPanel panelq = new JPanel();
                panelq.setBounds(202, 150, res, 27);
                panelq.setBackground(new java.awt.Color(33,120,219));
                ;
                jPanel1.add(panelq);
                jLabel8.setText(res / 10 + "%");
            } else if (t3awed == 3) {
                jLabel3.setText(technologies[index]);
                JPanel panela = new JPanel();
                panela.setBounds(202, 200, res, 27);
                panela.setBackground(new java.awt.Color(33,120,219));
                jPanel1.add(panela);
                jLabel9.setText(res / 10 + "%");
            } else if (t3awed == 4) {
                jLabel4.setText(technologies[index]);
                JPanel panelz = new JPanel();
                panelz.setBounds(202, 250, res, 27);
                panelz.setBackground(new java.awt.Color(33,120,219));
                jPanel1.add(panelz);
                jLabel10.setText(res / 10 + "%");
            } else if (t3awed == 5) {
                jLabel5.setText(technologies[index]);
                JPanel panelx = new JPanel();
                panelx.setBounds(202, 300, res, 27);
                panelx.setBackground(new java.awt.Color(33,120,219));
                jPanel1.add(panelx);
                jLabel11.setText(res / 10 + "%");
            }

            t3awed++;
            // System.out.println(data);
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostTechs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostTechs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostTechs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostTechs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostTechs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private int Integer(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
