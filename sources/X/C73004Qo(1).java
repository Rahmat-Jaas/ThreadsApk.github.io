package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Qo  reason: invalid class name and case insensitive filesystem */
public final class C73004Qo implements Runnable {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ List A01;

    public C73004Qo(C10300i6 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C10300i6 r6 = this.A00;
        List list = this.A01;
        AnonymousClass01V r1 = C62623aQ.A00;
        if (r1 != null) {
            r1.markerPoint(896612552, "add_saved_ig_accounts_start");
            try {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Context A08 = C18230wP.A08();
                String str = C62623aQ.A01;
                if (str == null) {
                    str = "ig_android_access_library_caa_aymh_fetch_ig_local_auth";
                }
                Iterator it = C63693i8.A07(A08, r6, str, C307822y.A04).iterator();
                int i = 0;
                while (it.hasNext()) {
                    i = C63203gz.A00("local_auth", A0v, it, list, i);
                }
                if (i == 0) {
                    C62893b5.A01(r6, "local_auth");
                } else {
                    C62893b5.A04(r6, "local_auth", A0v);
                }
            } catch (SecurityException e) {
                AnonymousClass0LU.A0J("CaaFetchClientDataHelper", "Failed to fetch saved Instagram accounts", e);
                C62893b5.A03(r6, "local_auth", "security_exception");
            } catch (Exception unused) {
                C62893b5.A03(r6, "local_auth", "other_exception");
            } catch (Throwable th) {
                AnonymousClass01V r0 = C62623aQ.A00;
                if (r0 != null) {
                    r0.markerPoint(896612552, "add_saved_ig_accounts_end");
                    throw th;
                }
            }
            AnonymousClass01V r02 = C62623aQ.A00;
            if (r02 != null) {
                r02.markerPoint(896612552, "add_saved_ig_accounts_end");
                return;
            }
        }
        C04220Ms.A0E("qplLogger");
        throw null;
    }
}
