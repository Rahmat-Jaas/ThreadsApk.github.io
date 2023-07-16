package X;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* renamed from: X.5lH  reason: invalid class name and case insensitive filesystem */
public final class C93265lH extends C129167lR implements C148628ra {
    public static final C93175l8 A00;
    public static final C99286Iv A01;
    public static final C108946jD A02;

    public final AnonymousClass7HU Bb9(TelemetryData telemetryData) {
        AnonymousClass783 r2 = new AnonymousClass783((C97766Cr) null);
        r2.A03 = new Feature[]{C103446Zf.A00};
        r2.A02 = false;
        r2.A01 = new C129247lZ(telemetryData);
        return C129167lR.A01(this, r2.A00(), 2);
    }

    static {
        C99286Iv r3 = new C99286Iv();
        A01 = r3;
        C93105l1 r2 = new C93105l1();
        A00 = r2;
        A02 = new C108946jD(r2, r3, "ClientTelemetry.API");
    }

    public C93265lH(Context context, C129087lG r8) {
        super((Activity) null, context, r8, A02, C1195075p.A02);
    }
}
