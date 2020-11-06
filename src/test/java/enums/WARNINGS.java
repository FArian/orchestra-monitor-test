package enums;

public enum WARNINGS {
	
	LICENSEWARNING {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//b[contains(text(),'License warning:')]";
			String german = "//b[contains(text(),'Lizenzwarnung:')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
		
		public String getMessage(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "License warning";
			String german = "Lizenzwarnung";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
	}
	,
	OK {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "//div[contains(text(),'OK')]";
			return xpath;
		}
	};
	public abstract String getXpath(LANGUAGE language);
	
	public String getMessage(LANGUAGE language) {
		return getMessage(language);
	}
}
