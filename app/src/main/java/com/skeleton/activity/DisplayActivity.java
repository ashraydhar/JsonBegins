package com.skeleton.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.skeleton.R;
import com.skeleton.model.UserInfo;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.List;

/**
 * dvvdvvdsv
 */
public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        RestClient.getApiInterface().getUserData().enqueue(new ResponseResolver<List<UserInfo>>(this, true) {
            /**
             *
             * @param userInfos userInfos
             */
            @Override
            public void success(final List<UserInfo> userInfos) {

            }

            /**
             * @param error the error
             */
            @Override
            public void failure(final APIError error) {

            }
        });
    }
}
