package X;

import android.os.Bundle;

/* renamed from: X.7ju  reason: invalid class name and case insensitive filesystem */
public final class C128597ju implements C145868lF {
    public final AnonymousClass57F A00;

    public final C120967Dk ArH() {
        throw C18180wK.A0a("Should not be called");
    }

    public final void BzY(Bundle bundle, C120967Dk r4) {
        AnonymousClass7JD.A03(this.A00.A02, new AnonymousClass79P(r4, bundle));
    }

    public final void BzZ(Throwable th) {
        AnonymousClass7JD.A03(this.A00.A01, th);
    }

    public C128597ju(Bundle bundle, AnonymousClass57F r6) {
        this.A00 = r6;
        AnonymousClass7JD.A03(r6.A00, new AnonymousClass79P("AUTH_USUP", new Bundle(bundle)));
    }
}
