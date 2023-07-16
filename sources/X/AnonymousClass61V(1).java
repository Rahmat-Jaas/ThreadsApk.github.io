package X;

/* renamed from: X.61V  reason: invalid class name */
public final class AnonymousClass61V extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61V(C697249u r7) {
        super("device_compute_platform_init", 675609327, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r1 = r8.A02;
        X.C37200JmN.A00();
        r0 = X.C13510np.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        X.C37200JmN.A00();
        r10 = X.C37200JmN.A00();
        r0 = X.C28979FfK.PYTORCH;
        r10.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r15 = new com.google.common.util.concurrent.SettableFuture();
        r14 = X.AnonymousClass0wJ.A0v();
        X.C18240wQ.A1Q(r14, new X.C28979FfK[]{r0});
        r13 = X.AnonymousClass006.A01;
        X.C37200JmN.A00().A02(r1.A00, new X.C36813Jf5((X.C12560m7) null, new com.facebook.redex.IDxCCallbackShape584S0100000_2_I2(r15, 2), r13, r14));
        r0 = (java.lang.Boolean) r15.get();
        X.C04220Ms.A04(r0);
        r1 = r0.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        if (r1 == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        r0 = "pytorch voltron module not loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0107, code lost:
        r1 = X.AnonymousClass5Id.A01("", r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1 = X.AnonymousClass5Id.A01("", r0.getMessage(), false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091 A[Catch:{ Exception -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0131 A[Catch:{ Exception -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0183 A[Catch:{ Exception -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0201 A[Catch:{ Exception -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0219 A[Catch:{ Exception -> 0x0239 }, LOOP:3: B:80:0x0213->B:82:0x0219, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r21 = this;
            r0 = r21
            X.49u r0 = r0.A00
            android.content.Context r3 = r0.A05
            com.instagram.service.session.UserSession r2 = r0.A06
            r7 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r3, r2)
            java.lang.Class<X.7tx> r1 = X.C132477tx.class
            r0 = 33
            java.lang.Object r5 = X.C86124wJ.A0o(r2, r1, r3, r0)
            X.7tx r5 = (X.C132477tx) r5
            X.6by r0 = r5.A01     // Catch:{ Exception -> 0x0239 }
            X.0cE r2 = r0.A00     // Catch:{ Exception -> 0x0239 }
            if (r2 == 0) goto L_0x0223
            r0 = 36319231297459183(0x810826000013ef, double:3.0317663460945616E-306)
            boolean r0 = r2.ATr(r0)     // Catch:{ Exception -> 0x0239 }
            if (r0 != r6) goto L_0x0223
            java.util.List r0 = r5.A04     // Catch:{ Exception -> 0x0239 }
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x0239 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x0239 }
        L_0x0032:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x0051
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x0239 }
            r2 = r3
            X.8nR r2 = (X.C147128nR) r2     // Catch:{ Exception -> 0x0239 }
            java.lang.Integer r1 = r2.B2e()     // Catch:{ Exception -> 0x0239 }
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ Exception -> 0x0239 }
            if (r1 != r0) goto L_0x004d
            boolean r0 = r2.BBc()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x0032
        L_0x004d:
            r9.add(r3)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0032
        L_0x0051:
            boolean r0 = X.C18190wL.A1a(r9)     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x020d
            com.instagram.service.session.UserSession r3 = r5.A02     // Catch:{ Exception -> 0x0239 }
            X.C04220Ms.A0B(r3, r7)     // Catch:{ Exception -> 0x0239 }
            java.lang.Class<X.7ti> r2 = X.C132327ti.class
            r1 = 36
            kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2     // Catch:{ Exception -> 0x0239 }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0239 }
            java.lang.Object r0 = r3.A01(r2, r0)     // Catch:{ Exception -> 0x0239 }
            X.7ti r0 = (X.C132327ti) r0     // Catch:{ Exception -> 0x0239 }
            X.76K r8 = r0.A00     // Catch:{ Exception -> 0x0239 }
            r4 = 0
            X.5KE r1 = new X.5KE     // Catch:{ Exception -> 0x0239 }
            r1.<init>(r4, r4, r6)     // Catch:{ Exception -> 0x0239 }
            X.7Gq r0 = r8.A00     // Catch:{ Exception -> 0x0239 }
            r20 = r0
            X.68S r3 = X.AnonymousClass68S.PYTORCH_DOWNLOAD     // Catch:{ Exception -> 0x0239 }
            java.lang.String r2 = "no_use_case"
            r0.A02(r3, r1, r2)     // Catch:{ Exception -> 0x0239 }
            boolean r0 = r9 instanceof java.util.Collection     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x0099
            boolean r0 = r9.isEmpty()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x0099
        L_0x0088:
            X.5Id r1 = new X.5Id     // Catch:{ Exception -> 0x0239 }
            r1.<init>(r4, r4, r6)     // Catch:{ Exception -> 0x0239 }
        L_0x008d:
            boolean r0 = r1.A02     // Catch:{ Exception -> 0x0239 }
            if (r0 != 0) goto L_0x0201
            java.lang.String r4 = r1.A01     // Catch:{ Exception -> 0x0239 }
            java.lang.String r0 = "pytorch manager failure"
            if (r4 != 0) goto L_0x01fb
            goto L_0x01fa
        L_0x0099:
            java.util.Iterator r10 = r9.iterator()     // Catch:{ Exception -> 0x0239 }
        L_0x009d:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r10.next()     // Catch:{ Exception -> 0x0239 }
            X.8nR r1 = (X.C147128nR) r1     // Catch:{ Exception -> 0x0239 }
            boolean r0 = r1.BXK()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x009d
            boolean r0 = r1.BXd()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x009d
            X.6bs r1 = r8.A02     // Catch:{ Exception -> 0x0239 }
            X.C37200JmN.A00()     // Catch:{ Exception -> 0x0239 }
            X.0np r0 = X.C13510np.A00()     // Catch:{ Exception -> 0x0239 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0239 }
            monitor-exit(r0)     // Catch:{ Exception -> 0x0239 }
            X.C37200JmN.A00()     // Catch:{ Exception -> 0x0239 }
            X.JmN r10 = X.C37200JmN.A00()     // Catch:{ Exception -> 0x0239 }
            X.FfK r0 = X.C28979FfK.PYTORCH     // Catch:{ Exception -> 0x0239 }
            r10.A01()     // Catch:{ Exception -> 0x0239 }
            java.lang.String r10 = ""
            com.google.common.util.concurrent.SettableFuture r15 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ Exception -> 0x010c }
            r15.<init>()     // Catch:{ Exception -> 0x010c }
            X.FfK[] r0 = new X.C28979FfK[]{r0}     // Catch:{ Exception -> 0x010c }
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x010c }
            X.C18240wQ.A1Q(r14, r0)     // Catch:{ Exception -> 0x010c }
            java.lang.Integer r13 = X.AnonymousClass006.A01     // Catch:{ Exception -> 0x010c }
            r0 = 2
            com.facebook.redex.IDxCCallbackShape584S0100000_2_I2 r12 = new com.facebook.redex.IDxCCallbackShape584S0100000_2_I2     // Catch:{ Exception -> 0x010c }
            r12.<init>(r15, r0)     // Catch:{ Exception -> 0x010c }
            X.JmN r11 = X.C37200JmN.A00()     // Catch:{ Exception -> 0x010c }
            com.instagram.service.session.UserSession r1 = r1.A00     // Catch:{ Exception -> 0x010c }
            X.Jf5 r0 = new X.Jf5     // Catch:{ Exception -> 0x010c }
            r0.<init>(r4, r12, r13, r14)     // Catch:{ Exception -> 0x010c }
            r11.A02(r1, r0)     // Catch:{ Exception -> 0x010c }
            java.lang.Object r0 = r15.get()     // Catch:{ Exception -> 0x010c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x010c }
            X.C04220Ms.A04(r0)     // Catch:{ Exception -> 0x010c }
            boolean r1 = r0.booleanValue()     // Catch:{ Exception -> 0x010c }
            if (r1 == 0) goto L_0x0105
            r0 = r10
            goto L_0x0107
        L_0x0105:
            java.lang.String r0 = "pytorch voltron module not loaded"
        L_0x0107:
            X.5Id r1 = X.AnonymousClass5Id.A01(r10, r0, r1)     // Catch:{ Exception -> 0x010c }
            goto L_0x0115
        L_0x010c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0239 }
            X.5Id r1 = X.AnonymousClass5Id.A01(r10, r0, r7)     // Catch:{ Exception -> 0x0239 }
        L_0x0115:
            boolean r0 = r1.A02     // Catch:{ Exception -> 0x0239 }
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = r1.A01     // Catch:{ Exception -> 0x0239 }
            X.5Id r1 = X.AnonymousClass5Id.A01(r4, r0, r7)     // Catch:{ Exception -> 0x0239 }
            goto L_0x008d
        L_0x0121:
            java.lang.String r0 = "voltron_module_loaded"
            X.AnonymousClass76K.A00(r8, r0, r10)     // Catch:{ Exception -> 0x0239 }
            java.util.Iterator r19 = r9.iterator()     // Catch:{ Exception -> 0x0239 }
            r11 = 0
        L_0x012b:
            boolean r0 = r19.hasNext()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x01ee
            int r18 = r11 + 1
            java.lang.Object r9 = r19.next()     // Catch:{ Exception -> 0x0239 }
            X.8nR r9 = (X.C147128nR) r9     // Catch:{ Exception -> 0x0239 }
            boolean r0 = r9.BXK()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x01ea
            X.6br r13 = r8.A01     // Catch:{ Exception -> 0x0239 }
            java.lang.String r15 = r9.AwE()     // Catch:{ Exception -> 0x0239 }
            long r0 = r9.AwF()     // Catch:{ Exception -> 0x0239 }
            java.lang.String r12 = r9.Aw7()     // Catch:{ Exception -> 0x0239 }
            X.C18180wK.A1P(r15, r6, r12)     // Catch:{ Exception -> 0x0239 }
            com.facebook.models.interfaces.ModelLoaderBase r14 = r13.A00     // Catch:{ Exception -> 0x0239 }
            if (r14 != 0) goto L_0x01ab
            java.lang.String r0 = "model loader is null"
            X.5Id r13 = X.AnonymousClass5Id.A01(r10, r0, r7)     // Catch:{ Exception -> 0x0239 }
        L_0x015a:
            java.lang.String r0 = "model_downloaded_"
            java.lang.String r12 = X.AnonymousClass00U.A0J(r0, r11)     // Catch:{ Exception -> 0x0239 }
            java.lang.StringBuilder r14 = X.C18200wM.A0r()     // Catch:{ Exception -> 0x0239 }
            java.lang.String r0 = X.C98766Gv.A00(r9)     // Catch:{ Exception -> 0x0239 }
            r14.append(r0)     // Catch:{ Exception -> 0x0239 }
            r0 = 32
            r14.append(r0)     // Catch:{ Exception -> 0x0239 }
            boolean r1 = r13.A02     // Catch:{ Exception -> 0x0239 }
            r14.append(r1)     // Catch:{ Exception -> 0x0239 }
            r14.append(r0)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r0 = r13.A01     // Catch:{ Exception -> 0x0239 }
            java.lang.String r0 = X.C18180wK.A0i(r0, r14)     // Catch:{ Exception -> 0x0239 }
            X.AnonymousClass76K.A00(r8, r12, r0)     // Catch:{ Exception -> 0x0239 }
            if (r1 == 0) goto L_0x01ea
            java.lang.Object r12 = r13.A00     // Catch:{ Exception -> 0x0239 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0239 }
            X.78l r0 = r8.A03     // Catch:{ Exception -> 0x0239 }
            java.lang.String r13 = X.C98766Gv.A00(r9)     // Catch:{ Exception -> 0x0239 }
            X.AnonymousClass0wJ.A1N(r13, r12)     // Catch:{ Exception -> 0x0239 }
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ Exception -> 0x0239 }
            android.content.SharedPreferences$Editor r9 = r0.edit()     // Catch:{ Exception -> 0x0239 }
            java.lang.String r1 = "dcp_ig_models"
            r0 = 95
            java.lang.String r0 = X.AnonymousClass00U.A0N(r1, r13, r0)     // Catch:{ Exception -> 0x0239 }
            X.C18180wK.A0v(r9, r0, r12)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r0 = "model_saved_"
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r11)     // Catch:{ Exception -> 0x0239 }
            X.AnonymousClass76K.A00(r8, r0, r10)     // Catch:{ Exception -> 0x0239 }
            goto L_0x01ea
        L_0x01ab:
            r16 = -1
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x01b2
            goto L_0x01bd
        L_0x01b2:
            com.google.common.util.concurrent.ListenableFuture r0 = r14.load(r15, r0)     // Catch:{ Exception -> 0x01df }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01df }
            com.facebook.models.ModelMetadata r0 = (com.facebook.models.ModelMetadata) r0     // Catch:{ Exception -> 0x01df }
            goto L_0x01c7
        L_0x01bd:
            com.google.common.util.concurrent.ListenableFuture r0 = r14.load(r15)     // Catch:{ Exception -> 0x01df }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01df }
            com.facebook.models.ModelMetadata r0 = (com.facebook.models.ModelMetadata) r0     // Catch:{ Exception -> 0x01df }
        L_0x01c7:
            com.facebook.models.ModelAssetMetadata r0 = r0.getAssetMetadata(r12)     // Catch:{ Exception -> 0x01df }
            if (r0 != 0) goto L_0x01d4
            java.lang.String r0 = "no asset"
            X.5Id r13 = X.AnonymousClass5Id.A01(r10, r0, r7)     // Catch:{ Exception -> 0x01df }
            goto L_0x015a
        L_0x01d4:
            java.lang.String r0 = r0.path     // Catch:{ Exception -> 0x01df }
            X.C04220Ms.A05(r0)     // Catch:{ Exception -> 0x01df }
            X.5Id r13 = X.AnonymousClass5Id.A01(r0, r4, r6)     // Catch:{ Exception -> 0x01df }
            goto L_0x015a
        L_0x01df:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0239 }
            X.5Id r13 = X.AnonymousClass5Id.A01(r10, r0, r7)     // Catch:{ Exception -> 0x0239 }
            goto L_0x015a
        L_0x01ea:
            r11 = r18
            goto L_0x012b
        L_0x01ee:
            java.lang.String r0 = "models_downloaded"
            X.AnonymousClass76K.A00(r8, r0, r10)     // Catch:{ Exception -> 0x0239 }
            X.5Id r1 = new X.5Id     // Catch:{ Exception -> 0x0239 }
            r1.<init>(r4, r4, r6)     // Catch:{ Exception -> 0x0239 }
            goto L_0x008d
        L_0x01fa:
            r4 = r0
        L_0x01fb:
            X.5KC r1 = new X.5KC     // Catch:{ Exception -> 0x0239 }
            r1.<init>(r4, r0)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0206
        L_0x0201:
            X.5KF r1 = new X.5KF     // Catch:{ Exception -> 0x0239 }
            r1.<init>(r4, r7, r6)     // Catch:{ Exception -> 0x0239 }
        L_0x0206:
            X.8gV r1 = (X.C143308gV) r1     // Catch:{ Exception -> 0x0239 }
            r0 = r20
            r0.A02(r3, r1, r2)     // Catch:{ Exception -> 0x0239 }
        L_0x020d:
            java.util.List r0 = r5.A03     // Catch:{ Exception -> 0x0239 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x0239 }
        L_0x0213:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x024d
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0239 }
            X.8k3 r0 = (X.C145208k3) r0     // Catch:{ Exception -> 0x0239 }
            r0.BQJ()     // Catch:{ Exception -> 0x0239 }
            goto L_0x0213
        L_0x0223:
            java.util.List r0 = r5.A03     // Catch:{ Exception -> 0x0239 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x0239 }
        L_0x0229:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0239 }
            if (r0 == 0) goto L_0x024d
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0239 }
            X.8k3 r0 = (X.C145208k3) r0     // Catch:{ Exception -> 0x0239 }
            r0.cleanup()     // Catch:{ Exception -> 0x0239 }
            goto L_0x0229
        L_0x0239:
            r3 = move-exception
            X.0on r2 = X.C10770iu.A00()
            r1 = 1011495295(0x3c4a317f, float:0.012340902)
            java.lang.String r0 = "error on IgMLEngineSessionManager.init"
            X.0oo r0 = r2.ABJ(r0, r1)
            r0.Ciu(r3)
            r0.report()
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass61V.loggedRun():void");
    }
}
