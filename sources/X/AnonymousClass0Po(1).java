package X;

import java.io.File;

/* renamed from: X.0Po  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Po implements Runnable {
    public final /* synthetic */ AnonymousClass0O7 A00;
    public final /* synthetic */ C04910Pt A01;
    public final /* synthetic */ C04920Pv A02;
    public final /* synthetic */ File A03;

    public /* synthetic */ AnonymousClass0Po(AnonymousClass0O7 r1, C04910Pt r2, C04920Pv r3, File file) {
        this.A01 = r2;
        this.A03 = file;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        C04910Pt r4 = this.A01;
        File file = this.A03;
        try {
            C04910Pt.A01(this.A00, r4, this.A02, file);
            r4.A00 = null;
        } catch (Throwable th) {
            C04790Pd.A00();
            C04910Pt.A00(r4, file.getName(), th);
            throw th;
        }
    }
}
