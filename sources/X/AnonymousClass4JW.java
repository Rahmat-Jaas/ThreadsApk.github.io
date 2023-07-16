package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.4JW  reason: invalid class name */
public final class AnonymousClass4JW implements C83734rt {
    public boolean A00;
    public final C11630kW A01;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ed, code lost:
        if (r0 != false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0104, code lost:
        if (r9 != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
        r13.A00.setVisibility(8);
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AAl(X.C84844tx r15, X.C28291u0 r16, X.C202513v r17) {
        /*
            r14 = this;
            r10 = r16
            X.1tt r6 = r10.A08
            X.1tw r1 = r6.A09
            r3 = 8
            r4 = 0
            r13 = r17
            android.widget.TextView r0 = r13.A07
            X.C18210wN.A11(r0, r1)
            X.1tu r1 = r6.A03
            android.widget.TextView r0 = r13.A05
            X.C18210wN.A11(r0, r1)
            X.35l r0 = r6.A08
            if (r0 == 0) goto L_0x0128
            java.lang.String r2 = r0.A00
        L_0x001d:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            android.widget.TextView r0 = r13.A06
            if (r1 != 0) goto L_0x0123
            r0.setText(r2)
            r0.setVisibility(r4)
        L_0x002b:
            android.view.View r0 = r13.itemView
            r0.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r13.A08
            android.content.Context r0 = r2.getContext()
            boolean r0 = X.C34822La.A00(r0)
            r12 = r14
            if (r0 == 0) goto L_0x011a
            X.3TA r0 = r6.A06
            if (r0 == 0) goto L_0x011a
        L_0x0041:
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
            X.0kW r0 = r14.A01
            r2.setUrl(r1, r0)
            r2.setVisibility(r4)
        L_0x004b:
            X.3CQ r2 = r6.A00
            r1 = 1
            android.widget.ImageView r0 = r13.A04
            r11 = r15
            if (r2 == 0) goto L_0x0113
            r0.setVisibility(r4)
            r9 = 15
            com.facebook.redex.IDxCListenerShape15S0400000_1_I2 r8 = new com.facebook.redex.IDxCListenerShape15S0400000_1_I2
            r8.<init>(r9, r10, r11, r12, r13)
            r0.setOnClickListener(r8)
        L_0x0060:
            X.3CQ r2 = r6.A01
            if (r2 == 0) goto L_0x0110
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 == r0) goto L_0x0110
            X.1tw r0 = r2.A00
            java.lang.String r5 = r0.A00
        L_0x006e:
            X.3CQ r2 = r6.A02
            if (r2 == 0) goto L_0x010d
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 == r0) goto L_0x010d
            X.1tw r0 = r2.A00
            java.lang.String r6 = r0.A00
        L_0x007c:
            boolean r9 = X.C18210wN.A1U(r5)
            boolean r0 = X.C18210wN.A1U(r6)
            if (r9 == 0) goto L_0x00ed
            if (r0 != 0) goto L_0x00a7
            X.24c r0 = X.C310724c.ONE_BUTTON_PRIMARY_CONDENSED
            X.C202513v.A00(r0, r13)
        L_0x008d:
            android.widget.TextView r0 = r13.A00
            r0.setVisibility(r4)
            android.widget.TextView r0 = r13.A00
            r0.setText(r5)
            android.widget.TextView r2 = r13.A00
            r1 = 53
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((X.C84844tx) r15, (X.C28291u0) r10, (X.AnonymousClass4JW) r14, (int) r1)
            r2.setOnClickListener(r0)
        L_0x00a3:
            r15.CEB(r10)
            return
        L_0x00a7:
            android.widget.TextView r0 = r13.A00
            android.text.TextPaint r0 = r0.getPaint()
            r5.getClass()
            float r8 = r0.measureText(r5)
            android.widget.TextView r0 = r13.A01
            r0.getClass()
            android.text.TextPaint r0 = r0.getPaint()
            r6.getClass()
            float r7 = r0.measureText(r6)
            android.widget.TextView r0 = r13.A00
            android.content.res.Resources r2 = r0.getResources()
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            int r1 = r0.widthPixels
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r1 = r1 - r0
            float r0 = (float) r1
            float r1 = java.lang.Math.max(r8, r7)
            float r1 = r1 / r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ea
            X.24c r0 = X.C310724c.TWO_BUTTON_VERTICAL_WITH_SECONDARY
        L_0x00e6:
            X.C202513v.A00(r0, r13)
            goto L_0x00ef
        L_0x00ea:
            X.24c r0 = X.C310724c.TWO_BUTTON_HORIZONTAL
            goto L_0x00e6
        L_0x00ed:
            if (r0 == 0) goto L_0x0107
        L_0x00ef:
            android.widget.TextView r2 = r13.A01
            r2.getClass()
            r2.setText(r6)
            r2.setVisibility(r4)
            r1 = 52
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((X.C84844tx) r15, (X.C28291u0) r10, (X.AnonymousClass4JW) r14, (int) r1)
            r2.setOnClickListener(r0)
            if (r9 == 0) goto L_0x0107
            goto L_0x008d
        L_0x0107:
            android.widget.TextView r0 = r13.A00
            r0.setVisibility(r3)
            goto L_0x00a3
        L_0x010d:
            r6 = 0
            goto L_0x007c
        L_0x0110:
            r5 = 0
            goto L_0x006e
        L_0x0113:
            r0.setVisibility(r3)
            r14.A00 = r1
            goto L_0x0060
        L_0x011a:
            X.3TA r0 = r6.A07
            if (r0 != 0) goto L_0x0041
            r2.setVisibility(r3)
            goto L_0x004b
        L_0x0123:
            r0.setVisibility(r3)
            goto L_0x002b
        L_0x0128:
            r2 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4JW.AAl(X.4tx, X.1u0, X.13v):void");
    }

    public AnonymousClass4JW(C11630kW r1) {
        this.A01 = r1;
    }

    public final View Bhn(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.condensed_generic_v3_megaphone);
        A0H.setTag(new C202513v(A0H));
        return A0H;
    }
}
