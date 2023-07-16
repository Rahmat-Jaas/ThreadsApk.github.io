package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7tO  reason: invalid class name and case insensitive filesystem */
public final class C132137tO implements AnonymousClass0i4 {
    public static volatile C132137tO A04;
    public C110496lm A00;
    public Random A01 = new Random();
    public ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final ArrayList A03;

    public static C132137tO A00() {
        if (A04 != null) {
            return A04;
        }
        throw C18180wK.A0a("VideoBoundaryTestHelper never initialized");
    }

    public final int A01(C36483JXj jXj) {
        C108266i5 r1;
        if (!this.A00.A03) {
            return 0;
        }
        String str = jXj.A0E;
        if (jXj.A0P) {
            return 0;
        }
        ConcurrentHashMap concurrentHashMap = this.A02;
        if (!concurrentHashMap.containsKey(str) || (r1 = (C108266i5) concurrentHashMap.get(str)) == null || !r1.A00.get()) {
            return 0;
        }
        return r1.A01;
    }

    public final void A02(C36483JXj jXj) {
        boolean z;
        int i;
        C110496lm r7 = this.A00;
        if (r7.A03) {
            String str = jXj.A0E;
            if (!jXj.A0P) {
                ConcurrentHashMap concurrentHashMap = this.A02;
                if (!concurrentHashMap.containsKey(str)) {
                    if (((double) this.A01.nextInt(100)) < r7.A00) {
                        z = true;
                        i = r7.A01;
                    } else {
                        z = false;
                        i = 0;
                    }
                    concurrentHashMap.put(str, new C108266i5(i, z));
                }
            }
        }
    }

    public final void A03(C36483JXj jXj) {
        C108266i5 r0;
        if (this.A00.A03) {
            String str = jXj.A0E;
            if (!jXj.A0P) {
                ConcurrentHashMap concurrentHashMap = this.A02;
                if (concurrentHashMap.containsKey(str) && (r0 = (C108266i5) concurrentHashMap.get(str)) != null) {
                    r0.A00.set(false);
                }
            }
        }
    }

    public final boolean A04(String str) {
        C110496lm r2 = this.A00;
        if (!r2.A03) {
            return false;
        }
        if (!r2.A04 || this.A03.contains(str)) {
            return true;
        }
        return false;
    }

    public final void onSessionWillEnd() {
        this.A02.clear();
    }

    public C132137tO(C110496lm r3) {
        this.A00 = r3;
        this.A03 = C18200wM.A0s(Arrays.asList(r3.A02.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
    }
}
