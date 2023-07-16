package X;

import android.content.SharedPreferences;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.ExampleContext;
import java.util.List;

/* renamed from: X.7eC  reason: invalid class name and case insensitive filesystem */
public final class C125867eC implements C145198k2 {
    public final C03700Kj A00;
    public final C121547Gq A01;
    public final C1200878l A02;

    public final String BIu() {
        return "cache";
    }

    public final AnonymousClass5Id CX5(C145188k1 r8, List list) {
        C1200878l r4 = this.A02;
        SharedPreferences sharedPreferences = r4.A00;
        float f = sharedPreferences.getFloat(C1200878l.A00(r4, "prediction_score"), Float.MAX_VALUE);
        if (C86124wJ.A01(Float.MAX_VALUE, f) < 1.0E-4f) {
            return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, "cache_miss", false);
        }
        long j = -1;
        long j2 = sharedPreferences.getLong(C1200878l.A00(r4, "last_prediction_time"), -1);
        if (j2 != -1) {
            j = C18240wQ.A09(j2);
        }
        C121547Gq r3 = this.A01;
        C121547Gq.A01(AnonymousClass68S.PREDICT_AND_TRAIN, C86134wK.A0N("cache_age", String.valueOf(j), 4, 0), r3);
        return AnonymousClass5Id.A01(C18180wK.A0n(C18180wK.A0p(new Example(ExampleContext.A05, HTTP.IDENTITY_CODING, AnonymousClass0wJ.A0y()), Double.valueOf((double) f))), (String) null, true);
    }

    public C125867eC(C03700Kj r2, C121547Gq r3, C1200878l r4) {
        AnonymousClass0wJ.A1O(r4, r3);
        C04220Ms.A0B(r2, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
