package X;

/* renamed from: X.7eB  reason: invalid class name and case insensitive filesystem */
public final class C125857eB implements C146908n4 {
    public final C145198k2 A00;
    public final C147128nR A01;
    public final C86004w7 A02;
    public final long A03;
    public final C145188k1 A04;
    public final AnonymousClass68S A05;
    public final C121547Gq A06;

    private final void A01(String str, String str2) {
        A00(this, C86134wK.A0N(str, str2, 4, 0));
    }

    public static final void A00(C125857eB r2, C143308gV r3) {
        C121547Gq.A01(r2.A05, r3, r2.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e6, code lost:
        A00(r12, new X.AnonymousClass5KB(r2, "ml_engine"));
        r1 = X.AnonymousClass0ZV.A00;
        r0 = r2.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f6, code lost:
        if (r0 == null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fb, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fc, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010d, code lost:
        r9.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0116, code lost:
        if (r0 == null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011c, code lost:
        return X.AnonymousClass5Id.A01(r1, r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011d, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e5 A[ExcHandler: Exception (r2v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:6:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5Id CX7(X.C145188k1 r13, java.lang.Long r14, java.util.List r15) {
        /*
            r12 = this;
            java.lang.String r5 = "ml engine error"
            r4 = 0
            r9 = 0
            r8 = 1
            X.5KE r0 = new X.5KE
            r0.<init>(r9, r9, r8)
            A00(r12, r0)
            X.8nR r2 = r12.A01
            java.lang.String r1 = r2.BJq()
            java.lang.String r0 = "use_case_name"
            r3 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r1, r3, r4)
            A00(r12, r0)
            java.lang.String r1 = r2.BJs()
            java.lang.String r0 = "use_case_version"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r1, r3, r4)
            A00(r12, r0)
            X.8k1 r0 = r12.A04
            X.5Id r0 = r0.ALA(r9)
            java.lang.Object r0 = r0.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r4)
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "app_start_type"
            r12.A01(r0, r1)
            X.8k2 r0 = r12.A00
            java.lang.String r1 = r0.BIu()
            r0 = 342(0x156, float:4.79E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.A01(r0, r1)
            int r0 = r15.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "examples_requested"
            r12.A01(r0, r1)
            java.lang.Integer r0 = r2.B2e()
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0075;
                case 1: goto L_0x0072;
                default: goto L_0x0068;
            }
        L_0x0068:
            java.lang.String r1 = "LINEAR_REGRESSION"
        L_0x006a:
            java.lang.String r0 = "predictor_type"
            r12.A01(r0, r1)
            long r1 = r12.A03
            goto L_0x0078
        L_0x0072:
            java.lang.String r1 = "LITE_BINARY_CLASSIFIER_USING_NEURAL_NET"
            goto L_0x006a
        L_0x0075:
            java.lang.String r1 = "PYTORCH_BINARY_CLASSIFIER_USING_NEURAL_NET"
            goto L_0x006a
        L_0x0078:
            X.4w7 r3 = r12.A02     // Catch:{ TimeoutException -> 0x00f9, Exception -> 0x00e5 }
            com.facebook.redex.IDxCallableShape70S0300000_2_I2 r0 = new com.facebook.redex.IDxCallableShape70S0300000_2_I2     // Catch:{ TimeoutException -> 0x00f9, Exception -> 0x00e5 }
            r0.<init>(r4, r13, r12, r15)     // Catch:{ TimeoutException -> 0x00f9, Exception -> 0x00e5 }
            com.google.common.util.concurrent.ListenableFuture r10 = r3.CwQ(r0)     // Catch:{ TimeoutException -> 0x00f9, Exception -> 0x00e5 }
            X.C04220Ms.A06(r10)     // Catch:{ TimeoutException -> 0x00f9, Exception -> 0x00e5 }
            java.lang.String r0 = "go_to_background_thread"
            r3 = 6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r9, r3, r8)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            A00(r12, r0)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            java.lang.Object r11 = r10.get(r1, r0)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            X.5Id r11 = (X.AnonymousClass5Id) r11     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            java.lang.String r0 = "return_from_background_thread"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r9, r3, r8)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            A00(r12, r0)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            boolean r0 = r11.A02     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r6 = r11.A00     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            boolean r0 = X.C18190wL.A1a(r0)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            if (r0 == 0) goto L_0x00ce
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            java.text.NumberFormat r3 = java.text.NumberFormat.getInstance(r0)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            java.lang.Object r0 = X.C86124wJ.A0p(r6, r4)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            java.lang.Object r0 = r0.A01     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            double r6 = X.C86124wJ.A00(r0)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            java.lang.String r3 = r3.format(r6)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            java.lang.String r0 = "score"
            X.C04220Ms.A06(r3)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            r12.A01(r0, r3)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
        L_0x00ce:
            X.5KF r6 = new X.5KF     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            r6.<init>(r9, r4, r8)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
        L_0x00d3:
            A00(r12, r6)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            goto L_0x00e4
        L_0x00d7:
            java.lang.String r3 = r11.A01     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            if (r3 != 0) goto L_0x00dc
            r3 = r5
        L_0x00dc:
            java.lang.String r0 = "ml_engine_prediction_failure"
            X.5KC r6 = new X.5KC     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            r6.<init>(r3, r0)     // Catch:{ TimeoutException -> 0x00fb, Exception -> 0x00e5 }
            goto L_0x00d3
        L_0x00e4:
            return r11
        L_0x00e5:
            r2 = move-exception
            java.lang.String r1 = "ml_engine"
            X.5KB r0 = new X.5KB
            r0.<init>(r2, r1)
            A00(r12, r0)
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L_0x011d
            goto L_0x0118
        L_0x00f9:
            r3 = move-exception
            goto L_0x00fd
        L_0x00fb:
            r3 = move-exception
            r9 = r10
        L_0x00fd:
            java.lang.String r0 = "ml_engine_timeout_exception_"
            java.lang.String r1 = X.AnonymousClass00U.A08(r1, r0)
            X.5KB r0 = new X.5KB
            r0.<init>(r3, r1)
            A00(r12, r0)
            if (r9 == 0) goto L_0x0110
            r9.cancel(r8)
        L_0x0110:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            java.lang.String r0 = r3.getMessage()
            if (r0 != 0) goto L_0x011d
        L_0x0118:
            X.5Id r11 = X.AnonymousClass5Id.A01(r1, r5, r4)
            return r11
        L_0x011d:
            r5 = r0
            goto L_0x0118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125857eB.CX7(X.8k1, java.lang.Long, java.util.List):X.5Id");
    }

    public C125857eB(C145188k1 r2, C145198k2 r3, AnonymousClass68S r4, C121547Gq r5, C147128nR r6, C86004w7 r7, long j) {
        AnonymousClass0wJ.A1O(r5, r7);
        C18190wL.A1S(r2, 4, r3);
        C86104wH.A1P(r6, 6, r4);
        this.A06 = r5;
        this.A02 = r7;
        this.A03 = j;
        this.A04 = r2;
        this.A00 = r3;
        this.A01 = r6;
        this.A05 = r4;
    }
}
