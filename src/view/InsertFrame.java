package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import model.Client;
import controller.Engine;

/**
 * @author mra2
 *
 */
public class InsertFrame {

	private static Engine in;
	static {
		in = new Engine();
	}
	private JFrame frame;

	private JTextField name, cpf, date, phone1, phone2, phone3, email;

	public InsertFrame() {

		frame = new JFrame();
		frame.setTitle(Messages.getString("InsertFrame.0")); //$NON-NLS-1$
		frame.setBounds(100, 100, 300, 352);
		frame.setLocationByPlatform(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		JLabel lblBuscarCliente = new JLabel(
				Messages.getString("InsertFrame.1")); //$NON-NLS-1$
		lblBuscarCliente.setFont(new Font(
				Messages.getString("InsertFrame.2"), Font.PLAIN, 18)); //$NON-NLS-1$
		lblBuscarCliente.setBounds(10, 10, 227, 14);
		frame.getContentPane().add(lblBuscarCliente);

		/*--------------------LABEL SECTION--------------------*/
		// label -> name
		name = new JTextField();
		name.setText(Messages.getString("InsertFrame.3")); //$NON-NLS-1$
		name.setColumns(15);
		name.setBounds(10, 50, 178, 20);
		frame.getContentPane().add(name);

		// label -> cpf
		cpf = new JTextField();
		cpf.setText(Messages.getString("InsertFrame.4")); //$NON-NLS-1$
		cpf.setColumns(15);
		cpf.setBounds(10, 80, 178, 20);
		frame.getContentPane().add(cpf);

		// label -> date
		date = new JTextField();
		date.setText(Messages.getString("InsertFrame.5")); //$NON-NLS-1$
		date.setColumns(15);
		date.setBounds(10, 110, 178, 20);
		frame.getContentPane().add(date);

		// label -> email
		email = new JTextField();
		email.setText(Messages.getString("InsertFrame.6")); //$NON-NLS-1$
		email.setColumns(15);
		email.setBounds(10, 140, 178, 20);
		frame.getContentPane().add(email);

		// label -> phone 1
		phone1 = new JTextField();
		phone1.setText(Messages.getString("InsertFrame.7")); //$NON-NLS-1$
		phone1.setColumns(15);
		phone1.setBounds(10, 170, 178, 20);
		frame.getContentPane().add(phone1);

		// label -> phone 2
		phone2 = new JTextField();
		phone2.setText(Messages.getString("InsertFrame.8")); //$NON-NLS-1$
		phone2.setColumns(15);
		phone2.setBounds(10, 200, 178, 20);
		frame.getContentPane().add(phone2);

		// label -> phone 3
		phone3 = new JTextField();
		phone3.setText(Messages.getString("InsertFrame.9")); //$NON-NLS-1$
		phone3.setColumns(15);
		phone3.setBounds(10, 230, 178, 20);
		frame.getContentPane().add(phone3);
		/*--------------------END SECTION--------------------*/

		JButton clientBtnInsert = new JButton(
				Messages.getString("InsertFrame.10")); //$NON-NLS-1$

		clientBtnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] telefones = new String[3];

				telefones[0] = phone1.getText();
				telefones[1] = phone2.getText();
				telefones[2] = phone3.getText();

				Client novoCliente = new Client(cpf.getText(), name.getText(),
						date.getText(), email.getText(), telefones);

				try {
					in.insert(novoCliente);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

		clientBtnInsert.setBounds(10, 268, 178, 23);
		frame.getContentPane().add(clientBtnInsert);
	}

	public void setVisible(boolean v) {
		this.frame.setVisible(v);
	}
}
