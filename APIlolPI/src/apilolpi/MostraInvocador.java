/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apilolpi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando.asilva10
 */
public class MostraInvocador extends javax.swing.JFrame{

    
    
    public MostraInvocador() {
        initComponents();
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        button1.setActionCommand("Buscar novo Invocador");
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        button1.setFont(new java.awt.Font("BankGothic Md BT", 1, 20)); // NOI18N
        button1.setLabel("Buscar novo Invocador");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        button2.setLabel("Gerar Gráficos");

        button3.setFont(new java.awt.Font("BankGothic Md BT", 1, 20)); // NOI18N
        button3.setLabel("Comparar Invocador");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(379, 379, 379)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("invocadorMostra");

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        BuscaJogador busca = new BuscaJogador();
        BuscaMatches partida = null;
        BuscaLiga elo = null;
        BuscaCampeao campeao = null;
        GerarGrafico grafico = new GerarGrafico();
        
        
        try {
            busca.BuscaJogador();
            partida = new BuscaMatches(busca.accountId,busca.server,busca.key);
            elo = new BuscaLiga(busca.id,busca.server,busca.key);
            campeao = new BuscaCampeao(busca.server, busca.id,busca.key);
            grafico.graficoBarraJogador(partida.top, partida.jungle, partida.mid, partida.bottom, 1);
        } catch (IOException ex) {
            Logger.getLogger(MostraInvocador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLabel1.setText("<html><body>"
                + "---------------------Invocador---------------------<br/><br/>"
                + "Invocador:  "+busca.nome+"<br/>"
                + "Level:      "+busca.level+"<br/>"
                + "Campeão principal: "+campeao.nomeCamp+"<br/>"
                + "Nível de maestria: "+campeao.lvlMst+"    Pontos: "+campeao.mstPoints+"<br/>"     
                + "<br/>-------------------------ELO-------------------------<br/><center>"
                + elo.queue + "<center/><br/><left>"
                + elo.tier + ":" + elo.rank+ "--" + elo.ln + "<br/>"
                + "Pontos: " + elo.pdls + "<br/><br/>"
                + elo.queue2 + "<center/><br/><left>"
                + elo.tier2 + ":" + elo.rank2+ "--" + elo.ln2 + "<br/>"
                + "Pontos: " + elo.pdls2 + "<br/><br/>"
                + "-----------------------Partidas----------------------<br/>"
                + "TOP: " + partida.top + "<br/>"
                + "JUNGLE: " + partida.jungle + "<br/>"
                + "MID: " + partida.mid + "<br/>"
                + "BOT: " + partida.bottom + "<br/>"
                  
                +"</body></html>");
        
        
        

        
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        BuscaJogador busca2 = new BuscaJogador();
        BuscaCampeao campeao2 = null;
        BuscaLiga elo2 = null;
        BuscaMatches partida2 = null;
        GerarGrafico grafico2 = new GerarGrafico();
        
        //BuscaJogador buscaEmMostra = new BuscaJogador();
        try {
            busca2.BuscaJogador();
            elo2 = new BuscaLiga(busca2.id,busca2.server, busca2.key);
            partida2 = new BuscaMatches(busca2.accountId, busca2.server, busca2.key);
            campeao2 = new BuscaCampeao(busca2.server, busca2.id, busca2.key);
            grafico2.graficoBarraJogador(partida2.top, partida2.jungle, partida2.mid, partida2.bottom, 2);
        } catch (IOException ex) {
            Logger.getLogger(MostraInvocador.class.getName()).log(Level.SEVERE, null, ex);
        }
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel2.setText("<html><body>"
                + "---------------------Invocador---------------------<br/><br/>"
                + "Invocador:  "+busca2.nome+"<br/>"
                + "Level:      "+busca2.level+"<br/>"
                + "Campeão principal: "+campeao2.nomeCamp+"<br/>"
                + "Nível de maestria: "+campeao2.lvlMst+"    Pontos: "+campeao2.mstPoints+"<br/>"     
                + "<br/>-------------------------ELO-------------------------<br/><center>"
                + elo2.queue + "<center/><br/><left>"
                + elo2.tier + ":" + elo2.rank+ "--" + elo2.ln + "<br/>"
                + "Pontos: " + elo2.pdls + "<br/><br/>"
                + elo2.queue2 + "<center/><br/><left>"
                + elo2.tier2 + ":" + elo2.rank2+ "--" + elo2.ln2 + "<br/>"
                + "Pontos: " + elo2.pdls2 + "<br/><br/>"
                + "-----------------------Partidas----------------------<br/>"
                + "TOP: " + partida2.top + "<br/>"
                + "JUNGLE: " + partida2.jungle + "<br/>"
                + "MID: " + partida2.mid + "<br/>"
                + "BOT: " + partida2.bottom + "<br/>"
                  
                +"</body></html>");
    }//GEN-LAST:event_button3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
