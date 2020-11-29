package com.example.ImageToText;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class TSpeak {
    private TextToSpeech textToSpeech;
    public TSpeak(Context context){
        setLang(context);

    }
    public void setLang(Context context){
        textToSpeech= new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==TextToSpeech.SUCCESS){
                    int ttslang=textToSpeech.setLanguage(Locale.ENGLISH);

                }
                else{
                    //Toast.makeText(MainActivity.class, "Initialization failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void convert(String data) {


        textToSpeech.speak(data,TextToSpeech.QUEUE_FLUSH,null);
    }
}
