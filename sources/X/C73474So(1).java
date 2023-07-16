package X;

import android.content.Context;

/* renamed from: X.4So  reason: invalid class name and case insensitive filesystem */
public final class C73474So implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C39777Kzl A01;
    public final /* synthetic */ C63733iD A02;
    public final /* synthetic */ Integer A03;

    public C73474So(Context context, C39777Kzl kzl, C63733iD r3, Integer num) {
        this.A02 = r3;
        this.A00 = context;
        this.A03 = num;
        this.A01 = kzl;
    }

    public final void run() {
        C38040KHr kHr = C38040KHr.A01;
        C63733iD r2 = this.A02;
        r2.A0I = true;
        r2.A0D = AnonymousClass0wJ.A0k(this.A00, this.A03.intValue());
        r2.A07 = this.A01;
        C63733iD.A09(kHr, r2);
    }
}
