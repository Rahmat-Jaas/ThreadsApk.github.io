package X;

import java.io.File;

/* renamed from: X.612  reason: invalid class name */
public final class AnonymousClass612 extends AnonymousClass0gG {
    public final /* synthetic */ C131557sO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass612(C131557sO r5) {
        super(65, 5, true, false);
        this.A00 = r5;
    }

    public final void run() {
        File[] listFiles = this.A00.A00.listFiles();
        if (listFiles != null) {
            for (File A002 : listFiles) {
                AnonymousClass0IV.A00(A002);
            }
        }
    }
}
