package awt;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTel {

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		
		System.out.println("Sua tela tem resolução " + width + "x" + height);
	}
}
		
