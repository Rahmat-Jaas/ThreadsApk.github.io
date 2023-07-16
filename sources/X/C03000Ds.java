package X;

import java.io.IOException;

/* renamed from: X.0Ds  reason: invalid class name and case insensitive filesystem */
public final class C03000Ds implements AnonymousClass0CC {
    public final /* synthetic */ AnonymousClass0C1 A00;

    public C03000Ds(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void ByC(IOException iOException) {
        AnonymousClass0C1 r1 = this.A00;
        r1.sendMessage(r1.obtainMessage(5, iOException));
    }

    public final void onSuccess() {
        AnonymousClass0C1 r1 = this.A00;
        r1.sendMessage(r1.obtainMessage(2));
    }
}
