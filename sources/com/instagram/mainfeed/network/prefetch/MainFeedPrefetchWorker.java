package com.instagram.mainfeed.network.prefetch;

import X.AnonymousClass0wJ;
import X.C25650DpW;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.instagram.service.session.UserSession;

public final class MainFeedPrefetchWorker extends CoroutineWorker {
    public UserSession A00;
    public C25650DpW A01;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (X.C18240wQ.A09(r2) > r12.toMillis(X.C63803iN.A07(r10, r13, 36600388446981607L).longValue())) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r8.A01 = null;
        r8.A02 = null;
        r8.A00 = 2;
        r7 = A01(r15, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0100, code lost:
        if (((X.C109426jz) ((X.AnonymousClass1jA) r7).A00).A02.isEmpty() == true) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker r15, X.C146958n9 r16) {
        /*
            r3 = 47
            r4 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r4)
            if (r0 == 0) goto L_0x0031
            r8 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0018:
            java.lang.Object r7 = r8.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r11 = 3
            r9 = 2
            java.lang.String r14 = "userSession"
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0037
            if (r0 == r5) goto L_0x0083
            if (r0 == r9) goto L_0x0127
            if (r0 == r11) goto L_0x0127
            java.lang.IllegalStateException r4 = X.AnonymousClass0wJ.A0a()
            throw r4
        L_0x0031:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r8.<init>(r15, r4, r3)
            goto L_0x0018
        L_0x0037:
            X.AnonymousClass0OU.A00(r7)
            com.instagram.service.session.UserSession r0 = r15.A00
            if (r0 == 0) goto L_0x0072
            X.L30 r3 = X.C121757Hz.A03(r0)
            r8.A01 = r15
            r8.A02 = r3
            r8.A00 = r5
            X.EnC r2 = X.C18220wO.A11(r8)
            X.7w7 r1 = new X.7w7
            r1.<init>(r2)
            r0 = r3
            com.instagram.mainfeed.network.FeedCacheCoordinator r0 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r0
            r0.Cup(r1, r5)
            r1 = 13
            kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15 r0 = new kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15
            r0.<init>(r3, r1)
            r2.BQt(r0)
            java.lang.Object r7 = r2.A0B()
            if (r7 != r6) goto L_0x008a
            return r6
        L_0x0068:
            java.util.List r2 = X.AnonymousClass00J.A0K(r2)
            X.DpW r1 = r15.A01
            if (r1 != 0) goto L_0x0076
            java.lang.String r14 = "mediaPrefetchHelper"
        L_0x0072:
            X.C04220Ms.A0E(r14)
            throw r4
        L_0x0076:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r8.A01 = r4
            r8.A02 = r4
            r8.A00 = r11
            java.lang.Object r7 = r1.A02(r0, r2, r8, r5)
            goto L_0x00f0
        L_0x0083:
            java.lang.Object r15 = r8.A01
            com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker r15 = (com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker) r15
            X.AnonymousClass0OU.A00(r7)
        L_0x008a:
            X.3b6 r7 = (X.C62903b6) r7
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x012b
            com.instagram.service.session.UserSession r2 = r15.A00
            if (r2 == 0) goto L_0x0072
            X.0TJ r10 = X.AnonymousClass0TJ.A05
            r0 = 36318913469879096(0x8107dc00001338, double:3.0315653506531256E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r10, r2, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0103
            com.instagram.service.session.UserSession r2 = r15.A00
            if (r2 == 0) goto L_0x0072
            r0 = 36318913470337851(0x8107dc0007133b, double:3.031565350943244E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r10, r2, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00f3
            r0 = r7
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
            X.6jz r0 = (X.C109426jz) r0
            long r2 = r0.A00
            r12 = -1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MINUTES
            com.instagram.service.session.UserSession r13 = r15.A00
            if (r13 == 0) goto L_0x0072
            r0 = 36600388446981607(0x8207dc00060de7, double:3.2095712595815124E-306)
            java.lang.Long r0 = X.C63803iN.A07(r10, r13, r0)
            long r0 = r0.longValue()
            long r12 = r12.toMillis(r0)
            long r1 = X.C18240wQ.A09(r2)
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f3
        L_0x00e6:
            r8.A01 = r4
            r8.A02 = r4
            r8.A00 = r9
            java.lang.Object r7 = A01(r15, r8)
        L_0x00f0:
            if (r7 != r6) goto L_0x012a
            return r6
        L_0x00f3:
            r0 = r7
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
            X.6jz r0 = (X.C109426jz) r0
            java.util.List r0 = r0.A02
            boolean r0 = r0.isEmpty()
            if (r0 != r5) goto L_0x0103
            goto L_0x00e6
        L_0x0103:
            X.1jA r7 = (X.AnonymousClass1jA) r7
            java.lang.Object r0 = r7.A00
            X.6jz r0 = (X.C109426jz) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0113:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r1.next()
            X.JrZ r0 = (X.C37415JrZ) r0
            X.BKU r0 = X.C86144wL.A0W(r0)
            r2.add(r0)
            goto L_0x0113
        L_0x0127:
            X.AnonymousClass0OU.A00(r7)
        L_0x012a:
            return r7
        L_0x012b:
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0135
            X.LCR r7 = new X.LCR
            r7.<init>()
            return r7
        L_0x0135:
            X.4VZ r4 = X.AnonymousClass4VZ.A00()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker.A00(com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker r10, X.C146958n9 r11) {
        /*
            r3 = 48
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r11)
            if (r0 == 0) goto L_0x00b3
            r6 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b3
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0029
            if (r0 == r4) goto L_0x0067
            if (r0 != r5) goto L_0x00ba
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            return r1
        L_0x0029:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r1 = r10.A00
            java.lang.String r0 = "userSession"
            if (r1 == 0) goto L_0x00a0
            X.0iL r9 = X.C08830eN.A00(r1)
            r6.A01 = r10
            r6.A02 = r9
            r6.A00 = r4
            X.EnC r8 = X.C18220wO.A11(r6)
            com.instagram.service.session.UserSession r2 = r10.A00
            if (r2 == 0) goto L_0x00a0
            android.content.Context r1 = r10.A00
            X.C04220Ms.A06(r1)
            X.0eO r0 = new X.0eO
            r0.<init>(r9)
            X.JiP r2 = X.C37326JpT.A02(r1, r0, r2)
            X.H8c r1 = r2.A00
            if (r1 == 0) goto L_0x0060
            X.IfL r0 = new X.IfL
            r0.<init>(r9, r2, r10, r8)
            r1.A00 = r0
            X.C31155GhB.A03(r1)
        L_0x0060:
            java.lang.Object r1 = r8.A0B()
            if (r1 != r7) goto L_0x006e
            return r7
        L_0x0067:
            java.lang.Object r10 = r6.A01
            com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker r10 = (com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker) r10
            X.AnonymousClass0OU.A00(r1)
        L_0x006e:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00bf
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0082:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r1.next()
            X.JrZ r0 = (X.C37415JrZ) r0
            X.BKU r0 = X.C86144wL.A0W(r0)
            r2.add(r0)
            goto L_0x0082
        L_0x0096:
            java.util.List r2 = X.AnonymousClass00J.A0K(r2)
            X.DpW r1 = r10.A01
            if (r1 != 0) goto L_0x00a4
            java.lang.String r0 = "mediaPrefetchHelper"
        L_0x00a0:
            X.C04220Ms.A0E(r0)
            throw r3
        L_0x00a4:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r6.A01 = r3
            r6.A02 = r3
            r6.A00 = r5
            java.lang.Object r1 = r1.A02(r0, r2, r6, r4)
            if (r1 != r7) goto L_0x0028
            return r7
        L_0x00b3:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r6.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x00ba:
            java.lang.IllegalStateException r3 = X.AnonymousClass0wJ.A0a()
            throw r3
        L_0x00bf:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00c9
            X.LCR r1 = new X.LCR
            r1.<init>()
            return r1
        L_0x00c9:
            X.4VZ r3 = X.AnonymousClass4VZ.A00()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker.A01(com.instagram.mainfeed.network.prefetch.MainFeedPrefetchWorker, X.8n9):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainFeedPrefetchWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass0wJ.A1O(context, workerParameters);
    }
}
