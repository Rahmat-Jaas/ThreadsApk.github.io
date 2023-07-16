package X;

import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.6Pq  reason: invalid class name and case insensitive filesystem */
public final class C101036Pq {
    public static C110936mW A00(AnonymousClass3HX r13, C113616ro r14, C110936mW r15, Map map) {
        AnonymousClass7A1 A01;
        AnonymousClass7r6 r7 = AnonymousClass7r6.A00;
        AnonymousClass3HX r2 = r13;
        C145928lL r8 = (C145928lL) r13.A00(R.id.bk_context_key_performance_logger);
        int andIncrement = C103766ah.A00.getAndIncrement();
        r8.AKg(4, andIncrement);
        r8.AKd(4, andIncrement, "instance", (long) andIncrement);
        C41228M0s.A01("Bloks Bind");
        Map map2 = map;
        if (map == null) {
            A01 = r14.A00;
        } else {
            A01 = r14.A00.A01(map2);
        }
        C127397h3 r5 = r14.A01;
        C1197476t ATb = r2.A02.ATb();
        C110936mW A00 = AnonymousClass70D.A00(ATb.A01, r2, A01, r15, r5, ATb.A05, r7);
        AnonymousClass326.A00.incrementAndGet();
        C41228M0s.A00();
        r8.AKf(4, andIncrement);
        return A00;
    }
}
