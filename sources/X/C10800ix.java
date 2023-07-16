package X;

import java.io.File;

/* renamed from: X.0ix  reason: invalid class name and case insensitive filesystem */
public final class C10800ix implements C14870qJ {
    public final C15350rA A00;
    public final C14880qK A01;

    public final boolean CZY(UnsatisfiedLinkError unsatisfiedLinkError, C15010qZ[] r5) {
        String str = this.A00.A00().getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Base apk does not exist: ");
        sb.append(str);
        this.A01.A00(sb);
        throw new C15110qj(sb.toString(), unsatisfiedLinkError);
    }

    public C10800ix(C15350rA r1, C14880qK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
