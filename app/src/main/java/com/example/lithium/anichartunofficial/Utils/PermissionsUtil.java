package com.example.lithium.anichartunofficial.Utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

public class PermissionsUtil {

    private static final String[] allDangerousPermissions = new String[]{
            android.Manifest.permission.READ_EXTERNAL_STORAGE,
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE};

    public static boolean hasPermissionsGranted(Context context) {
        int permissionCheck;

        for (String permission : allDangerousPermissions) {
            permissionCheck = ContextCompat.checkSelfPermission(context, permission);
            if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPermissionsRequestGrant(Context context) {
        if (!hasPermissionsGranted(context)) {
            ActivityCompat.requestPermissions((AppCompatActivity) context,
                    allDangerousPermissions, 0);
        }
        return false;
    }
}
