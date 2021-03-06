/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apilolpi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author fernando.asilva10
 */
public class MostraInvocador1 extends javax.swing.JFrame{
        
    
    public void graficoBarraJogador (int top, int jungle, int mid, int bot,int identfy) throws FileNotFoundException, IOException{
        DefaultCategoryDataset graficoBarra1 = new DefaultCategoryDataset();
        
        graficoBarra1.setValue(top, "Lane", "TOP");
        graficoBarra1.setValue(jungle, "Lane", "JUNGLE");
        graficoBarra1.setValue(mid, "Lane", "MID");
        graficoBarra1.setValue(bot, "Lane", "BOT");
        
        JFreeChart grafico = ChartFactory.createBarChart("% de jogos por lane", "lane", "%", graficoBarra1,PlotOrientation.VERTICAL,false,true,false);
        
        ChartPanel graf = new ChartPanel(grafico, 415, 260, 415, 260, 415, 260, false, false, false, false, false, false);
        if(identfy == 1){
            
            jPanel1.removeAll();
            jPanel1.add(graf);
            jPanel1.validate();
 
        }
        if (identfy == 2) {
            
            jPanel2.removeAll();
            jPanel2.add(graf);
            jPanel2.validate();
        }
    }
    
    public void graficoPizzaLigaSolo (int wins, int losses,int identify) throws FileNotFoundException, IOException{
        DefaultPieDataset graficoPizza = new DefaultKeyedValuesDataset();
        
        graficoPizza.setValue("vitorias", wins);
        graficoPizza.setValue("derrotas", losses);
        
        JFreeChart grafico = ChartFactory.createPieChart("Rate SoloQueue", graficoPizza, true, true, false);
        
        /*ChartPanel graf = new ChartPanel(grafico, 415, 260, 415, 260, 415, 260, false, false, false, false, false, false);

        
        if(identify == 1){
            
            jPanel1.removeAll();
            jPanel1.add(graf);
            jPanel1.validate();
 
        }
        if (identify == 2) {
            
            jPanel2.removeAll();
            jPanel2.add(graf);
            jPanel2.validate();
        }*/
        
    }
    
    public void graficoPizzaLigaFlex (int wins, int losses,int identify) throws FileNotFoundException, IOException{
        DefaultPieDataset graficoPizza = new DefaultKeyedValuesDataset();
        
        graficoPizza.setValue("vitorias", wins);
        graficoPizza.setValue("derrotas", losses);
        
        JFreeChart grafico = ChartFactory.createPieChart("Rate FLEX", graficoPizza, true, true, false);
        
        /*ChartPanel graf = new ChartPanel(grafico, 415, 260, 415, 260, 415, 260, false, false, false, false, false, false);

        
        if(identify == 1){
            
            jPanel1.removeAll();
            jPanel1.add(graf);
            jPanel1.validate();
 
        }
        if (identify == 2) {
            
            jPanel2.removeAll();
            jPanel2.add(graf);
            jPanel2.validate();
        }*/
    }
    
    public MostraInvocador1() {
        initComponents();
        setSize(1363,733);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(1334, 731, 29, 2);

        button1.setActionCommand("Buscar novo Invocador");
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        button1.setFont(new java.awt.Font("BankGothic Md BT", 1, 20)); // NOI18N
        button1.setLabel("Buscar novo Invocador");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(10, 11, 415, 77);

        button2.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        button2.setLabel("Gerar Gráficos");
        getContentPane().add(button2);
        button2.setBounds(435, 11, 493, 77);

        button3.setFont(new java.awt.Font("BankGothic Md BT", 1, 20)); // NOI18N
        button3.setLabel("Comparar Invocador");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3);
        button3.setBounds(938, 11, 415, 77);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 160, 140, 70);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busque um invocador");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 158, 270, 68);
        jLabel1.getAccessibleContext().setAccessibleName("invocadorMostra");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Myanmar Text", 1, 40)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("INVOCADOR");
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 98, 415, 54);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Myanmar Text", 1, 40)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("ELO");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jTextField2.setSelectedTextColor(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(10, 232, 415, 54);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 292, 415, 168);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Myanmar Text", 1, 40)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("INVOCADOR");
        jTextField3.setSelectedTextColor(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(938, 98, 415, 54);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Busque um invocador");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(910, 160, 270, 68);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Myanmar Text", 1, 40)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("ELO");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jTextField4.setSelectedTextColor(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(938, 232, 415, 54);

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(938, 292, 415, 168);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 11, 415, 259);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1210, 160, 140, 70);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(940, 470, 416, 261);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 480, 416, 261);

        jToggleButton1.setText("Gráfico Z");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(430, 580, 250, 50);
        jToggleButton1.getAccessibleContext().setAccessibleName("");

        jToggleButton2.setText("Gráfico X");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(430, 480, 250, 50);

        jToggleButton3.setText("Gráfico X");
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(690, 480, 250, 50);

        jToggleButton4.setText("Gráfico Y");
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(690, 530, 250, 50);

        jToggleButton5.setText("Gráfico Z");
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(690, 580, 250, 50);

        jToggleButton6.setText("Gráfico Y");
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(430, 530, 250, 50);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_lol/wpp/wpp.jpg"))); // NOI18N
        getContentPane().add(labelFundo);
        labelFundo.setBounds(0, 0, 1360, 730);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        BuscaJogador busca = new BuscaJogador();
        BuscaMatches partida = null;
        BuscaLiga elo = null;
        BuscaCampeao campeao = null;
