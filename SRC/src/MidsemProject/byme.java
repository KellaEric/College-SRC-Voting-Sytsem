package MidsemProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;


public class byme{
    private JPanel mainPanel;
    private JPanel candidateMainPanel;
    private JPanel registerPanel;
    private JPanel panelMain;
    private JLabel userNameLabel;
    private JLabel logo;
    private JTextField studentIdField;
    private JLabel IdLabel;
    private JLabel passwordLabel;
    private JButton loginBtn;
    private JLabel mainLabel;
    private JPasswordField stuPasswordField;
    private JTextField userNameField;
    private JButton button1;
    private JPanel PresPanel;
    private JLabel presA;
    private JCheckBox benCheckB;
    private JLabel presB;
    private JCheckBox ericCheckB;
    private JButton Button2;
    private JPanel westPanel;
    private JLabel secLabel;
    private JLabel secaLabel;
    private JLabel secbLabel;
    private JLabel seccLabel;
    private JButton button5;
    private JButton button4;
    private JButton button3;
    private JCheckBox adilChk;
    private JCheckBox nelsonChk;
    private JCheckBox alexChk;
    private JPanel eastPanel;
    private JLabel treaLabel;
    private JLabel tresaLabel;
    private JLabel tresbLabel;
    private JButton button6;
    private JLabel trescLabel;
    private JButton button7;
    private JCheckBox emmaChk;
    private JCheckBox oheneChk;
    private JScrollPane wr;
    private JPanel logoPanel;
    private JLabel atuLogoTxt;

    private JLabel atuLogo;
    private JLabel srcLogo;
    private JButton logoutBtn;
    private JPanel logoutPanel;
    private JLabel logoutLabel;
    private JPanel resultPanel;
    private JTextField ericTxtF;
    private JTextField adilTxtF;
    private JTextField nelsonTxtF;
    private JTextField AlexTxtF;
    private JTextField emmaTxtF;
    private JTextField oheneTxtF;
    private JTextField benTxtF;
    private JButton viewResult;

    private static int p1voteCount;
    private static int p2voteCount;
    private static int s1voteCount;
    private static int s2voteCount;
    private static int s3voteCount;
    private static int t1voteCount;
    private static int t2voteCount;


