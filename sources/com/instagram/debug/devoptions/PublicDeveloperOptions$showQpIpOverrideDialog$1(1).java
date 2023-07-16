package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C18180wK;
import X.C18240wQ;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.TextView;
import com.instagram.barcelona.R;

public final class PublicDeveloperOptions$showQpIpOverrideDialog$1 implements TextWatcher {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ TextView $validation;

    public void afterTextChanged(Editable editable) {
        TextView textView;
        Context context;
        int i;
        C04220Ms.A0B(editable, 0);
        if (TextUtils.isEmpty(editable)) {
            this.$validation.setText(2131825385);
            textView = this.$validation;
            context = this.$context;
            i = R.color.igds_primary_text;
        } else {
            boolean A1V = C18240wQ.A1V(editable, Patterns.IP_ADDRESS);
            TextView textView2 = this.$validation;
            if (A1V) {
                textView2.setText(2131825392);
                textView = this.$validation;
                context = this.$context;
                i = R.color.igds_success;
            } else {
                textView2.setText(2131825387);
                textView = this.$validation;
                context = this.$context;
                i = R.color.igds_error_or_destructive;
            }
        }
        C18180wK.A0s(context, textView, i);
        this.$validation.setVisibility(0);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public PublicDeveloperOptions$showQpIpOverrideDialog$1(TextView textView, Context context) {
        this.$validation = textView;
        this.$context = context;
    }
}
