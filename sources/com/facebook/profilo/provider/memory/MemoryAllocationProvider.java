package com.facebook.profilo.provider.memory;

import X.AnonymousClass0IL;
import X.AnonymousClass0Si;
import X.AnonymousClass0Sm;
import X.AnonymousClass0Sn;
import X.AnonymousClass0Uk;
import X.AnonymousClass0VU;
import X.AnonymousClass0VV;
import X.C05280Sk;
import X.C07760c8;
import X.C08000cZ;
import X.C14030oh;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class MemoryAllocationProvider extends AnonymousClass0Uk implements C05280Sk, AnonymousClass0Sm, AnonymousClass0VU {
    public static final int PROVIDER_MEMORY = ProvidersRegistry.A00.A02("memory_allocation");
    public C07760c8 mDeallocationMonitor;
    public String mErrorMessage;
    public boolean mIsFileBackedBuffer;
    public AnonymousClass0VV mProviderTriggerMonitor;
    public boolean mRunning = false;
    public boolean mStarted = false;

    public static native void nativeAddPhantomReferenceLoop();

    public static native int nativeInitialize(Object obj, Object obj2, MultiBufferLogger multiBufferLogger, int i, int i2, int i3, int i4, int i5, boolean z, String str, int i6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i7, int i8, boolean z7, boolean z8, int i9, String str2, boolean z9, int i10, String str3);

    public static native boolean nativeIsTracingEnabled();

    public static native void nativeRegisterDeallocation(long[] jArr, int i);

    public static native void nativeResetFrameworkNamesSet();

    public static native void nativeStartProfiling();

    public static native void nativeStopAddPhantomThread();

    public static native void nativeStopProfiling();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        nativeStartProfiling();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r3.mIsFileBackedBuffer == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (X.AnonymousClass0MI.A04 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2 = X.AnonymousClass0MI.A04.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        new java.io.File(r2, "javamp").createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r0 = r3.mDeallocationMonitor;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r0 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void startProfiling() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mStarted     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            return
        L_0x0007:
            r0 = 1
            r3.mStarted = r0     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            X.0c8 r0 = r3.mDeallocationMonitor
            if (r0 == 0) goto L_0x0012
            r0.A00()
        L_0x0012:
            nativeStartProfiling()
            boolean r0 = r3.mIsFileBackedBuffer
            if (r0 == 0) goto L_0x002d
            X.0Z2 r0 = X.AnonymousClass0MI.A04
            if (r0 == 0) goto L_0x002d
            X.0Z2 r0 = X.AnonymousClass0MI.A04
            java.io.File r2 = r0.A09
            if (r2 == 0) goto L_0x002d
            java.lang.String r1 = "javamp"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r0.createNewFile()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.memory.MemoryAllocationProvider.startProfiling():void");
    }

    private synchronized void stopTraceIfRunning() {
        if (this.mRunning) {
            nativeStopProfiling();
            C07760c8 r2 = this.mDeallocationMonitor;
            if (r2 != null) {
                AnonymousClass0Sn r1 = r2.A01;
                if (r1 != null) {
                    r1.A01 = false;
                    r2.A01 = null;
                }
                AnonymousClass0Si r0 = r2.A00;
                if (r0 != null) {
                    r0.A00.A04.finishProcessor();
                    r2.A00 = null;
                }
                this.mDeallocationMonitor = null;
            }
            this.mRunning = false;
            this.mStarted = false;
        }
        AnonymousClass0VV r02 = this.mProviderTriggerMonitor;
        if (r02 != null) {
            r02.A02();
            this.mProviderTriggerMonitor = null;
        }
        synchronized (AnonymousClass0IL.class) {
            AnonymousClass0IL.A04 = false;
            AnonymousClass0IL.A00();
        }
    }

    public void onTraceStarted(TraceContext traceContext, C08000cZ r3) {
        synchronized (this) {
            this.mRunning = true;
            nativeResetFrameworkNamesSet();
        }
    }

    public MemoryAllocationProvider() {
        super("profilo_memory");
    }

    public void disable() {
        int A03 = C14030oh.A03(-526372287);
        stopTraceIfRunning();
        C14030oh.A0A(502832503, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d7, code lost:
        if (r37 == false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d9, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01da, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e1, code lost:
        if (r38 == false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e3, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e4, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r20);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r19);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fb, code lost:
        if (r41 == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fd, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fe, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0205, code lost:
        if (r42 == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0207, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0208, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r13);
        r4.append(",(");
        r4.append(r12);
        r4.append("),");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x021e, code lost:
        if (r45 == false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0220, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0221, code lost:
        r4.append(r8);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r11);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r7);
        r10.A00(X.AnonymousClass0MU.A5i, X.AnonymousClass0ND.CRITICAL_REPORT, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023b, code lost:
        X.AnonymousClass0IL.A07 = true;
        X.AnonymousClass0IL.A04 = true;
        X.AnonymousClass0IL.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0242, code lost:
        monitor-exit(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0243, code lost:
        if (r31 == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r3.mDeallocationMonitor = new X.C07760c8(r3, r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024c, code lost:
        r5 = nativeInitialize(r3.mDeallocationMonitor, r3, A03(), r15, r16, r18, r17, r6, r31, r32, r9, r34, r35, r36, r37, r38, r20, r19, r41, r42, r13, r12, r45, r11, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0270, code lost:
        if (r5 != 0) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0272, code lost:
        if (r7 != 0) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0274, code lost:
        startProfiling();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0278, code lost:
        r3.mProviderTriggerMonitor = new X.AnonymousClass0VV(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0280, code lost:
        r4 = r3.mErrorMessage;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0282, code lost:
        monitor-enter(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r0 = X.AnonymousClass0IL.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0285, code lost:
        if (r0 == null) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0287, code lost:
        r1 = r0.A00.markEventBuilder(21375349, "java_provider");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0296, code lost:
        if (r1.isSampled() == false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0298, code lost:
        r1.annotate(com.facebook.proxygen.TraceFieldType.ErrorCode, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029d, code lost:
        if (r4 == null) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x029f, code lost:
        r1.annotate("error_message", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a4, code lost:
        r1.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a7, code lost:
        X.AnonymousClass0IL.A07 = false;
        X.AnonymousClass0IL.A04 = false;
        X.AnonymousClass0IL.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        monitor-exit(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02b3, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b4, code lost:
        X.AnonymousClass0LU.A0G("MemoryAllocationProvider", "Exception while initializing java memory allocation provider.", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02bb, code lost:
        monitor-enter(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r0 = X.AnonymousClass0IL.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02be, code lost:
        if (r0 != null) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02c0, code lost:
        r3 = r0.A00.markEventBuilder(21375349, "java_provider");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02cf, code lost:
        if (r3.isSampled() != false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02d1, code lost:
        r3.annotate("exception", r4.toString());
        r3.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02dd, code lost:
        X.AnonymousClass0IL.A07 = false;
        X.AnonymousClass0IL.A04 = false;
        X.AnonymousClass0IL.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r4.A02("provider.memory_allocation.track_deallocation", true) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r4.A02("provider.memory_allocation.share_async_unwinder_thread", false) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r1 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r35 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r1.A08.A02("provider.memory_allocation.use_lock_free_queue_async_unwinder", true) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        r35 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r1 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r36 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r1.A08.A02("provider.memory_allocation.skip_intercepted_refs_step", false) != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        r36 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r1 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        r37 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (r1.A08.A02("provider.memory_allocation.log_async_unwider_queue_stats", false) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r37 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        if (r1 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        if (r1.A08.A02("provider.memory_allocation.use_weak_ref_to_track_deallocation", false) != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r1 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        r38 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1.A08.A02("provider.memory_allocation.use_global_weak_ref", false) != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        r38 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        if (r1 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        r20 = 0;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        r41 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        if (r1 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        r42 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        if (r1.A08.A02("provider.memory_allocation.unwind_jit_frames", true) == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        r42 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        if (r1 != null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        r13 = 0;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        r45 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c0, code lost:
        if (r1 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c2, code lost:
        r11 = 256;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c5, code lost:
        r3.mIsFileBackedBuffer = false;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c8, code lost:
        if (r1 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d1, code lost:
        if (r1.A09.getFilePath() == null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d3, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d4, code lost:
        r3.mIsFileBackedBuffer = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d7, code lost:
        if (r6 != -1) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d9, code lost:
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00da, code lost:
        r47 = null;
        r32 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00de, code lost:
        r1 = r3.mIsFileBackedBuffer;
        r21 = X.AnonymousClass0IL.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e2, code lost:
        monitor-enter(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e6, code lost:
        if (r6 != 3) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e8, code lost:
        if (r1 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ea, code lost:
        if (r0 == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ec, code lost:
        r0 = r1.A09;
        r32 = r0.generateMemoryMappingFilePath();
        r47 = r0.generateLocalSymbolsFilePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f7, code lost:
        r4 = r1.A08;
        r11 = r4.A00("provider.memory_allocation.max_unwind_depth", 256);
        r7 = r4.A00("provider.memory_allocation.when_to_start", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0106, code lost:
        r13 = r1.A08.A00("provider.memory_allocation.elements_to_discard_on_unwinder_overflow", 0);
        r4 = r1.A08;
        r12 = r4.A01("provider.memory_allocation.dynamic_sampling_config");
        r45 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011e, code lost:
        if (r4.A02("provider.memory_allocation.log_async_unwinder_failure", false) != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0121, code lost:
        r4 = r1.A08;
        r20 = r4.A00("provider.memory_allocation.async_unwinder_thread_priority", 0);
        r19 = r4.A00("provider.memory_allocation.time_auto_process_refs", 0);
        r41 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0137, code lost:
        if (r4.A02("provider.memory_allocation.log_mapping_status_per_frame", false) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0152, code lost:
        if (r6.A02("provider.memory_allocation.unwind_stacks", true) != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r10 = X.C04520Nz.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016e, code lost:
        if (r10 == null) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0170, code lost:
        r4 = new java.lang.StringBuilder(120);
        r8 = 0;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0179, code lost:
        if (r1 == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017b, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017c, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r15);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r16);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r18);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r17);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r6);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a9, code lost:
        if (r31 == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ab, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ac, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r4.append(r9);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b9, code lost:
        if (r34 == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bb, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01bc, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c3, code lost:
        if (r35 == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c5, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c6, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01cd, code lost:
        if (r36 == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cf, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d0, code lost:
        r4.append(r0);
        r4.append(ch.boye.httpclientandroidlib.message.BasicHeaderValueParser.ELEM_DELIMITER);
        r0 = 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enable() {
        /*
            r48 = this;
            r0 = -22906218(0xfffffffffea27a96, float:-1.0798572E38)
            int r22 = X.C14030oh.A03(r0)
            r3 = r48
            com.facebook.profilo.ipc.TraceContext r1 = r3.A00
            r4 = 2
            if (r1 != 0) goto L_0x0162
            r15 = 2
        L_0x000f:
            r2 = 0
            if (r1 != 0) goto L_0x0156
            r16 = 0
        L_0x0014:
            r5 = 1
            if (r1 != 0) goto L_0x013b
            r18 = 0
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x001b:
            r8 = 1
        L_0x001c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r6 = 1
            if (r4 < r0) goto L_0x0024
            r6 = 3
        L_0x0024:
            if (r1 == 0) goto L_0x0038
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.unwinder_type"
            int r6 = r4.A00(r0, r6)
            java.lang.String r0 = "provider.memory_allocation.track_deallocation"
            boolean r0 = r4.A02(r0, r5)
            r31 = 0
            if (r0 == 0) goto L_0x003a
        L_0x0038:
            r31 = 1
        L_0x003a:
            r9 = 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0050
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.async_unwinder_queue_size"
            int r9 = r4.A00(r0, r9)
            java.lang.String r0 = "provider.memory_allocation.share_async_unwinder_thread"
            boolean r0 = r4.A02(r0, r2)
            r34 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0050:
            r34 = 0
            if (r1 == 0) goto L_0x0060
        L_0x0054:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.use_lock_free_queue_async_unwinder"
            boolean r0 = r4.A02(r0, r5)
            r35 = 0
            if (r0 == 0) goto L_0x0064
        L_0x0060:
            r35 = 1
            if (r1 == 0) goto L_0x0070
        L_0x0064:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.skip_intercepted_refs_step"
            boolean r0 = r4.A02(r0, r2)
            r36 = 1
            if (r0 != 0) goto L_0x0074
        L_0x0070:
            r36 = 0
            if (r1 == 0) goto L_0x0080
        L_0x0074:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.log_async_unwider_queue_stats"
            boolean r0 = r4.A02(r0, r2)
            r37 = 1
            if (r0 != 0) goto L_0x0084
        L_0x0080:
            r37 = 0
            if (r1 == 0) goto L_0x008f
        L_0x0084:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.use_weak_ref_to_track_deallocation"
            boolean r0 = r4.A02(r0, r2)
            r14 = 1
            if (r0 != 0) goto L_0x0092
        L_0x008f:
            r14 = 0
            if (r1 == 0) goto L_0x009e
        L_0x0092:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.use_global_weak_ref"
            boolean r0 = r4.A02(r0, r2)
            r38 = 1
            if (r0 != 0) goto L_0x0121
        L_0x009e:
            r38 = 0
            if (r1 != 0) goto L_0x0121
            r20 = 0
            r19 = 0
        L_0x00a6:
            r41 = 0
            if (r1 == 0) goto L_0x00b6
        L_0x00aa:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.unwind_jit_frames"
            boolean r0 = r4.A02(r0, r5)
            r42 = 0
            if (r0 == 0) goto L_0x0106
        L_0x00b6:
            r42 = 1
            if (r1 != 0) goto L_0x0106
            r13 = 0
            r12 = 0
        L_0x00bc:
            r45 = 0
        L_0x00be:
            r7 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x00f7
            r11 = 256(0x100, float:3.59E-43)
            r7 = 0
        L_0x00c5:
            r3.mIsFileBackedBuffer = r2
            r0 = 0
            if (r1 == 0) goto L_0x00d6
            com.facebook.profilo.mmapbuf.core.Buffer r0 = r1.A09
            java.lang.String r4 = r0.getFilePath()
            r0 = 0
            if (r4 == 0) goto L_0x00d4
            r0 = 1
        L_0x00d4:
            r3.mIsFileBackedBuffer = r0
        L_0x00d6:
            r4 = -1
            if (r6 != r4) goto L_0x00e5
            r6 = r8
        L_0x00da:
            r47 = 0
            r32 = 0
        L_0x00de:
            boolean r1 = r3.mIsFileBackedBuffer
            java.lang.Class<X.0IL> r21 = X.AnonymousClass0IL.class
            monitor-enter(r21)
            goto L_0x016c
        L_0x00e5:
            r4 = 3
            if (r6 != r4) goto L_0x00da
            if (r1 == 0) goto L_0x00da
            if (r0 == 0) goto L_0x00da
            com.facebook.profilo.mmapbuf.core.Buffer r0 = r1.A09
            java.lang.String r32 = r0.generateMemoryMappingFilePath()
            java.lang.String r47 = r0.generateLocalSymbolsFilePath()
            goto L_0x00de
        L_0x00f7:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.max_unwind_depth"
            int r11 = r4.A00(r0, r7)
            java.lang.String r0 = "provider.memory_allocation.when_to_start"
            int r7 = r4.A00(r0, r2)
            goto L_0x00c5
        L_0x0106:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.elements_to_discard_on_unwinder_overflow"
            int r13 = r4.A00(r0, r2)
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.dynamic_sampling_config"
            java.lang.String r12 = r4.A01(r0)
            java.lang.String r0 = "provider.memory_allocation.log_async_unwinder_failure"
            boolean r0 = r4.A02(r0, r2)
            r45 = 1
            if (r0 != 0) goto L_0x00be
            goto L_0x00bc
        L_0x0121:
            com.facebook.profilo.ipc.TraceConfigExtras r4 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.async_unwinder_thread_priority"
            int r20 = r4.A00(r0, r2)
            java.lang.String r0 = "provider.memory_allocation.time_auto_process_refs"
            int r19 = r4.A00(r0, r2)
            java.lang.String r0 = "provider.memory_allocation.log_mapping_status_per_frame"
            boolean r0 = r4.A02(r0, r2)
            r41 = 1
            if (r0 != 0) goto L_0x00aa
            goto L_0x00a6
        L_0x013b:
            com.facebook.profilo.ipc.TraceConfigExtras r6 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.big_allocation_sample_rate"
            int r18 = r6.A00(r0, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = "provider.memory_allocation.big_allocation_threshold"
            int r17 = r6.A00(r0, r4)
            java.lang.String r0 = "provider.memory_allocation.unwind_stacks"
            boolean r0 = r6.A02(r0, r5)
            r8 = 0
            if (r0 == 0) goto L_0x001c
            goto L_0x001b
        L_0x0156:
            com.facebook.profilo.ipc.TraceConfigExtras r5 = r1.A08
            r4 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = "provider.memory_allocation.small_allocation_sample_rate"
            int r16 = r5.A00(r0, r4)
            goto L_0x0014
        L_0x0162:
            com.facebook.profilo.ipc.TraceConfigExtras r2 = r1.A08
            java.lang.String r0 = "provider.memory_allocation.sampling_strategy"
            int r15 = r2.A00(r0, r4)
            goto L_0x000f
        L_0x016c:
            X.0Xz r10 = X.C04520Nz.A00     // Catch:{ all -> 0x02ee }
            if (r10 == 0) goto L_0x023b
            r0 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ee }
            r4.<init>(r0)     // Catch:{ all -> 0x02ee }
            r8 = 0
            r0 = 0
            if (r1 == 0) goto L_0x017c
            r0 = 1
        L_0x017c:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r1 = 44
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r4.append(r15)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = r16
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = r18
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = r17
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r4.append(r6)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = 0
            if (r31 == 0) goto L_0x01ac
            r0 = 1
        L_0x01ac:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r4.append(r9)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = 0
            if (r34 == 0) goto L_0x01bc
            r0 = 1
        L_0x01bc:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = 0
            if (r35 == 0) goto L_0x01c6
            r0 = 1
        L_0x01c6:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = 0
            if (r36 == 0) goto L_0x01d0
            r0 = 1
        L_0x01d0:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = 0
            if (r37 == 0) goto L_0x01da
            r0 = 1
        L_0x01da:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = 0
            if (r38 == 0) goto L_0x01e4
            r0 = 1
        L_0x01e4:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = r20
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = r19
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = 0
            if (r41 == 0) goto L_0x01fe
            r0 = 1
        L_0x01fe:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r0 = 0
            if (r42 == 0) goto L_0x0208
            r0 = 1
        L_0x0208:
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r4.append(r13)     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = ",("
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            r4.append(r12)     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = "),"
            r4.append(r0)     // Catch:{ all -> 0x02ee }
            if (r45 == 0) goto L_0x0221
            r8 = 1
        L_0x0221:
            r4.append(r8)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r4.append(r11)     // Catch:{ all -> 0x02ee }
            r4.append(r1)     // Catch:{ all -> 0x02ee }
            r4.append(r7)     // Catch:{ all -> 0x02ee }
            X.0ON r8 = X.AnonymousClass0MU.A5i     // Catch:{ all -> 0x02ee }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x02ee }
            X.0ND r0 = X.AnonymousClass0ND.CRITICAL_REPORT     // Catch:{ all -> 0x02ee }
            r10.A00(r8, r0, r1)     // Catch:{ all -> 0x02ee }
        L_0x023b:
            X.AnonymousClass0IL.A07 = r5     // Catch:{ all -> 0x02ee }
            X.AnonymousClass0IL.A04 = r5     // Catch:{ all -> 0x02ee }
            X.AnonymousClass0IL.A00()     // Catch:{ all -> 0x02ee }
            monitor-exit(r21)
            if (r31 == 0) goto L_0x024c
            X.0c8 r0 = new X.0c8     // Catch:{ all -> 0x02b3 }
            r0.<init>(r3, r3, r14)     // Catch:{ all -> 0x02b3 }
            r3.mDeallocationMonitor = r0     // Catch:{ all -> 0x02b3 }
        L_0x024c:
            X.0c8 r0 = r3.mDeallocationMonitor     // Catch:{ all -> 0x02b3 }
            com.facebook.profilo.logger.MultiBufferLogger r25 = r3.A03()     // Catch:{ all -> 0x02b3 }
            r28 = r18
            r29 = r17
            r30 = r6
            r33 = r9
            r39 = r20
            r40 = r19
            r43 = r13
            r44 = r12
            r46 = r11
            r23 = r0
            r24 = r3
            r26 = r15
            r27 = r16
            int r5 = nativeInitialize(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ all -> 0x02b3 }
            if (r5 != 0) goto L_0x0280
            if (r7 != 0) goto L_0x0278
            r3.startProfiling()     // Catch:{ all -> 0x02b3 }
            goto L_0x02e5
        L_0x0278:
            X.0VV r0 = new X.0VV     // Catch:{ all -> 0x02b3 }
            r0.<init>(r3, r7)     // Catch:{ all -> 0x02b3 }
            r3.mProviderTriggerMonitor = r0     // Catch:{ all -> 0x02b3 }
            goto L_0x02e5
        L_0x0280:
            java.lang.String r4 = r3.mErrorMessage     // Catch:{ all -> 0x02b3 }
            monitor-enter(r21)     // Catch:{ all -> 0x02b3 }
            X.08Z r0 = X.AnonymousClass0IL.A00     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x02a7
            com.facebook.quicklog.QuickPerformanceLogger r3 = r0.A00     // Catch:{ all -> 0x02b0 }
            r1 = 21375349(0x1462975, float:3.63966E-38)
            java.lang.String r0 = "java_provider"
            com.facebook.quicklog.EventBuilder r1 = r3.markEventBuilder(r1, r0)     // Catch:{ all -> 0x02b0 }
            boolean r0 = r1.isSampled()     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x02a7
            java.lang.String r0 = "error_code"
            r1.annotate((java.lang.String) r0, (int) r5)     // Catch:{ all -> 0x02b0 }
            if (r4 == 0) goto L_0x02a4
            java.lang.String r0 = "error_message"
            r1.annotate((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ all -> 0x02b0 }
        L_0x02a4:
            r1.report()     // Catch:{ all -> 0x02b0 }
        L_0x02a7:
            X.AnonymousClass0IL.A07 = r2     // Catch:{ all -> 0x02b0 }
            X.AnonymousClass0IL.A04 = r2     // Catch:{ all -> 0x02b0 }
            X.AnonymousClass0IL.A00()     // Catch:{ all -> 0x02b0 }
            monitor-exit(r21)     // Catch:{ all -> 0x02b3 }
            goto L_0x02e5
        L_0x02b0:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x02b3 }
            throw r0     // Catch:{ all -> 0x02b3 }
        L_0x02b3:
            r4 = move-exception
            java.lang.String r1 = "MemoryAllocationProvider"
            java.lang.String r0 = "Exception while initializing java memory allocation provider."
            X.AnonymousClass0LU.A0G(r1, r0, r4)
            monitor-enter(r21)
            X.08Z r0 = X.AnonymousClass0IL.A00     // Catch:{ all -> 0x02ee }
            if (r0 == 0) goto L_0x02dd
            com.facebook.quicklog.QuickPerformanceLogger r3 = r0.A00     // Catch:{ all -> 0x02ee }
            r1 = 21375349(0x1462975, float:3.63966E-38)
            java.lang.String r0 = "java_provider"
            com.facebook.quicklog.EventBuilder r3 = r3.markEventBuilder(r1, r0)     // Catch:{ all -> 0x02ee }
            boolean r0 = r3.isSampled()     // Catch:{ all -> 0x02ee }
            if (r0 == 0) goto L_0x02dd
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x02ee }
            java.lang.String r0 = "exception"
            r3.annotate((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x02ee }
            r3.report()     // Catch:{ all -> 0x02ee }
        L_0x02dd:
            X.AnonymousClass0IL.A07 = r2     // Catch:{ all -> 0x02ee }
            X.AnonymousClass0IL.A04 = r2     // Catch:{ all -> 0x02ee }
            X.AnonymousClass0IL.A00()     // Catch:{ all -> 0x02ee }
            monitor-exit(r21)
        L_0x02e5:
            r1 = 65702128(0x3ea88f0, float:1.3784723E-36)
            r0 = r22
            X.C14030oh.A0A(r1, r0)
            return
        L_0x02ee:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.memory.MemoryAllocationProvider.enable():void");
    }

    public void finishProcessor() {
        nativeStopAddPhantomThread();
    }

    public int getSupportedProviders() {
        return PROVIDER_MEMORY;
    }

    public int getTracingProviders() {
        if (!nativeIsTracingEnabled()) {
            return 0;
        }
        int i = PROVIDER_MEMORY;
        if (TraceEvents.isEnabled(i)) {
            return i;
        }
        return 0;
    }

    public void onDeallocation(long[] jArr, String[] strArr, int i) {
        nativeRegisterDeallocation(jArr, i);
    }

    public void onTrigger() {
        startProfiling();
    }

    public void startProcessor() {
        nativeAddPhantomReferenceLoop();
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }

    public void onTraceEnded(TraceContext traceContext, C08000cZ r2) {
        stopTraceIfRunning();
    }
}
