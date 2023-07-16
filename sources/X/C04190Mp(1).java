package X;

/* renamed from: X.0Mp  reason: invalid class name and case insensitive filesystem */
public class C04190Mp implements C04050Mb {
    public final Integer A00;
    public final C04050Mb[] A01;

    public final void CWp(C04170Mn r14, AnonymousClass0ND r15) {
        for (C04050Mb r6 : this.A01) {
            try {
                r6.CWp(r14, r15);
            } catch (Throwable th) {
                C04790Pd.A00();
                AnonymousClass0ON r1 = AnonymousClass0MU.A5q;
                String str = (String) r14.A07.get(r1);
                if (str == null) {
                    str = "";
                }
                r14.A03(r1, AnonymousClass00U.A0i(str, "Error: ", C04110Mh.A00(r6.Awy()), ": ", th.getMessage(), "\n"));
            }
        }
    }

    public C04190Mp(Integer num, C04050Mb... r2) {
        this.A00 = num;
        this.A01 = r2;
    }

    public final Integer Awy() {
        return this.A00;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
