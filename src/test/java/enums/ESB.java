package enums;

public enum ESB {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'ESB')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'ESB')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SERVICEREGISTRY {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Service registry')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Serviceregistratur')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SIGNAL {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Signal')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Signal')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	};

	public abstract String getXpath(LANGUAGE language);

}
