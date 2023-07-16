package com.instagram.barcelona.feed.post.data;

import X.AnonymousClass2TZ;
import X.BKN;
import X.BKU;
import X.C113136qo;
import X.C11630kW;
import X.C134647y7;
import X.C15680ri;
import X.C18250wR;
import X.C19401Avj;
import X.C19582Ayi;
import X.C20066BMj;
import X.C86114wI;
import X.C90555Ml;
import com.instagram.service.session.UserSession;

public final class PostRepository extends C134647y7 {
    public final UserSession A00;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.barcelona.feed.post.data.PostRepository r8, java.lang.String r9, X.C146958n9 r10, boolean r11) {
        /*
            r3 = 26
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r10)
            if (r0 == 0) goto L_0x0084
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004c
            if (r0 != r7) goto L_0x00bf
            java.lang.Object r9 = r5.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.A01
            com.instagram.barcelona.feed.post.data.PostRepository r8 = (com.instagram.barcelona.feed.post.data.PostRepository) r8
            X.AnonymousClass0OU.A00(r1)
        L_0x002d:
            r6 = r1
            X.3b6 r6 = (X.C62903b6) r6
            boolean r0 = r6 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x004b
            com.instagram.service.session.UserSession r7 = r8.A00
            X.BKU r5 = X.C86114wI.A0W(r7, r9)
            if (r5 != 0) goto L_0x008a
            java.lang.String r0 = "Could not find media with this ID"
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r0)
            X.1j8 r0 = new X.1j8
            r0.<init>(r1)
            X.1jB r6 = X.C86164wN.A0R(r0)
        L_0x004b:
            return r6
        L_0x004c:
            X.AnonymousClass0OU.A00(r1)
            if (r11 == 0) goto L_0x0081
            java.lang.String r1 = "text_feed/{post_id}/hush/"
        L_0x0053:
            com.instagram.service.session.UserSession r0 = r8.A00
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            r2.A0J(r1)
            java.lang.String r0 = "[_@]"
            java.lang.String[] r0 = r9.split(r0)
            r1 = r0[r3]
            java.lang.String r0 = "post_id"
            r2.A0O(r0, r1)
            java.lang.Class<X.5sx> r1 = X.C93965sx.class
            java.lang.Class<X.6yQ> r0 = X.C117276yQ.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 14
            X.C86124wJ.A1S(r8, r9, r5, r7)
            r0 = 104842234(0x63fc3fa, float:3.6067088E-35)
            java.lang.Object r1 = X.C63623hv.A01(r2, r5, r0, r3, r1)
            if (r1 != r6) goto L_0x002d
            return r6
        L_0x0081:
            java.lang.String r1 = "text_feed/{post_id}/unhush/"
            goto L_0x0053
        L_0x0084:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x008a:
            X.BKN r3 = r5.A0f
            X.5Ml r0 = r3.A1J
            if (r0 == 0) goto L_0x00a4
            X.6qo r2 = new X.6qo
            r2.<init>(r0)
        L_0x0095:
            r0 = r6
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
            X.5sx r0 = (X.C93965sx) r0
            X.6h1 r1 = r0.A01
            if (r1 != 0) goto L_0x00a6
            X.C18250wR.A0m()
            throw r4
        L_0x00a4:
            r2 = r4
            goto L_0x0095
        L_0x00a6:
            if (r2 == 0) goto L_0x00b8
            X.5Kk r0 = r1.A00
            r2.A00 = r0
            boolean r0 = r1.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A06 = r0
            X.5Ml r4 = r2.A00()
        L_0x00b8:
            r3.A07(r4)
            r5.AAy(r7)
            return r6
        L_0x00bf:
            java.lang.IllegalStateException r4 = X.AnonymousClass0wJ.A0a()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.post.data.PostRepository.A00(com.instagram.barcelona.feed.post.data.PostRepository, java.lang.String, X.8n9, boolean):java.lang.Object");
    }

    public static final void A01(PostRepository postRepository, C11630kW r11, String str, boolean z) {
        UserSession userSession = postRepository.A00;
        BKU A0W = C86114wI.A0W(userSession, str);
        if (A0W != null) {
            C19401Avj A002 = C19401Avj.A00(userSession);
            C11630kW r2 = r11;
            if (z) {
                A002.A03(A0W, true);
                C19582Ayi.A04(r2, (C15680ri) null, A0W, (C20066BMj) null, userSession, "sfplt_in_menu", (String) null, (String) null, (String) null, -1, false);
            } else {
                A002.A03(A0W, false);
                C19582Ayi.A03(r2, (C15680ri) null, A0W, (C20066BMj) null, userSession, "sfplt_in_menu", (String) null, (String) null, (String) null, -1, false);
            }
            BKN bkn = A0W.A0f;
            C90555Ml r22 = bkn.A1J;
            C90555Ml r0 = null;
            if (r22 != null) {
                C113136qo r1 = new C113136qo(r22);
                r1.A06 = Boolean.valueOf(z);
                r0 = r1.A00();
            }
            bkn.A07(r0);
            A0W.AAy(userSession);
            return;
        }
        throw C18250wR.A0V("Could not find media with this ID");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r11, X.C146958n9 r12) {
        /*
            r10 = this;
            r3 = 25
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r12)
            if (r0 == 0) goto L_0x00b7
            r6 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b7
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A03
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r5 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 != r8) goto L_0x00be
            java.lang.Object r4 = r6.A02
            X.BKU r4 = (X.BKU) r4
            java.lang.Object r1 = r6.A01
            com.instagram.barcelona.feed.post.data.PostRepository r1 = (com.instagram.barcelona.feed.post.data.PostRepository) r1
            X.AnonymousClass0OU.A00(r2)
        L_0x002d:
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0051
            boolean r0 = r4.A4J()
            if (r0 == 0) goto L_0x0038
            r5 = 3
        L_0x0038:
            r4.A04 = r5
            com.instagram.service.session.UserSession r1 = r1.A00
            r4.AAy(r1)
            boolean r0 = r4.A4B()
            if (r0 != 0) goto L_0x0051
            com.instagram.user.model.User r0 = r4.A2Z(r1)
            if (r0 == 0) goto L_0x0051
            r0.A1Z()
            r0.A1t(r1)
        L_0x0051:
            return r2
        L_0x0052:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.service.session.UserSession r0 = r10.A00
            X.BKU r4 = X.C86114wI.A0W(r0, r11)
            if (r4 != 0) goto L_0x006d
            java.lang.String r0 = "Could not find media with this ID in the media cache."
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r0)
            X.1j8 r0 = new X.1j8
            r0.<init>(r1)
            X.1jB r7 = X.C86164wN.A0R(r0)
        L_0x006c:
            return r7
        L_0x006d:
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            X.BKN r9 = r4.A0f
            java.lang.String r1 = r9.A4Y
            X.Ffc r0 = r4.Aup()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            r0 = 91
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
            X.C04220Ms.A06(r0)
            r2.A0J(r0)
            java.lang.String r1 = r9.A4Y
            java.lang.String r0 = "media_id"
            r2.A0O(r0, r1)
            boolean r1 = r4.A4J()
            java.lang.String r0 = "igtv_feed_preview"
            r2.A0R(r0, r1)
            java.lang.Class<X.9KX> r1 = X.AnonymousClass9KX.class
            java.lang.Class<X.Ahd> r0 = X.C18563Ahd.class
            X.H8c r2 = X.C18180wK.A0T(r2, r1, r0)
            r1 = 14
            X.C86124wJ.A1S(r10, r4, r6, r8)
            r0 = 1735716831(0x6774efdf, float:1.15668226E24)
            java.lang.Object r2 = X.C63623hv.A01(r2, r6, r0, r3, r1)
            if (r2 == r7) goto L_0x006c
            r1 = r10
            goto L_0x002d
        L_0x00b7:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r6.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.post.data.PostRepository.A02(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r14, X.C146958n9 r15) {
        /*
            r13 = this;
            r3 = 27
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r15)
            if (r0 == 0) goto L_0x00c4
            r6 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c4
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A03
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L_0x007e
            if (r0 != r5) goto L_0x00d5
            java.lang.Object r4 = r6.A02
            X.BKU r4 = (X.BKU) r4
            java.lang.Object r5 = r6.A01
            com.instagram.barcelona.feed.post.data.PostRepository r5 = (com.instagram.barcelona.feed.post.data.PostRepository) r5
            X.AnonymousClass0OU.A00(r2)
        L_0x002c:
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x007d
            X.BKN r3 = r4.A0f
            X.5Ml r0 = r3.A1J
            r6 = 0
            if (r0 == 0) goto L_0x0062
            X.5Mj r0 = r0.A03
            if (r0 == 0) goto L_0x0062
            boolean r10 = r0.AVg()
            boolean r11 = r0.AVk()
            r0.BXt()
            X.BKU r8 = r0.B5g()
            com.instagram.api.schemas.RepostRestrictedReason r7 = r0.B7L()
            X.BKU r9 = r0.B7M()
            X.420 r1 = new X.420
            r1.<init>()
            X.6p7 r0 = new X.6p7
            r0.<init>(r1)
            r12 = 0
            X.5Mj r6 = new X.5Mj
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0062:
            java.lang.String r0 = "Required value was null."
            if (r6 == 0) goto L_0x00d0
            X.5Ml r1 = r3.A1J
            if (r1 == 0) goto L_0x00cb
            X.6qo r0 = new X.6qo
            r0.<init>(r1)
            r0.A03 = r6
            X.5Ml r0 = r0.A00()
            r3.A07(r0)
            com.instagram.service.session.UserSession r0 = r5.A00
            r4.AAy(r0)
        L_0x007d:
            return r2
        L_0x007e:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.service.session.UserSession r0 = r13.A00
            X.BKU r4 = X.C86114wI.A0W(r0, r14)
            if (r4 != 0) goto L_0x0099
            java.lang.String r0 = "Could not find media with this ID in the media cache."
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r0)
            X.1j8 r0 = new X.1j8
            r0.<init>(r1)
            X.1jB r7 = X.C86164wN.A0R(r0)
        L_0x0098:
            return r7
        L_0x0099:
            java.lang.String r2 = r4.A33()
            X.C04220Ms.A06(r2)
            r3 = 0
            X.C04220Ms.A0B(r0, r3)
            X.H1T r1 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "repost/delete_text_app_repost/"
            r1.A0J(r0)
            java.lang.String r0 = "original_media_id"
            X.H8c r2 = X.C86104wH.A0T(r1, r0, r2)
            r1 = 14
            X.C86124wJ.A1S(r13, r4, r6, r5)
            r0 = 28600320(0x1b46800, float:6.627079E-38)
            java.lang.Object r2 = X.C63623hv.A01(r2, r6, r0, r3, r1)
            if (r2 == r7) goto L_0x0098
            r5 = r13
            goto L_0x002c
        L_0x00c4:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r6.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x00cb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00d0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.post.data.PostRepository.A03(java.lang.String, X.8n9):java.lang.Object");
    }

    public PostRepository(UserSession userSession) {
        super("Barcelona_post", AnonymousClass2TZ.A00(1682293663));
        this.A00 = userSession;
    }
}
