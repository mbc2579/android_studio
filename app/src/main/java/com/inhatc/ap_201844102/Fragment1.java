package com.inhatc.ap_201844102;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    WebView web;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);
        web=(WebView)rootView.findViewById(R.id.web1);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        web.loadUrl("https://www.inhatc.ac.kr/sites/kr/index.do");

        Button btn0=(Button) rootView.findViewById(R.id.Button0);
        Button btn1=(Button) rootView.findViewById(R.id.Button1);
        Button btn2=(Button) rootView.findViewById(R.id.Button2);
        Button btn3=(Button) rootView.findViewById(R.id.Button3);
        Button btn4=(Button) rootView.findViewById(R.id.Button4);
        Button btn5=(Button) rootView.findViewById(R.id.Button5);
        Button btn6=(Button) rootView.findViewById(R.id.Button6);

        Button btn8=(Button) rootView.findViewById(R.id.Button8);
        Button btn9=(Button) rootView.findViewById(R.id.Button9);
        Button btn10=(Button) rootView.findViewById(R.id.Button10);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://www.inhatc.ac.kr/sites/kr/index.do");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://portal.inhatc.ac.kr/user/login.face");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://cyber.inhatc.ac.kr/");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://icims.inhatc.ac.kr/intra/login.jsp");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://attend.inhatc.ac.kr/");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://www.inhatc.ac.kr/kr/485/subview.do");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://www.inhatc.ac.kr/kr/103/subview.do");
            }
        });











        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.goBack();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.reload();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.goForward();
            }
        });







        return rootView;
    }
}
