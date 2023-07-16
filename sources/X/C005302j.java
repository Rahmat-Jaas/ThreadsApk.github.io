package X;

import android.os.Build;
import android.view.View;
import androidx.core.view.IDxVPropertyShape9S0000000_I2;

/* renamed from: X.02j  reason: invalid class name and case insensitive filesystem */
public abstract class C005302j {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Class A03;

    public final Object A02(View view) {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT >= this.A00) {
            switch (((IDxVPropertyShape9S0000000_I2) this).A00) {
                case 0:
                    isScreenReaderFocusable = view.isScreenReaderFocusable();
                    break;
                case 1:
                    return view.getAccessibilityPaneTitle();
                case 2:
                    return C006402v.A00(view);
                default:
                    isScreenReaderFocusable = view.isAccessibilityHeading();
                    break;
            }
            return Boolean.valueOf(isScreenReaderFocusable);
        }
        Object tag = view.getTag(this.A02);
        if (!this.A03.isInstance(tag)) {
            return null;
        }
        return tag;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r0 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r1.booleanValue() == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.view.View r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            int r0 = r3.A00
            if (r1 < r0) goto L_0x0018
            r0 = r3
            androidx.core.view.IDxVPropertyShape9S0000000_I2 r0 = (androidx.core.view.IDxVPropertyShape9S0000000_I2) r0
            int r0 = r0.A00
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0065;
                case 2: goto L_0x006b;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            r4.setAccessibilityHeading(r0)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r2 = r3.A02(r4)
            r0 = r3
            androidx.core.view.IDxVPropertyShape9S0000000_I2 r0 = (androidx.core.view.IDxVPropertyShape9S0000000_I2) r0
            int r0 = r0.A00
            switch(r0) {
                case 1: goto L_0x0040;
                case 2: goto L_0x0040;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r1 = r5
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r2 == 0) goto L_0x0032
            boolean r0 = r2.booleanValue()
            r2 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r1 == 0) goto L_0x003c
            boolean r1 = r1.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r2 != r0) goto L_0x004d
            return
        L_0x0040:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0017
        L_0x004d:
            X.C006702y.A08(r4)
            int r0 = r3.A02
            r4.setTag(r0, r5)
            int r0 = r3.A01
            X.C006702y.A09(r4, r0)
            return
        L_0x005b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            r4.setScreenReaderFocusable(r0)
            return
        L_0x0065:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setAccessibilityPaneTitle(r5)
            return
        L_0x006b:
            X.C006402v.A01(r4, (java.lang.CharSequence) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005302j.A03(android.view.View, java.lang.Object):void");
    }

    public C005302j(Class cls, int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = cls;
        this.A01 = i2;
        this.A00 = i3;
    }
}
