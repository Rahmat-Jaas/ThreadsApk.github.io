package X;

import android.content.Intent;

/* renamed from: X.05Z  reason: invalid class name */
public final class AnonymousClass05Z implements AnonymousClass01E {
    public final int A00;
    public final Intent A01;
    public final /* synthetic */ AnonymousClass01G A02;

    public AnonymousClass05Z(Intent intent, AnonymousClass01G r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }

    public final void ADk() {
        this.A02.stopSelf(this.A00);
    }

    public final Intent getIntent() {
        return this.A01;
    }
}
