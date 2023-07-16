package X;

import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.3TU  reason: invalid class name */
public final class AnonymousClass3TU {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r13, X.C66843yQ r14, com.instagram.bloks.hosting.IgBloksScreenConfig r15, X.C127397h3 r16, X.C82374pW r17, java.lang.String r18, int r19) {
        /*
            r12 = this;
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r5 = X.C10050he.A00(r13, r0)
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            if (r5 == 0) goto L_0x009f
            X.3yU r1 = r15.A01
            if (r1 != 0) goto L_0x0012
            X.3yU r1 = X.C66883yU.A00()
        L_0x0012:
            X.0i6 r0 = r15.A0C
            r6 = r14
            r2 = r18
            X.1Xb r4 = X.AnonymousClass1Xb.A01(r1, r14, r15, r0, r2)
            java.lang.Integer r0 = r1.A0B
            java.lang.Integer r3 = X.AnonymousClass006.A0N
            r9 = r17
            r11 = r19
            if (r0 == r3) goto L_0x0038
            if (r16 != 0) goto L_0x0033
            java.lang.String r10 = "unspecified_bloks_screen_id"
        L_0x0029:
            X.18u r8 = r15.A04()
            X.7Jj r7 = r15.A08
            X.C63123bZ.A05(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0033:
            java.lang.String r10 = X.C63763iI.A09(r16)
            goto L_0x0029
        L_0x0038:
            X.0i6 r0 = r15.A0C
            X.Drz r2 = X.C18180wK.A0Q(r5, r0)
            r2.A03 = r4
            r0 = 1
            r2.A0D = r0
            java.lang.String r10 = r15.A0Q
            if (r10 != 0) goto L_0x0053
            if (r16 == 0) goto L_0x009b
            boolean r0 = X.C63763iI.A0D(r16)
            if (r0 == 0) goto L_0x009b
            java.lang.String r10 = X.C63763iI.A09(r16)
        L_0x0053:
            if (r10 == 0) goto L_0x009c
            r0 = r10
        L_0x0056:
            r2.A07 = r0
            java.lang.String r0 = "IgCdsBottomSheetFragment"
            r2.A09 = r0
            java.util.Map r1 = r15.A0W
            if (r1 == 0) goto L_0x0067
            X.41v r0 = new X.41v
            r0.<init>(r1)
            r2.A04 = r0
        L_0x0067:
            X.3yU r1 = r15.A01
            if (r1 == 0) goto L_0x007c
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x007c
            java.lang.Integer r0 = r1.A0B
            if (r0 != r3) goto L_0x007c
            r1 = 2130772000(0x7f010020, float:1.7147106E38)
            r0 = 2130772003(0x7f010023, float:1.7147112E38)
            r2.A09(r1, r0, r1, r0)
        L_0x007c:
            r2.A05()
            if (r10 != 0) goto L_0x0083
            java.lang.String r10 = "unspecified_bloks_screen_id"
        L_0x0083:
            X.18u r8 = r15.A04()
            X.7Jj r7 = r15.A08
            X.4TE r3 = new X.4TE
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            android.os.Handler r1 = X.AnonymousClass0wJ.A0F()
            X.HcN r0 = new X.HcN
            r0.<init>(r1, r4, r3)
            r1.post(r0)
            return
        L_0x009b:
            r10 = 0
        L_0x009c:
            java.lang.String r0 = "IgCdsBottomSheetFragment"
            goto L_0x0056
        L_0x009f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TU.A01(android.content.Context, X.3yQ, com.instagram.bloks.hosting.IgBloksScreenConfig, X.7h3, X.4pW, java.lang.String, int):void");
    }

    public static AnonymousClass1c8 A00(C66843yQ r5, IgBloksScreenConfig igBloksScreenConfig) {
        Bundle A06 = C18180wK.A06();
        IgBloksScreenConfig.A03(A06, igBloksScreenConfig);
        C18180wK.A0w(A06, igBloksScreenConfig.A0C);
        C66843yQ.A03(A06, r5, C63803iN.A05(AnonymousClass0TJ.A05, igBloksScreenConfig.A0C, 36326524151998067L).booleanValue());
        AnonymousClass1c8 r0 = new AnonymousClass1c8();
        r0.setArguments(A06);
        return r0;
    }
}
