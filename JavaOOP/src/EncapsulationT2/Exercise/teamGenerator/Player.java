package EncapsulationT2.Exercise.teamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    private void setEndurance(int endurance) {
        checkIfInRange(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setSprint(int sprint) {
        checkIfInRange(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        checkIfInRange(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        checkIfInRange(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        checkIfInRange(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void checkIfInRange(int statvalue, String setName) {
        if (statvalue < 0 || statvalue > 100) {
            throw new IllegalArgumentException(setName + " should be between 0 and 100.");
        }
    }

    public double overallSkillLevel() {
        return (this.endurance + this.dribble + this.passing + this.shooting + this.sprint) / 5.0;
    }

}
