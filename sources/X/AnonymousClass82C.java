package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.82C  reason: invalid class name */
public final class AnonymousClass82C implements Runnable {
    public final /* synthetic */ C91225fq A00;
    public final /* synthetic */ C113046qd A01;
    public final /* synthetic */ String A02;

    public AnonymousClass82C(C91225fq r1, C113046qd r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void run() {
        List<C107976hc> list = this.A01.A04;
        synchronized (list) {
            for (C107976hc r4 : list) {
                String str = this.A02;
                if (!TextUtils.isEmpty(str)) {
                    AnonymousClass7H6.A01(r4.A01).A03(r4.A00.A01, new C1376389j(r4, str));
                }
            }
        }
    }
}
