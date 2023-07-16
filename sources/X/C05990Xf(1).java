package X;

import android.content.Context;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Pair;

/* renamed from: X.0Xf  reason: invalid class name and case insensitive filesystem */
public final class C05990Xf implements C04050Mb {
    public final Context A00;
    public final Integer A01;
    public final String A02;

    public final void CWp(C04170Mn r9, AnonymousClass0ND r10) {
        Pair pair;
        AnonymousClass0OO r1;
        HealthStats healthStats;
        long j;
        synchronized (this) {
            Context context = this.A00;
            String str = this.A02;
            pair = AnonymousClass0N3.A00;
            if (pair == null) {
                SystemHealthManager systemHealthManager = (SystemHealthManager) context.getSystemService(SystemHealthManager.class);
                if (systemHealthManager != null) {
                    try {
                        HealthStats takeMyUidSnapshot = systemHealthManager.takeMyUidSnapshot();
                        if (!(takeMyUidSnapshot == null || !takeMyUidSnapshot.hasStats(10014) || (healthStats = takeMyUidSnapshot.getStats(10014).get(str)) == null)) {
                            long j2 = 0;
                            if (healthStats.hasMeasurement(30005)) {
                                j = healthStats.getMeasurement(30005);
                            } else {
                                j = 0;
                            }
                            if (healthStats.hasMeasurement(30004)) {
                                j2 = healthStats.getMeasurement(30004);
                            }
                            pair = new Pair(Long.valueOf(j), Long.valueOf(j2));
                            AnonymousClass0N3.A00 = pair;
                        }
                    } catch (SecurityException e) {
                        C04790Pd.A00();
                        AnonymousClass0LU.A0E("lacrima", "Unable to retrieve health stats", e);
                    }
                }
                pair = null;
            }
        }
        if (pair != null) {
            int intValue = this.A01.intValue();
            if (intValue == 0) {
                r9.A02(AnonymousClass0MU.A3D, (Long) pair.first);
                r1 = AnonymousClass0MU.A3E;
            } else if (intValue != 1) {
                r9.A02(AnonymousClass0MU.A2k, (Long) pair.first);
                r1 = AnonymousClass0MU.A2m;
            } else {
                r9.A02(AnonymousClass0MU.A27, (Long) pair.first);
                r1 = AnonymousClass0MU.A28;
            }
            r9.A02(r1, (Long) pair.second);
        }
    }

    public C05990Xf(Context context, Integer num, String str) {
        this.A00 = context;
        this.A01 = num;
        this.A02 = str;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0b;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
