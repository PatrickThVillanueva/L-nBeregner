package dk.appsome.lnberegner.tech;

/**
 * Created by Patrick on 12-04-2015.
 */

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


public class WorkdayDataSource {
    private SQLiteDatabase database;
    private SQLHelper dbHelper;
    private String[] allColumns = { SQLHelper.WORKDAY_ID,
            SQLHelper.WORKDAY_DATE,
            SQLHelper.WORKDAY_START,
            SQLHelper.WORKDAY_END};

    public WorkdayDataSource(Context context) {
        dbHelper = new SQLHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public Workday createWorkday(Workday wd) {
        ContentValues values = new ContentValues();
        values.put(SQLHelper.WORKDAY_DATE, wd.getWORKDAY_DATE());
        values.put(SQLHelper.WORKDAY_START, wd.getWORKDAY_START());
        values.put(SQLHelper.WORKDAY_END, wd.getWORKDAY_END());

        long insertId = database.insert(SQLHelper.TABLE_WORKDAY, null, values);
        Cursor cursor = database.query(SQLHelper.TABLE_WORKDAY,
                allColumns, SQLHelper.WORKDAY_ID + " = " + insertId, null,
                null, null, null);
        cursor.moveToFirst();
        Workday newWorkday = cursorToWorkdayDate(cursor);
        cursor.close();
        return newWorkday;
    }

    private Workday cursorToWorkdayDate(Cursor cursor) {
        Workday wd = new Workday();
        wd.setId(cursor.getLong(0));
        wd.setWORKDAY_DATE(cursor.getString(1));
        return wd;
    }
}
