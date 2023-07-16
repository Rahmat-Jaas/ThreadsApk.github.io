package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Lk  reason: invalid class name and case insensitive filesystem */
public final class C34922Lk {
    public static C32165H8c A00(UserSession userSession, Integer num) {
        GXN gxn = new GXN();
        String l = Long.toString(C19591Ayr.A00().longValue());
        gxn.A05("timezone_offset", l);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("creatives/create_mode/");
        A0N.A0O("timezone_offset", l);
        A0N.A0B(AnonymousClass1S6.class, C59563Lh.class);
        A0N.A0I(gxn.A01("creatives/create_mode/"));
        A0N.A0E(num);
        if (num == AnonymousClass006.A0C) {
            A0N.A07(604800000);
        }
        return C18190wL.A0Q(A0N);
    }
}
