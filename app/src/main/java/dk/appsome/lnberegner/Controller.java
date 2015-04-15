package dk.appsome.lnberegner;

import java.sql.Date;
import java.util.Calendar;
import dk.appsome.lnberegner.tech.*;

/**
 * Created by Patrick on 12-04-2015.
 */
public class Controller {
    private Settings settings = new Settings();
    private Workday wd = new Workday();

    public double calculateSalaryByDatePreTax(Date workdate){
        //request
        wd.getWORKDAY_DATE();
        int workedTime = wd.getWORKDAY_END().compareTo(wd.getWORKDAY_START());

        double salary = settings.getSalary();

        return workedTime * salary;
    }

    public double calculateSalaryByDateAfterTax(Date workdate){
        return settings.getTax() * calculateSalaryByDatePreTax(workdate);
    }

    public int countDownToPayday(){
        Calendar currenttime = Calendar.getInstance();
        Date sqldate = new Date((currenttime.getTime()).getTime());

        return settings.getPayDate().compareTo(sqldate);
    }
}
