package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.1fP  reason: invalid class name */
public final class AnonymousClass1fP extends I4A implements C21222Bqq {
    public AnonymousClass38J A00;
    public AnonymousClass34S A01;
    public String A02;
    public final Context A03;
    public final C24161gz A04;
    public final AnonymousClass1U8 A05;
    public final C558934z A06;
    public final UserSession A07;
    public final AnonymousClass5yV A08;
    public final KNQ A09 = new KNQ();
    public final AnonymousClass1gE A0A;
    public final AnonymousClass1h0 A0B;
    public final C23981gh A0C;
    public final AnonymousClass1fy A0D;
    public final boolean A0E;

    public static void A00(AnonymousClass1fP r2, CharSequence charSequence, Integer num, String str, boolean z) {
        r2.A05(r2.A04, new AnonymousClass3BV(charSequence, num, str, z));
    }

    public final void Clo(int i) {
        this.A08.A03 = i;
        A09();
    }

    public AnonymousClass1fP(Context context, C11630kW r17, AnonymousClass1U8 r18, C558934z r19, AnonymousClass350 r20, UserSession userSession, String str, boolean z) {
        C37170Jlr jlr;
        Context context2 = context;
        this.A03 = context2;
        UserSession userSession2 = userSession;
        this.A07 = userSession2;
        AnonymousClass1U8 r2 = r18;
        this.A05 = r2;
        this.A00 = new AnonymousClass38J(r2.A01);
        this.A06 = r19;
        AnonymousClass5yV r9 = new AnonymousClass5yV();
        this.A08 = r9;
        C24161gz r10 = new C24161gz(context2, new C558834y(this));
        this.A04 = r10;
        AnonymousClass1gE r11 = new AnonymousClass1gE(context2, C18190wL.A0H(this, 488));
        this.A0A = r11;
        C23981gh r12 = new C23981gh(context2);
        this.A0C = r12;
        this.A0E = z;
        this.A02 = str;
        AnonymousClass38H r0 = r2.A00;
        if (!(r0 == null || (jlr = r0.A00) == null)) {
            this.A01 = C35552Nw.A00(jlr);
        }
        AnonymousClass1h0 r22 = new AnonymousClass1h0(context2, r17, new AnonymousClass34Q(), new C558734x(this), r20, userSession2);
        this.A0B = r22;
        AnonymousClass1fy r14 = new AnonymousClass1fy(context2);
        this.A0D = r14;
        A08(r9, r10, r11, r12, r22, r14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r6.A01 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r8 = this;
            r8.A03()
            X.5yV r1 = r8.A08
            r0 = 0
            r8.A05(r1, r0)
            X.1U8 r3 = r8.A05
            X.38H r6 = r3.A00
            if (r6 == 0) goto L_0x0014
            com.instagram.user.model.User r1 = r6.A01
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004f
            X.34S r2 = r8.A01
            com.instagram.user.model.User r0 = r6.A01
            X.38I r6 = new X.38I
            r6.<init>(r2, r0)
            X.Dd5 r1 = new X.Dd5
            r1.<init>()
            if (r2 == 0) goto L_0x004a
            X.KNQ r1 = r8.A09
            X.4O4 r0 = r2.A00
            int r0 = r0.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.util.Map r0 = r1.A00
            java.lang.Object r1 = r0.get(r2)
            X.Dd5 r1 = (X.C24970Dd5) r1
            if (r1 != 0) goto L_0x0047
            X.Dd5 r1 = new X.Dd5
            r1.<init>()
            r0.put(r2, r1)
        L_0x0047:
            r1.A00(r4, r5)
        L_0x004a:
            X.1h0 r0 = r8.A0B
            r8.A06(r0, r6, r1)
        L_0x004f:
            java.lang.String r0 = r3.A05
            boolean r0 = X.C18210wN.A1U(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r3.A05
            java.lang.String r7 = r0.trim()
            java.lang.String r6 = "\n"
            java.lang.String r2 = r3.A07
            java.lang.String r1 = " "
            java.lang.String r0 = r3.A0B
            java.lang.String r6 = X.AnonymousClass00U.A0h(r7, r6, r2, r1, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A00
            android.content.Context r1 = r8.A03
            r0 = 2131821190(0x7f110286, float:1.9275116E38)
            java.lang.String r0 = r1.getString(r0)
            A00(r8, r6, r2, r0, r5)
        L_0x0077:
            java.lang.String r0 = r3.A06
            boolean r0 = X.C18210wN.A1U(r0)
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x009f
            X.22V r1 = X.AnonymousClass22V.WITH_LEFT_RIGHT_PADDING
            X.1gh r0 = r8.A0C
            r8.A05(r0, r1)
            java.lang.Integer r2 = X.AnonymousClass006.A01
            android.content.Context r0 = r8.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131823127(0x7f110a17, float:1.9279045E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = r3.A06
            if (r0 != 0) goto L_0x009c
            r0 = r7
        L_0x009c:
            A00(r8, r0, r2, r1, r4)
        L_0x009f:
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r0 = r3.A01
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b9
            X.22V r1 = X.AnonymousClass22V.WITH_LEFT_RIGHT_PADDING
            X.1gh r0 = r8.A0C
            r8.A05(r0, r1)
            X.38J r1 = r8.A00
            X.1gE r0 = r8.A0A
            r8.A05(r0, r1)
        L_0x00b9:
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x00e9
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x00e9
            X.22V r1 = X.AnonymousClass22V.WITH_LEFT_RIGHT_PADDING
            X.1gh r0 = r8.A0C
            r8.A05(r0, r1)
            java.lang.Integer r6 = X.AnonymousClass006.A0N
            android.content.Context r2 = r8.A03
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131832763(0x7f112fbb, float:1.929859E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.Integer r0 = r3.A03
            r0.getClass()
            int r0 = r0.intValue()
            android.text.SpannableString r0 = X.C37096JkW.A00(r2, r0)
            A00(r8, r0, r6, r1, r4)
        L_0x00e9:
            java.lang.String r0 = r3.A0A
            boolean r0 = X.C18210wN.A1U(r0)
            if (r0 == 0) goto L_0x0113
            X.22V r1 = X.AnonymousClass22V.WITH_LEFT_RIGHT_PADDING
            X.1gh r0 = r8.A0C
            r8.A05(r0, r1)
            java.lang.Integer r2 = X.AnonymousClass006.A0Y
            android.content.Context r0 = r8.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131838046(0x7f11445e, float:1.9309304E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = r3.A0A
            r0.getClass()
            java.lang.String r0 = r0.trim()
            A00(r8, r0, r2, r1, r5)
        L_0x0113:
            java.lang.String r0 = r3.A09
            boolean r0 = X.C18210wN.A1U(r0)
            if (r0 == 0) goto L_0x013d
            X.22V r1 = X.AnonymousClass22V.WITH_LEFT_RIGHT_PADDING
            X.1gh r0 = r8.A0C
            r8.A05(r0, r1)
            java.lang.Integer r2 = X.AnonymousClass006.A0j
            android.content.Context r0 = r8.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131822819(0x7f1108e3, float:1.927842E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = r3.A09
            r0.getClass()
            java.lang.String r0 = r0.trim()
            A00(r8, r0, r2, r1, r5)
        L_0x013d:
            com.instagram.service.session.UserSession r3 = r8.A07
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320425298368482(0x81093c000017e2, double:3.032521437077458E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0189
            X.22V r1 = X.AnonymousClass22V.WITH_LEFT_RIGHT_PADDING
            X.1gh r0 = r8.A0C
            r8.A05(r0, r1)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            android.content.Context r2 = r8.A03
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131832109(0x7f112d2d, float:1.9297263E38)
            java.lang.String r0 = r1.getString(r0)
            r3.append(r0)
            java.lang.String r0 = " • "
            r3.append(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131829148(0x7f11219c, float:1.9291257E38)
            java.lang.String r0 = r1.getString(r0)
            r3.append(r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0u
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = r8.A02
            if (r0 != 0) goto L_0x0186
            r0 = r7
        L_0x0186:
            A00(r8, r0, r2, r1, r5)
        L_0x0189:
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x01b7
            java.lang.String r2 = r8.A02
            if (r2 == 0) goto L_0x01b7
            X.22V r1 = X.AnonymousClass22V.WITH_LEFT_RIGHT_PADDING
            X.1gh r0 = r8.A0C
            r8.A05(r0, r1)
            android.content.Context r1 = r8.A03
            r0 = 2131836354(0x7f113dc2, float:1.9305872E38)
            java.lang.String r3 = r1.getString(r0)
            r1 = 10
            com.facebook.redex.IDxCListenerShape14S1100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape14S1100000_1_I2
            r0.<init>((java.lang.String) r2, (java.lang.Object) r8, (int) r1)
            X.3Xg r2 = new X.3Xg
            r2.<init>((java.lang.CharSequence) r3, (android.view.View.OnClickListener) r0)
            X.3Bq r1 = new X.3Bq
            r1.<init>(r4, r4, r4, r4)
            X.1fy r0 = r8.A0D
            r8.A06(r0, r2, r1)
        L_0x01b7:
            r8.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1fP.A09():void");
    }
}
