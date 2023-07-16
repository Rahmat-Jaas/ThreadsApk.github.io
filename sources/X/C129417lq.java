package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.7lq  reason: invalid class name and case insensitive filesystem */
public final class C129417lq implements C143808hL {
    public final /* synthetic */ C121837Ij A00;

    public C129417lq(C121837Ij r1) {
        this.A00 = r1;
    }

    public final void CGB(ConnectionResult connectionResult) {
        if (connectionResult.A01 == 0) {
            C121837Ij r2 = this.A00;
            r2.B6o((IAccountAccessor) null, ((C93625lu) r2).A01);
            return;
        }
        AnonymousClass8eJ r0 = this.A00.A0I;
        if (r0 != null) {
            ((C129407lp) r0).A00.Bro(connectionResult);
        }
    }
}
