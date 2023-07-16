package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3No  reason: invalid class name and case insensitive filesystem */
public final class C60083No {
    public static boolean A01(Context context, UserSession userSession, User user, boolean z) {
        if (user != null) {
            return (user.Apo() || C59623Lo.A01(user)) && C67353zP.A00(context, userSession, user, false, z) > 0 && user.A30();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r2 == X.C23894D0g.FollowStatusRequested) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C85944w1 r3, com.instagram.user.follow.FollowButton r4, com.instagram.user.model.User r5, java.lang.String r6) {
        /*
            X.D0g r2 = r5.Aj4()
            X.D0g r1 = X.C23894D0g.FollowStatusFollowing
            if (r2 != r1) goto L_0x002b
            boolean r0 = r5.A3F()
            r1 = 2131100092(0x7f0601bc, float:1.7812556E38)
            if (r0 == 0) goto L_0x0014
            r1 = 2131100047(0x7f06018f, float:1.7812464E38)
        L_0x0014:
            r4.setCustomForegroundColor(r1)
            X.DvL r2 = r4.A03
            r1 = 12
            com.facebook.redex.IDxCListenerShape8S1200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape8S1200000_1_I2
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r6, (int) r1)
            r2.A00 = r0
            r1 = 5
            com.facebook.redex.IDxCListenerShape447S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape447S0100000_1_I2
            r0.<init>(r3, r1)
            r2.A01 = r0
            return
        L_0x002b:
            X.D0g r0 = X.C23894D0g.FollowStatusNotFollowing
            if (r2 != r0) goto L_0x0033
            r1 = 2131099851(0x7f0600cb, float:1.7812067E38)
            goto L_0x0014
        L_0x0033:
            if (r2 == r1) goto L_0x003a
            X.D0g r0 = X.C23894D0g.FollowStatusRequested
            r1 = -1
            if (r2 != r0) goto L_0x0014
        L_0x003a:
            r1 = 2131100092(0x7f0601bc, float:1.7812556E38)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60083No.A00(X.4w1, com.instagram.user.follow.FollowButton, com.instagram.user.model.User, java.lang.String):void");
    }
}
