
import java.awt.Color;
import static java.lang.Character.isWhitespace;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akash
 */
public class frmEncryption extends javax.swing.JFrame {

    /**
     * Creates new form frmEncryption
     */
    // Define constant variables for text input limit, which will allow characters till length = 30
    final int TXT_LIMIT_ENCRYPT = 30;
    
    // String variables declared to store User inputted message for Encryption and Decryption and also for storing the final Encrypted and Decrypted message
    String InputMsgtoEncrypt;
    String InputMsgtoDecrypt;
    String OutputEncryptMsg;
    String OutputDecryptMsg;
    String ReverseEncryptMsg;
    String ReverseDecryptMsg;
    String paddedbefore;
    String paddedafter;
    
    // char variables declared to store each character from input message and also for storing converted character after encryption or decryption
    char CurrChar;
    char tempChar3;
    char ConvChar;
    
    // int variables declared to store Ascii value of each character from input message and also for storing Ascii value of converted character after encryption or decryption
    int CurrAscii;
    int ConvAscii;
    
    // boolean variables declared to validate the Text input for encryption and decryption
    boolean EncryptFlag = false;
    boolean DecryptFlag = false;
    
    
    public frmEncryption() {
        initComponents();
        
        // Calling ProgInit procedure, to initialize input text fields, Error Message label and Final message labels
        ProgInit();
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblEncryptedMsg = new javax.swing.JLabel();
        txtMsgtoEncrypt = new javax.swing.JTextField();
        lblFinalEncryptedMsg = new javax.swing.JLabel();
        btnEncrypt = new javax.swing.JButton();
        lblUserNote1 = new javax.swing.JLabel();
        lblRespforEncryption = new javax.swing.JLabel();
        lblDividerline = new javax.swing.JLabel();
        lblUserNote2 = new javax.swing.JLabel();
        txtMsgtoDecrypt = new javax.swing.JTextField();
        btnDecrypt = new javax.swing.JButton();
        lblRespforDecryption = new javax.swing.JLabel();
        lblFinalDecryptedMsg = new javax.swing.JLabel();
        btnCopy = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        lblOR = new javax.swing.JLabel();
        lblDecryptPart = new javax.swing.JLabel();
        lblEncryptPart = new javax.swing.JLabel();
        lblDividerline1 = new javax.swing.JLabel();
        lblInstruction1 = new javax.swing.JLabel();
        lblInstruction2 = new javax.swing.JLabel();
        lblInstruction3 = new javax.swing.JLabel();
        lblInstruction4 = new javax.swing.JLabel();
        lblInstruction5 = new javax.swing.JLabel();
        lblTopSecretMsg1 = new javax.swing.JLabel();
        lblTopSecretMsg2 = new javax.swing.JLabel();
        lblInstruction6 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 102, 255));
        lblTitle.setText("Encrypt/Decrypyt Software");

        lblEncryptedMsg.setText(" ");

        txtMsgtoEncrypt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMsgtoEncrypt.setForeground(new java.awt.Color(0, 0, 255));
        txtMsgtoEncrypt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMsgtoEncryptKeyReleased(evt);
            }
        });

        lblFinalEncryptedMsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFinalEncryptedMsg.setForeground(new java.awt.Color(255, 0, 0));
        lblFinalEncryptedMsg.setText("jLabel1");
        lblFinalEncryptedMsg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnEncrypt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEncrypt.setForeground(new java.awt.Color(102, 102, 0));
        btnEncrypt.setText("CLICK for ENCRYPT");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        lblUserNote1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserNote1.setForeground(new java.awt.Color(51, 0, 51));
        lblUserNote1.setText("Input the Message below, that you want to ENCRYPT  :");

        lblRespforEncryption.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRespforEncryption.setForeground(new java.awt.Color(51, 0, 51));
        lblRespforEncryption.setText("Response message");

        lblDividerline.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDividerline.setForeground(new java.awt.Color(0, 153, 153));
        lblDividerline.setText("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        lblUserNote2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserNote2.setForeground(new java.awt.Color(51, 0, 51));
        lblUserNote2.setText("Input the Message (encrypted by this software) manually below, that you want to DECRYPT  :");

        txtMsgtoDecrypt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMsgtoDecrypt.setForeground(new java.awt.Color(0, 0, 255));
        txtMsgtoDecrypt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMsgtoDecryptKeyReleased(evt);
            }
        });

        btnDecrypt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDecrypt.setForeground(new java.awt.Color(102, 102, 0));
        btnDecrypt.setText("CLICK for DECRYPT");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        lblRespforDecryption.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRespforDecryption.setForeground(new java.awt.Color(51, 0, 51));
        lblRespforDecryption.setText("Response message");

        lblFinalDecryptedMsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFinalDecryptedMsg.setForeground(new java.awt.Color(255, 0, 0));
        lblFinalDecryptedMsg.setText("jLabel1");
        lblFinalDecryptedMsg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnCopy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCopy.setForeground(new java.awt.Color(0, 102, 102));
        btnCopy.setText("CLICK here to COPY above ENCRYPTED MESSAGE");
        btnCopy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        btnClearAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClearAll.setForeground(new java.awt.Color(255, 102, 0));
        btnClearAll.setText("CLEAR ALL");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        lblOR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOR.setForeground(new java.awt.Color(255, 0, 0));
        lblOR.setText("OR");

        lblDecryptPart.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblDecryptPart.setForeground(new java.awt.Color(0, 102, 102));
        lblDecryptPart.setText("DECRYPT a MESSAGE");
        lblDecryptPart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblEncryptPart.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblEncryptPart.setForeground(new java.awt.Color(0, 102, 102));
        lblEncryptPart.setText("ENCRYPT a MESSAGE");
        lblEncryptPart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblDividerline1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDividerline1.setForeground(new java.awt.Color(0, 153, 153));
        lblDividerline1.setText("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        lblInstruction1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblInstruction1.setForeground(new java.awt.Color(102, 0, 51));
        lblInstruction1.setText("Instructions");

        lblInstruction2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstruction2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstruction2.setText("1. User can input message in the 1st section to Encrypt the message - Input should not be blank and < 31 characters");

        lblInstruction3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstruction3.setForeground(new java.awt.Color(51, 51, 51));
        lblInstruction3.setText("2. Encryption involves Reversal of message, Caeser Cipher and addition of characters to strengthen the security");

        lblInstruction4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstruction4.setForeground(new java.awt.Color(51, 51, 51));
        lblInstruction4.setText("3. User can input message manually in the 2nd section to Decrypt the message or for ease, can click the COPY button to ");

        lblInstruction5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstruction5.setForeground(new java.awt.Color(51, 51, 51));
        lblInstruction5.setText("    populate the text field with the Encrypted message from before. Input should not be blank. ");

        lblTopSecretMsg1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTopSecretMsg1.setForeground(new java.awt.Color(255, 0, 0));
        lblTopSecretMsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTopSecretMsg1.setText("-  TOP SECRET -");

        lblTopSecretMsg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTopSecretMsg2.setForeground(new java.awt.Color(255, 0, 0));
        lblTopSecretMsg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTopSecretMsg2.setText("-  TOP SECRET -");

        lblInstruction6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstruction6.setForeground(new java.awt.Color(51, 51, 51));
        lblInstruction6.setText("4. This software can only DECRYPT the message that has been encrypted using this Software");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EditSecretCompSci.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMsgtoEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEncryptedMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserNote1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRespforEncryption, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFinalEncryptedMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(btnDecrypt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnEncrypt)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblDividerline1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstruction1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstruction3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInstruction2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInstruction4, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInstruction5, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInstruction6, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(lblEncryptPart, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRespforDecryption, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMsgtoDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFinalDecryptedMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserNote2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(lblDecryptPart, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(lblOR))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDividerline, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblImage)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(lblTopSecretMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(lblTopSecretMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTopSecretMsg1)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(lblInstruction1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruction2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblDividerline1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEncryptPart)
                .addGap(35, 35, 35)
                .addComponent(lblUserNote1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEncryptedMsg)
                    .addComponent(txtMsgtoEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnEncrypt)
                .addGap(18, 18, 18)
                .addComponent(lblRespforEncryption)
                .addGap(31, 31, 31)
                .addComponent(lblFinalEncryptedMsg)
                .addGap(58, 58, 58)
                .addComponent(lblDividerline)
                .addGap(18, 18, 18)
                .addComponent(lblDecryptPart)
                .addGap(32, 32, 32)
                .addComponent(lblUserNote2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopy)
                .addGap(32, 32, 32)
                .addComponent(txtMsgtoDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnDecrypt)
                .addGap(18, 18, 18)
                .addComponent(lblRespforDecryption)
                .addGap(40, 40, 40)
                .addComponent(lblFinalDecryptedMsg)
                .addGap(59, 59, 59)
                .addComponent(btnClearAll)
                .addGap(32, 32, 32)
                .addComponent(lblTopSecretMsg2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Event would be triggered, when user clicks the Encrypt Button
    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        
        //Gets the input message from Text box inputted by User and store in InputMsgtoEncrypt
        InputMsgtoEncrypt = txtMsgtoEncrypt.getText();
        OutputEncryptMsg = "";
        EncryptFlag = false;
        
        //Calling ValidateInput routine to check for Spaces or length > 30, by passing the input values as (String, String) and returning the boolean
        EncryptFlag = ValidateInput (InputMsgtoEncrypt, "Encrypt");
        
        if (EncryptFlag == true)
        {
            //Calling ReverseMessage routine to reverse the input message for added security
            ReverseEncryptMsg = ReverseMessage(InputMsgtoEncrypt);
            
            //Calling PerformEncryption routine to encrypt the input message using reversal, Caesar Cipher and padding extra characters, by passing the input value String, String and returning the final encrypted message as String
            OutputEncryptMsg = PerformEncryption(ReverseEncryptMsg);
        
            //Display success message and output the Encrypted Message
            lblRespforEncryption.setForeground(Color.MAGENTA);
            lblRespforEncryption.setText("Congrats. Your input message has been successfully ENCRYPTED as below : ");
            lblFinalEncryptedMsg.setText(OutputEncryptMsg);
        
            lblRespforEncryption.setVisible(true);
            lblFinalEncryptedMsg.setVisible(true);
        }
        else
        {   
            lblRespforEncryption.setVisible(true);
            lblRespforEncryption.setForeground(Color.RED);
            lblFinalEncryptedMsg.setVisible(false);
        }
    }//GEN-LAST:event_btnEncryptActionPerformed
    
    /*
        ValidateInput

        This method valides the message inputted by the User, to check for Spaces or length > 30 and gets input message as a String & Source as a String and returns boolean

        Parameters  : String, String

        Returns     : boolean
    */
    public boolean ValidateInput (String inputmsg, String source)
    {
        //boolean variable declared to store the checkflag after validation
        boolean checkflag = false;
        
        if (source == "Encrypt")
        {
            //checking the input message for spaces or empty message and output error message accordingly
            if (inputmsg.trim().isEmpty())
            {
                lblRespforEncryption.setText("Bad Input. No message/Spaces provided. Cannot " + source + " . Try again");
            }
            //checking the input message for length > 30 only during Encryption and output error message accordingly
            else if (inputmsg.length() > TXT_LIMIT_ENCRYPT )
            {
                lblRespforEncryption.setText("Bad Input. Message exceeds limit of 30 Characters. Cannot " + source + " . Try again");
            }
            //if input message is valid, sets checkflag to TRUE
            else
            {
                checkflag = true;
            }
        }
        else
        {
            //checking the input message for spaces or empty message and output error message accordingly
            if (inputmsg.trim().isEmpty())
            {
                lblRespforDecryption.setText("Bad Input. No message/Spaces provided. Cannot " + source + " . Try again");
            }
            //checking the input message to ensure the message provided is the proper formatted encrypted message created by this software (checking for # at the start and end of message)
            else if (!((inputmsg.charAt(0) == '#') && (inputmsg.charAt(inputmsg.length()-1) == '#')))
            {
                lblRespforDecryption.setText("Bad Input format. Message not encrypted by this software. Cannot Decrypt. Try again");
            }
            else if ((inputmsg.charAt(0) == '#') && (inputmsg.charAt(inputmsg.length()-1) == '#') && (inputmsg.length() <= 2))
            {
                lblRespforDecryption.setText("Bad Input format. Message not encrypted by this software. Cannot Decrypt. Try again");
            }
            //if input message is valid, sets checkflag to TRUE
            else
            {
                checkflag = true;
            }
        }
         
        return (checkflag);
    }
    
    /*
        ReverseMessage

        This method reverses the message inputted by the User, for additional security and gets input message as a String and returns reversed message

        Parameters  : String

        Returns     : String
    */
    public String ReverseMessage (String inputmsg)
    {
        //String variable declared to store Reversed Messsge
        String ReverseMsg = "";
        
        //using for loop to check every character until the start of the message is reached and outputs the reversed message
        for (int i=inputmsg.length() - 1; i>=0; i--)
        {
            ReverseMsg = ReverseMsg + inputmsg.charAt(i);
        }
        
        return (ReverseMsg);
    }
    
    /*
        PerformEncryption

        This method encrypts the message inputted by the User, using Reversal, Caesar Cipher and padding extra characters and gets input message as a String and returns Encrypted message

        Parameters  : String

        Returns     : String
    */
    public String PerformEncryption (String inputmsg)
    {
        //String variable declared to store FinalEcryptedMsg
        String FinalEcryptedMsg = "";
        
        //using for loop to check every characters until the end of message is reached
        for (int i=0; i<inputmsg.length(); i++)
        {
            CurrChar = inputmsg.charAt(i);
            
            //If the current character is SPACE, pad 3 characters to the end of the previous word using Random function and also pad 3 characters to the start of next word
            if (isWhitespace(CurrChar))
            {
                //Random function used to pick the integer between 34 and 60
                ConvAscii = (int)Math.round(Math.random()*26+1+33);
                paddedafter = String.valueOf((char)ConvAscii) + String.valueOf((char)(ConvAscii+2))+ String.valueOf((char)(ConvAscii+4));
                paddedbefore = String.valueOf((char)(ConvAscii+1)) + String.valueOf((char)(ConvAscii+3))+ String.valueOf((char)(ConvAscii+5));
                
                FinalEcryptedMsg = FinalEcryptedMsg + paddedafter + " " + paddedbefore; 
            }
            else
            {
                CurrAscii = (int) CurrChar;
                ConvAscii = CurrAscii + 1;
                ConvChar = (char)ConvAscii;
            
                FinalEcryptedMsg = FinalEcryptedMsg + String.valueOf(ConvChar);
            }
            
        }
        
        //Pads # both at the start and end of the Final encrypted message to confirm that this message has been encrypted by the software
        FinalEcryptedMsg = "#" + FinalEcryptedMsg + "#";
        
        return (FinalEcryptedMsg);
    }
    
    //Event would be triggered, when user clicks the Decrypt Button
    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        
        //Gets the input message from Text box inputted by User and store in InputMsgtoDecrypt
        InputMsgtoDecrypt = txtMsgtoDecrypt.getText();
        OutputDecryptMsg = "";
        DecryptFlag = false;
        
        //Calling ValidateInput routine to check for Spaces, by passing the input values as (String, String) and returning the boolean
        DecryptFlag = ValidateInput (InputMsgtoDecrypt, "Decrypt");
        
        if (DecryptFlag == true)
        {
            //Calling PerformDecryption routine to decrypt the input message, by passing the input value String, String and returning the final decrypted message as String
            OutputDecryptMsg = PerformDecryption(InputMsgtoDecrypt);
            
            //Calling ReverseMessage routine to reverse the final decrypted message
            ReverseDecryptMsg = ReverseMessage(OutputDecryptMsg);
        
            //Display success message and output the Decrypted Message
            lblRespforDecryption.setForeground(Color.MAGENTA);
            lblRespforDecryption.setText("Congrats. Your input message has been successfully DECRYPTED as below : ");
            lblFinalDecryptedMsg.setText(ReverseDecryptMsg); 
        
            lblRespforDecryption.setVisible(true);
            lblFinalDecryptedMsg.setVisible(true);
        }
        else
        { 
            lblRespforDecryption.setVisible(true);
            lblRespforDecryption.setForeground(Color.RED);
            lblFinalDecryptedMsg.setVisible(false);
        }
    }//GEN-LAST:event_btnDecryptActionPerformed
    
    /*
        PerformDecryption

        This method decrypts the message inputted by the User, reversing the Caesar Cipher used to encrypt and removing extra characters padded earlier and gets input message as a String and returns Decrypted message

        Parameters  : String

        Returns     : String
    */
    public String PerformDecryption (String inputmsg)
    {
        //String variable declared to store FinalDeryptedMsg
        String FinalDeryptedMsg = "";
        
        //using for loop to check every characters until the end of message is reached
        for (int i=1; i<InputMsgtoDecrypt.length()-1; i++)
        {
            CurrChar = InputMsgtoDecrypt.charAt(i);
            CurrAscii = (int) CurrChar;
            ConvAscii = CurrAscii - 1;
            ConvChar = (char)ConvAscii;
            
            if (((InputMsgtoDecrypt.length()-1) - i) <=2)
            {
                FinalDeryptedMsg = FinalDeryptedMsg + String.valueOf(ConvChar);
            }
            else
            {
                //checks for 3 characters ahead of value of i, to see whether space is encountered and if so, reverses the padded letters applied during Encryption
                tempChar3 = InputMsgtoDecrypt.charAt(i+3);
                if (isWhitespace(tempChar3))
                {
                    i = i + 6;
                    FinalDeryptedMsg = FinalDeryptedMsg + " ";
                }
                else
                {
                    FinalDeryptedMsg = FinalDeryptedMsg + String.valueOf(ConvChar);
                }

            }
        }
        
        return (FinalDeryptedMsg);
    }
    
    //Event would be triggered, when user clicks the COPY ABOVE ENCRYPTED MESSAGE button
    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        
        //Copy the Encrypted message and displays in the Decypt Text box
        txtMsgtoDecrypt.setText(lblFinalEncryptedMsg.getText());
    }//GEN-LAST:event_btnCopyActionPerformed
    
    //Event would be triggered, when user clicks the CLEAR ALL button
    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        
        //Calling ProgInit routine to reinitialize all Text input fields and labels
        ProgInit();
        
    }//GEN-LAST:event_btnClearAllActionPerformed
    
    //Event would be triggered, when user keys input in the Input Text box to encrypt the message
    private void txtMsgtoEncryptKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMsgtoEncryptKeyReleased
        
        //resetting the FinalEncryptedMsg label and making both FinalEncryptedMsg label and Response label invisible
        lblFinalEncryptedMsg.setText("");
        lblRespforEncryption.setVisible(false);
        lblFinalEncryptedMsg.setVisible(false);
        
    }//GEN-LAST:event_txtMsgtoEncryptKeyReleased
    
    //Event would be triggered, when user keys input in the Input Text box to decrypt the message
    private void txtMsgtoDecryptKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMsgtoDecryptKeyReleased
        
        //resetting the FinalDecryptedMsg label and making both FinalDecryptedMsg label and Response label invisible
        lblFinalDecryptedMsg.setText("");
        lblRespforDecryption.setVisible(false);
        lblFinalDecryptedMsg.setVisible(false);
    }//GEN-LAST:event_txtMsgtoDecryptKeyReleased
    
    /*
        ProgInit

        This method allows the User to initialize all the input Text field and Response message fields

        Parameters  : NONE

        Returns     : NONE
    */
    public void ProgInit() {                                               
        
        //Setting blanks to Input Text field and Error/Result labels
        txtMsgtoDecrypt.setText("");
        txtMsgtoEncrypt.setText("");
        lblFinalEncryptedMsg.setText("");
        lblFinalDecryptedMsg.setText("");
        lblRespforEncryption.setVisible(false);
        lblRespforDecryption.setVisible(false);
        lblFinalEncryptedMsg.setVisible(false);
        lblFinalDecryptedMsg.setVisible(false);
        
        //Setting backgound colors to Buttons
        btnEncrypt.setBackground(Color.cyan);
        btnDecrypt.setBackground(Color.cyan);
        btnCopy.setBackground(Color.ORANGE);
        
    } 

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEncryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JLabel lblDecryptPart;
    private javax.swing.JLabel lblDividerline;
    private javax.swing.JLabel lblDividerline1;
    private javax.swing.JLabel lblEncryptPart;
    private javax.swing.JLabel lblEncryptedMsg;
    private javax.swing.JLabel lblFinalDecryptedMsg;
    private javax.swing.JLabel lblFinalEncryptedMsg;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInstruction1;
    private javax.swing.JLabel lblInstruction2;
    private javax.swing.JLabel lblInstruction3;
    private javax.swing.JLabel lblInstruction4;
    private javax.swing.JLabel lblInstruction5;
    private javax.swing.JLabel lblInstruction6;
    private javax.swing.JLabel lblOR;
    private javax.swing.JLabel lblRespforDecryption;
    private javax.swing.JLabel lblRespforEncryption;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTopSecretMsg1;
    private javax.swing.JLabel lblTopSecretMsg2;
    private javax.swing.JLabel lblUserNote1;
    private javax.swing.JLabel lblUserNote2;
    private javax.swing.JTextField txtMsgtoDecrypt;
    private javax.swing.JTextField txtMsgtoEncrypt;
    // End of variables declaration//GEN-END:variables
}