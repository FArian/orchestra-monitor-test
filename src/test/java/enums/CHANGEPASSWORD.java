package enums;

public enum CHANGEPASSWORD {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Change password')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Passwort ändern')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	WARNING {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//label[contains(text(),'Warning')]";
			String german = "//label[contains(text(),'Warnung')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
		@Override
		public String getMessage(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "Changes only affects local node!";
			String german = "Änderungen betreffen nur den lokalen Knoten!";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	OK {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'OK')]";
			String german = "//div[contains(text(),'OK')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	OLDPASSWORDBOX {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//tbody/tr[1]/td[2]/div[1]/input[1]";
			return xpath;
		}
	},
	NEWPASSWORDBOX {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//tbody/tr[2]/td[2]/div[1]/input[1]";
			return xpath;
		}
	},
	CONFIRMPASSWORDBOX {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//tbody/tr[3]/td[2]/div[1]/input[1]";
			return xpath;
		}
	},
	SAVE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//div[contains(text(),'Save')]";
			return xpath;
		}
	},
	PASSWORDCHANGED {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//div[contains(text(),'Password changed!')]";
			
			return xpath;
		}
	};

	public abstract String getXpath(LANGUAGE language);

	public String getMessage(LANGUAGE language) {
		return getMessage(language);
	}
}
