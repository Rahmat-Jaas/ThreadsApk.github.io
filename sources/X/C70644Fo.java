package X;

import android.content.Context;

/* renamed from: X.4Fo  reason: invalid class name and case insensitive filesystem */
public final class C70644Fo implements C82884qQ {
    public Context A00;

    public final boolean CW4(C58743Gz r4) {
        Context context = this.A00;
        if (context.getSharedPreferences(context.getPackageName(), 0).getInt("APPIRATER_USE_COUNT", 0) <= 1) {
            return false;
        }
        return true;
    }

    public C70644Fo(Context context) {
        this.A00 = context;
    }
}
