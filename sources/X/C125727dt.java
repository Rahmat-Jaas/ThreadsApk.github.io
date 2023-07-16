package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.7dt  reason: invalid class name and case insensitive filesystem */
public final class C125727dt implements C145188k1 {
    public final C1200878l A00;

    public C125727dt(C1200878l r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        long now;
        if (C04220Ms.A0I(C25756DrT.A02, "COLD")) {
            now = AwakeTimeSinceBootClock.INSTANCE.now() - C25756DrT.A07;
        } else {
            C1200878l r2 = this.A00;
            long j = r2.A00.getLong(C1200878l.A00(r2, "last_cold_start_key"), -1);
            if (j != -1) {
                now = AwakeTimeSinceBootClock.INSTANCE.now() - j;
            }
            return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, "no record of previous cold start", false);
        }
        if (now != -1) {
            return AnonymousClass5Id.A01(C18180wK.A0n(new FeatureData(Type.LONG, "3615", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, now, false)), (String) null, true);
        }
        return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, "no record of previous cold start", false);
    }

    public final String getId() {
        return "TimeSpentSinceColdStart";
    }
}
