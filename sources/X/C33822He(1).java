package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.2He  reason: invalid class name and case insensitive filesystem */
public final class C33822He {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        Context context;
        boolean A1Y = AnonymousClass0wJ.A1Y(r7, r6);
        boolean z = false;
        String A0q = C18190wL.A0q(r7.A00, A1Y ? 1 : 0);
        C10300i6 A0F = C63913ic.A0F(r6);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        AnonymousClass3HX r0 = r6.A00;
        if (r0 != null) {
            context = r0.A00;
        } else {
            context = null;
        }
        String A05 = C63853iS.A05(context, userSession, A0q);
        if (context == null) {
            return Boolean.valueOf(A1Y);
        }
        Boolean A01 = AnonymousClass3Zd.A01(context, A05, A1Y);
        if (A05 == null || A05.length() == 0 || A01 == null || A01.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
