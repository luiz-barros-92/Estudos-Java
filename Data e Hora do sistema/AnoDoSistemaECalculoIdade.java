package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;												  //data atual do sistema
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class TelaIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Jframe;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TelaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Jframe = new JPanel();
		Jframe.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Jframe);
		Jframe.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(24, 70, 92, 14);
		Jframe.add(lblNewLabel);
		
		LocalDateTime now = LocalDateTime.now();									//importação da biblioteca LocalDateTime
		int anoAtual = now.getYear();											//definindo ano atual
		
		
		JLabel lblAnoAtual = new JLabel("Ano Atual");
		lblAnoAtual.setBounds(24, 11, 68, 14);
		Jframe.add(lblAnoAtual);
		
		JSpinner txtAn = new JSpinner();
		txtAn.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		txtAn.setBounds(149, 67, 61, 20);
		Jframe.add(txtAn);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setForeground(new Color(255, 0, 0));
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdade.setBounds(115, 202, 46, 14);
		Jframe.add(lblIdade);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = (Integer) txtAn.getValue();								//Definindo getValue() recebido como Integer.		
				int id = anoAtual - an; 									//Cálculo da idade com o (anoAtual - an)
				lblIdade.setText(Integer.toString(id));
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalc.setIcon(new ImageIcon(TelaIdade.class.getResource("/imagens/calcicon.png")));
		btnCalc.setBounds(20, 95, 190, 96);
		Jframe.add(btnCalc);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(36, 205, 46, 14);
		Jframe.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaIdade.class.getResource("/imagens/usuarioicon.png")));
		lblNewLabel_3.setBounds(248, 28, 100, 125);
		Jframe.add(lblNewLabel_3);		
		
		
		JLabel lblNewLabel_2 = new JLabel(Integer.toString(anoAtual));                                                  //Inserido ao nome da label anoAtual convertida para String
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(95, 11, 46, 14);
		Jframe.add(lblNewLabel_2);
	}
}
