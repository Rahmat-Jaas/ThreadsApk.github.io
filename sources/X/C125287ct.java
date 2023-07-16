package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.7ct  reason: invalid class name and case insensitive filesystem */
public final class C125287ct implements C143218gJ {
    public final /* synthetic */ C91225fq A00;
    public final /* synthetic */ AnonymousClass513 A01;

    public C125287ct(C91225fq r1, AnonymousClass513 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onLog(String str) {
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass513 r3 = this.A01;
            List<C143218gJ> list = r3.A02;
            synchronized (list) {
                for (C143218gJ onLog : list) {
                    onLog.onLog(str);
                }
            }
            if (str.startsWith("FB_IX_PAGE_READY")) {
                List<C143238gL> list2 = r3.A04;
                synchronized (list2) {
                    for (C143238gL CA1 : list2) {
                        CA1.CA1(this.A00);
                    }
                }
            }
        }
    }
}
