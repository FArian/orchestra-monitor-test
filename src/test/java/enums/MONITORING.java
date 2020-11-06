package enums;

public enum MONITORING {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Monitoring')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Überwachung')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	//TODO
	NODE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Dashboard node')]";
			return xpath;
		}
	};

	public abstract String getXpath(LANGUAGE language);

}
