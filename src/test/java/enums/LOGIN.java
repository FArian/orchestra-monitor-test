package enums;

public enum LOGIN {
	USERNAME {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//tbody/tr[1]/td[2]/div[1]/input[1]";
			String german = "//tbody/tr[1]/td[2]/div[1]/input[1]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	PASSWORD {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//tbody/tr[2]/td[2]/div[1]/input[1]";
			String german = "//tbody/tr[2]/td[2]/div[1]/input[1]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SUBMIT {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[@class='mButton-label' and contains(., 'Submit')]";
			String german = "//div[contains(text(),'Submit')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;

		}
	},
	LOGINWINDOWS {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "";
			String english = "//label[contains(text(),'Login')]";
			String german = "//label[contains(text(),'Login')]";
			english = xpath;
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	},
	MONITORTITLE {
		public String getContent() {
			String content = "Orchestra Monitor";
			return content;
		}

		@Override
		public String getXpath(LANGUAGE language) {
			// TODO Auto-generated method stub
			return "NOTSET";
		}
	};

	public abstract String getXpath(LANGUAGE language);

	public String getContent() {
		return getContent();
	}

}
