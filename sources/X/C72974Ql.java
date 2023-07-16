package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ql  reason: invalid class name and case insensitive filesystem */
public final class C72974Ql implements Runnable {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ List A01;

    public C72974Ql(C10300i6 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C10300i6 r7 = this.A00;
        List list = this.A01;
        AnonymousClass01V r1 = C62623aQ.A00;
        if (r1 != null) {
            r1.markerPoint(896612552, "add_saved_fb_accounts_start");
            try {
                List A012 = C62623aQ.A01(r7, C311624m.FACEBOOK, AnonymousClass24G.SAVED_ACCOUNTS);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Iterator it = A012.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i = C63203gz.A01("facebook_local_auth", A0v, it, list, i);
                }
                if (i == 0) {
                    C62893b5.A01(r7, "facebook_local_auth");
                } else {
                    C62893b5.A04(r7, "facebook_local_auth", A0v);
                }
            } catch (SecurityException e) {
                AnonymousClass0LU.A0J("CaaFetchClientDataHelper", "Failed to fetch saved Facebook accounts", e);
                C62893b5.A03(r7, "facebook_local_auth", "security_exception");
            } catch (Exception unused) {
                C62893b5.A03(r7, "facebook_local_auth", "other_exception");
            } catch (Throwable th) {
                AnonymousClass01V r0 = C62623aQ.A00;
                if (r0 != null) {
                    r0.markerPoint(896612552, "add_saved_fb_accounts_end");
                    throw th;
                }
            }
            AnonymousClass01V r02 = C62623aQ.A00;
            if (r02 != null) {
                r02.markerPoint(896612552, "add_saved_fb_accounts_end");
                return;
            }
        }
        C04220Ms.A0E("qplLogger");
        throw null;
    }
}
