//importing required pakages
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
//Author-- Bhavesh Sukare
//Inheritance
public class EthicalHackingTest extends JFrame implements  ActionListener{
    private static final long serialVersionUID = 1L;

	JLabel label;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext, btnResult;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	// create jFrame with radioButton and JButton
	EthicalHackingTest(String s) {
		super(s);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext = new JButton("Next");
		btnResult = new JButton("Result");
                btnResult.setVisible(false);
		btnNext.addActionListener(this);         //this keyword
		btnResult.addActionListener(this);       //this keyword
		add(btnNext);
		add(btnResult);
		set();
		label.setBounds(30, 40, 650, 20);
		//radioButton[0].setBounds(50, 80, 200, 20);
		radioButton[0].setBounds(50, 80, 450, 20);
		radioButton[1].setBounds(50, 110, 450, 20);
		radioButton[2].setBounds(50, 140, 450, 20);
		radioButton[3].setBounds(50, 170, 450, 20);
		btnNext.setBounds(100, 240, 100, 30);
		btnResult.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	// handle all actions based on event
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;        //count increment
			current++;                     //count increment
			set();
			if (current == 9) {
				btnNext.setEnabled(false);
                                btnResult.setVisible(true);
				btnResult.setText("Result");
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;          //count increment
			current++;                      //count increment
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
	}

	// SET Questions with options
	void set() {
		radioButton[4].setSelected(true);
		if (current == 0) {
			label.setText("Que1:  FAT stands for ?");
			radioButton[0].setText("File allocation tables");
			radioButton[1].setText("Forensic analysis tool");
			radioButton[2].setText("File allocation transfer");
			radioButton[3].setText("Format allocation test");
		}
		if (current == 1) {
			label.setText("Que2:   A Replay attack is an example of which type of attack?");
			radioButton[0].setText("Active online attack");
			radioButton[1].setText("Offline attack");
			radioButton[2].setText("Passive online attack");
			radioButton[3].setText("None of above");
		}
		if (current == 2) {
			label.setText("Que3: What are the types of hacking stages?");
			radioButton[0].setText(" Privileges Executing");
			radioButton[1].setText("Applications Hiding");
			radioButton[2].setText("Files Covering Tracks");
			radioButton[3].setText("All of the above");
		}
		if (current == 3) {
			label.setText("Que4: What is the maximum length of an SSID?");
			radioButton[0].setText("Eight characters");
			radioButton[1].setText("Sixteen characters");
			radioButton[2].setText("Thirty-two characters");
			radioButton[3].setText("Sixty-four characters ");
		}
		if (current == 4) {
			label.setText("Que5: ____is the art of exploiting the human elements to gain access to un-authorized resources?");
			radioButton[0].setText(" Social Engineering");
			radioButton[1].setText("Organization");
			radioButton[2].setText("Hacking");
			radioButton[3].setText("Reverse Engineering");
		}
		if (current == 5) {
			label.setText("Que6: A packet with all flags set is which type of scan?");
			radioButton[0].setText(" XMAS");
			radioButton[1].setText("Full Open");
			radioButton[2].setText("TCP connect");
			radioButton[3].setText("Syn scan");
		}
		if (current == 6) {
			label.setText("Que7: Which character is typically used first by the penetration tester?");
			radioButton[0].setText("Semicolon");
			radioButton[1].setText("Dollar sign");
			radioButton[2].setText("Single quote");
			radioButton[3].setText("None of the above");
		}
		if (current == 7) {
			label.setText("Que8:  Which wireless mode connects machines directly to one another, without the use of an access point?");
			radioButton[0].setText("Ad hoc");
			radioButton[1].setText("Point to point");
			radioButton[2].setText("Infrastructure");
			radioButton[3].setText("BSS");
		}
		if (current == 8) {
			label.setText("Que9: Which tool can be used to perform a DNS zone transfer on Windows?");
			radioButton[0].setText("DNS lookup");
			radioButton[1].setText("nslookup");
			radioButton[2].setText("whois");
			radioButton[3].setText("ipconfig");
		}
		if (current == 9) {
			label.setText("Que10: What is the attack called evil twin?");
			radioButton[0].setText("Rogue access point");
			radioButton[1].setText("Session hijacking");
			radioButton[2].setText("MAC spoofing");
			radioButton[3].setText("ARP poisoning");
		}
		label.setBounds(30, 40, 650, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			radioButton[j].setBounds(50, 80 + i, 200, 20);
	}

	// declaring right answers.
	boolean check() {
		if (current == 0)
			return (radioButton[0].isSelected());
		if (current == 1)
			return (radioButton[3].isSelected());
		if (current == 2)
			return (radioButton[3].isSelected());
		if (current == 3)
			return (radioButton[2].isSelected());
		if (current == 4)
			return (radioButton[0].isSelected());
		if (current == 5)
			return (radioButton[0].isSelected());
		if (current == 6)
			return (radioButton[1].isSelected());
		if (current == 7)
			return (radioButton[0].isSelected());
		if (current == 8)
			return (radioButton[1].isSelected());
		if (current == 9)
			return (radioButton[0].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new EthicalHackingTest("Ethical Hacking Test");
	}
}