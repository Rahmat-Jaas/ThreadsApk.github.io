package com.facebook.profilo.provider.memorymappings;

import X.AnonymousClass0IL;
import X.AnonymousClass0Uk;
import X.C14030oh;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class MemoryMappingActionsProvider extends AnonymousClass0Uk {
    public static final int PROVIDER_MAPPINGS = ProvidersRegistry.A00.A02("memory_mapping_actions");
    public boolean isProfiling;

    public static native void nativeStartProfiling(MultiBufferLogger multiBufferLogger, int i, int i2, String str, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4);

    public static native void nativeStopProfiling();

    public MemoryMappingActionsProvider(Context context) {
        super("profilo_memory_mapping_actions");
    }

    public int getTracingProviders() {
        if (!this.isProfiling) {
            return 0;
        }
        int i = PROVIDER_MAPPINGS;
        if (TraceEvents.isEnabled(i)) {
            return i;
        }
        return 0;
    }

    public void disable() {
        int A03 = C14030oh.A03(2132660497);
        nativeStopProfiling();
        this.isProfiling = false;
        synchronized (AnonymousClass0IL.class) {
            AnonymousClass0IL.A05 = false;
            AnonymousClass0IL.A00();
        }
        C14030oh.A0A(-930113607, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r4.A08.A02("provider.memory_mapping_actions.log_unmapping", true) == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r4 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r13 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r4 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4.A08.A02("provider.memory_mapping_actions.use_lock_free_queue_async_unwinder", true) != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r4 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r8 == 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r4 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r4 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r4.getFilePath() == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        r10 = r4.generateMemoryMappingFilePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r4 = X.AnonymousClass0IL.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        r16 = r4.A08.A00("provider.memory_mapping_actions.async_unwinder_thread_priority", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r6 = r4.A08;
        r13 = r6.A00("provider.memory_mapping_actions.async_unwinder_queue_size", 256);
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r6.A02("provider.memory_mapping_actions.share_async_unwinder_thread", false) != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.AnonymousClass0IL.A08 = true;
        X.AnonymousClass0IL.A05 = true;
        X.AnonymousClass0IL.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        nativeStartProfiling(A03(), r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r3.isProfiling = true;
        X.C14030oh.A0A(849709483, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r4.A08.A02("provider.memory_mapping_actions.detail_fd", true) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r4 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r12 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enable() {
        /*
            r17 = this;
            r0 = 1667667562(0x6366966a, float:4.2535896E21)
            int r2 = X.C14030oh.A03(r0)
            r3 = r17
            com.facebook.profilo.ipc.TraceContext r4 = r3.A00
            r5 = 0
            if (r4 != 0) goto L_0x0076
            r8 = 0
            r9 = 0
        L_0x0010:
            r1 = 1
            if (r4 == 0) goto L_0x001e
            com.facebook.profilo.ipc.TraceConfigExtras r6 = r4.A08
            java.lang.String r0 = "provider.memory_mapping_actions.detail_fd"
            boolean r0 = r6.A02(r0, r1)
            r11 = 0
            if (r0 == 0) goto L_0x0021
        L_0x001e:
            r11 = 1
            if (r4 == 0) goto L_0x002c
        L_0x0021:
            com.facebook.profilo.ipc.TraceConfigExtras r6 = r4.A08
            java.lang.String r0 = "provider.memory_mapping_actions.log_unmapping"
            boolean r0 = r6.A02(r0, r1)
            r12 = 0
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r12 = 1
        L_0x002d:
            r7 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x0064
            r13 = 256(0x100, float:3.59E-43)
        L_0x0033:
            r14 = 0
            if (r4 == 0) goto L_0x0041
        L_0x0036:
            com.facebook.profilo.ipc.TraceConfigExtras r6 = r4.A08
            java.lang.String r0 = "provider.memory_mapping_actions.use_lock_free_queue_async_unwinder"
            boolean r0 = r6.A02(r0, r1)
            r15 = 1
            if (r0 != 0) goto L_0x005b
        L_0x0041:
            r15 = 0
            if (r4 != 0) goto L_0x005b
            r16 = 0
        L_0x0046:
            r10 = 0
            if (r8 == 0) goto L_0x0057
            if (r4 == 0) goto L_0x0057
            com.facebook.profilo.mmapbuf.core.Buffer r4 = r4.A09
            java.lang.String r0 = r4.getFilePath()
            if (r0 == 0) goto L_0x0057
            java.lang.String r10 = r4.generateMemoryMappingFilePath()
        L_0x0057:
            java.lang.Class<X.0IL> r4 = X.AnonymousClass0IL.class
            monitor-enter(r4)
            goto L_0x0087
        L_0x005b:
            com.facebook.profilo.ipc.TraceConfigExtras r6 = r4.A08
            java.lang.String r0 = "provider.memory_mapping_actions.async_unwinder_thread_priority"
            int r16 = r6.A00(r0, r5)
            goto L_0x0046
        L_0x0064:
            com.facebook.profilo.ipc.TraceConfigExtras r6 = r4.A08
            java.lang.String r0 = "provider.memory_mapping_actions.async_unwinder_queue_size"
            int r13 = r6.A00(r0, r7)
            java.lang.String r0 = "provider.memory_mapping_actions.share_async_unwinder_thread"
            boolean r0 = r6.A02(r0, r5)
            r14 = 1
            if (r0 != 0) goto L_0x0036
            goto L_0x0033
        L_0x0076:
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r4.A08
            java.lang.String r0 = "provider.memory_mapping_actions.unwinder_type"
            int r8 = r1.A00(r0, r5)
            com.facebook.profilo.ipc.TraceConfigExtras r1 = r4.A08
            java.lang.String r0 = "provider.memory_mapping_actions.max_unwind_depth"
            int r9 = r1.A00(r0, r5)
            goto L_0x0010
        L_0x0087:
            X.AnonymousClass0IL.A08 = r1     // Catch:{ all -> 0x009f }
            X.AnonymousClass0IL.A05 = r1     // Catch:{ all -> 0x009f }
            X.AnonymousClass0IL.A00()     // Catch:{ all -> 0x009f }
            monitor-exit(r4)
            com.facebook.profilo.logger.MultiBufferLogger r7 = r3.A03()
            nativeStartProfiling(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.isProfiling = r1
            r0 = 849709483(0x32a589ab, float:1.9271132E-8)
            X.C14030oh.A0A(r0, r2)
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.memorymappings.MemoryMappingActionsProvider.enable():void");
    }

    public int getSupportedProviders() {
        return PROVIDER_MAPPINGS;
    }
}
