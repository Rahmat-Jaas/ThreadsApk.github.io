package X;

import java.io.File;

/* renamed from: X.0Zc  reason: invalid class name and case insensitive filesystem */
public final class C06390Zc implements AnonymousClass0OB {
    public static final C06390Zc A00 = new C06390Zc();

    public final /* bridge */ /* synthetic */ Object AFC(AnonymousClass0OK r3) {
        C06180Xz r1 = C04520Nz.A00;
        if (r1 == null) {
            File file = r3.A03().A04;
            C002801h.A02(file, "Did you call SessionManager.init()?");
            r1 = AnonymousClass0P0.A00(file);
            C04520Nz.A01(r1);
        }
        return new C05060Qr(r1);
    }
}
