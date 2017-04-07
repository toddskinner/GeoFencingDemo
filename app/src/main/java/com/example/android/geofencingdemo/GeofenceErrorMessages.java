package com.example.android.geofencingdemo;

import android.content.Context;
import android.content.res.Resources;

import com.google.android.gms.location.GeofenceStatusCodes;

/**
 * Created by toddskinner on 4/5/17.
 */

public class GeofenceErrorMessages {

    private GeofenceErrorMessages(){

    }

    public static String getErrorString(Context context, int errorCode){
        Resources mResources = context.getResources();
        switch(errorCode){
            case GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE:
                return "Geofence service is not available now";
            case GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES:
                return "Your app has registered too many geofences";
            case GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS:
                return "You have provided too many PendingIntents";
            default:
                return "Unknown error: the Geofence service is not available now.";
        }
    }
}
