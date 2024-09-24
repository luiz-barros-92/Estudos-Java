//CursoEmVideo #10
package triangulos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TesteTriangulos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteTriangulos frame = new TesteTriangulos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TesteTriangulos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Segmento a");
		lblNewLabel.setBounds(10, 11, 67, 14);
		contentPane.add(lblNewLabel);				
		
		JLabel lblNewLabel_1 = new JLabel("Segmento b");
		lblNewLabel_1.setBounds(10, 36, 67, 14);
		contentPane.add(lblNewLabel_1);	
				
		JLabel lblNewLabel_2 = new JLabel("Segmento c");
		lblNewLabel_2.setBounds(10, 61, 67, 14);
		contentPane.add(lblNewLabel_2);		
				
		JLabel lblA = new JLabel("0");
		lblA.setBounds(218, 11, 31, 14);
		lblA.setForeground(new Color(0, 128, 255));
		contentPane.add(lblA);
		
		JSlider sliderA = new JSlider();
		sliderA.setValue(0);
		sliderA.setMaximum(20);
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliderA.getValue()));
			}
		});		
		sliderA.setBounds(87, 11, 121, 14);
		contentPane.add(sliderA);
		
		JLabel lblB = new JLabel("0");
		lblB.setForeground(new Color(0, 128, 255));
		lblB.setBounds(218, 36, 31, 14);
		contentPane.add(lblB);
		
		JSlider sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliderB.getValue()));
			}
		});		
		sliderB.setValue(0);
		sliderB.setMaximum(20);
		sliderB.setBounds(87, 36, 121, 14);
		contentPane.add(sliderB);
		
		JLabel lblC = new JLabel("0");
		lblC.setForeground(new Color(0, 128, 255));
		lblC.setBounds(218, 61, 31, 14);
		contentPane.add(lblC);
		
		JSlider sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliderC.getValue()));
			}
		});
		sliderC.setValue(0);
		sliderC.setMaximum(20);
		sliderC.setBounds(87, 61, 121, 14);
		contentPane.add(sliderC);
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(10, 96, 248, 104);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel simOuN = new JLabel("-");
		simOuN.setHorizontalAlignment(SwingConstants.CENTER);
		simOuN.setForeground(new Color(0, 128, 255));
		simOuN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		simOuN.setBounds(10, 11, 228, 35);
		panel.add(simOuN);
		
		JLabel tipoTriang = new JLabel("-");
		tipoTriang.setForeground(new Color(0, 128, 255));
		tipoTriang.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tipoTriang.setHorizontalAlignment(SwingConstants.CENTER);
		tipoTriang.setBounds(10, 57, 228, 36);
		panel.add(tipoTriang);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				int a = sliderA.getValue();
				int b = sliderB.getValue();
				int c = sliderC.getValue();
				if (a < b + c && b < a + c && c < a + b) {
					simOuN.setText("Formam um Triângulo");
					if (a == b && b == c) {
						tipoTriang.setText("Equilátero");
					}else if (a != b && b != c && a != c) {
						tipoTriang.setText("Escaleno");
					}else {
						tipoTriang.setText("Isósceles");
					}
				}else {
					simOuN.setText("Não formam um Triângulo");
					tipoTriang.setText("-");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(253, 32, 86, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
