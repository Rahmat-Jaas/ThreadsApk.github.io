package X;

import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import com.facebook.profilo.writer.NativeTraceWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.0Uw  reason: invalid class name and case insensitive filesystem */
public final class C05680Uw {
    public static final ThreadLocal A09 = new C05670Uv();
    public static volatile C05680Uw A0A;
    public AnonymousClass0Uy A00;
    public final SparseArray A01;
    public final MmapBufferManager A02;
    public final File A03;
    public final AtomicInteger A04 = new AtomicInteger(0);
    public final AtomicReference A05;
    public final AtomicReferenceArray A06 = new AtomicReferenceArray(2);
    public final C08000cZ A07;
    public final AnonymousClass0V4 A08;

    public static void A03(C05680Uw r5, TraceContext traceContext) {
        AtomicInteger atomicInteger;
        int i;
        int i2 = 0;
        while (i2 < 2) {
            if (!r5.A06.compareAndSet(i2, traceContext, (Object) null)) {
                i2++;
            } else {
                do {
                    atomicInteger = r5.A04;
                    i = atomicInteger.get();
                } while (!atomicInteger.compareAndSet(i, (1 << i2) ^ i));
                return;
            }
        }
        Log.w("Profilo/TraceControl", "Could not reset Trace Context to null");
    }

    public final boolean A08(int i, long j) {
        return A04(this, (Object) null, i, 1, 0, j);
    }

