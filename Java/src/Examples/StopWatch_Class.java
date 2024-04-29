package Examples;

public class StopWatch_Class {
	long startTime, endTime;

	StopWatch_Class() {
		start();
	}

	void start() {
		startTime = System.currentTimeMillis();
	}

	void stop() {
		endTime = System.currentTimeMillis();
	}

	long getElapsedTime() {
		return endTime - startTime;
	}

	long getStartTime() {
		return startTime;
	}

	long getEndTime() {
		return endTime;
	}
}
