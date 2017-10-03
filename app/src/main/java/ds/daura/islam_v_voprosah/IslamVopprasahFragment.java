package ds.daura.islam_v_voprosah;

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

public class IslamVopprasahFragment extends Fragment {


    public IslamVopprasahFragment() {
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
//            webView.loadUrl("file:///android_asset/islam_voprosah/index.html");
        if (type == 2) {
            webView.loadUrl("file:///android_asset/vopros_1/index.html");
        } else if (type == 3) {
            webView.loadUrl("file:///android_asset/vopros_2/index.html");
        } else if (type == 4) {
            webView.loadUrl("file:///android_asset/vopros_3/index.html");
        }else if (type == 5) {
            webView.loadUrl("file:///android_asset/vopros_4/index.html");
        }else if (type == 6) {
            webView.loadUrl("file:///android_asset/vopros_5/index.html");
        }else if (type == 7) {
            webView.loadUrl("file:///android_asset/vopros_6/index.html");
        }else if (type == 8) {
            webView.loadUrl("file:///android_asset/vopros_7/index.html");
        }else if (type == 9) {
            webView.loadUrl("file:///android_asset/vopros_8/index.html");
        }else if (type == 10) {
            webView.loadUrl("file:///android_asset/vopros_9/index.html");
        }else if (type == 11) {
            webView.loadUrl("file:///android_asset/vopros_10/index.html");
        }else if (type == 12) {
            webView.loadUrl("file:///android_asset/vopros_11/index.html");
        }else if (type == 13) {
            webView.loadUrl("file:///android_asset/vopros_12/index.html");
        }else if (type == 14) {
            webView.loadUrl("file:///android_asset/vopros_13/index.html");
        }else if (type == 15) {
            webView.loadUrl("file:///android_asset/vopros_14/index.html");
        }else if (type == 16) {
            webView.loadUrl("file:///android_asset/vopros_15/index.html");
        }
        return view;
    }


}