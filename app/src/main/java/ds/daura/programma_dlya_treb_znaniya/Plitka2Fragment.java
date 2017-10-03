package ds.daura.programma_dlya_treb_znaniya;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;

import ds.daura.R;

public class Plitka2Fragment extends Fragment {


    public Plitka2Fragment() {
    }

    static int type;


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
        View view = inflater.inflate(R.layout.fragment_course, container, false);

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

        Log.e("TYPE", type+"");
        //    webView.loadUrl("file:///android_asset/tri_osnovy_kurs/index.html");
         if(type ==2){
            webView.loadUrl("file:///android_asset/tri_osnovy_kurs_1/index.html");
        }else if(type ==3){
            webView.loadUrl("file:///android_asset/tri_osnovy_kurs_2/index.html");
        }else if(type ==4){
            webView.loadUrl("file:///android_asset/tri_osnovy_kurs_3/index.html");
        }else if(type ==5){
            webView.loadUrl("file:///android_asset/tri_osnovy_kurs_4a/index.html");
        }else if(type ==6){
            webView.loadUrl("file:///android_asset/tri_osnovy_kurs_5/index.html");
        }
        return view;
    }


}