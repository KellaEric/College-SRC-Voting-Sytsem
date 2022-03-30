import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class forTest {
//    private static JMenuBar createMenuBar() {
//        JMenuBar menuBar = new JMenuBar();
//        //creating menus to addMenuItem to the menu bar
//        JMenu fileMenu = new JMenu("File");
//        JMenu displayMenu = new JMenu("Display");
//        JMenu helpMenu = new JMenu("Help");
//
//        //creating menu items to be added in file menu
//
//        JMenuItem addMenuItem = new JMenuItem("Add");
//        JMenuItem portfolio = new JMenuItem("New Portfolio");
//        JMenuItem exitMenuItem = new JMenuItem("Exit");
//        exitMenuItem.addActionListener(e -> System.exit(0));
//
//        //display menu items
//        JMenuItem resultMenuItem = new JMenuItem("Result");
//
//        //creating menuItems for help
//        JMenuItem aboutMenuItem = new JMenuItem("About");
//
//        //adding menuItems to the Menus and MenuItems
//        fileMenu.add(addMenuItem);
//        fileMenu.add(addMenuItem);
//        fileMenu.add(exitMenuItem);
//
//
//        //creating menuItems for display
//        displayMenu.add(resultMenuItem);
//        //creating menuItems for help
//        helpMenu.add(aboutMenuItem);
//
//        //adding basic menus to the menuBars
//        menuBar.add(fileMenu);
//        menuBar.add(helpMenu);
//        menuBar.add(displayMenu);
//
//        //setting mnemonics to Menu
//        fileMenu.setMnemonic(KeyEvent.VK_F);
//        displayMenu.setMnemonic(KeyEvent.VK_D);
//        helpMenu.setMnemonic(KeyEvent.VK_H);
//        addMenuItem.setMnemonic(KeyEvent.VK_A);
//
//        // Action lister for the about to display the about this prgram
//        aboutMenuItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent about) {
//                JOptionPane.showMessageDialog(null, "Welcome to group3 project\n This is a Voting Application\n that" +
//                        " allow Students of ATU to vote for their preferred of SRC Election Candidate." +
//                        " The Application consist of \n" +
//                        "Login page \n" +
//                        "Menu bar including file,Display and Help " +
//                        " \n file Menu Item \n include subMenu Add New Portfolio and Exit submenu. \n Display include Result of Candidates \n" +
//                        " Help include Members who created the Application\n The Application also have Functions \nEvent Handling " +
//                        "Mnemonics\n and\n Accelerators\n", " Copyright All Reserved 2022", JOptionPane.PLAIN_MESSAGE);
//                JTextArea Ta = new JTextArea();
//
//                //NAMES OF GROUP MEMBERS
//
//                Ta.setText("Group 3 Project Members \n" +
//                        " These are our team members who contributed to develop this application \n" +
//                        "   George Basoah--01200724D\n" +
//                        "   Ohene Emmanuel--01204737D  \n" +
//                        "   ADIL MUSTAPHA--01204378D \n" +
//                        "   ATUAHENE KELVIN--01202869D\n" +
//                        "   AMOAKOHENE ALFRED--0205225D,  \n" +
//                        "   BAAH ALEX--01200894D \n" +
//                        "   ANIM EMMANUEL--01204269D, \n" +
//                        "   MWINWULE ERIC--01201181D \n" +
//                        "   BENJAMIN ABAKAH--01200644D ");
//                // ABOUT FRAME DISPLAY
//                JFrame fr = new JFrame();
//                fr.setBounds(0, 0, 30, 34);
//                fr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//                ImageIcon icon = new ImageIcon("C:\\GROUP3\\Group3FinalWork\\src\\icon.png");
//                fr.setIconImage(icon.getImage());
//                fr.setVisible(true);
//                fr.add(Ta);
//
//
//            }
//
//        });
//
//        //adding new portfolio into the candidate panel
//
//        addMenuItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFrame addFrame = new JFrame("NEW PORTFOLIO");
//                JPanel addPanel = new JPanel();
//                JLabel addLabel = new JLabel("NAME");
//                JTextField addField = new JTextField(10);
//                JLabel addPhotoLabel = new JLabel("PHOTO");
//                JTextField photoField = new JTextField(10);
//                JButton photoButton = new JButton("Browse");
//                JLabel posLabel = new JLabel("POSITION");
//                JComboBox posBox = new JComboBox();
//                posBox.addItem("         ");
//                posBox.addItem("President");
//                posBox.addItem("Secretary");
//                posBox.addItem("Treasure");
//                JButton submitButton = new JButton("Submit");
//                photoButton.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        JFileChooser fileChooser = new JFileChooser();
//                        int returnValue = fileChooser.showSaveDialog(null);
//                        if (returnValue == JFileChooser.APPROVE_OPTION) {
//                            File selectedFile = fileChooser.getSelectedFile();
//                        }
//                    }
//                });
//
//                addPanel.add(addLabel);
//                addPanel.add(addField);
//                addPanel.add(addPhotoLabel);
//                addPanel.add(photoField);
//                addPanel.add(photoButton);
//                addPanel.add(posLabel);
//                addPanel.add(posBox);
//                addPanel.add(submitButton);
//                addFrame.add(addPanel);
//                addFrame.setSize(450, 200);
//                addFrame.setLocationRelativeTo(null);
//                addFrame.setVisible(true);
//
//            }
//
//            ;
//
//        });
//        // Display menu
//        // JMenu displayMenu = new JMenu("Display");
//
//        // Display menu items
//        // JMenuItem resultMenuItem = new JMenuItem("Results");
//
//        // add the menu and the items
//        displayMenu.add(resultMenuItem);
//        menuBar.add(displayMenu);
//
//        //Setting Mnemonic and Accelerator
//        displayMenu.setMnemonic(KeyEvent.VK_S);
//        resultMenuItem.setMnemonic(KeyEvent.VK_R);
//        resultMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
//
//        resultMenuItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFrame jf = new JFrame("RESULTS");
//                JPanel panel = new JPanel();
//                JLabel preResultLabel = new JLabel("PRESIDENTIAL RESULTS");
//                JLabel benLabel = new JLabel("Benjamin Abakah \n\n");
//                JTextField benField = new JTextField("0", 5);
//                benField.setEditable(false);
//                panel.add(preResultLabel);
//                panel.add(benLabel);
//                panel.add(benField);
//                JLabel ericLabel = new JLabel("Eric Mwinwule\n\n");
//                JTextField ericField = new JTextField("0", 5);
//                ericField.setEditable(false);
//                panel.add(ericLabel);
//                panel.add(ericField);
//
//                JLabel secResultLabel = new JLabel("SECRETARIAL RESULTS\n\n");
//                JLabel adilLabel = new JLabel("Mustspha Adil");
//                JTextField adilField = new JTextField("0", 5);
//                adilField.setEditable(false);
//                panel.add(secResultLabel);
//                panel.add(adilLabel);
//                panel.add(adilField);
//
//                JLabel enochLabel = new JLabel("nelson");
//                JTextField nelsonField = new JTextField("0", 5);
//                nelsonField.setEditable(false);
//                panel.add(enochLabel);
//                panel.add(nelsonField);
//
//                JLabel esiLabel = new JLabel("Alex Baah");
//                JTextField alexField = new JTextField("0", 5);
//                alexField.setEditable(false);
//                panel.add(alexField);
//                panel.add(alexField);
//
//                JLabel treResultLabel = new JLabel("TREASURER RESULTS\n\n");
//                JLabel animLabel = new JLabel("Emmanuel Anim");
//                JTextField animField = new JTextField("0", 5);
//                animField.setEditable(false);
//                panel.add(treResultLabel);
//                panel.add(animLabel);
//                panel.add(animField);
//
//                JLabel oheneLabel = new JLabel("Emmanuel Ohene ");
//                JTextField oheneField = new JTextField("0", 5);
//                oheneField.setEditable(false);
//                panel.add(oheneLabel);
//                panel.add(oheneField);
//
//                jf.setVisible(true);
//                jf.add(panel);
//                jf.setSize(1200, 450);
//                jf.setLocationRelativeTo(null);
//
//            }
//        });
//
//
//        //setting accelerators
//        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
//        resultMenuItem.setAccelerator(KeyStroke.getKeyStroke("Ctrl R"));
//        aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke("Ctrl A"));
//        addMenuItem.setAccelerator(KeyStroke.getKeyStroke("Ctrl D"));
//
//
//        return menuBar;
//    }
}
