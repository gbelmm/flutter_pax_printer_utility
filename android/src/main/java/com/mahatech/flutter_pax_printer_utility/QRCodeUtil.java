package com.mahatech.flutter_pax_printer_utility;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
 

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class QRCodeUtil {
    private static QRCodeUtil qrCodeUtil;

    public QRCodeUtil() {}

    

    public static Bitmap getBitmapFromURL(String src) {
        try {
           URL url = new URL(src);
           HttpURLConnection connection = (HttpURLConnection) url.openConnection();
           connection.setDoInput(true);
           connection.connect();
           InputStream input = connection.getInputStream();
           Bitmap myBitmap = BitmapFactory.decodeStream(input);
           return myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}