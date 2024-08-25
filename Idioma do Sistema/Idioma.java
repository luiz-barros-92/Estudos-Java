package linguagem;

import java.util.*;

public class LinguagemDoSistema {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println("Seu sistema está em  " + loc.getDisplayLanguage(loc) + ".");

	}

}
