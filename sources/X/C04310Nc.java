package X;

import android.content.ComponentName;
import android.content.Context;
import com.facebook.analytics2.logger.GooglePlayUploadService;

/* renamed from: X.0Nc  reason: invalid class name and case insensitive filesystem */
public final class C04310Nc extends AnonymousClass0CD {
    public final ComponentName A00;
    public final Context A01;

    public final long A01(int i) {
        return Long.MAX_VALUE;
    }

    public final void A02(C02570By r9, String str, int i, long j, long j2) {
        GooglePlayUploadService.A02(this.A01, r9, str, i, j, j2);
    }

    public C04310Nc(Context context) {
        this.A01 = context;
        this.A00 = new ComponentName(context, GooglePlayUploadService.class);
    }
}
