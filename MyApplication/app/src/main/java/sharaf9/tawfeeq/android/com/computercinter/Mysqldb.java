package sharaf9.tawfeeq.android.com.computercinter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by نايف الشهاري n 23/04/19.
 */
public class Mysqldb extends SQLiteOpenHelper {
    public static final String co1 = "NAME";
    public static final String co2 = "PHONE";
    public static final String co3 = "PRICE";

    public static final String dbname ="Mysqldb.db";

    public Mysqldb(Context context) {
        super(context, dbname, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table   student (id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT UNIQUE,PHONE TEXT UNIQUE,PRICE TEXT)");
        db.execSQL("create table   student1 (id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT UNIQUE,PHONE TEXT UNIQUE,PRICE TEXT)");
        db.execSQL("create table   student2 (id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT UNIQUE,PHONE TEXT UNIQUE,PRICE TEXT)");
        db.execSQL("create table   student3 (id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT UNIQUE,PHONE TEXT UNIQUE,PRICE TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        db.execSQL("DROP TABLE IF EXIST " + "student");
        db.execSQL("DROP TABLE IF EXIST " + "student1");
        db.execSQL("DROP TABLE IF EXIST " + "student2");
        db.execSQL("DROP TABLE IF EXIST " + "student3");

        onCreate(db);



    }
    //*******************************************************************************************//
    public boolean inserData(String name,String phone,String price)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contenvalues = new ContentValues();
        contenvalues.put(co1,name);
        contenvalues.put(co2,phone);
        contenvalues.put(co3,price);

        long result = db.insert("student", null, contenvalues);
        if (result == -1)
            return false;
        else
            return true;
    }

    //******************************************************************************************//
    public boolean updateData(String id,String name,String phone,String price)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contenvalues = new ContentValues();

        contenvalues.put(co1,name);
        contenvalues.put(co2,phone);
        contenvalues.put(co3,price);;

        db.update("student",contenvalues,"id= ?",new String[]{id});
        return true;
    }

    //*************************************************************************************//
    public Integer Delete(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("student","id= ?",new String[]{id});

    }

    //******************************************************************************************//
    public ArrayList get_first_name() {
        ArrayList arr= new ArrayList();

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor res = db.rawQuery("select * from student", null);//select what we want

        res.moveToFirst();
        while (res.isAfterLast() == false){
            String id= res.getString(0);
            String nam= res.getString(1);
            String ph= res.getString(2);
            String pr= res.getString(3);
            arr.add(id +" Name:- "+nam +"  Phone:- "+ph +"  Price:- "+pr);
            res.moveToNext();
        }

        return arr;
    }

//****************************************** graphex ******************************************//

    //*******************************************************************************************//
    public boolean inserData1(String name,String phone,String price)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contenvalues = new ContentValues();
        contenvalues.put(co1,name);
        contenvalues.put(co2,phone);
        contenvalues.put(co3,price);

        long result = db.insert("student1", null, contenvalues);
        if (result == -1)
            return false;
        else
            return true;
    }

    //******************************************************************************************//
    public boolean updateData1(String id,String name,String phone,String price)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contenvalues = new ContentValues();

        contenvalues.put(co1,name);
        contenvalues.put(co2,phone);
        contenvalues.put(co3,price);;

        db.update("student1",contenvalues,"id= ?",new String[]{id});
        return true;
    }

    //*************************************************************************************//
    public Integer Delete1(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("student1","id= ?",new String[]{id});

    }

    //******************************************************************************************//
    public ArrayList get_first_name1() {
        ArrayList arr= new ArrayList();

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor res = db.rawQuery("select * from student1", null);//select what we want

        res.moveToFirst();
        while (res.isAfterLast() == false){
            String id= res.getString(0);
            String nam= res.getString(1);
            String ph= res.getString(2);
            String pr= res.getString(3);
            arr.add(id +" Name:- "+nam +"  Phone:- "+ph +"  Price:- "+pr);
            res.moveToNext();
        }

        return arr;
    }
    //****************************************** number3 ******************************************//
//*********************************** number3 ***************************************************//
public boolean inserData2(String name,String phone,String price)
{
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues contenvalues = new ContentValues();
    contenvalues.put(co1,name);
    contenvalues.put(co2,phone);
    contenvalues.put(co3,price);

    long result = db.insert("student2", null, contenvalues);
    if (result == -1)
        return false;
    else
        return true;
}

    //******************************************************************************************//
    public boolean updateData2(String id,String name,String phone,String price)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contenvalues = new ContentValues();

        contenvalues.put(co1,name);
        contenvalues.put(co2,phone);
        contenvalues.put(co3,price);;

        db.update("student2",contenvalues,"id= ?",new String[]{id});
        return true;
    }

    //*************************************************************************************//
    public Integer Delete2(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("student2","id= ?",new String[]{id});

    }

    //******************************************************************************************//
    public ArrayList get_first_name2() {
        ArrayList arr= new ArrayList();

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor res = db.rawQuery("select * from student2", null);//select what we want

        res.moveToFirst();
        while (res.isAfterLast() == false){
            String id= res.getString(0);
            String nam= res.getString(1);
            String ph= res.getString(2);
            String pr= res.getString(3);
            arr.add(id +" Name:- "+nam +"  Phone:- "+ph +"  Price:- "+pr);
            res.moveToNext();
        }

        return arr;
    }
    //**************************************** number4 ******************************************//
//**************************************** number4 **********************************************//
public boolean inserData3(String name,String phone,String price)
{
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues contenvalues = new ContentValues();
    contenvalues.put(co1,name);
    contenvalues.put(co2,phone);
    contenvalues.put(co3,price);

    long result = db.insert("student3", null, contenvalues);
    if (result == -1)
        return false;
    else
        return true;
}

    //******************************************************************************************//
    public boolean updateData3(String id,String name,String phone,String price)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contenvalues = new ContentValues();

        contenvalues.put(co1,name);
        contenvalues.put(co2,phone);
        contenvalues.put(co3,price);;

        db.update("student3",contenvalues,"id= ?",new String[]{id});
        return true;
    }

    //*************************************************************************************//
    public Integer Delete3(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("student3","id= ?",new String[]{id});

    }

    //******************************************************************************************//
    public ArrayList get_first_name3() {
        ArrayList arr= new ArrayList();

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor res = db.rawQuery("select * from student3", null);//select what we want

        res.moveToFirst();
        while (res.isAfterLast() == false){
            String id= res.getString(0);
            String nam= res.getString(1);
            String ph= res.getString(2);
            String pr= res.getString(3);
            arr.add(id +" Name:- "+nam +"  Phone:- "+ph +"  Price:- "+pr);
            res.moveToNext();
        }

        return arr;
    }

}


