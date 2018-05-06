package com.example.asus.servicebestpractice;

/**
 * Created by asus on 2018/3/3.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
