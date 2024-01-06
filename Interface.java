
package finalproject;

import java.util.ArrayList;


public class Interface extends javax.swing.JFrame {
    int count=0;
   
    public Interface() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblNameError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        lblNICerror = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecords = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 153, 153));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel.setForeground(new java.awt.Color(204, 0, 0));
        jPanel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registration Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name in Full");

        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("National ID Card Number");

        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });
        txtNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNICKeyReleased(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(153, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 51, 255));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Count");

        lblCount.setText("0");

        txtRecords.setEditable(false);
        txtRecords.setBackground(new java.awt.Color(204, 255, 255));
        txtRecords.setColumns(20);
        txtRecords.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRecords.setRows(5);
        txtRecords.setText("\n     \n");
        jScrollPane1.setViewportView(txtRecords);

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete All");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("                       Registration Records");

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText(" No                    Name with Initials                         DOB");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblNICerror, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNIC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel2)
                                        .addGap(110, 110, 110))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)))
                                .addComponent(btnSubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(61, 61, 61))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNICerror, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSubmit)
                                    .addComponent(btnReset)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnDelete)
                        .addGap(3, 3, 3)))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyReleased
        
         try{
        ArrayList letters=new ArrayList();
        String fullName=txtFullName.getText();
        int size=fullName.length();
        for(int i=0;i<=size-1;i++)
        {
            char a=fullName.charAt(i);
            if(!(Character.isLetter(a)|| Character.isSpaceChar(a)))
            {
                lblNameError.setText("Invalied name");
                break;
            }
            else
            {
                letters.add(a);
            }
        }
      }
      catch(Exception e)
      {
          lblNameError.setText("Error");
      }
    }//GEN-LAST:event_txtFullNameKeyReleased

    private void txtNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICKeyReleased
           try{
        String nic=txtNIC.getText();
        int size=nic.length();
        
      
        if(size==10 && (nic.charAt(size-1)=='v' ||nic.charAt(size-1)=='V') )
        {
            for(int i=0;i<=size-2;i++)
            {
                char a=nic.charAt(i);
                if(!(Character.isDigit(a)))
                {
                    lblNICerror.setText("Invalied NIC Number");
                    break;
                }
            }
            lblNICerror.setText("Valied NIC Number");
        }
        else
        {
            lblNICerror.setText("Invallied NIC Number");
        }
        }
        catch(Exception e)
        {
            lblNICerror.setText("Error");
        }            
    }//GEN-LAST:event_txtNICKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtFullName.setText("");
        txtNIC.setText("");
        lblNameError.setText("");
        lblNICerror.setText("");
        lblWarning.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       try{
        String m=lblNameError.getText();
        String n=lblNICerror.getText();
        if(m.equals("") && n.equals("Valied NIC Number"))
        {
        String nic=txtNIC.getText();
        String first=nic.substring(0,2);
        int year=1900+Integer.parseInt(first);
        
        String month;
        int num,date;
        String second=nic.substring(2,5);
        if(Integer.parseInt(second)>500)
        {
            num=Integer.parseInt(second)-500;
        }
        else
        {
            num=Integer.parseInt(second);
        }
        
        if(num<=31)
                {
                  month="01";
                  date=num;
                }
        else if(num<=60)
        {
            month="02";
            date=num-31;
        }
         else if(num<=91)
        {
            month="03";
            date=num-60;
        }
         else if(num<=121)
        {
            month="04";
            date=num-91;
        }
         else if(num<=152)
        {
            month="05";
            date=num-121;
        }
         else if(num<=182)
        {
            month="06";
            date=num-152;
        }
         else if(num<=213)
        {
            month="07";
            date=num-182;
        }
          else if(num<=244)
        {
            month="08";
            date=num-213;
        }   
         else if(num<=274)
        {
            month="09";
            date=num-244;
        }
         else if(num<=305)
        {
            month="10";
            date=num-274;
        }
         else if(num<=335)
        {
            month="11";
            date=num-305;
        }
        else
         {
             month="12";
             date=num-335;
         }
        String day=Integer.toString(date);
        String dob=year+"/"+month+"/"+day;
        
        
        
        ArrayList<Character> letters=new ArrayList<>();
        
        String name=txtFullName.getText();
        int size=name.length();
        for(int i=0;i<=size-1;i++)
        {
            if(!Character.isSpace(name.charAt(i)))
            {  
            }
            else
            {
                char x=name.charAt((i+1));
                char y=Character.toUpperCase(x);
                letters.add(y);
            }
        }
        int c=name.lastIndexOf(" ");
        char v=Character.toUpperCase(name.charAt(c+1));
        String last=name.substring(c+2);
        
        String b=name.substring(0,1);
        String f=b.toUpperCase();
        String records=txtRecords.getText();
        String message=f+".";
        
        int l=letters.size();
        for(int a=0;a<l-1;a++)
        {
            message+=letters.get(a)+".";
        }
        message+=v+last;
        
        count=count+1;
        String x=Integer.toString(count);
        lblCount.setText(x);
        records+=count+"\t"+message+"\t"+dob+"\n";
       txtRecords.setText(records);
        }
        else
        {
            lblWarning.setText("Error!");
        }
       }
       catch(Exception e)
       {
           
       }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
      
    }//GEN-LAST:event_txtNICActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        count=0;
        txtFullName.setText("");
        txtNIC.setText("");
        lblNameError.setText("");
        lblNICerror.setText("");
        lblCount.setText("0");
        txtRecords.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblNICerror;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextArea txtRecords;
    // End of variables declaration//GEN-END:variables
}
