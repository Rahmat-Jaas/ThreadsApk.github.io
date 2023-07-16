package X;

import java.io.File;

/* renamed from: X.80j  reason: invalid class name and case insensitive filesystem */
public final class C1358480j implements Runnable {
    public final /* synthetic */ C1195675x A00;
    public final /* synthetic */ String A01;

    public C1358480j(C1195675x r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        String A002 = AnonymousClass000.A00(593);
        try {
            File A003 = C1195675x.A00(this.A00, this.A01);
            if (A003 != null) {
                A003.delete();
            }
        } catch (Exception e) {
            AnonymousClass0LU.A0D(A002, AnonymousClass00U.A0X("Error deleting ", AnonymousClass000.A00(144), e.getMessage(), 10));
        }
    }
}
