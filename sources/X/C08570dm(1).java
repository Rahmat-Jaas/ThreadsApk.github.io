package X;

import android.util.Log;
import android.util.SparseIntArray;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0dm  reason: invalid class name and case insensitive filesystem */
public final class C08570dm extends AnonymousClass0Uk implements AnonymousClass0Wg {
    public static final int A04 = ProvidersRegistry.A00.A02("qpl");
    public static final C08570dm A05 = new C08570dm();
    public static final int[] A06 = {8136209};
    public QuickPerformanceLogger A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();
    public volatile SparseIntArray A03 = new SparseIntArray(2);

    public C08570dm() {
        super((String) null);
    }

    public final boolean A07() {
        return true;
    }

    public final C05820We getListenerFlags() {
        return null;
    }

    public final String getName() {
        return "profilo_event_provider";
    }

    public final C05830Wf getListenerMarkers() {
        int[] iArr;
        C05680Uw r2 = C05680Uw.A0A;
        if (r2 != null) {
            C07890cN r1 = (C07890cN) ((AnonymousClass0V0) r2.A01.get(C03530Jd.A01));
            if (r1 != null) {
                AnonymousClass0UZ[] r5 = ((C05510Ua) r1.A06((AnonymousClass0UJ) r2.A05.get())).A01;
                int length = r5.length;
                int[] iArr2 = new int[length];
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    iArr2[i2] = r5[i].A01;
                    i++;
                    i2++;
                }
                if (length != 0) {
                    SparseIntArray sparseIntArray = this.A03;
                    int size = sparseIntArray.size();
                    int[] iArr3 = null;
                    if (sparseIntArray.get(-1) > 0) {
                        iArr3 = AnonymousClass0Wg.A00;
                    } else {
                        int i3 = 0;
                        int length2 = iArr2.length;
                        int i4 = length2 + size;
                        if (i4 != 0) {
                            iArr3 = new int[i4];
                            int i5 = 0;
                            int i6 = 0;
                            while (i5 < length2) {
                                iArr3[i6] = iArr2[i5];
                                i5++;
                                i6++;
                            }
                            while (i3 < size) {
                                iArr3[i6] = sparseIntArray.keyAt(i3);
                                i3++;
                                i6++;
                            }
                        }
                    }
                    return new C05830Wf(iArr3, iArr2);
                }
            }
            SparseIntArray sparseIntArray2 = this.A03;
            int size2 = sparseIntArray2.size();
            if (size2 != 0) {
                if (sparseIntArray2.get(-1) > 0) {
                    iArr = AnonymousClass0Wg.A00;
                } else {
                    int i7 = 0;
                    iArr = new int[size2];
                    int i8 = 0;
                    while (i7 < size2) {
                        iArr[i8] = sparseIntArray2.keyAt(i7);
                        i7++;
                        i8++;
                    }
                }
                return new C05830Wf(iArr, (int[]) null);
            }
        }
        return C05830Wf.A05;
    }

    public final int getTracingProviders() {
        return A04 & TraceEvents.sProviders;
    }

    public final void onMarkEvent(C05800Wc r25) {
        int i;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C05710Vf r1 = (C05710Vf) it.next();
            if (C05710Vf.A02(r1, r25.getMarkerId())) {
                MultiBufferLogger multiBufferLogger = r1.A02;
                multiBufferLogger.writeStandardEntry(7, 51, 0, 0, r25.getMarkerId(), 0, ((((long) r25.AgE()) << 60) & -1152921504606846976L) | ((((long) r25.BJK()) << 16) & 281474976645120L));
                int writeStandardEntry = multiBufferLogger.writeStandardEntry(7, 59, 0, 0, r25.getMarkerId(), 0, (((long) r25.BJK()) << 16) & 281474976645120L);
                multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, "type"), r25.BEr());
                List Ago = r25.Ago();
                int size = Ago.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    i2 = i3 + 1;
                    String str = (String) Ago.get(i3);
                    int writeBytesEntry = multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, (String) Ago.get(i2));
                    if (str == null) {
                        str = "null";
                    }
                    int length = str.length();
                    if (length > 512) {
                        int i4 = 0;
                        do {
                            i = i4 + 512;
                            writeBytesEntry = multiBufferLogger.writeBytesEntry(1, 57, writeBytesEntry, str.substring(i4, Math.min(length, i)));
                            i4 = i;
                        } while (i < length);
                    } else {
                        multiBufferLogger.writeBytesEntry(1, 57, writeBytesEntry, str);
                    }
                }
            }
        }
    }

    public final void onMarkerAnnotate(C05800Wc r22) {
        int length;
        int length2;
        int i;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C05710Vf r7 = (C05710Vf) it.next();
            String Ar4 = r22.Ar4();
            String Ar5 = r22.Ar5();
            if (!(Ar4 == null || Ar5 == null || (length = Ar4.length()) == 0 || (length2 = Ar5.length()) == 0 || !C05710Vf.A02(r7, r22.getMarkerId()) || Ar4.equals("loom_id"))) {
                if (length > 512) {
                    Ar4 = AnonymousClass00U.A0L(Ar4.substring(0, 509), "...");
                }
                int BGK = r22.BGK();
                long ArD = r22.ArD();
                MultiBufferLogger multiBufferLogger = r7.A02;
                int writeBytesEntry = multiBufferLogger.writeBytesEntry(1, 56, multiBufferLogger.writeStandardEntry(1, 59, ArD, BGK, r22.getMarkerId(), 0, 281474976710656L | C05710Vf.A00(r22) | ((long) r22.Ar1())), Ar4);
                if (length2 > 512) {
                    int i2 = 0;
                    do {
                        i = i2 + 512;
                        writeBytesEntry = multiBufferLogger.writeBytesEntry(1, 57, writeBytesEntry, Ar5.substring(i2, Math.min(length2, i)));
                        i2 = i;
                    } while (i < length2);
                } else {
                    multiBufferLogger.writeBytesEntry(1, 57, writeBytesEntry, Ar5);
                }
                C05680Uw r6 = C05680Uw.A0A;
                if (r6 != null && r22.B5X()) {
                    int markerId = r22.getMarkerId();
                    long ApM = ((long) r22.ApM()) << 32;
                    String A0V = AnonymousClass00U.A0V(Ar4, ":", Ar5);
                    TraceContext A012 = C05680Uw.A01(r6, (Object) null, C03530Jd.A01 | C03540Je.A01, ApM | ((long) markerId));
                    if (A012 != null) {
                        synchronized (r6) {
                            C05680Uw.A02(r6);
                            AnonymousClass0Uy r2 = r6.A00;
                            synchronized (r2) {
                                r2.sendMessage(r2.obtainMessage(7, new C05690Ux(A012, A0V)));
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void onMarkerDrop(C05800Wc r16) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C05710Vf r3 = (C05710Vf) it.next();
            int markerId = r16.getMarkerId();
            int ApM = r16.ApM();
            if (C05710Vf.A02(r3, r16.getMarkerId())) {
                long A002 = C05710Vf.A00(r16);
                if (!r16.BZa()) {
                    A002 |= 281474976710656L;
                }
                r3.A02.writeStandardEntry(0, 48, r16.ArD(), r16.BGK(), markerId, 0, A002);
            }
            C05680Uw r5 = C05680Uw.A0A;
            if (r5 != null) {
                C05680Uw.A04(r5, (Object) null, C03530Jd.A01 | C03540Je.A01, 0, 2, (((long) ApM) << 32) | ((long) markerId));
            }
        }
    }

    public final void onMarkerPoint(C05800Wc r24, String str, AnonymousClass0WQ r26, long j, long j2, boolean z, int i) {
        int writeStandardEntry;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C05710Vf r3 = (C05710Vf) it.next();
            int i2 = i;
            if (i2 <= r3.A01 && C05710Vf.A02(r3, r24.getMarkerId())) {
                int markerId = r24.getMarkerId();
                int BGK = r24.BGK();
                MultiBufferLogger multiBufferLogger = r3.A02;
                if (z) {
                    writeStandardEntry = multiBufferLogger.writeStandardEntry(1, 50, r24.ArD(), BGK, markerId, 0, C05710Vf.A00(r24) | ((((long) i2) << 60) & -1152921504606846976L));
                } else {
                    writeStandardEntry = multiBufferLogger.writeStandardEntry(3, 50, 0, BGK, markerId, 0, C05710Vf.A00(r24) | ((((long) i2) << 60) & -1152921504606846976L));
                }
                multiBufferLogger.writeBytesEntry(1, 83, writeStandardEntry, str);
                if (r26 != null) {
                    multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, "QPL::data"), r26.toString());
                }
            }
        }
    }

    public final void onMarkerRestart(C05800Wc r3) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C05710Vf) it.next()).A03(r3);
        }
    }

    public final void onMarkerStart(C05800Wc r3) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C05710Vf) it.next()).A03(r3);
        }
    }

    public final void onMarkerStop(C05800Wc r21) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C05710Vf r4 = (C05710Vf) it.next();
            C05800Wc r5 = r21;
            int markerId = r5.getMarkerId();
            int ApM = r5.ApM();
            if (C05710Vf.A02(r4, r5.getMarkerId())) {
                long A002 = C05710Vf.A00(r5) | ((long) r5.Ar1());
                if (!r5.BZa()) {
                    A002 |= 281474976710656L;
                }
                C05710Vf.A01(r4, r5, A002);
                r4.A02.writeStandardEntry(0, 47, r5.ArD(), r5.BGK(), markerId, 0, A002);
            }
            C05680Uw r42 = C05680Uw.A0A;
            if (r42 != null) {
                long j = (((long) ApM) << 32) | ((long) markerId);
                if (r5.B5X()) {
                    int AeK = r5.AeK();
                    TraceContext A012 = C05680Uw.A01(r42, (Object) null, C03530Jd.A01 | C03540Je.A01, j);
                    if (A012 != null) {
                        synchronized (r42) {
                            C05680Uw.A02(r42);
                            AnonymousClass0Uy r52 = r42.A00;
                            synchronized (r52) {
                                r52.sendMessage(r52.obtainMessage(5, AeK, 0, A012));
                            }
                        }
                    }
                }
                TraceContext A013 = C05680Uw.A01(r42, (Object) null, C03530Jd.A01 | C03540Je.A01, j);
                if (A013 != null) {
                    C05680Uw.A03(r42, A013);
                    Log.w("Profilo/TraceControl", AnonymousClass00U.A0L("STOP PROFILO_TRACEID: ", AnonymousClass0QJ.A00(A013.A06)));
                    synchronized (r42) {
                        C05680Uw.A02(r42);
                        AnonymousClass0Uy r1 = r42.A00;
                        synchronized (r1) {
                            r1.sendMessage(r1.obtainMessage(6, A013));
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final boolean onQuickMarkerStart(int i, int i2) {
        C05680Uw r6 = C05680Uw.A0A;
        if (r6 == null) {
            return false;
        }
        this.A01.set(Long.valueOf(System.nanoTime()));
        return r6.A09((((long) i2) << 32) | ((long) i), C03530Jd.A01, 0);
    }

    public final void onTraceEnded(TraceContext traceContext, C08000cZ r14) {
        TraceConfigExtras traceConfigExtras = traceContext.A08;
        int[] A032 = traceConfigExtras.A03("provider.qpl.buffers");
        if (A032 == null) {
            A032 = new int[]{0};
        }
        SparseIntArray clone = this.A03.clone();
        int i = 0;
        while (true) {
            int length = A032.length;
            if (i >= length) {
                break;
            }
            int i2 = A032[i];
            String str = "provider.qpl.event_whitelist";
            if (length > 1) {
                str = AnonymousClass00U.A0D(str, '.', i2);
            }
            int[] A033 = traceConfigExtras.A03(str);
            if (A033 == null) {
                A033 = new int[]{-1};
            } else if (i == 0) {
                int length2 = A033.length;
                int[] iArr = A06;
                int length3 = iArr.length;
                int[] iArr2 = new int[(length2 + length3)];
                System.arraycopy(A033, 0, iArr2, 0, length2);
                System.arraycopy(iArr, 0, iArr2, length2, length3);
            }
            for (int i3 : A033) {
                int i4 = clone.get(i3);
                if (i4 == 1) {
                    clone.delete(i3);
                } else if (i4 > 1) {
                    clone.put(i3, i4 - 1);
                }
            }
            String A0D = AnonymousClass00U.A0D(traceContext.A0D, Rfc3492Idn.delimiter, i2);
            CopyOnWriteArrayList copyOnWriteArrayList = this.A02;
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C05710Vf r1 = (C05710Vf) it.next();
                if (r1.A03.equals(A0D)) {
                    copyOnWriteArrayList.remove(r1);
                    break;
                }
            }
            i++;
        }
        this.A03 = clone;
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
    }

    public final void onTraceStarted(TraceContext traceContext, C08000cZ r22) {
        TraceContext traceContext2 = traceContext;
        TraceConfigExtras traceConfigExtras = traceContext2.A08;
        int[] A032 = traceConfigExtras.A03("provider.qpl.buffers");
        if (A032 == null) {
            A032 = new int[]{0};
        }
        SparseIntArray clone = this.A03.clone();
        int i = 0;
        while (true) {
            int length = A032.length;
            if (i >= length) {
                break;
            }
            int i2 = A032[i];
            Buffer buffer = traceContext2.A0F[i2];
            String str = "provider.qpl.event_whitelist";
            if (length > 1) {
                str = AnonymousClass00U.A0D(str, '.', i2);
            }
            int[] A033 = traceConfigExtras.A03(str);
            if (A033 == null) {
                A033 = new int[]{-1};
            } else if (i == 0) {
                int length2 = A033.length;
                int[] iArr = A06;
                int length3 = iArr.length;
                int[] iArr2 = new int[(length2 + length3)];
                System.arraycopy(A033, 0, iArr2, 0, length2);
                System.arraycopy(iArr, 0, iArr2, length2, length3);
                A033 = iArr2;
            }
            Arrays.sort(A033);
            for (int i3 : A033) {
                clone.put(i3, clone.get(i3) + 1);
            }
            String str2 = "provider.qpl.point_max_level";
            if (length > 1) {
                str2 = AnonymousClass00U.A0D(str2, '.', i2);
            }
            int A002 = traceConfigExtras.A00(str2, 9);
            MultiBufferLogger multiBufferLogger = new MultiBufferLogger();
            multiBufferLogger.addBuffer(buffer);
            this.A02.add(new C05710Vf(multiBufferLogger, AnonymousClass00U.A0D(traceContext2.A0D, Rfc3492Idn.delimiter, i2), A033, A002));
            i++;
        }
        ThreadLocal threadLocal = this.A01;
        Number number = (Number) threadLocal.get();
        if (number != null) {
            BufferLogger.writeStandardEntry(traceContext2.A09, 4, 42, number.longValue(), 0, 0, 0, 0);
            threadLocal.remove();
        }
        this.A03 = clone;
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
    }

    public final void disable() {
        C14030oh.A0A(-561358212, C14030oh.A03(-1883740770));
    }

    public final void enable() {
        C14030oh.A0A(1942287159, C14030oh.A03(800229478));
    }

    public final int getSupportedProviders() {
        return A04;
    }

    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }
}
