package com.lyf.content.web.jpmediawrapper;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.cry.mediametaretriverwrapper.MediaMetadataRetrieverWrapper;
import com.cry.mediametaretriverwrapper.RetrieverProcessThread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaMetadataRetrieverWrapper metadataRetriever2 = new MediaMetadataRetrieverWrapper();
        metadataRetriever2.setDataSource("");
        metadataRetriever2
                .getFramesInterval(500, 2, new RetrieverProcessThread.BitmapCallBack() {
                    @Override
                    public void onComplete(final Bitmap frame) {
                    }

                    @Override
                    public void onEnd() {
                    }
                });
    }
}
