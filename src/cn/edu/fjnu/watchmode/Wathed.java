package cn.edu.fjnu.watchmode;

public interface Wathed {
	void addWatcher(Watcher watcher);
	void removeWatcher(Watcher watcher);
	void notifyWatchers();
}
