package com.facebook.profilo.provider.nativememory;

import X.AnonymousClass0IL;
import X.AnonymousClass0MI;
import X.AnonymousClass0Uk;
import X.AnonymousClass0VU;
import X.AnonymousClass0VV;
import X.C08000cZ;
import X.C14030oh;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.io.File;
import java.io.IOException;

public final class NativeMemoryAllocationProvider extends AnonymousClass0Uk implements AnonymousClass0VU {
    public static final int PROVIDER_MEMORY = ProvidersRegistry.A00.A02("native_memory_allocation");
    public boolean isProfiling;
    public final Context mContext;
    public String mErrorMessage;
    public boolean mIsFileBackedBuffer;
    public AnonymousClass0VV mProviderTriggerMonitor;
    public boolean mReuseDispatchTable;

    public static native int nativeInitializeProfiling(Object obj, MultiBufferLogger multiBufferLogger, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, boolean z, boolean z2, int i9, boolean z3, boolean z4, boolean z5, int i10, boolean z6, int i11, String str2, boolean z7, int i12, int i13, int i14, boolean z8, String str3);

    public static native void nativeStartProfiling(boolean z);

    public static native void nativeStopProfiling();

    private synchronized void startProfiling() {
        File file;
        if (!this.isProfiling) {
            nativeStartProfiling(this.mReuseDispatchTable);
            if (!(!this.mIsFileBackedBuffer || AnonymousClass0MI.A04 == null || (file = AnonymousClass0MI.A04.A09) == null)) {
                try {
                    new File(file, "nativemp").createNewFile();
                } catch (IOException unused) {
                }
            }
            this.isProfiling = true;
        }
    }

    private synchronized void stopTraceIfRunning() {
        if (this.isProfiling) {
            nativeStopProfiling();
            this.isProfiling = false;
        }
        AnonymousClass0VV r0 = this.mProviderTriggerMonitor;
        if (r0 != null) {
            r0.A02();
            this.mProviderTriggerMonitor = null;
        }
        synchronized (AnonymousClass0IL.class) {
            AnonymousClass0IL.A06 = false;
            AnonymousClass0IL.A00();
        }
    }

    public synchronized int getTracingProviders() {
        int i;
        if (this.isProfiling) {
            i = PROVIDER_MEMORY;
            if (TraceEvents.isEnabled(i)) {
            }
        }
        i = 0;
        return i;
    }

    public NativeMemoryAllocationProvider(Context context) {
        super("profilo_native_memory");
        this.mContext = context;
    }

