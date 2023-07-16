package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.7lQ  reason: invalid class name and case insensitive filesystem */
public final class C129157lQ implements C148658rd {
    public final int A00;
    public final C148658rd A01;
    public final AnonymousClass7AL A02;
    public final /* synthetic */ C93515lj A03;

    public C129157lQ(C148658rd r1, AnonymousClass7AL r2, C93515lj r3, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
        this.A01 = r1;
    }

    public final void Bro(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        String.valueOf(valueOf);
        String.valueOf(valueOf);
        C93515lj r3 = this.A03;
        C107466gn r2 = new C107466gn(connectionResult, this.A00);
        if (r3.A02.compareAndSet((Object) null, r2)) {
            r3.A00.post(new AnonymousClass81A(r2, r3));
        }
    }
}
