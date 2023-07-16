package com.facebook.redex;

import X.C18250wR;
import X.C37352Jq1;
import X.C61143Sb;
import X.C82234pI;
import com.instagram.business.promote.model.PromoteData;

public class IDxICallbackShape592S0100000_1_I2 implements C82234pI {
    public Object A00;
    public final int A01;

    public IDxICallbackShape592S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x024e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0252, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0255, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.C102596Vu.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0259, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* bridge */ /* synthetic */ void A00(com.facebook.redex.IDxICallbackShape592S0100000_1_I2 r21, java.lang.Object r22) {
        /*
            r0 = r22
            X.39t r0 = (X.C571039t) r0
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            X.3EH r3 = r0.A00
            r4 = r21
            if (r3 == 0) goto L_0x0165
            java.lang.Object r0 = r4.A00
            X.3ym r0 = (X.C67043ym) r0
            com.instagram.service.session.UserSession r2 = r0.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r0 = r0.A00
            java.lang.Object r0 = r3.A00(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
        L_0x001c:
            java.lang.Object r4 = r4.A00
            X.3ym r4 = (X.C67043ym) r4
            X.0Oa r2 = r4.A03
            java.lang.Object r5 = r2.getValue()
            X.3aR r5 = (X.C62633aR) r5
            X.4ne r3 = r4.A01
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            r5.A03(r3, r2, r0)
            X.01V r5 = X.AnonymousClass01V.A0p
            r3 = 483332562(0x1ccf11d2, float:1.3702717E-21)
            r5.markerStart(r3)
            java.lang.String r2 = "test_pii_key"
            r5.markerAnnotate((int) r3, (java.lang.String) r2, (java.lang.String) r0)
            r2 = 467(0x1d3, float:6.54E-43)
            r5.markerEnd(r3, r2)
            com.instagram.service.session.UserSession r6 = r4.A02
            X.H1T r7 = X.AnonymousClass0wJ.A0O(r6)
            java.lang.String r5 = "/ig/casdbl/fake_path/"
            X.H1R r3 = r7.A04
            boolean r2 = X.C62033Ww.A00(r5)
            X.AnonymousClass7Ko.A0B(r2)
            r3.A0A = r5
            java.lang.String r2 = "pii_string"
            r7.A0O(r2, r0)
            X.H8c r2 = X.C18190wL.A0Q(r7)
            X.C31155GhB.A02(r2)
            r2 = r0
            r5 = 0
            X.3zb r12 = X.C67463zb.A00()
            X.3zb r10 = X.C67463zb.A00()
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x006f
            r2 = r3
        L_0x006f:
            java.lang.String r8 = "id"
            r12.A05(r8, r2)
            boolean r2 = X.AnonymousClass0wJ.A1W(r2)
            java.lang.String r7 = "data"
            r12.A05(r7, r3)
            X.AnonymousClass7Ko.A0B(r2)
            r2 = 1
            X.AnonymousClass7Ko.A0B(r2)
            r9 = 54
            java.lang.String r11 = X.I17.A00(r9)
            X.8l9 r13 = X.C63233h2.A02(r11)
            java.util.Map r15 = com.facebook.graphql.calls.GraphQlCallInput.A03(r12)
            java.util.Map r16 = com.facebook.graphql.calls.GraphQlCallInput.A03(r10)
            java.lang.Class<com.instagram.business.onelink.tests.queries.IGOneLinkUnlinkDetectorSampleQueryDoNotUseResponseImpl> r17 = com.instagram.business.onelink.tests.queries.IGOneLinkUnlinkDetectorSampleQueryDoNotUseResponseImpl.class
            java.lang.String r14 = "IGOneLinkUnlinkDetectorSampleQueryDoNotUse"
            java.lang.String r22 = "ig_one_link_unlink_sla_detector_sample_do_not_use"
            com.facebook.pando.PandoGraphQLRequest r12 = new com.facebook.pando.PandoGraphQLRequest
            r18 = r1
            r19 = r5
            r20 = r1
            r21 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.Grx r10 = X.AnonymousClass3WK.A01(r6)
            com.facebook.redex.IDxFCallbackShape137S0000000_1_I2 r9 = new com.facebook.redex.IDxFCallbackShape137S0000000_1_I2
            r9.<init>(r1)
            r10.AMA(r12, r9)
            if (r0 == 0) goto L_0x00e8
            X.3zb r10 = X.C67463zb.A00()
            X.3zb r9 = X.C67463zb.A00()
            r10.A05(r8, r0)
            r10.A05(r7, r3)
            X.AnonymousClass7Ko.A0B(r2)
            X.AnonymousClass7Ko.A0B(r2)
            X.8l9 r13 = X.C63233h2.A02(r11)
            java.util.Map r15 = com.facebook.graphql.calls.GraphQlCallInput.A03(r10)
            java.util.Map r16 = com.facebook.graphql.calls.GraphQlCallInput.A03(r9)
            com.facebook.pando.PandoGraphQLRequest r12 = new com.facebook.pando.PandoGraphQLRequest
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.Grx r8 = X.AnonymousClass3WK.A01(r6)
            com.facebook.redex.IDxFCallbackShape137S0000000_1_I2 r7 = new com.facebook.redex.IDxFCallbackShape137S0000000_1_I2
            r7.<init>(r2)
            r8.AMA(r12, r7)
        L_0x00e8:
            r10 = r0
            X.49q r7 = X.AnonymousClass3Zs.A03(r6)
            X.D2R r9 = X.D2R.A1D
            java.lang.Class r8 = r4.getClass()
            android.content.SharedPreferences r4 = r7.A02(r9, r8)
            android.content.SharedPreferences$Editor r4 = X.C18250wR.A06(r4)
            if (r0 != 0) goto L_0x00fe
            r10 = r3
        L_0x00fe:
            java.lang.String r7 = "one_link_pii_do_not_use"
            r4.putString(r7, r10)
            r4.apply()
            if (r0 == 0) goto L_0x011a
            X.49q r4 = X.AnonymousClass3Zs.A03(r6)
            android.content.SharedPreferences r4 = r4.A02(r9, r8)
            android.content.SharedPreferences$Editor r4 = X.C18250wR.A06(r4)
            r4.putString(r7, r0)
            r4.apply()
        L_0x011a:
            com.instagram.user.model.User r4 = X.AnonymousClass0wJ.A0Y(r6)
            X.MeW r4 = r4.A05
            if (r0 == 0) goto L_0x0161
            r4.Chc(r0)
        L_0x0125:
            android.content.Intent r8 = X.C18230wP.A0B()
            java.lang.String r4 = "android.intent.action.SEND"
            r8.setAction(r4)
            java.lang.String r7 = "android.intent.extra.TEXT"
            r8.putExtra(r7, r0)
            java.lang.String r4 = "text/plain"
            r8.setType(r4)
            android.app.Activity r6 = new android.app.Activity
            r6.<init>()
            r4 = 100
            X.C16430t3.A00(r6, r8, r4)
            android.os.Bundle r8 = X.C18180wK.A06()
            r8.putString(r7, r0)
            java.lang.String r7 = "android.intent.action.VIEW"
            X.3Gp r4 = new X.3Gp
            r4.<init>()
            java.util.Set r10 = X.AnonymousClass321.A00
            r4.A01(r10)
            r4.A00 = r2
            X.3GO r9 = r4.A00()
            X.0t2 r4 = X.C16420t2.A00()
            monitor-enter(r4)
            goto L_0x0168
        L_0x0161:
            r4.Chc(r5)
            goto L_0x0125
        L_0x0165:
            r0 = 0
            goto L_0x001c
        L_0x0168:
            X.05M r6 = r4.A06()     // Catch:{ all -> 0x0276 }
            monitor-exit(r4)
            X.3Gp r4 = new X.3Gp
            r4.<init>()
            r4.A01(r10)
            r4.A00 = r2
            X.3GO r4 = r4.A00()
            r10 = 2
            X.3GO[] r9 = new X.AnonymousClass3GO[]{r4, r9}
            X.1Q7 r4 = new X.1Q7
            r4.<init>(r9)
            java.lang.String r11 = "BrowserLiteIntent.JS_BRIDGE"
            java.lang.String r12 = "BrowserLiteIntent.EXTRA_WEB_SHARE_COMPLETION_MESSAGE"
            java.lang.String r13 = "BrowserLiteIntent.EXTRA_EXECUTE_ADS_PREVIEW_JS"
            r9 = 362(0x16a, float:5.07E-43)
            java.lang.String r14 = X.I17.A00(r9)
            java.lang.String r15 = "BrowserLiteIntent.EXTRA_REFERRER"
            java.lang.String r16 = "BrowserLiteIntent.EXTRA_OPEN_WITH_URL"
            java.lang.String r17 = "BrowserLiteIntent.EXTRA_EXECUTE_WEB_SHARE_JS"
            java.lang.String[] r9 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17}
            java.util.List r9 = java.util.Arrays.asList(r9)
            java.util.ArrayList r13 = X.C18200wM.A0s(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r9, r2}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.ArrayList r12 = X.C18200wM.A0s(r2)
            java.util.concurrent.atomic.AtomicReference r2 = androidx.test.platform.app.InstrumentationRegistry.A00
            java.lang.Object r2 = r2.get()
            android.app.Instrumentation r2 = (android.app.Instrumentation) r2
            if (r2 == 0) goto L_0x026f
            android.content.Context r2 = r2.getTargetContext()
            android.content.Context r2 = r2.getApplicationContext()
            android.view.ContextThemeWrapper r9 = new android.view.ContextThemeWrapper
            r9.<init>(r2, r1)
            java.lang.String r2 = "http://instagram.com/test_uri_for_intent"
            android.net.Uri r11 = android.net.Uri.parse(r2)
            boolean r2 = r4.A01(r11)
            if (r2 == 0) goto L_0x022a
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r7, r11)
            r10.setFlags(r1)
            r10.replaceExtras(r8)
            android.os.Bundle r8 = r10.getExtras()
            if (r8 == 0) goto L_0x01fd
            java.util.Iterator r4 = r13.iterator()
        L_0x01ef:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x01fd
            java.lang.String r2 = X.C18180wK.A0k(r4)
            r8.remove(r2)
            goto L_0x01ef
        L_0x01fd:
            int r7 = r10.getFlags()
            java.util.Iterator r4 = r12.iterator()
        L_0x0205:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0217
            java.lang.Object r2 = r4.next()
            int r2 = X.AnonymousClass0wJ.A04(r2)
            r2 = r2 ^ -1
            r7 = r7 & r2
            goto L_0x0205
        L_0x0217:
            android.content.Intent r4 = r10.cloneFilter()
            if (r8 == 0) goto L_0x0220
            r4.putExtras(r8)
        L_0x0220:
            r4.addFlags(r7)
            X.0EO r2 = r6.A01(r5)
            r2.A09(r9, r4)
        L_0x022a:
            java.lang.String r4 = "ig_one_link_mariana_trench_detector_poison_pill_test_file"
            java.lang.String r2 = ".txt"
            java.io.File r5 = java.io.File.createTempFile(r4, r2)     // Catch:{ IOException -> 0x026a }
            r5.deleteOnExit()     // Catch:{ IOException -> 0x026a }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x025a }
            r4.<init>(r5, r1)     // Catch:{ IOException -> 0x025a }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0253 }
            r2.<init>(r4)     // Catch:{ all -> 0x0253 }
            if (r0 != 0) goto L_0x0242
            r0 = r3
        L_0x0242:
            r2.write(r0)     // Catch:{ all -> 0x024c }
            r2.close()     // Catch:{ all -> 0x0253 }
            r4.close()     // Catch:{ IOException -> 0x025a }
            goto L_0x0261
        L_0x024c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x024e }
        L_0x024e:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)     // Catch:{ all -> 0x0253 }
            throw r0     // Catch:{ all -> 0x0253 }
        L_0x0253:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            X.C102596Vu.A00(r4, r1)     // Catch:{ IOException -> 0x025a }
            throw r0     // Catch:{ IOException -> 0x025a }
        L_0x025a:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x0265 }
            r5.delete()     // Catch:{ all -> 0x0265 }
        L_0x0261:
            r5.delete()
            return
        L_0x0265:
            r0 = move-exception
            r5.delete()
            throw r0
        L_0x026a:
            r0 = move-exception
            r0.getMessage()
            return
        L_0x026f:
            java.lang.String r0 = "No instrumentation registered! Must run under a registering instrumentation."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0276:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxICallbackShape592S0100000_1_I2.A00(com.facebook.redex.IDxICallbackShape592S0100000_1_I2, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A01 != 0) {
            C61143Sb r3 = (C61143Sb) obj;
            PromoteData promoteData = ((C37352Jq1) this.A00).A06;
            promoteData.A1E = r3.A00;
            promoteData.A0o = C18250wR.A0K(r3.A01);
            return;
        }
        A00(this, obj);
    }
}
