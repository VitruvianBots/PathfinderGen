import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;

public class Path {
	Trajectory.FitMethod fitMethod = PathfinderGen.fitMethod;
	double max_vel = PathfinderGen.max_vel;
	double max_accel = PathfinderGen.max_accel;
	double max_jerk = PathfinderGen.max_jerk;
	int samples = PathfinderGen.samples;
	double period = PathfinderGen.period;
	
	public String name;
	public Waypoint[] path;
	
	Trajectory.Config config;
	
	public Path(String name, Waypoint[] waypoints) {
		path = waypoints;
		this.name = name;
		reconfigureSettings();
	}
	
	public void setMaxVel(double max_vel) {
		this.max_vel = max_vel;
		reconfigureSettings();
	}
	
	public void setMaxAccel(double max_accel) {
		this.max_accel = max_accel;
		reconfigureSettings();
	}
	
	public void setMaxJerk(double max_jerk) {
		this.max_jerk = max_jerk;
		reconfigureSettings();
	}
	
	public void setFitMethod(Trajectory.FitMethod fitMethod) {
		this.fitMethod = fitMethod;
		reconfigureSettings();
	}
	
	public void setSamples(int samples) {
		this.samples = samples;
		reconfigureSettings();
	}
	
	public void setPeriod(double period) {
		this.period = period;
		reconfigureSettings();
	}
	
	public void reconfigureSettings() {
		config = new Trajectory.Config(fitMethod, samples, period, max_vel, max_accel, max_jerk);
	}
}
