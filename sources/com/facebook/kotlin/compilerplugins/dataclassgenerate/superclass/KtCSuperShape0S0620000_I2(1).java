package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.MHA;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;

public class KtCSuperShape0S0620000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public boolean A07;
    public final int A08 = 0;

    public KtCSuperShape0S0620000_I2(MHA mha, Integer num, Object obj) {
        C04220Ms.A0B(obj, 1);
        this.A03 = obj;
        this.A00 = mha;
        this.A01 = null;
        this.A07 = false;
        this.A06 = false;
        this.A05 = num;
        this.A02 = null;
        this.A04 = null;
    }

    public final void A00(View view, boolean z) {
        Number number = (Number) this.A04;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (number != null) {
            float floatValue = number.floatValue();
            if (z) {
                floatValue = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            view.setTranslationX(floatValue);
        }
        Number number2 = (Number) this.A05;
        if (number2 != null) {
            float floatValue2 = number2.floatValue();
            if (!z) {
                f = floatValue2;
            }
            view.setTranslationY(f);
        }
        Number number3 = (Number) this.A02;
        float f2 = 1.0f;
        if (number3 != null) {
            float floatValue3 = number3.floatValue();
            if (z) {
                floatValue3 = 1.0f;
            }
            view.setScaleX(floatValue3);
        }
        Number number4 = (Number) this.A03;
        if (number4 != null) {
            float floatValue4 = number4.floatValue();
            if (z) {
                floatValue4 = 1.0f;
            }
            view.setScaleY(floatValue4);
        }
        Number number5 = (Number) this.A00;
        if (number5 != null) {
            float floatValue5 = number5.floatValue();
            if (!z) {
                f2 = floatValue5;
            }
            view.setAlpha(f2);
        }
    }

    public final boolean equals(Object obj) {
        if (this.A08 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S0620000_I2)) {
                return false;
            }
            KtCSuperShape0S0620000_I2 ktCSuperShape0S0620000_I2 = (KtCSuperShape0S0620000_I2) obj;
            if (ktCSuperShape0S0620000_I2.A08 != 1 || !C04220Ms.A0I(this.A04, ktCSuperShape0S0620000_I2.A04) || !C04220Ms.A0I(this.A05, ktCSuperShape0S0620000_I2.A05) || !C04220Ms.A0I(this.A02, ktCSuperShape0S0620000_I2.A02) || !C04220Ms.A0I(this.A03, ktCSuperShape0S0620000_I2.A03) || !C04220Ms.A0I(this.A00, ktCSuperShape0S0620000_I2.A00) || !C04220Ms.A0I(this.A01, ktCSuperShape0S0620000_I2.A01) || this.A07 != ktCSuperShape0S0620000_I2.A07 || this.A06 != ktCSuperShape0S0620000_I2.A06) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S0620000_I2)) {
                return false;
            }
            KtCSuperShape0S0620000_I2 ktCSuperShape0S0620000_I22 = (KtCSuperShape0S0620000_I2) obj;
            if (ktCSuperShape0S0620000_I22.A08 != 0 || !C04220Ms.A0I(this.A03, ktCSuperShape0S0620000_I22.A03) || !C04220Ms.A0I(this.A00, ktCSuperShape0S0620000_I22.A00) || !C04220Ms.A0I(this.A01, ktCSuperShape0S0620000_I22.A01) || this.A07 != ktCSuperShape0S0620000_I22.A07 || this.A06 != ktCSuperShape0S0620000_I22.A06 || !C04220Ms.A0I(this.A05, ktCSuperShape0S0620000_I22.A05) || !C04220Ms.A0I(this.A02, ktCSuperShape0S0620000_I22.A02) || !C04220Ms.A0I(this.A04, ktCSuperShape0S0620000_I22.A04)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int A072;
        if (this.A08 != 0) {
            int A032 = ((((((((((AnonymousClass0wJ.A03(this.A04) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A01)) * 31;
            boolean z = this.A07;
            A072 = 1;
            if (z) {
                z = true;
            }
            i = (A032 + (z ? 1 : 0)) * 31;
            if (!this.A06) {
                A072 = 0;
            }
        } else {
            int A042 = (((C18210wN.A04(this.A03) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31;
            boolean z2 = this.A07;
            int i2 = 1;
            if (z2) {
                z2 = true;
            }
            int i3 = (A042 + (z2 ? 1 : 0)) * 31;
            if (!this.A06) {
                i2 = 0;
            }
            int A033 = (((i3 + i2) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31;
            Object[] objArr = (Object[]) this.A02;
            if (objArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(objArr);
            }
            i = (A033 + hashCode) * 31;
            A072 = C18200wM.A07(this.A04);
        }
        return i + A072;
    }

    public final String toString() {
        if (1 - this.A08 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("GridItemAnimation(translationX=");
        A0s.append(this.A04);
        A0s.append(", translationY=");
        A0s.append(this.A05);
        A0s.append(", scaleX=");
        A0s.append(this.A02);
        A0s.append(", scaleY=");
        A0s.append(this.A03);
        A0s.append(", alpha=");
        A0s.append(this.A00);
        A0s.append(", option=");
        A0s.append(this.A01);
        A0s.append(", existsBefore=");
        A0s.append(this.A07);
        A0s.append(", existsAfter=");
        A0s.append(this.A06);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S0620000_I2(KtCSuperShape0S0100100_I2 ktCSuperShape0S0100100_I2, Float f, Float f2, Float f3, Float f4, Float f5, int i, boolean z, boolean z2) {
        f = (i & 1) != 0 ? null : f;
        f2 = (i & 2) != 0 ? null : f2;
        f3 = (i & 4) != 0 ? null : f3;
        f4 = (i & 8) != 0 ? null : f4;
        f5 = (i & 16) != 0 ? null : f5;
        ktCSuperShape0S0100100_I2 = (i & 32) != 0 ? null : ktCSuperShape0S0100100_I2;
        this.A08 = 1;
        this.A04 = f;
        this.A05 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A00 = f5;
        this.A01 = ktCSuperShape0S0100100_I2;
        this.A07 = z;
        this.A06 = z2;
    }
}
