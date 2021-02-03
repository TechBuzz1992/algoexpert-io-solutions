import java.util.*;

class Mimimum_Waiting_Time {

  public int minimumWaitingTime(int[] queries) {
    Arrays.sort(queries);
		int waitingTime = 0;
		for(int i = 0;i<queries.length;i++){
			int duration = queries[i];
			int queriesLeft = queries.length -(i+1);
			waitingTime += duration * queriesLeft;
		}
		return waitingTime;
	}
}
