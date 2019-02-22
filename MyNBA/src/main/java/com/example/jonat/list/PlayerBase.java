package com.example.jonat.list;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PlayerBase extends SQLiteOpenHelper{
    private static PlayerBase instance;

    private static final String DATABASE_NAME = "PlayerBase";
    private static final String TABLE_NAME = "AllPlayers";
    private static final String NAME_COL = "name";
    private static final String PTS_COL = "points";
    private static final String REB_COL = "rebounds";
    private static final String AST_COL = "assists";

    public PlayerBase(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + "(" + NAME_COL + "TEXT PRIMARY KEY,"
                + PTS_COL + "TEXT," + REB_COL + "TEXT," + AST_COL + "TEXT" + ")";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(Player player) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(NAME_COL, player.getName());
        contentValues.put(PTS_COL, player.getPPG());
        contentValues.put(REB_COL, player.gettRB());
        contentValues.put(AST_COL, player.getaST());

        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
}
