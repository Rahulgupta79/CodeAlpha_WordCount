
import java.awt.event.*;
import javax.swing.*;

public class WordCountSwing extends JFrame implements ActionListener {
    JTextArea ta;
    JButton b;
    JLabel l;

    WordCountSwing() {
        ta = new JTextArea();
        ta.setBounds(50, 50, 300, 200);
        b = new JButton("Count Words");
        b.setBounds(50, 300, 100, 30);
        l = new JLabel();
        l.setBounds(50, 350, 300, 30);
        b.addActionListener(this);
        add(b);
        add(ta);
        add(l);
        setSize(400, 450);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = ta.getText();
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        l.setText("Number of words: " + wordCount);
    }

    public static void main(String[] args) {
        new WordCountSwing();
    }
}