    public final boolean A09(long j, int i, int i2) {
        int A002;
        int A003;
        long abs;
        TraceConfigExtras A022;
        String str;
        Buffer buffer;
        int A004;
        boolean z;
        AnonymousClass0Uk[] r8;
        ArrayList<String> arrayList;
        int i3;
        int i4;
        AtomicInteger atomicInteger = this.A04;
        int i5 = atomicInteger.get();
        int i6 = i2;
        int i7 = i2 & 2;
        int i8 = 1;
        if (i7 != 0) {
            i8 = 65534;
        }
        int i9 = i5 | i8;
        int i10 = (1 << 2) - 1;
        boolean z2 = false;
        if (((i9 ^ -1) & (i9 + 1) & i10) != 0) {
            int i11 = i;
            int i12 = i11;
            AnonymousClass0V0 r82 = (AnonymousClass0V0) this.A01.get(i12);
            if (r82 != null) {
                long j2 = j;
                if (A01(this, (Object) null, i12, j2) == null) {
                    AnonymousClass0UJ r7 = (AnonymousClass0UJ) this.A05.get();
                    boolean A032 = r82.A03();
                    if (!A032) {
                        A003 = r82.A01((Object) null, j2);
                        A002 = -1;
                    } else if (r7 != null && (A002 = r82.A00(r7, (Object) null, j2)) >= 0) {
                        A003 = ProvidersRegistry.A00.A00(Arrays.asList(r7.getTraceConfigProviders(A002)));
                    }
                    if (A003 != 0) {
                        do {
                            abs = Math.abs(((Random) A09.get()).nextLong());
                        } while (abs <= 0);
                        String A005 = AnonymousClass0QJ.A00(abs);
                        Log.w("Profilo/TraceControl", AnonymousClass00U.A0L("START PROFILO_TRACEID: ", A005));
                        if (A032) {
                            A022 = new TraceConfigExtras(r7, A002);
                        } else {
                            A022 = r82.A02((Object) null, j2);
                        }
                        int A006 = A022.A00("trace_config.buffers", 1);
                        int optSystemConfigParamInt = r7.optSystemConfigParamInt("system_config.buffer_size", 5000);
                        boolean A023 = A022.A02("trace_config.mmap_buffer", false);
                        int[] A033 = A022.A03("trace_config.buffer_sizes");
                        Buffer[] bufferArr = new Buffer[A006];
                        for (int i13 = 0; i13 < A006; i13++) {
                            MmapBufferManager mmapBufferManager = this.A02;
                            if (A033 == null || i13 >= A033.length) {
                                i4 = optSystemConfigParamInt;
                            } else {
                                i4 = A033[i13];
                            }
                            bufferArr[i13] = mmapBufferManager.allocateBuffer(i4, A023);
                        }
                        TraceContext traceContext = new TraceContext(r7, A022, bufferArr[0], new File(this.A03, A005.replace("+", "_p_").replace("/", "_s_")), r82, A005, bufferArr, i11, A003, i6, A002, abs, j2);
                        Buffer[] bufferArr2 = traceContext.A0F;
                        if (bufferArr2 != null && bufferArr2.length != 0 && (buffer = traceContext.A09) != null) {
                            while (true) {
                                int i14 = atomicInteger.get();
                                int i15 = 1;
                                if (i7 != 0) {
                                    i15 = 65534;
                                }
                                int i16 = i14 | i15;
                                int i17 = (i16 ^ -1) & (i16 + 1) & i10;
                                if (i17 == 0) {
                                    break;
                                }
                                if (atomicInteger.compareAndSet(i14, i14 | i17)) {
                                    AtomicReferenceArray atomicReferenceArray = this.A06;
                                    int i18 = -1;
                                    while (i17 != 0) {
                                        i18++;
                                        i17 >>= 1;
                                    }
                                    if (atomicReferenceArray.compareAndSet(i18, (Object) null, traceContext)) {
                                        for (Buffer updateHeader : traceContext.A0F) {
                                            updateHeader.updateHeader(traceContext.A02, traceContext.A05, traceContext.A06, traceContext.A07.getID());
                                        }
                                        if ((traceContext.A03 & 3) != 0) {
                                            A004 = Integer.MAX_VALUE;
                                        } else {
                                            A004 = traceContext.A08.A00("trace_config.trace_timeout_ms", 30000);
                                        }
                                        synchronized (this) {
                                            A02(this);
                                            if (A00(this, traceContext.A06) != null) {
                                                AnonymousClass0Uy r72 = this.A00;
                                                synchronized (r72) {
                                                    C05660Uu r83 = r72.A00;
                                                    synchronized (r83) {
                                                        try {
                                                            AnonymousClass0Ut r6 = new AnonymousClass0Ut(traceContext);
                                                            if (r6.A02) {
                                                                z = false;
                                                            } else {
                                                                if (r6.A03) {
                                                                    r83.A00.put(traceContext.A06, r6);
                                                                }
                                                                z = true;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            throw th;
                                                        }
                                                    }
                                                    if (z) {
                                                        try {
                                                            AnonymousClass0VH r19 = new AnonymousClass0VH(new C07980cX(r72, traceContext), traceContext.A0A.getCanonicalPath(), traceContext.A0E, traceContext.A0F, traceContext.A06);
                                                            traceContext.A0G = r19;
                                                            int i19 = traceContext.A03;
                                                            if ((i19 & 2) == 0) {
                                                                NativeTraceWriter nativeTraceWriter = r19.A01;
                                                                long j3 = traceContext.A06;
                                                                if ((i19 & 3) != 0) {
                                                                    i3 = Integer.MAX_VALUE;
                                                                } else {
                                                                    i3 = traceContext.A08.A00("trace_config.trace_timeout_ms", 30000);
                                                                }
                                                                BufferLogger.writeAndWakeupTraceWriter(nativeTraceWriter, buffer, j3, 39, i3, traceContext.A03, traceContext.A06);
                                                            }
                                                            r72.A03.add(Long.valueOf(traceContext.A06));
                                                            C08000cZ r9 = r72.A01;
                                                            if (r9 != null) {
                                                                Class<TraceEvents> cls = TraceEvents.class;
                                                                synchronized (cls) {
                                                                    try {
                                                                        C05630Un r11 = ProvidersRegistry.A00;
                                                                        ArrayList arrayList2 = r11.A01;
                                                                        int A007 = r11.A00(arrayList2);
                                                                        if (A007 != TraceEvents.sLastNameRefreshProvidersState) {
                                                                            TraceEvents.sLastNameRefreshProvidersState = A007;
                                                                            synchronized (arrayList2) {
                                                                                arrayList = new ArrayList<>(arrayList2);
                                                                            }
                                                                            int size = arrayList.size();
                                                                            int[] iArr = new int[size];
                                                                            String[] strArr = new String[size];
                                                                            int i20 = 0;
                                                                            for (String str2 : arrayList) {
                                                                                strArr[i20] = str2;
                                                                                iArr[i20] = r11.A01(str2);
                                                                                i20++;
                                                                            }
                                                                            TraceEvents.nativeRefreshProviderNames(iArr, strArr);
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                    }
                                                                }
                                                                int i21 = traceContext.A02;
                                                                synchronized (cls) {
                                                                    TraceEvents.sProviders = TraceEvents.nativeEnableProviders(i21);
                                                                }
                                                                synchronized (r9) {
                                                                    try {
                                                                        r8 = r9.A05;
                                                                    } catch (Throwable th3) {
                                                                        while (true) {
                                                                            th = th3;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                synchronized (r9.A07) {
                                                                    try {
                                                                        for (AnonymousClass0Uk A062 : r8) {
                                                                            A062.A06(traceContext, r9);
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        while (true) {
                                                                            th = th4;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            r72.sendMessage(r72.obtainMessage(1, traceContext));
                                                            r72.sendMessageDelayed(r72.obtainMessage(0, traceContext), (long) A004);
                                                        } catch (IOException e) {
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("Could not get canonical path of trace directory ");
                                                            sb.append(traceContext.A0A);
                                                            th = new IllegalArgumentException(sb.toString(), e);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                            z2 = true;
                                        }
                                        if (!z2) {
                                            StringBuilder sb2 = new StringBuilder("Failed to start trace ");
                                            sb2.append(traceContext.A0D);
                                            sb2.append(" due to malformed config for context ");
                                            sb2.append(traceContext.A05);
                                            str = sb2.toString();
                                        }
                                    } else {
                                        throw new RuntimeException("ORDERING VIOLATION - ACQUIRED SLOT BUT SLOT NOT EMPTY");
                                    }
                                }
                            }
                        } else {
                            str = AnonymousClass00U.A0V("No buffer was allocated for trace ", traceContext.A0D, ", failing startTrace");
                        }
                        Log.e("Profilo/TraceControl", str);
                        return z2;
                    }
                }
            } else {
                throw new IllegalArgumentException(AnonymousClass00U.A0J("Unregistered controller for id = ", i12));
            }
        }
        return z2;
    }

    public static TraceContext A00(C05680Uw r6, long j) {
        if (r6.A04.get() != 0) {
            int i = 0;
            do {
                TraceContext traceContext = (TraceContext) r6.A06.get(i);
                if (traceContext != null && traceContext.A06 == j) {
                    return traceContext;
                }
                i++;
            } while (i < 2);
        }
        return null;
    }

    public static TraceContext A01(C05680Uw r11, Object obj, int i, long j) {
        if (r11.A04.get() != 0) {
            int i2 = 0;
            do {
                TraceContext traceContext = (TraceContext) r11.A06.get(i2);
                if (!(traceContext == null || (traceContext.A01 & i) == 0)) {
                    if (((AnonymousClass0V0) traceContext.A0C).A04(traceContext.A0B, obj, traceContext.A05, j)) {
                        return traceContext;
                    }
                }
                i2++;
            } while (i2 < 2);
        }
        return null;
    }

    public static void A02(C05680Uw r5) {
        C05700Uz r2;
        HandlerThread handlerThread;
        if (r5.A00 == null) {
            C08000cZ r4 = r5.A07;
            synchronized (C05700Uz.class) {
                r2 = C05700Uz.A01;
                if (r2 == null) {
                    r2 = new C05700Uz();
                    C05700Uz.A01 = r2;
                }
            }
            synchronized (r2) {
                if (r2.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    C13820oM.A00(handlerThread2);
                    r2.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = r2.A00;
            }
            r5.A00 = new AnonymousClass0Uy(handlerThread.getLooper(), r4, r5.A08);
        }
    }

    public static boolean A04(C05680Uw r14, Object obj, int i, int i2, int i3, long j) {
        TraceContext A012 = A01(r14, obj, i, j);
        if (A012 == null) {
            return false;
        }
        A03(r14, A012);
        Log.w("Profilo/TraceControl", AnonymousClass00U.A0L("STOP PROFILO_TRACEID: ", AnonymousClass0QJ.A00(A012.A06)));
        synchronized (r14) {
            A02(r14);
            if (i2 != 0) {
                BufferLogger.writeStandardEntry(A012.A09, 6, 61, 0, 0, 0, 0, A012.A06);
                r14.A00.A02(A012);
            } else {
                BufferLogger.writeStandardEntry(A012.A09, 6, 37, 0, 0, 0, 0, A012.A06);
                r14.A00.A01(new TraceContext(A012, i3));
            }
        }
        return true;
    }

    public final String A05(int i) {
        if (this.A04.get() != 0) {
            int i2 = 0;
            do {
                TraceContext traceContext = (TraceContext) this.A06.get(i2);
                if (traceContext != null && (traceContext.A0C instanceof C05610Ul) && ((int) traceContext.A05) == i) {
                    return traceContext.A0D;
                }
                i2++;
            } while (i2 < 2);
        }
        return null;
    }

    public final List A06() {
        if (this.A04.get() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        do {
            TraceContext traceContext = (TraceContext) this.A06.get(i);
            if (traceContext != null) {
                arrayList.add(new TraceContext(traceContext));
            }
            i++;
        } while (i < 2);
        return arrayList;
    }

    public C05680Uw(SparseArray sparseArray, AnonymousClass0UJ r4, C08000cZ r5, AnonymousClass0V4 r6, MmapBufferManager mmapBufferManager, File file) {
        this.A01 = sparseArray;
        this.A05 = new AtomicReference(r4);
        this.A02 = mmapBufferManager;
        this.A03 = file;
        this.A08 = r6;
        this.A07 = r5;
    }

    public final void A07(long j, int i) {
        TraceContext A002 = A00(this, j);
        if (A002 != null && A002.A06 == j) {
            A03(this, A002);
            synchronized (this) {
                A02(this);
                this.A00.A01(new TraceContext(A002, i));
            }
        }
    }
}
