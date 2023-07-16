package X;

import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;
import java.util.Map;

/* renamed from: X.587  reason: invalid class name */
public final class AnonymousClass587 extends C62793ak {
    public C880856r A00;
    public ECPPaymentRequest A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final M5J A05;
    public final M5J A06;
    public final C121177En A07;
    public final AnonymousClass0YY A08 = C86164wN.A0r(this, 35);

    public final AnonymousClass67P A01(AnonymousClass69P r3) {
        C04220Ms.A0B(r3, 0);
        OtcOptionState A042 = A04();
        if (A042 == null) {
            return AnonymousClass67P.NON_OTC;
        }
        AnonymousClass67P r0 = (AnonymousClass67P) A042.A03.get(r3);
        if (r0 == null) {
            return A042.A00;
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        if (r0.A00 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 != true) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass587 r9) {
        /*
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r9.A01
            r2 = 1
            if (r0 == 0) goto L_0x0014
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0014
            java.util.Set<X.68M> r1 = r0.A0B
            X.68M r0 = X.AnonymousClass68M.ONE_TIME_CHECKOUT_OPTION
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 == r2) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r9.A02 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r9.A01
            if (r0 == 0) goto L_0x002d
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x002d
            java.util.Set<X.66p> r1 = r0.A09
            if (r1 == 0) goto L_0x002d
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00d7
        L_0x002d:
            r2 = 0
        L_0x002e:
            r9.A04 = r2
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0036
            if (r2 == 0) goto L_0x00d1
        L_0x0036:
            X.7En r6 = r9.A07
            java.lang.String r5 = "OTC_SESSION_STATE_KEY"
            java.lang.Object r0 = r6.A00(r5)
            if (r0 != 0) goto L_0x0069
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = X.AnonymousClass7JJ.A02()
            X.M5J r0 = r0.A05
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.Object r4 = r0.A01
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0056
        L_0x0052:
            java.lang.String r4 = X.C18230wP.A0h()
        L_0x0056:
            X.C04220Ms.A09(r4)
            java.util.Map r3 = X.AnonymousClass4WJ.A0A()
            X.67P r2 = X.AnonymousClass67P.NON_OTC
            java.lang.String r1 = "CARD"
            com.facebookpay.otc.models.OtcOptionState r0 = new com.facebookpay.otc.models.OtcOptionState
            r0.<init>(r2, r4, r1, r3)
            r6.A02(r5, r0)
        L_0x0069:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r9.A01
            if (r3 == 0) goto L_0x00d1
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "CARD"
        L_0x0073:
            r6 = 0
            com.facebookpay.otc.models.OtcInput r4 = new com.facebookpay.otc.models.OtcInput
            r4.<init>(r6, r0)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r3.A05
            if (r0 == 0) goto L_0x00d2
            java.lang.String r5 = r0.A02
        L_0x007f:
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r2 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            X.69P r0 = X.AnonymousClass69P.CONTACT_INFORMATION
            boolean r0 = X.C122157Kv.A0R(r3, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "request_contact"
            r2.A0D(r0, r1)
            X.69P r0 = X.AnonymousClass69P.SHIPPING_ADDRESS
            boolean r0 = X.C122157Kv.A0R(r3, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "request_shipping"
            r2.A0D(r0, r1)
            r8 = 18
            r7 = r6
            X.7Et r4 = X.C122157Kv.A04(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "ONE_TIME_CHECKOUT_OPTION"
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            X.C04220Ms.A06(r0)
            r4.A00 = r0
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = X.AnonymousClass7JJ.A02()
            X.6ci r2 = X.AnonymousClass7Kz.A0C()
            r1 = 5
            com.facebook.redex.IDxFunctionShape152S0200000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape152S0200000_2_I2
            r0.<init>(r1, r4, r3)
            X.M5J r1 = X.AnonymousClass5k7.A00(r0, r2)
            X.C04220Ms.A06(r1)
            r0 = 123(0x7b, float:1.72E-43)
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = X.C86114wI.A0Q(r9, r0)
            X.C121277Fh.A01(r6, r1, r0)
        L_0x00d1:
            return
        L_0x00d2:
            r5 = r6
            goto L_0x007f
        L_0x00d4:
            java.lang.String r0 = "NEW_PAYPAL_CHECKOUT"
            goto L_0x0073
        L_0x00d7:
            java.util.Iterator r1 = r1.iterator()
        L_0x00db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()
            X.66p r0 = (X.C967666p) r0
            int r0 = r0.ordinal()
            if (r0 != r2) goto L_0x00db
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r9.A01
            if (r0 == 0) goto L_0x002d
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x002d
            com.facebookpay.expresscheckout.models.APMConfiguration r0 = r0.A00
            if (r0 == 0) goto L_0x002d
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass587.A00(X.587):void");
    }

    public final OtcOptionState A04() {
        return (OtcOptionState) this.A07.A00("OTC_SESSION_STATE_KEY");
    }

    public final void A05() {
        if (this.A04) {
            OtcOptionState A042 = A04();
            if (A042 != null) {
                String str = A042.A01;
                AnonymousClass69P r0 = AnonymousClass69P.SHIPPING_ADDRESS;
                AnonymousClass67P r2 = AnonymousClass67P.OTC_AND_NON_OTC;
                this.A07.A02("OTC_SESSION_STATE_KEY", new OtcOptionState(AnonymousClass67P.OTC, str, "NEW_PAYPAL_CHECKOUT", AnonymousClass4WJ.A0G(C18180wK.A0p(r0, r2), C18180wK.A0p(AnonymousClass69P.CONTACT_INFORMATION, r2))));
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }

    public AnonymousClass587(C121177En r3, ECPPaymentRequest eCPPaymentRequest) {
        this.A07 = r3;
        this.A01 = eCPPaymentRequest;
        C880856r A022 = C880856r.A02();
        this.A00 = A022;
        this.A06 = C30821GXg.A01(A022, AnonymousClass8N5.A00);
        this.A05 = C30821GXg.A01(this.A00, AnonymousClass8N4.A00);
        if (this.A01 != null) {
            A00(this);
        }
    }

    public final OtcInput A02(AnonymousClass69P r5, boolean z) {
        OtcOptionState A042 = A04();
        if (A042 == null) {
            return null;
        }
        if (r5 != null) {
            Object obj = A042.A03.get(r5);
            if (obj == null) {
                obj = A042.A00;
            }
            if (obj != AnonymousClass67P.OTC && (obj != AnonymousClass67P.OTC_AND_NON_OTC || !z)) {
                return null;
            }
        } else if (!A07()) {
            return null;
        }
        return new OtcInput(A042.A01, A042.A02);
    }

    public final AnonymousClass7DP A03() {
        String str;
        boolean A072 = A07();
        OtcOptionState A042 = A04();
        if (A042 != null) {
            str = A042.A02;
        } else {
            str = null;
        }
        return new AnonymousClass7DP(A072, str);
    }

    public final void A06(boolean z) {
        AnonymousClass67P r1;
        String A0n = C18190wL.A0n(C03480Iw.A00());
        Map A0A = AnonymousClass4WJ.A0A();
        if (z) {
            r1 = AnonymousClass67P.OTC;
        } else {
            r1 = AnonymousClass67P.NON_OTC;
        }
        this.A07.A02("OTC_SESSION_STATE_KEY", new OtcOptionState(r1, A0n, "CARD", A0A));
    }

    public final boolean A07() {
        OtcOptionState A042 = A04();
        if (A042 == null || !A042.A04) {
            return false;
        }
        return true;
    }
}
