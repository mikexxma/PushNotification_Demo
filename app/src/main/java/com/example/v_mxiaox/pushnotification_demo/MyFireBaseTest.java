package com.example.v_mxiaox.pushnotification_demo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
/**
 * Created by v-mxiaox on 1/3/2017.
 */

public class MyFireBaseTest extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("Mike", "Refreshed token: " + refreshedToken);

        // TODO: Implement this method to send any registration to your app's servers.
        //sendRegistrationToServer(refreshedToken);

    }
}
