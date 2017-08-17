package com.example.crianbra.hilosbasico;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.math.BigInteger;

/**
 * Created by crianbra on 10/08/17.
 */

public class NumerosPrimos extends Thread{


    Message message = null;
    Handler handler;
    private TextView resultView;

    public NumerosPrimos(Handler handler){
        this.handler = handler;
    }

    /*protected BigInteger doInBackground(Integer... params) {
        int n= params[0];
        BigInteger prime = new BigInteger("2");
        for (int i=0; i<n; i++){
            Bundle bundle = new Bundle();
            bundle.putInt("numero", i);
            message = Message.obtain();
            message.setData(bundle);
            handler.sendMessage(message);
            prime = prime.nextProbablePrime();
        }
        return prime;
    }*/


    public void run() {
        int n= 100;
        for (int i=0; i<n; i++){
            Bundle bundle = new Bundle();
            bundle.putInt("numero", i);
            message = Message.obtain();
            message.setData(bundle);
            handler.sendMessage(message);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
