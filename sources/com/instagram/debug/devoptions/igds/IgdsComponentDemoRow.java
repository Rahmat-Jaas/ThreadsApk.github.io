package com.instagram.debug.devoptions.igds;

import X.C18180wK;
import X.C18250wR;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

public class IgdsComponentDemoRow extends LinearLayout {
    public static final int COMPONENT_VIEW_INDEX = 1;
    public View mComponentView;
    public LinearLayout mLinearLayout;
    public IgTextView mTextView;
    public String mTitleText;

    public IgdsComponentDemoRow(Context context) {
        this(context, (String) null, (View) null);
    }

    private void setupView() {
        String str = this.mTitleText;
        if (str != null) {
            this.mTextView.setText(str);
        }
        View view = this.mComponentView;
        if (view != null) {
            this.mLinearLayout.addView(view, 1);
        }
    }

    private void init() {
        LinearLayout linearLayout = (LinearLayout) C18180wK.A0C(this).inflate(R.layout.igds_component_demo_row, this).requireViewById(R.id.demo_container);
        this.mLinearLayout = linearLayout;
        this.mTextView = C18250wR.A0L(linearLayout, R.id.component_demo_title);
    }

    public IgdsComponentDemoRow(Context context, String str, View view) {
        super(context);
        this.mTitleText = str;
        this.mComponentView = view;
        init();
        setupView();
    }
}
