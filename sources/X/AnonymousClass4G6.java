package X;

import android.content.Context;

/* renamed from: X.4G6  reason: invalid class name */
public final class AnonymousClass4G6 implements C82884qQ {
    public Context A00;

    public final boolean CW4(C58743Gz r4) {
        Context context = this.A00;
        return !context.getSharedPreferences(context.getPackageName(), 0).getBoolean("APPIRATER_RATED_CURRENT_VERSION", false);
    }

    public AnonymousClass4G6(Context context) {
        this.A00 = context;
    }
}
