package dk.appsome.lnberegner.tech;

import java.util.Date;

/**
 * Created by Patrick on 12-04-2015.
 * Technical layer, connected to some DB or other entity with data.
 */
public class Settings {
    private double salary;
    private double tax;
    private int payFrequency;
    private Date payDate;
    private Date calculationDate;

    public double getSalary() {
        return salary;
    }

    public Date getCalculationDate() {
        return calculationDate;
    }

    public int getPayFrequency() {
        return payFrequency;
    }

    public void setPayFrequency(int payFrequency) {
        this.payFrequency = payFrequency;
    }

    public void setCalculationDate(Date calculationDate) {
        this.calculationDate = calculationDate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
