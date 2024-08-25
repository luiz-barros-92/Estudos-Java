package linguagem;

import java.util.*;

public class LinguagemDoSistema {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();							//captura o local
		System.out.println("Seu sistema está em  " + loc.getDisplayLanguage(loc) + ".");	//printa a linguagem

	}

}
