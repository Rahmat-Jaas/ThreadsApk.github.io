package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.SparseArray;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.common.util.TriState;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.redex.IDxProviderShape104S0000000_I2;
import com.facebook.redex.IDxProviderShape243S0100000_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.CRC32;

/* renamed from: X.01V  reason: invalid class name */
public final class AnonymousClass01V implements QuickPerformanceLogger {
    public static AnonymousClass01V A0p;
    public AnonymousClass0W4 A00;
    public C09350fH A01;
    public C09780gf A02;
    public C10960jF A03;
    public C15130qm A04;
    public final C03700Kj A05;
    public final C03720Kl A06;
    public final AnonymousClass0e1 A07;
    public final AnonymousClass0WD A08;
    public final AnonymousClass0WK A09;
    public final AnonymousClass0IE A0A;
    public final C04730Ow A0B;
    public final AnonymousClass08V A0C;
    public final C12410lr A0D;
    public final C12430lt A0E;
    public final C12440lu A0F;
    public final AnonymousClass03R A0G;
    public final Runnable A0H;
    public final Map A0I;
    public final Random A0J = new Random();
    public final Set A0K;
    public final ConcurrentLinkedQueue A0L = new ConcurrentLinkedQueue();
    public final ReentrantLock A0M = new ReentrantLock();
    public final C04560Oe A0N;
    public final C04560Oe A0O;
    public final C04560Oe A0P;
    public final C04560Oe A0Q;
    public final C04560Oe A0R;
    public final C04560Oe A0S;
    public final C04560Oe A0T;
    public final C04560Oe A0U;
    public final C04560Oe A0V;
    public final C04560Oe A0W;
    public final C04560Oe A0X;
    public final C04560Oe A0Y;
    public final C04560Oe A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final C10390iG A0f;
    public volatile int A0g = 0;
    public volatile TriState A0h;
    public volatile TriState A0i;
    public volatile TriState A0j;
    public volatile AnonymousClass0WT A0k;
    public volatile AnonymousClass0WX A0l;
    public volatile C05900Ww A0m;
    public volatile C12020lB A0n;
    public volatile boolean A0o;

