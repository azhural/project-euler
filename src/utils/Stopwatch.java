package utils;

public class Stopwatch {
	private long startTime;

	public Stopwatch() {
		startTime = System.nanoTime();
	}

	public long timeNS() {
		return System.nanoTime() - startTime;
	}

	public long timeUS() {
		return timeNS() / 1000;
	}

	public long timeMS() {
		return timeUS() / 1000;
	}

	public long timeS() {
		return timeMS() / 1000;
	}
}
