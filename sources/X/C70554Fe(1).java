package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Fe  reason: invalid class name and case insensitive filesystem */
public final class C70554Fe implements C84194si {
    public final Context A00;
    public final UserSession A01;
    public final User A02;
    public final C85874vu A03;

    public C70554Fe(Context context, C85874vu r3, UserSession userSession, User user) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A03 = r3;
        this.A02 = user;
        this.A01 = userSession;
    }

    public final String AUe() {
        return A00(this, false);
    }

    public final String AUg() {
        return "shop";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r0 == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C70554Fe r6, boolean r7) {
        /*
            com.instagram.user.model.User r5 = r6.A02
            com.instagram.service.session.UserSession r3 = r6.A01
            java.lang.Integer r1 = X.AnonymousClass3ib.A0B(r3, r5)
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 != r0) goto L_0x0016
            android.content.Context r1 = r6.A00
            r0 = 2131821105(0x7f110231, float:1.9274944E38)
        L_0x0011:
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r1, r0)
            return r0
        L_0x0016:
            com.instagram.api.schemas.SellerShoppableFeedType r1 = r5.A0U()
            com.instagram.api.schemas.SellerShoppableFeedType r0 = com.instagram.api.schemas.SellerShoppableFeedType.ZERO_MOBILE_CENTER
            if (r1 != r0) goto L_0x0024
            android.content.Context r1 = r6.A00
            r0 = 2131837936(0x7f1143f0, float:1.9309081E38)
            goto L_0x0011
        L_0x0024:
            android.content.Context r4 = r6.A00
            if (r7 == 0) goto L_0x0071
            java.lang.String r0 = "default"
        L_0x002a:
            int r2 = r0.hashCode()
            r1 = -807536386(0xffffffffcfddf8fe, float:-7.4481654E9)
            if (r2 == r1) goto L_0x005d
            r1 = -344962547(0xffffffffeb704a0d, float:-2.904919E26)
            if (r2 == r1) goto L_0x0053
            r1 = 774959550(0x2e30f1be, float:4.0232477E-11)
            if (r2 != r1) goto L_0x0048
            java.lang.String r1 = "view_products"
            boolean r0 = r0.equals(r1)
            r1 = 2131833038(0x7f1130ce, float:1.9299147E38)
        L_0x0046:
            if (r0 != 0) goto L_0x004b
        L_0x0048:
            r1 = 2131833039(0x7f1130cf, float:1.9299149E38)
        L_0x004b:
            java.lang.String r0 = r4.getString(r1)
        L_0x004f:
            X.C04220Ms.A06(r0)
            return r0
        L_0x0053:
            java.lang.String r1 = "shop_now"
            boolean r0 = r0.equals(r1)
            r1 = 2131833021(0x7f1130bd, float:1.9299112E38)
            goto L_0x0046
        L_0x005d:
            java.lang.String r1 = "shop_brand"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            r1 = 2131835799(0x7f113b97, float:1.9304747E38)
            java.lang.String r0 = r5.BK7()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r4, r0, r1)
            goto L_0x004f
        L_0x0071:
            java.lang.Class<X.36J> r2 = X.AnonymousClass36J.class
            r1 = 10
            kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110 r0 = new kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.36J r0 = (X.AnonymousClass36J) r0
            com.instagram.service.session.UserSession r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36877190498877567(0x83039c0000007f, double:3.384621991792917E-306)
            java.lang.String r0 = X.C63803iN.A0C(r2, r3, r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70554Fe.A00(X.4Fe, boolean):java.lang.String");
    }

    public final void onClick() {
    }
}
