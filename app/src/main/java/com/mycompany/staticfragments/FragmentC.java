package com.mycompany.staticfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by usuario on 16/11/17.
 */

public class FragmentC extends Fragment {

    WebView wbvAbout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, container, false);
        if(view != null) {
            wbvAbout = (WebView)view.findViewById(R.id.wbvAbout);
            wbvAbout.loadData(getResources().getString(R.string.about), "text/html", "utf-8");
        }
        return view;
    }
}
