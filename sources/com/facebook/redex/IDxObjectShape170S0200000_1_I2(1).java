package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass1YD;
import X.AnonymousClass3Ft;
import X.AnonymousClass4tS;
import X.AnonymousClass8bQ;
import X.C85924vz;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.view.View;
import com.instagram.business.ui.BusinessInfoSectionView;

public class IDxObjectShape170S0200000_1_I2 implements NoCopySpan, TextWatcher {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObjectShape170S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        r3 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r2 = (X.C19360zk) r4.A06.getValue();
        r0 = r2.A00;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r0 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r0.length() == 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r0 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r0.length() == 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r3.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        if (r1 == 0) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        r1.setEnabled(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0100, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
        X.C04220Ms.A0E("errorIcon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0107, code lost:
        X.C04220Ms.A0E("checkIcon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0049;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x00b1;
                case 6: goto L_0x0005;
                case 7: goto L_0x00cd;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            int r0 = r6.length()
            if (r0 != 0) goto L_0x002b
            r2 = 0
            java.lang.Object r1 = r5.A00
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r4 = r5.A01
            X.1cD r4 = (X.AnonymousClass1cD) r4
            android.graphics.drawable.Drawable r0 = r4.A01
            if (r0 == 0) goto L_0x0101
            r1.setImageDrawable(r0)
            X.0Oa r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            X.0zk r0 = (X.C19360zk) r0
            r0.A00 = r2
            goto L_0x006d
        L_0x002b:
            java.lang.Object r1 = r5.A00
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r4 = r5.A01
            X.1cD r4 = (X.AnonymousClass1cD) r4
            android.graphics.drawable.Drawable r0 = r4.A00
            if (r0 == 0) goto L_0x0107
            r1.setImageDrawable(r0)
            X.0Oa r0 = r4.A06
            java.lang.Object r1 = r0.getValue()
            X.0zk r1 = (X.C19360zk) r1
            java.lang.String r0 = r6.toString()
            r1.A00 = r0
            goto L_0x006d
        L_0x0049:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0093
            r2 = 0
            java.lang.Object r1 = r5.A00
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r4 = r5.A01
            X.1cD r4 = (X.AnonymousClass1cD) r4
            android.graphics.drawable.Drawable r0 = r4.A01
            if (r0 == 0) goto L_0x0101
            r1.setImageDrawable(r0)
            X.0Oa r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            X.0zk r0 = (X.C19360zk) r0
            r0.A01 = r2
        L_0x006d:
            X.3Id r3 = r4.A02
            if (r3 == 0) goto L_0x0005
            X.0Oa r0 = r4.A06
            java.lang.Object r2 = r0.getValue()
            X.0zk r2 = (X.C19360zk) r2
            java.lang.String r0 = r2.A00
            r1 = 0
            if (r0 == 0) goto L_0x008f
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x008f
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008f
            r1 = 1
        L_0x008f:
            r3.A03(r1)
            return
        L_0x0093:
            java.lang.Object r1 = r5.A00
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r4 = r5.A01
            X.1cD r4 = (X.AnonymousClass1cD) r4
            android.graphics.drawable.Drawable r0 = r4.A00
            if (r0 == 0) goto L_0x0107
            r1.setImageDrawable(r0)
            X.0Oa r0 = r4.A06
            java.lang.Object r1 = r0.getValue()
            X.0zk r1 = (X.C19360zk) r1
            java.lang.String r0 = r6.toString()
            r1.A01 = r0
            goto L_0x006d
        L_0x00b1:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18180wK.A11(r0)
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.CharSequence r0 = X.AnonymousClass8bP.A0L(r6)
            int r0 = r0.length()
            boolean r0 = X.C18180wK.A1X(r0)
            goto L_0x00fd
        L_0x00cd:
            java.lang.Object r3 = r5.A01
            android.view.View r3 = (android.view.View) r3
            r0 = 0
            if (r6 == 0) goto L_0x00d8
            java.lang.CharSequence r0 = X.AnonymousClass8bP.A0L(r6)
        L_0x00d8:
            r2 = 0
            if (r0 == 0) goto L_0x00e2
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x00e3
        L_0x00e2:
            r0 = 1
        L_0x00e3:
            r0 = r0 ^ 1
            r3.setEnabled(r0)
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            if (r6 == 0) goto L_0x00fa
            java.lang.CharSequence r0 = X.AnonymousClass8bP.A0L(r6)
            if (r0 == 0) goto L_0x00fa
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00fb
        L_0x00fa:
            r2 = 1
        L_0x00fb:
            r0 = r2 ^ 1
        L_0x00fd:
            r1.setEnabled(r0)
            return
        L_0x0101:
            java.lang.String r0 = "errorIcon"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x0107:
            java.lang.String r0 = "checkIcon"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObjectShape170S0200000_1_I2.afterTextChanged(android.text.Editable):void");
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.A02) {
            case 2:
                BusinessInfoSectionView businessInfoSectionView = (BusinessInfoSectionView) this.A00;
                businessInfoSectionView.A05.setVisibility(8);
                businessInfoSectionView.A02.setVisibility(8);
                ((C85924vz) this.A01).Bvz(businessInfoSectionView.A00.hasFocus());
                return;
            case 3:
                BusinessInfoSectionView businessInfoSectionView2 = (BusinessInfoSectionView) this.A00;
                businessInfoSectionView2.A06.setVisibility(8);
                businessInfoSectionView2.A02.setVisibility(8);
                ((C85924vz) this.A01).CAm();
                return;
            case 4:
                View view = (View) this.A00;
                boolean z = true;
                if (!((AnonymousClass1YD) this.A01).A02 || charSequence == null || AnonymousClass8bQ.A0n(charSequence)) {
                    z = false;
                }
                view.setEnabled(z);
                return;
            case 6:
                ((AnonymousClass3Ft) this.A00).A00((AnonymousClass4tS) this.A01, AnonymousClass006.A00);
                return;
            default:
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
