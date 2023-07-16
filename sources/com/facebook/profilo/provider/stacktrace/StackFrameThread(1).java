package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass0Uk;
import X.C05630Un;
import X.C08000cZ;
import X.C14030oh;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class StackFrameThread extends AnonymousClass0Uk {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public TraceContext mSavedTraceContext;
    public int mSystemClockTimeIntervalMs = -1;

    public static native int nativeCpuClockResolutionMicros();

    static {
        C05630Un r1 = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = r1.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = r1.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = r1.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.mContext = applicationContext;
        } else {
            this.mContext = context;
        }
    }

    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if ((r2 & r1) != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTracingProviders() {
        /*
            r4 = this;
            com.facebook.profilo.ipc.TraceContext r1 = r4.mSavedTraceContext
            boolean r0 = r4.mEnabled
            r3 = 0
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            int r2 = r1.A02
            int r1 = PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r2 & r1
            if (r0 != 0) goto L_0x0017
            int r1 = PROVIDER_STACK_FRAME
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r3 | r1
        L_0x0018:
            int r0 = PROVIDER_NATIVE_STACK_TRACE
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    public void onTraceEnded(TraceContext traceContext, C08000cZ r7) {
        int i;
        int i2 = traceContext.A02;
        int i3 = PROVIDER_STACK_FRAME;
        int i4 = PROVIDER_WALL_TIME_STACK_TRACE;
        if (((i3 | i4) & i2) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int i5 = (i3 | i4) & i2;
            int i6 = 0;
            if (i5 != 0) {
                i6 = 32753;
            }
            if ((PROVIDER_NATIVE_STACK_TRACE & i2) != 0) {
                i6 |= 4;
            }
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(i6 & i));
        }
        if ((i2 & getSupportedProviders()) != 0) {
            logAnnotation("provider.stack_trace.cpu_timer_res_us", Integer.toString(nativeCpuClockResolutionMicros()));
        }
    }

    public void onTraceStarted(TraceContext traceContext, C08000cZ r3) {
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
    }

    private void logAnnotation(String str, String str2) {
        MultiBufferLogger A03 = A03();
        A03.writeBytesEntry(0, 57, A03.writeBytesEntry(0, 56, A03.writeStandardEntry(6, 52, 0, 0, 0, 0, 0), str), str2);
    }

    public void disable() {
        int i;
        int A03 = C14030oh.A03(-1136144109);
        if (!this.mEnabled) {
            this.mProfilerThread = null;
            i = 1610381143;
        } else {
            this.mSavedTraceContext = null;
            this.mEnabled = false;
            synchronized (CPUProfiler.class) {
                if (CPUProfiler.sInitialized) {
                    CPUProfiler.nativeStopProfiling();
                }
            }
            Thread thread = this.mProfilerThread;
            if (thread != null) {
                try {
                    thread.join();
                    this.mProfilerThread = null;
                } catch (InterruptedException e) {
                    RuntimeException runtimeException = new RuntimeException(e);
                    C14030oh.A0A(-831141173, A03);
                    throw runtimeException;
                }
            }
            i = -1057524221;
        }
        C14030oh.A0A(i, A03);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void enable() {
        /*
            r24 = this;
            r0 = 1018280768(0x3cb1bb40, float:0.021695733)
            int r7 = X.C14030oh.A03(r0)
            r2 = r24
            com.facebook.profilo.ipc.TraceContext r1 = r2.A00
            int r4 = r1.A02
            int r16 = PROVIDER_STACK_FRAME
            int r15 = PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r16 | r15
            r0 = r0 & r4
            r3 = 0
            if (r0 == 0) goto L_0x0019
            r3 = 32753(0x7ff1, float:4.5897E-41)
        L_0x0019:
            int r0 = PROVIDER_NATIVE_STACK_TRACE
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0020
            r3 = r3 | 4
        L_0x0020:
            if (r3 != 0) goto L_0x0029
            r0 = 813362116(0x307aebc4, float:9.1284513E-10)
        L_0x0025:
            X.C14030oh.A0A(r0, r7)
            return
        L_0x0029:
            java.lang.Thread r0 = r2.mProfilerThread
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = "Duplicate attempt to enable sampling profiler."
            android.util.Log.e(r1, r0)
            r0 = -769628773(0xffffffffd220659b, float:-1.72224856E11)
            goto L_0x0025
        L_0x0038:
            com.facebook.profilo.ipc.TraceConfigExtras r3 = r1.A08
            java.lang.String r0 = "provider.stack_trace.time_source"
            java.lang.String r3 = r3.A01(r0)
            if (r3 == 0) goto L_0x0053
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0053
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0056 }
            java.lang.String r0 = r3.toUpperCase(r0)     // Catch:{ IllegalArgumentException -> 0x0056 }
            X.0Vk r14 = X.AnonymousClass0Vk.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0056 }
            goto L_0x0062
        L_0x0053:
            X.0Vk r14 = X.AnonymousClass0Vk.NONE
            goto L_0x0062
        L_0x0056:
            r4 = move-exception
            java.lang.String r3 = r4.getMessage()
            java.lang.String r0 = "StackFrameThread"
            android.util.Log.e(r0, r3, r4)
            X.0Vk r14 = X.AnonymousClass0Vk.NONE
        L_0x0062:
            com.facebook.profilo.ipc.TraceConfigExtras r9 = r1.A08
            java.lang.String r3 = "provider.stack_trace.cpu_sampling_rate_ms"
            r0 = 0
            int r3 = r9.A00(r3, r0)
            java.lang.String r4 = "provider.stack_trace.thread_detect_interval_ms"
            int r11 = r9.A00(r4, r0)
            int r5 = r1.A02
            java.lang.String r4 = "provider.native_stack_trace.unwind_dex_frames"
            boolean r19 = r9.A02(r4, r0)
            r4 = 1
            java.lang.String r6 = "provider.native_stack_trace.unwind_jit_frames"
            boolean r20 = r9.A02(r6, r4)
            r8 = 5
            java.lang.String r6 = "provider.native_stack_trace.unwinder_thread_pri"
            int r21 = r9.A00(r6, r8)
            r8 = 256(0x100, float:3.59E-43)
            java.lang.String r6 = "provider.native_stack_trace.unwinder_queue_size"
            int r22 = r9.A00(r6, r8)
            java.lang.String r6 = "provider.native_stack_trace.log_partial_stacks"
            boolean r23 = r9.A02(r6, r0)
            monitor-enter(r2)
            android.content.Context r8 = r2.mContext     // Catch:{ Exception -> 0x013f }
            com.facebook.profilo.logger.MultiBufferLogger r17 = r2.A03()     // Catch:{ Exception -> 0x013f }
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r10 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x013f }
            boolean r6 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ all -> 0x013c }
            if (r6 == 0) goto L_0x00a6
            r6 = 1
            goto L_0x013a
        L_0x00a6:
            r9 = 16
            boolean r6 = com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(r8)     // Catch:{ all -> 0x013c }
            if (r6 == 0) goto L_0x0129
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x013c }
            int r6 = r8.hashCode()     // Catch:{ all -> 0x013c }
            switch(r6) {
                case 57: goto L_0x011f;
                case 52407: goto L_0x0116;
                case 52408: goto L_0x010d;
                case 53368: goto L_0x0106;
                case 54329: goto L_0x00fd;
                case 54330: goto L_0x00f4;
                case 56251: goto L_0x00f1;
                case 50364602: goto L_0x00ee;
                case 50364603: goto L_0x00eb;
                case 50365562: goto L_0x00e8;
                case 50365563: goto L_0x00e5;
                case 51288123: goto L_0x00e2;
                case 52212604: goto L_0x00df;
                case 52212605: goto L_0x00d6;
                case 52212606: goto L_0x00cd;
                case 53135164: goto L_0x00c4;
                case 53136125: goto L_0x00bb;
                case 54058685: goto L_0x00b8;
                default: goto L_0x00b7;
            }     // Catch:{ all -> 0x013c }
        L_0x00b7:
            goto L_0x0129
        L_0x00b8:
            java.lang.String r6 = "9.0.0"
            goto L_0x0121
        L_0x00bb:
            java.lang.String r6 = "8.1.0"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0127
        L_0x00c4:
            java.lang.String r6 = "8.0.0"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 4096(0x1000, float:5.74E-42)
            goto L_0x0127
        L_0x00cd:
            java.lang.String r6 = "7.1.2"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0127
        L_0x00d6:
            java.lang.String r6 = "7.1.1"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 128(0x80, float:1.794E-43)
            goto L_0x0127
        L_0x00df:
            java.lang.String r6 = "7.1.0"
            goto L_0x00f6
        L_0x00e2:
            java.lang.String r6 = "6.0.1"
            goto L_0x0108
        L_0x00e5:
            java.lang.String r6 = "5.1.1"
            goto L_0x010f
        L_0x00e8:
            java.lang.String r6 = "5.1.0"
            goto L_0x010f
        L_0x00eb:
            java.lang.String r6 = "5.0.2"
            goto L_0x0118
        L_0x00ee:
            java.lang.String r6 = "5.0.1"
            goto L_0x0118
        L_0x00f1:
            java.lang.String r6 = "9.0"
            goto L_0x0121
        L_0x00f4:
            java.lang.String r6 = "7.1"
        L_0x00f6:
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 64
            goto L_0x0127
        L_0x00fd:
            java.lang.String r6 = "7.0"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 32
            goto L_0x0127
        L_0x0106:
            java.lang.String r6 = "6.0"
        L_0x0108:
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            goto L_0x0127
        L_0x010d:
            java.lang.String r6 = "5.1"
        L_0x010f:
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0127
        L_0x0116:
            java.lang.String r6 = "5.0"
        L_0x0118:
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 1024(0x400, float:1.435E-42)
            goto L_0x0127
        L_0x011f:
            java.lang.String r6 = "9"
        L_0x0121:
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x013c }
            r9 = 16384(0x4000, float:2.2959E-41)
        L_0x0127:
            if (r6 != 0) goto L_0x012a
        L_0x0129:
            r9 = 0
        L_0x012a:
            r6 = r9 | 512(0x200, float:7.175E-43)
            r6 = r6 | 4
            com.facebook.profilo.provider.stacktrace.CPUProfiler.sAvailableTracers = r6     // Catch:{ all -> 0x013c }
            int r18 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sAvailableTracers     // Catch:{ all -> 0x013c }
            boolean r6 = com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeInitialize(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x013c }
            com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized = r6     // Catch:{ all -> 0x013c }
            boolean r6 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ all -> 0x013c }
        L_0x013a:
            monitor-exit(r10)     // Catch:{ Exception -> 0x013f }
            goto L_0x014a
        L_0x013c:
            r6 = move-exception
            monitor-exit(r10)     // Catch:{ Exception -> 0x013f }
            throw r6     // Catch:{ Exception -> 0x013f }
        L_0x013f:
            r9 = move-exception
            java.lang.String r8 = "StackFrameThread"
            java.lang.String r6 = r9.getMessage()     // Catch:{ all -> 0x01d7 }
            android.util.Log.e(r8, r6, r9)     // Catch:{ all -> 0x01d7 }
            r6 = 0
        L_0x014a:
            r12 = 0
            if (r6 == 0) goto L_0x01b7
            r13 = 23
            if (r3 > 0) goto L_0x0153
            r3 = 23
        L_0x0153:
            if (r11 <= 0) goto L_0x0156
            r13 = r11
        L_0x0156:
            r8 = r5 & r15
            r6 = 3
            if (r8 != 0) goto L_0x0162
            int r8 = r14.ordinal()     // Catch:{ all -> 0x01dc }
            if (r8 == r6) goto L_0x0164
            goto L_0x0167
        L_0x0162:
            r11 = 0
            goto L_0x0165
        L_0x0164:
            r11 = 1
        L_0x0165:
            r10 = 1
            goto L_0x0171
        L_0x0167:
            if (r8 == r4) goto L_0x0162
            if (r8 == r0) goto L_0x016f
            r6 = 2
            r11 = 0
            if (r8 != r6) goto L_0x0170
        L_0x016f:
            r11 = 1
        L_0x0170:
            r10 = 0
        L_0x0171:
            r16 = r16 | r15
            r16 = r16 & r5
            r9 = 0
            if (r16 == 0) goto L_0x017a
            r9 = 32753(0x7ff1, float:4.5897E-41)
        L_0x017a:
            int r6 = PROVIDER_NATIVE_STACK_TRACE     // Catch:{ all -> 0x01dc }
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0181
            r9 = r9 | 4
        L_0x0181:
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r8 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r8)     // Catch:{ all -> 0x01dc }
            r6 = 0
            if (r11 != 0) goto L_0x018a
            if (r10 != 0) goto L_0x018a
            goto L_0x019c
        L_0x018a:
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x01d9 }
            com.facebook.profilo.provider.stacktrace.StackTraceWhitelist.nativeAddToWhitelist(r5)     // Catch:{ all -> 0x01d9 }
            boolean r5 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ all -> 0x01d9 }
            if (r5 == 0) goto L_0x019c
            boolean r5 = com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeStartProfiling(r9, r3, r13, r11, r10)     // Catch:{ all -> 0x01d9 }
            if (r5 == 0) goto L_0x019c
            r6 = 1
        L_0x019c:
            monitor-exit(r8)     // Catch:{ all -> 0x01dc }
            if (r6 == 0) goto L_0x01b7
            com.facebook.profilo.logger.MultiBufferLogger r8 = r2.A03()     // Catch:{ all -> 0x01dc }
            r9 = 6
            r10 = 52
            r11 = 0
            r14 = 8126495(0x7c001f, float:1.1387645E-38)
            long r5 = (long) r3     // Catch:{ all -> 0x01dc }
            r13 = r0
            r15 = r0
            r16 = r5
            r8.writeStandardEntry(r9, r10, r11, r13, r14, r15, r16)     // Catch:{ all -> 0x01dc }
            r2.mEnabled = r4     // Catch:{ all -> 0x01dc }
            boolean r12 = r2.mEnabled     // Catch:{ all -> 0x01dc }
        L_0x01b7:
            monitor-exit(r2)
            if (r12 != 0) goto L_0x01bf
            r0 = 169862066(0xa1fe3b2, float:7.698396E-33)
            goto L_0x0025
        L_0x01bf:
            r2.mSavedTraceContext = r1
            X.0Vi r3 = new X.0Vi
            r3.<init>(r2)
            java.lang.String r1 = "Prflo:Profiler"
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3, r1)
            r2.mProfilerThread = r0
            r0.start()
            r0 = -158407692(0xfffffffff68ee3f4, float:-1.4490812E33)
            goto L_0x0025
        L_0x01d7:
            r0 = move-exception
            goto L_0x01db
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01dc }
        L_0x01db:
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }
}
