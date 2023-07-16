package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import java.util.List;

/* renamed from: X.57w  reason: invalid class name and case insensitive filesystem */
public final class C883957w extends C62793ak {
    public AuthScreenStyle A00;
    public C114746tp A01;
    public final M5J A02;
    public final C880756q A03;
    public final C880756q A04;
    public final C880756q A05 = C880756q.A01();
    public final C880856r A06 = C880856r.A03();
    public final C143158gC A07;
    public final C143158gC A08;
    public final C143158gC A09;
    public final AnonymousClass588 A0A;
    public final AnonymousClass587 A0B;
    public final AnonymousClass58K A0C;
    public final List A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r2 == null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C883957w r6) {
        /*
            java.util.List r0 = r6.A0D
            java.util.Iterator r2 = r0.iterator()
            r5 = 1
            r4 = 1
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r2.next()
            X.M5J r0 = (X.M5J) r0
            X.7Kx r1 = X.C86104wH.A0R(r0)
            if (r1 == 0) goto L_0x002a
            boolean r0 = X.AnonymousClass7Kx.A0P(r1)
            if (r0 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0008
        L_0x0022:
            boolean r0 = X.AnonymousClass7Kx.A0O(r1)
            if (r0 == 0) goto L_0x0008
            r4 = 0
            goto L_0x0008
        L_0x002a:
            java.lang.String r0 = "Empty components value found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0031:
            X.56r r0 = r6.A06
            java.lang.Object r0 = r0.A08()
            com.facebookpay.common.models.CurrencyAmount r0 = (com.facebookpay.common.models.CurrencyAmount) r0
            r3 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            X.75X r2 = new X.75X
            r2.<init>(r1, r0)
        L_0x0045:
            X.56q r1 = r6.A05
            if (r5 == 0) goto L_0x005a
            if (r2 == 0) goto L_0x005c
            if (r4 != 0) goto L_0x0055
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r2, r3)
        L_0x0051:
            r1.A0H(r0)
            return
        L_0x0055:
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r2)
            goto L_0x0051
        L_0x005a:
            if (r2 != 0) goto L_0x0063
        L_0x005c:
            java.lang.String r0 = ""
            X.75X r2 = new X.75X
            r2.<init>(r0, r0)
        L_0x0063:
            X.7Kx r0 = X.AnonymousClass7Kx.A09(r2)
            goto L_0x0051
        L_0x0068:
            r2 = r3
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C883957w.A00(X.57w):void");
    }

    public C883957w(AnonymousClass588 r3, AnonymousClass587 r4, AnonymousClass58K r5) {
        this.A0B = r4;
        this.A0C = r5;
        this.A0A = r3;
        C880756q A012 = C880756q.A01();
        A012.A0H(C18180wK.A0X());
        this.A04 = A012;
        C880756q A013 = C880756q.A01();
        this.A03 = A013;
        this.A02 = A013;
        this.A0D = AnonymousClass0wJ.A0v();
        this.A08 = C86114wI.A0Q(this, StringTreeSet.MAX_SYMBOL_COUNT);
        this.A07 = C86114wI.A0Q(this, 126);
        this.A09 = C86114wI.A0Q(this, 128);
    }
}
