package X;

import android.os.Process;
import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7h4  reason: invalid class name and case insensitive filesystem */
public final class C127407h4 implements C143478go {
    public final C109236jg A00;

    public final /* bridge */ /* synthetic */ Pair Cem(C143468gn r11, C107206gM r12, Object obj, List list) {
        RunnableFuture runnableFuture;
        C110936mW r3;
        C127397h3 r1;
        C127397h3 r5;
        Map A0A;
        C108056hk r13 = (C108056hk) obj;
        C109236jg r52 = this.A00;
        synchronized (r52) {
            runnableFuture = r52.A01;
            r3 = r52.A00;
        }
        if (r3 == null) {
            if (runnableFuture != null) {
                AtomicInteger atomicInteger = r52.A02;
                if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                    runnableFuture.run();
                }
                r3 = (C110936mW) AnonymousClass7J1.A01(runnableFuture, atomicInteger.get());
                synchronized (r52) {
                    r52.A00 = r3;
                    r52.A01 = null;
                }
            } else {
                throw C18180wK.A0a("The future task is null but there is no computed result");
            }
        }
        AnonymousClass3HX r0 = (AnonymousClass3HX) r12.A01;
        r0.getClass();
        boolean A07 = AnonymousClass7K7.A07(r0);
        C109316jo r02 = null;
        if (A07) {
            if (r13 != null) {
                r02 = r13.A01;
            }
            C18180wK.A1P(r3, 1, list);
            C127397h3 r6 = r3.A02;
            if (r02 != null) {
                r5 = r02.A00;
                A0A = r02.A01;
            } else {
                r5 = null;
                A0A = AnonymousClass4WJ.A0A();
            }
            LinkedHashSet A0u = C86134wK.A0u();
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0A);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C108066hl r14 = (C108066hl) it.next();
                C04220Ms.A0B(r14, 0);
                int i = r14.A00;
                C142618fJ r15 = r14.A01;
                Integer valueOf = Integer.valueOf(i);
                Object obj2 = A0A.get(valueOf);
                Object apply = r15.apply(obj2);
                if (!C04220Ms.A0I(obj2, apply)) {
                    linkedHashMap.put(valueOf, apply);
                    A0u.add(valueOf);
                }
            }
            C110026l0 r03 = new C110026l0(r12, list, linkedHashMap, A0u);
            r02 = new C109316jo(AnonymousClass6QA.A00(r6, r5, r03), list, r03.A02);
        }
        C108056hk r2 = new C108056hk(r3, r02);
        C109316jo r04 = r2.A01;
        if (r04 != null) {
            r1 = r04.A00;
        } else {
            r1 = r2.A00.A02;
        }
        return new Pair(r1, r2);
    }

    public C127407h4(C109236jg r1) {
        this.A00 = r1;
    }
}
