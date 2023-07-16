package androidx.work;

import X.AnonymousClass0wJ;
import X.AnonymousClass7Ja;
import X.AnonymousClass7o3;
import X.C135137yw;
import X.C146958n9;
import X.C148838sG;
import X.C18180wK;
import X.C25235DiG;
import X.C25237DiI;
import X.C25295DjG;
import X.C27219EgD;
import X.C27437EnT;
import X.C27952Ew2;
import X.C39984LCx;
import X.C40995Lth;
import X.C83224qz;
import X.C86164wN;
import X.MBH;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

public abstract class CoroutineWorker extends C40995Lth {
    public final C39984LCx A00;
    public final C27219EgD A01;
    public final C27437EnT A02 = new C27437EnT((C148838sG) null);

    public final ListenableFuture A02() {
        C27437EnT enT = new C27437EnT((C148838sG) null);
        C83224qz A03 = AnonymousClass7Ja.A03(C25235DiG.A01(this.A01, enT));
        AnonymousClass7o3 r2 = new AnonymousClass7o3(enT);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0p(this, r2, (C146958n9) null, 40), A03, 3);
        return r2;
    }

    public final ListenableFuture A03() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 24), AnonymousClass7Ja.A03(C25235DiG.A01(this.A01, this.A02)), 3);
        return this.A00;
    }

    public final void A04() {
        this.A00.cancel(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ce, code lost:
        if (((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r2).A01 == false) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a2, code lost:
        if (X.C25643DpN.A00(r0).A01("stories") != false) goto L_0x0318;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A05(X.C146958n9 r17) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1 instanceof com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker
            r4 = r17
            if (r0 == 0) goto L_0x0099
            r3 = r1
            com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker r3 = (com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker) r3
            r5 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401100_I2.A00(r5, r4)
            if (r0 == 0) goto L_0x0093
            r11 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401100_I2 r11 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401100_I2) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0093
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0020:
            java.lang.Object r4 = r11.A04
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r11.A00
            r13 = 1
            if (r1 == 0) goto L_0x0050
            if (r1 != r13) goto L_0x0339
            long r1 = r11.A01
            java.lang.Object r8 = r11.A03
            X.0A1 r8 = (X.AnonymousClass0A1) r8
            java.lang.Object r3 = r11.A02
            X.Lth r3 = (X.C40995Lth) r3
            X.AnonymousClass0OU.A00(r4)
        L_0x0038:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r4
            r8.Bb4()
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00d0
            androidx.work.WorkerParameters r0 = r3.A01
            int r0 = r0.A00
            long r3 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0318
            X.LCQ r0 = new X.LCQ
            r0.<init>()
        L_0x004f:
            return r0
        L_0x0050:
            X.AnonymousClass0OU.A00(r4)
            r5 = 0
            com.instagram.service.session.UserSession r1 = X.C18230wP.A0Z()     // Catch:{ IllegalStateException -> 0x0343 }
            com.instagram.service.session.UserSession r9 = X.C05030Qo.A02(r1)     // Catch:{ IllegalStateException -> 0x0343 }
            X.0ik r1 = new X.0ik
            r1.<init>(r9)
            X.0nS r2 = r1.A00()
            java.lang.String r1 = "ig_attest_playintegrity_background"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 799(0x31f, float:1.12E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r8 = X.C18180wK.A0I(r2, r1)
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 2342167407357075942(0x20810cd9000421e6, double:4.069315132741276E-152)
            boolean r7 = X.C63803iN.A0E(r4, r9, r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            X.0TJ r4 = X.AnonymousClass0TJ.A06
            r1 = 36605873120285160(0x820cd9000711e8, double:3.213039789063686E-306)
            long r1 = X.C63803iN.A03(r4, r9, r1)
            boolean r4 = X.C691847d.A05()
            if (r7 == 0) goto L_0x031e
            goto L_0x0305
        L_0x0093:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401100_I2 r11 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401100_I2
            r11.<init>(r3, r4, r5)
            goto L_0x0020
        L_0x0099:
            boolean r0 = r1 instanceof com.instagram.security.attestation.keystore.worker.KeyAttestationWorker
            if (r0 == 0) goto L_0x0138
            r5 = r1
            com.instagram.security.attestation.keystore.worker.KeyAttestationWorker r5 = (com.instagram.security.attestation.keystore.worker.KeyAttestationWorker) r5
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r3, r4)
            if (r0 == 0) goto L_0x0131
            r12 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r12 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0131
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x00b5:
            java.lang.Object r2 = r12.A02
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r12.A00
            r14 = 1
            if (r1 == 0) goto L_0x00d6
            if (r1 != r14) goto L_0x033e
            java.lang.Object r8 = r12.A01
            X.0A1 r8 = (X.AnonymousClass0A1) r8
            X.AnonymousClass0OU.A00(r2)
        L_0x00c7:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r2
            r8.Bb4()
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0318
        L_0x00d0:
            X.LCS r0 = new X.LCS
            r0.<init>()
            return r0
        L_0x00d6:
            X.AnonymousClass0OU.A00(r2)
            r4 = 0
            com.instagram.service.session.UserSession r1 = X.C18230wP.A0Z()     // Catch:{ IllegalStateException -> 0x0343 }
            com.instagram.service.session.UserSession r9 = X.C05030Qo.A02(r1)     // Catch:{ IllegalStateException -> 0x0343 }
            X.0ik r1 = new X.0ik
            r1.<init>(r9)
            X.0nS r2 = r1.A00()
            java.lang.String r1 = "ig_attest_keystore_background"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 798(0x31e, float:1.118E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r8 = X.C18180wK.A0I(r2, r1)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 2342166685802569721(0x20810c3100041ff9, double:4.0687033157277515E-152)
            boolean r3 = X.C63803iN.A0E(r3, r9, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            boolean r1 = X.C691847d.A05()
            if (r3 == 0) goto L_0x0119
            if (r1 != 0) goto L_0x0119
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            X.C86144wL.A1G(r8, r0, r4)
            X.6BG r1 = X.AnonymousClass6BG.APP_NOT_BACKGROUNDED
            goto L_0x0310
        L_0x0119:
            X.C86144wL.A1G(r8, r2, r1)
            android.content.Context r7 = r5.A00
            X.C04220Ms.A06(r7)
            X.0gQ r13 = r5.A00
            r10 = 0
            r12.A01 = r8
            r12.A00 = r14
            java.lang.String r11 = "AndroidKeyAttestationWorker"
            java.lang.Object r2 = com.instagram.security.attestation.keystore.worker.KeyAttestationUtils.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r2 != r0) goto L_0x00c7
            return r0
        L_0x0131:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r12 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r12.<init>(r5, r4, r3)
            goto L_0x00b5
        L_0x0138:
            boolean r0 = r1 instanceof com.instagram.mainfeed.network.prefetch.StoryPrefetchWorker
            if (r0 == 0) goto L_0x02a7
            r2 = r1
            com.instagram.mainfeed.network.prefetch.StoryPrefetchWorker r2 = (com.instagram.mainfeed.network.prefetch.StoryPrefetchWorker) r2
            r6 = 17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r6, r4)
            if (r0 == 0) goto L_0x0168
            r5 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0168
            int r3 = r3 - r1
            r5.A00 = r3
        L_0x0155:
            java.lang.Object r0 = r5.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            r3 = 2
            r14 = 1
            r9 = 0
            if (r1 == 0) goto L_0x016e
            if (r1 == r14) goto L_0x01f0
            if (r1 != r3) goto L_0x0349
            X.AnonymousClass0OU.A00(r0)
            return r0
        L_0x0168:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r5.<init>(r2, r4, r6)
            goto L_0x0155
        L_0x016e:
            X.AnonymousClass0OU.A00(r0)
            boolean r0 = X.C691847d.A05()
            if (r0 == 0) goto L_0x0318
            X.0i6 r8 = X.C18200wM.A0W(r2)
            boolean r0 = r8 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0318
            com.instagram.service.session.UserSession r8 = (com.instagram.service.session.UserSession) r8
            r2.A01 = r8
            java.lang.String r7 = "userSession"
            if (r8 == 0) goto L_0x034e
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36320833320524044(0x81099b0004190c, double:3.032779471931609E-306)
            boolean r0 = X.C63803iN.A0E(r4, r8, r0)
            if (r0 == 0) goto L_0x01a6
            com.instagram.service.session.UserSession r0 = r2.A01
            if (r0 == 0) goto L_0x034e
            X.DpN r1 = X.C25643DpN.A00(r0)
            java.lang.String r0 = "stories"
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x01a6
            goto L_0x0318
        L_0x01a6:
            android.content.Context r4 = r2.A00
            X.C04220Ms.A06(r4)
            com.instagram.service.session.UserSession r1 = r2.A01
            if (r1 == 0) goto L_0x034e
            com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper r0 = new com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper
            r0.<init>(r4, r1)
            r2.A00 = r0
            r5.A01 = r2
            r5.A00 = r14
            X.EnC r4 = X.C18220wO.A11(r5)
            X.AyF r8 = X.C19554AyF.A02()
            com.instagram.service.session.UserSession r10 = r2.A01
            if (r10 == 0) goto L_0x034e
            java.lang.Integer r11 = X.AnonymousClass006.A01
            java.lang.Integer r12 = X.AnonymousClass006.A0C
            r15 = 0
            r13 = r9
            X.DnE r8 = r8.A07(r9, r10, r11, r12, r13, r14, r15)
            X.H8c r7 = r8.A00
            if (r7 == 0) goto L_0x01e9
            r1 = 5
            com.instagram.common.api.base.IDxACallbackShape18S0300000_4_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape18S0300000_4_I2
            r0.<init>(r1, r4, r8, r2)
            r7.A00 = r0
            X.C31155GhB.A03(r7)
            r1 = 14
            kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15 r0 = new kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15
            r0.<init>(r8, r1)
            r4.BQt(r0)
        L_0x01e9:
            java.lang.Object r0 = r4.A0B()
            if (r0 != r6) goto L_0x01f7
            return r6
        L_0x01f0:
            java.lang.Object r2 = r5.A01
            com.instagram.mainfeed.network.prefetch.StoryPrefetchWorker r2 = (com.instagram.mainfeed.network.prefetch.StoryPrefetchWorker) r2
            X.AnonymousClass0OU.A00(r0)
        L_0x01f7:
            boolean r1 = r0 instanceof X.AnonymousClass1jA
            if (r1 == 0) goto L_0x029e
            com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper r8 = r2.A00
            if (r8 != 0) goto L_0x0205
            java.lang.String r0 = "storyBackgroundMediaPrefetchHelper"
            X.C04220Ms.A0E(r0)
            throw r9
        L_0x0205:
            r5.A01 = r9
            r5.A00 = r3
            com.instagram.service.session.UserSession r9 = r8.A01
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A02(r9)
            java.util.List r2 = r0.A0P(r14)
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            r7 = 0
            r1 = 0
        L_0x0219:
            int r3 = r10.size()
            int r0 = r8.A00
            if (r3 >= r0) goto L_0x0273
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0273
            java.lang.Object r0 = r2.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A1L
            if (r0 != 0) goto L_0x0270
            java.lang.Object r0 = r2.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A1V
            if (r0 != 0) goto L_0x0270
            java.lang.Object r0 = r2.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A0c()
            if (r0 != 0) goto L_0x0270
            java.lang.Object r0 = r2.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A0k()
            if (r0 != 0) goto L_0x0270
            java.lang.Object r0 = r2.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A0g()
            if (r0 != 0) goto L_0x0270
            java.lang.Object r0 = r2.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A1T
            if (r0 != 0) goto L_0x0270
            java.lang.Object r0 = r2.get(r1)
            r10.add(r0)
        L_0x0270:
            int r1 = r1 + 1
            goto L_0x0219
        L_0x0273:
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            int r2 = r10.size()
        L_0x027f:
            if (r7 >= r2) goto L_0x0297
            java.lang.Object r1 = r10.get(r7)
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1
            boolean r0 = r1.A0n(r9)
            if (r0 == 0) goto L_0x0293
            r4.add(r1)
        L_0x0290:
            int r7 = r7 + 1
            goto L_0x027f
        L_0x0293:
            r3.add(r1)
            goto L_0x0290
        L_0x0297:
            java.lang.Object r0 = com.instagram.mainfeed.network.prefetch.StoryBackgroundMediaPrefetchHelper.A00(r8, r3, r4, r5)
            if (r0 != r6) goto L_0x004f
            return r6
        L_0x029e:
            boolean r0 = r0 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0318
            X.4VZ r9 = X.AnonymousClass4VZ.A00()
            throw r9
        L_0x02a7:
            boolean r0 = r1 instanceof com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker
            if (r0 == 0) goto L_0x02df
            r5 = r1
            com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker r5 = (com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker) r5
            boolean r0 = X.C691847d.A05()
            if (r0 == 0) goto L_0x0318
            X.0i6 r6 = X.C18200wM.A0W(r5)
            boolean r0 = r6 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0318
            r3 = r6
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            r5.A00 = r3
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318913470862144(0x8107dc000f1340, double:3.031565351274809E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0352
            X.DpN r1 = X.C25643DpN.A00(r6)
            r0 = 422(0x1a6, float:5.91E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0352
            goto L_0x0318
        L_0x02df:
            com.instagram.service.session.UserSession r3 = X.C18230wP.A0Z()     // Catch:{ Exception -> 0x02fc }
            android.content.Context r0 = r1.A00     // Catch:{ Exception -> 0x02fc }
            X.3TI r2 = new X.3TI     // Catch:{ Exception -> 0x02fc }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02fc }
            X.C18200wM.A1R(r3)     // Catch:{ Exception -> 0x02fc }
            r1 = 1
            com.instagram.common.task.IDxLTaskShape48S0200000_1_I2 r0 = new com.instagram.common.task.IDxLTaskShape48S0200000_1_I2     // Catch:{ Exception -> 0x02fc }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x02fc }
            X.C31155GhB.A03(r0)     // Catch:{ Exception -> 0x02fc }
            X.LCS r0 = new X.LCS     // Catch:{ Exception -> 0x02fc }
            r0.<init>()     // Catch:{ Exception -> 0x02fc }
            goto L_0x0369
        L_0x02fc:
            r2 = move-exception
            java.lang.String r1 = "ConfidencePingWorker"
            java.lang.String r0 = "Exception upon do work"
            X.C10450iM.A06(r1, r0, r2)
            goto L_0x0318
        L_0x0305:
            if (r4 != 0) goto L_0x031e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            X.C86144wL.A1G(r8, r0, r5)
            X.6BD r1 = X.AnonymousClass6BD.APP_NOT_BACKGROUNDED
        L_0x0310:
            java.lang.String r0 = "error_type"
            r8.A0O(r1, r0)
            r8.Bb4()
        L_0x0318:
            X.LCR r0 = new X.LCR
            r0.<init>()
            return r0
        L_0x031e:
            X.C86144wL.A1G(r8, r6, r4)
            android.content.Context r7 = r3.A00
            X.C04220Ms.A06(r7)
            X.0gQ r12 = r3.A00
            r11.A02 = r3
            r11.A03 = r8
            r11.A01 = r1
            r11.A00 = r13
            java.lang.String r10 = "AndroidPlayIntegrityAttestationWorker"
            java.lang.Object r4 = com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationUtils.A00(r7, r8, r9, r10, r11, r12, r13)
            if (r4 != r0) goto L_0x0038
            return r0
        L_0x0339:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x033e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0343:
            X.LCR r0 = new X.LCR
            r0.<init>()
            return r0
        L_0x0349:
            java.lang.IllegalStateException r9 = X.AnonymousClass0wJ.A0a()
            throw r9
        L_0x034e:
            X.C04220Ms.A0E(r7)
            throw r9
        L_0x0352:
            android.content.Context r2 = r5.A00
            X.C04220Ms.A06(r2)
            r0 = 28
            java.lang.String r1 = X.I17.A00(r0)
            X.DpW r0 = new X.DpW
            r0.<init>(r2, r3, r1)
            r5.A01 = r0
            java.lang.Object r0 = com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker.A00(r5, r4)
            return r0
        L_0x0369:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.A05(X.8n9):java.lang.Object");
    }

    public Object A06(C146958n9 r2) {
        throw C18180wK.A0a("Not implemented");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass0wJ.A1O(context, workerParameters);
        C39984LCx lCx = new C39984LCx();
        this.A00 = lCx;
        lCx.addListener(new C135137yw(this), ((MBH) this.A01.A04).A01);
        this.A01 = C25295DjG.A00;
    }
}
