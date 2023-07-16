package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1bD;
import X.C23251cq;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class IDxAListenerShape258S0200000_1_I2 implements TextView.OnEditorActionListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxAListenerShape258S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (this.A02 != 0) {
            AnonymousClass1bD r0 = (AnonymousClass1bD) this.A00;
            Bundle bundle = (Bundle) this.A01;
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    r0.A03.A01(bundle, AnonymousClass0wJ.A0n(r0.A00));
                    return true;
                case 7:
                    r0.A03.A00(bundle, AnonymousClass0wJ.A0n(r0.A00));
                    return true;
                default:
                    return false;
            }
        } else if (i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        } else {
            C23251cq.A00((EditText) this.A00, (C23251cq) this.A01);
            return false;
        }
    }
}
