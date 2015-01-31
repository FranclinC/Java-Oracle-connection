package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author mra2
 *
 */
public class MainFrame extends JFrame {

	static class ActionBtnInsert implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new InsertFrame();
		}
	}
	
	static class ActionBtnSearch implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new SearchFrame();
		}
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JPanel panel;

	public MainFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 260);
		setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		getContentPane().setBackground(Color.pink); //HUE!
		panel.setLayout(null);

		/*--------------------LABEL SECTION--------------------*/
		JButton insertBtnClient = new JButton(Messages.getString("MainFrame.0")); //$NON-NLS-1$
		insertBtnClient.addActionListener(new ActionBtnInsert());
		insertBtnClient.setBounds(30, 10, 200, 100);
		panel.add(insertBtnClient);

		JButton searchBtnClient = new JButton(Messages.getString("MainFrame.1")); //$NON-NLS-1$
		searchBtnClient.addActionListener(new ActionBtnSearch());
		searchBtnClient.setBounds(30, 110, 200, 100);
		panel.add(searchBtnClient);
		/*--------------------END SECTION--------------------*/
	}
}
