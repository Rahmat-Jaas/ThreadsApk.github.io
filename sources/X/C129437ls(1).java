package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.7ls  reason: invalid class name and case insensitive filesystem */
public final class C129437ls implements C143808hL, C143798hK {
    public IAccountAccessor A00 = null;
    public Set A01 = null;
    public boolean A02 = false;
    public final C148598rX A03;
    public final C113816sC A04;
    public final /* synthetic */ AnonymousClass7MI A05;

    public C129437ls(C148598rX r2, C113816sC r3, AnonymousClass7MI r4) {
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
    }

    public final void CGB(ConnectionResult connectionResult) {
        this.A05.A06.post(new AnonymousClass818(connectionResult, this));
    }

    public final void DBg(ConnectionResult connectionResult) {
        AnonymousClass7lO r5 = (AnonymousClass7lO) this.A05.A09.get(this.A04);
        if (r5 != null) {
            C13320nQ.A00(r5.A0C.A06);
            C148598rX r4 = r5.A04;
            String A0q = C18220wO.A0q(r4);
            String valueOf = String.valueOf(connectionResult);
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(A0q) + 25 + C86104wH.A0A(valueOf));
            A0s.append("onSignInFailed for ");
            A0s.append(A0q);
            A0s.append(" with ");
            r4.AI8(C18180wK.A0i(valueOf, A0s));
            r5.A0B(connectionResult, (Exception) null);
        }
    }
}
