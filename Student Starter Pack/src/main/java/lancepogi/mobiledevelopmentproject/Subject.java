package lancepogi.mobiledevelopmentproject;

/**
 * Created by Lance on 1/11/2017.
 */

public class Subject {

    private int id;
    private String subjName;
    private int units;
    private String startTime;
    private String endTime;
    private boolean isMonday, isTuesday, isWednesday, isThursday, isFriday, isSaturday = false;

    public Subject() {

    }

    public Subject(int id, String subjName, int units, String startTime, String endTime, String[] day) {
        this.id = id;
        this.subjName = subjName;
        this.units = units;
        this.startTime = startTime;
        this.endTime = endTime;

        for (String aDay: day) {

            switch (aDay) {
                case "monday" :
                    this.isMonday = true;
                    break;

                case "tuesday" :
                    this.isTuesday = true;
                    break;

                case "wednesday" :
                    this.isWednesday = true;
                    break;

                case "thursday" :
                    this.isThursday = true;
                    break;

                case "friday" :
                    this.isFriday = true;
                    break;

                case "saturday" :
                    this.isSaturday = true;
                    break;

                default:
            }   //end of switch statement

        }   //end of foreach loop

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setDay(String day, int intIsDay) {

        boolean isDay;

        if(intIsDay == 0) {
            isDay = false;
        }
        else {
            isDay = true;
        }

        switch (day) {
            case "monday" :
                this.isMonday = isDay;
                break;

            case "tuesday" :
                this.isTuesday = isDay;
                break;

            case "wednesday" :
                this.isWednesday = isDay;
                break;

            case "thursday" :
                this.isThursday = isDay;
                break;

            case "friday" :
                this.isFriday = isDay;
                break;

            case "saturday" :
                this.isSaturday = isDay;
                break;

            default:
        }

    }

    public int getID() {
        return this.id;
    }

    public String getSubjName() {
        return this.subjName;
    }

    public int getUnits() {
        return this.units;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public int getDay(String day) {
        switch (day) {
            case "monday":
                return getBit(this.isMonday);
            case "tuesday":
                return getBit(this.isTuesday);
            case "wednesday":
                return getBit(this.isWednesday);
            case "thursday":
                return getBit(this.isThursday);
            case "friday":
                return getBit(this.isFriday);
            case "saturday":
                return getBit(this.isSaturday);
            default:
                return 0;
        }
    }

    public int getBit(boolean bool) {
        if (bool == false) {
            return 0;
        } else {
            return 1;
        }
    }

}