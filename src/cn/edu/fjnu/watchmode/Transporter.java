package cn.edu.fjnu.watchmode;

import java.util.ArrayList;
import java.util.List;

public class Transporter implements Wathed{

	private List<Watcher> list = new ArrayList<>();
	
	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers() {
		for(Watcher watcher: list)
			watcher.update();
	}

}
