package wordsle;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//This class displays the language selection screen with three buttons for a french, spanish, and english version of wordle 
//The class also displays the wins and losses for the player
public class mainScreen extends javax.swing.JFrame {

    private static int cnt = 1;
    private static int wins = 0;
    private static int losses = 0;

    //Constructor calls a method to design the JFrame
    public mainScreen() {
        initComponents();
    }


    //This method creates all of the assets for the JFrame
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        englishB = new javax.swing.JButton();
        frenchB = new javax.swing.JButton();
        spanishB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Hey Welcome to Totally not Wordle");

        jLabel2.setText("Choose what language your word would be in");

        englishB.setText("English");
        englishB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishBActionPerformed(evt);
            }
        });

        frenchB.setText("French");
        frenchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchBActionPerformed(evt);
            }
        });

        spanishB.setText("Spanish");
        spanishB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spanishBActionPerformed(evt);
            }
        });

        jLabel3.setText("Each language has ten possible words  ");

        jLabel4.setText("Todays Record ( Wins:Losses)");

        jLabel6.setText(wins + " : " + losses);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(englishB)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(frenchB)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(spanishB))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(173, 173, 173)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(englishB)
                                        .addComponent(frenchB)
                                        .addComponent(spanishB))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    //This method is used to switch to the french version of wordle when pressed
    private void frenchBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(frenchFrame.getATrue()) {
            if(cnt == 1) {
                JOptionPane.showMessageDialog(null, "Indice:" + "\n"
                        + "-Si une lettre est verte cela signifie qu'elle est dans le mot" + "\n"
                        + "-Si une lettre est grise c'est qu'elle n'est pas dans le mot" + "\n"
                        + "-Si une lettre est jaune c'est qu'elle n'est pas au bon endroit"+ "\n"
                        + "-Si une lettre est noire cela signifie qu'elle n'a pas encore été utilisée" + "\n"
                        + "-N'importe laquelle des lettres sur le côté peut être pressée pour taper un mot");
                cnt = 2;
            }
            close();
            frenchFrame o = new frenchFrame();
            o.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Oups, il semble que vous n'ayez plus de mots pour jouer" + "\n" + "Veuillez revenir plus tard pour voir si de nouveaux mots ont été ajoutés!" + "\n"
                    + "Ou choisissez une langue différente, cela peut augmenter la difficulté à moins que vous ne connaissiez déjà la langue");
        }
    }

    //This method is used to switch to the spanish version of wordle when pressed
    private void spanishBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(spanishFrame.getATrue()) {
            if(cnt == 1) {
                JOptionPane.showMessageDialog(null, "Insinuacion:" + "\n"
                        + "-Si una letra es verde significa que está en la palabra" + "\n"
                        + "-Si una letra es gris significa qus no esta en la palabra" + "\n"
                        + "-Si un letra es amarillo significa que no esta en el lugar correcto" + "\n"
                        + "-Si una letra es negro significa ques no se ha usado" + "\n"
                        + "-Cualquiera de las letras en el lateral se puede presionar para escribir una palabra");
                cnt = 2;
            }
            close();
            spanishFrame o = new spanishFrame();
            o.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ups,parece que no tienes mas plabaras para jugar" + "\n" + "Por favor vuelva a mas tarde por ver si se han agregado nuevas palabras!" + "\n"
                    + "O escoger une idioma differente, esto puedes hacer mas dificil si no sepas la idioma");
        }
    }

    //This method is used to switch to the english version of wordle when pressed
    private void englishBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(englishFrame.getATrue()) {
            if(cnt == 1) {
                JOptionPane.showMessageDialog(null, "Hint:" + "\n"
                        + "-If a letter is green that means it is in the word" + "\n"
                        + "-If a letter is gray that means it is not in the word" + "\n"
                        + "-If a letter is yellow that means that it is not in the right position"+ "\n"
                        + "-If a letter is black that means it has not been used yet" + "\n"
                        + "-Any of the letters on the side can be pressed to type out a word");
                cnt = 2;
            }
            close();
            englishFrame o = new englishFrame();
            o.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Oops, it seems you have run out of words to play" + "\n" + "Please come back to later to see if new words have been put in!" + "\n"
                    + "Or choose a different language, this can increase the difficulty unless you know the language already");
        }
    }

    //main method used to run the program directly from this class
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen().setVisible(true);
            }
        });
    }

    //This method closes the JFrame when needed
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    //Increments used for the win-lose ratio that is diplayed
    public static void incrementWins(){wins++;}
    public static void incrementLosses(){losses++;}

    // Variables declaration - do not modify
    private javax.swing.JButton englishB;
    private javax.swing.JButton frenchB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton spanishB;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration
}