    //arrayList to save login detail of each students
    private static ArrayList<StudentCredential> StudentInfo;

//main constructor
    public byme() {
        //creating an arrayList to save login detail of each student
        StudentInfo = new ArrayList<>();

        candidateMainPanel.setVisible(false);
        registerPanel.setVisible(true);
        logoPanel.setVisible(false);
        loginBtn.setEnabled(false);
        logoutPanel.setVisible(false);
        resultPanel.setVisible(false);

        //adding functions to the login button
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = userNameField.getText();
                String studentID = studentIdField.getText();
                String StuPassword = new String(stuPasswordField.getPassword());

                if (userNameField.getText().equals("") && studentIdField.getText().equals("")) {
                    loginBtn.setEnabled(false);
                } else if (StuPassword.equals("") || StuPassword.equals(" ")){
                    JOptionPane.showMessageDialog(null,
                            "please enter your password",
                            "Voting Confirmation", JOptionPane.OK_OPTION);
                    loginBtn.setEnabled(false);
                }else {
                    loginBtn.setEnabled(true);
                    boolean Exist = false;
                    for (StudentCredential g : StudentInfo) {
                        if (studentName.equalsIgnoreCase(g.getStudentName()) && studentID.equalsIgnoreCase(g.getStudentId())) {
                            Exist = true;
                        }
                    }
                    if (Exist) {
                        JOptionPane.showMessageDialog(null,
                                "Thanks for voting!\n" +
                                        "You cannot vote twice!!",
                                "Voting Confirmation", JOptionPane.OK_OPTION);
                        registerPanel.setVisible(true);
                        candidateMainPanel.setVisible(false);
                    } else {
                        registerPanel.setVisible(false);
                        candidateMainPanel.setVisible(true);
                        logoPanel.setVisible(true);
                        logoutPanel.setVisible(true);
                        logoutBtn.setVisible(true);
                        resultPanel.setVisible(false);
                         StudentCredential getDetails = new StudentCredential(studentID,StuPassword,studentName);
                         StudentInfo.add(getDetails);

                    }
                }
            }
        });
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userNameField.getText().equals("") && studentIdField.getText().equals("")){
                    loginBtn.setEnabled(false);
                }
                else {
                    loginBtn.setEnabled(true);
                }
            }
        };
        studentIdField.addActionListener(listener);
        userNameField.addActionListener(listener);

        //candidates buttons to mark checkboxes when clicked
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                benCheckB.setSelected(true);
                Button2.setEnabled(false);
                button1.setEnabled(false);
                p1voteCount++;
                benTxtF.setText(String.valueOf(p1voteCount));

            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ericCheckB.setSelected(true);
                button1.setEnabled(false);
                p2voteCount++;
                Button2.setEnabled(false);
                ericTxtF.setText(String.valueOf(p2voteCount));
            }
        });


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adilChk.setSelected(true);
                button3.setEnabled(false);
                s1voteCount++;
                button4.setEnabled(false);
                button5.setEnabled(false);
                adilTxtF.setText(String.valueOf(s1voteCount));



            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nelsonChk.setSelected(true);
                button3.setEnabled(false);
                button5.setEnabled(false);
                button4.setEnabled(false);
                s2voteCount++;
                nelsonTxtF.setText(String.valueOf(s2voteCount));


            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alexChk.setSelected(true);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                s3voteCount++;
                AlexTxtF.setText(String.valueOf(s3voteCount));
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emmaChk.setSelected(true);
                button7.setEnabled(false);
                button6.setEnabled(false);
                t1voteCount++;
                emmaTxtF.setText(String.valueOf(t1voteCount));


            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oheneChk.setSelected(true);
                button6.setEnabled(false);
                button7.setEnabled(false);
                t2voteCount++;
                oheneTxtF.setText(String.valueOf(t2voteCount));
            }

        });

        //logout button to close the voting platform
        logoutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                candidateMainPanel.setVisible(false);
                logoutPanel.setVisible(false);
                registerPanel.setVisible(true);
                logoPanel.setVisible(false);
                resultPanel.setVisible(false);
                mainLabel.setVisible(true);


                //setting all buttons and checkbox to reset for a new login
                button1.setEnabled(true);
                benCheckB.setSelected(false);
                Button2.setEnabled(true);
                ericCheckB.setSelected(false);
                button3.setEnabled(true);
                adilChk.setSelected(false);
                button4.setEnabled(true);
                nelsonChk.setSelected(false);
                button5.setEnabled(true);
                alexChk.setSelected(false);
                button6.setEnabled(true);
                emmaChk.setSelected(false);
                button7.setEnabled(true);
                oheneChk.setSelected(false);
                viewResult.setEnabled(true);




            }
        });
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (benCheckB.isSelected()) {
                    p1voteCount++;
                    benTxtF.setText(String.valueOf(p1voteCount));
                }
                else if (ericCheckB.isSelected()){
                    p2voteCount++;
                    ericTxtF.setText(String.valueOf(p2voteCount));
                }
            }
        };
        benCheckB.addActionListener(listener1);
        ericCheckB.addActionListener(listener1);
        adilChk.addActionListener(listener1);
        nelsonChk.addActionListener(listener1);
        alexChk.addActionListener(listener1);
        emmaChk.addActionListener(listener1);
        oheneChk.addActionListener(listener1);


        /*viewResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logoPanel.setVisible(false);
                mainLabel.setVisible(false);
                candidateMainPanel.setVisible(false);
                resultPanel.setVisible(true);
                viewResult.setEnabled(false);
            }
        });

         */
        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = userNameField.getText().replaceAll("\\s","");
                String studentId = studentIdField.getText().replaceAll("\\s","");

                if ((name.length() <= 5)){
                    JOptionPane.showMessageDialog(null,"Check name field!");
                }else if ((studentId.length() != 9)){
                    JOptionPane.showMessageDialog(null,"Check student id field!");
                }else {
                    if ((userNameField.getText().equals("") || userNameField.getText().equals(" "))
                            || (studentIdField.getText().equals("") || studentIdField.getText().equals(" "))) {
                        loginBtn.setEnabled(false);
                    }else {
                        loginBtn.setEnabled(true);
                    }
                }
            }
        };
        studentIdField.addActionListener(listener2);
        userNameField.addActionListener(listener2);
        stuPasswordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String StuPassword = new String(stuPasswordField.getPassword());

                if (StuPassword.equals("") || StuPassword.equals(" ")){
                    JOptionPane.showMessageDialog(null,
                            "please enter your password",
                            "Voting Confirmation", JOptionPane.OK_OPTION);
                    loginBtn.setEnabled(false);
                }
            }
        });
    }

    private static JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();

        //creating menus to addMenuItem to the menu bar
        JMenu fileMenu = new JMenu("File");
        JMenu displayMenu = new JMenu("Display");
        JMenu helpMenu = new JMenu("Help");

        //creating menu items to be added in file menu

        JMenuItem addMenuItem = new JMenuItem("Add");
        JMenuItem portfolio = new JMenuItem("New Portfolio");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0));

        //display menu items
        JMenuItem resultMenuItem = new JMenuItem("Result");

        //creating menuItems for help
        JMenuItem aboutMenuItem = new JMenuItem("About");

        //adding menuItems to the Menus and MenuItems
        fileMenu.add(addMenuItem);
        fileMenu.add(addMenuItem);
        fileMenu.add(exitMenuItem);


        //creating menuItems for display
        displayMenu.add(resultMenuItem);
        //creating menuItems for help
        helpMenu.add(aboutMenuItem);

        //adding basic menus to the menuBars
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        menuBar.add(displayMenu);


        //setting mnemonics to Menu
        fileMenu.setMnemonic(KeyEvent.VK_F);
        displayMenu.setMnemonic(KeyEvent.VK_D);
        helpMenu.setMnemonic(KeyEvent.VK_H);
        addMenuItem.setMnemonic(KeyEvent.VK_A);

        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to group3 project\n This is a Voting Application\n that" +
                        " allow Students of ATU to vote for their preferred of SRC Election Candidate." +
                        " The Application consist of \n" +
                        "Login page \n" +
                        "Menu bar including file,Display and Help " +
                        " \n file Menu Item \n include subMenu Add New Portfolio and Exit submenu. \n Display include Result of Candidates \n" +
                        " Help include Members who created the Application\n The Application also have Functions \nEvent Handling " +
                        "Mnemonics\n and\n Accelerators\n", " Copyright All Reserved 2022", JOptionPane.PLAIN_MESSAGE);
                JTextArea Ta = new JTextArea();
                Ta.setEditable(false);

                //NAMES OF GROUP MEMBERS

                Ta.setText("Group 3 Project Members \n" +
                        " These are our team members who contributed to develop this application \n" +
                        "   George Basoah--01200724D\n" +
                        "   Ohene Emmanuel--01204737D  \n" +
                        "   ADIL MUSTAPHA--01204378D \n" +
                        "   ATUAHENE KELVIN--01202869D\n" +
                        "   AMOAKOHENE ALFRED--0205225D,  \n" +
                        "   BAAH ALEX--01200894D \n" +
                        "   ANIM EMMANUEL--01204269D, \n" +
                        "   MWINWULE ERIC--01201181D \n" +
                        "   BENJAMIN ABAKAH--01200644D ");
                // ABOUT FRAME DISPLAY
                JFrame fr = new JFrame();
                fr.setBounds(0, 0, 400, 304);
                fr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                ImageIcon icon = new ImageIcon("C:\\GROUP3\\Group3FinalWork\\src\\icon.png");
                fr.setIconImage(icon.getImage());
                fr.setVisible(true);
                fr.add(Ta);
            }
        });

        //adding new portfolio into the candidate panel

        addMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame addFrame = new JFrame("NEW PORTFOLIO");
                JPanel addPanel = new JPanel();
                JLabel addLabel = new JLabel("NAME");
                JTextField addField = new JTextField(10);
                JLabel addPhotoLabel = new JLabel("PHOTO");
                JTextField photoField = new JTextField(10);
                JButton photoButton = new JButton("Browse");
                JLabel posLabel = new JLabel("POSITION");
                JComboBox posBox = new JComboBox();
                posBox.addItem("         ");
                posBox.addItem("President");
                posBox.addItem("Secretary");
                posBox.addItem("Treasure");
                JButton submitButton = new JButton("Submit");
                photoButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fileChooser = new JFileChooser();
                        int returnValue = fileChooser.showSaveDialog(null);
                        if (returnValue == JFileChooser.APPROVE_OPTION) {
                            File selectedFile = fileChooser.getSelectedFile();
                        }
                    }
                });

                addPanel.add(addLabel);
                addPanel.add(addField);
                addPanel.add(addPhotoLabel);
                addPanel.add(photoField);
                addPanel.add(photoButton);
                addPanel.add(posLabel);
                addPanel.add(posBox);
                addPanel.add(submitButton);
                addFrame.add(addPanel);
                addFrame.setSize(450, 200);
                addFrame.setLocationRelativeTo(null);
                addFrame.setVisible(true);
            }
        });

        // add the menu and the items
        displayMenu.add(resultMenuItem);
        menuBar.add(displayMenu);

        //Setting Mnemonic and Accelerator
        displayMenu.setMnemonic(KeyEvent.VK_S);
        resultMenuItem.setMnemonic(KeyEvent.VK_R);
        resultMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));

          resultMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           JFrame jf = new JFrame("RESULTS");
                JPanel panel = new JPanel();

                JLabel preResultLabel = new JLabel("PRESIDENTIAL RESULTS");
                JLabel benLabel = new JLabel("Benjamin Abakah \n\n");
                JTextField benField = new JTextField("0", 5);
                benField.setEditable(false);
                panel.add(preResultLabel);
                panel.add(benLabel);
                panel.add(benField);
                JLabel ericLabel = new JLabel("Eric Mwinwule\n\n");
                JTextField ericField = new JTextField("0", 5);
                ericField.setEditable(false);
                panel.add(ericLabel);
                panel.add(ericField);

                JLabel secResultLabel = new JLabel("SECRETARIAL RESULTS\n\n");
                JLabel adilLabel = new JLabel("Mustspha Adil");
                JTextField adilField = new JTextField("0", 5);
                adilField.setEditable(false);
                panel.add(secResultLabel);
                panel.add(adilLabel);
                panel.add(adilField);

                JLabel enochLabel = new JLabel("nelson");
                JTextField nelsonField = new JTextField("0", 5);
                nelsonField.setEditable(false);
                panel.add(nelsonField);
                panel.add(nelsonField);

                JLabel esiLabel = new JLabel("Alex Baah");
                JTextField alexField = new JTextField("0", 5);
                alexField.setEditable(false);
                panel.add(alexField);
                panel.add(alexField);

                JLabel treResultLabel = new JLabel("TREASURER RESULTS\n\n");
                JLabel animLabel = new JLabel("Emmanuel Anim");
                JTextField animField = new JTextField("0", 5);
                animField.setEditable(false);
                panel.add(treResultLabel);
                panel.add(animLabel);
                panel.add(animField);

                JLabel oheneLabel = new JLabel("Emmanuel Ohene ");
                JTextField oheneField = new JTextField("0", 5);
                oheneField.setEditable(false);
                panel.add(oheneLabel);
                panel.add(oheneField);

                jf.setVisible(true);
                jf.add(panel);
                jf.setSize(600, 350);
                jf.setLocationRelativeTo(null);


            }
        });






        //setting accelerators
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        resultMenuItem.setAccelerator(KeyStroke.getKeyStroke("Ctrl R"));
        aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke("Ctrl A"));
        addMenuItem.setAccelerator(KeyStroke.getKeyStroke("Ctrl D"));

        return menuBar;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ATU-SRC VOTING APPLICATION");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(new byme().mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(createMenuBar());
        frame.setBounds(0, 0, 2000, 900);


    }

}




