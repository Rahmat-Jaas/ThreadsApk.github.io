package X;

import android.os.Process;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0FC  reason: invalid class name */
public final class AnonymousClass0FC extends C11940l3 {
    public static final ListenableFuture A00(AnonymousClass0QX r6, C09350fH r7) {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        C04220Ms.A0B(r7, 0);
        if (r6 != null && r6.A0S) {
            r7.AvU().A01("io_stats");
            r7.AvU().A02("ps_flt", r6.A0A);
            r7.AvU().A02("proc_delayacct_blkio_ticks", r6.A08);
            AnonymousClass0WN AvU = r7.AvU();
            AnonymousClass0Hx r0 = r6.A0O;
            if (r0 != null) {
                i = r0.A00;
            } else {
                i = -1;
            }
            AvU.A03("loaded_libs", Integer.valueOf(i));
            long j8 = r6.A0D;
            if (j8 != -1) {
                r7.AvU().A02("th_flt", j8);
            }
            r7.AvU().A03("class_load_attempts", Integer.valueOf(r6.A0N.A00));
            r7.AvU().A03("dex_queries", Integer.valueOf(r6.A0N.A02));
            r7.AvU().A03("class_loads_failed", Integer.valueOf(r6.A0N.A01));
            r7.AvU().A03("locator_assists", Integer.valueOf(r6.A0N.A04));
            r7.AvU().A03("wrong_dfa_guesses", Integer.valueOf(r6.A0N.A03));
            long j9 = r6.A03;
            if (j9 != -1) {
                r7.AvU().A02("allocstall", j9);
            }
            long j10 = r6.A04;
            if (j10 != -1) {
                r7.AvU().A02("pages_in", j10);
            }
            long j11 = r6.A05;
            if (j11 != -1) {
                r7.AvU().A02("pages_out", j11);
            }
            r7.AvU().A02("ps_min_flt", r6.A0B);
            AnonymousClass0WN AvU2 = r7.AvU();
            if (r6.A0M == null) {
                j = -1;
            } else {
                C02780Cw r1 = AnonymousClass0Cv.A00;
                r1.A00.block();
                j = r1.A03.get();
            }
            AvU2.A02("avail_disk_spc_kb", j);
            C02750Cs r02 = r6.A0L;
            if (r02 != null) {
                long j12 = r02.A01;
                if (j12 != -1) {
                    r7.AvU().A02("io_readbytes", j12);
                    AnonymousClass0WN AvU3 = r7.AvU();
                    C02750Cs r03 = r6.A0L;
                    if (r03 != null) {
                        j2 = r03.A02;
                    } else {
                        j2 = -1;
                    }
                    AvU3.A02("io_readchars", j2);
                    AnonymousClass0WN AvU4 = r7.AvU();
                    C02750Cs r04 = r6.A0L;
                    if (r04 != null) {
                        j3 = r04.A03;
                    } else {
                        j3 = -1;
                    }
                    AvU4.A02("io_readsyscalls", j3);
                    AnonymousClass0WN AvU5 = r7.AvU();
                    C02750Cs r05 = r6.A0L;
                    if (r05 != null) {
                        j4 = r05.A04;
                    } else {
                        j4 = -1;
                    }
                    AvU5.A02("io_writebytes", j4);
                    AnonymousClass0WN AvU6 = r7.AvU();
                    C02750Cs r06 = r6.A0L;
                    if (r06 != null) {
                        j5 = r06.A05;
                    } else {
                        j5 = -1;
                    }
                    AvU6.A02("io_writechars", j5);
                    AnonymousClass0WN AvU7 = r7.AvU();
                    C02750Cs r07 = r6.A0L;
                    if (r07 != null) {
                        j6 = r07.A06;
                    } else {
                        j6 = -1;
                    }
                    AvU7.A02("io_writesyscalls", j6);
                    AnonymousClass0WN AvU8 = r7.AvU();
                    C02750Cs r08 = r6.A0L;
                    if (r08 != null) {
                        j7 = r08.A00;
                    } else {
                        j7 = -1;
                    }
                    AvU8.A02("io_cancelledwb", j7);
                }
            }
        }
        return C30954Gc6.A01((Object) null);
    }

    public final String B51() {
        return "ig_io_perf_stats";
    }

    public final int B52() {
        return 10;
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        ClassLoadingStats classLoadingStats;
        AnonymousClass0QX r3 = new AnonymousClass0QX();
        long[] A00 = C02800Cy.A00("/proc/self/stat");
        r3.A0B = A00[0];
        r3.A0A = A00[2];
        r3.A08 = A00[5];
        r3.A0D = C02800Cy.A00(AnonymousClass00U.A0S("/proc/self/task/", "/stat", Process.myTid()))[2];
        C02810Cz A002 = AnonymousClass0D0.A00();
        r3.A03 = A002.A00;
        r3.A04 = A002.A02;
        r3.A05 = A002.A04;
        r3.A0L = C02750Cs.A00();
        HashSet hashSet = C15020qa.A07;
        r3.A0O = new AnonymousClass0Hx(hashSet.size());
        r3.A0T = true;
        r3.A0S = false;
        r3.A01 = -1;
        AtomicReference atomicReference = ClassLoadingStats.A00;
        if (atomicReference.get() == null) {
            classLoadingStats = new AnonymousClass081();
        } else {
            classLoadingStats = (ClassLoadingStats) atomicReference.get();
        }
        r3.A0N = new ClassLoadingStats.SnapshotStats(classLoadingStats.getClassLoadsAttempted(), classLoadingStats.getClassLoadsFailed(), classLoadingStats.getDexFileQueries(), classLoadingStats.getLocatorAssistedClassLoads(), classLoadingStats.getIncorrectDfaGuesses());
        hashSet.size();
        return r3;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture AHJ(C09350fH r2, Object obj, Object obj2) {
        return A00((AnonymousClass0QX) obj, r2);
    }

    public final /* bridge */ /* synthetic */ void Cw1(Object obj) {
        AnonymousClass0QX r2 = (AnonymousClass0QX) obj;
        if (r2 != null) {
            r2.A03(2);
        }
    }

    public final Class BCf() {
        return AnonymousClass0QX.class;
    }

    public final boolean BTR(C08640dy r2) {
        return true;
    }
}
