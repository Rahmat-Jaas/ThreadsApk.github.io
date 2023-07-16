package X;

import android.app.Application;

/* renamed from: X.0gA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0gA implements C04560Oe {
    public final /* synthetic */ Application A00;

    public /* synthetic */ AnonymousClass0gA(Application application) {
        this.A00 = application;
    }

    public final Object get() {
        return this.A00.getSharedPreferences("acra_criticaldata_store", 0).getString("CLIENT_USER_ID", "");
    }
}
