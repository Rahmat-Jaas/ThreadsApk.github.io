package X;

import android.app.Application;

/* renamed from: X.0g8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0g8 implements C04560Oe {
    public final /* synthetic */ Application A00;

    public /* synthetic */ AnonymousClass0g8(Application application) {
        this.A00 = application;
    }

    public final Object get() {
        return Boolean.valueOf(this.A00.getSharedPreferences("acra_criticaldata_store", 0).getBoolean("IS_EMPLOYEE", false));
    }
}
