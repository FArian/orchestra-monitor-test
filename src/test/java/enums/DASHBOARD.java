package enums;

public enum DASHBOARD {
	BASE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Dashboard')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Übersicht')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}

		@Override
		public String getElement1(LANGUAGE language) {
			String element = "NOTSET";
			String english = "Dashboard";
			String german = "Übersicht";
			return element = language.equals(language.ENGLISH) ? english : german;
		}
	},
	NODE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//td[@class='navigation-item-text' and contains(., 'Dashboard node')]";
			String german = "//td[@class='navigation-item-text' and contains(., 'Dashboard')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}
		@Override
		public String getElement1(LANGUAGE language) {
			String element = "NOTSET";
			String english = "Dashboard node";
			String german = "Dashboard";
			return element = language.equals(language.ENGLISH) ? english : german;
		}
	},
	PROCESSTIMELINE {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Process timeline')]";
			String german = "//div[contains(text(),'Prozessverlauf')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}

		@Override
		public String getElement1(LANGUAGE language) {
			String element = "NOTSET";
			String english = "Process timeline";
			String german = "Prozessverlauf";
			return element = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SYSTEMRESOURCES {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'System resources')]";
			String german = "//div[contains(text(),'Systemressourcen')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}

		@Override
		public String getElement1(LANGUAGE language) {
			String element = "NOTSET";
			String english = "System resources";
			String german = "Systemressourcen";
			return element = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SYSTEMEVENTMONITOR {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'System event monitor')]";
			String german = "//div[contains(text(),'System-Ereignismonitor')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}

		@Override
		public String getElement1(LANGUAGE language) {
			String element = "NOTSET";
			String english = "System event monitor";
			String german = "System-Ereignismonitor";
			return element = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SIGNALMONITOR {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Signal monitor')]";
			String german = "//div[contains(text(),'Signalmonitor')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}

		@Override
		public String getElement1(LANGUAGE language) {
			String element = "NOTSET";
			String english = "Signal monitor";
			String german = "Signalmonitor";
			return element = language.equals(language.ENGLISH) ? english : german;
		}
	},
	SERVERINFO {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Server info')]";
			String german = "//div[contains(text(),'Serverinfo')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}

		@Override
		public String getElement1(LANGUAGE language) {
			String element = "NOTSET";
			String english = "Server info";
			String german = "Serverinfo";
			return element = language.equals(language.ENGLISH) ? english : german;
		}
	},
	CHANNELINVOCATIONS {
		@Override
		public String getXpath(LANGUAGE language) {
			String xpath = "NOTSET";
			String english = "//div[contains(text(),'Channel invocations')]";
			String german = "//div[contains(text(),'Kanalaufrufe')]";
			return xpath = language.equals(language.ENGLISH) ? english : german;
		}

		@Override
		public String getElement1(LANGUAGE language) {
			String element = "NOTSET";
			String english = "Channel invocations";
			String german = "Channel invocations";
			return element = language.equals(language.ENGLISH) ? english : german;
		}
	};

	public abstract String getXpath(LANGUAGE language);

	public abstract String getElement1(LANGUAGE language);
}