//        GerarGrafico grafico = new GerarGrafico();
        
        
        try {
            busca.BuscaJogador();
            partida = new BuscaMatches(busca.accountId,busca.server,busca.key);
            elo = new BuscaLiga(busca.id,busca.server,busca.key);
            campeao = new BuscaCampeao(busca.server, busca.id,busca.key);
            graficoBarraJogador(partida.top, partida.jungle, partida.mid, partida.bottom, 1);
            graficoPizzaLigaSolo(elo.wins, elo.losses, 1);
            graficoPizzaLigaFlex(elo.wins2, elo.losses2, 1);
        } catch (IOException ex) {
            Logger.getLogger(MostraInvocador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            jTextField1.setText(busca.nome);
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_lol_champion/"+campeao.nomeCamp+".png")));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLabel1.setText("<html><body>"
                + "Level: "+busca.level+"<br/>"
                + "Campeão principal: "+campeao.nomeCamp+"<br/>"
                + "Nível de maestria: "+campeao.lvlMst+"   Pontos: "+campeao.mstPoints+"<br/>"       
                +"</body></html>");
            jLabel3.setText("<html><body>"
                + elo.queue+"<br/>"
                + elo.tier+": " +elo.rank+  " -- " +elo.ln+ "<br/>"
                + "Pontos: " +elo.pdls+"<br/><br/>"
                +  "<br/><left>"
                + elo.queue2+"<br/>"
                + elo.tier2+": " +elo.rank2+  " -- " +elo.ln2+"<br/>"
                + "Pontos: " +elo.pdls2+ "<br/><br/>"
                +"</body></html>"
                );
            

    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        BuscaJogador busca2 = new BuscaJogador();
        BuscaCampeao campeao2 = null;
        BuscaLiga elo2 = null;
        BuscaMatches partida2 = null;
        //GerarGrafico grafico2 = new GerarGrafico();
        
        //BuscaJogador buscaEmMostra = new BuscaJogador();
        try {
            busca2.BuscaJogador();
            elo2 = new BuscaLiga(busca2.id,busca2.server, busca2.key);
            partida2 = new BuscaMatches(busca2.accountId, busca2.server, busca2.key);
            campeao2 = new BuscaCampeao(busca2.server, busca2.id, busca2.key);
            graficoBarraJogador(partida2.top, partida2.jungle, partida2.mid, partida2.bottom, 2);
            graficoPizzaLigaSolo(elo2.wins, elo2.losses, 2);
            graficoPizzaLigaFlex(elo2.wins2, elo2.losses2, 2);
        } catch (IOException ex) {
            Logger.getLogger(MostraInvocador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            jTextField3.setText(busca2.nome);
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_lol_champion/"+campeao2.nomeCamp+".png")));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel4.setText("<html><body><left>"
                + "Level: "+busca2.level+"<br/>"
                + "Campeão principal: "+campeao2.nomeCamp+"<br/>"
                + "Nível de maestria: "+campeao2.lvlMst+"   Pontos: "+campeao2.mstPoints+"<br/>"       
                +"</body></html>");
            jLabel5.setText("<html><body>"
                + elo2.queue+"<br/>"
                + elo2.tier+": " +elo2.rank+  " -- " +elo2.ln+ "<br/>"
                + "Pontos: " +elo2.pdls+"<br/><br/>"
                +  "<br/><left>"
                + elo2.queue2+"<br/>"
                + elo2.tier2+": " +elo2.rank2+  " -- " +elo2.ln2+"<br/>"
                + "Pontos: " +elo2.pdls2+ "<br/><br/>"
                +"</body></html>"
                );
            

    }//GEN-LAST:event_button3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JLabel labelFundo;
    // End of variables declaration//GEN-END:variables
}
