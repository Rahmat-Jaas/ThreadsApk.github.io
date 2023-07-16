package X;

import com.facebook.memorytimeline.MemoryTimeline;
import java.util.Map;

/* renamed from: X.0cv  reason: invalid class name and case insensitive filesystem */
public final class C08180cv implements AnonymousClass0T0 {
    public final /* synthetic */ AnonymousClass0VV A00;

    public final int B7b() {
        return 2;
    }

    public final void Bwv(C05330St r1) {
    }

    public final boolean DAx() {
        return true;
    }

    public C08180cv(AnonymousClass0VV r1) {
        this.A00 = r1;
    }

    public final void C97(MemoryTimeline memoryTimeline, AnonymousClass0Sz r9) {
        C05300Sq r2;
        AnonymousClass0Sw r1 = AnonymousClass0Sw.A0u;
        Map map = r9.A02;
        if (map != null && (r2 = (C05300Sq) map.get(r1)) != null) {
            AnonymousClass0VV r5 = this.A00;
            if ((((double) r2.A00) * 100.0d) / ((double) r2.A01) >= ((double) r5.A01)) {
                r5.A05.onTrigger();
                memoryTimeline.CcT(r5.A04);
            }
        }
    }
}
