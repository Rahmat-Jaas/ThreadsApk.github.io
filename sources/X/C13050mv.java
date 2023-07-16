package X;

import android.content.Context;

/* renamed from: X.0mv  reason: invalid class name and case insensitive filesystem */
public final class C13050mv implements C03650Kd {
    public final Context A00;

    public final String AQd() {
        return C05340Su.A00(this.A00, AnonymousClass006.A07).getString("analytics_endpoint", (String) null);
    }

    public final String AwU() {
        return C05340Su.A00(this.A00, AnonymousClass006.A07).getString("host_name_ipv6", (String) null);
    }

    public C13050mv(Context context) {
        this.A00 = context;
    }
}
