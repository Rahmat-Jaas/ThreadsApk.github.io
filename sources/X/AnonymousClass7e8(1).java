package X;

import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7e8  reason: invalid class name */
public final class AnonymousClass7e8 implements C145798l6 {
    public final C1200878l A00;

    public AnonymousClass7e8(C1200878l r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass5Id CfA(String str) {
        C04220Ms.A0B(str, 0);
        C1200878l r2 = this.A00;
        String A0N = AnonymousClass00U.A0N(str, "server_features_last_download_timestamp", '_');
        C04220Ms.A0B(A0N, 0);
        long j = r2.A00.getLong(C1200878l.A00(r2, A0N), -1);
        if (j == -1) {
            return AnonymousClass5Id.A01(-1L, "last download timestamp for server features not found", false);
        }
        return AnonymousClass5Id.A00(Long.valueOf(j));
    }

    public final void CwJ(Example example, String str, long j) {
        C04220Ms.A0B(str, 0);
        C1200878l r4 = this.A00;
        r4.A02(AnonymousClass00U.A0N(str, "server_features_last_download_timestamp", '_'), j);
        Iterator A0u = C18190wL.A0u(example.A02);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            String A0p = C18200wM.A0p(A0o);
            FeatureData featureData = (FeatureData) A0o.getValue();
            Type type = featureData.A02;
            if (type == Type.LONG) {
                r4.A02(A0p, featureData.A01);
            } else if (type == Type.DOUBLE) {
                r4.A01(A0p, (float) featureData.A00);
            }
        }
    }

    public final AnonymousClass5Id CZ5(Long l, String str) {
        return AnonymousClass5Id.A01(Example.A03, "to be implemented", false);
    }
}
