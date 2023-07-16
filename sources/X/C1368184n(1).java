package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.84n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1368184n implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ AnonymousClass7J7 A04;
    public final /* synthetic */ C143478go A05;
    public final /* synthetic */ Object A06;

    public /* synthetic */ C1368184n(Context context, AnonymousClass7J7 r2, C143478go r3, Object obj, int i, int i2, int i3) {
        this.A03 = context;
        this.A05 = r3;
        this.A06 = obj;
        this.A04 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final Object call() {
        return AnonymousClass7J7.A01(this.A03, this.A04, this.A05, this.A06, this.A00, this.A01, this.A02);
    }
}
