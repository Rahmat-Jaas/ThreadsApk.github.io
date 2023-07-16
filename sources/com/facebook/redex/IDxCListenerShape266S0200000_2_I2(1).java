package com.facebook.redex;

import X.AnonymousClass3HX;
import X.AnonymousClass6ZB;
import X.AnonymousClass7Ja;
import X.C109326jp;
import X.C127397h3;
import X.C133957wm;
import X.C145998lS;
import X.C146958n9;
import X.C25237DiI;
import X.C27952Ew2;
import android.widget.SeekBar;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;

public class IDxCListenerShape266S0200000_2_I2 implements SeekBar.OnSeekBarChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape266S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = i;
        if (this.A02 != 0) {
            ((C145998lS) this.A00).CJ0((C133957wm) this.A01, i);
            return;
        }
        C127397h3 r4 = (C127397h3) this.A01;
        C109326jp A0L = r4.A0L(42);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape8S0301000_I2((AnonymousClass3HX) this.A00, r4, A0L, (C146958n9) null, i2), AnonymousClass7Ja.A03(AnonymousClass6ZB.A00), 3);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.A02 != 0) {
            ((C145998lS) this.A00).CIz((C133957wm) this.A01);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.A02 != 0) {
            ((C145998lS) this.A00).CIy((C133957wm) this.A01);
        }
    }
}
