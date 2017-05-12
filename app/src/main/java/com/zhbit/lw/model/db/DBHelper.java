package com.zhbit.lw.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.zhbit.lw.model.dao.FriendTable;
import com.zhbit.lw.model.dao.MomentTable;

/**
 * Created by fl5900 on 2017/5/11.
 */

public class DBHelper extends SQLiteOpenHelper{

    public DBHelper(Context context, String name){
        super(context, name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建好友表
        db.execSQL(FriendTable.CreateTable);
        //创建朋友圈表
        db.execSQL(MomentTable.CreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
