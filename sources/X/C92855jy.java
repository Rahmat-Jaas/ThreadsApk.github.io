package X;

import android.os.Bundle;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.5jy  reason: invalid class name and case insensitive filesystem */
public final class C92855jy extends C882957m {
    public M5J A00;
    public FbPayShopPay A01;
    public FBPayLoggerData A02;
    public final C880756q A03 = C880756q.A01();
    public final C880856r A04 = C880856r.A03();
    public final C143158gC A05 = C86114wI.A0Q(this, 250);
    public final C112706q3 A06;
    public final C143688h9 A07;
    public final C112716q4 A08;

    public C92855jy(C112706q3 r2, C143688h9 r3, C112716q4 r4) {
        this.A06 = r2;
        this.A08 = r4;
        this.A07 = r3;
    }

    public static ImmutableList A00(C92855jy r5) {
        String str;
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        int i = 0;
        AnonymousClass5jS r2 = new AnonymousClass5jS(0);
        r2.A07 = 2131832200;
        FbPayShopPay fbPayShopPay = r5.A01;
        boolean z = fbPayShopPay.A02;
        if (z) {
            str = null;
        } else {
            str = fbPayShopPay.A01;
        }
        r2.A0F = str;
        int i2 = 0;
        if (z) {
            i2 = 2131835804;
        }
        r2.A06 = i2;
        if (z) {
            i = R.attr.fbpay_error_text_color;
        }
        r2.A05 = i;
        r2.A00 = R.attr.fbpay_shop_pay_hub_icon;
        A0Q.add((Object) new AnonymousClass5je(r2));
        AnonymousClass5jU r4 = new AnonymousClass5jU();
        int i3 = 2131826662;
        if (r5.A01.A02) {
            i3 = 2131830130;
        }
        r4.A00 = i3;
        r4.A01 = C86134wK.A0P(r5, 71);
        C107316gY r1 = new C107316gY();
        Integer num = AnonymousClass006.A01;
        r1.A00 = num;
        r4.A02 = new C107326gZ(r1);
        A0Q.add((Object) new C92655jb(r4));
        AnonymousClass5jW r12 = new AnonymousClass5jW();
        r12.A02 = 2131834650;
        r12.A01 = R.attr.fbpay_error_text_color;
        A0Q.add((Object) AnonymousClass5jW.A00(r12, num, r5, 72));
        return A0Q.build();
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A02 = C86104wH.A0Q(bundle);
        this.A01 = (FbPayShopPay) C18240wQ.A0D(bundle, "shop_pay_credential");
        C880756q r2 = this.A06.A03;
        C880856r.A05(r2, this.A03, this, 251);
        C880756q r1 = this.A03;
        C880856r.A05(r2, r1, this, 252);
        r1.A0H(A00(this));
        C112716q4 r12 = this.A08;
        String A002 = this.A02.A00();
        A002.getClass();
        r12.A00(A002);
        Map A062 = C122037Js.A06(this.A02);
        C86134wK.A1N("view_name", "edit_shoppay", A062);
        this.A07.Bb8("client_load_credential_success", A062);
    }
}
