package enums;

public enum CLOUDENVIRONMENT {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Cloud environment')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Cloud Umgebung')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	NODE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Dashboard node')]";
			return xpath;
		}
	};

	public abstract String getXpath(LANGUAGE language);
}
