/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.dragapablepanel.ex.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.dragapablepanel.sample.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Pedro Vicente Gómez Sánchez.
 */
public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    ImageView image = findViewById(R.id.iv_places);
    image.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
       openSimpleSampleActivity();
      }
    });
  }

   void openSimpleSampleActivity() {
    Intent intent = new Intent(this, PlacesSampleActivity.class);
    startActivity(intent);
  }

  @OnClick(R.id.iv_tv_shows) void openTvShowsSampleActivity() {
    Intent intent = new Intent(this, TvShowsActivity.class);
    startActivity(intent);
  }

  @OnClick(R.id.iv_youtube) void openYoutubeSampleActivity() {
    Intent intent = new Intent(this, YoutubeSampleActivity.class);
    startActivity(intent);
  }

  @OnClick(R.id.iv_video) void openVideoSampleActivity() {
    Intent intent = new Intent(this, VideoSampleActivity.class);
    startActivity(intent);
  }
}
