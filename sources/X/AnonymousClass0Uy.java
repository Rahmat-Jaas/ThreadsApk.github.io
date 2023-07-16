package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.0Uy  reason: invalid class name */
public final class AnonymousClass0Uy extends Handler {
    public final C05660Uu A00 = new C05660Uu();
    public final C08000cZ A01;
    public final AnonymousClass0V4 A02;
    public final HashSet A03 = new HashSet();
    public final Random A04 = new Random();

    public final synchronized void A01(TraceContext traceContext) {
        HashSet hashSet = this.A03;
        if (hashSet.contains(Long.valueOf(traceContext.A06))) {
            sendMessage(obtainMessage(3, traceContext));
            hashSet.remove(Long.valueOf(traceContext.A06));
        }
    }

    public final synchronized void A02(TraceContext traceContext) {
        HashSet hashSet = this.A03;
        if (hashSet.contains(Long.valueOf(traceContext.A06))) {
            sendMessage(obtainMessage(2, traceContext));
            hashSet.remove(Long.valueOf(traceContext.A06));
        }
    }

    public static void A00(TraceContext traceContext) {
        BufferLogger.writeStandardEntry(traceContext.A09, 6, 98, 0, 0, traceContext.A08.A00("trace_config.logger_priority", 5), 0, traceContext.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x024c, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x024d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x013f, code lost:
        if (r15 == 0) goto L_0x0141;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r20) {
        /*
            r19 = this;
            r1 = r19
            r5 = r1
            r3 = r20
            int r2 = r3.what
            r0 = 7
            if (r2 == r0) goto L_0x0275
            java.lang.Object r0 = r3.obj
            com.facebook.profilo.ipc.TraceContext r0 = (com.facebook.profilo.ipc.TraceContext) r0
            switch(r2) {
                case 0: goto L_0x0064;
                case 1: goto L_0x004f;
                case 2: goto L_0x01cc;
                case 3: goto L_0x0012;
                case 4: goto L_0x011a;
                case 5: goto L_0x022e;
                case 6: goto L_0x0082;
                case 7: goto L_0x0275;
                default: goto L_0x0011;
            }
        L_0x0011:
            return
        L_0x0012:
            monitor-enter(r5)
            r2 = 0
            r1.removeMessages(r2, r0)     // Catch:{ all -> 0x0257 }
            monitor-exit(r5)     // Catch:{ all -> 0x0257 }
            X.0cZ r8 = r1.A01
            if (r8 == 0) goto L_0x0011
            monitor-enter(r8)
            X.0Uk[] r7 = r8.A04     // Catch:{ all -> 0x0254 }
            X.0Uk[] r6 = r8.A05     // Catch:{ all -> 0x0254 }
            monitor-exit(r8)     // Catch:{ all -> 0x0254 }
            X.0JN r1 = r8.A06
            r1.CPo(r0)
            int r1 = r0.A02
            java.lang.Class<com.facebook.profilo.core.TraceEvents> r2 = com.facebook.profilo.core.TraceEvents.class
            monitor-enter(r2)
            int r1 = com.facebook.profilo.core.TraceEvents.nativeDisableProviders(r1)     // Catch:{ all -> 0x0251 }
            com.facebook.profilo.core.TraceEvents.sProviders = r1     // Catch:{ all -> 0x0251 }
            monitor-exit(r2)
            java.lang.Object r5 = r8.A07
            monitor-enter(r5)
            int r4 = r6.length     // Catch:{ all -> 0x024e }
            r3 = 0
            r2 = 0
        L_0x0039:
            if (r2 >= r4) goto L_0x0043
            r1 = r6[r2]     // Catch:{ all -> 0x024e }
            r1.A05(r0, r8)     // Catch:{ all -> 0x024e }
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0043:
            monitor-exit(r5)     // Catch:{ all -> 0x024e }
            int r2 = r7.length
        L_0x0045:
            if (r3 >= r2) goto L_0x0011
            r1 = r7[r3]
            r1.A05(r0, r8)
            int r3 = r3 + 1
            goto L_0x0045
        L_0x004f:
            int r2 = r0.A03
            r2 = r2 & 2
            if (r2 != 0) goto L_0x005d
            X.0VH r2 = r0.A0G
            r2.start()
            A00(r0)
        L_0x005d:
            X.0cZ r5 = r1.A01
            if (r5 == 0) goto L_0x0011
            monitor-enter(r5)
            goto L_0x025a
        L_0x0064:
            long r0 = r0.A06
            X.0Uw r3 = X.C05680Uw.A0A
            com.facebook.profilo.ipc.TraceContext r2 = X.C05680Uw.A00(r3, r0)
            if (r2 == 0) goto L_0x0011
            com.facebook.profilo.mmapbuf.core.Buffer r4 = r2.A09
            r5 = 6
            r6 = 41
            r7 = 0
            r9 = 0
            long r12 = r2.A06
            r10 = r9
            r11 = r9
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r4, r5, r6, r7, r9, r10, r11, r12)
            r2 = 4
            r3.A07(r0, r2)
            return
        L_0x0082:
            X.0Uu r2 = r1.A00
            long r4 = r0.A06
            monitor-enter(r2)
            android.util.LongSparseArray r3 = r2.A00     // Catch:{ all -> 0x0251 }
            java.lang.Object r9 = r3.get(r4)     // Catch:{ all -> 0x0251 }
            X.0Ut r9 = (X.AnonymousClass0Ut) r9     // Catch:{ all -> 0x0251 }
            if (r9 == 0) goto L_0x00d0
            X.0Ui r8 = r9.A00     // Catch:{ all -> 0x0251 }
            r7 = 1
            if (r8 == 0) goto L_0x00ae
            java.util.HashSet r6 = r8.A02     // Catch:{ all -> 0x0251 }
            monitor-enter(r6)     // Catch:{ all -> 0x0251 }
            X.0Uh r5 = r8.A01     // Catch:{ all -> 0x00ab }
            java.lang.String[] r4 = r8.A03     // Catch:{ all -> 0x00ab }
            boolean r4 = r5.AKV(r6, r4)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x00a5
            monitor-exit(r6)     // Catch:{ all -> 0x00ab }
            goto L_0x00ae
        L_0x00a5:
            monitor-exit(r6)     // Catch:{ all -> 0x00ab }
            int r8 = r8.A00     // Catch:{ all -> 0x0251 }
            if (r8 == r7) goto L_0x00ae
            goto L_0x00d1
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x0251 }
        L_0x00ae:
            X.0Um r12 = r9.A01     // Catch:{ all -> 0x0251 }
            if (r12 == 0) goto L_0x00d0
            r11 = 0
            r8 = 0
            r9 = -1
        L_0x00b5:
            int[] r13 = r12.A01     // Catch:{ all -> 0x0251 }
            int r4 = r13.length     // Catch:{ all -> 0x0251 }
            if (r11 >= r4) goto L_0x00d1
            long r6 = r12.A00     // Catch:{ all -> 0x0251 }
            r4 = r13[r11]     // Catch:{ all -> 0x0251 }
            long r4 = (long) r4     // Catch:{ all -> 0x0251 }
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x00cd
            r4 = r13[r11]     // Catch:{ all -> 0x0251 }
            if (r4 <= r9) goto L_0x00cd
            r9 = r13[r11]     // Catch:{ all -> 0x0251 }
            int[] r4 = r12.A02     // Catch:{ all -> 0x0251 }
            r8 = r4[r11]     // Catch:{ all -> 0x0251 }
        L_0x00cd:
            int r11 = r11 + 1
            goto L_0x00b5
        L_0x00d0:
            r8 = 1
        L_0x00d1:
            monitor-exit(r2)
            if (r8 == 0) goto L_0x00fb
            java.util.Random r4 = r1.A04
            int r4 = r4.nextInt(r8)
            if (r4 != 0) goto L_0x00fb
            com.facebook.profilo.mmapbuf.core.Buffer r9 = r0.A09
            r10 = 6
            r11 = 99
            r12 = 0
            r14 = 0
            long r4 = (long) r8
            r15 = r14
            r16 = r14
            r17 = r4
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r9, r10, r11, r12, r14, r15, r16, r17)
            r11 = 61
            long r4 = r0.A06
            r17 = r4
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r9, r10, r11, r12, r14, r15, r16, r17)
            r1.A02(r0)
        L_0x00f9:
            monitor-enter(r2)
            goto L_0x0113
        L_0x00fb:
            com.facebook.profilo.mmapbuf.core.Buffer r4 = r0.A09
            r5 = 6
            r6 = 37
            r7 = 0
            r9 = 0
            long r12 = r0.A06
            r10 = r9
            r11 = r9
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r4, r5, r6, r7, r9, r10, r11, r12)
            com.facebook.profilo.ipc.TraceContext r4 = new com.facebook.profilo.ipc.TraceContext
            r4.<init>(r0, r5)
            r1.A01(r4)
            goto L_0x00f9
        L_0x0113:
            long r0 = r0.A06     // Catch:{ all -> 0x0251 }
            r3.delete(r0)     // Catch:{ all -> 0x0251 }
            goto L_0x024c
        L_0x011a:
            X.0cZ r4 = r1.A01
            if (r4 == 0) goto L_0x01bc
            monitor-enter(r4)
            X.0Uk[] r5 = r4.A04     // Catch:{ all -> 0x01b1 }
            X.0Uk[] r6 = r4.A05     // Catch:{ all -> 0x01b1 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b1 }
            r12 = 0
            com.facebook.profilo.ipc.TraceConfigExtras r2 = r0.A08
            java.lang.String r1 = "trace_config.trace_config_id_switch"
            boolean r1 = r2.A02(r1, r12)
            r10 = 0
            if (r1 == 0) goto L_0x016e
            java.lang.String r1 = "trace_config.id"
            java.lang.String r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x016e
            long r15 = java.lang.Long.parseLong(r1)
            int r1 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0149
        L_0x0141:
            X.0UJ r1 = r0.A07
            if (r1 == 0) goto L_0x0149
            long r15 = r1.getID()
        L_0x0149:
            com.facebook.profilo.mmapbuf.core.Buffer r7 = r0.A09
            r8 = 6
            r9 = 52
            r13 = 8126470(0x7c0006, float:1.138761E-38)
            r14 = r12
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r7, r8, r9, r10, r12, r13, r14, r15)
            int r8 = r5.length
            r3 = 0
            r7 = 0
        L_0x0158:
            if (r3 >= r8) goto L_0x0171
            r2 = r5[r3]
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0169
            boolean r1 = r2.A02
            if (r1 != 0) goto L_0x0169
            r1 = 0
        L_0x0165:
            r7 = r7 | r1
            int r3 = r3 + 1
            goto L_0x0158
        L_0x0169:
            int r1 = r2.getTracingProviders()
            goto L_0x0165
        L_0x016e:
            r15 = 0
            goto L_0x0141
        L_0x0171:
            int r9 = r6.length
            r3 = 0
        L_0x0173:
            if (r3 >= r9) goto L_0x0189
            r2 = r6[r3]
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0184
            boolean r1 = r2.A02
            if (r1 != 0) goto L_0x0184
            r1 = 0
        L_0x0180:
            r7 = r7 | r1
            int r3 = r3 + 1
            goto L_0x0173
        L_0x0184:
            int r1 = r2.getTracingProviders()
            goto L_0x0180
        L_0x0189:
            int r1 = r0.A02
            java.lang.Class<com.facebook.profilo.core.TraceEvents> r2 = com.facebook.profilo.core.TraceEvents.class
            monitor-enter(r2)
            int r1 = com.facebook.profilo.core.TraceEvents.nativeDisableProviders(r1)     // Catch:{ all -> 0x0251 }
            com.facebook.profilo.core.TraceEvents.sProviders = r1     // Catch:{ all -> 0x0251 }
            monitor-exit(r2)
            java.lang.Object r3 = r4.A07
            monitor-enter(r3)
            r2 = 0
        L_0x0199:
            if (r2 >= r9) goto L_0x01a3
            r1 = r6[r2]     // Catch:{ all -> 0x01ae }
            r1.A05(r0, r4)     // Catch:{ all -> 0x01ae }
            int r2 = r2 + 1
            goto L_0x0199
        L_0x01a3:
            monitor-exit(r3)     // Catch:{ all -> 0x01ae }
        L_0x01a4:
            if (r12 >= r8) goto L_0x01b4
            r1 = r5[r12]
            r1.A05(r0, r4)
            int r12 = r12 + 1
            goto L_0x01a4
        L_0x01ae:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ae }
            throw r0
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b1 }
            throw r0
        L_0x01b4:
            X.0JN r1 = r4.A06
            r1.CDm(r0, r7)
            r1.CPt(r0)
        L_0x01bc:
            com.facebook.profilo.mmapbuf.core.Buffer r1 = r0.A09
            r2 = 6
            r3 = 38
            r4 = 0
            r6 = 0
            long r9 = r0.A06
            r7 = r6
            r8 = r6
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r1, r2, r3, r4, r6, r7, r8, r9)
            return
        L_0x01cc:
            monitor-enter(r5)
            r11 = 0
            r1.removeMessages(r11, r0)     // Catch:{ all -> 0x022b }
            int r2 = r0.A03     // Catch:{ all -> 0x022b }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x01f3
            X.0VH r2 = r0.A0G     // Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x0223
            X.0VH r2 = r0.A0G     // Catch:{ all -> 0x022b }
            r2.start()     // Catch:{ all -> 0x022b }
            A00(r0)     // Catch:{ all -> 0x022b }
            X.0VH r2 = r0.A0G     // Catch:{ all -> 0x022b }
            com.facebook.profilo.writer.NativeTraceWriter r6 = r2.A01     // Catch:{ all -> 0x022b }
            com.facebook.profilo.mmapbuf.core.Buffer r7 = r0.A09     // Catch:{ all -> 0x022b }
            long r8 = r0.A06     // Catch:{ all -> 0x022b }
            r10 = 40
            int r12 = r0.A03     // Catch:{ all -> 0x022b }
            r13 = r8
            com.facebook.profilo.logger.BufferLogger.writeAndWakeupTraceWriter(r6, r7, r8, r10, r11, r12, r13)     // Catch:{ all -> 0x022b }
        L_0x01f3:
            com.facebook.profilo.ipc.TraceConfigExtras r3 = r0.A08     // Catch:{ all -> 0x022b }
            java.lang.String r2 = "trace_config.post_trace_extension_ms"
            int r4 = r3.A00(r2, r11)     // Catch:{ all -> 0x022b }
            r2 = 4
            android.os.Message r0 = r1.obtainMessage(r2, r0)     // Catch:{ all -> 0x022b }
            long r2 = (long) r4     // Catch:{ all -> 0x022b }
            r1.sendMessageDelayed(r0, r2)     // Catch:{ all -> 0x022b }
            if (r4 <= 0) goto L_0x0221
            X.0cZ r2 = r1.A01     // Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x0221
            monitor-enter(r2)     // Catch:{ all -> 0x022b }
            X.0Uk[] r0 = r2.A04     // Catch:{ all -> 0x021e }
            X.0Uk[] r3 = r2.A05     // Catch:{ all -> 0x021e }
            monitor-exit(r2)     // Catch:{ all -> 0x021e }
            int r2 = r0.length     // Catch:{ all -> 0x022b }
            r1 = 0
            r0 = 0
        L_0x0213:
            if (r0 >= r2) goto L_0x0218
            int r0 = r0 + 1
            goto L_0x0213
        L_0x0218:
            int r0 = r3.length     // Catch:{ all -> 0x022b }
        L_0x0219:
            if (r1 >= r0) goto L_0x0221
            int r1 = r1 + 1
            goto L_0x0219
        L_0x021e:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x021e }
            goto L_0x022a
        L_0x0221:
            monitor-exit(r5)
            return
        L_0x0223:
            java.lang.String r0 = "Trace stopped but never started"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022b }
            r1.<init>(r0)     // Catch:{ all -> 0x022b }
        L_0x022a:
            throw r1     // Catch:{ all -> 0x022b }
        L_0x022b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x022e:
            int r2 = r3.arg1
            long r5 = (long) r2
            X.0Uu r2 = r1.A00
            long r3 = r0.A06
            monitor-enter(r2)
            android.util.LongSparseArray r0 = r2.A00     // Catch:{ all -> 0x0251 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0251 }
            X.0Ut r0 = (X.AnonymousClass0Ut) r0     // Catch:{ all -> 0x0251 }
            if (r0 == 0) goto L_0x024c
            X.0Um r1 = r0.A01     // Catch:{ all -> 0x0251 }
            if (r1 == 0) goto L_0x024c
            long r3 = r1.A00     // Catch:{ all -> 0x0251 }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x024c
            r1.A00 = r5     // Catch:{ all -> 0x0251 }
        L_0x024c:
            monitor-exit(r2)
            return
        L_0x024e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x024e }
            throw r0
        L_0x0251:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0254:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0254 }
            throw r0
        L_0x0257:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0257 }
            throw r0
        L_0x025a:
            X.0Uk[] r4 = r5.A04     // Catch:{ all -> 0x0272 }
            monitor-exit(r5)     // Catch:{ all -> 0x0272 }
            int r3 = r4.length
            r2 = 0
        L_0x025f:
            if (r2 >= r3) goto L_0x0269
            r1 = r4[r2]
            r1.A06(r0, r5)
            int r2 = r2 + 1
            goto L_0x025f
        L_0x0269:
            X.0JN r1 = r5.A06
            r1.CDl(r0)
            r1.CPr(r0)
            return
        L_0x0272:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0272 }
            throw r0
        L_0x0275:
            java.lang.Object r2 = r3.obj
            X.0Ux r2 = (X.C05690Ux) r2
            com.facebook.profilo.ipc.TraceContext r0 = r2.A00
            java.lang.String r4 = r2.A01
            X.0Uu r3 = r1.A00
            long r1 = r0.A06
            monitor-enter(r3)
            android.util.LongSparseArray r0 = r3.A00     // Catch:{ all -> 0x029d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x029d }
            X.0Ut r0 = (X.AnonymousClass0Ut) r0     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x029b
            X.0Ui r0 = r0.A00     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x029b
            java.util.HashSet r1 = r0.A02     // Catch:{ all -> 0x029d }
            monitor-enter(r1)     // Catch:{ all -> 0x029d }
            r1.add(r4)     // Catch:{ all -> 0x0298 }
            monitor-exit(r1)     // Catch:{ all -> 0x0298 }
            goto L_0x029b
        L_0x0298:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0298 }
            throw r0     // Catch:{ all -> 0x029d }
        L_0x029b:
            monitor-exit(r3)
            return
        L_0x029d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Uy.handleMessage(android.os.Message):void");
    }

    public AnonymousClass0Uy(Looper looper, C08000cZ r3, AnonymousClass0V4 r4) {
        super(looper);
        this.A01 = r3;
        this.A02 = r4;
    }
}
