package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6qJ  reason: invalid class name and case insensitive filesystem */
public final class C112856qJ {
    public int A00;
    public AnonymousClass5FF A01;
    public final Context A02;
    public final QuickPerformanceLogger A03;
    public final Map A04 = new C013306f();

    public final void A00(String str) {
        if (this.A01 != null) {
            Map map = this.A04;
            C126107ea r2 = (C126107ea) map.remove(str);
            if (r2 != null) {
                AnonymousClass5FF r1 = this.A01;
                r2.CG7(r1.A00());
                r2.Btu();
                r1.A00.remove(r2);
                Iterator A14 = C86104wH.A14(map);
                while (A14.hasNext()) {
                    C126107ea r12 = (C126107ea) A14.next();
                    r12.A00--;
                }
                if (map.isEmpty()) {
                    this.A01.AHx();
                }
            }
        }
    }

    public C112856qJ(Context context, QuickPerformanceLogger quickPerformanceLogger) {
        this.A03 = quickPerformanceLogger;
        this.A02 = context;
        this.A00 = 0;
    }
}
