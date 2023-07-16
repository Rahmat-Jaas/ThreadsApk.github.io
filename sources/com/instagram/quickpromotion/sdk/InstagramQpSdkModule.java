package com.instagram.quickpromotion.sdk;

import X.AnonymousClass0OY;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass3YC;
import X.C04220Ms;
import X.C04530Oa;
import X.C10270i0;
import X.C10300i6;
import X.C61563Ua;
import X.C80074l7;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

public final class InstagramQpSdkModule implements C10270i0 {
    public static final Set A05;
    public static final AnonymousClass0YY A06 = C80074l7.A00;
    public final C61563Ua A00 = ((C61563Ua) C61563Ua.A03.getValue());
    public final AnonymousClass3YC A01;
    public final UserSession A02;
    public final C04530Oa A03;
    public final AnonymousClass0ZU A04;

    public final void Bks(C10300i6 r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        X.C10450iM.A00().CuY("InstagramQpSdkModule", "Error getting promotions on app foreground", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bku(X.C10300i6 r5) {
        /*
            r4 = this;
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            boolean r0 = r5 instanceof com.instagram.service.session.UserSession     // Catch:{ Exception -> 0x003c }
            if (r0 == 0) goto L_0x000b
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5     // Catch:{ Exception -> 0x003c }
            goto L_0x000c
        L_0x000b:
            r5 = 0
        L_0x000c:
            if (r5 == 0) goto L_0x0048
            X.0TJ r2 = X.AnonymousClass0TJ.A05     // Catch:{ Exception -> 0x003c }
            r0 = 2342156094413014321(0x2081028f00010531, double:4.059722715827136E-152)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)     // Catch:{ Exception -> 0x003c }
            if (r0 == 0) goto L_0x0048
            r0 = 36313085199648052(0x81028f00060534, double:3.027879529090453E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)     // Catch:{ Exception -> 0x003c }
            if (r0 == 0) goto L_0x002b
            java.lang.Integer r2 = X.AnonymousClass006.A00     // Catch:{ Exception -> 0x003c }
        L_0x0028:
            r1 = r4
            monitor-enter(r1)     // Catch:{ Exception -> 0x003c }
            goto L_0x002e
        L_0x002b:
            java.lang.Integer r2 = X.AnonymousClass006.A01     // Catch:{ Exception -> 0x003c }
            goto L_0x0028
        L_0x002e:
            r0 = 1
            X.C04220Ms.A0B(r2, r0)     // Catch:{ all -> 0x0039 }
            X.0Oa r0 = r4.A03     // Catch:{ all -> 0x0039 }
            r0.getValue()     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x003c }
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x003c }
            throw r0     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            r3 = move-exception
            X.0IB r2 = X.C10450iM.A00()
            java.lang.String r1 = "InstagramQpSdkModule"
            java.lang.String r0 = "Error getting promotions on app foreground"
            r2.CuY(r1, r0, r3)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.InstagramQpSdkModule.Bku(X.0i6):void");
    }

    static {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap(8));
        C04220Ms.A06(newSetFromMap);
        A05 = newSetFromMap;
    }

    public /* synthetic */ InstagramQpSdkModule(UserSession userSession) {
        KtLambdaShape95S0100000_I2_75 ktLambdaShape95S0100000_I2_75 = new KtLambdaShape95S0100000_I2_75(userSession, 13);
        AnonymousClass3YC r0 = AnonymousClass3YC.A03;
        this.A02 = userSession;
        this.A04 = ktLambdaShape95S0100000_I2_75;
        this.A01 = r0;
        this.A03 = AnonymousClass0OY.A02(new KtLambdaShape95S0100000_I2_75(this, 15));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[Catch:{ all -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015f A[Catch:{ all -> 0x0192 }, LOOP:0: B:45:0x0159->B:47:0x015f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r18, X.C84574tR r19, X.AnonymousClass3UU r20, X.C57213Ae r21, X.AnonymousClass3RD r22, com.instagram.quickpromotion.sdk.InstagramQpSdkModule r23, com.instagram.service.session.UserSession r24, java.util.Map r25, X.C146958n9 r26, X.C83224qz r27) {
        /*
            r7 = r26
            r1 = r24
            r11 = r18
            r10 = r20
            r2 = r21
            r26 = r22
            r3 = r19
            r4 = r27
            r9 = r23
            boolean r0 = r7 instanceof X.AnonymousClass4WU
            if (r0 == 0) goto L_0x0065
            r8 = r7
            X.4WU r8 = (X.AnonymousClass4WU) r8
            int r6 = r8.A00
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r5
            if (r0 == 0) goto L_0x0065
            int r6 = r6 - r5
            r8.A00 = r6
        L_0x0024:
            java.lang.Object r14 = r8.A0E
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r5 = r8.A00
            r0 = 1
            if (r5 == 0) goto L_0x0070
            if (r5 != r0) goto L_0x006b
            java.lang.Object r13 = r8.A05
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r6 = r8.A04
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r8.A03
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r0 = r8.A0D
            com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager r0 = (com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager) r0
            java.lang.Object r9 = r8.A0C
            com.instagram.quickpromotion.sdk.InstagramQpSdkModule r9 = (com.instagram.quickpromotion.sdk.InstagramQpSdkModule) r9
            java.lang.Object r4 = r8.A0B
            X.4qz r4 = (X.C83224qz) r4
            java.lang.Object r3 = r8.A0A
            X.4tR r3 = (X.C84574tR) r3
            java.lang.Object r1 = r8.A09
            r26 = r1
            java.lang.Object r2 = r8.A08
            X.3Ae r2 = (X.C57213Ae) r2
            java.lang.Object r10 = r8.A07
            X.3UU r10 = (X.AnonymousClass3UU) r10
            java.lang.Object r11 = r8.A06
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r1 = r8.A02
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r12 = r8.A01
            r25 = r12
            goto L_0x014c
        L_0x0065:
            X.4WU r8 = new X.4WU
            r8.<init>(r9, r7)
            goto L_0x0024
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0070:
            X.AnonymousClass0OU.A00(r14)
            monitor-enter(r9)     // Catch:{ all -> 0x0192 }
            r5 = 0
            X.C04220Ms.A0B(r1, r5)     // Catch:{ all -> 0x018f }
            X.0Oa r0 = r9.A03     // Catch:{ all -> 0x018f }
            java.lang.Object r14 = r0.getValue()     // Catch:{ all -> 0x018f }
            com.facebook.quickpromotion.sdk.QPSdkModule r14 = (com.facebook.quickpromotion.sdk.QPSdkModule) r14     // Catch:{ all -> 0x018f }
            java.lang.String r15 = r1.getUserId()     // Catch:{ all -> 0x018f }
            monitor-enter(r14)     // Catch:{ all -> 0x018f }
            X.C04220Ms.A0B(r15, r5)     // Catch:{ all -> 0x018c }
            java.util.Map r13 = r14.A03     // Catch:{ all -> 0x018c }
            java.lang.Object r0 = r13.get(r15)     // Catch:{ all -> 0x018c }
            com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager r0 = (com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager) r0     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x00a0
            com.google.common.collect.ImmutableSet r12 = r14.A01     // Catch:{ all -> 0x018c }
            X.3Bz r6 = r14.A00     // Catch:{ all -> 0x018c }
            X.3RE r5 = r14.A02     // Catch:{ all -> 0x018c }
            com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager r0 = new com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager     // Catch:{ all -> 0x018c }
            r0.<init>(r6, r12, r5, r15)     // Catch:{ all -> 0x018c }
            r13.put(r15, r0)     // Catch:{ all -> 0x018c }
        L_0x00a0:
            monitor-exit(r14)     // Catch:{ all -> 0x018f }
            monitor-exit(r9)     // Catch:{ all -> 0x0192 }
            java.lang.String r5 = "fetch_starts"
            r3.ANG(r5)     // Catch:{ all -> 0x0192 }
            java.util.ArrayList r5 = X.C18220wO.A0w(r25)     // Catch:{ all -> 0x0192 }
            java.util.Iterator r6 = X.AnonymousClass0wJ.A0z(r25)     // Catch:{ all -> 0x0192 }
            r25 = r9
        L_0x00b1:
            boolean r12 = r6.hasNext()     // Catch:{ all -> 0x0192 }
            if (r12 == 0) goto L_0x0176
            java.util.Map$Entry r12 = X.C18180wK.A0o(r6)     // Catch:{ all -> 0x0192 }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0192 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r13 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r13     // Catch:{ all -> 0x0192 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0192 }
            java.util.Set r12 = (java.util.Set) r12     // Catch:{ all -> 0x0192 }
            X.3Ua r14 = r9.A00     // Catch:{ all -> 0x0192 }
            int r13 = r13.A00     // Catch:{ all -> 0x0192 }
            java.lang.String r18 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0192 }
            r20 = 0
            r16 = r10
            r17 = r1
            r19 = r12
            r15 = r11
            X.1Pw r17 = r14.A00(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0192 }
            X.3YC r12 = r9.A01     // Catch:{ all -> 0x0192 }
            X.3TF r12 = r12.A00(r1)     // Catch:{ all -> 0x0192 }
            if (r12 == 0) goto L_0x0170
            X.0Oa r12 = r12.A04     // Catch:{ all -> 0x0192 }
            java.lang.Object r13 = r12.getValue()     // Catch:{ all -> 0x0192 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ all -> 0x0192 }
            if (r13 == 0) goto L_0x0170
        L_0x00ee:
            X.38s r16 = new X.38s     // Catch:{ all -> 0x0192 }
            r12 = r16
            r12.<init>(r10)     // Catch:{ all -> 0x0192 }
            X.32X r14 = new X.32X     // Catch:{ all -> 0x0192 }
            r14.<init>(r4)     // Catch:{ all -> 0x0192 }
            r12 = r25
            r8.A01 = r12     // Catch:{ all -> 0x0192 }
            r8.A02 = r1     // Catch:{ all -> 0x0192 }
            r8.A06 = r11     // Catch:{ all -> 0x0192 }
            r8.A07 = r10     // Catch:{ all -> 0x0192 }
            r8.A08 = r2     // Catch:{ all -> 0x0192 }
            r12 = r26
            r8.A09 = r12     // Catch:{ all -> 0x0192 }
            r8.A0A = r3     // Catch:{ all -> 0x0192 }
            r8.A0B = r4     // Catch:{ all -> 0x0192 }
            r8.A0C = r9     // Catch:{ all -> 0x0192 }
            r8.A0D = r0     // Catch:{ all -> 0x0192 }
            r8.A03 = r5     // Catch:{ all -> 0x0192 }
            r8.A04 = r6     // Catch:{ all -> 0x0192 }
            r8.A05 = r5     // Catch:{ all -> 0x0192 }
            r12 = 1
            r8.A00 = r12     // Catch:{ all -> 0x0192 }
            com.google.common.collect.ImmutableMap r15 = r0.A00     // Catch:{ all -> 0x0192 }
            r12 = r17
            java.lang.String r12 = r12.A0D     // Catch:{ all -> 0x0192 }
            java.lang.Object r15 = r15.get(r12)     // Catch:{ all -> 0x0192 }
            com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController r15 = (com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController) r15     // Catch:{ all -> 0x0192 }
            if (r15 != 0) goto L_0x012c
            X.0ZV r14 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x0192 }
            goto L_0x0148
        L_0x012c:
            java.lang.Object r12 = r13.get(r12)     // Catch:{ all -> 0x0192 }
            java.util.Set r12 = (java.util.Set) r12     // Catch:{ all -> 0x0192 }
            if (r12 != 0) goto L_0x0136
            X.84Y r12 = X.AnonymousClass84Y.A00     // Catch:{ all -> 0x0192 }
        L_0x0136:
            r22 = r1
            r23 = r12
            r24 = r8
            r18 = r15
            r19 = r17
            r20 = r14
            r21 = r16
            java.lang.Object r14 = r18.A03(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0192 }
        L_0x0148:
            if (r14 == r7) goto L_0x01ba
            r13 = r5
            goto L_0x014f
        L_0x014c:
            X.AnonymousClass0OU.A00(r14)     // Catch:{ all -> 0x0192 }
        L_0x014f:
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ all -> 0x0192 }
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0w(r14)     // Catch:{ all -> 0x0192 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0192 }
        L_0x0159:
            boolean r12 = r14.hasNext()     // Catch:{ all -> 0x0192 }
            if (r12 == 0) goto L_0x016b
            java.lang.Object r12 = r14.next()     // Catch:{ all -> 0x0192 }
            X.18L r12 = (X.AnonymousClass18L) r12     // Catch:{ all -> 0x0192 }
            X.1u0 r12 = r12.A01     // Catch:{ all -> 0x0192 }
            r15.add(r12)     // Catch:{ all -> 0x0192 }
            goto L_0x0159
        L_0x016b:
            r13.add(r15)     // Catch:{ all -> 0x0192 }
            goto L_0x00b1
        L_0x0170:
            X.4To r13 = X.AnonymousClass4To.A00()     // Catch:{ all -> 0x0192 }
            goto L_0x00ee
        L_0x0176:
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0192 }
            java.util.List r1 = X.C02260Al.A10(r5)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "fetch_complete"
            r3.ANG(r0)     // Catch:{ all -> 0x0192 }
            X.4A6 r0 = new X.4A6     // Catch:{ all -> 0x0192 }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x0192 }
            X.C31155GhB.A03(r0)     // Catch:{ all -> 0x0192 }
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x0192 }
            goto L_0x0198
        L_0x018c:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x018f:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r1 = move-exception
            X.0OW r0 = new X.0OW
            r0.<init>(r1)
        L_0x0198:
            java.lang.Throwable r5 = X.AnonymousClass0OV.A00(r0)
            if (r5 == 0) goto L_0x01b8
            X.0IB r4 = X.C10450iM.A00()
            java.lang.String r1 = "InstagramQpSdkModule"
            java.lang.String r0 = "Error in SDK choose promotions"
            r4.CuY(r1, r0, r5)
            java.lang.String r0 = "fetch_error"
            r3.ANG(r0)
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            X.4A6 r0 = new X.4A6
            r0.<init>(r3, r2, r1)
            X.C31155GhB.A03(r0)
        L_0x01b8:
            kotlin.Unit r7 = kotlin.Unit.A00
        L_0x01ba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.InstagramQpSdkModule.A00(android.content.Context, X.4tR, X.3UU, X.3Ae, X.3RD, com.instagram.quickpromotion.sdk.InstagramQpSdkModule, com.instagram.service.session.UserSession, java.util.Map, X.8n9, X.4qz):java.lang.Object");
    }
}
