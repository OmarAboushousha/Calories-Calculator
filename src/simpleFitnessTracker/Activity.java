package simpleFitnessTracker;

public class Activity {
	
	private int totalCaloriesBurnt = 0;
	private float totalHeartRate = 80;
	private int time;
	private int SCC = 0;
	private float SHRC = 0;
	private int RCC = 0;
	private float RHRC = 0;
	private int KBCC = 0;
	private float KBHRC = 0;
	private int STCC = 0;
	private float STHRC = 0;
	private float[] swimming = {SCC, SHRC};
	private float[] running = {RCC, RHRC};
	private float[] kickBoxing = {KBCC, KBHRC};
	private float[] strengthTraining = {STCC, STHRC};
	private float[][] activityArray = {swimming, running, kickBoxing, strengthTraining};
	private String[] activityName = {"Swimming", "Running", "Kick Boxing", "Strength Training"};
	private int nameCounter = 0;
	private int caloriesCounter = 0;
	private int heartRateCounter = 0;
	
	public void setTime(int time) {	
		this.time = time;
	}
	public int getTotalCaloriesBurnt() {
		return totalCaloriesBurnt;
	}
	public float getTotalHeartRate() {
		return totalHeartRate;
	}
	public void calculateTotalCaloriesBurnt(int caloriesBurnt)
	{
		totalCaloriesBurnt += caloriesBurnt * time;
	}
	public void calculateTotalHeartRate(float heartRateIncrease)
	{
		totalHeartRate += totalHeartRate * time * heartRateIncrease;
	}
	public void calculateSCC(int caloriesBurnt) {
		SCC += caloriesBurnt * time;
	}
	public void calculateSHRC(float heartRateIncrease) {
		SHRC += totalHeartRate * time * heartRateIncrease;
	}
	public void calculateRCC(int caloriesBurnt) {
		RCC += caloriesBurnt * time;
	}
	public void calculateRHRC(float heartRateIncrease) {
		RHRC += totalHeartRate * time * heartRateIncrease;
	}
	public void calculateKBCC(int caloriesBurnt) {
		KBCC += caloriesBurnt * time;
	}
	public void calculateKBHRC(float heartRateIncrease) {
		KBHRC += totalHeartRate * time * heartRateIncrease;
	}
	public void calculateSTCC(int caloriesBurnt) {
		STCC += caloriesBurnt * time;
	}
	public void calculateSTHRC(float heartRateIncrease) {
		STHRC += totalHeartRate * time * heartRateIncrease;
	}
	public void sortActivities() {
		swimming[0] = SCC;
		swimming[1] = SHRC;
		running[0] = RCC;
		running[1] = RHRC;
		kickBoxing[0] = KBCC;
		kickBoxing[1] = KBHRC;
		strengthTraining[0] = STCC;
		strengthTraining[1] = STHRC;
		int i, j;
		float valueTemp;
		String nameTemp;
		
		for(i = 0; i < activityArray.length - 1; i++) {
			for(j = i + 1; j < activityArray.length; j++) {
				if(activityArray[i][0] < activityArray[j][0]) {
					valueTemp = activityArray[i][0];
					activityArray[i][0] = activityArray[j][0];
					activityArray[j][0] = valueTemp;
					valueTemp = activityArray[i][1];
					activityArray[i][1] = activityArray[j][1];
					activityArray[j][1] = valueTemp;
					nameTemp = activityName[i];
					activityName[i] = activityName[j];
					activityName[j] = nameTemp;
				}
				else if(activityArray[i][0] == activityArray[j][0]) {
					if(activityArray[i][1] < activityArray[j][1]) {
						valueTemp = activityArray[i][0];
						activityArray[i][0] = activityArray[j][0];
						activityArray[j][0] = valueTemp;
						valueTemp = activityArray[i][1];
						activityArray[i][1] = activityArray[j][1];
						activityArray[j][1] = valueTemp;
						nameTemp = activityName[i];
						activityName[i] = activityName[j];
						activityName[j] = nameTemp;
					}
				}
			}
		}
	}
	public String printActivityName() {
		if(nameCounter == 4)
			nameCounter = 0;
		return activityName[nameCounter++];
	}
	public int printCaloriesBurnt() {
		if(caloriesCounter == 4)
			caloriesCounter = 0;
		return (int)activityArray[caloriesCounter++][0];
	}
	public float printHeartRateIncrease() {
		if(heartRateCounter == 4)
			heartRateCounter = 0;
		return activityArray[heartRateCounter++][1];
	}
}
