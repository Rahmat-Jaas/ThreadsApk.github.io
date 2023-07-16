package com.facebook.redex;

import X.AnonymousClass0MJ;
import X.AnonymousClass55x;
import X.AnonymousClass7Rj;
import X.C04220Ms;
import X.C89085Bv;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;

public class IDxTListenerShape262S0100000_2_I2 implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public IDxTListenerShape262S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.A01) {
            case 4:
                return true;
            case 5:
            case 6:
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                ((AnonymousClass0MJ) this.A00).A00 = new float[]{motionEvent.getX(), motionEvent.getY()};
                return false;
            case 7:
                C89085Bv r1 = (C89085Bv) this.A00;
                ClickableTextContainer clickableTextContainer = r1.A09;
                C04220Ms.A07(motionEvent);
                clickableTextContainer.A01.A01(motionEvent);
                r1.A06.A00(motionEvent);
                return false;
            default:
                AnonymousClass55x r3 = (AnonymousClass55x) this.A00;
                AnonymousClass7Rj r2 = r3.A01;
                if (r2 == null) {
                    r2 = new AnonymousClass7Rj(r3.getActivity(), r3.A02.getWindow().getDecorView(), r3);
                    r3.A01 = r2;
                }
                return r2.onTouch(view, motionEvent);
        }
    }
}
