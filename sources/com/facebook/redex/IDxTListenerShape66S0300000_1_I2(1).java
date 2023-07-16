package com.facebook.redex;

import X.AnonymousClass20y;
import X.AnonymousClass3EX;
import X.C09860go;
import X.C23071bs;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.instagram.bugreporter.BugReportSevereSwitchView;
import com.instagram.service.session.UserSession;

public class IDxTListenerShape66S0300000_1_I2 implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxTListenerShape66S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A03 != 0) {
            C09860go.A0I((View) this.A01);
            EditText editText = (EditText) this.A00;
            Editable text = editText.getText();
            if ((text != null && text.length() != 0) || ((C23071bs) this.A02).A0A.getValue() != AnonymousClass20y.Social) {
                return false;
            }
            editText.setText(2131825850);
            editText.setSelection(editText.getText().length());
            return false;
        }
        ((BugReportSevereSwitchView) this.A02).A01((AnonymousClass3EX) this.A00, (UserSession) this.A01, false);
        return true;
    }
}
