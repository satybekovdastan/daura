package ds.daura.programma_dlya_treb_znaniya.shest_osnov;

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

public class ShestOsnovFragment extends Fragment {


    public ShestOsnovFragment() {
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

        Log.e("TYPE", type + "");
//        if (type == 1) {
//            webView.loadUrl("file:///android_asset/shest_osnov_kurs/index.html");
        if (type == 2) {
            webView.loadUrl("file:///android_asset/shest_osnov_kurs_1/index.html");
        } else if (type == 3) {
            webView.loadUrl("file:///android_asset/shest_osnov_kurs_2/index.html");
        } else if (type == 4) {
            webView.loadUrl("file:///android_asset/shest_osnov_kurs_3/index.html");
        } else if (type == 5) {
            webView.loadUrl("file:///android_asset/shest_osnov_kurs_4/index.html");
        } else if (type == 6) {
            webView.loadUrl("file:///android_asset/shest_osnov_kurs_5/index.html");
        } else if (type == 7) {
            webView.loadUrl("file:///android_asset/shest_osnov_kurs_6/index.html");
        }
        return view;
    }


}