package X;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: X.75x  reason: invalid class name and case insensitive filesystem */
public final class C1195675x {
    public ITF A00;
    public ExecutorService A01;
    public final C04530Oa A02 = C86134wK.A0w(this, 39);

    public static final File A00(C1195675x r4, String str) {
        String A002 = AnonymousClass000.A00(144);
        File file = (File) r4.A02.getValue();
        if (file == null) {
            return null;
        }
        return C86154wM.A0U(file, AnonymousClass00U.A0W(A002, str, ".callsum", '.'));
    }

    public C1195675x(ITF itf, ExecutorService executorService) {
        this.A01 = executorService;
        this.A00 = itf;
    }
}
