package X;

import java.io.BufferedReader;

/* renamed from: X.7u9  reason: invalid class name and case insensitive filesystem */
public final class C132577u9 implements C144618in {
    public static final C132577u9 A00 = new C132577u9();

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        GJX gjx = (GJX) obj;
        C148738rm A002 = gjx.A00();
        if (A002 != null) {
            BufferedReader A0Y = C86144wL.A0Y(A002.AUn());
            StringBuilder A0r = C18200wM.A0r();
            C120677Bz.A02(A0Y, C86164wN.A0s(A0r, 36));
            C95095yr r1 = new C95095yr(C18190wL.A0n(A0r));
            r1.mStatusCode = gjx.A02;
            return r1;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
