package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.84o  reason: invalid class name and case insensitive filesystem */
public final class C1368284o implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C143468gn A04;
    public final /* synthetic */ AnonymousClass7J7 A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ Object A07;

    public C1368284o(Context context, C143468gn r2, AnonymousClass7J7 r3, Object obj, Object obj2, int i, int i2, int i3) {
        this.A04 = r2;
        this.A02 = i;
        this.A00 = i2;
        this.A05 = r3;
        this.A07 = obj;
        this.A06 = obj2;
        this.A03 = context;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C143468gn r7 = this.A04;
        int i = this.A02;
        int i2 = this.A00;
        AnonymousClass7J7 r4 = this.A05;
        if (AnonymousClass7J7.A04(r7, r4, i, i2)) {
            r4.getClass();
            return new AnonymousClass7J7(r4.A00, r7, r4.A02, this.A07);
        }
        return AnonymousClass7J7.A03(AnonymousClass7J7.A00(this.A03, r4, this.A06, (M4z[]) null, this.A01), r7, this.A07, i, i2);
    }
}