    private long A01(AnonymousClass0WA r8, String str, String str2, int i, long j, boolean z, boolean z2) {
        int i2;
        CRC32 crc32;
        byte[] bytes;
        if (z) {
            return C05910Wx.A00(1, 7, 1);
        }
        if (z2) {
            return A00(r8, i);
        }
        if (str != null) {
            i2 = (int) j;
            if (i2 != 0) {
                if (i2 == 1) {
                    return j;
                }
                crc32 = new CRC32();
                bytes = str.getBytes();
            }
            return C05910Wx.A00;
        } else if (str2 == null || str2.isEmpty()) {
            int i3 = (int) ((j >> 32) & 255);
            if (i3 == 1) {
                return C05910Wx.A00(this.A0k.CYu((int) j), (int) ((j >> 48) & 255), 1);
            }
            if ((i3 == 2 || i3 == 3) && ((int) j) != 0) {
                return j;
            }
            return C05910Wx.A00;
        } else {
            i2 = (int) j;
            if (i2 != 0) {
                if (i2 == 1) {
                    return j;
                }
                crc32 = new CRC32();
                bytes = str2.getBytes();
            }
            return C05910Wx.A00;
        }
        crc32.update(bytes);
        if (crc32.getValue() % ((long) i2) == 0) {
            return j;
        }
        return C05910Wx.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r15.A0k.BVp(r9) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.AnonymousClass0WT r13, X.C09350fH r14, X.AnonymousClass01V r15) {
        /*
            r5 = r15
            X.0qm r2 = r15.A04
            X.0WO r0 = r14.A0H
            if (r0 == 0) goto L_0x0045
            int r9 = r0.A01
        L_0x0009:
            long r10 = r13.B8d(r9)
            int r1 = (int) r10
            r0 = -1
            r13 = 0
            if (r1 != r0) goto L_0x0013
            r13 = 1
        L_0x0013:
            boolean r0 = A0M(r15)
            r4 = 1
            if (r0 != 0) goto L_0x0026
            boolean r0 = r15.A0L()
            if (r0 != 0) goto L_0x0026
            if (r2 == 0) goto L_0x002f
            boolean r0 = X.C10870j6.A00
            if (r0 == 0) goto L_0x002f
        L_0x0026:
            X.0WT r0 = r15.A0k
            boolean r0 = r0.BVp(r9)
            r12 = 1
            if (r0 == 0) goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            r6 = 0
            java.lang.String r7 = r14.A0L
            java.lang.String r8 = r14.A0M
            long r2 = r5.A01(r6, r7, r8, r9, r10, r12, r13)
            r14.A0C = r2
            int r1 = (int) r2
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0042
            r4 = 0
        L_0x0042:
            r14.A0Q = r4
            return
        L_0x0045:
            int r9 = r14.A03
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0C(X.0WT, X.0fH, X.01V):void");
    }

    private void A0K(Map map, int i, long j, short s) {
        int i2 = i;
        C09350fH A0S2 = A0S((AnonymousClass0WA) null, A04(i2, 0), (String) null, (String) null, TimeUnit.NANOSECONDS, i2, 0, 0, Process.myTid(), -1, -1, true, true);
        if (A0S2 != null) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    A0S2.A8X((String) entry.getKey(), (String) entry.getValue());
                }
            }
            A0S2.A08 = j;
            A0S2.A0O = s;
            A0S2.A0D = System.currentTimeMillis();
            A0S2.A0B = this.A06.nowNanos();
            A0S2.A0P = 1;
            A0k(A0S2, true);
        }
    }

    public final void A0W(int i) {
        AnonymousClass03R r3 = this.A0G;
        synchronized (r3) {
            r3.A06.put(Integer.valueOf(i), 1);
        }
    }

    public final void A0X(int i, int i2, long j, TimeUnit timeUnit, String str, boolean z) {
        int i3 = i;
        int i4 = i2;
        if (this.A0b) {
            this.A0K.add(Long.valueOf(AnonymousClass0WK.A00(i, i2)));
        }
        String str2 = str;
        C09350fH A0U2 = A0U(str2, (String) null, timeUnit, i3, i4, 0, j, z);
        if (this.A0a && A0U2 != null) {
            this.A0I.put(String.valueOf(AnonymousClass0WK.A00(i, i2)), str2);
        }
    }

    public final void A0b(int i, long j) {
        int i2 = i;
        if (this.A0b) {
            this.A0K.add(Long.valueOf(AnonymousClass0WK.A00(i, 0)));
        }
        long j2 = j;
        if (this.A0a) {
            String A072 = A07(i, 0, this.A0e, this.A0c, this.A0d);
            if (A0U(A072, (String) null, TimeUnit.MILLISECONDS, i2, 0, 0, j2, true) != null) {
                this.A0I.put(String.valueOf(AnonymousClass0WK.A00(i, 0)), A072);
                return;
            }
            return;
        }
        markerStart(i, 0, j, TimeUnit.MILLISECONDS);
    }

    public final void A0d(int i, String str) {
        markEventBuilder(i, str).setLevel(7).report();
    }

    public final void A0i(C09350fH r10, String str, String str2) {
        String str3 = str;
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            C09350fH r5 = r10;
            if (this.A0n != null) {
                r3 = this.A0n.A01(r10.A03);
            }
            this.A09.A09(r3, A0R(), r5, str3, str2, Process.myTid());
            C05900Ww r2 = this.A0m;
            if (!(r2 == null || this.A0k.AaP().AMf(r10.getMarkerId(), str) == -1)) {
                r2.Cb6(r10.getMarkerId(), r10.A02, str, str2);
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0n(String str, int i, int i2, int i3, int i4) {
        String str2 = str;
        int i5 = i;
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            this.A09.A0A(r3, A0R(), str2, i5, i2, i3, i4);
            C05900Ww r2 = this.A0m;
            if (r2 != null) {
                AnonymousClass0WO A042 = A04(i, i2);
                if (A042 != null) {
                    i5 = A042.A01;
                }
                if (this.A0k.AaP().AMf(i5, str) != -1) {
                    r2.Cb5(i5, i2, str, i3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0p(String str, int i, int i2, int i3, String str2) {
        String str3 = str;
        int i4 = i;
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            this.A09.A0B(r3, A0R(), str3, str2, i4, i2, i3);
            C05900Ww r2 = this.A0m;
            if (r2 != null) {
                AnonymousClass0WO A042 = A04(i, i2);
                if (A042 != null) {
                    i4 = A042.A01;
                }
                if (this.A0k.AaP().AMf(i4, str) != -1) {
                    r2.Cb6(i4, i2, str, str2);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final boolean isMarkerOn(int i) {
        return isMarkerOn(i, 0);
    }

    public final void markerDrop(int i) {
        markerDrop(i, 0);
    }

    public final void markerDropForUserFlow(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        A0v(TimeUnit.NANOSECONDS, i3, i4, 2, Process.myTid(), currentMonotonicTimestampNanos());
    }

    public final void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        markerEnd(i, 0, s, j, timeUnit);
    }

    public final void markerEndAtPoint(int i, int i2, short s, String str) {
        int i3 = i;
        int i4 = i2;
        if (this.A0b) {
            this.A0K.remove(Long.valueOf(AnonymousClass0WK.A00(i, i4)));
        }
        if (this.A0a) {
            String valueOf = String.valueOf(AnonymousClass0WK.A00(i, i4));
            Map map = this.A0I;
            if (map.containsKey(valueOf)) {
                map.remove(valueOf);
            }
        }
        A0f((AnonymousClass0WW) null, str, TimeUnit.NANOSECONDS, i3, i4, 0, Process.myTid(), -1, s);
    }

    public final void markerGenerate(int i, short s, long j, TimeUnit timeUnit) {
        long j2 = j;
        if (j > 0) {
            j2 = timeUnit.toNanos(j);
        }
        A0K((Map) null, i, j2, s);
    }

    public final void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map) {
        long j2 = j;
        if (j > 0) {
            j2 = timeUnit.toNanos(j);
        }
        A0K(map, i, j2, s);
    }

    public final void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
        A0X(i, i2, j, timeUnit, str, z);
    }

    public final MarkerEditor withMarker(int i) {
        return withMarker(i, 0);
    }

    /* JADX INFO: finally extract failed */
    private long A00(AnonymousClass0WA r12, int i) {
        int i2;
        int i3;
        C12020lB r2 = this.A0n;
        if (r2 != null && !r2.A01.getAndSet(true)) {
            C09300fC r4 = r2.A00;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            AnonymousClass0WT r3 = r4.A01;
            long B8d = r3.B8d(27787268);
            int i4 = (int) B8d;
            if (!(i4 == -1 || r3.CYu(i4) == Integer.MAX_VALUE)) {
                C09350fH A012 = C09300fC.A01(r4, timeUnit, 27787268, 0, B8d);
                A012.A03("markerId", i);
                r4.A00.execute(A012);
            }
        }
        AnonymousClass0WD r22 = this.A08;
        r22.A00(r12);
        try {
            int i5 = this.A0B.get(i, com.facebook.forker.Process.WAIT_RESULT_TIMEOUT);
            r22.A01(r12);
            if (i5 != Integer.MIN_VALUE) {
                i2 = this.A0k.CYu(i5);
                i3 = 4;
            } else {
                i2 = this.A0k.CYu(Integer.MAX_VALUE);
                i3 = 3;
            }
            return C05910Wx.A00(i2, i3, 1);
        } catch (Throwable th) {
            r22.A01(r12);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r8.BVp(r5) != false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.quicklog.EventBuilder A02(X.AnonymousClass0WO r31, java.lang.String r32, int r33) {
        /*
            r30 = this;
            r6 = r30
            X.0lB r9 = r6.A0n
            r5 = r33
            if (r9 == 0) goto L_0x0152
            X.0WA r4 = r9.A01(r5)
        L_0x000c:
            long r0 = r6.currentMonotonicTimestampNanos()
            long r19 = java.lang.System.currentTimeMillis()
            X.0WT r8 = r6.A0k
            long r2 = r8.B8d(r5)
            if (r4 == 0) goto L_0x001e
            r4.A07 = r2
        L_0x001e:
            X.0qm r10 = r6.A04
            long r15 = r8.AvZ(r5)
            int r11 = (int) r2
            r7 = -1
            r13 = 0
            if (r11 != r7) goto L_0x002a
            r13 = 1
        L_0x002a:
            boolean r7 = A0M(r6)
            if (r7 != 0) goto L_0x003c
            boolean r7 = r6.A0L()
            if (r7 != 0) goto L_0x003c
            if (r10 == 0) goto L_0x0043
            boolean r7 = X.C10870j6.A00
            if (r7 == 0) goto L_0x0043
        L_0x003c:
            boolean r7 = r8.BVp(r5)
            r12 = 1
            if (r7 == 0) goto L_0x0044
        L_0x0043:
            r12 = 0
        L_0x0044:
            r14 = 0
            r21 = r6
            r22 = r4
            r23 = r14
            r24 = r14
            r25 = r5
            r26 = r2
            r28 = r12
            r29 = r13
            long r2 = r21.A01(r22, r23, r24, r25, r26, r28, r29)
            X.0WW r11 = r6.A0R()
            int r8 = (int) r2
            r7 = 2147483647(0x7fffffff, float:NaN)
            r10 = r31
            if (r8 == r7) goto L_0x00f2
            java.util.Random r8 = r6.A0J
            int r18 = r8.nextInt(r7)
            r8 = 0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            int r17 = android.os.Process.myTid()
            r9 = 1
            X.0fH r7 = new X.0fH
            r7.<init>()
            r7.A03 = r5
            r7.A0C = r2
            r7.A09 = r15
            r7.A0R = r12
            r7.A0S = r13
            long r2 = r11.toNanos(r0)
            r7.A0B = r2
            r7.A0W = r9
            long r2 = r11.toNanos(r0)
            r7.A0A = r2
            r2 = r19
            r7.A0D = r2
            r7.A02 = r8
            r2 = r18
            r7.A07 = r2
            r7.A0P = r9
            r7.A01 = r8
            r7.A0Q = r9
            r7.A0T = r9
            r2 = 0
            r7.A08 = r2
            r2 = r17
            r7.A06 = r2
            r7.A0L = r14
            r7.A0M = r14
            X.0WK r2 = r6.A09
        L_0x00b0:
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r8
            r21 = r15
            X.0Jz r2 = r17.A05(r18, r19, r20, r21)
            r7.A0J = r2
        L_0x00c0:
            r7.A0H = r10
            r2 = 7
            r7.A00 = r2
            r7.A09 = r15
            r2 = r32
            r7.A0N = r2
            if (r4 == 0) goto L_0x00d8
            boolean r2 = r7.A0Q
            r4.A0L = r2
            long r2 = r6.currentMonotonicTimestampNanos()
            long r2 = r2 - r0
            r4.A02 = r2
        L_0x00d8:
            java.lang.ThreadLocal r1 = X.C08660e2.A03
            java.lang.Object r0 = r1.get()
            X.0e2 r0 = (X.C08660e2) r0
            if (r0 != 0) goto L_0x00ee
            X.0e2 r0 = new X.0e2
            r0.<init>()
        L_0x00e7:
            r0.A01 = r7
            r0.A02 = r6
            r0.A00 = r4
            return r0
        L_0x00ee:
            r1.set(r14)
            goto L_0x00e7
        L_0x00f2:
            if (r11 == 0) goto L_0x0155
            X.0fP r3 = r11.A03
            if (r3 == 0) goto L_0x012b
            long r12 = r3.A01(r5)
            r17 = 0
            int r2 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x010e
            if (r31 == 0) goto L_0x012b
            int r2 = r10.A00
            long r12 = r3.A01(r2)
            int r2 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x012b
        L_0x010e:
            java.util.Random r2 = r6.A0J
            int r20 = r2.nextInt(r7)
            r19 = 0
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.NANOSECONDS
            r25 = 1
            int r22 = android.os.Process.myTid()
            r21 = r19
            r23 = r0
            r26 = r25
            r18 = r5
            X.0fH r7 = X.C09350fH.A00(r17, r18, r19, r20, r21, r22, r23, r25, r26)
            goto L_0x00c0
        L_0x012b:
            boolean r2 = r11.A05(r10, r5)
            if (r2 == 0) goto L_0x0155
            java.util.Random r2 = r6.A0J
            int r20 = r2.nextInt(r7)
            r8 = 0
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.NANOSECONDS
            r25 = 1
            int r22 = android.os.Process.myTid()
            r21 = r8
            r23 = r0
            r26 = r25
            r18 = r5
            r19 = r8
            X.0fH r7 = X.C09350fH.A00(r17, r18, r19, r20, r21, r22, r23, r25, r26)
            X.0WK r2 = r6.A09
            goto L_0x00b0
        L_0x0152:
            r4 = 0
            goto L_0x000c
        L_0x0155:
            if (r9 == 0) goto L_0x015c
            if (r4 == 0) goto L_0x015c
            r9.A02(r4)
        L_0x015c:
            X.0el r0 = X.C09040el.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A02(X.0WO, java.lang.String, int):com.facebook.quicklog.EventBuilder");
    }

    private AnonymousClass0WO A03(int i, int i2) {
        AnonymousClass0WO r0;
        AnonymousClass08V r2 = this.A0C;
        synchronized (r2) {
            int indexOfKey = r2.indexOfKey(AnonymousClass0WK.A00(i, i2));
            if (indexOfKey < 0) {
                r0 = null;
            } else {
                r0 = (AnonymousClass0WO) r2.valueAt(indexOfKey);
                r2.removeAt(indexOfKey);
            }
        }
        return r0;
    }

    private AnonymousClass0WO A04(int i, int i2) {
        AnonymousClass0WO r0;
        AnonymousClass08V r2 = this.A0C;
        synchronized (r2) {
            r0 = (AnonymousClass0WO) r2.get(AnonymousClass0WK.A00(i, i2));
        }
        return r0;
    }

    private ListenableFuture A05(C09350fH r13) {
        AnonymousClass0W4 r6 = this.A00;
        A0H(r6, "BackgroundExecution", "mature");
        C04560Oe r1 = this.A0X;
        C09350fH r8 = r13;
        if (r13.BNh()) {
            C08640dy A032 = this.A07.A03();
            for (AnonymousClass0W9 r2 : (Collection) r1.get()) {
                if (r13.BWA(r2.BgD()) && r2.BTR(A032)) {
                    r13.AvU().A01(r2.AHL());
                    r2.CCC(r13);
                }
            }
        }
        ListenableFuture A012 = C30954Gc6.A01((Object) null);
        C09780gf r9 = this.A02;
        if (r9 != null && r13.BNh()) {
            C08640dy A033 = this.A07.A03();
            for (int i : r9.A01) {
                if (r13.BWB(i)) {
                    SettableFuture create = SettableFuture.create();
                    C30954Gc6.A00(A012).A00(new C05860Wn(r6, A033, r8, r9, create, i), r6);
                    A012 = create;
                }
            }
        }
        return A012;
    }

    public static String A07(int i, int i2, boolean z, boolean z2, boolean z3) {
        StringBuilder sb;
        String str;
        if (z) {
            sb = new StringBuilder();
            sb.append(C03480Iw.A00().toString());
            str = Integer.toString(i);
        } else {
            if (z2) {
                Random random = new Random();
                sb = new StringBuilder();
                sb.append(random.nextInt(Integer.MAX_VALUE));
                str = "-";
                sb.append(str);
                sb.append(System.currentTimeMillis());
            } else if (!z3) {
                return "fixed-join-id";
            } else {
                Random random2 = new Random();
                sb = new StringBuilder();
                sb.append(random2.nextInt(Integer.MAX_VALUE));
                str = "-";
            }
            sb.append(str);
            sb.append(Integer.toString(i));
        }
        sb.append(str);
        sb.append(Integer.toString(i2));
        return sb.toString();
    }

    public static String A08(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString().replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    private void A09(int i, int i2, long j) {
        AnonymousClass0WK r5 = this.A09;
        if (j != -1) {
            long A002 = AnonymousClass0WK.A00(i, i2);
            ReentrantLock reentrantLock = r5.A06.A01;
            reentrantLock.lock();
            try {
                C09350fH A032 = r5.A05.A03((AnonymousClass0WA) null, A002);
                if (A032 != null) {
                    A032.A0E = j;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static void A0D(AnonymousClass0WW r17, C09350fH r18, boolean z) {
        C09350fH r5 = r18;
        AnonymousClass0WW r8 = r17;
        if (!r8.A06(r5.A0H, r5.A03, r5.A01)) {
            return;
        }
        if (r5.A0N != null) {
            r8.A03((AnonymousClass0WA) null, r5);
            return;
        }
        C09320fE r11 = new C09320fE(r5);
        r11.A01 = r5.A0B;
        r11.A00 = r8.A00(r5.A0H, r5.getMarkerId(), r5.A02);
        C09420fP r4 = r8.A03;
        if (r4 != null) {
            C09420fP.A00((AnonymousClass0WA) null, r11, r4, 1);
        }
        String str = null;
        int i = 0;
        for (String str2 : r5.A0Z.A03()) {
            if (i % 2 == 0) {
                str = str2;
            } else {
                r11.A02 = str;
                r11.A03 = str2;
                r8.A02((AnonymousClass0WA) null, r11);
            }
            i++;
        }
        AnonymousClass0WF r3 = r5.A0G;
        if (r3 != null) {
            int i2 = r3.A00;
            for (int i3 = 0; i3 < i2; i3++) {
                String str3 = r3.A05[i3];
                AnonymousClass0WQ r10 = r3.A03[i3];
                long millis = TimeUnit.NANOSECONDS.toMillis(r3.A02[i3]);
                long j = r3.A02[i3];
                int i4 = r3.A01[i3];
                r11.A01 = j;
                r8.A01((AnonymousClass0WA) null, r10, r11, str3, i4, millis, j, false);
            }
        }
        if (z) {
            r11.A01 = r5.A0B + r5.A08;
            r8.A04(r5.A0H, r5.getMarkerId());
            if (r4 != null) {
                C09420fP.A00((AnonymousClass0WA) null, r11, r4, 2);
            }
        }
    }

    public static synchronized void A0F(AnonymousClass01V r7, String str, int i) {
        String str2;
        synchronized (r7) {
            int length = str.length();
            int i2 = ((length + 1000) - 1) / 1000;
            int i3 = 0;
            while (i3 < i2) {
                if (i3 > 0) {
                    str2 = "...";
                } else {
                    str2 = "";
                }
                int i4 = i3 * 1000;
                i3++;
                String A0L2 = AnonymousClass00U.A0L(str2, str.substring(i4, Math.min(i3 * 1000, length)));
                if (!(i == 2 || i == 3)) {
                    AnonymousClass0LU.A0C("QuickPerformanceLoggerImpl", A0L2);
                }
            }
        }
    }

    public static void A0H(Object obj, String str, String str2) {
        if (obj == null) {
            throw new IllegalStateException(AnonymousClass00U.A0h("Component ", str, " should already be resolved, but was not. Check if the ", str2, " is a correct stage, or a stack trace: why it is called earlier then expected?"));
        }
    }

    public static void A0I(String str, StringBuilder sb, List list) {
        sb.append('\"');
        sb.append(str);
        sb.append("\":[");
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
            }
            sb.append('\"');
            sb.append(A08(next));
            sb.append('\"');
            z = false;
        }
        sb.append("]");
    }

    public static void A0J(String str, StringBuilder sb, Map map) {
        sb.append('\"');
        sb.append(str);
        sb.append("\":{");
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            if (entry.getValue() instanceof Map) {
                A0J(entry.getKey().toString(), sb, (Map) entry.getValue());
            } else {
                sb.append('\"');
                sb.append(entry.getKey());
                sb.append("\":\"");
                sb.append(A08(entry.getValue()));
                sb.append('\"');
            }
            z = false;
        }
        sb.append("}");
    }

    private boolean A0L() {
        TriState triState;
        if (this.A04 == null) {
            return false;
        }
        if (this.A0j == TriState.UNSET) {
            if ("true".equals(System.getProperty("perfmarker_send_all", ""))) {
                triState = TriState.YES;
            } else {
                triState = TriState.NO;
            }
            this.A0j = triState;
        }
        return this.A0j.asBoolean(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3.A0h.asBoolean(false) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0M(X.AnonymousClass01V r3) {
        /*
            X.0qm r0 = r3.A04
            r2 = 0
            if (r0 == 0) goto L_0x001b
            com.facebook.common.util.TriState r1 = r3.A0h
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET
            if (r1 != r0) goto L_0x0013
            boolean r0 = X.C10870j6.A00
            if (r0 != 0) goto L_0x0024
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.NO
        L_0x0011:
            r3.A0h = r0
        L_0x0013:
            com.facebook.common.util.TriState r0 = r3.A0h
            boolean r0 = r0.asBoolean(r2)
            if (r0 != 0) goto L_0x0022
        L_0x001b:
            boolean r1 = A0N(r3)
            r0 = 0
            if (r1 == 0) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            return r0
        L_0x0024:
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.YES
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0M(X.01V):boolean");
    }

    public static boolean A0N(AnonymousClass01V r3) {
        TriState triState;
        if (r3.A04 == null) {
            return false;
        }
        if (r3.A0i == TriState.UNSET) {
            if ("true".equals(System.getProperty("perfmarker_to_logcat_json", ""))) {
                triState = TriState.YES;
            } else {
                triState = TriState.NO;
            }
            r3.A0i = triState;
        }
        return r3.A0i.asBoolean(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r0 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0O(X.AnonymousClass01V r1, java.lang.String r2) {
        /*
            if (r2 == 0) goto L_0x0009
            boolean r0 = r2.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            r2 = 1
        L_0x000a:
            X.0lB r1 = r1.A0n
            if (r2 == 0) goto L_0x0018
            if (r1 == 0) goto L_0x0018
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            r1.A06(r0)
        L_0x0018:
            r0 = r2 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0O(X.01V, java.lang.String):boolean");
    }

    public static AnonymousClass0W6[] A0P(Context context) {
        return new AnonymousClass0W6[]{new C03160Eo(), new AnonymousClass0FB((ActivityManager) context.getSystemService("activity")), new AnonymousClass0FC(), new AnonymousClass0FD(), AnonymousClass0XS.A00(), new C12000l9(), new AnonymousClass0FY(), new AnonymousClass0FE(SimpleTrafficTransportMonitor.getInstance()), new AnonymousClass0Ev(), new C11970l6(), new C03150En(), new C41374MGd(new C10780iv())};
    }

    public final long A0Q(long j, TimeUnit timeUnit) {
        if (j == -1) {
            return this.A06.nowNanos();
        }
        return timeUnit.toNanos(j);
    }

    public final AnonymousClass0WW A0R() {
        AnonymousClass0WX r0 = this.A0l;
        if (r0 == null) {
            return AnonymousClass0WW.A08;
        }
        return r0.A02;
    }

    public final C09350fH A0U(String str, String str2, TimeUnit timeUnit, int i, int i2, int i3, long j, boolean z) {
        String str3 = str;
        if (str == null) {
            return null;
        }
        String str4 = str2;
        C09350fH A0T2 = A0T(A0R(), str3, str4, timeUnit, i, i2, i3, Process.myTid(), -1, j, z, true);
        if (A0T2 == null) {
            return A0T2;
        }
        AnonymousClass0WK r13 = this.A09;
        r13.A09((AnonymousClass0WA) null, A0R(), A0T2, "join_id", str3, Process.myTid());
        r13.A09((AnonymousClass0WA) null, A0R(), A0T2, "source", DexOptimization.OPT_KEY_CLIENT, Process.myTid());
        AnonymousClass0WK r4 = r13;
        r4.A09((AnonymousClass0WA) null, A0R(), A0T2, "sampling_basis", str4, Process.myTid());
        return A0T2;
    }

    public final void A0V(int i) {
        AnonymousClass03R r2 = this.A0G;
        synchronized (r2) {
            r2.A06.remove(Integer.valueOf(i));
        }
    }

    public final void A0Y(int i, int i2, String str) {
        markerPoint(i, i2, AnonymousClass00U.A0L("join_response_", str));
    }

    public final void A0Z(int i, int i2, String str) {
        A0X(i, i2, -1, TimeUnit.NANOSECONDS, str, true);
    }

    public final /* synthetic */ void A0g(C09350fH r24, SettableFuture settableFuture) {
        ReadWriteLock readWriteLock;
        Lock lock;
        HashMap hashMap;
        long j;
        long j2;
        AnonymousClass0Wg[] r1;
        C09350fH r3 = r24;
        SettableFuture settableFuture2 = settableFuture;
        try {
            C08910eV r9 = A0R().A02;
            if (r9 != null) {
                AnonymousClass0WO r12 = r3.A0H;
                if (r12 == null) {
                    j2 = r9.A02(r3.getMarkerId(), 0);
                } else {
                    j2 = r9.A02(r12.A00, 0) | r9.A02(r12.A01, 0);
                }
                if (!(j2 == 0 || (r1 = r9.A02) == null)) {
                    for (int i = 0; i < r1.length; i++) {
                    }
                }
            }
            for (AnonymousClass0Wh r2 : (Collection) this.A0Y.get()) {
                C02970Dp r22 = (C02970Dp) r2;
                readWriteLock = r22.A08;
                readWriteLock.readLock().lock();
                try {
                    boolean z = r22.A03;
                    readWriteLock.readLock().unlock();
                    if (!z) {
                        readWriteLock.writeLock().lock();
                        if (!r22.A03) {
                            boolean equals = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(C02640Cf.A01("facebook.PerfSocketEnabled"));
                            r22.A02 = equals;
                            if (equals) {
                                int parseInt = Integer.parseInt(C02640Cf.A01("facebook.PerfSocketNumEvents"));
                                r22.A01 = new HashSet();
                                for (int i2 = 0; i2 < parseInt; i2++) {
                                    r22.A01.add(C02640Cf.A01(AnonymousClass00U.A0J("facebook.PerfSocketEvent", i2)));
                                }
                                r22.A00 = Integer.parseInt(C02640Cf.A01("facebook.PerfSocketPort"));
                                r22.A04 = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(C02640Cf.A01("facebook.PerfSocketReqConfirm"));
                            }
                            r22.A03 = true;
                        }
                        readWriteLock.writeLock().unlock();
                    }
                    if (r22.A02) {
                        int markerId = r3.getMarkerId();
                        String A002 = C07120av.A00(r3.getMarkerId());
                        String A003 = C06030Xj.A00(r3.AOk());
                        long BGw = r3.BGw();
                        int AeK = r3.AeK();
                        HashMap hashMap2 = new HashMap();
                        AnonymousClass0LU.A0O("MobileLabQPLSocketPublishListener", "QuickEvent %s(%d)'s enabled metadata categories: %d", C07120av.A00(r3.getMarkerId()), Integer.valueOf(r3.getMarkerId()), Long.valueOf(r3.Aff()));
                        AnonymousClass0LU.A0O("MobileLabQPLSocketPublishListener", "Is perf_event_info enabled: %b", Boolean.valueOf(r3.BWA(4294967296L)));
                        if (r3.BNh()) {
                            r3.AvU().A00(new C12260lb(r22, hashMap2));
                            AnonymousClass0QX B18 = r3.B18();
                            if (B18 == null || !B18.A0S) {
                                hashMap = Collections.emptyMap();
                            } else {
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("ps_cpu_ms", Long.valueOf(B18.A09));
                                hashMap3.put("ps_flt", Long.valueOf(B18.A0A));
                                if (B18.A0S && B18.A02 != -1) {
                                    hashMap3.put("th_cpu_ms", Long.valueOf(B18.A0C));
                                    hashMap3.put("th_flt", Long.valueOf(B18.A0D));
                                }
                                hashMap3.put("allocstall", Long.valueOf(B18.A03));
                                hashMap3.put("pages_in", Long.valueOf(B18.A04));
                                hashMap3.put("pages_out", Long.valueOf(B18.A05));
                                if (B18.A0M == null) {
                                    j = -1;
                                } else {
                                    C02780Cw r13 = AnonymousClass0Cv.A00;
                                    r13.A00.block();
                                    j = r13.A03.get();
                                }
                                hashMap3.put("avail_disk_spc_kb", Long.valueOf(j));
                                hashMap3.put("class_load_attempts", Long.valueOf((long) B18.A0N.A00));
                                hashMap3.put("class_loads_failed", Long.valueOf((long) B18.A0N.A01));
                                hashMap3.put("dex_queries", Long.valueOf((long) B18.A0N.A02));
                                hashMap3.put("locator_assists", Long.valueOf((long) B18.A0N.A04));
                                hashMap3.put("wrong_dfa_guesses", Long.valueOf((long) B18.A0N.A03));
                                hashMap = hashMap3;
                            }
                            hashMap2.putAll(hashMap);
                        }
                        ArrayList arrayList = new ArrayList(r3.Ago());
                        ArrayList arrayList2 = arrayList;
                        C18070w4 r122 = new C18070w4(A002, A003, r22.A06, arrayList2, new ArrayList(r3.BFU()), hashMap2, markerId, AeK, BGw);
                        if (r3.B22() != null) {
                            r3.B22().A00(new C12240lZ(r3, r122, r22, C07120av.A00(r3.getMarkerId())));
                        }
                        C18060w3 r5 = null;
                        List list = r22.A07;
                        synchronized (list) {
                            try {
                                list.add(r122);
                                readWriteLock.readLock().lock();
                                Set set = r22.A01;
                                if (set != null && (set.contains("*") || r22.A01.contains(r122.A04))) {
                                    r5 = new C18060w3(r22);
                                }
                                readWriteLock.readLock().unlock();
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        if (r5 != null) {
                            AnonymousClass0gN.A00().AKp(new C14820qD(r22, r5));
                        }
                    }
                    if (r22.A02) {
                        String.format("visit() %s %s", new Object[]{C07120av.A00(r3.getMarkerId()), C06030Xj.A00(r3.AOk())});
                    }
                } catch (Throwable th2) {
                    th = th2;
                    lock = readWriteLock.readLock();
                    lock.unlock();
                    throw th;
                }
            }
            settableFuture2.set(r3);
        } catch (Throwable th3) {
            settableFuture2.set(r3);
            throw th3;
        }
    }

    public final void A0j(C09350fH r20, String str, String str2, TimeUnit timeUnit, int i, int i2, int i3, long j) {
        AnonymousClass0WQ r8;
        String str3 = str;
        if (A0O(this, str3)) {
            AnonymousClass0WA r7 = null;
            C09350fH r10 = r20;
            if (this.A0n != null) {
                r7 = this.A0n.A01(r10.A03);
            }
            long j2 = j;
            boolean z = false;
            if (j == -1) {
                z = true;
            }
            long A0Q2 = A0Q(j2, timeUnit);
            AnonymousClass0WK r6 = this.A09;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            boolean z2 = !z;
            AnonymousClass0WW A0R2 = A0R();
            AnonymousClass0WD r4 = r6.A06;
            r4.A00(r7);
            String str4 = str2;
            if (str2 != null) {
                try {
                    r8 = new AnonymousClass0WQ();
                    r8.A00("__key", str4, 1);
                    r8.A03 = true;
                } catch (Throwable th) {
                    r4.A01(r7);
                    throw th;
                }
            } else {
                r8 = null;
            }
            r4.A01(r7);
            r6.A07(r7, r8, A0R2, r10, str3, timeUnit2, i, i2, i3, A0Q2, z2);
            A0G(this, "markerPoint", str3, str4, r10.A03);
            if (this.A0n != null && r7 != null) {
                this.A0n.A04(r7);
            }
        }
    }

    public final void A0k(C09350fH r4, boolean z) {
        if (!z) {
            AnonymousClass0W4 r2 = this.A00;
            A0H(r2, "BackgroundExecution", "MATURE");
            r2.execute(new C05880Wq(r2, r4, this));
        } else if (this.A0g != 3) {
            this.A0L.add(r4);
        } else {
            while (r4 != null) {
                A0k(r4, false);
                r4 = (C09350fH) this.A0L.poll();
            }
        }
    }

    public final void A0l(String str) {
        AnonymousClass03R r2 = this.A0G;
        r2.A04.A00 = str;
        AtomicReference atomicReference = r2.A08;
        if (str == null) {
            atomicReference.set((Object) null);
            r2.A09.get();
            return;
        }
        atomicReference.set((Object) null);
        r2.A01.execute(new C18010vv(r2));
    }

    public final void A0v(TimeUnit timeUnit, int i, int i2, int i3, int i4, long j) {
        int i5;
        int i6 = i;
        int i7 = i2;
        if (this.A0b) {
            this.A0K.remove(Long.valueOf(AnonymousClass0WK.A00(i, i2)));
        }
        if (this.A0a) {
            String valueOf = String.valueOf(AnonymousClass0WK.A00(i, i2));
            Map map = this.A0I;
            if (map.containsKey(valueOf)) {
                map.remove(valueOf);
            }
        }
        AnonymousClass0WO A032 = A03(i, i2);
        if (A032 == null) {
            i5 = i;
        } else {
            i5 = A032.A01;
        }
        C05900Ww r1 = this.A0m;
        if (!((i3 & 2) == 0 || r1 == null)) {
            r1.Cb7(i5, i2);
        }
        if (this.A09.A04(A0R(), timeUnit, i6, i7, i4, j) != null) {
            A0G(this, "markerDrop", (String) null, (String) null, i);
        }
    }

    public final long currentMonotonicTimestamp() {
        return TimeUnit.NANOSECONDS.toMillis(this.A06.nowNanos());
    }

    public final long currentMonotonicTimestampNanos() {
        return this.A06.nowNanos();
    }

    public final void endAllInstancesOfMarker(int i, short s) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        int myTid = Process.myTid();
        int i2 = i;
        for (Number intValue : this.A09.A06(i)) {
            A0f(A0R(), (String) null, timeUnit, i2, intValue.intValue(), 0, myTid, -1, s);
        }
    }

    public final void endAllMarkers(short s, boolean z) {
        ReentrantLock reentrantLock;
        int i;
        TriState triState;
        if (this.A0b) {
            this.A0K.clear();
        }
        if (this.A0a) {
            this.A0I.clear();
        }
        long currentMonotonicTimestampNanos = currentMonotonicTimestampNanos();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        int myTid = Process.myTid();
        if (this.A04 != null) {
            if (this.A0h == TriState.UNSET) {
                if (!C10870j6.A00) {
                    triState = TriState.NO;
                } else {
                    triState = TriState.YES;
                }
                this.A0h = triState;
            }
            if (this.A0h.asBoolean(false)) {
                A0F(this, "endAllMarkers", 2);
            }
        }
        C05900Ww r0 = this.A0m;
        if (r0 != null) {
            r0.CbB();
        }
        AnonymousClass0WK r5 = this.A09;
        AnonymousClass0WW A0R2 = A0R();
        boolean z2 = false;
        short s2 = s;
        if (s2 == 4340) {
            z2 = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<C09350fH> arrayList2 = new ArrayList<>();
        SparseArray sparseArray = new SparseArray();
        ReentrantLock reentrantLock2 = r5.A06.A01;
        reentrantLock2.lock();
        ReentrantLock reentrantLock3 = r5.A07.A01;
        reentrantLock3.lock();
        try {
            AnonymousClass0W1 r8 = r5.A05;
            reentrantLock = r8.A04.A01;
            reentrantLock.lock();
            AnonymousClass08V r21 = r8.A05;
            int size = r21.size();
            reentrantLock.unlock();
            for (int i2 = 0; i2 < size; i2++) {
                C09350fH A012 = r8.A01(i2);
                if ((z && A012.A0T) || (z2 && A012.A0U)) {
                    if (A012.A0E != -1) {
                        long millis = timeUnit.toMillis(currentMonotonicTimestampNanos) - A012.AwQ();
                        AnonymousClass0WF r02 = A012.A0G;
                        if (r02 != null && (i = r02.A00) > 0) {
                            millis -= timeUnit.toMillis(r02.A02[i - 1]);
                        }
                        if (millis > A012.A0E) {
                            sparseArray.put(A012.A07, 1);
                        }
                    }
                    arrayList.add(A012);
                }
                arrayList2.add(A012);
            }
            reentrantLock.lock();
            r21.clear();
            reentrantLock.unlock();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C09350fH r9 = (C09350fH) it.next();
                r8.A04(r9, AnonymousClass0WK.A00(r9.A03, r9.A02));
            }
            reentrantLock3.unlock();
            reentrantLock2.unlock();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C09350fH r92 = (C09350fH) it2.next();
                reentrantLock2.lock();
                try {
                    long j = r92.A09;
                    AnonymousClass0WK r212 = r5;
                    r92.A0J = r212.A05((AnonymousClass0WA) null, r92.A03, r92.A02, j);
                    AnonymousClass0WK.A03(r5, r92.A0I, r92.A09);
                    AnonymousClass0WK.A02(r212, r92, timeUnit, currentMonotonicTimestampNanos, s2);
                    if (((Integer) sparseArray.get(r92.A07, -1)).intValue() == 1) {
                        r92.A0O = 113;
                    } else {
                        r92.A0P = s2;
                    }
                    r92.A06 = myTid;
                    r92.A0A = timeUnit.toNanos(currentMonotonicTimestampNanos);
                    C09420fP r1 = A0R2.A03;
                    if (r1 != null) {
                        C09420fP.A00((AnonymousClass0WA) null, r92, r1, 2);
                    }
                    reentrantLock2.unlock();
                } catch (Throwable th) {
                    th = th;
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            for (C09350fH r3 : arrayList2) {
                A0G(this, "markerEnd", (String) null, (String) null, r3.getMarkerId());
                AnonymousClass0WO r03 = r3.A0H;
                if (r03 != null) {
                    A03(r03.A00, r3.A02);
                }
                A0k(r3, true);
            }
        } catch (Throwable th2) {
            th = th2;
            reentrantLock3.unlock();
            reentrantLock2.unlock();
            throw th;
        }
    }

    public final void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, AnonymousClass00U.A0L("join_request_", str), j, timeUnit);
    }

    public final void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, AnonymousClass00U.A0L("join_response_", str), j, timeUnit);
    }

    public final void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        String str2 = str;
        A0f((AnonymousClass0WW) null, str2, TimeUnit.NANOSECONDS, i, i2, 2, Process.myTid(), -1, s);
    }

    public final void markerEndForUserFlow(int i, String str, int i2, short s) {
        String str2 = str;
        A0f((AnonymousClass0WW) null, str2, TimeUnit.NANOSECONDS, i, i2, 2, Process.myTid(), -1, s);
    }

    public final void markerLinkPivot(int i, int i2, String str) {
        AnonymousClass08V r3 = this.A0C;
        synchronized (r3) {
            r3.put(AnonymousClass0WK.A00(i, i2), new AnonymousClass0WO(i, this.A0k.Cep(i, str), str));
        }
    }

    public final void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        int i3 = i;
        int i4 = i2;
        A0T(A0R(), (String) null, (String) null, TimeUnit.NANOSECONDS, i3, i4, 2, Process.myTid(), -1, -1, z, true);
        A09(i3, i4, j);
    }

    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit, String str) {
        int i3 = i;
        int i4 = i2;
        if (this.A0b) {
            this.A0K.add(Long.valueOf(AnonymousClass0WK.A00(i3, i4)));
        }
        boolean z2 = z;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        String str2 = str;
        if (this.A0a) {
            String A072 = A07(i3, i4, this.A0e, this.A0c, this.A0d);
            if (A0U(A072, str2, timeUnit2, i3, i4, 0, j2, z2) != null) {
                this.A0I.put(String.valueOf(AnonymousClass0WK.A00(i3, i4)), A072);
                return;
            }
            return;
        }
        C09350fH A0T2 = A0T(A0R(), (String) null, str2, timeUnit2, i3, i4, 0, Process.myTid(), -1, j2, z2, true);
        if (A0T2 != null) {
            AnonymousClass0WK r0 = this.A09;
            AnonymousClass0WK r7 = r0;
            r7.A09((AnonymousClass0WA) null, A0R(), A0T2, "sampling_basis", str2, Process.myTid());
        }
    }

    public final void markerTag(int i, int i2, String str) {
        this.A09.A0D(A0R(), str, i, i2);
    }

    public final int sampleRateForMarker(int i) {
        C15130qm r4 = this.A04;
        int B8d = (int) this.A0k.B8d(i);
        boolean z = false;
        if (B8d == -1) {
            z = true;
        }
        if (A0M(this) || A0L() || (r4 != null && C10870j6.A00)) {
            return 1;
        }
        if (z) {
            return (int) A00((AnonymousClass0WA) null, i);
        }
        return B8d;
    }

    public final void updateListenerMarkers() {
        C12440lu r6;
        AnonymousClass0WX r1 = this.A0l;
        if (r1 != null) {
            synchronized (r1) {
                AnonymousClass0WW r2 = r1.A02;
                C03720Kl r3 = r2.A00;
                if (!(r3 == null || (r6 = r2.A05) == null)) {
                    AnonymousClass0Wg[] r7 = r2.A06;
                    r2 = new AnonymousClass0WW(r3, r2.A01, r2.A04, r6, r7);
                }
                r1.A02 = r2;
            }
        }
    }

    private ListenableFuture A06(C09350fH r4, Executor executor) {
        SettableFuture create = SettableFuture.create();
        C30954Gc6.A00(A05(r4)).A00(new AnonymousClass0Wr(r4, create, this), executor);
        return create;
    }

    public static /* synthetic */ void A0B(AnonymousClass0W4 r5, C08640dy r6, C09350fH r7, C09780gf r8, SettableFuture settableFuture, int i) {
        Object obj;
        Object obj2;
        AnonymousClass0W6 A002 = r8.A00(i);
        if (!A002.BTR(r6)) {
            settableFuture.set((Object) null);
            return;
        }
        int B52 = A002.B52();
        AnonymousClass0Jz r0 = r7.A0I;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.get(B52);
        }
        AnonymousClass0Jz r02 = r7.A0J;
        if (r02 == null) {
            obj2 = null;
        } else {
            obj2 = r02.get(B52);
        }
        r7.AvU().A01(A002.B51());
        A002.AHJ(r7, A002.BDT().cast(obj), A002.BCf().cast(obj2)).addListener(new AnonymousClass0Ws(settableFuture), r5);
    }

    public static void A0G(AnonymousClass01V r3, String str, String str2, String str3, int i) {
        String str4;
        if (A0M(r3)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            r3.A0Z.get();
            sb.append(C07120av.A00(i));
            sb.append(" (");
            sb.append(i);
            sb.append(") ");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = ":";
            }
            sb.append(str4);
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            A0F(r3, sb.toString(), 2);
        }
    }

    public final void A0a(int i, int i2, String str, boolean z, int i3) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            AnonymousClass0WK r6 = this.A09;
            AnonymousClass0WW A0R2 = A0R();
            long A002 = AnonymousClass0WK.A00(i, i2);
            AnonymousClass0W1 r4 = r6.A05;
            if (r4.A05(r3, A0R2, A002)) {
                AnonymousClass0WD r2 = r6.A06;
                r2.A00(r3);
                try {
                    C09350fH A032 = r4.A03(r3, A002);
                    if (AnonymousClass0W1.A00(A0R2, A032)) {
                        A032.A06 = i3;
                        A032.A05(str, z);
                        A0R2.A02(r3, A032);
                        if (r3 != null) {
                            r3.A0L = true;
                        }
                    }
                } finally {
                    r2.A01(r3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0c(int i, long j) {
        int i2 = i;
        if (this.A0b) {
            this.A0K.add(Long.valueOf(AnonymousClass0WK.A00(974460658, i)));
        }
        if (this.A0a) {
            String A072 = A07(974460658, i, this.A0e, this.A0c, this.A0d);
            if (A0U(A072, (String) null, TimeUnit.MILLISECONDS, 974460658, i2, 0, -1, true) != null) {
                this.A0I.put(String.valueOf(AnonymousClass0WK.A00(974460658, i)), A072);
            }
        } else {
            markerStart(974460658, i);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new C10820j0(this, i), j);
    }

    public final /* synthetic */ void A0e(AnonymousClass0W4 r3, C09350fH r4) {
        C30954Gc6.A00(A06(r4, r3)).A00(new C05870Wp(r4, this), r3);
    }

    /* JADX INFO: finally extract failed */
    public final void A0h(C09350fH r5, String str, int i) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(r5.A03);
            }
            AnonymousClass0WK r1 = this.A09;
            int myTid = Process.myTid();
            AnonymousClass0WW A0R2 = A0R();
            AnonymousClass0WD r12 = r1.A06;
            r12.A00(r3);
            try {
                r5.A06 = myTid;
                r5.A03(str, i);
                A0R2.A02(r3, r5);
                if (r3 != null) {
                    r3.A0L = true;
                }
                r12.A01(r3);
                C05900Ww r2 = this.A0m;
                if (!(r2 == null || this.A0k.AaP().AMf(r5.getMarkerId(), str) == -1)) {
                    r2.Cb5(r5.getMarkerId(), r5.A02, str, i);
                }
                if (this.A0n != null && r3 != null) {
                    this.A0n.A03(r3);
                }
            } catch (Throwable th) {
                r12.A01(r3);
                throw th;
            }
        }
    }

    public final void A0m(String str, double d, int i, int i2, int i3) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            AnonymousClass0WK r6 = this.A09;
            AnonymousClass0WW A0R2 = A0R();
            long A002 = AnonymousClass0WK.A00(i, i2);
            AnonymousClass0W1 r4 = r6.A05;
            if (r4.A05(r3, A0R2, A002)) {
                AnonymousClass0WD r2 = r6.A06;
                r2.A00(r3);
                try {
                    C09350fH A032 = r4.A03(r3, A002);
                    if (AnonymousClass0W1.A00(A0R2, A032)) {
                        A032.A06 = i3;
                        A032.A02(str, d);
                        A0R2.A02(r3, A032);
                        if (r3 != null) {
                            r3.A0L = true;
                        }
                    }
                } finally {
                    r2.A01(r3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0o(String str, int i, int i2, int i3, long j) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            AnonymousClass0WK r6 = this.A09;
            AnonymousClass0WW A0R2 = A0R();
            long A002 = AnonymousClass0WK.A00(i, i2);
            AnonymousClass0W1 r4 = r6.A05;
            if (r4.A05(r3, A0R2, A002)) {
                AnonymousClass0WD r2 = r6.A06;
                r2.A00(r3);
                try {
                    C09350fH A032 = r4.A03(r3, A002);
                    if (AnonymousClass0W1.A00(A0R2, A032)) {
                        A032.A06 = i3;
                        A032.A04(str, j);
                        A0R2.A02(r3, A032);
                        if (r3 != null) {
                            r3.A0L = true;
                        }
                    }
                } finally {
                    r2.A01(r3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0q(String str, double[] dArr, int i, int i2, int i3) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            AnonymousClass0WK r6 = this.A09;
            AnonymousClass0WW A0R2 = A0R();
            long A002 = AnonymousClass0WK.A00(i, i2);
            AnonymousClass0W1 r4 = r6.A05;
            if (r4.A05(r3, A0R2, A002)) {
                AnonymousClass0WD r2 = r6.A06;
                r2.A00(r3);
                try {
                    C09350fH A032 = r4.A03(r3, A002);
                    if (AnonymousClass0W1.A00(A0R2, A032)) {
                        A032.A06 = i3;
                        A032.A06(str, dArr);
                        A0R2.A02(r3, A032);
                        if (r3 != null) {
                            r3.A0L = true;
                        }
                    }
                } finally {
                    r2.A01(r3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0r(String str, int[] iArr, int i, int i2, int i3) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            AnonymousClass0WK r6 = this.A09;
            AnonymousClass0WW A0R2 = A0R();
            long A002 = AnonymousClass0WK.A00(i, i2);
            AnonymousClass0W1 r4 = r6.A05;
            if (r4.A05(r3, A0R2, A002)) {
                AnonymousClass0WD r2 = r6.A06;
                r2.A00(r3);
                try {
                    C09350fH A032 = r4.A03(r3, A002);
                    if (AnonymousClass0W1.A00(A0R2, A032)) {
                        A032.A06 = i3;
                        A032.A07(str, iArr);
                        A0R2.A02(r3, A032);
                        if (r3 != null) {
                            r3.A0L = true;
                        }
                    }
                } finally {
                    r2.A01(r3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0s(String str, long[] jArr, int i, int i2, int i3) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            AnonymousClass0WK r6 = this.A09;
            AnonymousClass0WW A0R2 = A0R();
            long A002 = AnonymousClass0WK.A00(i, i2);
            AnonymousClass0W1 r4 = r6.A05;
            if (r4.A05(r3, A0R2, A002)) {
                AnonymousClass0WD r2 = r6.A06;
                r2.A00(r3);
                try {
                    C09350fH A032 = r4.A03(r3, A002);
                    if (AnonymousClass0W1.A00(A0R2, A032)) {
                        A032.A06 = i3;
                        A032.A08(str, jArr);
                        A0R2.A02(r3, A032);
                        if (r3 != null) {
                            r3.A0L = true;
                        }
                    }
                } finally {
                    r2.A01(r3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0t(String str, String[] strArr, int i, int i2, int i3) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            AnonymousClass0WK r6 = this.A09;
            AnonymousClass0WW A0R2 = A0R();
            long A002 = AnonymousClass0WK.A00(i, i2);
            AnonymousClass0W1 r4 = r6.A05;
            if (r4.A05(r3, A0R2, A002)) {
                AnonymousClass0WD r2 = r6.A06;
                r2.A00(r3);
                try {
                    C09350fH A032 = r4.A03(r3, A002);
                    if (AnonymousClass0W1.A00(A0R2, A032)) {
                        A032.A06 = i3;
                        A032.A09(str, strArr);
                        A0R2.A02(r3, A032);
                        if (r3 != null) {
                            r3.A0L = true;
                        }
                    }
                } finally {
                    r2.A01(r3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final void A0u(String str, boolean[] zArr, int i, int i2, int i3) {
        if (A0O(this, str)) {
            AnonymousClass0WA r3 = null;
            if (this.A0n != null) {
                r3 = this.A0n.A01(i);
            }
            AnonymousClass0WK r6 = this.A09;
            AnonymousClass0WW A0R2 = A0R();
            long A002 = AnonymousClass0WK.A00(i, i2);
            AnonymousClass0W1 r4 = r6.A05;
            if (r4.A05(r3, A0R2, A002)) {
                AnonymousClass0WD r2 = r6.A06;
                r2.A00(r3);
                try {
                    C09350fH A032 = r4.A03(r3, A002);
                    if (AnonymousClass0W1.A00(A0R2, A032)) {
                        A032.A06 = i3;
                        A032.A0A(str, zArr);
                        A0R2.A02(r3, A032);
                        if (r3 != null) {
                            r3.A0L = true;
                        }
                    }
                } finally {
                    r2.A01(r3);
                }
            }
            if (this.A0n != null && r3 != null) {
                this.A0n.A03(r3);
            }
        }
    }

    public final EventBuilder markEventBuilder(int i, int i2, String str) {
        AnonymousClass0WO A032 = A03(i, i2);
        if (A032 != null) {
            i = A032.A01;
        }
        EventBuilder A022 = A02(A032, str, i);
        if (A032 != null) {
            A022.annotate("qpl_pivot_name", A032.A02);
            A022.annotate("qpl_pivot_host", A032.A00);
        }
        return A022;
    }

    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        markerAnnotate(i, i2, str, i3);
        C05900Ww r1 = this.A0m;
        if (r1 != null) {
            AnonymousClass0WO A042 = A04(i, i2);
            if (A042 != null) {
                i = A042.A01;
            }
            r1.Cb5(i, i2, str, i3);
        }
    }

    public final void markerStartForUserFlowE2E(int i, int i2, long j, TimeUnit timeUnit, String str, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        String str2 = str;
        C09350fH A0T2 = A0T(A0R(), str2, (String) null, timeUnit2, i, i2, 2, Process.myTid(), -1, j, z, true);
        if (A0T2 != null) {
            AnonymousClass0WK r4 = this.A09;
            r4.A09((AnonymousClass0WA) null, A0R(), A0T2, "join_id", str2, Process.myTid());
            AnonymousClass0WK r13 = r4;
            r13.A09((AnonymousClass0WA) null, A0R(), A0T2, "source", DexOptimization.OPT_KEY_CLIENT, Process.myTid());
        }
    }

    public AnonymousClass01V(AnonymousClass0W4 r26, AnonymousClass0e1 r27, AnonymousClass0WX r28, C05900Ww r29, AnonymousClass0IE r30, C12020lB r31, AnonymousClass03R r32, C691847d r33, Runnable runnable, C04560Oe r35, C04560Oe r36, C04560Oe r37, AnonymousClass0W9[] r38, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Throwable th;
        Object obj;
        C12440lu r6;
        AnonymousClass0Wg[] r13;
        AnonymousClass0Wg[] r3;
        C03720Kl r10;
        C12440lu r132;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        AnonymousClass0IY r20 = AnonymousClass0IY.A00;
        C15130qm r4 = new C15130qm();
        C10960jF r34 = new C10960jF();
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I2 = new IDxProviderShape243S0100000_I2(r38, 11);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I22 = new IDxProviderShape243S0100000_I2(new C09050em(), 11);
        C12440lu r18 = new C12440lu();
        AnonymousClass03R r24 = r32;
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I23 = new IDxProviderShape243S0100000_I2(r24, 3, 42);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I24 = new IDxProviderShape243S0100000_I2(r4, 1, 42);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I25 = new IDxProviderShape243S0100000_I2(r34, 8, 42);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I26 = new IDxProviderShape243S0100000_I2(r26, 9, 42);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I27 = new IDxProviderShape243S0100000_I2(r28, 4, 42);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I28 = new IDxProviderShape243S0100000_I2(r37, 6, 42);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I29 = new IDxProviderShape243S0100000_I2(iDxProviderShape243S0100000_I2, 7, 42);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I210 = new IDxProviderShape243S0100000_I2(r31, 2, 42);
        IDxProviderShape104S0000000_I2 iDxProviderShape104S0000000_I2 = new IDxProviderShape104S0000000_I2(0);
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I211 = new IDxProviderShape243S0100000_I2(r29, 5, 42);
        TriState triState = TriState.UNSET;
        this.A0h = triState;
        this.A0i = triState;
        this.A0j = triState;
        this.A0U = r35;
        this.A0P = iDxProviderShape243S0100000_I23;
        this.A0k = new AnonymousClass0IF();
        this.A06 = awakeTimeSinceBootClock;
        this.A05 = r20;
        this.A0R = iDxProviderShape243S0100000_I24;
        this.A0N = iDxProviderShape243S0100000_I25;
        this.A0O = iDxProviderShape243S0100000_I26;
        this.A0Q = r36;
        this.A0X = iDxProviderShape243S0100000_I29;
        AnonymousClass0e1 r7 = r27;
        this.A07 = r7;
        this.A0Z = iDxProviderShape243S0100000_I22;
        this.A0T = iDxProviderShape243S0100000_I210;
        this.A0F = r18;
        this.A0E = C12430lt.A00;
        C12410lr r102 = C12410lr.A00;
        this.A0D = r102;
        this.A0B = new C12380ln();
        this.A0C = new C12420ls();
        this.A0Y = iDxProviderShape243S0100000_I28;
        this.A08 = new AnonymousClass0WD(awakeTimeSinceBootClock);
        this.A09 = new AnonymousClass0WK(awakeTimeSinceBootClock, r7, r102, r18);
        this.A0S = iDxProviderShape243S0100000_I27;
        this.A0V = iDxProviderShape104S0000000_I2;
        this.A0W = iDxProviderShape243S0100000_I211;
        ReentrantLock reentrantLock = this.A0M;
        reentrantLock.lock();
        try {
            if (this.A0g == 0) {
                this.A0g = 1;
                reentrantLock.unlock();
                reentrantLock = this.A0M;
                reentrantLock.lock();
                if (this.A0g == 1) {
                    AnonymousClass0WX r72 = (AnonymousClass0WX) this.A0S.get();
                    if (r72 != null) {
                        this.A0l = r72;
                        AnonymousClass0e1 r9 = this.A07;
                        C03720Kl r8 = this.A06;
                        C12440lu r5 = this.A0F;
                        synchronized (r72) {
                            if (r72.A00 == null) {
                                AnonymousClass0Wg[] r39 = (AnonymousClass0Wg[]) r72.A01.toArray(new AnonymousClass0Wg[0]);
                                AnonymousClass0WW r182 = new AnonymousClass0WW(r8, r9, (C12020lB) null, r5, r39.length == 0 ? null : r39);
                                r72.A02 = r182;
                                AnonymousClass0Wg[] r82 = r182.A06;
                                if (r82 != null) {
                                    for (AnonymousClass0Wg quickPerformanceLogger : r82) {
                                        quickPerformanceLogger.setQuickPerformanceLogger(this);
                                    }
                                }
                                r72.A00 = this;
                            } else {
                                throw new IllegalStateException("QPL listeners were already created");
                            }
                        }
                        Iterator it = this.A0L.iterator();
                        while (it.hasNext()) {
                            A0D(r72.A02, (C09350fH) it.next(), true);
                        }
                        this.A09.A0E(new C09800gh(r72.A02));
                        this.A0g = 2;
                        reentrantLock.unlock();
                        reentrantLock = this.A0M;
                        reentrantLock.lock();
                        if (this.A0g == 2) {
                            AnonymousClass0WT r83 = (AnonymousClass0WT) this.A0P.get();
                            if (r83 != null) {
                                this.A0k = r83;
                                this.A0n = (C12020lB) this.A0T.get();
                                AnonymousClass0WX r73 = this.A0l;
                                A0H(r73, "QPLListenerListHolder", "Mature");
                                AnonymousClass0WW r310 = r73.A02;
                                C12020lB r12 = this.A0n;
                                this.A0V.get();
                                synchronized (r73) {
                                    AnonymousClass0WW r92 = r73.A02;
                                    if (!(r92.A04 == r12 || (r10 = r92.A00) == null || (r132 = r92.A05) == null)) {
                                        r92 = new AnonymousClass0WW(r10, r92.A01, r12, r132, r92.A06);
                                    }
                                    r73.A02 = r92;
                                }
                                C04560Oe r1 = this.A0Q;
                                if (r1 == null) {
                                    obj = null;
                                } else {
                                    obj = r1.get();
                                }
                                this.A02 = (C09780gf) obj;
                                AnonymousClass0WK r122 = this.A09;
                                C12020lB r14 = this.A0n;
                                C09780gf r11 = this.A02;
                                r122.A02 = r14;
                                AnonymousClass0W1 r103 = r122.A05;
                                if (r14 != null) {
                                    ReentrantLock reentrantLock2 = r103.A04.A01;
                                    reentrantLock2.lock();
                                    try {
                                        long B8d = r83.B8d(27791726);
                                        r103.A02 = B8d;
                                        int i = (int) B8d;
                                        r103.A01 = i;
                                        r14 = (i <= 0 || i == Integer.MAX_VALUE) ? null : r14;
                                        r103.A03 = r14;
                                        if (r14 != null) {
                                            r103.A00 = new Random().nextInt(i);
                                        }
                                        reentrantLock2.unlock();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        reentrantLock2.unlock();
                                    }
                                }
                                r122.A01 = r11;
                                this.A04 = (C15130qm) this.A0R.get();
                                this.A03 = (C10960jF) this.A0N.get();
                                this.A00 = (AnonymousClass0W4) this.A0O.get();
                                C05900Ww r15 = (C05900Ww) this.A0W.get();
                                if (r15 != null) {
                                    r15.setQuickPerformanceLogger(this);
                                }
                                this.A0m = r15;
                                AnonymousClass0WW r93 = r73.A02;
                                C03720Kl r74 = r93.A00;
                                if (!(r74 == null || (r6 = r93.A05) == null || (r13 = r93.A06) == null || (r3 = r310.A06) == null || r3.length == 0)) {
                                    HashSet hashSet = new HashSet(Arrays.asList(r3));
                                    ArrayList arrayList = new ArrayList();
                                    for (AnonymousClass0Wg r311 : r13) {
                                        if (!hashSet.contains(r311)) {
                                            arrayList.add(r311);
                                        }
                                    }
                                    r93 = new AnonymousClass0WW(r74, r93.A01, r93.A04, r6, (AnonymousClass0Wg[]) arrayList.toArray(new AnonymousClass0Wg[0]));
                                }
                                while (true) {
                                    C09350fH r312 = (C09350fH) this.A0L.poll();
                                    if (r312 == null) {
                                        break;
                                    } else if (!r83.BVp(r312.A03)) {
                                        A0C(r83, r312, this);
                                        A0k(r312, false);
                                    }
                                }
                                r122.A0E(new C09800gh(r93));
                                r122.A0E(new C10910jA(r83, this));
                                this.A0g = 3;
                                reentrantLock.unlock();
                                C14350pG r2 = new C14350pG(this);
                                this.A0f = r2;
                                this.A0K = Collections.synchronizedSet(new HashSet());
                                this.A0I = Collections.synchronizedMap(new HashMap());
                                this.A0b = z2;
                                this.A0a = z3;
                                this.A0d = z4;
                                this.A0e = z5;
                                this.A0c = z6;
                                this.A0G = r24;
                                this.A0H = runnable;
                                if (z) {
                                    r33.A07(r2);
                                } else {
                                    C691847d.A02(r2);
                                }
                                this.A0A = r30;
                                return;
                            }
                            th = new NullPointerException(AnonymousClass00U.A0L("QPLConfiguration", " must not be null"));
                        } else {
                            th = new IllegalStateException("transitToMatureStage can be done only after warm stage");
                        }
                    } else {
                        th = new NullPointerException(AnonymousClass00U.A0L("QPLListenersHolder", " must not be null"));
                    }
                } else {
                    th = new IllegalStateException("transitToWarmStage can be done only after early stage");
                }
                throw th;
            }
            throw new IllegalStateException("transitToEarlyStage can be done as first transition");
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public static void A0A(Context context, AnonymousClass0W4 r23, AnonymousClass0e1 r24, AnonymousClass0IE r25, C13570nv r26, C04560Oe r27, AnonymousClass0W9[] r28, AnonymousClass0Wg[] r29, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C05900Ww r4;
        IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I2;
        C12440lu r3;
        int length;
        AnonymousClass0Wg[] r10 = r29;
        C13570nv r7 = r26;
        C10840j2 r6 = new C10840j2(r7);
        AnonymousClass0e1 r13 = r24;
        C12020lB r8 = null;
        if (r13.A04()) {
            C12300lf.A00().A01 = new IDxProviderShape243S0100000_I2(new C09050em(), 11);
            short[] A0A2 = r13.A0A();
            if (A0A2 == null || (length = A0A2.length) == 0) {
                r4 = new C03130El(C12300lf.A00().A01, r13.A01(), r13.A00(), r13.A09());
            } else {
                C12300lf A002 = C12300lf.A00();
                int A012 = r13.A01();
                int A003 = r13.A00();
                boolean A092 = r13.A09();
                Arrays.sort(Arrays.copyOf(A0A2, length));
                C04560Oe r2 = A002.A01;
                r4 = new C03120Ek(new C12290le(A0A2), new C03130El[]{new C03130El(r2, A012, A003, A092), new C03130El(r2, A012, A003, A092)});
            }
        } else {
            r4 = null;
        }
        C05900Ww r15 = new C12030lC();
        if (r4 != null) {
            r15 = new C10950jE(r4, r15);
        }
        AnonymousClass0W6[] A0P2 = A0P(context);
        int length2 = A0P2.length;
        if (length2 == 0) {
            iDxProviderShape243S0100000_I2 = null;
        } else {
            int[] iArr = new int[length2];
            int i = 0;
            int i2 = 0;
            do {
                iArr[i2] = A0P2[i2].B52();
                i2++;
            } while (i2 < length2);
            AnonymousClass0W6[] r22 = new AnonymousClass0W6[(Long.numberOfTrailingZeros(0) + 1)];
            do {
                AnonymousClass0W6 r1 = A0P2[i];
                r22[r1.B52()] = r1;
                i++;
            } while (i < length2);
            iDxProviderShape243S0100000_I2 = new IDxProviderShape243S0100000_I2(new C09780gf(iArr, r22), 0);
        }
        AnonymousClass0WX r14 = new AnonymousClass0WX();
        synchronized (r14) {
            QuickPerformanceLogger quickPerformanceLogger = r14.A00;
            if (quickPerformanceLogger == null) {
                int length3 = r10.length;
                for (int i3 = 0; i3 < length3; i3++) {
                    AnonymousClass0Wg r32 = r29[i3];
                    List list = r14.A01;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getClass().equals(r32.getClass())) {
                                break;
                            }
                        } else {
                            list.add(r32);
                            break;
                        }
                    }
                }
            } else {
                int length4 = r10.length;
                for (int i4 = 0; i4 < length4; i4++) {
                    r29[i4].setQuickPerformanceLogger(quickPerformanceLogger);
                }
                AnonymousClass0WW r0 = r14.A02;
                C03720Kl r9 = r0.A00;
                if (!(r9 == null || (r3 = r0.A05) == null)) {
                    AnonymousClass0Wg[] r210 = r0.A06;
                    if (r210 != null) {
                        int length5 = r210.length;
                        AnonymousClass0Wg[] r211 = (AnonymousClass0Wg[]) Arrays.copyOf(r210, length5 + length4);
                        System.arraycopy(r10, 0, r211, length5, length4);
                        r10 = r211;
                    }
                    r0 = new AnonymousClass0WW(r9, r0.A01, r0.A04, r3, r10);
                }
                r14.A02 = r0;
            }
        }
        AnonymousClass0W4 r12 = r23;
        if (r13.A06()) {
            Random random = new Random();
            IDxProviderShape243S0100000_I2 iDxProviderShape243S0100000_I22 = new IDxProviderShape243S0100000_I2(new C14750q5(), 11);
            C14660pu r222 = C14660pu.A00;
            AnonymousClass03R r33 = r7.A00;
            AnonymousClass0IY r17 = AnonymousClass0IY.A00;
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
            r8 = new C12020lB(awakeTimeSinceBootClock, r33, new C09300fC(r17, awakeTimeSinceBootClock, r12, r33, random, r222, iDxProviderShape243S0100000_I22, iDxProviderShape243S0100000_I2), new Random());
        }
        C12020lB r172 = r8;
        AnonymousClass03R r18 = r7.A00;
        AnonymousClass01V r11 = new AnonymousClass01V(r12, r13, r14, r15, r25, r172, r18, C691847d.A08, r6, C14660pu.A00, iDxProviderShape243S0100000_I2, r27, r28, z, z2, z3, z4, z5, z6);
        A0p = r11;
        if (r4 != null) {
            C14010of.A02.AKp(new C14060ok(r4, r11));
        }
        QuickPerformanceLoggerProvider.A00 = A0p;
        UserFlowJNIProvider.setUserFlowLogger(new C12270lc(r11));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r11.A0k.BVp(r3) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C09350fH A0S(X.AnonymousClass0WA r21, X.AnonymousClass0WO r22, java.lang.String r23, java.lang.String r24, java.util.concurrent.TimeUnit r25, int r26, int r27, int r28, int r29, int r30, long r31, boolean r33, boolean r34) {
        /*
            r20 = this;
            r0 = r22
            r3 = r26
            if (r22 != 0) goto L_0x00bd
            r15 = r3
        L_0x0007:
            r7 = -1
            r6 = 1
            r11 = r20
            r12 = r21
            r13 = r23
            r14 = r24
            r1 = r30
            if (r1 != r7) goto L_0x00b5
            X.0qm r4 = r11.A04
            X.0WT r0 = r11.A0k
            long r0 = r0.B8d(r15)
            int r2 = (int) r0
            r5 = 0
            if (r2 != r7) goto L_0x0022
            r5 = 1
        L_0x0022:
            boolean r2 = A0M(r11)
            if (r2 != 0) goto L_0x0034
            boolean r2 = r11.A0L()
            if (r2 != 0) goto L_0x0034
            if (r4 == 0) goto L_0x003d
            boolean r2 = X.C10870j6.A00
            if (r2 == 0) goto L_0x003d
        L_0x0034:
            X.0WT r2 = r11.A0k
            boolean r2 = r2.BVp(r3)
            r4 = 1
            if (r2 == 0) goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r18 = r4
            r19 = r5
            r16 = r0
            long r0 = r11.A01(r12, r13, r14, r15, r16, r18, r19)
        L_0x0048:
            if (r21 == 0) goto L_0x0052
            X.0Kl r2 = r11.A06
            long r2 = r2.nowNanos()
            r12.A0D = r2
        L_0x0052:
            int r2 = (int) r0
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r8) goto L_0x00c1
            r12 = r28
            r3 = r28 & 8
            r2 = 8
            if (r3 != r2) goto L_0x00ae
            r2 = 0
        L_0x0062:
            java.util.Random r7 = r11.A0J
            int r11 = r7.nextInt(r8)
            long r8 = java.lang.System.currentTimeMillis()
            r10 = r34 ^ 1
            X.0fH r7 = new X.0fH
            r7.<init>()
            r7.A03 = r15
            r7.A0C = r0
            r7.A09 = r2
            r7.A0R = r4
            r7.A0S = r5
            r4 = r25
            r2 = r31
            long r0 = r4.toNanos(r2)
            r7.A0B = r0
            r0 = r33
            r7.A0W = r0
            long r0 = r4.toNanos(r2)
            r7.A0A = r0
            r7.A0D = r8
            r0 = r27
            r7.A02 = r0
            r7.A07 = r11
            r7.A0P = r6
            r7.A01 = r12
            r7.A0Q = r6
            r7.A0T = r10
            r0 = 0
            r7.A08 = r0
            r0 = r29
            r7.A06 = r0
            r7.A0L = r13
            r7.A0M = r14
            return r7
        L_0x00ae:
            X.0WT r2 = r11.A0k
            long r2 = r2.AvZ(r15)
            goto L_0x0062
        L_0x00b5:
            r0 = 4
            long r0 = X.C05910Wx.A00(r1, r0, r6)
            r4 = 0
            r5 = 0
            goto L_0x0048
        L_0x00bd:
            int r15 = r0.A01
            goto L_0x0007
        L_0x00c1:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0S(X.0WA, X.0WO, java.lang.String, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, int, long, boolean, boolean):X.0fH");
    }

    /* JADX WARNING: Removed duplicated region for block: B:179:0x037a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C09350fH A0T(X.AnonymousClass0WW r43, java.lang.String r44, java.lang.String r45, java.util.concurrent.TimeUnit r46, int r47, int r48, int r49, int r50, int r51, long r52, boolean r54, boolean r55) {
        /*
            r42 = this;
            r4 = 0
            r5 = r42
            X.0lB r11 = r5.A0n
            r41 = r47
            if (r11 == 0) goto L_0x0099
            r0 = r41
            X.0WA r3 = r11.A01(r0)
        L_0x000f:
            r40 = r48
            r1 = r41
            r0 = r40
            X.0WO r2 = r5.A04(r1, r0)
            if (r2 != 0) goto L_0x0096
            r6 = r1
        L_0x001c:
            r8 = -1
            r0 = r52
            int r7 = (r52 > r8 ? 1 : (r52 == r8 ? 0 : -1))
            r21 = 0
            if (r7 != 0) goto L_0x0028
            r21 = 1
        L_0x0028:
            r7 = r46
            long r17 = r5.A0Q(r0, r7)
            r23 = r49
            r0 = r49 & 16
            r22 = r54
            if (r0 != 0) goto L_0x0093
            X.0Ww r7 = r5.A0m
            if (r7 == 0) goto L_0x0093
            r0 = r49 & 2
            if (r0 != 0) goto L_0x004a
            X.0WT r0 = r5.A0k
            X.0WU r0 = r0.AaP()
            boolean r0 = r0.BVq(r6)
            if (r0 == 0) goto L_0x0093
        L_0x004a:
            r1 = r22
            r0 = r40
            r7.CbA(r6, r0, r1)
            r20 = 1
        L_0x0053:
            r14 = r43
            if (r55 == 0) goto L_0x0091
            r0 = r40
            int r15 = r14.A00(r2, r6, r0)
        L_0x005d:
            if (r3 == 0) goto L_0x0067
            X.0Kl r0 = r5.A06
            long r0 = r0.nowNanos()
            r3.A0B = r0
        L_0x0067:
            java.util.concurrent.TimeUnit r19 = java.util.concurrent.TimeUnit.NANOSECONDS
            r16 = 1
            r1 = r41
            r0 = r40
            boolean r0 = r5.isMarkerOn((int) r1, (int) r0)
            r39 = r50
            if (r0 == 0) goto L_0x016b
            X.0WK r8 = r5.A09
            long r9 = java.lang.System.currentTimeMillis()
            r0 = r40
            long r0 = X.AnonymousClass0WK.A00(r1, r0)
            X.0W1 r7 = r8.A05
            boolean r6 = r7.A05(r3, r14, r0)
            if (r6 == 0) goto L_0x016b
            X.0WD r6 = r8.A06
            r6.A00(r3)
            goto L_0x009c
        L_0x0091:
            r15 = 0
            goto L_0x005d
        L_0x0093:
            r20 = 0
            goto L_0x0053
        L_0x0096:
            int r6 = r2.A01
            goto L_0x001c
        L_0x0099:
            r3 = 0
            goto L_0x000f
        L_0x009c:
            X.0fH r7 = r7.A03(r3, r0)     // Catch:{ all -> 0x0163 }
            if (r7 == 0) goto L_0x00b9
            X.0WO r0 = r7.A0H     // Catch:{ all -> 0x0163 }
            if (r0 == r2) goto L_0x00b9
            r24 = r8
            r25 = r14
            r26 = r19
            r27 = r41
            r28 = r40
            r29 = r39
            r30 = r17
            r24.A04(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0163 }
            goto L_0x0168
        L_0x00b9:
            boolean r0 = X.AnonymousClass0W1.A00(r14, r7)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0168
            r2 = r19
            r0 = r17
            long r0 = r2.toNanos(r0)     // Catch:{ all -> 0x0163 }
            r7.A0B = r0     // Catch:{ all -> 0x0163 }
            r0 = r21
            r7.A0W = r0     // Catch:{ all -> 0x0163 }
            r0 = r17
            long r0 = r2.toNanos(r0)     // Catch:{ all -> 0x0163 }
            r7.A0A = r0     // Catch:{ all -> 0x0163 }
            r7.A0D = r9     // Catch:{ all -> 0x0163 }
            r0 = r16
            r7.A0P = r0     // Catch:{ all -> 0x0163 }
            X.0W3 r1 = r7.A0Z     // Catch:{ all -> 0x0163 }
            monitor-enter(r1)     // Catch:{ all -> 0x0163 }
            r2 = 0
            r1.A03 = r2     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r0 = r1.A05     // Catch:{ all -> 0x0160 }
            r0.clear()     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r0 = r1.A06     // Catch:{ all -> 0x0160 }
            r0.clear()     // Catch:{ all -> 0x0160 }
            r1.A02 = r2     // Catch:{ all -> 0x0160 }
            r1.A00 = r2     // Catch:{ all -> 0x0160 }
            r1.A04 = r4     // Catch:{ all -> 0x0160 }
            r0 = -1
            r1.A01 = r0     // Catch:{ all -> 0x0160 }
            monitor-exit(r1)     // Catch:{ all -> 0x0163 }
            java.util.ArrayList r0 = r7.A0a     // Catch:{ all -> 0x0163 }
            r0.clear()     // Catch:{ all -> 0x0163 }
            r0 = r39
            r7.A06 = r0     // Catch:{ all -> 0x0163 }
            r0 = 0
            if (r54 != 0) goto L_0x0102
            r0 = 1
        L_0x0102:
            r7.A0T = r0     // Catch:{ all -> 0x0163 }
            int r0 = r7.A04     // Catch:{ all -> 0x0163 }
            r15 = r15 | r0
            r7.A04 = r15     // Catch:{ all -> 0x0163 }
            X.0WF r1 = r7.A0G     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x011e
            r1.A00 = r2     // Catch:{ all -> 0x0163 }
            java.lang.String[] r0 = r1.A05     // Catch:{ all -> 0x0163 }
            java.util.Arrays.fill(r0, r4)     // Catch:{ all -> 0x0163 }
            X.0WQ[] r0 = r1.A03     // Catch:{ all -> 0x0163 }
            java.util.Arrays.fill(r0, r4)     // Catch:{ all -> 0x0163 }
            X.0Jz[] r0 = r1.A04     // Catch:{ all -> 0x0163 }
            java.util.Arrays.fill(r0, r4)     // Catch:{ all -> 0x0163 }
        L_0x011e:
            X.0Jz r2 = r7.A0I     // Catch:{ all -> 0x0163 }
            if (r2 == 0) goto L_0x0127
            long r0 = r7.A09     // Catch:{ all -> 0x0163 }
            X.AnonymousClass0WK.A03(r8, r2, r0)     // Catch:{ all -> 0x0163 }
        L_0x0127:
            long r0 = r7.A09     // Catch:{ all -> 0x0163 }
            r17 = r3
            r18 = r8
            r19 = r41
            r20 = r40
            r21 = r0
            X.0Jz r0 = X.AnonymousClass0WK.A01(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0163 }
            r7.A0I = r0     // Catch:{ all -> 0x0163 }
            int r0 = r7.A05     // Catch:{ all -> 0x0163 }
            int r0 = r0 + 1
            r7.A05 = r0     // Catch:{ all -> 0x0163 }
            X.0fP r1 = r14.A03     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x0147
            r0 = 3
            X.C09420fP.A00(r3, r7, r1, r0)     // Catch:{ all -> 0x0163 }
        L_0x0147:
            r6.A01(r3)
            if (r11 == 0) goto L_0x015f
            if (r3 == 0) goto L_0x015f
            r0 = r16
            r3.A0L = r0
            r3.A0K = r0
            X.0lB r2 = r5.A0n
            X.0Kl r0 = r5.A06
            long r0 = r0.nowNanos()
            r2.A05(r3, r0)
        L_0x015f:
            return r7
        L_0x0160:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r0 = move-exception
            r6.A01(r3)
            throw r0
        L_0x0168:
            r6.A01(r3)
        L_0x016b:
            if (r3 == 0) goto L_0x0175
            X.0Kl r0 = r5.A06
            long r0 = r0.nowNanos()
            r3.A0C = r0
        L_0x0175:
            r27 = r44
            r28 = r45
            r34 = r51
            r29 = r19
            r30 = r41
            r31 = r40
            r32 = r23
            r33 = r39
            r35 = r17
            r37 = r21
            r38 = r22
            r24 = r5
            r25 = r3
            r26 = r2
            X.0fH r6 = r24.A0S(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38)
            if (r3 == 0) goto L_0x019f
            X.0Kl r0 = r5.A06
            long r0 = r0.nowNanos()
            r3.A0A = r0
        L_0x019f:
            if (r6 == 0) goto L_0x01e2
            X.0lB r0 = r5.A0n
            if (r0 == 0) goto L_0x01e2
            X.0lB r0 = r5.A0n
            int r13 = r6.getMarkerId()
            int r12 = r6.A07
            X.0fC r11 = r0.A00
            r10 = 27787271(0x1a80007, float:6.171349E-38)
            r27 = 0
            X.0WT r9 = r11.A01
            long r0 = r9.B8d(r10)
            int r8 = (int) r0
            r7 = -1
            if (r8 == r7) goto L_0x0232
            int r8 = r9.CYu(r8)
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == r7) goto L_0x0232
            r24 = r11
            r25 = r19
            r26 = r10
            r29 = r0
            X.0fH r1 = X.C09300fC.A01(r24, r25, r26, r27, r29)
            java.lang.String r0 = "tracked_marker_id"
            r1.A03(r0, r13)
            r1.A07 = r12
            X.0W4 r0 = r11.A00
            r0.execute(r1)
            r0 = 1
        L_0x01e0:
            r6.A0V = r0
        L_0x01e2:
            if (r3 == 0) goto L_0x01ec
            X.0Kl r0 = r5.A06
            long r0 = r0.nowNanos()
            r3.A0H = r0
        L_0x01ec:
            if (r6 == 0) goto L_0x0292
            int r1 = r6.getMarkerId()
            java.lang.String r0 = "onMarkerStart"
            A0G(r5, r0, r4, r4, r1)
            r6.A0H = r2
            X.0WK r4 = r5.A09
            if (r2 != 0) goto L_0x022f
            int r10 = r6.A03
        L_0x01ff:
            int r9 = r6.A02
            long r0 = X.AnonymousClass0WK.A00(r10, r9)
            long r7 = r6.A09
            r17 = r3
            r18 = r4
            r19 = r10
            r20 = r9
            r21 = r7
            X.0Jz r10 = X.AnonymousClass0WK.A01(r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x021f
            X.0Kl r7 = r4.A04
            long r7 = r7.nowNanos()
            r3.A08 = r7
        L_0x021f:
            X.0WD r9 = r4.A06
            r9.A00(r3)
            if (r3 == 0) goto L_0x0234
            X.0Kl r7 = r4.A04
            long r7 = r7.nowNanos()
            r3.A05 = r7
            goto L_0x0234
        L_0x022f:
            int r10 = r2.A00
            goto L_0x01ff
        L_0x0232:
            r0 = 0
            goto L_0x01e0
        L_0x0234:
            r6.A0I = r10     // Catch:{ all -> 0x028d }
            r6.A04 = r15     // Catch:{ all -> 0x028d }
            r4.A00 = r6     // Catch:{ all -> 0x028d }
            X.0W1 r11 = r4.A05     // Catch:{ all -> 0x028d }
            X.0WD r7 = r11.A04     // Catch:{ all -> 0x028d }
            java.util.concurrent.locks.ReentrantLock r10 = r7.A01     // Catch:{ all -> 0x028d }
            r10.lock()     // Catch:{ all -> 0x028d }
            X.08V r8 = r11.A05     // Catch:{ all -> 0x0288 }
            int r7 = r8.indexOfKey(r0)     // Catch:{ all -> 0x0288 }
            r10.unlock()     // Catch:{ all -> 0x028d }
            if (r7 < 0) goto L_0x0258
            r10.lock()     // Catch:{ all -> 0x028d }
            r8.setValueAt(r7, r6)     // Catch:{ all -> 0x0288 }
            r10.unlock()     // Catch:{ all -> 0x028d }
            goto L_0x025b
        L_0x0258:
            r11.A04(r6, r0)     // Catch:{ all -> 0x028d }
        L_0x025b:
            if (r3 == 0) goto L_0x0265
            X.0Kl r0 = r4.A04     // Catch:{ all -> 0x028d }
            long r0 = r0.nowNanos()     // Catch:{ all -> 0x028d }
            r3.A0G = r0     // Catch:{ all -> 0x028d }
        L_0x0265:
            X.0fP r1 = r14.A03     // Catch:{ all -> 0x028d }
            if (r1 == 0) goto L_0x026e
            r0 = r16
            X.C09420fP.A00(r3, r6, r1, r0)     // Catch:{ all -> 0x028d }
        L_0x026e:
            if (r3 == 0) goto L_0x0278
            X.0Kl r0 = r4.A04     // Catch:{ all -> 0x028d }
            long r0 = r0.nowNanos()     // Catch:{ all -> 0x028d }
            r3.A04 = r0     // Catch:{ all -> 0x028d }
        L_0x0278:
            r9.A01(r3)
            if (r3 == 0) goto L_0x0285
            X.0Kl r0 = r4.A04
            long r0 = r0.nowNanos()
            r3.A06 = r0
        L_0x0285:
            r11 = r6
            goto L_0x0378
        L_0x0288:
            r0 = move-exception
            r10.unlock()     // Catch:{ all -> 0x028d }
            throw r0     // Catch:{ all -> 0x028d }
        L_0x028d:
            r0 = move-exception
            r9.A01(r3)
            throw r0
        L_0x0292:
            if (r2 != 0) goto L_0x038e
            r1 = r41
        L_0x0296:
            java.lang.String r0 = "markerNotStarted"
            A0G(r5, r0, r4, r4, r1)
            java.util.Random r1 = r5.A0J
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r27 = r1.nextInt(r0)
            X.0WK r8 = r5.A09
            X.0WT r7 = r5.A0k
            if (r2 != 0) goto L_0x038a
            r13 = r41
        L_0x02ac:
            r1 = r41
            r0 = r40
            long r0 = X.AnonymousClass0WK.A00(r1, r0)
            r9 = r23
            boolean r9 = r14.A06(r2, r13, r9)
            if (r9 != 0) goto L_0x02e5
            if (r20 != 0) goto L_0x02e5
        L_0x02be:
            X.0lB r0 = r5.A0n
            if (r0 == 0) goto L_0x02e1
            if (r3 == 0) goto L_0x02e1
            X.0Kl r0 = r5.A06
            long r1 = r0.nowNanos()
            if (r6 != 0) goto L_0x02e2
            X.0WT r4 = r5.A0k
            r0 = r41
            long r7 = r4.B8d(r0)
        L_0x02d4:
            r3.A07 = r7
            r0 = 0
            if (r6 == 0) goto L_0x02da
            r0 = 1
        L_0x02da:
            r3.A0L = r0
            X.0lB r0 = r5.A0n
            r0.A05(r3, r1)
        L_0x02e1:
            return r6
        L_0x02e2:
            long r7 = r6.A0C
            goto L_0x02d4
        L_0x02e5:
            boolean r9 = r7.BVp(r13)
            if (r9 == 0) goto L_0x02ef
            r8.A0C(r14, r13)
            goto L_0x02be
        L_0x02ef:
            r9 = 0
            boolean r11 = r14.A05(r2, r13)
            if (r11 == 0) goto L_0x0307
            long r9 = r7.AvZ(r13)
            r28 = r3
            r29 = r8
            r30 = r41
            r32 = r9
            X.0Jz r4 = X.AnonymousClass0WK.A01(r28, r29, r30, r31, r32)
        L_0x0307:
            if (r3 == 0) goto L_0x0311
            X.0Kl r7 = r8.A04
            long r11 = r7.nowNanos()
            r3.A08 = r11
        L_0x0311:
            X.0WD r7 = r8.A06
            r7.A00(r3)
            X.0W1 r12 = r8.A05     // Catch:{ all -> 0x0397 }
            X.0WD r11 = r12.A04     // Catch:{ all -> 0x0397 }
            java.util.concurrent.locks.ReentrantLock r11 = r11.A01     // Catch:{ all -> 0x0397 }
            r20 = r11
            r20.lock()     // Catch:{ all -> 0x0397 }
            X.08V r11 = r12.A05     // Catch:{ all -> 0x0392 }
            int r11 = r11.indexOfKey(r0)     // Catch:{ all -> 0x0392 }
            r20.unlock()     // Catch:{ all -> 0x0397 }
            if (r11 < 0) goto L_0x033f
            X.0fH r11 = r12.A01(r11)     // Catch:{ all -> 0x0397 }
            r12 = r19
            r0 = r17
            long r0 = r12.toNanos(r0)     // Catch:{ all -> 0x0397 }
            r11.A0B = r0     // Catch:{ all -> 0x0397 }
            r0 = r21
            r11.A0W = r0     // Catch:{ all -> 0x0397 }
            goto L_0x035a
        L_0x033f:
            r33 = 0
            if (r54 != 0) goto L_0x0345
            r33 = 1
        L_0x0345:
            r24 = r19
            r25 = r13
            r26 = r40
            r28 = r23
            r29 = r39
            r30 = r17
            r32 = r21
            X.0fH r11 = X.C09350fH.A00(r24, r25, r26, r27, r28, r29, r30, r32, r33)     // Catch:{ all -> 0x0397 }
            r12.A04(r11, r0)     // Catch:{ all -> 0x0397 }
        L_0x035a:
            r11.A09 = r9     // Catch:{ all -> 0x0397 }
            r11.A0I = r4     // Catch:{ all -> 0x0397 }
            r11.A04 = r15     // Catch:{ all -> 0x0397 }
            r11.A0H = r2     // Catch:{ all -> 0x0397 }
            X.0fP r1 = r14.A03     // Catch:{ all -> 0x0397 }
            if (r1 == 0) goto L_0x036b
            r0 = r16
            X.C09420fP.A00(r3, r11, r1, r0)     // Catch:{ all -> 0x0397 }
        L_0x036b:
            r7.A01(r3)
            if (r3 == 0) goto L_0x0378
            X.0Kl r0 = r8.A04
            long r0 = r0.nowNanos()
            r3.A04 = r0
        L_0x0378:
            if (r2 == 0) goto L_0x02be
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "qpl_pivot_name"
            r5.A0i(r11, r0, r1)
            int r1 = r2.A00
            java.lang.String r0 = "qpl_pivot_host"
            r5.A0h(r11, r0, r1)
            goto L_0x02be
        L_0x038a:
            int r13 = r2.A01
            goto L_0x02ac
        L_0x038e:
            int r1 = r2.A01
            goto L_0x0296
        L_0x0392:
            r0 = move-exception
            r20.unlock()     // Catch:{ all -> 0x0397 }
            throw r0     // Catch:{ all -> 0x0397 }
        L_0x0397:
            r0 = move-exception
            r7.A01(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0T(X.0WW, java.lang.String, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, int, long, boolean, boolean):X.0fH");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014a, code lost:
        if (r19.A05(r12, r9.getMarkerId()) != false) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0f(X.AnonymousClass0WW r30, java.lang.String r31, java.util.concurrent.TimeUnit r32, int r33, int r34, int r35, int r36, long r37, short r39) {
        /*
            r29 = this;
            r19 = r30
            r22 = 0
            r8 = r29
            boolean r0 = r8.A0b
            r7 = r33
            r10 = r34
            if (r0 == 0) goto L_0x001b
            java.util.Set r2 = r8.A0K
            long r0 = X.AnonymousClass0WK.A00(r7, r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.remove(r0)
        L_0x001b:
            boolean r0 = r8.A0a
            if (r0 == 0) goto L_0x0032
            long r0 = X.AnonymousClass0WK.A00(r7, r10)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.util.Map r1 = r8.A0I
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0032
            r1.remove(r2)
        L_0x0032:
            X.0lB r0 = r8.A0n
            r21 = r0
            if (r0 == 0) goto L_0x0096
            X.0WA r6 = r0.A01(r7)
        L_0x003c:
            X.0WO r4 = r8.A03(r7, r10)
            if (r4 != 0) goto L_0x0093
            r3 = r7
        L_0x0043:
            r11 = -1
            r0 = r37
            int r2 = (r37 > r11 ? 1 : (r37 == r11 ? 0 : -1))
            r20 = 0
            if (r2 != 0) goto L_0x004f
            r20 = 1
        L_0x004f:
            r2 = r32
            long r0 = r8.A0Q(r0, r2)
            r2 = r35 & 16
            if (r2 != 0) goto L_0x0070
            X.0Ww r5 = r8.A0m
            if (r5 == 0) goto L_0x0070
            r2 = r35 & 2
            if (r2 != 0) goto L_0x006d
            X.0WT r2 = r8.A0k
            X.0WU r2 = r2.AaP()
            boolean r2 = r2.BVq(r3)
            if (r2 == 0) goto L_0x0070
        L_0x006d:
            r5.Cb8(r3, r10)
        L_0x0070:
            if (r30 != 0) goto L_0x0076
            X.0WW r19 = r8.A0R()
        L_0x0076:
            r2 = r19
            r2.A04(r4, r3)
            if (r6 == 0) goto L_0x0085
            X.0Kl r2 = r8.A06
            long r2 = r2.nowNanos()
            r6.A0B = r2
        L_0x0085:
            X.0WK r5 = r8.A09
            java.util.concurrent.TimeUnit r18 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r2 = X.AnonymousClass0WK.A00(r7, r10)
            X.0WD r4 = r5.A06
            r4.A00(r6)
            goto L_0x0098
        L_0x0093:
            int r3 = r4.A01
            goto L_0x0043
        L_0x0096:
            r6 = 0
            goto L_0x003c
        L_0x0098:
            X.0W1 r9 = r5.A05     // Catch:{ all -> 0x0203 }
            X.0fH r9 = r9.A02(r2)     // Catch:{ all -> 0x0203 }
            if (r6 == 0) goto L_0x00a8
            X.0Kl r2 = r5.A04     // Catch:{ all -> 0x0203 }
            long r2 = r2.nowNanos()     // Catch:{ all -> 0x0203 }
            r6.A03 = r2     // Catch:{ all -> 0x0203 }
        L_0x00a8:
            if (r9 == 0) goto L_0x0103
            X.0Jz r2 = r9.A0I     // Catch:{ all -> 0x0203 }
            r17 = r2
            long r2 = r9.A09     // Catch:{ all -> 0x0203 }
            X.0WF r11 = r9.A0G     // Catch:{ all -> 0x0203 }
            r14 = r31
            if (r31 == 0) goto L_0x010a
            if (r11 == 0) goto L_0x00d9
            r15 = 0
        L_0x00b9:
            int r12 = r11.A00     // Catch:{ all -> 0x0203 }
            if (r15 >= r12) goto L_0x00d9
            java.lang.String[] r12 = r11.A05     // Catch:{ all -> 0x0203 }
            r12 = r12[r15]     // Catch:{ all -> 0x0203 }
            boolean r12 = r14.equals(r12)     // Catch:{ all -> 0x0203 }
            if (r12 == 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            int r15 = r15 + 1
            goto L_0x00b9
        L_0x00cb:
            if (r15 < 0) goto L_0x00d9
            X.0Jz[] r0 = r11.A04     // Catch:{ all -> 0x0203 }
            r12 = r0[r15]     // Catch:{ all -> 0x0203 }
            long r13 = r9.A0B     // Catch:{ all -> 0x0203 }
            long[] r0 = r11.A02     // Catch:{ all -> 0x0203 }
            r0 = r0[r15]     // Catch:{ all -> 0x0203 }
            long r0 = r0 + r13
            goto L_0x010c
        L_0x00d9:
            java.lang.String r13 = "Point "
            java.lang.String r12 = " is not found. You should endOnPoint only when point been reported"
            java.lang.String r16 = X.AnonymousClass00U.A0V(r13, r14, r12)     // Catch:{ all -> 0x0203 }
            if (r11 != 0) goto L_0x00e5
            r15 = 0
            goto L_0x00ef
        L_0x00e5:
            int r13 = r11.A00     // Catch:{ all -> 0x0203 }
            java.lang.String[] r15 = new java.lang.String[r13]     // Catch:{ all -> 0x0203 }
            java.lang.String[] r12 = r11.A05     // Catch:{ all -> 0x0203 }
            r11 = 0
            java.lang.System.arraycopy(r12, r11, r15, r11, r13)     // Catch:{ all -> 0x0203 }
        L_0x00ef:
            int r14 = r9.A03     // Catch:{ all -> 0x0203 }
            int r13 = r9.A02     // Catch:{ all -> 0x0203 }
            X.0Wb r12 = new X.0Wb     // Catch:{ all -> 0x0203 }
            r11 = r16
            r12.<init>(r14, r13, r11, r15)     // Catch:{ all -> 0x0203 }
            X.0lB r11 = r5.A02     // Catch:{ all -> 0x0203 }
            if (r11 == 0) goto L_0x0102
            r11.A06(r12)     // Catch:{ all -> 0x0203 }
            goto L_0x010a
        L_0x0102:
            throw r12     // Catch:{ all -> 0x0203 }
        L_0x0103:
            r12 = r22
            r2 = 0
            r17 = 0
            goto L_0x010c
        L_0x010a:
            r12 = r22
        L_0x010c:
            r4.A01(r6)
            if (r12 != 0) goto L_0x011a
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r10
            r15 = r2
            X.0Jz r12 = r11.A05(r12, r13, r14, r15)
        L_0x011a:
            if (r6 == 0) goto L_0x0124
            X.0Kl r10 = r5.A04
            long r10 = r10.nowNanos()
            r6.A08 = r10
        L_0x0124:
            r10 = r17
            X.AnonymousClass0WK.A03(r5, r10, r2)
            r4.A00(r6)
            if (r9 == 0) goto L_0x0195
            r2 = r18
            long r2 = r2.toNanos(r0)     // Catch:{ all -> 0x0203 }
            long r10 = r9.A0B     // Catch:{ all -> 0x0203 }
            long r2 = r2 - r10
            r9.A0J = r12     // Catch:{ all -> 0x0203 }
            X.0WO r12 = r9.A0H     // Catch:{ all -> 0x0203 }
            boolean r10 = r9.A0Q     // Catch:{ all -> 0x0203 }
            if (r10 != 0) goto L_0x014c
            int r11 = r9.getMarkerId()     // Catch:{ all -> 0x0203 }
            r10 = r19
            boolean r10 = r10.A05(r12, r11)     // Catch:{ all -> 0x0203 }
            r11 = 0
            if (r10 == 0) goto L_0x014d
        L_0x014c:
            r11 = 1
        L_0x014d:
            r12 = r39
            r23 = r5
            r24 = r9
            r25 = r18
            r26 = r0
            r28 = r12
            X.AnonymousClass0WK.A02(r23, r24, r25, r26, r28)     // Catch:{ all -> 0x0203 }
            r10 = r18
            long r0 = r10.toNanos(r0)     // Catch:{ all -> 0x0203 }
            r9.A0A = r0     // Catch:{ all -> 0x0203 }
            r9.A0P = r12     // Catch:{ all -> 0x0203 }
            r9.A08 = r2     // Catch:{ all -> 0x0203 }
            boolean r0 = r9.A0W     // Catch:{ all -> 0x0203 }
            if (r0 != 0) goto L_0x016e
            r20 = 0
        L_0x016e:
            r0 = r20
            r9.A0W = r0     // Catch:{ all -> 0x0203 }
            r0 = r36
            r9.A06 = r0     // Catch:{ all -> 0x0203 }
            if (r6 == 0) goto L_0x0180
            X.0Kl r0 = r5.A04     // Catch:{ all -> 0x0203 }
            long r0 = r0.nowNanos()     // Catch:{ all -> 0x0203 }
            r6.A0A = r0     // Catch:{ all -> 0x0203 }
        L_0x0180:
            r0 = r19
            X.0fP r1 = r0.A03     // Catch:{ all -> 0x0203 }
            if (r1 == 0) goto L_0x018a
            r0 = 2
            X.C09420fP.A00(r6, r9, r1, r0)     // Catch:{ all -> 0x0203 }
        L_0x018a:
            if (r6 == 0) goto L_0x019a
            X.0Kl r0 = r5.A04     // Catch:{ all -> 0x0203 }
            long r0 = r0.nowNanos()     // Catch:{ all -> 0x0203 }
            r6.A04 = r0     // Catch:{ all -> 0x0203 }
            goto L_0x019a
        L_0x0195:
            r4.A01(r6)
            r9 = 0
            goto L_0x019f
        L_0x019a:
            if (r11 == 0) goto L_0x0195
            r4.A01(r6)
        L_0x019f:
            r4 = 1
            if (r9 == 0) goto L_0x01b6
            X.0jF r0 = r8.A03
            if (r0 == 0) goto L_0x0200
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.valueOf((java.lang.Boolean) r22)
        L_0x01aa:
            r9.A0F = r0
            java.lang.String r2 = "markerEnd"
            r1 = r22
            A0G(r8, r2, r1, r1, r7)
            r8.A0k(r9, r4)
        L_0x01b6:
            if (r21 == 0) goto L_0x01fc
            if (r6 == 0) goto L_0x01fc
            X.0Kl r0 = r8.A06
            long r0 = r0.nowNanos()
            if (r9 != 0) goto L_0x01fd
            X.0WT r2 = r8.A0k
            long r2 = r2.B8d(r7)
        L_0x01c8:
            r6.A07 = r2
            if (r9 != 0) goto L_0x01cd
            r4 = 0
        L_0x01cd:
            r6.A0L = r4
            r2 = r21
            boolean r2 = X.C12020lB.A00(r6, r2)
            if (r2 != 0) goto L_0x01fc
            long r2 = r6.A0F
            long r0 = r0 - r2
            r2 = r21
            X.0fC r3 = r2.A00
            java.lang.String r2 = "MARKER_END_TIME"
            X.0fH r1 = X.C09300fC.A00(r6, r3, r2, r0)
            boolean r0 = X.C09300fC.A04(r3)
            if (r0 == 0) goto L_0x01fc
            X.C09300fC.A02(r6, r3, r1)
            X.0W4 r0 = r3.A00
            r0.execute(r1)
            java.lang.ThreadLocal r1 = r3.A02
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.set(r0)
        L_0x01fc:
            return
        L_0x01fd:
            long r2 = r9.A0C
            goto L_0x01c8
        L_0x0200:
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET
            goto L_0x01aa
        L_0x0203:
            r0 = move-exception
            r4.A01(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0f(X.0WW, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, long, short):void");
    }

    public final void markerAnnotate(int i, int i2, String str, double d) {
        String str2 = str;
        double d2 = d;
        A0m(str2, d2, i, i2, Process.myTid());
    }

    public final void markerAnnotate(int i, int i2, String str, int i3) {
        String str2 = str;
        A0n(str2, i, i2, i3, Process.myTid());
    }

    public final void markerAnnotate(int i, int i2, String str, long j) {
        String str2 = str;
        A0o(str2, i, i2, Process.myTid(), j);
    }

    public final void markerAnnotate(int i, int i2, String str, String str2) {
        String str3 = str;
        A0p(str3, i, i2, Process.myTid(), str2);
    }

    public final void markerAnnotate(int i, int i2, String str, boolean z) {
        A0a(i, i2, str, z, Process.myTid());
    }

    public final void markerAnnotate(int i, int i2, String str, double[] dArr) {
        String str2 = str;
        double[] dArr2 = dArr;
        A0q(str2, dArr2, i, i2, Process.myTid());
    }

    public final void markerAnnotate(int i, int i2, String str, int[] iArr) {
        String str2 = str;
        int[] iArr2 = iArr;
        A0r(str2, iArr2, i, i2, Process.myTid());
    }

    public final void markerAnnotate(int i, int i2, String str, long[] jArr) {
        String str2 = str;
        long[] jArr2 = jArr;
        A0s(str2, jArr2, i, i2, Process.myTid());
    }

    public final void markerAnnotate(int i, int i2, String str, String[] strArr) {
        String str2 = str;
        String[] strArr2 = strArr;
        A0t(str2, strArr2, i, i2, Process.myTid());
    }

    public final void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        String str2 = str;
        boolean[] zArr2 = zArr;
        A0u(str2, zArr2, i, i2, Process.myTid());
    }

    public final void markerAnnotate(int i, String str, double d) {
        String str2 = str;
        double d2 = d;
        A0m(str2, d2, i, 0, Process.myTid());
    }

    public final void markerAnnotate(int i, String str, int i2) {
        String str2 = str;
        A0n(str2, i, 0, i2, Process.myTid());
    }

    public final void markerAnnotate(int i, String str, long j) {
        String str2 = str;
        A0o(str2, i, 0, Process.myTid(), j);
    }

    public final void markerAnnotate(int i, String str, String str2) {
        String str3 = str;
        A0p(str3, i, 0, Process.myTid(), str2);
    }

    public final void markerAnnotate(int i, String str, boolean z) {
        A0a(i, 0, str, z, Process.myTid());
    }

    public final void markerAnnotate(int i, String str, double[] dArr) {
        String str2 = str;
        double[] dArr2 = dArr;
        A0q(str2, dArr2, i, 0, Process.myTid());
    }

    public final void markerAnnotate(int i, String str, int[] iArr) {
        String str2 = str;
        int[] iArr2 = iArr;
        A0r(str2, iArr2, i, 0, Process.myTid());
    }

    public final void markerAnnotate(int i, String str, long[] jArr) {
        String str2 = str;
        long[] jArr2 = jArr;
        A0s(str2, jArr2, i, 0, Process.myTid());
    }

    public final void markerAnnotate(int i, String str, String[] strArr) {
        String str2 = str;
        String[] strArr2 = strArr;
        A0t(str2, strArr2, i, 0, Process.myTid());
    }

    public final void markerAnnotate(int i, String str, boolean[] zArr) {
        String str2 = str;
        boolean[] zArr2 = zArr;
        A0u(str2, zArr2, i, 0, Process.myTid());
    }

    public final void markerPoint(int i, int i2, int i3, String str, AnonymousClass0WQ r25, long j, TimeUnit timeUnit, int i4) {
        String obj;
        int i5 = i;
        AnonymousClass0WQ r8 = r25;
        if (r25 == null) {
            r8 = null;
        } else {
            r8.A03 = true;
        }
        int myTid = Process.myTid();
        String str2 = str;
        if (A0O(this, str2)) {
            AnonymousClass0WA r7 = null;
            if (this.A0n != null) {
                r7 = this.A0n.A01(i5);
            }
            if (A0M(this)) {
                if (r8 == null) {
                    obj = null;
                } else {
                    obj = r8.toString();
                }
                A0G(this, "markerPoint", str2, obj, i5);
            }
            long j2 = j;
            boolean z = false;
            if (j == -1) {
                z = true;
            }
            long A0Q2 = A0Q(j2, timeUnit);
            int i6 = i2;
            this.A09.A08(r7, r8, A0R(), str2, TimeUnit.NANOSECONDS, i5, i6, i3, i4, myTid, A0Q2, !z);
            C05900Ww r1 = this.A0m;
            if (r1 != null) {
                AnonymousClass0WO A042 = A04(i5, i6);
                if (A042 != null) {
                    i5 = A042.A01;
                }
                if (this.A0k.AaP().BVq(i5)) {
                    r1.Cb9(i5, i6, str2);
                }
            }
            if (this.A0n != null && r7 != null) {
                this.A0n.A04(r7);
            }
        }
    }

    public final void markerPoint(int i, int i2, String str) {
        markerPoint(i, i2, str, (String) null, -1, TimeUnit.NANOSECONDS);
    }

    public final void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, str, (String) null, j, timeUnit);
    }

    public final void markerPoint(int i, int i2, String str, String str2) {
        markerPoint(i, i2, str, str2, -1, TimeUnit.NANOSECONDS);
    }

    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, str, str2, j, timeUnit, 0);
    }

    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        AnonymousClass0WQ r9;
        int i4 = i;
        int myTid = Process.myTid();
        String str3 = str;
        if (A0O(this, str3)) {
            AnonymousClass0WA r8 = null;
            if (this.A0n != null) {
                r8 = this.A0n.A01(i4);
            }
            String str4 = str2;
            A0G(this, "markerPoint", str3, str4, i4);
            long j2 = j;
            boolean z = false;
            if (j == -1) {
                z = true;
            }
            long A0Q2 = A0Q(j2, timeUnit);
            AnonymousClass0WK r7 = this.A09;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            boolean z2 = !z;
            AnonymousClass0WW A0R2 = A0R();
            if (str2 == null) {
                r9 = null;
            } else {
                r9 = new AnonymousClass0WQ();
                r9.A00("__key", str4, 1);
                r9.A03 = true;
            }
            int i5 = i2;
            r7.A08(r8, r9, A0R2, str3, timeUnit2, i4, i5, 7, i3, myTid, A0Q2, z2);
            C05900Ww r1 = this.A0m;
            if (r1 != null) {
                AnonymousClass0WO A042 = A04(i4, i5);
                if (A042 != null) {
                    i4 = A042.A01;
                }
                if (this.A0k.AaP().BVq(i4)) {
                    r1.Cb9(i4, i5, str3);
                }
            }
            if (this.A0n != null && r8 != null) {
                this.A0n.A04(r8);
            }
        }
    }

    public final void markerPoint(int i, String str) {
        markerPoint(i, 0, str, (String) null, -1, TimeUnit.NANOSECONDS);
    }

    public final void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, 0, str, (String) null, j, timeUnit);
    }

    public final void markerPoint(int i, String str, String str2) {
        markerPoint(i, 0, str, str2, -1, TimeUnit.NANOSECONDS);
    }

    public final void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerPoint(i, 0, str, str2, j, timeUnit);
    }

    public final void markerStart(int i) {
        markerStart(i, 0, -1, TimeUnit.NANOSECONDS, 0);
    }

    public final void markerStart(int i, int i2) {
        markerStart(i, i2, -1, TimeUnit.NANOSECONDS, 0);
    }

    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit, 0);
    }

    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        int i4 = i;
        int i5 = i2;
        if (this.A0b) {
            this.A0K.add(Long.valueOf(AnonymousClass0WK.A00(i4, i5)));
        }
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        int i6 = i3;
        if (this.A0a) {
            String A072 = A07(i4, i5, this.A0e, this.A0c, this.A0d);
            if (A0U(A072, (String) null, timeUnit2, i4, i5, i6, j2, true) != null) {
                this.A0I.put(String.valueOf(AnonymousClass0WK.A00(i4, i5)), A072);
                return;
            }
            return;
        }
        A0T(A0R(), (String) null, (String) null, timeUnit2, i4, i5, i6, Process.myTid(), -1, j2, true, true);
    }

    public final void markerStart(int i, int i2, String str, String str2) {
        markerStart(i, i2);
        markerAnnotate(i, i2, str, str2);
    }

    public final void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit);
        markerAnnotate(i, i2, str, str2);
    }

    public final void markerStart(int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2;
        if (this.A0b) {
            this.A0K.add(Long.valueOf(AnonymousClass0WK.A00(i3, i4)));
        }
        boolean z2 = z;
        if (this.A0a) {
            String A072 = A07(i3, i4, this.A0e, this.A0c, this.A0d);
            if (A0U(A072, (String) null, TimeUnit.NANOSECONDS, i3, i4, 0, -1, z2) != null) {
                this.A0I.put(String.valueOf(AnonymousClass0WK.A00(i3, i4)), A072);
                return;
            }
            return;
        }
        A0T(A0R(), (String) null, (String) null, TimeUnit.NANOSECONDS, i3, i4, 0, Process.myTid(), -1, -1, z2, true);
    }

    public final void markerStart(int i, String str, String str2) {
        markerStart(i);
        markerAnnotate(i, str, str2);
    }

    public final void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, 0, j, timeUnit);
        markerAnnotate(i, str, str2);
    }

    public final void markerStart(int i, boolean z) {
        markerStart(i, 0, z);
    }

    public final boolean isMarkerOn(int i, int i2, boolean z) {
        return isMarkerOn(i, i2);
    }

    public final EventBuilder markEventBuilder(int i, String str) {
        return A02((AnonymousClass0WO) null, str, i);
    }

    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        markerAnnotate(i, i2, str, str2);
        C05900Ww r1 = this.A0m;
        if (r1 != null) {
            AnonymousClass0WO A042 = A04(i, i2);
            if (A042 != null) {
                i = A042.A01;
            }
            r1.Cb6(i, i2, str, str2);
        }
    }

    public final void markerDrop(int i, int i2) {
        A0v(TimeUnit.NANOSECONDS, i, i2, 0, Process.myTid(), currentMonotonicTimestampNanos());
    }

    public final void markerEnd(int i, int i2, short s) {
        markerEnd(i, i2, s, -1, TimeUnit.NANOSECONDS);
    }

    public final void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, (String) null, i2, s);
    }

    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C09350fH A0T2 = A0T(A0R(), (String) null, str2, TimeUnit.NANOSECONDS, i3, i4, 2, Process.myTid(), -1, -1, z, true);
        A09(i3, i4, j);
        if (A0T2 != null) {
            this.A09.A09((AnonymousClass0WA) null, A0R(), A0T2, "sampling_basis", str2, Process.myTid());
        }
    }

    public final void markerTag(int i, String str) {
        this.A09.A0D(A0R(), str, i, 0);
    }

    public final MarkerEditor withMarker(int i, int i2) {
        AnonymousClass0WA A012;
        C12020lB r4 = this.A0n;
        if (r4 == null) {
            A012 = null;
        } else {
            A012 = r4.A01(i);
        }
        C09350fH A032 = this.A09.A05.A03(A012, AnonymousClass0WK.A00(i, i2));
        if (A032 == null) {
            return C08690e6.A00;
        }
        return new C08680e4(A032, r4, this);
    }

    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        int i3 = i;
        int i4 = i2;
        if (this.A0b) {
            this.A0K.add(Long.valueOf(AnonymousClass0WK.A00(i3, i4)));
        }
        boolean z2 = z;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        if (this.A0a) {
            String A072 = A07(i3, i4, this.A0e, this.A0c, this.A0d);
            if (A0U(A072, (String) null, timeUnit2, i3, i4, 0, j2, z2) != null) {
                this.A0I.put(String.valueOf(AnonymousClass0WK.A00(i3, i4)), A072);
                return;
            }
            return;
        }
        A0T(A0R(), (String) null, (String) null, timeUnit2, i3, i4, 0, Process.myTid(), -1, j2, z2, true);
    }

    public final boolean isMarkerOn(int i, int i2) {
        AnonymousClass0WK r0 = this.A09;
        return r0.A05.A05((AnonymousClass0WA) null, A0R(), AnonymousClass0WK.A00(i, i2));
    }

    public final void markerEnd(int i, short s) {
        markerEnd(i, 0, s, -1, TimeUnit.NANOSECONDS);
    }

    public final void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        A0T(A0R(), (String) null, (String) null, timeUnit2, i, i2, 2, Process.myTid(), -1, j, z, true);
    }

    public final boolean isMarkerOn(int i, boolean z) {
        return isMarkerOn(i);
    }

    public final void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = timeUnit;
        A0f((AnonymousClass0WW) null, (String) null, timeUnit2, i, i2, 0, Process.myTid(), j, s);
    }
}
