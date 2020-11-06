package enums;

public enum SERVERINFO {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Server info')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Serverinfo')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	GENERAL {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'General')]";
			String german = "//div[contains(text(),'Allgemein')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	JAVA {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Java')]";
			String german = "//div[contains(text(),'Java')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SERVER {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Server')]";
			String german = "//div[contains(text(),'Server')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	REFRESH {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Refresh')]";
			String german = "//div[contains(text(),'Aktualisieren')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SYSTEMINFO {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'System info')]";
			String german = "//div[contains(text(),'Systeminformationen')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	};

	public abstract String getXpath(LANGUAGE language);

}
