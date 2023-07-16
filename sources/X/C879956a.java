package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2;
import com.instagram.barcelona.share.data.PermalinkRepository;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.56a  reason: invalid class name and case insensitive filesystem */
public final class C879956a extends AnonymousClass10X {
    public BKU A00;
    public final C105566dd A01 = new C105566dd();
    public final C105576de A02 = new C105576de();
    public final C105586df A03 = new C105586df();
    public final C105596dg A04 = new C105596dg();
    public final PermalinkRepository A05;
    public final C11630kW A06;
    public final AnonymousClass3V6 A07 = AnonymousClass2LT.A00();
    public final AnonymousClass3V6 A08 = AnonymousClass2LT.A00();
    public final AnonymousClass3V6 A09 = AnonymousClass2LT.A00();
    public final AnonymousClass3V6 A0A = AnonymousClass2LT.A00();
    public final AnonymousClass3V6 A0B = AnonymousClass2LT.A00();
    public final UserSession A0C;
    public final C86074wE A0D;
    public final C86094wG A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C879956a(android.app.Application r19, X.C11630kW r20, com.instagram.service.session.UserSession r21, java.lang.String r22) {
        /*
            r18 = this;
            com.instagram.barcelona.share.data.PermalinkRepository r0 = new com.instagram.barcelona.share.data.PermalinkRepository
            r6 = r21
            r0.<init>(r6)
            r2 = r18
            r4 = r19
            r2.<init>(r4)
            r2.A0C = r6
            r1 = r20
            r2.A06 = r1
            r2.A05 = r0
            r8 = 0
            r16 = 0
            r15 = 127(0x7f, float:1.78E-43)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r7 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r17 = r16
            r7.<init>((java.lang.Integer) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.util.List) r13, (kotlin.jvm.internal.DefaultConstructorMarker) r14, (int) r15, (int) r16, (boolean) r17)
            X.Enn r3 = X.C18190wL.A0z(r7)
            r2.A0D = r3
            X.Efm r0 = X.C18230wP.A0x(r8, r3)
            r2.A0E = r0
            X.6dd r0 = new X.6dd
            r0.<init>()
            r2.A01 = r0
            X.6df r0 = new X.6df
            r0.<init>()
            r2.A03 = r0
            X.6de r0 = new X.6de
            r0.<init>()
            r2.A02 = r0
            X.6dg r0 = new X.6dg
            r0.<init>()
            r2.A04 = r0
            X.3V6 r0 = X.AnonymousClass2LT.A00()
            r2.A07 = r0
            X.3V6 r0 = X.AnonymousClass2LT.A00()
            r2.A08 = r0
            X.3V6 r0 = X.AnonymousClass2LT.A00()
            r2.A0A = r0
            X.3V6 r0 = X.AnonymousClass2LT.A00()
            r2.A09 = r0
            X.3V6 r0 = X.AnonymousClass2LT.A00()
            r2.A0B = r0
            r0 = r22
            X.BKU r1 = X.C86114wI.A0W(r6, r0)
            r2.A00 = r1
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0v()
            if (r1 == 0) goto L_0x00e8
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            boolean r0 = X.C19573AyZ.A00(r1, r6)
            if (r0 != 0) goto L_0x008c
            boolean r0 = r1.A4b()
            if (r0 == 0) goto L_0x00ae
        L_0x008c:
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 2342169855488173847(0x20810f1300002717, double:4.071390940243166E-152)
            boolean r0 = X.C63803iN.A0E(r7, r6, r0)
            if (r0 == 0) goto L_0x009e
            X.689 r0 = X.AnonymousClass689.SHARE_TO_IG_STORY
            r5.add(r0)
        L_0x009e:
            r0 = 36326846274676505(0x810f1300032719, double:3.036582088349848E-306)
            boolean r0 = X.C63803iN.A0E(r7, r6, r0)
            if (r0 == 0) goto L_0x00ae
            X.689 r0 = X.AnonymousClass689.SHARE_TO_IG_FEED
            r5.add(r0)
        L_0x00ae:
            android.content.Context r0 = r4.getApplicationContext()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            java.lang.String r0 = "com.twitter.android"
            boolean r0 = X.C09650fs.A09(r1, r0)
            if (r0 == 0) goto L_0x00d0
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 2342169855488239384(0x20810f1300012718, double:4.071390940298736E-152)
            boolean r0 = X.C63803iN.A0E(r4, r6, r0)
            if (r0 == 0) goto L_0x00d0
            X.689 r0 = X.AnonymousClass689.SHARE_TO_TWITTER
            r5.add(r0)
        L_0x00d0:
            boolean r0 = X.C18250wR.A1K(r5)
            if (r0 == 0) goto L_0x00d9
            r13.add(r5)
        L_0x00d9:
            X.689 r1 = X.AnonymousClass689.COPY_LINK
            X.689 r0 = X.AnonymousClass689.SHARE_VIA
            X.689[] r0 = new X.AnonymousClass689[]{r1, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            r13.add(r0)
        L_0x00e8:
            java.lang.Object r1 = r3.getValue()
            r7 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2) r7
            X.BKU r0 = r2.A00
            boolean r15 = X.C18220wO.A1U(r0)
            r14 = 124(0x7c, float:1.74E-43)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r3.ADi(r1, r0)
            if (r0 == 0) goto L_0x00e8
            X.BKU r0 = r2.A00
            if (r0 == 0) goto L_0x016e
            com.instagram.service.session.UserSession r5 = r2.A0C
            X.0kW r7 = r2.A06
            X.BKN r0 = r0.A0f
            java.lang.String r2 = r0.A4Y
            X.C04220Ms.A06(r2)
            com.instagram.user.model.User r0 = r0.A1i
            java.lang.String r6 = X.C86134wK.A0p(r0)
            java.lang.String r4 = "direct_share_sheet"
            X.0nS r1 = X.C13330nS.A01(r7, r5)
            java.lang.String r0 = "external_share_app_tray_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 594(0x252, float:8.32E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = "media_id"
            r3.A0T(r0, r2)
            r2 = 0
            if (r6 == 0) goto L_0x013a
            java.lang.Long r8 = X.AnonymousClass0wJ.A0d(r6)
        L_0x013a:
            java.lang.String r0 = "media_owner_id"
            r3.A0S(r0, r8)
            java.lang.String r1 = r7.getModuleName()
            java.lang.String r0 = "module"
            r3.A0T(r0, r1)
            r0 = 1398(0x576, float:1.959E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r3.A0T(r0, r4)
            X.C18190wL.A1L(r3)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r5)
            java.lang.Integer r0 = r0.A0o()
            if (r0 == 0) goto L_0x0162
            java.lang.Long r2 = X.C86144wL.A0c(r0)
        L_0x0162:
            r0 = 375(0x177, float:5.25E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r3.A0S(r0, r2)
            r3.Bb4()
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879956a.<init>(android.app.Application, X.0kW, com.instagram.service.session.UserSession, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.BKU r29, com.instagram.service.session.UserSession r30) {
        /*
            r12 = r30
            com.instagram.user.model.User r13 = X.AnonymousClass0wJ.A0Y(r12)
            X.67q r9 = X.C970267q.POST
            r11 = r29
            X.BKN r3 = r11.A0f
            X.5Ml r0 = r3.A1J
            if (r0 == 0) goto L_0x005c
            com.instagram.user.model.User r0 = r0.A04
            if (r0 == 0) goto L_0x005c
            java.lang.String r17 = r0.BK7()
        L_0x0018:
            com.instagram.api.schemas.LineType r8 = com.instagram.api.schemas.LineType.NONE
            com.instagram.user.model.User r7 = r11.A2Z(r12)
            if (r7 == 0) goto L_0x0084
            r1 = 1
            X.5Ml r0 = r3.A1J
            r4 = 0
            if (r0 == 0) goto L_0x0059
            java.util.List r6 = r0.A0A
            java.lang.Integer r5 = r0.A09
        L_0x002a:
            java.util.List r0 = r3.A5R
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = X.AnonymousClass00J.A0D(r0)
            X.5L3 r0 = (X.AnonymousClass5L3) r0
            if (r0 == 0) goto L_0x0038
            java.util.List r4 = r0.A03
        L_0x0038:
            r2 = 1
            if (r6 == 0) goto L_0x0057
            boolean r0 = X.C18190wL.A1a(r6)
            if (r0 != r1) goto L_0x0057
        L_0x0041:
            r1 = 10
            if (r2 == 0) goto L_0x005f
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r6, r1)
            java.util.Iterator r1 = r6.iterator()
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            X.C86114wI.A1Q(r2, r1)
            goto L_0x004d
        L_0x0057:
            r2 = 0
            goto L_0x0041
        L_0x0059:
            r6 = r4
            r5 = r4
            goto L_0x002a
        L_0x005c:
            r17 = 0
            goto L_0x0018
        L_0x005f:
            if (r5 == 0) goto L_0x007b
            int r0 = r5.intValue()
            if (r0 >= 0) goto L_0x007b
            if (r4 == 0) goto L_0x0084
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r4, r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x0071:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            X.C86114wI.A1Q(r2, r1)
            goto L_0x0071
        L_0x007b:
            com.instagram.common.typedurl.ImageUrl r0 = r7.B4M()
            java.util.List r2 = X.C18180wK.A0n(r0)
            goto L_0x0086
        L_0x0084:
            X.0ZV r2 = X.AnonymousClass0ZV.A00
        L_0x0086:
            X.5Ml r0 = r3.A1J
            if (r0 == 0) goto L_0x00bf
            java.lang.Integer r0 = r0.A08
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.intValue()
        L_0x0092:
            X.7pG r10 = new X.7pG
            r10.<init>(r0)
            r22 = 1
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r22)
            r18 = 0
            r23 = 0
            r21 = 4087808(0x3e6000, float:5.728239E-39)
            java.lang.String r15 = ""
            r16 = r15
            r19 = r18
            r20 = r2
            r24 = r23
            r25 = r23
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r23
            r30 = r23
            java.util.List r0 = X.C121517Gn.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        L_0x00bf:
            r0 = 0
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879956a.A00(X.BKU, com.instagram.service.session.UserSession):java.util.List");
    }

    public static final void A01(C879956a r11) {
        Object value;
        C86074wE r2 = r11.A0D;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, KtCSuperShape0S0610000_I2.A00((KtCSuperShape0S0610000_I2) value, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (List) null, 125, true)));
    }

    public static final void A02(C879956a r5, String str) {
        BKU bku = r5.A00;
        if (bku != null) {
            UserSession userSession = r5.A0C;
            C11630kW r1 = r5.A06;
            BKN bkn = bku.A0f;
            C63673i6.A06(r1, userSession, bkn.A4Y, C86134wK.A0p(bkn.A1i), "direct_share_sheet", str);
        }
    }

    public static final void A03(C879956a r8, String str, String str2) {
        BKU bku = r8.A00;
        if (bku != null) {
            UserSession userSession = r8.A0C;
            C04220Ms.A0B(str2, 4);
            C63673i6.A0B(r8.A06, userSession, C86154wM.A0m(bku), "direct_share_sheet", str, str2, (String) null);
        }
    }

    public static final void A04(C879956a r4, String str, Throwable th) {
        BKU bku = r4.A00;
        if (bku != null) {
            C63673i6.A09(r4.A06, r4.A0C, C86154wM.A0m(bku), "direct_share_sheet", str, th);
        }
    }
}
