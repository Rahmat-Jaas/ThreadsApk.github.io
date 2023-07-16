package X;

import java.io.File;

/* renamed from: X.0d5  reason: invalid class name and case insensitive filesystem */
public final class C08270d5 implements C33841Hva {
    public final /* synthetic */ C05600Uj A00;
    public final /* synthetic */ C09020eh A01;
    public final /* synthetic */ File A02;

    public final String getName() {
        return "IgProfiloUploadService";
    }

    public final int getRunnableId() {
        return 1754633478;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C08270d5(C05600Uj r1, C09020eh r2, File file) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = file;
    }

    public final void run() {
        this.A00.CRs(this.A02, 4);
    }
}
