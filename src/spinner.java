import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

public class spinner extends JFrame {
	private JSpinner dateSpinner;
	private JLabel dateLabel;
	private JSpinner monthSpinner;
	private JLabel monthLabel;
	private JSpinner yearSpinner;
	private JLabel yearLabel;
	private JLabel label;
	private JPanel panel;
	
	String[] month = {"January ", "February ", "March ", "April ", "May ",
						"June ", "July ", "August ", "September ", "October ", 
						"November ", "December "};

	public spinner() {
		super("JSpinner Demo");
		setLayout(null);
		
		panel = new JPanel();
		getContentPane().setBackground(Color.YELLOW);
		add(panel);
		
		label = new JLabel("SELECT DATE OF BIRTH");
		label.setFont(new Font("Times New Roman", Font.BOLD, 28));
		label.setBounds(70, 21, 400, 20);
		add(label);
		
		dateLabel = new JLabel("Select Date");
		dateLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dateLabel.setBounds(130, 71, 100, 14);
		SpinnerModel dateModel = new SpinnerNumberModel(1, 0, 31, 1);
		dateSpinner = new JSpinner(dateModel);
		dateSpinner.setBounds(290, 71, 36, 19);
		add(dateLabel);
		add(dateSpinner);
		
		monthLabel = new JLabel("Select Month");
		monthLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		monthLabel.setBounds(130, 101, 400, 20);
		SpinnerModel monthModel = new SpinnerListModel(Arrays.asList(month));
		monthSpinner = new JSpinner(monthModel);
		monthSpinner.setBounds(290, 101, 90, 19);
		add(monthLabel);
		add(monthSpinner);
		
		yearLabel = new JLabel("Select Year");
		yearLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		yearLabel.setBounds(130, 141, 100, 14);
		SpinnerModel yearModel = new SpinnerNumberModel(1985, 1980, 1999, 1);
		yearSpinner = new JSpinner(yearModel);
		yearSpinner.setEditor(new JSpinner.NumberEditor(yearSpinner, "#"));
		yearSpinner.setBounds(290, 141, 56, 19);
		add(yearLabel);
		add(yearSpinner);
	}
}
