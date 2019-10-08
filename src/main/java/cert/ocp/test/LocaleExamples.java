package cert.ocp.test;

import java.util.Locale;

public class LocaleExamples {

	public static void main(String[] args) {
		// A local object from Locale.Builder
        Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
        System.out.println("localeFromBuilder: "+localeFromBuilder);
         
        //Locale from forLanguageTag method
        Locale forLangLocale = Locale.forLanguageTag("en-GB");
        System.out.println("forLangLocale: "+forLangLocale);
         
        //Using Locale Contant
        Locale localeCosnt = Locale.FRANCE;
        System.out.println("localeCosnt: "+localeCosnt);
	}

}
