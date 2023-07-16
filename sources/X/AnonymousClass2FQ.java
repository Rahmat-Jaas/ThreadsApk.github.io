package X;

/* renamed from: X.2FQ  reason: invalid class name */
public final class AnonymousClass2FQ {
    /* JADX WARNING: Can't wrap try/catch for region: R(11:11b|125|31|(7:33|18d|45|(1:47)(1:57)|48|(1:50)(1:56)|51)|52|(5:54|(3:58|59|60)|67|68|(2:70|100)(1:101))|61|62|(1:64)|68|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0215, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0216, code lost:
        X.C10450iM.A06("IgProfiloInitializer", "failed to initialize profilo", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x020a */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x020e A[Catch:{ all -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r43) {
        /*
            r3 = 0
            r0 = r43
            X.C04220Ms.A0B(r0, r3)
            r12 = 1
            boolean r1 = com.facebook.systrace.Systrace.A0F(r12)
            if (r1 == 0) goto L_0x0016
            r2 = 529948600(0x1f965fb8, float:6.3685824E-20)
            java.lang.String r1 = "initProfilo"
            X.C13930oX.A01(r1, r2)
        L_0x0016:
            r1 = 36315992892115892(0x81053400000bb4, double:3.029718365515453E-306)
            boolean r16 = X.C18210wN.A1S(r1)
            r1 = 1
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>(r1)
            int r5 = X.C03530Jd.A01
            X.0Jd r4 = new X.0Jd
            r4.<init>()
            r2.put(r5, r4)
            int r6 = X.C03540Je.A01
            X.0Je r4 = new X.0Je
            r4.<init>()
            r2.put(r6, r4)
            int r5 = X.C07900cO.A00
            X.0cO r4 = X.C07900cO.A01
            r2.put(r5, r4)
            X.0Jf r5 = new X.0Jf
            r5.<init>()
            int r4 = X.C03550Jf.A01
            r2.put(r4, r5)
            r4 = 31
            X.0Uk[] r4 = new X.AnonymousClass0Uk[r4]
            com.facebook.profilo.provider.constants.ExternalProvider r17 = com.facebook.profilo.provider.constants.ExternalProviders.A07
            com.facebook.profilo.provider.constants.ExternalProvider r18 = com.facebook.profilo.provider.constants.ExternalProviders.A00
            com.facebook.profilo.provider.constants.ExternalProvider r19 = com.facebook.profilo.provider.constants.ExternalProviders.A01
            com.facebook.profilo.provider.constants.ExternalProvider r20 = com.facebook.profilo.provider.constants.ExternalProviders.A02
            com.facebook.profilo.provider.constants.ExternalProvider r21 = com.facebook.profilo.provider.constants.ExternalProviders.A03
            com.facebook.profilo.provider.constants.ExternalProvider r22 = com.facebook.profilo.provider.constants.ExternalProviders.A04
            com.facebook.profilo.provider.constants.ExternalProvider r23 = com.facebook.profilo.provider.constants.ExternalProviders.A05
            com.facebook.profilo.provider.constants.ExternalProvider r24 = com.facebook.profilo.provider.constants.ExternalProviders.A06
            com.facebook.profilo.provider.constants.ExternalProvider r25 = com.facebook.profilo.provider.constants.ExternalProviders.A08
            com.facebook.profilo.provider.api.ExternalApiProvider r26 = new com.facebook.profilo.provider.api.ExternalApiProvider
            r26.<init>()
            com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider r27 = new com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider
            r27.<init>()
            X.0JF r28 = X.AnonymousClass0JF.A01
            X.0dm r29 = X.C08570dm.A05
            X.0d0 r30 = new X.0d0
            r30.<init>()
            X.0ee r11 = new X.0ee
            r11.<init>(r0)
            com.facebook.profilo.provider.stacktrace.StackFrameThread r10 = new com.facebook.profilo.provider.stacktrace.StackFrameThread
            r10.<init>(r0)
            com.facebook.profilo.provider.systemcounters.SystemCounterThread r33 = new com.facebook.profilo.provider.systemcounters.SystemCounterThread
            r33.<init>()
            X.0dl r34 = new X.0dl
            r34.<init>()
            X.0dq r35 = X.C08590dq.A00()
            com.facebook.profilo.provider.class_load.ClassLoadProvider r36 = new com.facebook.profilo.provider.class_load.ClassLoadProvider
            r36.<init>()
            X.0cn r37 = new X.0cn
            r37.<init>()
            com.facebook.profilo.provider.libcio.LibcIOProvider r38 = new com.facebook.profilo.provider.libcio.LibcIOProvider
            r38.<init>()
            X.0JD r9 = new X.0JD
            r9.<init>(r0)
            com.facebook.profilo.provider.mappings.MemoryMappingsProvider r40 = new com.facebook.profilo.provider.mappings.MemoryMappingsProvider
            r40.<init>()
            X.0JE r8 = new X.0JE
            r8.<init>(r0)
            com.facebook.profilo.provider.device_info.DeviceInfoProvider r7 = new com.facebook.profilo.provider.device_info.DeviceInfoProvider
            r7.<init>(r0)
            com.facebook.profilo.provider.aslsession.AslSessionIdProvider r43 = new com.facebook.profilo.provider.aslsession.AslSessionIdProvider
            r43.<init>()
            r31 = r11
            r32 = r10
            r39 = r9
            r41 = r8
            r42 = r7
            X.0Uk[] r8 = new X.AnonymousClass0Uk[]{r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43}
            r7 = 27
            java.lang.System.arraycopy(r8, r3, r4, r3, r7)
            X.0dP r10 = new X.0dP
            r10.<init>(r0)
            com.facebook.profilo.provider.memorymappings.MemoryMappingActionsProvider r9 = new com.facebook.profilo.provider.memorymappings.MemoryMappingActionsProvider
            r9.<init>(r0)
            com.facebook.profilo.provider.nativememory.NativeMemoryAllocationProvider r8 = new com.facebook.profilo.provider.nativememory.NativeMemoryAllocationProvider
            r8.<init>(r0)
            com.facebook.profilo.provider.memory.MemoryAllocationProvider r7 = new com.facebook.profilo.provider.memory.MemoryAllocationProvider
            r7.<init>()
            X.0Uk[] r9 = new X.AnonymousClass0Uk[]{r10, r9, r8, r7}
            r8 = 27
            r7 = 4
            java.lang.System.arraycopy(r9, r3, r4, r8, r7)
            X.0d8 r7 = new X.0d8
            r7.<init>(r0)
            X.C08290d7.A00 = r7
            X.0cL r10 = new X.0cL
            r10.<init>(r0)
            X.02g r7 = new X.02g
            r7.<init>(r0)
            X.0ca[] r15 = new X.C08010ca[]{r7}
            java.lang.String r9 = "main"
            r8 = 0
            X.0UJ r7 = r10.Ak0()
            if (r7 == 0) goto L_0x026b
            boolean r7 = android.text.TextUtils.isEmpty(r9)
            if (r7 != 0) goto L_0x0264
            int r7 = r2.size()
            if (r7 < r1) goto L_0x025d
            X.0cZ r9 = new X.0cZ
            r9.<init>(r0, r10, r4)
            java.util.concurrent.atomic.AtomicReference r4 = X.C08000cZ.A0A
            boolean r4 = r4.compareAndSet(r8, r9)
            if (r4 == 0) goto L_0x0256
            monitor-enter(r9)
            X.0UL r4 = r9.A00     // Catch:{ all -> 0x0253 }
            X.0UJ r11 = r4.Ak0()     // Catch:{ all -> 0x0253 }
            if (r11 == 0) goto L_0x024c
            monitor-exit(r9)     // Catch:{ all -> 0x0253 }
            monitor-enter(r9)
            X.0VF r4 = r9.A01     // Catch:{ all -> 0x0249 }
            java.io.File r14 = r4.A06     // Catch:{ all -> 0x0249 }
            java.io.File r7 = r4.A04     // Catch:{ all -> 0x0249 }
            com.facebook.profilo.mmapbuf.core.MmapBufferManager r10 = new com.facebook.profilo.mmapbuf.core.MmapBufferManager     // Catch:{ all -> 0x0249 }
            r10.<init>(r7)     // Catch:{ all -> 0x0249 }
            r9.A02 = r10     // Catch:{ all -> 0x0249 }
            X.0Uw r7 = X.C05680Uw.A0A     // Catch:{ all -> 0x0249 }
            if (r7 != 0) goto L_0x0242
            java.lang.Class<X.0Uw> r8 = X.C05680Uw.class
            monitor-enter(r8)     // Catch:{ all -> 0x0249 }
            X.0Uw r7 = X.C05680Uw.A0A     // Catch:{ all -> 0x023f }
            if (r7 != 0) goto L_0x0238
            X.0Uw r17 = new X.0Uw     // Catch:{ all -> 0x023f }
            r18 = r2
            r19 = r11
            r20 = r9
            r21 = r9
            r22 = r10
            r23 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x023f }
            X.C05680Uw.A0A = r17     // Catch:{ all -> 0x023f }
            monitor-exit(r8)     // Catch:{ all -> 0x023f }
            java.lang.String r2 = "profilo"
            X.C15020qa.A0A(r2)     // Catch:{ all -> 0x0249 }
            X.C08000cZ.A01(r11, r9)     // Catch:{ all -> 0x0249 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x0249 }
            long r7 = r2.toSeconds(r12)     // Catch:{ all -> 0x0249 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r10
            r4.A01 = r7     // Catch:{ all -> 0x0249 }
            r2 = 10
            r4.A00 = r2     // Catch:{ all -> 0x0249 }
            X.0JN r2 = r9.A06     // Catch:{ all -> 0x0249 }
            X.07A r4 = new X.07A     // Catch:{ all -> 0x0249 }
            r4.<init>()     // Catch:{ all -> 0x0249 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.A00     // Catch:{ all -> 0x0249 }
            r2.add(r4)     // Catch:{ all -> 0x0249 }
            monitor-exit(r9)     // Catch:{ all -> 0x0249 }
            r4 = r15[r3]
            X.0cZ r2 = X.C08000cZ.A00()
            X.0JN r2 = r2.A06
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.A00
            r2.add(r4)
            com.facebook.profilo.logger.api.ProfiloLogger.sHasProfilo = r1
            X.AnonymousClass0V6.A00 = r1
            X.AnonymousClass0UF.A00 = r1
            if (r16 == 0) goto L_0x01d8
            java.lang.Class<X.0Vt> r4 = X.AnonymousClass0Vt.class
            monitor-enter(r4)
            X.0dr r2 = X.AnonymousClass0Vt.A00     // Catch:{ all -> 0x019c }
            if (r2 != 0) goto L_0x0195
            X.AnonymousClass0Vt.A01 = r1     // Catch:{ all -> 0x019c }
            goto L_0x019f
        L_0x0195:
            java.lang.String r0 = "Enable is called after recorder initialization"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x019c }
            throw r0     // Catch:{ all -> 0x019c }
        L_0x019c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x019f:
            monitor-exit(r4)
            X.0cZ r2 = X.C08000cZ.A00()
            X.0UJ r7 = r2.A09
            X.0dr r14 = X.AnonymousClass0Vt.A00()
            java.lang.String r18 = "IgProfiloInitializer"
            java.lang.Object r4 = r5.A06(r7)
            X.0UV r4 = (X.AnonymousClass0UV) r4
            int r2 = r4.A02
            r8 = -1
            if (r2 != r8) goto L_0x01f7
            r2 = 0
        L_0x01b8:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r5.A06(r7)
            X.0UV r4 = (X.AnonymousClass0UV) r4
            int r2 = r4.A02
            if (r2 != r8) goto L_0x01f4
            r2 = 0
        L_0x01c7:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            long r4 = r7.getID()
            java.lang.Long r17 = java.lang.Long.valueOf(r4)
            java.lang.String r19 = "maybeTraceColdStartWithArgs(); Blackbox marker = %d, Sampling rate = %d, cfg_id = %d"
            r14.A01(r15, r16, r17, r18, r19)
        L_0x01d8:
            X.C08290d7.A01 = r1
            X.0dH r1 = X.C09120et.A3D
            X.0et r1 = r1.A01(r0)
            X.0dK r1 = r1.A1u
            java.lang.Object r1 = X.C18220wO.A0f(r1)
            int r2 = X.AnonymousClass0wJ.A04(r1)
            r1 = 15335435(0xea000b, float:2.1489522E-38)
            if (r2 != r1) goto L_0x020a
            com.instagram.debug.devoptions.apiperf.DebugHeadPlugin r2 = com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.sInstance
            if (r2 != 0) goto L_0x021e
            goto L_0x01fa
        L_0x01f4:
            int r2 = r4.A00
            goto L_0x01c7
        L_0x01f7:
            int r2 = r4.A01
            goto L_0x01b8
        L_0x01fa:
            java.lang.String r1 = "com.instagram.debug.devoptions.debughead.DebugHeadPluginImpl"
            java.lang.Object r2 = X.C18230wP.A0g(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x020a }
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.debug.devoptions.apiperf.DebugHeadPlugin"
            X.C04220Ms.A0C(r2, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x020a }
            com.instagram.debug.devoptions.apiperf.DebugHeadPlugin r2 = (com.instagram.debug.devoptions.apiperf.DebugHeadPlugin) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x020a }
            com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.sInstance = r2     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x020a }
            goto L_0x021e
        L_0x020a:
            X.0Uw r2 = X.C05680Uw.A0A     // Catch:{ all -> 0x0215 }
            if (r2 == 0) goto L_0x0228
            r0 = 15335435(0xea000b, double:7.5767116E-317)
            r2.A09(r0, r6, r3)     // Catch:{ all -> 0x0215 }
            goto L_0x0228
        L_0x0215:
            r2 = move-exception
            java.lang.String r1 = "IgProfiloInitializer"
            java.lang.String r0 = "failed to initialize profilo"
            X.C10450iM.A06(r1, r0, r2)
            goto L_0x0228
        L_0x021e:
            X.C04220Ms.A0A(r2)
            com.instagram.debug.devoptions.debughead.data.provider.LoomTraceHelper r0 = com.instagram.debug.devoptions.debughead.data.provider.LoomTraceHelper.getInstance(r0)
            r0.startTrace()
        L_0x0228:
            X.AnonymousClass0UF.A02()
            boolean r0 = com.facebook.systrace.Systrace.A0F(r12)
            if (r0 == 0) goto L_0x0237
            r0 = -915651585(0xffffffffc96c43ff, float:-967743.94)
            X.C13930oX.A00(r0)
        L_0x0237:
            return
        L_0x0238:
            java.lang.String r0 = "TraceControl already initialized"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x023f }
            throw r0     // Catch:{ all -> 0x023f }
        L_0x023f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x023f }
            goto L_0x0248
        L_0x0242:
            java.lang.String r0 = "TraceControl already initialized"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0249 }
        L_0x0248:
            throw r0     // Catch:{ all -> 0x0249 }
        L_0x0249:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0249 }
            throw r0
        L_0x024c:
            java.lang.String r0 = "We only support v2 configs now!"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x0253 }
            throw r0     // Catch:{ all -> 0x0253 }
        L_0x0253:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0253 }
            throw r0
        L_0x0256:
            java.lang.String r0 = "Orchestrator already initialized"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x025d:
            java.lang.String r0 = "Null or empty list of controllers"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0264:
            java.lang.String r0 = "Null or empty process name"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x026b:
            java.lang.String r0 = "Non-null config provider with null config"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FQ.A00(android.content.Context):void");
    }
}
