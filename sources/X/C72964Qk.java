package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Qk  reason: invalid class name and case insensitive filesystem */
public final class C72964Qk implements Runnable {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ List A01;

    public C72964Qk(C10300i6 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C10300i6 r7 = this.A00;
        List list = this.A01;
        AnonymousClass01V r1 = C62623aQ.A00;
        if (r1 != null) {
            r1.markerPoint(896612552, "add_active_fb_account_start");
            try {
                List A012 = C62623aQ.A01(r7, C311624m.FACEBOOK, AnonymousClass24G.ACTIVE_ACCOUNT);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Iterator it = A012.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i = C63203gz.A00("facebook_active_session", A0v, it, list, i);
                }
                if (i == 0) {
                    C62893b5.A01(r7, "facebook_active_session");
                } else {
                    C62893b5.A04(r7, "facebook_active_session", A0v);
                }
            } catch (SecurityException e) {
                AnonymousClass0LU.A0J("CaaFetchClientDataHelper", "Failed to fetch active Facebook accounts", e);
                C62893b5.A03(r7, "facebook_active_session", "security_exception");
            } catch (Exception unused) {
                C62893b5.A03(r7, "facebook_active_session", "other_exception");
            } catch (Throwable th) {
                AnonymousClass01V r0 = C62623aQ.A00;
                if (r0 != null) {
                    r0.markerPoint(896612552, "add_active_fb_account_end");
                    throw th;
                }
            }
            AnonymousClass01V r02 = C62623aQ.A00;
            if (r02 != null) {
                r02.markerPoint(896612552, "add_active_fb_account_end");
                return;
            }
        }
        C04220Ms.A0E("qplLogger");
        throw null;
    }
}
