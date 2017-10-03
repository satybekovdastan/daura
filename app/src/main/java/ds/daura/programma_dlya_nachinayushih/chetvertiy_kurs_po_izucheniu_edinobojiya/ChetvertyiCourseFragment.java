package ds.daura.programma_dlya_nachinayushih.chetvertiy_kurs_po_izucheniu_edinobojiya;

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

public class ChetvertyiCourseFragment extends Fragment {


    public ChetvertyiCourseFragment() {
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
        final TextView txtview = (TextView) view.findViewById(R.id.tV1);
        pbar = (ProgressBar) view.findViewById(R.id.pB1);
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if (progress < 100 && pbar.getVisibility() == ProgressBar.GONE) {
                    pbar.setVisibility(ProgressBar.VISIBLE);
                    txtview.setVisibility(View.VISIBLE);
                }

                pbar.setProgress(progress);
                if (progress == 100) {
                    pbar.setVisibility(ProgressBar.GONE);
                    txtview.setVisibility(View.GONE);
                }
            }
        });


        Log.e("TYPE", type + "");
//        if (type == 1) {
//            webView.loadUrl("file:///android_asset/kifayatul_mustazid_vstuplenie/index.html");
        if (type == 2) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_1/index.html");
        } else if (type == 3) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_2/index.html");
        } else if (type == 4) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_3/index.html");

        } else if (type == 5) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_4/index.html");

        } else if (type == 6) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_5/index.html");

        } else if (type == 7) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_6/index.html");

        } else if (type == 8) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_7/index.html");

        } else if (type == 9) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_8/index.html");

        } else if (type == 10) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_9/index.html");

        } else if (type == 11) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_10/index.html");

        } else if (type == 12) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_11/index.html");
        } else if (type == 13) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_12/index.html");

        } else if (type == 14) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_13/index.html");

        } else if (type == 15) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_14/index.html");

        } else if (type == 16) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_15/index.html");

        } else if (type == 17) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_16/index.html");

        } else if (type == 18) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_17/index.html");

        } else if (type == 19) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_18/index.html");

        } else if (type == 20) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_19/index.html");

        } else if (type == 21) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_20/index.html");

        } else if (type == 22) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_21/index.html");

        } else if (type == 23) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_22/index.html");

        } else if (type == 24) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_23/index.html");

        } else if (type == 25) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_24/index.html");

        } else if (type == 26) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_25/index.html");

        } else if (type == 27) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_26/index.html");

        } else if (type == 28) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_27/index.html");

        } else if (type == 29) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_28/index.html");

        } else if (type == 30) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_29/index.html");

        } else if (type == 31) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_30/index.html");

        } else if (type == 32) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_31/index.html");

        } else if (type == 33) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_32/index.html");

        } else if (type == 34) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_33/index.html");

        } else if (type == 35) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_34/index.html");

        } else if (type == 36) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_35/index.html");

        } else if (type == 37) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_36/index.html");

        } else if (type == 38) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_37/index.html");

        } else if (type == 39) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_38/index.html");

        } else if (type == 40) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_39/index.html");

        } else if (type == 41) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_40/index.html");

        } else if (type == 42) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_41/index.html");

        } else if (type == 43) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_42/index.html");

        } else if (type == 44) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_43/index.html");

        } else if (type == 45) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_44/index.html");

        } else if (type == 46) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_45/index.html");

        } else if (type == 47) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_46/index.html");

        } else if (type == 48) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_47/index.html");

        } else if (type == 49) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_48/index.html");

        } else if (type == 50) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_49/index.html");

        } else if (type == 51) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_50/index.html");

        } else if (type == 52) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_51/index.html");

        } else if (type == 53) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_52/index.html");

        } else if (type == 54) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_53/index.html");

        } else if (type == 55) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_54/index.html");

        } else if (type == 56) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_55/index.html");

        } else if (type == 57) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_56/index.html");

        } else if (type == 58) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_57/index.html");

        } else if (type == 59) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_58/index.html");

        } else if (type == 60) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_59/index.html");

        } else if (type == 61) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_60/index.html");

        } else if (type == 62) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_61/index.html");

        } else if (type == 63) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_62/index.html");

        } else if (type == 64) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_63/index.html");

        } else if (type == 65) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_64/index.html");

        } else if (type == 66) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_65/index.html");

        } else if (type == 67) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_66/index.html");

        } else if (type == 68) {
            webView.loadUrl("file:///android_asset/kifayatul_mustazid_glava_67/index.html");

        }
        return view;
    }


}