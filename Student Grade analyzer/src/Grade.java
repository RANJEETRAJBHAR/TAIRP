import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grade {

	private JFrame frame;
	private JTextField txtName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField ttot;
	private JTextField aavg;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grade window = new Grade();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Grade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 646, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Grade Analyzer");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(147, 11, 306, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 55, 610, 488);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(41, 23, 138, 27);
		panel.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtName.setBounds(186, 23, 339, 26);
		panel.add(txtName);
		txtName.setColumns(10);
		
		JLabel TxtJava = new JLabel("Java");
		TxtJava.setFont(new Font("Tahoma", Font.BOLD, 18));
		TxtJava.setBounds(41, 61, 59, 27);
		panel.add(TxtJava);
		
		JLabel TxtMySQL = new JLabel("MySQL");
		TxtMySQL.setFont(new Font("Tahoma", Font.BOLD, 18));
		TxtMySQL.setBounds(41, 99, 72, 27);
		panel.add(TxtMySQL);
		
		JLabel TxtHtml = new JLabel("Html");
		TxtHtml.setFont(new Font("Tahoma", Font.BOLD, 18));
		TxtHtml.setBounds(41, 137, 53, 27);
		panel.add(TxtHtml);
		
		JLabel TxtCss = new JLabel("Css");
		TxtCss.setFont(new Font("Tahoma", Font.BOLD, 18));
		TxtCss.setBounds(41, 178, 45, 27);
		panel.add(TxtCss);
		
		JLabel TxtJavaScript = new JLabel("JavaScript");
		TxtJavaScript.setFont(new Font("Tahoma", Font.BOLD, 18));
		TxtJavaScript.setBounds(41, 215, 102, 27);
		panel.add(TxtJavaScript);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(186, 67, 339, 26);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(186, 105, 339, 26);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(186, 143, 339, 26);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(186, 184, 339, 26);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(186, 221, 339, 26);
		panel.add(textField_4);
		
		JLabel Txttot = new JLabel("Total");
		Txttot.setFont(new Font("Tahoma", Font.BOLD, 18));
		Txttot.setBounds(68, 270, 72, 27);
		panel.add(Txttot);
		
		JLabel txtAvg = new JLabel("Avg");
		txtAvg.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAvg.setBounds(68, 308, 45, 27);
		panel.add(txtAvg);
		
		JLabel txtGrade = new JLabel("Grade");
		txtGrade.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtGrade.setBounds(62, 346, 66, 27);
		panel.add(txtGrade);
		
		JButton Calculate = new JButton("Calculate");
		Calculate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
			    double Java, MySQL, Html, Css, JavaScript, tot, avg;
			    String Grade;
			    Java = Double.parseDouble(textField.getText());
			    MySQL = Double.parseDouble(textField_1.getText());
			    Html = Double.parseDouble(textField_2.getText());
			    Css = Double.parseDouble(textField_3.getText());
			    JavaScript = Double.parseDouble(textField_4.getText());

			    tot = Java + MySQL + Html + Css + JavaScript;

			    avg = tot / 5;

			    if (avg >= 85) {
			        Grade = "A";
			    } else if (avg >= 75) {
			        Grade = "B";
			    } else if (avg >= 65) {
			        Grade = "C";
			    } else if (avg >= 45) {
			        Grade = "S";
			    } else {
			        Grade = "F";
			    }

			    ttot.setText(String.valueOf(tot));
			    aavg.setText(String.valueOf(avg));

			    grade.setText(Grade);
			}

		});
		
		Calculate.setFont(new Font("Tahoma", Font.BOLD, 16));
		Calculate.setBounds(54, 397, 111, 58);
		panel.add(Calculate);
		
		ttot = new JTextField();
		ttot.setFont(new Font("Tahoma", Font.BOLD, 18));
		ttot.setBounds(170, 276, 86, 20);
		panel.add(ttot);
		ttot.setColumns(10);
		
		aavg = new JTextField();
		aavg.setFont(new Font("Tahoma", Font.BOLD, 18));
		aavg.setBounds(170, 314, 86, 20);
		panel.add(aavg);
		aavg.setColumns(10);
		
		grade = new JTextField();
		grade.setFont(new Font("Tahoma", Font.BOLD, 18));
		grade.setBounds(170, 352, 86, 20);
		panel.add(grade);
		grade.setColumns(10);
	}
}
