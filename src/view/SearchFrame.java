package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * @author mra2
 *
 */
public class SearchFrame {

	private JTextField cpf;
	private JFrame frame;
	private JTextField name;

	public SearchFrame() {

		frame = new JFrame();
		frame.setTitle(Messages.getString("SearchFrame.0")); //$NON-NLS-1$
		frame.setBounds(100, 100, 400, 200);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		// label -> name
		name = new JTextField();
		name.setBounds(10, 30, 178, 20);
		name.setText(Messages.getString("SearchFrame.1")); //$NON-NLS-1$
		frame.getContentPane().add(name);
		name.setColumns(15);

		// label -> cpf
		cpf = new JTextField();
		cpf.setText(Messages.getString("SearchFrame.2")); //$NON-NLS-1$
		cpf.setColumns(15);
		cpf.setBounds(10, 64, 178, 20);
		frame.getContentPane().add(cpf);

		JButton button = new JButton(Messages.getString("SearchFrame.3")); //$NON-NLS-1$
		button.setBounds(198, 63, 89, 23);
		frame.getContentPane().add(button);

		JLabel lblBuscarCliente = new JLabel(
				Messages.getString("SearchFrame.4")); //$NON-NLS-1$
		lblBuscarCliente.setBounds(10, 11, 125, 14);
		frame.getContentPane().add(lblBuscarCliente);

		JButton bucar = new JButton(Messages.getString("SearchFrame.5")); //$NON-NLS-1$
		bucar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		bucar.setBounds(198, 31, 89, 23);
		frame.getContentPane().add(bucar);
	}
}
