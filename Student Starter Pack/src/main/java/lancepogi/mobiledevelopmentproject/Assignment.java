package lancepogi.mobiledevelopmentproject;

/**
 * Created by Lance on 1/12/2017.
 */

public class Assignment {

    private int id;
    private String subj_name;
    private String desc;
    private boolean isDone;
    private String deadline;

    public Assignment() {

    }

    public Assignment(int id, String subj_name, String desc, String deadline) {
        this.id = id;
        this.subj_name = subj_name;
        this.desc = desc;
        this.deadline = deadline;
        isDone = false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubj_name(String subj_name) {
        this.subj_name = subj_name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setIsDone(int isDone){
        if (isDone == 0) {
            this.isDone = false;
        } else {
            this.isDone = true;
        }
    }

    public int getID() {
        return this.id;
    }

    public String getSubj_name() {
        return this.subj_name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public int getIsDone() {
        if (isDone = false) {
            return 0;
        }
        else {
            return 1;
        }
    }

}
