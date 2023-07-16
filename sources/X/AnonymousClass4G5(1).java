package X;

import android.content.Context;

/* renamed from: X.4G5  reason: invalid class name */
public final class AnonymousClass4G5 implements C82884qQ {
    public Context A00;

    public final boolean CW4(C58743Gz r4) {
        Context context = this.A00;
        return !context.getSharedPreferences(context.getPackageName(), 0).getBoolean("APPIRATER_DECLINED_TO_RATE", false);
    }

    public AnonymousClass4G5(Context context) {
        this.A00 = context;
    }
}
