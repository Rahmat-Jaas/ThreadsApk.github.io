package X;

import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: X.0tp  reason: invalid class name */
public enum AnonymousClass0tp {
    A09("host_name_ipv6", 0),
    A07("analytics_endpoint", 1),
    A08("bc_host_name_timestamp", 2),
    A03("fb_uid", 3),
    A05("user_id", 4),
    A04("is_employee", 5),
    A06("year_class", 6),
    A0A("logging_health_stats_sample_rate", 7),
    A0B("log_analytic_events", 8),
    A0C("log_sr", 9);
    
    public final C16840tq A00;
    public final String A01;

    public final void A00(SharedPreferences.Editor editor, Object obj) {
        if (obj == null || this.A00.A00().isInstance(obj)) {
            this.A00.A02(editor, obj, name());
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot cast");
        sb.append(obj.getClass());
        throw new ClassCastException(sb.toString());
    }

    public final void A01(Bundle bundle, Object obj) {
        if (obj == null || this.A00.A00().isInstance(obj)) {
            this.A00.A03(bundle, obj, name());
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot cast");
        sb.append(obj.getClass());
        throw new ClassCastException(sb.toString());
    }

    /* access modifiers changed from: public */
    AnonymousClass0tp(String str, int i) {
        this.A01 = str;
        this.A00 = r1;
    }
}
