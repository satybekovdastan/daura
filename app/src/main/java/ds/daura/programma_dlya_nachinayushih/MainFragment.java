package ds.daura.programma_dlya_nachinayushih;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import ds.daura.R;

public class MainFragment extends Fragment {


    String jsonResult = "";

    int total_count = 1000000;
    public static TextView playingSong;
    public static Button btnPause, btnPlay;
    public static LinearLayout linearLayoutPlayingSong;
    static int type;
    ProgressBar progress;
    public static void page(int i) {
        type = i;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);


        WebView webView = (WebView) view.findViewById(R.id.webViewAndroid);

        final ProgressBar pbar;
        final TextView txtview = (TextView)view.findViewById(R.id.tV1);
        pbar = (ProgressBar) view.findViewById(R.id.pB1);

        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if(progress < 100 && pbar.getVisibility() == ProgressBar.GONE){
                    pbar.setVisibility(ProgressBar.VISIBLE);
                    txtview.setVisibility(View.VISIBLE);
                }

                pbar.setProgress(progress);
                if(progress == 100) {
                    pbar.setVisibility(ProgressBar.GONE);
                    txtview.setVisibility(View.GONE);
                }
            }
        });

//        if (type == 1) {
//            webView.loadUrl("file:///android_asset/lectionOne/lection.html");
        if(type ==2){
            webView.loadUrl("file:///android_asset/lection2.html");
        }else if(type ==3){
            webView.loadUrl("file:///android_asset/lection3.html");
        }
        else if(type ==4){
            webView.loadUrl("file:///android_asset/lection4.html");
        }else if(type ==5){
            webView.loadUrl("file:///android_asset/lection5.html");
        }else if(type ==6){
            webView.loadUrl("file:///android_asset/lection6.html");
        }else if(type ==7){
            webView.loadUrl("file:///android_asset/lection7.html");
        }else if(type ==8){
            webView.loadUrl("file:///android_asset/lection8.html");
        }
        return view;
    }


}
