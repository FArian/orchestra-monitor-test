package enums;

public enum ERRORS {
	
	USERLOGIN {
		public String getContent() {
			String content = "Error";
			return content;
		}
	},
	OK {
		public String getXpath() {
			String xpath = "//div[contains(text(),'OK')]";
			return xpath;
		}
	};
	
	public String getXpath() {
		return getXpath();
	}
	public String getContent() {
		return getContent();
	}
}
