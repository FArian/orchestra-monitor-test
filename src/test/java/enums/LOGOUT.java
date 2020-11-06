package enums;

public enum LOGOUT {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Logout')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Abmelden')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	};
	public abstract String getXpath(LANGUAGE language);

}
