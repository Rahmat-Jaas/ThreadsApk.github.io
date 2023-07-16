package X;

import java.io.File;

/* renamed from: X.0d4  reason: invalid class name and case insensitive filesystem */
public final class C08260d4 extends C63873iU {
    public final C05600Uj A00;
    public final File A01;

    public /* synthetic */ C08260d4(C05600Uj r1, C08270d5 r2, File file) {
        this(r1, file);
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int A03 = C14030oh.A03(-873733825);
        C08600dr A002 = AnonymousClass0Vt.A00();
        File file = this.A01;
        A002.A02(file.getName(), 1, "IgProfiloUploadService", "Trace Upload Failed: %s (reason = %d)");
        this.A00.CRs(file, 1);
        C14030oh.A0A(1579773894, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C14030oh.A03(-282534470);
        int A032 = C14030oh.A03(2124963490);
        C08600dr A002 = AnonymousClass0Vt.A00();
        File file = this.A01;
        A002.A03(file.getName(), "IgProfiloUploadService", "Trace Upload Success: %s");
        this.A00.CRw(file);
        C14030oh.A0A(-1073266850, A032);
        C14030oh.A0A(1369479747, A03);
    }

    public C08260d4(C05600Uj r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }
}
