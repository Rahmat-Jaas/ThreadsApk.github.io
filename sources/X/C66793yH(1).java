package X;

/* renamed from: X.3yH  reason: invalid class name and case insensitive filesystem */
public final class C66793yH implements C81834oT {
    public final /* synthetic */ C121997Jj A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ C109326jp A03;
    public final /* synthetic */ AnonymousClass0ZU A04;

    public C66793yH(C121997Jj r1, C109326jp r2, C109326jp r3, C109326jp r4, AnonymousClass0ZU r5) {
        this.A03 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final boolean Bno(Integer num) {
        C109326jp r3;
        int A06 = C18240wQ.A06(num, 0);
        if (A06 == 0) {
            r3 = this.A03;
        } else if (A06 == 2) {
            r3 = this.A02;
        } else if (A06 != 1) {
            return false;
        } else {
            r3 = this.A01;
        }
        if (r3 == null) {
            return false;
        }
        C122047Jt.A03((AnonymousClass3HX) this.A04.invoke(), this.A00.A02, C63893iY.A01, r3);
        return true;
    }
}
