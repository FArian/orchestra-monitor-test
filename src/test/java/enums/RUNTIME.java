package enums;

public enum RUNTIME {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Runtime')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Laufzeit')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	STOP {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Stop')]";
			String german = "//div[contains(text(),'Stop')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	START {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Start')]";
			String german = "//div[contains(text(),'Start')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	};

	public abstract String getXpath(LANGUAGE language);

}
