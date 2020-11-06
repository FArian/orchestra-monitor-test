package enums;

public enum SETTINGS {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Settings')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Einstellungen')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	LICENSEMANAGEMENT {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'License Management')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Lizenzmanagement')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	UPLOADNODELICENSE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Upload Node license')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Knotenlizenz hochladen')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	STATE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[contains(text(),'Orchestra license and node activation is valid')]";
			String german = "//td[contains(text(),'Orchestra license and node activation is valid')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	LICENSEVERIFICATION{
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[contains(text(),'Network based verification')]";
			String german = "//td[contains(text(),'Network based verification')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	//TODO
	UPLOADPRODUCTLICENSE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//div[contains(text(),'Upload product license')]";
			return xpath;
		}
	},
	//TODO
	HELP {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//div[contains(text(),'Help')]";
			return xpath;
		}
	},
	//TODO
	CREATENODEACTIVATIONREQUEST {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//div[contains(text(),'Create node activation request')]";
			return xpath;
		}
	},
	//TODO
	RODUCTLICENSE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//h2[contains(text(),'Product licenses')]";
			return xpath;
		}
	},
	//TODO
	SELECTLICENSEFILE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//tbody/tr[1]/td[2]/input[1]";
			return xpath;
		}
	},
	//TODO
	CLOSE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//div[contains(text(),'Close')]";
			return xpath;
		}
	},
	//TODO
	UPLOAD {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//div[contains(text(),'Upload')]";
			return xpath;
		}
	},
	//TODO
	CANCLE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//body[1]/div[6]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/div[1]";
			return xpath;
		}
	};

	public abstract String getXpath(LANGUAGE language);
	public String getMessage(String message) {
		return getMessage(message);
	}

}
