package enums;

public enum ADMINISTRATION {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Administration')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Administration')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	LANDSCAPE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Landscape')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Landscape')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SCENARIO {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Scenario')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Szenario')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	USERMANAGEMENT {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'User management')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Benutzerverwaltung')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	TIMER {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Timer')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Timer')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	BUSINESSCALENDAR {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Business calendar')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Business-Kalender')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	LOOKUPTABLE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Lookup table')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Lookup Tabelle')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	};

	public abstract String getXpath(LANGUAGE language);

}
