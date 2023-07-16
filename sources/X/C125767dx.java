package X;

import android.content.SharedPreferences;
import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.7dx  reason: invalid class name and case insensitive filesystem */
public final class C125767dx implements C145188k1 {
    public final SharedPreferences A00;
    public final C03700Kj A01;

    public C125767dx(SharedPreferences sharedPreferences, C03700Kj r3) {
        C04220Ms.A0B(r3, 2);
        this.A00 = sharedPreferences;
        this.A01 = r3;
    }

    public final String getId() {
        return "TimeSinceAppForegroundBackground";
    }

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.A00;
        long j = sharedPreferences.getLong("last_app_foreground_timestamp", -1);
        if (j != -1) {
            A0v.add(new FeatureData(Type.LONG, "3614", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, (currentTimeMillis - j) / 1000, false));
        }
        long j2 = sharedPreferences.getLong("last_app_background_timestamp", -1);
        if (j2 != -1) {
            A0v.add(new FeatureData(Type.LONG, "3613", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, (currentTimeMillis - j2) / 1000, false));
        }
        if (A0v.isEmpty()) {
            return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, "no time since foreground background signals available", false);
        }
        return AnonymousClass5Id.A00(A0v);
    }
}
