package X;

import java.io.File;

/* renamed from: X.0Xa  reason: invalid class name and case insensitive filesystem */
public final class C05940Xa implements C04050Mb {
    public final File A00;

    public final void CWp(C04170Mn r4, AnonymousClass0ND r5) {
        File file = new File(this.A00, "msys_crash_reporter_file");
        if (file.exists()) {
            r4.A04(AnonymousClass0MY.A0C, r5, file);
        }
    }

    public C05940Xa(File file) {
        this.A00 = file;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0P;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
