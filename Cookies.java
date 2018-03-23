package com.realdev.beaudry.daystory;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Steph on 11/26/2017.
 */

public class Cookies {
    SharedPreferences sharedpreferences;
    public static final String mypreference = "mypref";
    SharedPreferences.Editor editor;

    public Cookies(Context context) {
            sharedpreferences = context.getSharedPreferences(mypreference,
                                             Context.MODE_PRIVATE);
    editor = sharedpreferences.edit();
    }
  public   boolean createString(String attr, String value)
    {
        editor.putString(attr, value);
       if (editor.commit())
           return true;

        return false;

    }
    boolean createInt(String attr, int value)
    {
        editor.putInt(attr, value);
        if (editor.commit())
            return true;

        return false;

    }
    boolean delete(String attr)
    {
        editor.remove(attr);
        if (!sharedpreferences.contains(attr))
            return true;

        return false;

    }
   public String getString(String attr)
    {
        if (sharedpreferences.contains(attr))
            return  sharedpreferences.getString(attr, "");

       return "";

    }
    int getInt(String attr)
    {
        if (sharedpreferences.contains(attr))
            return  sharedpreferences.getInt(attr, 0);

        return 0;

    }
    boolean getStringExist(String attr)
    {
        if (sharedpreferences.contains(attr))
            return  true;
        else
            return false;



    }


}