    public void disable() {
        int A03 = C14030oh.A03(1026252937);
        stopTraceIfRunning();
        C14030oh.A0A(-467005302, A03);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void enable() {
        /*
            r52 = this;
            r0 = 2126727659(0x7ec349eb, float:1.2979163E38)
            int r24 = X.C14030oh.A03(r0)
            r2 = r52
            com.facebook.profilo.ipc.TraceContext r6 = r2.A00
            r4 = 2
            if (r6 != 0) goto L_0x0167
            r23 = 2
        L_0x0010:
            r5 = 0
            if (r6 != 0) goto L_0x0153
            r22 = 0
            r21 = 0
        L_0x0017:
            r9 = 262144(0x40000, float:3.67342E-40)
            if (r6 == 0) goto L_0x0023
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.big_allocation_threshold"
            int r9 = r1.A00(r0, r9)
        L_0x0023:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0030
            boolean r0 = X.AnonymousClass0FX.A02()
            if (r0 == 0) goto L_0x0030
            r4 = 3
        L_0x0030:
            if (r6 == 0) goto L_0x003a
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.unwinder_type"
            int r4 = r1.A00(r0, r4)
        L_0x003a:
            r1 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x012f
            r12 = 256(0x100, float:3.59E-43)
            r11 = 100
            r10 = 8
        L_0x0044:
            r37 = 0
        L_0x0046:
            r3 = 512(0x200, float:7.175E-43)
            if (r6 != 0) goto L_0x011b
            r17 = 512(0x200, float:7.175E-43)
        L_0x004c:
            r39 = 0
            if (r6 == 0) goto L_0x005d
        L_0x0050:
            com.facebook.profilo.ipc.TraceConfigExtras r3 = r6.A08
            java.lang.String r1 = "provider.native_memory_allocation.use_lock_free_queue_async_unwinder"
            r0 = 1
            boolean r0 = r3.A02(r1, r0)
            r40 = 0
            if (r0 == 0) goto L_0x0061
        L_0x005d:
            r40 = 1
            if (r6 == 0) goto L_0x006d
        L_0x0061:
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.log_async_unwider_queue_stats"
            boolean r0 = r1.A02(r0, r5)
            r41 = 1
            if (r0 != 0) goto L_0x00a7
        L_0x006d:
            r41 = 0
            if (r6 != 0) goto L_0x00a7
            r18 = 0
        L_0x0073:
            r43 = 0
            if (r6 != 0) goto L_0x00ba
            r14 = 0
            r15 = 0
        L_0x0079:
            r46 = 0
            if (r6 != 0) goto L_0x00d5
            r13 = 0
        L_0x007e:
            r48 = 1
            if (r6 != 0) goto L_0x00e9
            r20 = 0
            r19 = 1
            r8 = 0
            r49 = 0
        L_0x0089:
            r0 = 0
        L_0x008a:
            r2.mReuseDispatchTable = r0
            if (r6 == 0) goto L_0x009a
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.resolve_names_on_client"
            boolean r0 = r1.A02(r0, r5)
            r50 = 1
            if (r0 != 0) goto L_0x009c
        L_0x009a:
            r50 = 0
        L_0x009c:
            android.content.Context r7 = r2.mContext
            boolean r3 = r2.mReuseDispatchTable
            java.lang.Class<X.0Ja> r1 = X.C03510Ja.class
            monitor-enter(r1)
            r16 = 0
            goto L_0x0171
        L_0x00a7:
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.async_unwinder_thread_priority"
            int r18 = r1.A00(r0, r5)
            java.lang.String r0 = "provider.native_memory_allocation.log_mapping_status_per_frame"
            boolean r0 = r1.A02(r0, r5)
            r43 = 1
            if (r0 != 0) goto L_0x00ba
            goto L_0x0073
        L_0x00ba:
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.elements_to_discard_on_unwinder_overflow"
            int r14 = r1.A00(r0, r5)
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.dynamic_sampling_config"
            java.lang.String r15 = r1.A01(r0)
            java.lang.String r0 = "provider.native_memory_allocation.log_async_unwinder_failure"
            boolean r0 = r1.A02(r0, r5)
            r46 = 1
            if (r0 != 0) goto L_0x00d5
            goto L_0x0079
        L_0x00d5:
            com.facebook.profilo.ipc.TraceConfigExtras r3 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.unwind_on_free_chance"
            int r13 = r3.A00(r0, r5)
            java.lang.String r1 = "provider.native_memory_allocation.log_memory_events"
            r0 = 1
            boolean r0 = r3.A02(r1, r0)
            r48 = 0
            if (r0 == 0) goto L_0x00e9
            goto L_0x007e
        L_0x00e9:
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.use_no_op_allocation_registry"
            boolean r0 = r1.A02(r0, r5)
            r20 = 0
            if (r0 == 0) goto L_0x00f7
            r20 = 1
        L_0x00f7:
            java.lang.String r3 = "provider.native_memory_allocation.enable_allocation_tracker"
            r0 = 1
            boolean r0 = r1.A02(r3, r0)
            r19 = 0
            if (r0 == 0) goto L_0x0104
            r19 = 1
        L_0x0104:
            java.lang.String r0 = "provider.native_memory_allocation.when_to_start"
            int r8 = r1.A00(r0, r5)
            java.lang.String r0 = "provider.native_memory_allocation.hash_mode"
            int r49 = r1.A00(r0, r5)
            java.lang.String r0 = "provider.native_memory_allocation.reuse_dispatch_table"
            boolean r1 = r1.A02(r0, r5)
            r0 = 1
            if (r1 != 0) goto L_0x008a
            goto L_0x0089
        L_0x011b:
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.async_unwinder_queue_size"
            int r17 = r1.A00(r0, r3)
            java.lang.String r0 = "provider.native_memory_allocation.share_async_unwinder_thread"
            boolean r0 = r1.A02(r0, r5)
            r39 = 1
            if (r0 != 0) goto L_0x0050
            goto L_0x004c
        L_0x012f:
            com.facebook.profilo.ipc.TraceConfigExtras r3 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.max_unwind_depth"
            int r12 = r3.A00(r0, r1)
            r1 = 100
            java.lang.String r0 = "provider.native_memory_allocation.allocation_tracker_buffer_size"
            int r11 = r3.A00(r0, r1)
            r1 = 8
            java.lang.String r0 = "provider.native_memory_allocation.allocation_tracker_bucket_count"
            int r10 = r3.A00(r0, r1)
            java.lang.String r0 = "provider.native_memory_allocation.mixed_stack"
            boolean r0 = r3.A02(r0, r5)
            r37 = 1
            if (r0 != 0) goto L_0x0046
            goto L_0x0044
        L_0x0153:
            com.facebook.profilo.ipc.TraceConfigExtras r3 = r6.A08
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = "provider.native_memory_allocation.small_allocation_sample_rate"
            int r22 = r3.A00(r0, r1)
            r1 = 10
            java.lang.String r0 = "provider.native_memory_allocation.big_allocation_sample_rate"
            int r21 = r3.A00(r0, r1)
            goto L_0x0017
        L_0x0167:
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r6.A08
            java.lang.String r0 = "provider.native_memory_allocation.sampling_strategy"
            int r23 = r1.A00(r0, r4)
            goto L_0x0010
        L_0x0171:
            java.lang.String r0 = "mallocHooks"
            java.io.File r0 = r7.getDir(r0, r5)     // Catch:{ IOException -> 0x0182 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0182 }
            boolean r0 = com.facebook.common.mallochooks.jni.NativeAllocationHooksUtil$NativeImpl.verifyMallocHooksNative(r0, r5, r3)     // Catch:{ all -> 0x02fc }
            if (r0 == 0) goto L_0x018d
            goto L_0x018b
        L_0x0182:
            r3 = move-exception
            java.lang.String r0 = "Error getting directory to run mallocHooks verification"
            com.facebook.common.mallochooks.jni.NativeAllocationHooksUtil$NativeImpl.sErrorMessage = r0     // Catch:{ all -> 0x02fc }
            X.AnonymousClass0LU.A03(r1, r0, r3)     // Catch:{ all -> 0x02fc }
            goto L_0x018d
        L_0x018b:
            r16 = 1
        L_0x018d:
            monitor-exit(r1)
            if (r16 != 0) goto L_0x01a4
            java.lang.String r1 = "Cannot install hooks: "
            java.lang.String r0 = com.facebook.common.mallochooks.jni.NativeAllocationHooksUtil$NativeImpl.sErrorMessage
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            X.AnonymousClass0IL.A01(r5, r0)
        L_0x019b:
            r1 = 1019505328(0x3cc46ab0, float:0.023976654)
            r0 = r24
            X.C14030oh.A0A(r1, r0)
            return
        L_0x01a4:
            r2.mIsFileBackedBuffer = r5
            if (r6 == 0) goto L_0x01c6
            com.facebook.profilo.mmapbuf.core.Buffer r0 = r6.A09
            java.lang.String r3 = r0.getFilePath()
            r1 = 0
            if (r3 == 0) goto L_0x01b2
            r1 = 1
        L_0x01b2:
            r2.mIsFileBackedBuffer = r1
            if (r1 == 0) goto L_0x01c6
            java.lang.String r35 = r0.generateMemoryMappingFilePath()
            java.lang.String r51 = r0.generateLocalSymbolsFilePath()
            r36 = 1
        L_0x01c0:
            boolean r1 = r2.mIsFileBackedBuffer
            java.lang.Class<X.0IL> r16 = X.AnonymousClass0IL.class
            monitor-enter(r16)
            goto L_0x01cd
        L_0x01c6:
            r35 = 0
            r36 = 0
            r51 = 0
            goto L_0x01c0
        L_0x01cd:
            X.0Xz r6 = X.C04520Nz.A00     // Catch:{ all -> 0x02f9 }
            r7 = 1
            if (r6 == 0) goto L_0x02ac
            r0 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f9 }
            r3.<init>(r0)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r1 == 0) goto L_0x01dd
            r0 = 1
        L_0x01dd:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r1 = 44
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = r23
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = r22
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = r21
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r3.append(r9)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r3.append(r4)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r3.append(r12)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r3.append(r11)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r3.append(r10)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r37 == 0) goto L_0x021f
            r0 = 1
        L_0x021f:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = r17
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r39 == 0) goto L_0x0231
            r0 = 1
        L_0x0231:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r40 == 0) goto L_0x023b
            r0 = 1
        L_0x023b:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r41 == 0) goto L_0x0245
            r0 = 1
        L_0x0245:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = r18
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r43 == 0) goto L_0x0257
            r0 = 1
        L_0x0257:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r3.append(r14)     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = ",("
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r15)     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = "),"
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r46 == 0) goto L_0x0271
            r0 = 1
        L_0x0271:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r3.append(r13)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r48 == 0) goto L_0x0281
            r0 = 1
        L_0x0281:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r20 == 0) goto L_0x028b
            r0 = 1
        L_0x028b:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r19 == 0) goto L_0x0295
            r0 = 1
        L_0x0295:
            r3.append(r0)     // Catch:{ all -> 0x02f9 }
            r3.append(r1)     // Catch:{ all -> 0x02f9 }
            if (r50 == 0) goto L_0x029e
            r5 = 1
        L_0x029e:
            r3.append(r5)     // Catch:{ all -> 0x02f9 }
            X.0ON r5 = X.AnonymousClass0MU.A6q     // Catch:{ all -> 0x02f9 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x02f9 }
            X.0ND r0 = X.AnonymousClass0ND.CRITICAL_REPORT     // Catch:{ all -> 0x02f9 }
            r6.A00(r5, r0, r1)     // Catch:{ all -> 0x02f9 }
        L_0x02ac:
            X.AnonymousClass0IL.A09 = r7     // Catch:{ all -> 0x02f9 }
            X.AnonymousClass0IL.A06 = r7     // Catch:{ all -> 0x02f9 }
            X.AnonymousClass0IL.A00()     // Catch:{ all -> 0x02f9 }
            monitor-exit(r16)
            if (r20 != 0) goto L_0x02b8
            r48 = r48 | 2
        L_0x02b8:
            if (r19 == 0) goto L_0x02bc
            r48 = r48 | 4
        L_0x02bc:
            com.facebook.profilo.logger.MultiBufferLogger r26 = r2.A03()
            r30 = r9
            r31 = r4
            r32 = r12
            r33 = r11
            r34 = r10
            r38 = r17
            r42 = r18
            r44 = r14
            r45 = r15
            r47 = r13
            r25 = r2
            r27 = r23
            r28 = r22
            r29 = r21
            int r1 = nativeInitializeProfiling(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            if (r1 == 0) goto L_0x02e9
            java.lang.String r0 = r2.mErrorMessage
            X.AnonymousClass0IL.A01(r1, r0)
            goto L_0x019b
        L_0x02e9:
            if (r8 != 0) goto L_0x02f0
            r2.startProfiling()
            goto L_0x019b
        L_0x02f0:
            X.0VV r0 = new X.0VV
            r0.<init>(r2, r8)
            r2.mProviderTriggerMonitor = r0
            goto L_0x019b
        L_0x02f9:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        L_0x02fc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.nativememory.NativeMemoryAllocationProvider.enable():void");
    }

    public int getSupportedProviders() {
        return PROVIDER_MEMORY;
    }

    public void onTrigger() {
        startProfiling();
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }

    public void onTraceEnded(TraceContext traceContext, C08000cZ r2) {
        stopTraceIfRunning();
    }
}
