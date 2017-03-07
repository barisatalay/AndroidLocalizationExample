package com.atalay.androidlocalizationexample.Base;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.akexorcist.localizationactivity.LocalizationDelegate;
import com.atalay.androidlocalizationexample.R;

import java.util.Locale;

/**
 * Created by baris on 6.03.2017.
 */

public class BaseActivity extends AppCompatActivity {
    private LocalizationDelegate localizationDelegate = new LocalizationDelegate(this);
    private String activeLangCode = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        localizationDelegate.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);

        //Aktif olan dil kodunu alıyoruz.
        activeLangCode = (PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext())).getString(getString(R.string.pref_general_language),"en");

        setLanguage(activeLangCode);
    }

    @Override
    public void onResume() {
        super.onResume();
        localizationDelegate.onResume();
    }

    /*
    * Kütüphaneye aktif olan dil kodunu gönderiyoruz ve
    * kütüphane uygulamamızın aktif olan Activitysini yeniden oluşturuyor
    * bu sayede string resourceler gerekli dilden çekiliyor.
    */
    public final void setLanguage(String language) {
        localizationDelegate.setLanguage(language);
    }

    public final void setLanguage(Locale locale) {
        localizationDelegate.setLanguage(locale);
    }

    public final void setDefaultLanguage(String language) {
        localizationDelegate.setDefaultLanguage(language);
    }

    public final void setDefaultLanguage(Locale locale) {
        localizationDelegate.setDefaultLanguage(locale);
    }

    public final String getLanguage() {
        return localizationDelegate.getLanguage();
    }

    public final Locale getLocale() {
        return localizationDelegate.getLocale();
    }

}