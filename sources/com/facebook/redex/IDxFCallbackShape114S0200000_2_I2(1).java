package com.facebook.redex;

import X.AnonymousClass1jB;
import X.AnonymousClass7EC;
import X.AnonymousClass7EY;
import X.C04220Ms;
import X.C103226Yh;
import X.C108396iI;
import X.C113146qp;
import X.C121967Iz;
import X.C127917hw;
import X.C129017kq;
import X.C1358980o;
import X.C145278kE;
import X.C145288kF;
import X.C18240wQ;
import X.C83334rD;
import X.C86134wK;
import android.app.job.JobParameters;
import com.facebook.papaya.fb.instagram.PapayaExecutionJobService;
import java.util.concurrent.CancellationException;

public class IDxFCallbackShape114S0200000_2_I2 implements C83334rD {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFCallbackShape114S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
        switch (this.A02) {
            case 0:
                C04220Ms.A0B(th, 0);
                th.getMessage();
                return;
            case 3:
                C04220Ms.A0B(th, 0);
                boolean z = th instanceof CancellationException;
                C127917hw r0 = (C127917hw) this.A01;
                if (z) {
                    AnonymousClass7EY r4 = r0.A02;
                    r4.A03.execute(new C1358980o(r4, r4.A01.currentMonotonicTimestampNanos()));
                } else {
                    r0.A02(th);
                }
                ((C145278kE) this.A00).BvG(th);
                return;
            case 4:
                C04220Ms.A0B(th, 0);
                boolean z2 = th instanceof CancellationException;
                C127917hw r02 = (C127917hw) this.A00;
                if (z2) {
                    AnonymousClass7EY r42 = r02.A02;
                    r42.A03.execute(new C1358980o(r42, r42.A01.currentMonotonicTimestampNanos()));
                } else {
                    r02.A02(th);
                }
                ((C145288kF) this.A01).CBz(th);
                return;
            case 5:
                C18240wQ.A1G(this.A00);
                return;
            case 6:
                ((C129017kq) this.A01).A01(AnonymousClass7EC.A01((Throwable) C103226Yh.A00.apply(th)));
                return;
            case 7:
                break;
            case 8:
                C04220Ms.A0B(th, 0);
                break;
            case 9:
                C108396iI r43 = (C108396iI) this.A00;
                C113146qp r3 = r43.A01;
                r3.A08.CrC(AnonymousClass1jB.A01());
                C121967Iz.A04(r3.A05, r43.A00, 97);
                r3.A00 = false;
                return;
            default:
                PapayaExecutionJobService.A00((JobParameters) this.A01, (PapayaExecutionJobService) this.A00, th);
                return;
        }
        C86134wK.A1L(this.A00, th);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0450, code lost:
        if (r2.getTreeValue("xfb_create_iab_link_history(data:$data)", com.instagram.graphql.instagramschemagraphservices.XFBCreateIabLinkHistoryResponseImpl.XfbCreateIabLinkHistory.class) == null) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0452, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r30) {
        /*
            r29 = this;
            r10 = r29
            r7 = r30
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x0213;
                case 1: goto L_0x02b2;
                case 2: goto L_0x0333;
                case 3: goto L_0x0340;
                case 4: goto L_0x0358;
                case 5: goto L_0x0369;
                case 6: goto L_0x03ee;
                case 7: goto L_0x0413;
                case 8: goto L_0x0439;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.8gY r7 = (X.C143338gY) r7
            if (r7 == 0) goto L_0x01f3
            r0 = r7
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            java.lang.Object r4 = r0.A01
            if (r4 == 0) goto L_0x01f3
            java.lang.Object r2 = r10.A00
            X.6iI r2 = (X.C108396iI) r2
            java.lang.Integer r1 = r7.Aju()
            java.lang.Integer r0 = X.AnonymousClass006.A00
            boolean r0 = X.C18240wQ.A1Y(r1, r0)
            X.6qp r1 = r2.A01
            com.instagram.service.session.UserSession r9 = r1.A05
            int r8 = r2.A00
            if (r0 == 0) goto L_0x01ef
            java.lang.String r3 = "fetch_success_from_cache"
        L_0x002c:
            r7 = 0
            X.C04220Ms.A0B(r9, r7)
            X.01V r2 = X.AnonymousClass01V.A0p
            r0 = 383656871(0x16de23a7, float:3.5888534E-25)
            r2.markerPoint((int) r0, (int) r8, (java.lang.String) r3)
            com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl r4 = (com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl) r4
            if (r4 == 0) goto L_0x020e
            java.lang.Object r0 = r10.A01
            X.22C r0 = (X.AnonymousClass22C) r0
            X.6tz r0 = X.C102536Vo.A00(r4, r0)
            X.4wE r2 = r1.A06
            r2.CrC(r0)
            java.lang.Integer r11 = X.AnonymousClass006.A01
            X.69O r2 = X.AnonymousClass69O.A0C
            boolean r14 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A0D
            boolean r15 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A0B
            boolean r16 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A01
            boolean r17 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A0H
            boolean r18 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A08
            boolean r19 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A0A
            boolean r20 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A09
            boolean r21 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A03
            boolean r22 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A04
            boolean r23 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A02
            boolean r24 = X.AnonymousClass6RG.A00(r0, r2)
            boolean r25 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A05
            boolean r26 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A0J
            boolean r27 = X.AnonymousClass6RG.A00(r0, r2)
            X.69O r2 = X.AnonymousClass69O.A07
            boolean r28 = X.AnonymousClass6RG.A00(r0, r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            java.util.Map r2 = r0.A00
            X.69O r0 = X.AnonymousClass69O.A0I
            java.lang.Object r2 = r2.get(r0)
            X.6ty r2 = (X.C114836ty) r2
            r13 = 0
            if (r2 == 0) goto L_0x00c9
            java.util.List r6 = r2.A01
            boolean r3 = r6 instanceof java.util.Collection
            if (r3 == 0) goto L_0x01c7
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01c7
        L_0x00c0:
            if (r3 == 0) goto L_0x00de
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00de
        L_0x00c8:
            r13 = r12
        L_0x00c9:
            X.CKX r10 = new X.CKX
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.4wE r2 = r1.A08
            X.1jA r0 = X.AnonymousClass1jA.A00(r10)
            r2.CrC(r0)
            r0 = 2
            X.C121967Iz.A04(r9, r8, r0)
        L_0x00db:
            r1.A00 = r7
            return
        L_0x00de:
            java.util.Iterator r5 = r6.iterator()
        L_0x00e2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r5.next()
            X.6un r0 = (X.C115276un) r0
            X.22C r4 = r0.A00
            X.22C r3 = X.AnonymousClass22C.IG
            if (r4 != r3) goto L_0x00e2
            java.util.List r4 = r0.A04
            X.22D r3 = X.AnonymousClass22D.REELS
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x00e2
            X.680 r0 = r0.A01
            X.680 r4 = X.AnonymousClass680.ALLOW
            if (r0 != r4) goto L_0x00e2
            java.util.List r6 = r2.A00
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01a1
        L_0x0110:
            java.util.Iterator r10 = r6.iterator()
        L_0x0114:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x019f
            java.lang.Object r0 = r10.next()
            r2 = r0
            X.6un r2 = (X.C115276un) r2
            X.22C r6 = r2.A00
            X.22C r5 = X.AnonymousClass22C.FB
            if (r6 != r5) goto L_0x0114
            java.util.List r5 = r2.A04
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L_0x0114
            X.680 r2 = r2.A01
            if (r2 != r4) goto L_0x0114
        L_0x0133:
            X.6un r0 = (X.C115276un) r0
            if (r0 == 0) goto L_0x00c8
            java.util.List r0 = r0.A02
            java.util.Iterator r4 = r0.iterator()
        L_0x013d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r0 = r4.next()
            r2 = r0
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r3 = X.C18220wO.A0l(r2)
            java.lang.String r2 = "ReelVideoLengthRule"
            boolean r2 = X.C04220Ms.A0I(r3, r2)
            if (r2 == 0) goto L_0x013d
        L_0x0156:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x00c9
            java.lang.Class<com.facebook.graphql.impls.NativeFeatureImpl$ChildNativeFeatureConfigs$AdditionalEligibilityRules$Settings> r3 = com.facebook.graphql.impls.NativeFeatureImpl.ChildNativeFeatureConfigs.AdditionalEligibilityRules.Settings.class
            java.lang.String r2 = "settings"
            com.google.common.collect.ImmutableList r0 = r0.getTreeList(r2, r3)
            if (r0 == 0) goto L_0x00c9
            java.util.Iterator r4 = r0.iterator()
        L_0x0168:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r4.next()
            r2 = r0
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r3 = X.C18220wO.A0l(r2)
            java.lang.String r2 = "VIDEO_MAX_LENGTH_IN_MS"
            boolean r2 = X.C04220Ms.A0I(r3, r2)
            if (r2 == 0) goto L_0x0168
        L_0x0181:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x00c9
            java.lang.String r2 = "values"
            com.google.common.collect.ImmutableList r0 = r0.getStringList(r2)
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = X.AnonymousClass00J.A0D(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00c9
            java.lang.Integer r13 = X.C86124wJ.A0h(r0)
            goto L_0x00c9
        L_0x019b:
            r0 = r13
            goto L_0x0181
        L_0x019d:
            r0 = r13
            goto L_0x0156
        L_0x019f:
            r0 = r13
            goto L_0x0133
        L_0x01a1:
            java.util.Iterator r10 = r6.iterator()
        L_0x01a5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r0 = r10.next()
            X.6un r0 = (X.C115276un) r0
            X.22C r5 = r0.A00
            X.22C r2 = X.AnonymousClass22C.FB
            if (r5 != r2) goto L_0x01a5
            java.util.List r2 = r0.A04
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x01a5
            X.680 r2 = r0.A01
            X.680 r0 = X.AnonymousClass680.IGNORE
            if (r2 != r0) goto L_0x01a5
            goto L_0x00c9
        L_0x01c7:
            java.util.Iterator r10 = r6.iterator()
        L_0x01cb:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r10.next()
            X.6un r0 = (X.C115276un) r0
            X.22C r5 = r0.A00
            X.22C r4 = X.AnonymousClass22C.IG
            if (r5 != r4) goto L_0x01cb
            java.util.List r5 = r0.A04
            X.22D r4 = X.AnonymousClass22D.REELS
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x01cb
            X.680 r4 = r0.A01
            X.680 r0 = X.AnonymousClass680.IGNORE
            if (r4 != r0) goto L_0x01cb
            goto L_0x00c9
        L_0x01ef:
            java.lang.String r3 = "fetch_success"
            goto L_0x002c
        L_0x01f3:
            java.lang.Object r4 = r10.A00
            X.6iI r4 = (X.C108396iI) r4
            X.6qp r1 = r4.A01
            X.4wE r2 = r1.A08
            X.1jB r0 = X.AnonymousClass1jB.A01()
            r2.CrC(r0)
            com.instagram.service.session.UserSession r3 = r1.A05
            int r2 = r4.A00
            r0 = 97
            X.C121967Iz.A04(r3, r2, r0)
            r7 = 0
            goto L_0x00db
        L_0x020e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0213:
            X.8gY r7 = (X.C143338gY) r7
            if (r7 == 0) goto L_0x02a1
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r7)
            if (r2 == 0) goto L_0x02a1
            java.lang.Class<com.facebook.graphql.impls.ArEffectsFlmCapabilityQueryResponseImpl$FetchArEffects> r1 = com.facebook.graphql.impls.ArEffectsFlmCapabilityQueryResponseImpl.FetchArEffects.class
            java.lang.String r0 = "fetch_ar_effects(effect_ids:$effect_ids)"
            com.google.common.collect.ImmutableList r7 = r2.getTreeList(r0, r1)
        L_0x0225:
            java.lang.String r5 = "ArDelivery"
            if (r7 != 0) goto L_0x0237
            java.lang.Object r0 = r10.A01
            X.6qF r0 = (X.C112816qF) r0
            X.0IB r2 = r0.A02
            java.lang.Integer r1 = X.AnonymousClass006.A00
            java.lang.String r0 = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects is null."
        L_0x0233:
            r2.Ccz(r5, r1, r0)
            return
        L_0x0237:
            int r2 = r7.size()
            java.lang.Object r1 = r10.A00
            java.util.Set r1 = (java.util.Set) r1
            int r0 = r1.size()
            if (r2 == r0) goto L_0x0260
            java.lang.Object r0 = r10.A01
            X.6qF r0 = (X.C112816qF) r0
            X.0IB r6 = r0.A02
            java.lang.Integer r4 = X.AnonymousClass006.A00
            java.lang.String r3 = "# of effects in request = "
            int r2 = r1.size()
            java.lang.String r1 = " is different from response's fetchArEffects.size = "
            int r0 = r7.size()
            java.lang.String r0 = X.AnonymousClass00U.A01(r2, r0, r3, r1)
            r6.Ccz(r5, r4, r0)
        L_0x0260:
            java.lang.Object r4 = r10.A01
            X.6qF r4 = (X.C112816qF) r4
            java.util.Iterator r3 = r7.iterator()
        L_0x0268:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a3
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            java.lang.Class<com.facebook.graphql.impls.ArEffectsFlmCapabilityQueryResponseImpl$FetchArEffects$Effect> r1 = com.facebook.graphql.impls.ArEffectsFlmCapabilityQueryResponseImpl.FetchArEffects.Effect.class
            java.lang.String r0 = "effect"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 != 0) goto L_0x0283
            X.0IB r2 = r4.A02
            java.lang.Integer r1 = X.AnonymousClass006.A00
            java.lang.String r0 = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects.Effect is null."
            goto L_0x0233
        L_0x0283:
            java.lang.String r1 = X.C18220wO.A0m(r2)
            if (r1 != 0) goto L_0x0290
            X.0IB r2 = r4.A02
            java.lang.Integer r1 = X.AnonymousClass006.A00
            java.lang.String r0 = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects.Effect has no id."
            goto L_0x0233
        L_0x0290:
            java.lang.String r0 = "uses_flm_capability"
            r2.getBooleanValue(r0)
            boolean r0 = r2.getBooleanValue(r0)
            if (r0 == 0) goto L_0x0268
            com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache r0 = r4.A00
            r0.remove(r1)
            goto L_0x0268
        L_0x02a1:
            r7 = 0
            goto L_0x0225
        L_0x02a3:
            X.7tR r0 = r4.A01
            r2 = 1
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "flmEffectsDeleted"
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            return
        L_0x02b2:
            X.8mE r7 = (X.C146428mE) r7
            java.lang.Object r3 = r10.A00
            com.facebook.papaya.fb.instagram.PapayaExecutionJobService r3 = (com.facebook.papaya.fb.instagram.PapayaExecutionJobService) r3
            if (r7 != 0) goto L_0x02c8
            java.lang.Object r1 = r10.A01
            android.app.job.JobParameters r1 = (android.app.job.JobParameters) r1
            java.lang.String r0 = "papaya is null"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            com.facebook.papaya.fb.instagram.PapayaExecutionJobService.A00(r1, r3, r0)
            return
        L_0x02c8:
            java.lang.Object r6 = r10.A01
            android.app.job.JobParameters r6 = (android.app.job.JobParameters) r6
            monitor-enter(r3)
            int r9 = r6.getJobId()     // Catch:{ all -> 0x0330 }
            r1 = 771751936(0x2e000000, float:2.910383E-11)
            r0 = r9 & r1
            if (r1 != r0) goto L_0x031f
            X.77P r8 = new X.77P     // Catch:{ all -> 0x0330 }
            r8.<init>()     // Catch:{ all -> 0x0330 }
            X.68u r2 = X.C972968u.DEVICE_IDLE_REQUIRED     // Catch:{ all -> 0x0330 }
            r1 = 1
            r0 = r9 & 1
            if (r1 == r0) goto L_0x02e4
            r1 = 0
        L_0x02e4:
            r4 = 1
            if (r1 == 0) goto L_0x02eb
            r0 = 1
            goto L_0x02ed
        L_0x02eb:
            r0 = 0
        L_0x02ed:
            r8.A01(r2, r0)     // Catch:{ all -> 0x0330 }
            X.68u r2 = X.C972968u.EXTERNAL_POWER_REQUIRED     // Catch:{ all -> 0x0330 }
            r1 = 2
            r0 = r9 & 2
            if (r1 != r0) goto L_0x02fa
            r0 = 1
            goto L_0x02fc
        L_0x02fa:
            r0 = 0
        L_0x02fc:
            r8.A01(r2, r0)     // Catch:{ all -> 0x0330 }
            X.68u r2 = X.C972968u.WIFI_REQUIRED     // Catch:{ all -> 0x0330 }
            r1 = 4
            r0 = r9 & 4
            if (r1 == r0) goto L_0x0308
            r4 = 0
        L_0x0308:
            com.facebook.papaya.client.type.PapayaRestrictions r0 = X.AnonymousClass77P.A00(r2, r8, r4)     // Catch:{ all -> 0x0330 }
            r3.A00 = r7     // Catch:{ all -> 0x0330 }
            com.google.common.util.concurrent.ListenableFuture r2 = r7.CfM(r0)     // Catch:{ all -> 0x0330 }
            r0 = 2
            com.facebook.redex.IDxFCallbackShape114S0200000_2_I2 r1 = new com.facebook.redex.IDxFCallbackShape114S0200000_2_I2     // Catch:{ all -> 0x0330 }
            r1.<init>(r0, r6, r3)     // Catch:{ all -> 0x0330 }
            X.6Ba r0 = X.C97356Ba.A01     // Catch:{ all -> 0x0330 }
            X.C30954Gc6.A03(r1, r2, r0)     // Catch:{ all -> 0x0330 }
            monitor-exit(r3)
            return
        L_0x031f:
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0330 }
            java.lang.Object[] r1 = X.C18210wN.A1X(r9)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "0x%4x doesn't have a valid base mask!"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ all -> 0x0330 }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x0330 }
            throw r0     // Catch:{ all -> 0x0330 }
        L_0x0330:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0333:
            r2 = 0
            java.lang.Object r1 = r10.A00
            com.facebook.papaya.fb.instagram.PapayaExecutionJobService r1 = (com.facebook.papaya.fb.instagram.PapayaExecutionJobService) r1
            java.lang.Object r0 = r10.A01
            android.app.job.JobParameters r0 = (android.app.job.JobParameters) r0
            com.facebook.papaya.fb.instagram.PapayaExecutionJobService.A00(r0, r1, r2)
            return
        L_0x0340:
            X.JK2 r7 = (X.JK2) r7
            java.lang.Object r3 = r10.A00
            X.8kE r3 = (X.C145278kE) r3
            if (r7 != 0) goto L_0x0354
            java.lang.String r2 = "Keyframes drawable is null"
            r1 = 0
            X.6Bn r0 = new X.6Bn
            r0.<init>(r2, r1)
            r3.BvG(r0)
            return
        L_0x0354:
            r3.BvF(r7)
            return
        L_0x0358:
            java.lang.Object r0 = r10.A00
            X.7hw r0 = (X.C127917hw) r0
            X.7EY r0 = r0.A02
            r0.A02()
            java.lang.Object r0 = r10.A01
            X.8kF r0 = (X.C145288kF) r0
            r0.CC0()
            return
        L_0x0369:
            X.8gY r7 = (X.C143338gY) r7
            if (r7 == 0) goto L_0x03ec
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r7)
            if (r2 == 0) goto L_0x03ec
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.class
            r0 = 1503(0x5df, float:2.106E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x03ec
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.class
            r0 = 365(0x16d, float:5.11E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x03ec
            r0 = 1373(0x55d, float:1.924E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            int r0 = r1.getIntValue(r0)
        L_0x0399:
            long r1 = (long) r0
            X.68s r0 = X.C972768s.SECONDS
            long r6 = X.AnonymousClass728.A01(r0, r1)
            X.68s r3 = X.C972768s.DAYS
            long r1 = X.C134797yO.A00
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03b8
            r4 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
        L_0x03aa:
            double r1 = java.lang.Math.ceil(r4)
            int r0 = (int) r1
            java.lang.Object r3 = r10.A01
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0435
        L_0x03b8:
            long r1 = X.C134797yO.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03c1
            r4 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            goto L_0x03aa
        L_0x03c1:
            r2 = 1
            long r0 = r6 >> r2
            double r4 = (double) r0
            int r0 = (int) r6
            r0 = r0 & 1
            if (r0 != 0) goto L_0x03e2
            X.68s r0 = X.C972768s.NANOSECONDS
        L_0x03cc:
            X.C04220Ms.A0B(r0, r2)
            java.util.concurrent.TimeUnit r11 = r3.A00
            java.util.concurrent.TimeUnit r1 = r0.A00
            r6 = 1
            long r2 = r11.convert(r6, r1)
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e5
            double r0 = (double) r2
            double r4 = r4 * r0
            goto L_0x03aa
        L_0x03e2:
            X.68s r0 = X.C972768s.MILLISECONDS
            goto L_0x03cc
        L_0x03e5:
            long r2 = r1.convert(r6, r11)
            double r0 = (double) r2
            double r4 = r4 / r0
            goto L_0x03aa
        L_0x03ec:
            r0 = 0
            goto L_0x0399
        L_0x03ee:
            X.8gY r7 = (X.C143338gY) r7
            if (r7 == 0) goto L_0x040a
            X.5z0 r7 = (X.AnonymousClass5z0) r7
            java.lang.Object r2 = r7.A01
            if (r2 == 0) goto L_0x040a
            java.lang.Object r1 = r10.A01
            X.7kq r1 = (X.C129017kq) r1
            X.McB r0 = X.AnonymousClass6aS.A02
            java.lang.Object r0 = r0.apply(r2)
            X.7EC r0 = X.AnonymousClass7EC.A00(r0)
            r1.A01(r0)
            return
        L_0x040a:
            X.88H r0 = new X.88H
            r0.<init>()
            r10.onFailure(r0)
            return
        L_0x0413:
            X.8gY r7 = (X.C143338gY) r7
            java.lang.Object r3 = r10.A01
            X.0YY r3 = (X.AnonymousClass0YY) r3
            if (r7 == 0) goto L_0x0452
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r7)
            if (r2 == 0) goto L_0x0452
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.DeleteAllResponseImpl$XigDeleteAllFromUserIdIabLinkHistoryIg> r1 = com.instagram.graphql.instagramschemagraphservices.DeleteAllResponseImpl.XigDeleteAllFromUserIdIabLinkHistoryIg.class
            java.lang.String r0 = "xig_delete_all_from_user_id_iab_link_history_ig(data:$data)"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0452
            java.lang.String r0 = "is_success"
            boolean r1 = r1.getBooleanValue(r0)
        L_0x0431:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L_0x0435:
            r3.invoke(r0)
            return
        L_0x0439:
            X.8gY r7 = (X.C143338gY) r7
            java.lang.Object r3 = r10.A01
            X.0YY r3 = (X.AnonymousClass0YY) r3
            if (r7 == 0) goto L_0x0452
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r7)
            if (r2 == 0) goto L_0x0452
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.XFBCreateIabLinkHistoryResponseImpl$XfbCreateIabLinkHistory> r1 = com.instagram.graphql.instagramschemagraphservices.XFBCreateIabLinkHistoryResponseImpl.XfbCreateIabLinkHistory.class
            java.lang.String r0 = "xfb_create_iab_link_history(data:$data)"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x0431
        L_0x0452:
            r1 = 0
            goto L_0x0431
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCallbackShape114S0200000_2_I2.onSuccess(java.lang.Object):void");
    }
}
