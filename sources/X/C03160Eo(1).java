package X;

import android.util.Log;
import com.facebook.common.perfcounter.PerfCounter;
import com.facebook.endtoend.EndToEnd;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Map;

/* renamed from: X.0Eo  reason: invalid class name and case insensitive filesystem */
public final class C03160Eo extends C11940l3 {
    public static final ListenableFuture A00(AnonymousClass0QX r19, C09350fH r20) {
        C04220Ms.A0B(r20, 0);
        AnonymousClass0QX r14 = r19;
        if (r19 != null && r14.A0S) {
            long j = r14.A0E;
            long j2 = r14.A0H;
            long j3 = r14.A0G;
            long j4 = r14.A0J;
            long j5 = r14.A0F;
            long j6 = r14.A0I;
            long j7 = r14.A06;
            long j8 = r14.A07;
            if (!(j == -1 && j3 == -1 && j5 == -1 && j7 == -1 && j8 == -1)) {
                r20.AvU().A01("perf_event_info");
                if (j != -1) {
                    r20.AvU().A02("user_instruction_count", j);
                }
                if (j2 != -1) {
                    r20.AvU().A02("user_kernel_instruction_count", j2);
                }
                if (j3 != -1) {
                    r20.AvU().A02("user_instruction_count_ps", j3);
                }
                if (j4 != -1) {
                    r20.AvU().A02("user_kernel_instruction_count_ps", j4);
                }
                if (j5 != -1) {
                    r20.AvU().A02("user_instruction_count_main_th", j5);
                }
                if (j6 != -1) {
                    r20.AvU().A02("user_kernel_instruction_count_main_th", j6);
                }
                if (j7 != -1) {
                    r20.AvU().A02("perf_cpu_clock", j7);
                }
                if (j8 != -1) {
                    r20.AvU().A02("perf_task_clock", j8);
                }
            }
        }
        return C30954Gc6.A01((Object) null);
    }

    public final String B51() {
        return "ig_perf_event_info_stats";
    }

    public final int B52() {
        return 33;
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        int i;
        AnonymousClass0QX r3 = new AnonymousClass0QX();
        if (AnonymousClass0qM.A01() && !r3.A0R) {
            if (PerfCounter.A00 == -1) {
                if (!new File("/proc/sys/kernel/perf_event_paranoid").exists() || (!EndToEnd.A03() && !new File("/data/local/tmp/ctscan_perfcounter_collect").exists())) {
                    i = 0;
                } else {
                    i = 1;
                }
                PerfCounter.A00 = i;
            }
            if (PerfCounter.A00 == 1) {
                synchronized (PerfCounter.A02) {
                    int i2 = PerfCounter.A01;
                    if (i2 > 0) {
                        PerfCounter.A01 = i2 + 1;
                    } else {
                        if (!PerfCounter.A03) {
                            try {
                                AnonymousClass0qM.A02("perfcounter");
                                PerfCounter.A03 = true;
                            } catch (UnsatisfiedLinkError e) {
                                Log.e("PerfCounter", "Cannot find native library for PerfCounter", e);
                            } catch (Error e2) {
                                Log.e("PerfCounter", "Cannot Initialize PerfCounter due to unknown error", e2);
                            } catch (Exception e3) {
                                Log.e("PerfCounter", "Cannot Initialize PerfCounter due to unknown error", e3);
                            }
                        }
                        try {
                            if (PerfCounter.nativeBegin()) {
                                PerfCounter.A01 = 1;
                            }
                        } catch (UnsatisfiedLinkError e4) {
                            Log.e("PerfCounter", "Cannot find PerfCounter.nativeBegin()", e4);
                        }
                    }
                }
            }
            AnonymousClass0QX.A02(r3, false);
            r3.A0R = true;
            r3.A0Q = AnonymousClass0QX.A01((Map) null);
        }
        C15020qa.A07.size();
        return r3;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture AHJ(C09350fH r2, Object obj, Object obj2) {
        return A00((AnonymousClass0QX) obj, r2);
    }

    public final /* bridge */ /* synthetic */ void Cw1(Object obj) {
        AnonymousClass0QX r2 = (AnonymousClass0QX) obj;
        if (r2 != null) {
            r2.A03(8);
        }
    }

    public final Class BCf() {
        return AnonymousClass0QX.class;
    }

    public final boolean BTR(C08640dy r2) {
        return true;
    }
}
