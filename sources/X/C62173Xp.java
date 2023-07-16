package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.3Xp  reason: invalid class name and case insensitive filesystem */
public final class C62173Xp {
    public static final C696049g A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (C696049g) userSession.A01(C696049g.class, new KtLambdaShape116S0100000_I2_96(userSession, 21));
    }

    public final boolean A02(UserSession userSession, boolean z) {
        C04220Ms.A0B(userSession, 0);
        if (z) {
            C696049g A00 = A00(userSession);
            C696049g.A00(A00);
            if (A00.A01.isEmpty() || !A01(userSession)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (X.AnonymousClass0hA.A08(X.C59123Jp.A01(r1)) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.service.session.UserSession r5) {
        /*
            com.instagram.user.model.User r4 = X.C04660Oo.A00(r5)
            X.4sQ r1 = X.C67303zK.A00(r5, r4)
            boolean r0 = X.C60343Oq.A01(r5)
            r3 = 1
            if (r0 == 0) goto L_0x003e
            X.1z6 r2 = X.C35692Ol.A00(r5)
            com.facebook.common.callercontext.CallerContext r1 = X.C696049g.A05
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_crossposting_destination_picker"
            boolean r2 = r2.A05(r1, r0)
        L_0x001b:
            if (r4 == 0) goto L_0x004d
            X.266 r1 = r4.A0g()
            X.266 r0 = X.AnonymousClass266.A06
            if (r1 == r0) goto L_0x002d
            X.266 r1 = r4.A0g()
            X.266 r0 = X.AnonymousClass266.A05
            if (r1 != r0) goto L_0x004d
        L_0x002d:
            if (r2 == 0) goto L_0x004d
            X.49e r0 = X.C60333Op.A00(r5)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x003d
            boolean r0 = X.C62953bC.A04(r5)
            if (r0 == 0) goto L_0x004d
        L_0x003d:
            return r3
        L_0x003e:
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = X.C59123Jp.A01(r1)
            boolean r0 = X.AnonymousClass0hA.A08(r0)
            r2 = 1
            if (r0 == 0) goto L_0x001b
        L_0x004b:
            r2 = 0
            goto L_0x001b
        L_0x004d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62173Xp.A01(com.instagram.service.session.UserSession):boolean");
    }
}
