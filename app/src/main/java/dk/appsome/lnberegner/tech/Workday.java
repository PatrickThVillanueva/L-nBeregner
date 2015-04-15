package dk.appsome.lnberegner.tech;

import java.sql.Date;

/**
 * Created by Patrick on 12-04-2015.
 */
public class Workday {
    private long id;
    private String WORKDAY_DATE;
    private String WORKDAY_START;
    private String WORKDAY_END;

    public String getWORKDAY_DATE() {
        return WORKDAY_DATE;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWORKDAY_DATE(String WORKDAY_DATE) {
        this.WORKDAY_DATE = WORKDAY_DATE;
    }

    public String getWORKDAY_START() {
        return WORKDAY_START;
    }

    public void setWORKDAY_START(String WORKDAY_START) {
        this.WORKDAY_START = WORKDAY_START;
    }

    public String getWORKDAY_END() {
        return WORKDAY_END;
    }

    public void setWORKDAY_END(String WORKDAY_END) {
        this.WORKDAY_END = WORKDAY_END;
    }

    @Override
    public String toString() {
        return WORKDAY_DATE +" er der arbejdet fra kl. " + WORKDAY_START +" til kl. " +WORKDAY_END;
    }
}
