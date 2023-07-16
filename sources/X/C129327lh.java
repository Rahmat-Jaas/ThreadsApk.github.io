package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: X.7lh  reason: invalid class name and case insensitive filesystem */
public final class C129327lh implements C146538mP {
    public final C129387ln A00;

    public C129327lh(C129387ln r1) {
        this.A00 = r1;
    }

    public final void DBc() {
    }

    public final void DBi(Bundle bundle) {
    }

    public final void DBj(ConnectionResult connectionResult, C108946jD r2, boolean z) {
    }

    public final C93345lQ DBY(C93345lQ r6) {
        try {
            C129387ln r4 = this.A00;
            C93285lJ r3 = r4.A07;
            C1195175q r1 = r3.A0A;
            r1.A01.add(r6);
            r6.A0B.set(r1.A00);
            C99286Iv r2 = r6.A00;
            C148598rX r12 = (C148598rX) r3.A0E.get(r2);
            C13320nQ.A02(r12, "Appropriate Api was not requested.");
            if (r12.isConnected() || !r4.A0A.containsKey(r2)) {
                r6.A09(r12);
                return r6;
            }
            r6.A0A(new Status(17, (String) null));
            return r6;
        } catch (DeadObjectException unused) {
            C129387ln r0 = this.A00;
            C86124wJ.A1E(r0.A08, new C93405lY(this, this), 1);
            return r6;
        }
    }

    public final void DBf() {
    }

    public final void DBk(int i) {
        C129387ln r1 = this.A00;
        r1.A00((ConnectionResult) null);
        r1.A02.DBb(i, false);
    }

    public final boolean DBl() {
        this.A00.A00((ConnectionResult) null);
        return true;
    }

    public final C93345lQ DBW(C93345lQ r1) {
        DBY(r1);
        return r1;
    }
}
