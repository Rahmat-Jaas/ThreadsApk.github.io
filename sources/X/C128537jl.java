package X;

import android.content.Context;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7jl  reason: invalid class name and case insensitive filesystem */
public final class C128537jl implements C146668mf {
    public AnonymousClass7AE A00 = new AnonymousClass7AE((ECPPaymentResponseParams) null, (PaymentRequest) null, (PaymentRequest) null, (C115316ur) null, (AnonymousClass7Kx) null, (Boolean) null, (String) null, (DefaultConstructorMarker) null, StringTreeSet.MAX_SYMBOL_COUNT);
    public final UserSession A01;
    public final C111486nl A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C04530Oa A05;
    public final C04530Oa A06;

    public C128537jl(Context context, L3B l3b, UserSession userSession) {
        this.A01 = userSession;
        this.A04 = AnonymousClass0OY.A02(C138448Hn.A00);
        this.A02 = new C92595iu(context, l3b, userSession);
        this.A05 = C86104wH.A16(this, 29);
        this.A06 = C86104wH.A16(this, 30);
        this.A03 = C86104wH.A16(this, 28);
    }

    public final C111486nl APl() {
        return this.A02;
    }

    public final Set AQS(PaymentRequest paymentRequest) {
        MW3 mw3 = new MW3();
        Set<PaymentContainerType> keySet = paymentRequest.content.paymentConfiguration.supportedContainers.keySet();
        ArrayList A0w = AnonymousClass0wJ.A0w(keySet);
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            C116866xg.A01(A0w, it);
        }
        Iterable A012 = this.A00.A01();
        if (A012 == null) {
            A012 = AnonymousClass84Y.A00;
        }
        Set A0d = AnonymousClass00J.A0d(A0w, AnonymousClass00J.A0c(A012));
        if (A0d.contains(AnonymousClass692.BASIC_CARD_V1) || A0d.contains(AnonymousClass692.ECOM_TOKEN_V1)) {
            mw3.add(C967666p.CARDS);
        }
        if (A0d.contains(AnonymousClass692.PAYPAL_OTC_V1)) {
            mw3.add(C967666p.PAYPAL_OTC);
        }
        C40536LiT.A09(mw3);
        return mw3;
    }

    public final String AR2() {
        return "META_CHECKOUT_APP_STYLE_IG";
    }

    public final Set ATW() {
        return (Set) this.A03.getValue();
    }

    public final AnonymousClass7AE AXJ() {
        return this.A00;
    }

    public final boolean Asm() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A01, 36315855454079821L);
    }

    public final boolean B0w() {
        return C63803iN.A0E(AnonymousClass0TJ.A06, this.A01, 36315855454079821L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (X.AnonymousClass00J.A0d(r0, r4).isEmpty() == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B3a() {
        /*
            r5 = this;
            X.7AE r0 = r5.A00
            java.util.Set r4 = r0.A01()
            r3 = 0
            if (r4 == 0) goto L_0x0044
            com.facebookpay.offsite.models.message.PaymentRequest r0 = r0.A01
            if (r0 == 0) goto L_0x0041
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r0.content
            if (r0 == 0) goto L_0x0041
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r0.paymentConfiguration
            if (r0 == 0) goto L_0x0041
            java.util.Map<com.facebookpay.offsite.models.message.PaymentContainerType, java.lang.Object> r0 = r0.supportedContainers
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = r0.keySet()
            if (r0 == 0) goto L_0x0041
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0031
            X.C116866xg.A01(r2, r1)
            goto L_0x0027
        L_0x0031:
            java.util.Set r0 = X.AnonymousClass00J.A0c(r2)
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = X.AnonymousClass00J.A0d(r0, r4)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r3 = 1
        L_0x0042:
            r3 = r3 ^ 1
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128537jl.B3a():boolean");
    }

    public final String B3n() {
        return "1302814060304063";
    }

    public final String B6A() {
        return C18200wM.A0q(this.A05);
    }

    public final boolean B7d() {
        return false;
    }

    public final String B9B() {
        return C18200wM.A0q(this.A06);
    }

    public final boolean BBR() {
        return false;
    }

    public final boolean BT0() {
        return true;
    }

    public final boolean BW9() {
        return false;
    }

    public final boolean BXU() {
        return AnonymousClass0wJ.A1X(this.A04.getValue());
    }

    public final void clear() {
        AnonymousClass7AE r1 = this.A00;
        r1.A06 = null;
        r1.A05 = null;
        r1.A00 = null;
        r1.A02 = null;
    }

    public C128537jl() {
    }
}
