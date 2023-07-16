package X;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0fC  reason: invalid class name and case insensitive filesystem */
public final class C09300fC {
    public final AnonymousClass0W4 A00;
    public final AnonymousClass0WT A01;
    public final ThreadLocal A02 = new ThreadLocal();
    public final C04560Oe A03;
    public final C03700Kj A04;
    public final C03720Kl A05;
    public final Random A06;
    public final C04560Oe A07;
    public final C04560Oe A08;

    public static C09350fH A00(AnonymousClass0WA r8, C09300fC r9, String str, long j) {
        C09350fH A012 = A01(r9, TimeUnit.MICROSECONDS, 27787270, j, r8.A0E);
        A012.A8X("type", str);
        A012.A03("real_marker_id", r8.A00);
        A012.A04("nanoseconds_value", j);
        A012.A05("event_was_sampled", r8.A0L);
        A012.A04("thread_contention", r8.A0I.get());
        A012.A05("main_thread", r8.A0J);
        ArrayList arrayList = r8.A0N;
        A012.A05("listener_was_used", !arrayList.isEmpty());
        int i = 0;
        while (true) {
            ArrayList arrayList2 = r8.A0M;
            if (i < arrayList2.size()) {
                A012.A04(AnonymousClass00U.A0L("listener_", (String) arrayList2.get(i)), ((Number) arrayList.get(i)).longValue());
                i++;
            } else {
                A03(r8, A012, "quick_listeners_triggered", r8.A0B);
                A03(r8, A012, "restart_passed", r8.A0C);
                A03(r8, A012, "sample_rate_calculated", r8.A0D);
                A03(r8, A012, "quick_event_ready", r8.A0A);
                A03(r8, A012, "metadata_collected", r8.A08);
                A03(r8, A012, "listeners_triggered", r8.A04);
                A03(r8, A012, "event_found", r8.A03);
                A03(r8, A012, "annotation_added", r8.A01);
                A03(r8, A012, "point_added", r8.A09);
                A03(r8, A012, "loss_track", r8.A0H);
                A03(r8, A012, "lock_acquired", r8.A05);
                A03(r8, A012, "lock_released", r8.A06);
                A03(r8, A012, "trace_map_updated", r8.A0G);
                return A012;
            }
        }
    }

    public static C09350fH A01(C09300fC r3, TimeUnit timeUnit, int i, long j, long j2) {
        C09350fH r2 = new C09350fH();
        r2.A08 = timeUnit.toNanos(j);
        r2.A0O = 2;
        r2.A0D = System.currentTimeMillis();
        r2.A0B = r3.A05.nowNanos();
        r2.A0C = j2;
        r2.A07 = r3.A06.nextInt();
        r2.A03 = i;
        r2.A0S = false;
        r2.A0R = false;
        r2.A0K = (C14900qN) r3.A07.get();
        return r2;
    }

    public static void A02(AnonymousClass0WA r7, C09300fC r8, C09350fH r9) {
        C04560Oe r6 = r8.A08;
        if (r6 != null) {
            ArrayList arrayList = r7.A0P;
            int i = 0;
            boolean z = false;
            if (arrayList.size() > 0) {
                z = true;
            }
            r9.A05("metadata_was_used", z);
            while (true) {
                ArrayList arrayList2 = r7.A0O;
                if (i < arrayList2.size()) {
                    int intValue = ((Number) arrayList2.get(i)).intValue();
                    r9.A04(AnonymousClass00U.A0L("metadata_", ((C09780gf) r6.get()).A00(intValue).B51()), ((Number) arrayList.get(i)).longValue());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static void A03(AnonymousClass0WA r8, C09350fH r9, String str, long j) {
        if (j > 0) {
            C09350fH r0 = r9;
            String str2 = str;
            r0.A01((AnonymousClass0WQ) null, (AnonymousClass0Jz) null, str2, TimeUnit.MICROSECONDS, 7, j - r8.A0F);
        }
    }

    public static boolean A04(C09300fC r2) {
        ThreadLocal threadLocal = r2.A02;
        Boolean bool = (Boolean) threadLocal.get();
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        threadLocal.set(true);
        return true;
    }

    public C09300fC(C03700Kj r2, C03720Kl r3, AnonymousClass0W4 r4, AnonymousClass0WT r5, Random random, C04560Oe r7, C04560Oe r8, C04560Oe r9) {
        this.A00 = r4;
        this.A07 = r7;
        this.A01 = r5;
        this.A04 = r2;
        this.A08 = r9;
        this.A05 = r3;
        this.A06 = random;
        this.A03 = r8;
    }
}
