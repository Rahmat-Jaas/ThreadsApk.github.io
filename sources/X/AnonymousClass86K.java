package X;

import android.net.Uri;
import com.facebook.redex.IDxCListenerShape9S1200000_2_I2;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.Set;

/* renamed from: X.86K  reason: invalid class name */
public final class AnonymousClass86K implements AnonymousClass0YY {
    public final /* synthetic */ C92835jw A00;
    public final /* synthetic */ String A01;

    public AnonymousClass86K(C92835jw r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Set set;
        int i;
        C112716q4 r1;
        FbPayNewPayPalOption fbPayNewPayPalOption;
        AnonymousClass7Kx r10 = (AnonymousClass7Kx) obj;
        if (!AnonymousClass7Kx.A0R(r10)) {
            return ImmutableList.of();
        }
        Object obj2 = r10.A01;
        obj2.getClass();
        C113886sK r5 = (C113886sK) obj2;
        C92835jw r3 = this.A00;
        FbPayNewCreditCardOption fbPayNewCreditCardOption = r5.A01;
        r3.A04 = fbPayNewCreditCardOption;
        Set set2 = r3.A0G;
        C969867m r12 = C969867m.CREDIT_CARD;
        if (!set2.contains(r12) || fbPayNewCreditCardOption == null) {
            set = r3.A0F;
            set.remove(r12);
        } else {
            set = r3.A0F;
            set.add(r12);
        }
        C969867m r13 = C969867m.PAYPAL;
        if (!set2.contains(r13) || (fbPayNewPayPalOption = r5.A02) == null) {
            set.remove(r13);
        } else {
            r3.A08 = fbPayNewPayPalOption.A00;
            set.add(r13);
        }
        C969867m r2 = C969867m.SHOP_PAY;
        if (!set2.contains(r2) || r5.A03 == null || (r1 = r3.A07) == null) {
            set.remove(r2);
        } else {
            String A002 = r3.A06.A00();
            A002.getClass();
            r1.A00(A002);
            set.add(r2);
        }
        r3.A03 = r5.A00;
        ImmutableList immutableList = r5.A04;
        String str = this.A01;
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        C92665jc.A00(new AnonymousClass5jV(), A0Q, 2131832205);
        C1366783w it = immutableList.iterator();
        while (it.hasNext()) {
            FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) it.next();
            AnonymousClass5jS r4 = new AnonymousClass5jS(0);
            r4.A0G = fbPayPaymentMethod.A07;
            r4.A0F = fbPayPaymentMethod.A06;
            r4.A0B = new C92685jf();
            r4.A08 = new IDxCListenerShape9S1200000_2_I2(r3, fbPayPaymentMethod, str, 1);
            Uri uri = fbPayPaymentMethod.A01;
            if (uri != null) {
                r4.A0E = uri.toString();
            } else {
                int i2 = fbPayPaymentMethod.A00;
                if (i2 == 1) {
                    i = R.drawable.payment_paypal_hub;
                } else if (i2 == 2) {
                    i = R.drawable.rectangular_bank;
                } else if (i2 == 3) {
                    r4.A00 = R.attr.fbpay_shop_pay_hub_icon;
                    FbPayShopPay fbPayShopPay = fbPayPaymentMethod.A05;
                    if (fbPayShopPay != null && fbPayShopPay.A02) {
                        r4.A05 = R.attr.fbpay_error_text_color;
                    }
                }
                r4.A02 = i;
            }
            AnonymousClass5je.A00(r4, A0Q);
        }
        AnonymousClass5jU r14 = new AnonymousClass5jU();
        r14.A00 = 2131832204;
        C92655jb.A00(r14, A0Q, r3, 73);
        return A0Q.build();
    }
}
