package com.ionicframework.lalaapp964991;

import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by Administrator on 2016/1/31.
 */
public class Flower {

  public Flower(){

  }

  @JavascriptInterface
  public void yanghua(){

      Log.d("Test", "成功啦!!!");
  }

}
