package com.instagram.barcelona.profile.data;

import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass2LT;
import X.AnonymousClass3V6;
import X.AnonymousClass5t2;
import X.AnonymousClass7E6;
import X.C04220Ms;
import X.C105536da;
import X.C117506yn;
import X.C146958n9;
import X.C148838sG;
import X.C18190wL;
import X.C18230wP;
import X.C18250wR;
import X.C27457Enn;
import X.C63623hv;
import X.C86074wE;
import X.C86094wG;
import X.C86134wK;
import X.C86144wL;
import X.C968566y;
import X.D0E;
import X.E6C;
import X.H1T;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public final class ProfileFeedDataSource {
    public String A00;
    public String A01;
    public boolean A02;
    public final C105536da A03;
    public final C968566y A04;
    public final AnonymousClass3V6 A05 = AnonymousClass2LT.A00();
    public final AnonymousClass3V6 A06 = AnonymousClass2LT.A00();
    public final UserSession A07;
    public final C86074wE A08;
    public final C86074wE A09;
    public final C86094wG A0A;
    public final C86094wG A0B;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.barcelona.profile.data.ProfileFeedDataSource r14, X.C146958n9 r15, boolean r16) {
        /*
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r15)
            if (r0 == 0) goto L_0x010b
            r5 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00d0
            if (r0 != r4) goto L_0x0112
            java.lang.Object r14 = r5.A01
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r14 = (com.instagram.barcelona.profile.data.ProfileFeedDataSource) r14
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00b1
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.5t2 r0 = (X.AnonymousClass5t2) r0
            X.6jN r6 = r0.A00
            if (r6 != 0) goto L_0x003c
            X.C18250wR.A0m()
            throw r9
        L_0x003c:
            X.4wE r5 = r14.A08
            java.util.List r0 = r6.A01
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x0048:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2) r0
            java.lang.Object r0 = r0.A00
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0048
            r3.add(r1)
            goto L_0x0048
        L_0x0063:
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x006b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r1 = r3.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2) r1
            java.lang.Integer r2 = X.AnonymousClass006.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.5HQ r1 = X.AnonymousClass6O2.A00(r1)
            X.5I1 r0 = new X.5I1
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x006b
        L_0x008a:
            r5.CrC(r4)
            java.lang.String r0 = r6.A00
            r14.A00 = r0
            X.4wE r2 = r14.A09
        L_0x0093:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r7
            java.lang.Integer r8 = X.AnonymousClass006.A01
            java.lang.String r0 = r14.A00
            boolean r13 = X.C18220wO.A1U(r0)
            r12 = 22
            r10 = r9
            r11 = r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0093
            goto L_0x00dd
        L_0x00b1:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00dd
            X.4wE r2 = r14.A09
        L_0x00b7:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r7
            java.lang.Integer r8 = X.AnonymousClass006.A0N
            r13 = 0
            r12 = 30
            r10 = r9
            r11 = r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x00b7
            goto L_0x00dd
        L_0x00d0:
            X.AnonymousClass0OU.A00(r1)
            java.lang.String r3 = r14.A01
            if (r3 == 0) goto L_0x00dd
            boolean r0 = r14.A02
            if (r0 == 0) goto L_0x00e0
            if (r16 != 0) goto L_0x00e0
        L_0x00dd:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x00e0:
            r14.A02 = r4
            r14.A00 = r9
            X.4wE r2 = r14.A09
        L_0x00e6:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r7
            java.lang.Integer r8 = X.AnonymousClass006.A0C
            r13 = 0
            r12 = 30
            r10 = r9
            r11 = r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r14.A00
            r5.A01 = r14
            r5.A00 = r4
            java.lang.Object r1 = A00(r14, r3, r0, r5)
            if (r1 != r6) goto L_0x0028
            return r6
        L_0x010b:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r5.<init>(r14, r15, r3)
            goto L_0x0015
        L_0x0112:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.profile.data.ProfileFeedDataSource.A01(com.instagram.barcelona.profile.data.ProfileFeedDataSource, X.8n9, boolean):java.lang.Object");
    }

    public /* synthetic */ ProfileFeedDataSource(C968566y r3, UserSession userSession, String str) {
        C105536da r1 = new C105536da(userSession);
        C04220Ms.A0B(r3, 3);
        this.A07 = userSession;
        this.A01 = str;
        this.A04 = r3;
        this.A03 = r1;
        C27457Enn A0z = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A08 = A0z;
        this.A0A = C18230wP.A0x((C148838sG) null, A0z);
        C27457Enn A0z2 = C18190wL.A0z(new KtCSuperShape0S0410000_I2());
        this.A09 = A0z2;
        this.A0B = C18230wP.A0x((C148838sG) null, A0z2);
    }

    public static final Object A00(ProfileFeedDataSource profileFeedDataSource, String str, String str2, C146958n9 r8) {
        String str3;
        int ordinal = profileFeedDataSource.A04.ordinal();
        UserSession userSession = profileFeedDataSource.A03.A00;
        if (ordinal != 0) {
            str3 = "text_feed/{user_id}/profile/replies/";
        } else {
            str3 = "text_feed/{user_id}/profile/";
        }
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J(str3);
        A0P.A0O("user_id", str);
        A0P.A0P("max_id", str2);
        A0P.A0B(AnonymousClass5t2.class, C117506yn.class);
        return C63623hv.A00(C86134wK.A0W(A0P, str3), r8, 520496124, 0);
    }

    public final Object A02(C146958n9 r3) {
        Object A0k;
        String str = this.A01;
        UserSession userSession = this.A07;
        if (!C18250wR.A1J(userSession, str) || (A0k = C86144wL.A0k(this, r3, AnonymousClass7E6.A00(userSession).A02(E6C.class), 52)) != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A0k;
    }
}
