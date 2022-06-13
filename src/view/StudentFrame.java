package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Student;
import model.StudentModify;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class StudentFrame extends JFrame {

DefaultTableModel tableModel;
    
    List<Student> studentList = new ArrayList<>();
    
    /**
     * Creates new form StudentFrame
     */
    public StudentFrame() {
        initComponents();
        
        tableModel = (DefaultTableModel) tblStudent.getModel();
        
        showStudent();
    }
    
    private void showStudent() {
        studentList = StudentModify.findAll();
        
        tableModel.setRowCount(0);
        
        studentList.forEach((student) -> {
            tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, student.getFullname(), 
                student.getGender(), student.getEmail(), student.getPhoneNumber(),student.getFgrade()});
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Manager");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("nhập thông tin sinh viên"));

        jLabel1.setText("Full Name:");

        jLabel2.setText("Gender: ");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel3.setText("Age:");

        jLabel4.setText("Email:");

        jLabel5.setText("Phone Number:");
        txtfgrade = new JTextField();
        
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("final grade");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(15)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addComponent(jLabel5)
        				.addComponent(jLabel2)
        				.addComponent(jLabel4)
        				.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
        			.addGap(72)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtPhoneNumber, 273, 273, Short.MAX_VALUE)
        				.addComponent(txtEmail, 273, 273, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(btnSave)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnReset)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnDelete)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnFind))
        				.addComponent(txtFullname, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(cbGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
        					.addComponent(jLabel3)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(txtAge, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
        				.addComponent(txtfgrade, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(10)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(txtFullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(cbGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3)
        				.addComponent(txtAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtfgrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6))
        			.addGap(14)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSave)
        				.addComponent(btnReset)
        				.addComponent(btnDelete)
        				.addComponent(btnFind))
        			.addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        tblStudent.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"ID", "Full Name", "Gender", "Email", "Address", "grade"
        	}
        ));
        jScrollPane1.setViewportView(tblStudent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jScrollPane1, Alignment.LEADING)
        				.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txtFullname.setText("");
        cbGender.setSelectedIndex(0);
        txtAge.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
        txtfgrade.setText("");
    }                                        

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String fullname = txtFullname.getText();
        String gender = cbGender.getSelectedItem().toString();
        int age = Integer.parseInt(txtAge.getText());
        String email = txtEmail.getText();
        String phoneNumber = txtPhoneNumber.getText();
        double fgrade  = Double.parseDouble(txtfgrade.getText());
        
        Student std = new Student(fullname, gender, email, phoneNumber, age , fgrade);
        
        StudentModify.insert(std);
        
        showStudent();
    }                                       

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int selectedIndex = tblStudent.getSelectedRow();
        if(selectedIndex >= 0) {
            Student std = studentList.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
            System.out.println("option : " + option);
            
            if(option == 0) {
                StudentModify.delete(std.getId());
                
                showStudent();
            }
        }
    }                                         

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Enter full name to search");
        if(input != null && input.length() > 0) {
            studentList = StudentModify.findByFullname(input);
            
            tableModel.setRowCount(0);
        
            studentList.forEach((student) -> {
                tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, student.getFullname(), 
                    student.getGender(), student.getEmail(), student.getPhoneNumber(),student.getFgrade()});
            });
        } else {
            showStudent();
        }
    }                                       

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtPhoneNumber;
    private JTextField txtfgrade;
}