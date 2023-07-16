package X;

import com.fbpay.logging.LoggingContext;
import java.util.Set;

/* renamed from: X.78P  reason: invalid class name */
public final class AnonymousClass78P {
    public C111186mv A00;
    public C111186mv A01;
    public C111186mv A02;
    public AnonymousClass588 A03;
    public AnonymousClass587 A04;
    public AnonymousClass58K A05;
    public LoggingContext A06;
    public AnonymousClass7Kx A07;
    public Set A08;
    public final C880756q A09 = C880756q.A01();
    public final C880756q A0A;
    public final C143158gC A0B;
    public final C143158gC A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (X.AnonymousClass7Kx.A0P(r11.A07) == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass78P r11, boolean r12) {
        /*
            if (r12 != 0) goto L_0x000b
            X.7Kx r0 = r11.A07
            boolean r1 = X.AnonymousClass7Kx.A0P(r0)
            r0 = 0
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.6mv r3 = r11.A01
            if (r0 == 0) goto L_0x00a6
            if (r3 == 0) goto L_0x00a6
            X.7ke r5 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r8 = r11.A06
            r2 = 0
            if (r8 != 0) goto L_0x001f
            X.C86124wJ.A19()
            throw r2
        L_0x001f:
            X.6B5 r6 = X.AnonymousClass6B5.UPDATE_CHECKOUT
            X.58K r0 = r11.A05
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "promoCodeViewModel"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x002b:
            java.util.List r1 = r0.A08()
            X.588 r0 = r11.A03
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "incentiveViewModel"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x0039:
            java.util.List r0 = r0.A05()
            java.util.List r9 = X.AnonymousClass00J.A0V(r0, r1)
            java.lang.String r0 = r3.A09
            if (r0 == 0) goto L_0x0053
            java.lang.Long r7 = X.AnonymousClass4n2.A02(r0)
        L_0x0049:
            X.587 r0 = r11.A04
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "otcViewModel"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x0053:
            r7 = r2
            goto L_0x0049
        L_0x0055:
            X.7DP r1 = r0.A03()
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r3.A01
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x00a7
            java.lang.Long r0 = X.AnonymousClass4n2.A02(r0)
        L_0x0065:
            java.lang.String r4 = r3.A04
            java.util.LinkedHashMap r10 = X.C18220wO.A0y()
            X.AnonymousClass7Kr.A0B(r1, r10)
            if (r0 == 0) goto L_0x007d
            long r0 = r0.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "shipping_address_id"
            r10.put(r0, r1)
        L_0x007d:
            if (r4 == 0) goto L_0x0084
            java.lang.String r0 = "SHIPPING_OPTION_ID"
            r10.put(r0, r4)
        L_0x0084:
            X.09x r1 = X.C128957ke.A00(r5, r6)
            java.lang.String r0 = "client_submit_ecpeventhandling_init"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 397(0x18d, float:5.56E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r5 = 5
            kotlin.jvm.internal.KtLambdaShape4S0500000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape4S0500000_I2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.C128957ke.A04(r0, r8, r4)
            X.56q r0 = r11.A09
            X.AnonymousClass7Kx.A0I(r0, r3)
            r11.A00 = r3
            r11.A01 = r2
        L_0x00a6:
            return
        L_0x00a7:
            r0 = r2
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78P.A00(X.78P, boolean):void");
    }

    public final void A01(M5J m5j) {
        C143158gC r1 = this.A0C;
        if (r1 != null) {
            this.A09.A0K(m5j, r1);
        }
    }

    public AnonymousClass78P() {
        C880756q A012 = C880756q.A01();
        AnonymousClass7Kx.A0J(A012, (Object) null);
        this.A0A = A012;
        this.A07 = AnonymousClass7Kx.A09((Object) null);
        this.A0B = C86114wI.A0Q(this, 58);
        this.A0C = C86114wI.A0Q(this, 57);
    }
}
