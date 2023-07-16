package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18210wN;
import X.C86144wL;
import android.graphics.RectF;
import com.facebook.react.uimanager.BaseViewManager;

public class KtCSuperShape0S0100001_I2 extends AnonymousClass0Sf {
    public float A00;
    public Object A01;
    public final int A02;

    public KtCSuperShape0S0100001_I2(RectF rectF, float f) {
        this.A02 = 1;
        this.A01 = rectF;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A02 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KtCSuperShape0S0100001_I2)) {
            return false;
        }
        KtCSuperShape0S0100001_I2 ktCSuperShape0S0100001_I2 = (KtCSuperShape0S0100001_I2) obj;
        if (ktCSuperShape0S0100001_I2.A02 == 1 && C04220Ms.A0I(this.A01, ktCSuperShape0S0100001_I2.A01) && Float.compare(this.A00, ktCSuperShape0S0100001_I2.A00) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (1 - this.A02 != 0) {
            return super.hashCode();
        }
        return C86144wL.A03(C18210wN.A04(this.A01), this.A00);
    }

    public final String toString() {
        if (this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("DetailedTranscription(tokens=");
        A0s.append(this.A01);
        A0s.append(", confidence=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S0100001_I2() {
        this.A02 = 0;
        this.A02 = 0;
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        this.A02 = 0;
        this.A01 = r1;
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }
}
