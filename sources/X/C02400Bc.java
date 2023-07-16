package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Bc  reason: invalid class name and case insensitive filesystem */
public final class C02400Bc implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C02410Bd A02;

    public C02400Bc(Context context, Intent intent, C02410Bd r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = intent;
    }

    public final void run() {
        C02410Bd.A00(this.A00, this.A01, this.A02);
    }
}
