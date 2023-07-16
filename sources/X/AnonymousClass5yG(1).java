package X;

import android.content.Context;

/* renamed from: X.5yG  reason: invalid class name */
public final class AnonymousClass5yG extends C34727Idy {
    public final AnonymousClass5yV A00;
    public final AnonymousClass436 A01;
    public final C157519Sn A02;

    public AnonymousClass5yG(Context context, boolean z, boolean z2, boolean z3) {
        AnonymousClass436 r4;
        if (z3) {
            r4 = new AnonymousClass5yK();
        } else {
            r4 = new AnonymousClass5yP(context);
        }
        this.A01 = r4;
        C157519Sn r3 = new C157519Sn(context);
        this.A02 = r3;
        AnonymousClass5yV r2 = new AnonymousClass5yV();
        r2.A03 = C86124wJ.A09(context);
        this.A00 = r2;
        init(r4, r3, r2);
        if (z2) {
            addModel((Object) null, r4);
        }
        addModel((Object) null, r2);
        addModel((Object) null, new AnonymousClass9Y8(z), r3);
    }
}
