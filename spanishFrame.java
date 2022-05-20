package wordsle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;


public class spanishFrame extends javax.swing.JFrame {


    public spanishFrame() {
        initComponents();
    }

    private String[] list = {"Adios", "Salud", "Vamos", "Tener", "Poder", "Hacer", "Donde", "Nunca", "Senor", "Bacan"};
    private static boolean[] verList = {true, true, true, true, true, true, true, true, true, true};
    private String ranWord = "";
    private String gues1 = "";
    private String gues2 = "";
    private String gues3 = "";
    private String gues4 = "";
    private String gues5 = "";
    private String gues6 = "";
    private String typeGuess = "";
    private double num;
    private static int guesLeft = 6;
    private static int wordsLeft = 9;
    private static boolean canGetWord = true;
    private static boolean hasWon = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        guessB = new javax.swing.JButton();
        newB = new javax.swing.JButton();
        langB = new javax.swing.JButton();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        num = Math.random();
        if(canGetWord) {
            getRanWord();
            canGetWord = false;
        }

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("No es Wordle");

        guessB.setText("Adivinar");
        guessB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessBActionPerformed(evt);
            }
        });

        newB.setText("Nuevo");
        newB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBActionPerformed(evt);
            }
        });

        langB.setText("Cambiar Idioma");
        langB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langBActionPerformed(evt);
            }
        });

        jLabel2.setText("A");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "a");
            }
        });

        jLabel3.setText("B");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "b");
            }
        });

        jLabel4.setText("C");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "c");
            }
        });

        jLabel5.setText("D");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "d");
            }
        });

        jLabel6.setText("E");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "e");
            }
        });

        jLabel7.setText("F");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "f");
            }
        });

        jLabel8.setText("G");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "g");
            }
        });

        jLabel9.setText("H");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "h");
            }
        });

        jLabel10.setText("I");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "i");
            }
        });

        jLabel11.setText("J");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "j");
            }
        });

        jLabel12.setText("K");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "k");
            }
        });

        jLabel13.setText("L");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "l");
            }
        });

        jLabel14.setText("M");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "m");
            }
        });

        jLabel15.setText("N");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "n");
            }
        });

        jLabel16.setText("O");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "o");
            }
        });

        jLabel17.setText("P");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "p");
            }
        });

        jLabel18.setText("Q");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "q");
            }
        });

        jLabel19.setText("R");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "r");
            }
        });

        jLabel20.setText("S");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "s");
            }
        });

        jLabel21.setText("T");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "t");
            }
        });

        jLabel22.setText("U");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "u");
            }
        });

        jLabel23.setText("V");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "v");
            }
        });

        jLabel24.setText("W");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "w");
            }
        });

        jLabel25.setText("X");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "x");
            }
        });

        jLabel26.setText("Y");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "y");
            }
        });

        jLabel27.setText("Z");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt, "z");
            }
        });

        String gues = "Adivinanzas restantes:" + guesLeft;
        jLabel28.setText(gues);

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel29.setText(gues1);
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel30.setText(gues2);
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel31.setText(gues3);
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel32.setText(gues4);
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel33.setText(gues5);
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel34.setText(gues6);
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel35.setText("Palabras no Utilizadas: " + wordsLeft);
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(21, 21, 21))
                                                        .addComponent(jLabel30)
                                                        .addComponent(jLabel31)
                                                        .addComponent(jLabel32)
                                                        .addComponent(jLabel29)
                                                        .addComponent(jLabel33)
                                                        .addComponent(jLabel34))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel17)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel18)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel19))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel20)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jLabel21)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel22))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel26)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel27))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel23)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel24)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel25)))))
                                                .addGap(35, 35, 35))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(guessB)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(langB)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(newB)
                                                                .addGap(90, 90, 90))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(151, 151, 151))))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel28))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel33)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(guessB)
                                        .addComponent(newB)
                                        .addComponent(langB))
                                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>

    private void guessBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ImageIcon emoji = new ImageIcon(getClass().getResource("IMG_9708.png"));
        if(!hasWon) {
            if (guesLeft != 0) {
                String blah = jTextField1.getText();
                if (blah.length() == 5) {
                    if (guesLeft == 6) {
                        gues1 = printWord(blah);
                        jLabel29.setText(gues1);
                        guesLeft--;
                        jLabel28.setText("Adivinanzas restantes: " + guesLeft);
                        jTextField1.setText("");
                        getWin(blah);
                        changeColors(blah);
                        if(hasWon){
                            JOptionPane.showMessageDialog(null, "Ganaste, wow eso fue rapido, estas haciendo trampa?" + "\n" + "Asi que tu premio es un sueter de emoji!");
                            JOptionPane.showMessageDialog(null, "L'Emoji", "Premio",JOptionPane.INFORMATION_MESSAGE,emoji);
                            mainScreen.incrementWins();
                        }
                    } else if (guesLeft == 5) {
                        gues2 = printWord(blah);
                        jLabel32.setText(gues2);
                        guesLeft--;
                        jLabel28.setText("Guesses Left: " + guesLeft);
                        jTextField1.setText("");
                        getWin(blah);
                        changeColors(blah);
                        if(hasWon){
                            JOptionPane.showMessageDialog(null, "Ganaste, muy rapido, bien!" + "\n" + "Asi que tu premio es un sueter de emoji!");
                            JOptionPane.showMessageDialog(null, "L'Emoji", "Premio",JOptionPane.INFORMATION_MESSAGE,emoji);
                            mainScreen.incrementWins();
                        }
                    } else if (guesLeft == 4) {
                        gues3 = printWord(blah);
                        jLabel30.setText(gues3);
                        guesLeft--;
                        jLabel28.setText("Guesses Left: " + guesLeft);
                        jTextField1.setText("");
                        getWin(blah);
                        changeColors(blah);
                        if(hasWon){
                            JOptionPane.showMessageDialog(null, "Ganaste, bien!" + "\n" + "Asi que tu premio es un sueter de emoji!");
                            JOptionPane.showMessageDialog(null, "L'Emoji", "Premio",JOptionPane.INFORMATION_MESSAGE,emoji);
                            mainScreen.incrementWins();
                        }
                    } else if (guesLeft == 3) {
                        gues4 = printWord(blah);
                        jLabel31.setText(gues4);
                        guesLeft--;
                        jLabel28.setText("Guesses Left: " + guesLeft);
                        jTextField1.setText("");
                        getWin(blah);
                        changeColors(blah);
                        if(hasWon){
                            JOptionPane.showMessageDialog(null, "Ganaste, buen trabajo" + "\n" + "Asi que tu premio es un sueter de emoji!");
                            JOptionPane.showMessageDialog(null, "L'Emoji", "Premio",JOptionPane.INFORMATION_MESSAGE,emoji);
                            mainScreen.incrementWins();
                        }
                    } else if (guesLeft == 2) {
                        gues5 = printWord(blah);
                        jLabel33.setText(gues5);
                        guesLeft--;
                        jLabel28.setText("Guesses Left: " + guesLeft);
                        jTextField1.setText("");
                        getWin(blah);
                        changeColors(blah);
                        if(hasWon){
                            JOptionPane.showMessageDialog(null, "Ganaste, te tomo bastante tiempo!" + "\n" + "Asi que tu premio es un sueter de emoji!");
                            JOptionPane.showMessageDialog(null, "L'Emoji", "Premio",JOptionPane.INFORMATION_MESSAGE,emoji);
                            mainScreen.incrementWins();
                        }
                    } else if (guesLeft == 1) {
                        gues6 = printWord(blah);
                        jLabel34.setText(gues6);
                        guesLeft--;
                        jLabel28.setText("Guesses Left: " + guesLeft);
                        jTextField1.setText("");
                        getWin(blah);
                        changeColors(blah);
                        if(guesLeft == 0) {
                            if (hasWon) {
                                JOptionPane.showMessageDialog(null, "Ganaste, pense que no vas a ganar!" + "\n" + "Asi que tu premio es un sueter de emoji!");
                                JOptionPane.showMessageDialog(null, "L'Emoji", "Premio", JOptionPane.INFORMATION_MESSAGE, emoji);
                                mainScreen.incrementWins();
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Te has quedado sin conjeturas tu palabra era '" + ranWord + "'" + "\n" + "Por favor presione \"Nuevo\" para continuar jugando");
                                mainScreen.incrementLosses();
                            }
                        }
                    }

                }

            }
            else{
                JOptionPane.showMessageDialog(null, "Te has quedado sin conjeturas tu palabra era '"+ ranWord + "'" +"\n" +"Por favor presione \"Nuevo\" para continuar jugando");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ya te ganaste! Muy Bien"+"\n" +"Por favor presione \"Nuevo\" para continuar jugando" + "\n" + "O presione \"Cambiar Idoma\" para jugar en otro idioma");
        }
        typeGuess = "";
    }

    private void newBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        guesLeft = 6;
        if(getATrue()) {
            wordsLeft--;
        }
        typeGuess = "";
        hasWon = false;
        jLabel29.setText("");
        jLabel30.setText("");
        jLabel31.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel34.setText("");
        jLabel28.setText("Adivinanzas restantes: " + guesLeft);
        jLabel2.setForeground(Color.BLACK);
        jLabel3.setForeground(Color.BLACK);
        jLabel4.setForeground(Color.BLACK);
        jLabel5.setForeground(Color.BLACK);
        jLabel6.setForeground(Color.BLACK);
        jLabel7.setForeground(Color.BLACK);
        jLabel8.setForeground(Color.BLACK);
        jLabel9.setForeground(Color.BLACK);
        jLabel10.setForeground(Color.BLACK);
        jLabel11.setForeground(Color.BLACK);
        jLabel12.setForeground(Color.BLACK);
        jLabel13.setForeground(Color.BLACK);
        jLabel14.setForeground(Color.BLACK);
        jLabel15.setForeground(Color.BLACK);
        jLabel16.setForeground(Color.BLACK);
        jLabel17.setForeground(Color.BLACK);
        jLabel18.setForeground(Color.BLACK);
        jLabel19.setForeground(Color.BLACK);
        jLabel20.setForeground(Color.BLACK);
        jLabel21.setForeground(Color.BLACK);
        jLabel22.setForeground(Color.BLACK);
        jLabel23.setForeground(Color.BLACK);
        jLabel24.setForeground(Color.BLACK);
        jLabel25.setForeground(Color.BLACK);
        jLabel26.setForeground(Color.BLACK);
        jLabel27.setForeground(Color.BLACK);
        getRanWord();
        if(!getATrue()){
            JOptionPane.showMessageDialog(null, "Ups, parece que te has quedado sin palabras para jugar" + "\n" + "Vuelva a más tarde para ver si se han agregado nuevas palabras.!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Se ha elegido una nueva palabra, adivina!");
        }
    }

    private void langBActionPerformed(java.awt.event.ActionEvent evt){
        guesLeft = 6;
        wordsLeft--;
        typeGuess = "";
        hasWon = false;
        canGetWord = true;
        close();
        mainScreen o = new mainScreen();
        o.setVisible(true);
    }

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spanishFrame().setVisible(true);
            }
        });
    }

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public static boolean getATrue(){
        for(int i = 0; i < verList.length; i++){
            if(verList[i]){
                return true;
            }
        }
        return false;
    }

    public String getRanWord(){
        int cnt = 0;
        while(cnt < 10) {
            if (num > .9 && verList[9]) {
                ranWord = list[9];
                verList[9] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .8 && verList[8]) {
                ranWord = list[8];
                verList[8] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .7 && verList[7]) {
                ranWord = list[7];
                verList[7] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .6 && verList[6]) {
                ranWord = list[6];
                verList[6] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .5 && verList[5]) {
                ranWord = list[5];
                verList[5] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .4 && verList[4]) {
                ranWord = list[4];
                verList[4] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .3 && verList[3]) {
                ranWord = list[3];
                verList[3] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .2 && verList[2]) {
                ranWord = list[2];
                verList[2] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .1 && verList[1]) {
                ranWord = list[1];
                verList[1] = false;
                System.out.println(ranWord);
                return ranWord;
            } else if (num > .0 && verList[0]) {
                ranWord = list[0];
                verList[0] = false;
                System.out.println(ranWord);
                return ranWord;
            }
            num = Math.random();
            cnt++;
        }
        return null;
    }

    public String printWord(String guess){
        String gues = "";
        for(int i = 0; i < guess.length(); i ++){
            String temp = guess.substring(i, i+1).toUpperCase();
            gues += temp + "  ";
        }
        return gues;
    }

    public boolean getWin(String guessNum){
        if(guessNum.equalsIgnoreCase(ranWord)){
            hasWon = true;
            return true;
        }
        return false;
    }

    public void changeColors(String guess){
        String theGuess = guess.toLowerCase();
        String hidWord = ranWord.toLowerCase();
        for(int i = 0; i < guess.length(); i++){
            boolean found = false;
            boolean notFound = false;
            boolean wrongPos = false;
            if(theGuess.substring(i,i+1).equals(hidWord.substring(i,i+1))){
                found = true;
            }
            else if(hidWord.contains(theGuess.substring(i, i+1))){
                wrongPos = true;
            }
            else{
                notFound = true;
            }
            if(theGuess.substring(i,i+1).equalsIgnoreCase("A")){
                if(found){
                    jLabel2.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel2.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel2.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("B")){
                if(found){
                    jLabel3.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel3.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel3.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("C")){
                if(found){
                    jLabel4.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel4.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel4.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("D")){
                if(found){
                    jLabel5.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel5.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel5.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("E")){
                if(found){
                    jLabel6.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel6.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel6.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("F")){
                if(found){
                    jLabel7.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel7.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel7.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("G")){
                if(found){
                    jLabel8.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel8.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel8.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("H")){
                if(found){
                    jLabel9.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel9.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel9.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("I")){
                if(found){
                    jLabel10.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel10.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel10.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("J")){
                if(found){
                    jLabel11.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel11.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel11.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("K")){
                if(found){
                    jLabel12.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel12.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel12.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("L")){
                if(found){
                    jLabel13.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel13.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel13.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("M")){
                if(found){
                    jLabel14.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel14.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel14.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("N")){
                if(found){
                    jLabel15.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel15.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel15.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("O")){
                if(found){
                    jLabel16.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel16.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel16.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("P")){
                if(found){
                    jLabel17.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel17.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel17.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("Q")){
                if(found){
                    jLabel18.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel18.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel18.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("R")){
                if(found){
                    jLabel19.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel19.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel19.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("S")){
                if(found){
                    jLabel20.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel20.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel20.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("T")){
                if(found){
                    jLabel21.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel21.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel21.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("U")){
                if(found){
                    jLabel22.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel22.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel22.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("V")){
                if(found){
                    jLabel23.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel23.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel23.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("W")){
                if(found){
                    jLabel24.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel24.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel24.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("X")){
                if(found){
                    jLabel25.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel25.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel25.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("Y")){
                if(found){
                    jLabel26.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel26.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel26.setForeground(Color.GRAY);
                }
            }
            else if(theGuess.substring(i,i+1).equalsIgnoreCase("Z")){
                if(found){
                    jLabel27.setForeground(Color.GREEN);
                }
                else if(wrongPos){
                    jLabel27.setForeground(Color.YELLOW);
                }
                else if(notFound){
                    jLabel27.setForeground(Color.GRAY);
                }
            }

        }
    }

    private void jLabelMouseClicked(java.awt.event.MouseEvent evt, String letter) {
        // TODO add your handling code here:
        typeGuess += letter;
        jTextField1.setText(typeGuess);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton guessB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private static javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton langB;
    private javax.swing.JButton newB;
    private javax.swing.JLabel jLabel35;
    // End of variables declaration
}
