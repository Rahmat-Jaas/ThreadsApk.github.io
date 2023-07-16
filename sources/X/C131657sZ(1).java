package X;

/* renamed from: X.7sZ  reason: invalid class name and case insensitive filesystem */
public final class C131657sZ implements C82414pa {
    public final C82414pa A00;

    public final /* bridge */ /* synthetic */ Object AKb(C63893iY r5, C105926eD r6, C110486ll r7) {
        AnonymousClass601 r72 = (AnonymousClass601) r7;
        String str = r6.A00;
        switch (str.hashCode()) {
            case -600206934:
                if (str.equals("bk.action.animation.spring.GetCurrentValue")) {
                    return AnonymousClass3WF.A00(((C25812DsR) C63893iY.A0B(r5, 0)).A09.A00);
                }
                break;
            case -512481856:
                if (str.equals("bk.action.animation.spring.Create")) {
                    C109326jp A06 = C63893iY.A06(r5, 0);
                    C25812DsR A02 = COK.A00().A02();
                    A02.A0E(new C90855fA(this, r72, C86114wI.A0V(A02), A06));
                    return A02;
                }
                break;
            case 1371463060:
                if (str.equals("bk.action.animation.spring.SetEndValue")) {
                    Object A0B = C63893iY.A0B(r5, 1);
                    A0B.getClass();
                    ((C25812DsR) C63893iY.A0B(r5, 0)).A0A((double) C18240wQ.A00(A0B));
                    return null;
                }
                break;
        }
        return this.A00.AKb(r5, r6, r72);
    }

    public C131657sZ(C82414pa r1) {
        this.A00 = r1;
    }
}
