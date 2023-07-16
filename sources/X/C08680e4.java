package X;

import android.os.Process;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0e4  reason: invalid class name and case insensitive filesystem */
public final class C08680e4 extends MarkerEditor implements PointEditor {
    public int A00;
    public long A01;
    public AnonymousClass0WQ A02;
    public String A03;
    public int A04 = 7;
    public final C09350fH A05;
    public final C12020lB A06;
    public final C12430lt A07;
    public final AnonymousClass01V A08;

    private AnonymousClass0WQ A00() {
        AnonymousClass0WQ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0WQ r02 = new AnonymousClass0WQ();
        this.A02 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.isEmpty() != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A01(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0009
            boolean r0 = r4.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0009:
            r2 = 1
            X.0lB r1 = r3.A06
            if (r1 == 0) goto L_0x0016
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            r1.A06(r0)
        L_0x0016:
            r0 = r2 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08680e4.A01(java.lang.String):boolean");
    }

    public final void markerEditingCompleted() {
        if (this.A03 != null) {
            pointEditingCompleted();
        }
    }

    public final MarkerEditor point(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        this.A08.A0j(this.A05, str3, str4, TimeUnit.MILLISECONDS, this.A04, 0, Process.myTid(), j);
        return this;
    }

    public final PointEditor pointCustomTimestamp(long j) {
        if (this.A00 != 1 || j == -1) {
            this.A01 = j;
            return this;
        }
        throw new IllegalStateException("You can't collect metadata with custom timestamp, as point appeared in the past but metadata is to be collected in the present");
    }

    public final MarkerEditor pointEditingCompleted() {
        String obj;
        if (this.A03 != null) {
            AnonymousClass0WQ r1 = this.A02;
            if (r1 != null) {
                r1.A03 = true;
            }
            AnonymousClass01V r3 = this.A08;
            C09350fH r14 = this.A05;
            int i = this.A04;
            String str = this.A03;
            AnonymousClass0WQ r12 = this.A02;
            long j = this.A01;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i2 = this.A00;
            int myTid = Process.myTid();
            if (AnonymousClass01V.A0O(r3, str)) {
                AnonymousClass0WA r11 = null;
                if (r3.A0n != null) {
                    r11 = r3.A0n.A01(r14.A03);
                }
                boolean z = false;
                if (j == -1) {
                    z = true;
                }
                long A0Q = r3.A0Q(j, timeUnit);
                int i3 = i;
                r3.A09.A07(r11, r12, r3.A0R(), r14, str, TimeUnit.NANOSECONDS, i3, i2, myTid, A0Q, !z);
                int i4 = r14.A03;
                if (AnonymousClass01V.A0M(r3)) {
                    if (r12 == null) {
                        obj = null;
                    } else {
                        obj = r12.toString();
                    }
                    AnonymousClass01V.A0G(r3, "markerPoint", str, obj, i4);
                }
                if (!(r3.A0n == null || r11 == null)) {
                    r3.A0n.A04(r11);
                }
            }
            this.A03 = null;
            this.A02 = null;
            this.A01 = -1;
            this.A00 = 0;
            return this;
        }
        throw new IllegalStateException("You should not use PointEditor after point was completed");
    }

    public final PointEditor pointEditor(String str) {
        this.A03 = str;
        this.A01 = -1;
        this.A00 = 0;
        return this;
    }

    public final PointEditor pointShouldIncludeMetadata(boolean z) {
        int i;
        if (!z) {
            i = 0;
        } else if (this.A01 == -1) {
            i = 1;
        } else {
            throw new IllegalStateException("You can't collect metadata with custom timestamp, as point appeared in the past but metadata is to be collected in the present");
        }
        this.A00 = i;
        return this;
    }

    public final MarkerEditor pointWithMetadata(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        this.A08.A0j(this.A05, str3, str4, TimeUnit.MILLISECONDS, this.A04, 1, Process.myTid(), j);
        return this;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r4.A0U != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.quicklog.MarkerEditor setSurviveUserSwitch(boolean r6) {
        /*
            r5 = this;
            X.01V r2 = r5.A08
            X.0fH r4 = r5.A05
            X.0WK r0 = r2.A09
            X.0WD r0 = r0.A06
            java.util.concurrent.locks.ReentrantLock r1 = r0.A01
            r1.lock()
            r4.A0U = r6     // Catch:{ all -> 0x002a }
            r1.unlock()
            X.0Ww r3 = r2.A0m
            if (r3 == 0) goto L_0x0029
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x001f
            boolean r1 = r4.A0U
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            int r2 = r4.A03
            int r1 = r4.A02
            r0 = r0 ^ 1
            r3.CbC(r2, r1, r0)
        L_0x0029:
            return r5
        L_0x002a:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08680e4.setSurviveUserSwitch(boolean):com.facebook.quicklog.MarkerEditor");
    }

    public C08680e4(C09350fH r2, C12020lB r3, AnonymousClass01V r4) {
        this.A08 = r4;
        this.A06 = r3;
        this.A05 = r2;
        this.A07 = C12430lt.A00;
    }

    public final MarkerEditor withLevel(int i) {
        this.A04 = i;
        return this;
    }

    public final PointEditor addPointData(String str, double d) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(d), 6);
        }
        return this;
    }

    public final PointEditor addPointData(String str, float f) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(f), 6);
        }
        return this;
    }

    public final PointEditor addPointData(String str, int i) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(i), 2);
        }
        return this;
    }

    public final PointEditor addPointData(String str, long j) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(j), 3);
        }
        return this;
    }

    public final PointEditor addPointData(String str, String str2) {
        if (A01(str) && str2 != null) {
            A00().A00(str, str2, 1);
        }
        return this;
    }

    public final PointEditor addPointData(String str, boolean z) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(z), 8);
        }
        return this;
    }

    public final PointEditor addPointData(String str, double[] dArr) {
        if (A01(str)) {
            A00().A00(str, AnonymousClass0W2.A00(dArr), 7);
        }
        return this;
    }

    public final PointEditor addPointData(String str, float[] fArr) {
        String obj;
        if (A01(str)) {
            AnonymousClass0WQ A002 = A00();
            int length = fArr.length;
            if (length == 0) {
                obj = "";
            } else {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                do {
                    sb.append(fArr[i]);
                    sb.append(",,,");
                    i++;
                } while (i < length);
                sb.setLength(sb.length() - 3);
                obj = sb.toString();
            }
            A002.A00(str, obj, 7);
        }
        return this;
    }

    public final PointEditor addPointData(String str, int[] iArr) {
        if (A01(str)) {
            A00().A00(str, AnonymousClass0W2.A01(iArr), 5);
        }
        return this;
    }

    public final PointEditor addPointData(String str, long[] jArr) {
        if (A01(str)) {
            A00().A00(str, AnonymousClass0W2.A02(jArr), 10);
        }
        return this;
    }

    public final PointEditor addPointData(String str, String[] strArr) {
        if (strArr != null && A01(str)) {
            A00().A00(str, AnonymousClass0W2.A03(strArr), 4);
        }
        return this;
    }

    public final PointEditor addPointData(String str, boolean[] zArr) {
        if (A01(str)) {
            A00().A00(str, AnonymousClass0W2.A04(zArr), 9);
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final MarkerEditor annotate(String str, double d) {
        AnonymousClass01V r4 = this.A08;
        C09350fH r5 = this.A05;
        if (AnonymousClass01V.A0O(r4, str)) {
            AnonymousClass0WA r3 = null;
            if (r4.A0n != null) {
                r3 = r4.A0n.A01(r5.A03);
            }
            AnonymousClass0WK r1 = r4.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R = r4.A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r5.A06 = myTid;
                r5.A02(str, d);
                A0R.A02(r3, r5);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                if (!(r4.A0n == null || r3 == null)) {
                    r4.A0n.A03(r3);
                    return this;
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
        return this;
    }

    public final MarkerEditor annotate(String str, int i) {
        this.A08.A0h(this.A05, str, i);
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final MarkerEditor annotate(String str, long j) {
        AnonymousClass01V r4 = this.A08;
        C09350fH r5 = this.A05;
        if (AnonymousClass01V.A0O(r4, str)) {
            AnonymousClass0WA r3 = null;
            if (r4.A0n != null) {
                r3 = r4.A0n.A01(r5.A03);
            }
            AnonymousClass0WK r1 = r4.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R = r4.A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r5.A06 = myTid;
                r5.A04(str, j);
                A0R.A02(r3, r5);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                if (!(r4.A0n == null || r3 == null)) {
                    r4.A0n.A03(r3);
                    return this;
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
        return this;
    }

    public final MarkerEditor annotate(String str, String str2) {
        this.A08.A0i(this.A05, str, str2);
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final MarkerEditor annotate(String str, boolean z) {
        AnonymousClass01V r5 = this.A08;
        C09350fH r4 = this.A05;
        if (AnonymousClass01V.A0O(r5, str)) {
            AnonymousClass0WA r3 = null;
            if (r5.A0n != null) {
                r3 = r5.A0n.A01(r4.A03);
            }
            AnonymousClass0WK r1 = r5.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R = r5.A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r4.A06 = myTid;
                r4.A05(str, z);
                A0R.A02(r3, r4);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                if (!(r5.A0n == null || r3 == null)) {
                    r5.A0n.A03(r3);
                    return this;
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final MarkerEditor annotate(String str, double[] dArr) {
        AnonymousClass01V r5 = this.A08;
        C09350fH r4 = this.A05;
        if (AnonymousClass01V.A0O(r5, str)) {
            AnonymousClass0WA r3 = null;
            if (r5.A0n != null) {
                r3 = r5.A0n.A01(r4.A03);
            }
            AnonymousClass0WK r1 = r5.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R = r5.A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r4.A06 = myTid;
                r4.A06(str, dArr);
                A0R.A02(r3, r4);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                if (!(r5.A0n == null || r3 == null)) {
                    r5.A0n.A03(r3);
                    return this;
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final MarkerEditor annotate(String str, int[] iArr) {
        AnonymousClass01V r5 = this.A08;
        C09350fH r4 = this.A05;
        if (AnonymousClass01V.A0O(r5, str)) {
            AnonymousClass0WA r3 = null;
            if (r5.A0n != null) {
                r3 = r5.A0n.A01(r4.A03);
            }
            AnonymousClass0WK r1 = r5.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R = r5.A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r4.A06 = myTid;
                r4.A07(str, iArr);
                A0R.A02(r3, r4);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                if (!(r5.A0n == null || r3 == null)) {
                    r5.A0n.A03(r3);
                    return this;
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final MarkerEditor annotate(String str, long[] jArr) {
        AnonymousClass01V r5 = this.A08;
        C09350fH r4 = this.A05;
        if (AnonymousClass01V.A0O(r5, str)) {
            AnonymousClass0WA r3 = null;
            if (r5.A0n != null) {
                r3 = r5.A0n.A01(r4.A03);
            }
            AnonymousClass0WK r1 = r5.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R = r5.A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r4.A06 = myTid;
                r4.A08(str, jArr);
                A0R.A02(r3, r4);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                if (!(r5.A0n == null || r3 == null)) {
                    r5.A0n.A03(r3);
                    return this;
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final MarkerEditor annotate(String str, String[] strArr) {
        AnonymousClass01V r5 = this.A08;
        C09350fH r4 = this.A05;
        if (AnonymousClass01V.A0O(r5, str)) {
            AnonymousClass0WA r3 = null;
            if (r5.A0n != null) {
                r3 = r5.A0n.A01(r4.A03);
            }
            AnonymousClass0WK r1 = r5.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R = r5.A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r4.A06 = myTid;
                r4.A09(str, strArr);
                A0R.A02(r3, r4);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                if (!(r5.A0n == null || r3 == null)) {
                    r5.A0n.A03(r3);
                    return this;
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    public final MarkerEditor annotate(String str, boolean[] zArr) {
        AnonymousClass01V r5 = this.A08;
        C09350fH r4 = this.A05;
        if (AnonymousClass01V.A0O(r5, str)) {
            AnonymousClass0WA r3 = null;
            if (r5.A0n != null) {
                r3 = r5.A0n.A01(r4.A03);
            }
            AnonymousClass0WK r1 = r5.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R = r5.A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r4.A06 = myTid;
                r4.A0A(str, zArr);
                A0R.A02(r3, r4);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                if (!(r5.A0n == null || r3 == null)) {
                    r5.A0n.A03(r3);
                    return this;
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
        return this;
    }
}
