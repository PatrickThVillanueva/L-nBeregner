package dk.appsome.lnberegner.tech;

import android.content.Context;
import android.database.sqlite.*;
import android.util.Log;

/**
 * Created by Patrick on 12-04-2015.
 */
public class SQLHelper extends SQLiteOpenHelper {
    public static SQLHelper db;
    public final static String TABLE_WORKDAY = "workday";
    public final static String WORKDAY_ID = "_id";
    public final static String WORKDAY_DATE = "date";
    public final static String WORKDAY_START = "start";
    public final static String WORKDAY_END = "end";

    public static final String DATABASE_NAME = "salary.db";
    public static final int DATABASE_VERSION = 1;

    public SQLHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_WORKDAY + "(" + WORKDAY_ID
            + " integer primary key autoincrement, " + WORKDAY_DATE
            + " text not null, "+ WORKDAY_START + ", " + WORKDAY_END +");";

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(SQLHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WORKDAY);
        onCreate(db);
    }

}
