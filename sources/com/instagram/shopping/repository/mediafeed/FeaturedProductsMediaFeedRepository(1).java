package com.instagram.shopping.repository.mediafeed;

import X.AnonymousClass0ZV;
import X.BKU;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C19462Awj;
import X.C21648Bxt;
import X.C27457Enn;
import X.C37415JrZ;
import X.C84714tk;
import X.C86074wE;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class FeaturedProductsMediaFeedRepository implements C21648Bxt {
    public final UserSession A00;
    public final String A01;
    public final C84714tk A02;
    public final C86074wE A03;

    public FeaturedProductsMediaFeedRepository(UserSession userSession, String str, String str2, boolean z) {
        List list;
        this.A00 = userSession;
        this.A01 = str;
        if (z) {
            BKU A05 = C19462Awj.A01(userSession).A05(str2 != null ? str2 : str);
            if (A05 != null) {
                list = C18180wK.A0n(C37415JrZ.A02(A05));
                C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0120000_I2(list, 7, true, false));
                this.A03 = A0z;
                this.A02 = C18230wP.A0x((C148838sG) null, A0z);
            }
        }
        list = AnonymousClass0ZV.A00;
        C27457Enn A0z2 = C18190wL.A0z(new KtCSuperShape0S0120000_I2(list, 7, true, false));
        this.A03 = A0z2;
        this.A02 = C18230wP.A0x((C148838sG) null, A0z2);
    }

    public final C84714tk AcA() {
        return this.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Bap(X.C146958n9 r7) {
        /*
            r6 = this;
            r3 = 13
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r3, r7)
            if (r0 == 0) goto L_0x0072
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r3) goto L_0x0082
            java.lang.Object r1 = r5.A01
            com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository r1 = (com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository) r1
            X.AnonymousClass0OU.A00(r2)
        L_0x0028:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0054
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r0 = r2.A00
            X.1Sm r0 = (X.C21871Sm) r0
            X.4wE r5 = r1.A03
            java.lang.Object r1 = r5.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2) r1
            X.397 r0 = r0.A00
            if (r0 == 0) goto L_0x007b
            java.util.List r4 = r0.A00
            if (r4 == 0) goto L_0x0078
            boolean r3 = r0.A01
            boolean r2 = r1.A02
            r1 = 7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2
            r0.<init>((java.util.List) r4, (int) r1, (boolean) r3, (boolean) r2)
            r5.CrC(r0)
        L_0x0051:
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x0053:
            return r4
        L_0x0054:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0051
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x005d:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.shopping.repository.featuredproducts.FeaturedProductsMediaApi r2 = com.instagram.shopping.repository.featuredproducts.FeaturedProductsMediaApi.A00
            com.instagram.service.session.UserSession r1 = r6.A00
            java.lang.String r0 = r6.A01
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r2 = r2.A00(r1, r0, r5)
            if (r2 == r4) goto L_0x0053
            r1 = r6
            goto L_0x0028
        L_0x0072:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x0078:
            java.lang.String r0 = "mediaFeed"
            goto L_0x007d
        L_0x007b:
            java.lang.String r0 = "pivotItems"
        L_0x007d:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository.Bap(X.8n9):java.lang.Object");
    }
}
