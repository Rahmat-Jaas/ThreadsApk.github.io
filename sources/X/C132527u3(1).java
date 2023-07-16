package X;

import android.content.Context;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.instagram.service.session.UserSession;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.7u3  reason: invalid class name and case insensitive filesystem */
public final class C132527u3 implements AnonymousClass0i1, C145208k3 {
    public final C145798l6 A00;
    public final C1198077b A01;
    public final C147058nK A02;
    public final C147128nR A03;
    public final C1200878l A04;
    public final C132347tk A05;
    public final C104586c1 A06;
    public final UserSession A07;
    public final C03700Kj A08 = AnonymousClass0IY.A00;

    public final void onUserSessionWillEnd(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (java.lang.System.currentTimeMillis() >= (X.C18190wL.A08(r1.A00) + 43200000)) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BQJ() {
        /*
            r29 = this;
            r7 = r29
            X.8nR r6 = r7.A03
            boolean r0 = r6.BXK()
            if (r0 != 0) goto L_0x000e
            r7.cleanup()
        L_0x000d:
            return
        L_0x000e:
            X.8l6 r5 = r7.A00
            java.lang.String r4 = "IG_ADS_PREFETCH"
            X.5Id r1 = r5.CfA(r4)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r1.A00
            long r8 = X.C18190wL.A08(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 43200000(0x2932e00, double:2.1343636E-316)
            long r8 = r8 + r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
        L_0x002c:
            X.77b r0 = r7.A01
            X.5Id r1 = X.C1198077b.A00(r0, r6)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = X.C18240wQ.A0b(r0)
            com.facebook.dcp.model.Example r2 = (com.facebook.dcp.model.Example) r2
            long r0 = java.lang.System.currentTimeMillis()
            r5.CwJ(r2, r4, r0)
        L_0x0047:
            r0 = r6
            X.7eS r0 = (X.C126027eS) r0
            X.0cE r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x03f8
            r0 = 36324217756524910(0x810caf001f216e, double:3.0349198028865864E-306)
            boolean r0 = r2.ATr(r0)
            if (r0 != r3) goto L_0x03f8
        L_0x005a:
            X.7tk r2 = r7.A05
            if (r3 == 0) goto L_0x03e3
            X.0Oa r1 = r2.A03
            X.8nR r0 = X.C86154wM.A0K(r1)
            r0.BXK()
            X.8nR r0 = X.C86154wM.A0K(r1)
            boolean r0 = r0.BXK()
            if (r0 == 0) goto L_0x03e3
            X.0Oa r0 = r2.A02
            java.lang.Object r3 = r0.getValue()
            X.75o r3 = (X.C1194975o) r3
            r0 = 1440(0x5a0, double:7.115E-321)
            java.lang.String r9 = "IG_STORY_ADS_PREFETCH_WORKER"
            java.lang.Integer r13 = X.AnonymousClass006.A00
            java.util.LinkedHashSet r2 = X.C86134wK.A0u()
            java.lang.Integer r8 = X.AnonymousClass006.A01
            java.util.Set r16 = X.AnonymousClass00J.A0c(r2)
            r17 = -1
            r5 = 0
            r23 = 1
            X.M1g r11 = new X.M1g
            r19 = r17
            r21 = r5
            r22 = r5
            r24 = r23
            r14 = r11
            r15 = r8
            r14.<init>(r15, r16, r17, r19, r21, r22, r23, r24)
            java.lang.Class<com.facebook.dcpusecases.ig4a.adsstory.scheduler.IgStoryPrefetchServerFeaturesDownloadWorker> r10 = com.facebook.dcpusecases.ig4a.adsstory.scheduler.IgStoryPrefetchServerFeaturesDownloadWorker.class
            java.util.concurrent.TimeUnit r4 = X.C1194975o.A02
            X.LCa r2 = new X.LCa
            r2.<init>(r10, r4, r0)
            r2.A02(r11)
            X.Ln7 r12 = r2.A00()
            X.LCc r12 = (X.C39973LCc) r12
            android.content.Context r2 = r3.A00
            X.M5i r11 = X.C41250M5i.A00(r2)
            X.C04220Ms.A06(r11)
            X.LCt r4 = new X.LCt
            r4.<init>(r11, r9)
            X.MZa r2 = r11.A06
            X.MBH r2 = (X.MBH) r2
            X.MBG r2 = r2.A01
            r2.execute(r4)
            X.LCx r2 = r4.A00
            java.lang.Object r4 = r2.get()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x00e5
            boolean r2 = X.C18190wL.A1a(r4)
            if (r2 == 0) goto L_0x00e5
            java.lang.Object r2 = r4.get(r5)
            X.JX2 r2 = (X.JX2) r2
            X.ItY r2 = r2.A02
            boolean r2 = r2.A00()
            if (r2 == 0) goto L_0x00e5
            r8 = r13
        L_0x00e5:
            X.6c0 r2 = r3.A01
            X.78l r10 = r2.A00
            java.lang.String r5 = "schedule_interval_key"
            android.content.SharedPreferences r3 = r10.A00
            java.lang.String r2 = X.C1200878l.A00(r10, r5)
            long r3 = r3.getLong(r2, r0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00fa
            r8 = r13
        L_0x00fa:
            r11.A05(r12, r8, r9)
            r10.A02(r5, r0)
        L_0x0100:
            java.lang.String r1 = X.C25756DrT.A02
            java.lang.String r0 = "COLD"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0113
            X.78l r3 = r7.A04
            long r1 = X.C25756DrT.A07
            java.lang.String r0 = "last_cold_start_key"
            r3.A02(r0, r1)
        L_0x0113:
            X.6c1 r0 = r7.A06
            X.0cE r2 = r0.A00
            r13 = 1
            if (r2 == 0) goto L_0x03cd
            r0 = 36324217755345254(0x810caf000d2166, double:3.034919802140567E-306)
            boolean r0 = r2.ATr(r0)
            if (r0 != r13) goto L_0x03cd
            X.8nK r0 = r7.A02
            r0.CbU()
        L_0x012a:
            java.lang.Integer r1 = r6.B2e()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x0161
            boolean r0 = r6.BBc()
            if (r0 == 0) goto L_0x0161
            com.instagram.service.session.UserSession r12 = r7.A07
            r11 = 0
            X.C04220Ms.A0B(r12, r11)
            java.lang.Class<X.781> r22 = X.AnonymousClass781.class
            r21 = 35
            kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2 r1 = new kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2
            r0 = r21
            r1.<init>(r6, r0)
            r0 = r22
            java.lang.Object r0 = r12.A01(r0, r1)
            X.781 r0 = (X.AnonymousClass781) r0
            java.io.File r1 = X.AnonymousClass781.A00(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L_0x01a6
        L_0x0161:
            boolean r0 = r6.BZD()
            if (r0 == 0) goto L_0x000d
            com.instagram.service.session.UserSession r2 = r7.A07
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.Class<X.7tb> r1 = X.C132257tb.class
            r0 = 2
            java.lang.Object r0 = X.C86124wJ.A0n(r2, r1, r0)
            X.7tb r0 = (X.C132257tb) r0
            X.0Oa r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            X.8l5 r1 = (X.C145788l5) r1
            java.util.List r7 = r1.AQA()
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x000d
            X.Grx r0 = X.AnonymousClass3WK.A01(r2)
            X.6oI r3 = new X.6oI
            r3.<init>(r0)
            java.lang.String r5 = r6.BJq()
            java.lang.String r6 = r6.BJs()
            X.68S r4 = X.AnonymousClass68S.PREDICT
            long r8 = java.lang.System.currentTimeMillis()
            r3.A00(r4, r5, r6, r7, r8)
            r1.CbR()
            return
        L_0x01a6:
            X.6is r1 = X.C98706Gp.A00(r12)
            r15 = 0
            r0 = 2
            X.C04220Ms.A0B(r1, r0)
            X.8GB r0 = X.AnonymousClass8GB.A00
            X.0Oa r4 = X.AnonymousClass0OY.A02(r0)
            X.78l r2 = r1.A01
            java.lang.String r0 = X.C98766Gv.A00(r6)
            java.lang.String r3 = ""
            X.C04220Ms.A0B(r0, r11)
            android.content.SharedPreferences r1 = r2.A00
            java.lang.String r0 = X.C1200878l.A00(r2, r0)
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 == 0) goto L_0x01cd
            r3 = r0
        L_0x01cd:
            int r0 = r3.length()
            boolean r0 = X.C18180wK.A1W(r0)
            java.lang.String r2 = "Model file is not found for "
            if (r0 != 0) goto L_0x0363
            java.io.File r1 = X.C86144wL.A0Z(r3)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0363
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L_0x0363
            java.nio.charset.Charset r0 = X.AnonymousClass74V.A05
            java.lang.String r2 = X.AnonymousClass8DI.A00(r1, r0)
            java.lang.Object r1 = r4.getValue()
            com.google.gson.Gson r1 = (com.google.gson.Gson) r1
            java.lang.Class<com.google.gson.JsonObject> r0 = com.google.gson.JsonObject.class
            java.lang.Object r10 = r1.A06(r2, r0)
            com.google.gson.JsonObject r10 = (com.google.gson.JsonObject) r10
            java.lang.String r0 = "feature_id_list"
            com.google.gson.JsonArray r0 = A00(r10, r0)
            r9 = 10
            java.util.ArrayList r20 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r2 = r0.iterator()
        L_0x020d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0227
            java.lang.Object r0 = r2.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            int r0 = r0.getAsInt()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = r20
            r0.add(r1)
            goto L_0x020d
        L_0x0227:
            java.lang.String r0 = "mean_val"
            com.google.gson.JsonArray r0 = A00(r10, r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r1 = r0.iterator()
        L_0x0235:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x023f
            A01(r2, r1)
            goto L_0x0235
        L_0x023f:
            float[] r26 = X.AnonymousClass00J.A0l(r2)
            java.lang.String r0 = "val_range"
            com.google.gson.JsonArray r0 = A00(r10, r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r1 = r0.iterator()
        L_0x0251:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x025b
            A01(r2, r1)
            goto L_0x0251
        L_0x025b:
            float[] r27 = X.AnonymousClass00J.A0l(r2)
            java.lang.String r0 = "layers"
            com.google.gson.JsonArray r0 = A00(r10, r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r1 = r0.iterator()
        L_0x026d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0281
            java.lang.Object r0 = r1.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            int r0 = r0.getAsInt()
            X.C18200wM.A1U(r2, r0)
            goto L_0x026d
        L_0x0281:
            int[] r19 = X.AnonymousClass00J.A0m(r2)
            java.util.ArrayList r18 = X.AnonymousClass0wJ.A0v()
            r0 = r19
            int r8 = r0.length
            r5 = 1
            if (r13 > r8) goto L_0x0370
        L_0x028f:
            java.lang.String r4 = "layer."
            java.lang.String r0 = ".BatchNorm1d.alpha"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r4, r0, r5)
            com.google.gson.JsonElement r0 = r10.get(r0)
            if (r0 == 0) goto L_0x02ba
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            if (r0 == 0) goto L_0x02ba
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r1 = r0.iterator()
        L_0x02ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02b5
            A01(r2, r1)
            goto L_0x02ab
        L_0x02b5:
            float[] r3 = X.AnonymousClass00J.A0l(r2)
            goto L_0x02bc
        L_0x02ba:
            float[] r3 = new float[r11]
        L_0x02bc:
            java.lang.String r0 = ".BatchNorm1d.beta"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r4, r0, r5)
            com.google.gson.JsonElement r0 = r10.get(r0)
            if (r0 == 0) goto L_0x02e5
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            if (r0 == 0) goto L_0x02e5
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r0 = r0.iterator()
        L_0x02d6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02e0
            A01(r1, r0)
            goto L_0x02d6
        L_0x02e0:
            float[] r2 = X.AnonymousClass00J.A0l(r1)
            goto L_0x02e7
        L_0x02e5:
            float[] r2 = new float[r11]
        L_0x02e7:
            java.lang.String r0 = ".Linear.weight"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r4, r0, r5)
            com.google.gson.JsonArray r0 = A00(r10, r0)
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r17 = r0.iterator()
        L_0x02f9:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0326
            java.lang.Object r0 = r17.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            X.C04220Ms.A06(r0)
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r0 = r0.iterator()
        L_0x0314:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x031e
            A01(r14, r0)
            goto L_0x0314
        L_0x031e:
            float[] r0 = X.AnonymousClass00J.A0l(r14)
            r1.add(r0)
            goto L_0x02f9
        L_0x0326:
            float[][] r0 = new float[r11][]
            java.lang.Object[] r0 = r1.toArray(r0)
            float[][] r0 = (float[][]) r0
            com.facebook.dcp.model.Matrix r1 = new com.facebook.dcp.model.Matrix
            r1.<init>(r0)
            java.lang.String r0 = ".Linear.bias"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r4, r0, r5)
            com.google.gson.JsonArray r0 = A00(r10, r0)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r0 = r0.iterator()
        L_0x0345:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x034f
            A01(r4, r0)
            goto L_0x0345
        L_0x034f:
            float[] r4 = X.AnonymousClass00J.A0l(r4)
            X.LIC r0 = new X.LIC
            r0.<init>(r1, r3, r2, r4)
            r1 = r18
            r1.add(r0)
            if (r5 == r8) goto L_0x0370
            int r5 = r5 + 1
            goto L_0x028f
        L_0x0363:
            java.lang.String r0 = X.C98766Gv.A00(r6)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r0)
            X.5Id r1 = X.AnonymousClass5Id.A01(r15, r0, r11)
            goto L_0x0381
        L_0x0370:
            com.facebook.dcp.prediction.litennmodelparams.DynamicNNModelParams r0 = new com.facebook.dcp.prediction.litennmodelparams.DynamicNNModelParams
            r23 = r0
            r24 = r20
            r25 = r18
            r28 = r19
            r23.<init>(r24, r25, r26, r27, r28)
            X.5Id r1 = X.AnonymousClass5Id.A01(r0, r15, r13)
        L_0x0381:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0161
            java.lang.Object r5 = r1.A00
            if (r5 == 0) goto L_0x0161
            X.8mN r5 = (X.C146518mN) r5
            if (r5 == 0) goto L_0x0161
            kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2 r1 = new kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2
            r0 = r21
            r1.<init>(r6, r0)
            r0 = r22
            java.lang.Object r0 = r12.A01(r0, r1)
            X.781 r0 = (X.AnonymousClass781) r0
            com.facebook.dcp.prediction.litennmodelparams.DynamicNNModelParams r5 = (com.facebook.dcp.prediction.litennmodelparams.DynamicNNModelParams) r5     // Catch:{ Exception -> 0x0161 }
            X.C04220Ms.A0B(r5, r11)     // Catch:{ Exception -> 0x0161 }
            java.util.concurrent.locks.ReentrantLock r4 = r0.A02     // Catch:{ Exception -> 0x0161 }
            r4.lock()     // Catch:{ Exception -> 0x0161 }
            java.io.File r3 = X.AnonymousClass781.A00(r0)     // Catch:{ all -> 0x03c8 }
            X.Kq4 r2 = X.C36975Ji8.A03     // Catch:{ all -> 0x03c8 }
            X.76V r1 = r2.A02     // Catch:{ all -> 0x03c8 }
            java.lang.Class<com.facebook.dcp.prediction.litennmodelparams.DynamicNNModelParams> r0 = com.facebook.dcp.prediction.litennmodelparams.DynamicNNModelParams.class
            java.lang.String r1 = X.C18210wN.A0d(r0, r5, r2, r1)     // Catch:{ all -> 0x03c8 }
            java.nio.charset.Charset r0 = X.AnonymousClass74V.A05     // Catch:{ all -> 0x03c8 }
            X.C04220Ms.A0B(r1, r13)     // Catch:{ all -> 0x03c8 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x03c8 }
            X.C04220Ms.A06(r0)     // Catch:{ all -> 0x03c8 }
            X.AnonymousClass8DI.A01(r3, r0)     // Catch:{ all -> 0x03c8 }
            r4.unlock()     // Catch:{ Exception -> 0x0161 }
            goto L_0x0161
        L_0x03c8:
            r0 = move-exception
            r4.unlock()     // Catch:{ Exception -> 0x0161 }
            throw r0     // Catch:{ Exception -> 0x0161 }
        L_0x03cd:
            X.8nK r3 = r7.A02
            if (r2 == 0) goto L_0x03e0
            r0 = 36605692732117452(0x820caf000e11cc, double:3.2129257108600627E-306)
            long r1 = r2.At2(r0)
        L_0x03da:
            int r0 = (int) r1
            r3.BaA(r0)
            goto L_0x012a
        L_0x03e0:
            r1 = 0
            goto L_0x03da
        L_0x03e3:
            X.0Oa r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.75o r0 = (X.C1194975o) r0
            android.content.Context r0 = r0.A00
            X.M5i r1 = X.C41250M5i.A00(r0)
            java.lang.String r0 = "IG_STORY_ADS_PREFETCH_WORKER"
            r1.A09(r0)
            goto L_0x0100
        L_0x03f8:
            r3 = 0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132527u3.BQJ():void");
    }

    public final void cleanup() {
        C41250M5i.A00(((C1194975o) this.A05.A02.getValue()).A00).A09("IG_STORY_ADS_PREFETCH_WORKER");
        C1200878l r4 = this.A04;
        C18180wK.A0u(r4.A00.edit(), C1200878l.A00(r4, "last_cold_start_key"));
        this.A02.CbU();
        UserSession userSession = this.A07;
        C04220Ms.A0B(userSession, 0);
        ((C145788l5) ((C132257tb) C86124wJ.A0n(userSession, C132257tb.class, 2)).A02.getValue()).CbR();
    }

    public C132527u3(UserSession userSession, Context context) {
        this.A07 = userSession;
        this.A04 = (C1200878l) AnonymousClass6H0.A00(userSession).A02.getValue();
        this.A03 = new C126027eS(userSession);
        this.A06 = new C104586c1(userSession);
        AnonymousClass0wJ.A1N(userSession, context);
        this.A05 = (C132347tk) C86124wJ.A0o(userSession, C132347tk.class, context, 43);
        this.A02 = (C147058nK) ((C132357tl) C86124wJ.A0n(userSession, C132357tl.class, 35)).A03.getValue();
        this.A01 = ((C132317th) C86124wJ.A0o(userSession, C132317th.class, context, 35)).A00;
        this.A00 = (C145798l6) ((C132387to) C86124wJ.A0n(userSession, C132387to.class, 6)).A04.getValue();
    }

    public static JsonArray A00(JsonObject jsonObject, String str) {
        JsonArray asJsonArray = jsonObject.get(str).getAsJsonArray();
        C04220Ms.A06(asJsonArray);
        return asJsonArray;
    }

    public static void A01(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Float.valueOf(((JsonElement) it.next()).getAsFloat()));
    }
}
