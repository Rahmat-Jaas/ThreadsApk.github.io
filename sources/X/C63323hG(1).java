package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3hG  reason: invalid class name and case insensitive filesystem */
public final class C63323hG {
    public int A00;
    public AnonymousClass3D0 A01;
    public final C28161tl A02;
    public final UserSession A03;

    public static C58373Fg A01(KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, C58373Fg r3) {
        if (ktCSuperShape0S3100000_I2 == null) {
            return null;
        }
        String str = ktCSuperShape0S3100000_I2.A03;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        r3.A02 = str;
        r3.A01 = ktCSuperShape0S3100000_I2.A01;
        r3.A03 = C18210wN.A1T((Boolean) ktCSuperShape0S3100000_I2.A00);
        r3.A00 = ktCSuperShape0S3100000_I2.A02;
        return r3;
    }

    public static void A04(String str, String str2, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new AnonymousClass3A1(str, i, str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01fc, code lost:
        if (r2 == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x021c, code lost:
        if (r2 == false) goto L_0x021e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0261  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3D0 A05(android.content.Context r17) {
        /*
            r16 = this;
            r0 = r16
            X.3D0 r4 = r0.A01
            if (r4 != 0) goto L_0x02a9
            int r2 = r0.A00
            r6 = 1
            r3 = r17
            if (r2 == r6) goto L_0x013b
            r1 = 2
            if (r2 == r1) goto L_0x00d1
            r1 = 2131829163(0x7f1121ab, float:1.9291287E38)
            java.lang.String r11 = r3.getString(r1)
            com.instagram.service.session.UserSession r10 = r0.A03
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r10)
            boolean r7 = X.C59623Lo.A00(r1)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            r1 = 2131829153(0x7f1121a1, float:1.9291267E38)
            java.lang.String r4 = r3.getString(r1)
            r2 = 2131232596(0x7f080754, float:1.8081306E38)
            r1 = 2131829152(0x7f1121a0, float:1.9291265E38)
            java.lang.String r1 = r3.getString(r1)
            A04(r4, r1, r5, r2)
            r1 = 2131829159(0x7f1121a7, float:1.929128E38)
            java.lang.String r4 = r3.getString(r1)
            r2 = 2131233139(0x7f080973, float:1.8082407E38)
            r1 = 2131829158(0x7f1121a6, float:1.9291277E38)
            if (r7 == 0) goto L_0x004b
            r1 = 2131829157(0x7f1121a5, float:1.9291275E38)
        L_0x004b:
            java.lang.String r1 = r3.getString(r1)
            A04(r4, r1, r5, r2)
            r1 = 2131829162(0x7f1121aa, float:1.9291285E38)
            java.lang.String r4 = r3.getString(r1)
            r2 = 2131232970(0x7f0808ca, float:1.8082064E38)
            r1 = 2131829161(0x7f1121a9, float:1.9291283E38)
            java.lang.String r1 = r3.getString(r1)
            A04(r4, r1, r5, r2)
            r1 = 2131829156(0x7f1121a4, float:1.9291273E38)
            X.3Fg r8 = A00(r3, r1)
            java.lang.String r1 = "instagram://interop_reachability_settings?entry_point=auto_upgrade_m2_interstitial"
            r8.A01 = r1
            r8.A03 = r6
            java.lang.String r1 = "upgrade_screen_message_controls_clicked"
            r8.A00 = r1
            r1 = 2131829160(0x7f1121a8, float:1.9291281E38)
            X.3Fg r7 = A00(r3, r1)
            r7.A03 = r6
            java.lang.String r1 = "upgrade_screen_dismiss_clicked"
            r7.A00 = r1
            r1 = 2131829155(0x7f1121a3, float:1.9291271E38)
            java.lang.String r12 = r3.getString(r1)
            r1 = 2131829154(0x7f1121a2, float:1.929127E38)
            X.3Fg r4 = A00(r3, r1)
            java.lang.String r1 = "https://help.instagram.com/798400980929927"
            r4.A01 = r1
            java.lang.String r1 = "upgrade_screen_learn_more_clicked"
            r4.A00 = r1
            X.0TJ r9 = X.AnonymousClass0TJ.A05
            r1 = 36316800346361171(0x8105f000060d53, double:3.0302290028315244E-306)
            boolean r1 = X.C63803iN.A0E(r9, r10, r1)
            if (r1 != 0) goto L_0x0287
            X.1tl r1 = r0.A02
            android.content.SharedPreferences r2 = r1.A00
            java.lang.String r1 = "xac_auto_upgrade_interstitial_texts"
            java.lang.String r1 = X.C18200wM.A0h(r2, r1)
            if (r1 == 0) goto L_0x0287
            X.MMo r1 = X.C18180wK.A0L(r1)     // Catch:{ IOException | NullPointerException -> 0x00bf }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2400000_I2 r2 = X.C35222Mp.parseFromJson(r1)     // Catch:{ IOException | NullPointerException -> 0x00bf }
            if (r2 == 0) goto L_0x0287
            goto L_0x0263
        L_0x00bf:
            r9 = move-exception
            java.lang.String r1 = r9.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            java.lang.String r2 = "DirectInteropUpgradeController"
            java.lang.String r1 = "InteropAutoUpgradeInterstitialTexts unable to be parsed due to exception: %s. Will use locally strings to display interstitial"
            X.AnonymousClass0LU.A0L(r2, r1, r9, r3)
            goto L_0x0287
        L_0x00d1:
            r1 = 2131829173(0x7f1121b5, float:1.9291308E38)
            X.3Fg r5 = A00(r3, r1)
            r1 = 2131829183(0x7f1121bf, float:1.9291328E38)
            X.3Fg r4 = A00(r3, r1)
            r1 = 2131829171(0x7f1121b3, float:1.9291304E38)
            java.lang.String r9 = r3.getString(r1)
            r1 = 2131829576(0x7f112348, float:1.9292125E38)
            X.3Fg r1 = A00(r3, r1)
            com.instagram.service.session.UserSession r7 = r0.A03
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r2 = 36311749464490700(0x810158000102cc, double:3.02703480479837E-306)
            boolean r2 = X.C63803iN.A0E(r6, r7, r2)
            if (r2 == 0) goto L_0x0116
            X.3Cn r3 = r0.A06()
            if (r3 == 0) goto L_0x0116
            java.lang.String r2 = r3.A03
            X.3Fg r5 = A02(r5, r5, r2)
            java.lang.String r2 = r3.A00
            X.3Fg r4 = A02(r4, r4, r2)
            java.lang.String r9 = r3.A01
            java.lang.String r2 = r3.A02
            X.3Fg r1 = A02(r1, r1, r2)
        L_0x0116:
            r8 = 0
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of()
            if (r5 == 0) goto L_0x0139
            X.3BM r5 = r5.A00()
        L_0x0121:
            if (r4 == 0) goto L_0x0137
            X.3BM r6 = r4.A00()
        L_0x0127:
            if (r1 == 0) goto L_0x0135
            X.3BM r7 = r1.A00()
        L_0x012d:
            r11 = 0
            X.3D0 r4 = new X.3D0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x02a2
        L_0x0135:
            r7 = r8
            goto L_0x012d
        L_0x0137:
            r6 = r8
            goto L_0x0127
        L_0x0139:
            r5 = r8
            goto L_0x0121
        L_0x013b:
            r1 = 2131829170(0x7f1121b2, float:1.9291302E38)
            java.lang.String r12 = r3.getString(r1)
            com.instagram.service.session.UserSession r9 = r0.A03
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r9)
            boolean r4 = X.C59623Lo.A00(r1)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            r1 = 2131829177(0x7f1121b9, float:1.9291316E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 2131232857(0x7f080859, float:1.8081835E38)
            r10 = 0
            A04(r2, r10, r5, r1)
            r1 = 2131829184(0x7f1121c0, float:1.929133E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 2131232588(0x7f08074c, float:1.808129E38)
            A04(r2, r10, r5, r1)
            r1 = 2131829186(0x7f1121c2, float:1.9291334E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 2131232929(0x7f0808a1, float:1.8081981E38)
            A04(r2, r10, r5, r1)
            r1 = 2131829178(0x7f1121ba, float:1.9291318E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 2131233056(0x7f080920, float:1.8082239E38)
            A04(r2, r10, r5, r1)
            r1 = 2131829175(0x7f1121b7, float:1.9291312E38)
            if (r4 == 0) goto L_0x018d
            r1 = 2131829176(0x7f1121b8, float:1.9291314E38)
        L_0x018d:
            java.lang.String r2 = r3.getString(r1)
            r1 = 2131233139(0x7f080973, float:1.8082407E38)
            A04(r2, r10, r5, r1)
            r1 = 2131829185(0x7f1121c1, float:1.9291332E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 2131232248(0x7f0805f8, float:1.80806E38)
            A04(r2, r10, r5, r1)
            r1 = 2131829173(0x7f1121b5, float:1.9291308E38)
            X.3Fg r7 = A00(r3, r1)
            r1 = 2131829183(0x7f1121bf, float:1.9291328E38)
            X.3Fg r6 = A00(r3, r1)
            r1 = 2131829171(0x7f1121b3, float:1.9291304E38)
            java.lang.String r13 = r3.getString(r1)
            r1 = 2131829576(0x7f112348, float:1.9292125E38)
            X.3Fg r4 = A00(r3, r1)
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r1 = 36311749464490700(0x810158000102cc, double:3.02703480479837E-306)
            boolean r1 = X.C63803iN.A0E(r8, r9, r1)
            if (r1 == 0) goto L_0x0245
            X.1tl r1 = r0.A02
            android.content.SharedPreferences r2 = r1.A00
            java.lang.String r1 = "interop_interstitial_texts"
            java.lang.String r1 = r2.getString(r1, r10)
            if (r1 == 0) goto L_0x0245
            X.MMo r1 = X.C18180wK.A0L(r1)     // Catch:{ IOException | NullPointerException -> 0x0235 }
            X.1T0 r1 = X.C35272Mu.parseFromJson(r1)     // Catch:{ IOException | NullPointerException -> 0x0235 }
            X.3D1 r8 = r1.A00     // Catch:{ IOException | NullPointerException -> 0x0235 }
            if (r8 == 0) goto L_0x0245
            java.lang.String r12 = r8.A05
            java.util.ArrayList r1 = r8.A06
            if (r1 == 0) goto L_0x0233
            java.util.ArrayList r1 = X.C18200wM.A0s(r1)
        L_0x01ef:
            java.util.List r5 = A03(r3, r1)
            java.lang.Boolean r1 = r8.A00
            if (r1 == 0) goto L_0x01fe
            boolean r2 = r1.booleanValue()
            r1 = 1
            if (r2 != 0) goto L_0x01ff
        L_0x01fe:
            r1 = 0
        L_0x01ff:
            boolean r15 = X.C18210wN.A1W(r1)
            java.lang.String r1 = r8.A04
            X.3Fg r7 = A02(r7, r7, r1)
            java.lang.String r1 = r8.A01
            X.3Fg r6 = A02(r6, r6, r1)
            java.lang.String r13 = r8.A02
            if (r13 != 0) goto L_0x022c
            java.lang.Boolean r1 = r8.A00
            if (r1 == 0) goto L_0x021e
            boolean r2 = r1.booleanValue()
            r1 = 1
            if (r2 != 0) goto L_0x021f
        L_0x021e:
            r1 = 0
        L_0x021f:
            boolean r1 = X.C18210wN.A1W(r1)
            if (r1 == 0) goto L_0x022c
            r1 = 2131829172(0x7f1121b4, float:1.9291306E38)
            java.lang.String r13 = r3.getString(r1)
        L_0x022c:
            java.lang.String r1 = r8.A03
            X.3Fg r4 = A02(r4, r4, r1)
            goto L_0x0246
        L_0x0233:
            r1 = 0
            goto L_0x01ef
        L_0x0235:
            r8 = move-exception
            java.lang.String r1 = r8.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            java.lang.String r2 = "DirectInteropUpgradeController"
            java.lang.String r1 = "DirectInteropUpgradeStatusResponse unable to be parsed due to exception: %s. Will use locally strings to display interstitial"
            X.AnonymousClass0LU.A0L(r2, r1, r8, r3)
        L_0x0245:
            r15 = 0
        L_0x0246:
            r11 = 0
            if (r7 == 0) goto L_0x0261
            X.3BM r9 = r7.A00()
        L_0x024d:
            if (r6 == 0) goto L_0x0253
            X.3BM r10 = r6.A00()
        L_0x0253:
            if (r4 == 0) goto L_0x0259
            X.3BM r11 = r4.A00()
        L_0x0259:
            X.3D0 r4 = new X.3D0
            r8 = r4
            r14 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x02a2
        L_0x0261:
            r9 = r10
            goto L_0x024d
        L_0x0263:
            java.lang.String r11 = r2.A04
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            java.util.List r5 = A03(r3, r1)
            java.lang.Object r1 = r2.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2) r1
            X.3Fg r8 = A01(r1, r8)
            java.lang.Object r1 = r2.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2) r1
            X.3Fg r7 = A01(r1, r7)
            java.lang.String r12 = r2.A05
            java.lang.Object r1 = r2.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2) r1
            X.3Fg r4 = A01(r1, r4)
        L_0x0287:
            r10 = 0
            if (r8 == 0) goto L_0x02a7
            X.3BM r8 = r8.A00()
        L_0x028e:
            if (r7 == 0) goto L_0x02a5
            X.3BM r9 = r7.A00()
        L_0x0294:
            if (r4 == 0) goto L_0x029a
            X.3BM r10 = r4.A00()
        L_0x029a:
            X.3D0 r4 = new X.3D0
            r7 = r4
            r13 = r5
            r14 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
        L_0x02a2:
            r0.A01 = r4
            return r4
        L_0x02a5:
            r9 = r10
            goto L_0x0294
        L_0x02a7:
            r8 = r10
            goto L_0x028e
        L_0x02a9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63323hG.A05(android.content.Context):X.3D0");
    }

    public final C57803Cn A06() {
        String A0h = C18200wM.A0h(this.A02.A00, "interop_interstitial_texts");
        if (A0h == null) {
            return null;
        }
        try {
            return C35272Mu.parseFromJson(C18180wK.A0L(A0h)).A01;
        } catch (IOException | NullPointerException e) {
            AnonymousClass0LU.A0M("DirectInteropUpgradeController", "DirectInteropUpgradeStatusResponse unable to be parsed due to exception: %s. Will use locally strings to display interstitial", e, e.getMessage());
            return null;
        }
    }

    public C63323hG(C28161tl r1, UserSession userSession, int i) {
        this.A03 = userSession;
        this.A02 = r1;
        this.A00 = i;
    }

    public static C58373Fg A00(Context context, int i) {
        return new C58373Fg(context.getString(i));
    }

    public static C58373Fg A02(C58373Fg r1, C58373Fg r2, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        r1.A02 = str;
        return r2;
    }

    public static List A03(Context context, List list) {
        String str;
        int identifier;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KtCSuperShape0S4000000_I2 ktCSuperShape0S4000000_I2 = (KtCSuperShape0S4000000_I2) it.next();
                String str2 = ktCSuperShape0S4000000_I2.A03;
                if (!(str2 == null || (str = ktCSuperShape0S4000000_I2.A00) == null || (identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName())) == 0)) {
                    A04(str2, ktCSuperShape0S4000000_I2.A01, A0v, identifier);
                }
            }
        }
        return A0v;
    }
}
