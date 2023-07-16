package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JX  reason: invalid class name */
public final class AnonymousClass4JX implements C83734rt {
    public boolean A00;
    public final C11630kW A01;
    public final UserSession A02;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0108  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AAl(X.C84844tx r12, X.C28291u0 r13, X.C202113o r14) {
        /*
            r11 = this;
            r7 = r13
            X.1tt r4 = r13.A08
            X.1tw r1 = r4.A09
            r3 = 0
            r2 = 8
            r10 = r14
            android.widget.TextView r0 = r14.A09
            X.C18210wN.A11(r0, r1)
            X.1tu r1 = r4.A03
            android.widget.TextView r0 = r14.A07
            X.C18210wN.A11(r0, r1)
            android.view.View r0 = r14.itemView
            r0.setVisibility(r3)
            X.35l r0 = r4.A08
            if (r0 == 0) goto L_0x0057
            java.lang.String r5 = r0.A00
        L_0x0020:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            android.widget.TextView r0 = r14.A08
            if (r1 != 0) goto L_0x0053
            r0.setText(r5)
            r0.setVisibility(r3)
        L_0x002e:
            java.util.List r0 = r4.A0C
            r9 = r11
            if (r0 == 0) goto L_0x0059
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x0059
            java.util.ArrayList r5 = X.C18200wM.A0t(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r1.next()
            X.3TA r0 = (X.AnonymousClass3TA) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            r5.add(r0)
            goto L_0x0041
        L_0x0053:
            r0.setVisibility(r2)
            goto L_0x002e
        L_0x0057:
            r5 = 0
            goto L_0x0020
        L_0x0059:
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r14.A0A
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.C34822La.A00(r0)
            if (r0 == 0) goto L_0x010f
            X.3TA r0 = r4.A06
            if (r0 == 0) goto L_0x010f
        L_0x0069:
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
            X.0kW r0 = r11.A01
            r5.setUrl(r1, r0)
            r5.setVisibility(r3)
        L_0x0073:
            com.instagram.igds.components.facepile.IgFacepile r0 = r14.A0B
            r0.setVisibility(r2)
            goto L_0x00a0
        L_0x0079:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0059
            java.lang.String r1 = r13.A0D
            java.lang.String r0 = r14.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0096
            r14.A03 = r1
            com.instagram.igds.components.facepile.IgFacepile r1 = r14.A0B
            X.0kW r0 = r11.A01
            java.lang.String r0 = r0.getModuleName()
            r1.setImageUris(r5, r0)
        L_0x0096:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r14.A0A
            r0.setVisibility(r2)
            com.instagram.igds.components.facepile.IgFacepile r0 = r14.A0B
            r0.setVisibility(r3)
        L_0x00a0:
            X.3CQ r1 = r4.A00
            android.widget.ImageView r0 = r14.A06
            r8 = r12
            if (r1 == 0) goto L_0x0108
            r0.setVisibility(r3)
            r6 = 18
            com.facebook.redex.IDxCListenerShape15S0400000_1_I2 r5 = new com.facebook.redex.IDxCListenerShape15S0400000_1_I2
            r5.<init>(r6, r7, r8, r9, r10)
            r0.setOnClickListener(r5)
        L_0x00b4:
            android.widget.TextView r6 = r14.A01
            if (r6 == 0) goto L_0x00d8
            X.3CQ r5 = r4.A01
            if (r5 == 0) goto L_0x0104
            java.lang.Integer r1 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 == r0) goto L_0x0104
            X.1tw r0 = r5.A00
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0104
            r6.setVisibility(r3)
            r6.setText(r0)
            r1 = 54
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((X.C84844tx) r12, (X.C28291u0) r13, (X.AnonymousClass4JX) r11, (int) r1)
            r6.setOnClickListener(r0)
        L_0x00d8:
            android.widget.TextView r5 = r14.A02
            if (r5 == 0) goto L_0x00fc
            X.3CQ r4 = r4.A02
            if (r4 == 0) goto L_0x0100
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 == r0) goto L_0x0100
            X.1tw r0 = r4.A00
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0100
            r5.setText(r0)
            r5.setVisibility(r3)
            r1 = 55
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((X.C84844tx) r12, (X.C28291u0) r13, (X.AnonymousClass4JX) r11, (int) r1)
            r5.setOnClickListener(r0)
        L_0x00fc:
            r12.CEB(r13)
            return
        L_0x0100:
            r5.setVisibility(r2)
            goto L_0x00fc
        L_0x0104:
            r6.setVisibility(r2)
            goto L_0x00d8
        L_0x0108:
            r0.setVisibility(r2)
            r0 = 1
            r11.A00 = r0
            goto L_0x00b4
        L_0x010f:
            X.3TA r0 = r4.A07
            if (r0 != 0) goto L_0x0069
            r5.setVisibility(r2)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4JX.AAl(X.4tx, X.1u0, X.13o):void");
    }

    public AnonymousClass4JX(C11630kW r1, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r1;
    }

    public final View Bhn(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.generic_v3_megaphone);
        A0H.setTag(new C202113o(A0H));
        return A0H;
    }
}
