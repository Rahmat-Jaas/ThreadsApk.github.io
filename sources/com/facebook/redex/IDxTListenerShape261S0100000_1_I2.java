package com.facebook.redex;

import X.C23261cr;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.barcelona.R;

public class IDxTListenerShape261S0100000_1_I2 implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public IDxTListenerShape261S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A01 == 0) {
            ((C23261cr) this.A00).A02.getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        } else if (view.getId() != R.id.additional_details_edittext) {
            return false;
        } else {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) != 2) {
                return false;
            }
            view.getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
    }
}
