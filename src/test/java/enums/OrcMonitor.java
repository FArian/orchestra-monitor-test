package enums;

public enum OrcMonitor {
	MONITORING {
		@Override
		public String getXpath() {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Monitoring')]";
			return xpath;
		}
	},
	ESB {
		@Override
		public String getXpath() {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'ESB')]";
			return xpath;
		}
	},
	CLOUDENVIRONMENT {
		@Override
		public String getXpath() {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Cloud environment')]";
			return xpath;
		}
	},
	SETTINGS {
		@Override
		public String getXpath() {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Settings')]";
			return xpath;
		}
	},
	RUNTIME {
		@Override
		public String getXpath() {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Runtime')]";
			return xpath;
		}
	},
	SERVERINFO {
		@Override
		public String getXpath() {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Server info')]";
			return xpath;
		}
	},
	CHANGEPASSWORD {
		@Override
		public String getXpath() {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Change password')]";
			return xpath;
		}
	},
	LOGOUT {
		@Override
		public String getXpath() {
			String xpath = "//td[@class='navigation-item-text' and contains(., 'Logout')]";
			return xpath;
		}
	};

	public abstract String getXpath();
}
