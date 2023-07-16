package com.instagram.ar.features.effectinfo.effectstories.api;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import com.instagram.service.session.UserSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.features.effectinfo.effectstories.api.EffectStoriesService$requestEffectStoriesWithSimpleFlow$1", f = "EffectStoriesService.kt", i = {0}, l = {39, 45, 51, 69}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class EffectStoriesService$requestEffectStoriesWithSimpleFlow$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectStoriesService$requestEffectStoriesWithSimpleFlow$1(UserSession userSession, String str, C146958n9 r4, int i) {
        super(2, r4);
        this.A03 = userSession;
        this.A04 = str;
        this.A02 = i;
    }

    public final C146958n9 create(Object obj, C146958n9 r6) {
        EffectStoriesService$requestEffectStoriesWithSimpleFlow$1 effectStoriesService$requestEffectStoriesWithSimpleFlow$1 = new EffectStoriesService$requestEffectStoriesWithSimpleFlow$1(this.A03, this.A04, r6, this.A02);
        effectStoriesService$requestEffectStoriesWithSimpleFlow$1.A01 = obj;
        return effectStoriesService$requestEffectStoriesWithSimpleFlow$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r12.A00
            r5 = 4
            r7 = 3
            r9 = 2
            r11 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r11) goto L_0x0042
            X.AnonymousClass0OU.A00(r13)
        L_0x000f:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x0012:
            X.AnonymousClass0OU.A00(r13)
            java.lang.Object r4 = r12.A01
            X.4r0 r4 = (X.C83234r0) r4
            com.instagram.service.session.UserSession r0 = r12.A03
            java.lang.String r1 = r12.A04
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r0)
            java.lang.String r0 = "creatives/single_effect_stories/"
            r2.A0J(r0)
            java.lang.String r0 = "effect_id"
            r2.A0O(r0, r1)
            java.lang.Class<X.1Rt> r1 = X.C21681Rt.class
            java.lang.Class<X.3Kd> r0 = X.C59263Kd.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2 = -5
            r1 = 0
            r0 = 14
            r12.A01 = r4
            r12.A00 = r11
            java.lang.Object r13 = X.C63623hv.A01(r3, r12, r2, r1, r0)
            if (r13 != r6) goto L_0x0049
            return r6
        L_0x0042:
            java.lang.Object r4 = r12.A01
            X.4r0 r4 = (X.C83234r0) r4
            X.AnonymousClass0OU.A00(r13)
        L_0x0049:
            X.3b6 r13 = (X.C62903b6) r13
            boolean r0 = r13 instanceof X.AnonymousClass1jA
            r3 = 0
            if (r0 == 0) goto L_0x00a4
            X.1jA r13 = (X.AnonymousClass1jA) r13
            java.lang.Object r0 = r13.A00
            X.1Rt r0 = (X.C21681Rt) r0
            java.util.List r2 = r0.A00
            r0 = 0
            if (r2 == 0) goto L_0x0067
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0067
            java.lang.Object r0 = X.C18240wQ.A0b(r2)
            X.BOd r0 = (X.C20096BOd) r0
        L_0x0067:
            int r10 = r12.A02
            r8 = 0
            if (r0 == 0) goto L_0x006d
            r11 = 0
        L_0x006d:
            X.01V r5 = X.AnonymousClass01V.A0p
            r2 = 17629205(0x10d0015, float:2.589767E-38)
            java.lang.String r1 = "is_empty_effect_stories"
            r5.markerAnnotate((int) r2, (int) r10, (java.lang.String) r1, (boolean) r11)
            r5.markerEnd(r2, r10, r9)
            if (r0 == 0) goto L_0x0098
            X.C19554AyF.A02()
            com.instagram.service.session.UserSession r1 = r12.A03
            com.instagram.reels.store.ReelStore r1 = com.instagram.reels.store.ReelStore.A02(r1)
            com.instagram.model.reels.Reel r0 = r1.A0G(r0, r8)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
            r12.A01 = r3
            r12.A00 = r9
        L_0x0091:
            java.lang.Object r0 = r4.emit(r1, r12)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0098:
            X.3Qd r0 = X.C60693Qd.A00
            X.1jB r1 = new X.1jB
            r1.<init>(r0)
            r12.A01 = r3
            r12.A00 = r7
            goto L_0x0091
        L_0x00a4:
            boolean r0 = r13 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x000f
            X.1jB r13 = (X.AnonymousClass1jB) r13
            java.lang.Object r1 = r13.A00
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.HttpError<com.instagram.ar.features.effectinfo.effectstories.models.EffectStoriesResponse>"
            X.C04220Ms.A0C(r1, r0)
            X.1j9 r1 = (X.AnonymousClass1j9) r1
            X.8mT r0 = r1.A00
            r0.getClass()
            X.3XX r2 = new X.3XX
            r2.<init>((java.lang.Object) r0)
        L_0x00c1:
            r11 = 0
            java.lang.Object r1 = r2.A00
            X.4vo r1 = (X.C85814vo) r1
            if (r1 == 0) goto L_0x0104
            int r0 = r1.getStatusCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r1.getErrorMessage()
        L_0x00d4:
            if (r1 == 0) goto L_0x00dc
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r11 = X.AnonymousClass0hA.A03(r1, r0)
        L_0x00dc:
            int r9 = r12.A02
            X.01V r8 = X.AnonymousClass01V.A0p
            r2 = 17629205(0x10d0015, float:2.589767E-38)
            if (r11 == 0) goto L_0x00ea
            java.lang.String r0 = "failure_reason"
            r8.markerAnnotate((int) r2, (int) r9, (java.lang.String) r0, (java.lang.String) r11)
        L_0x00ea:
            if (r10 == 0) goto L_0x00f5
            int r1 = r10.intValue()
            java.lang.String r0 = "failure_code"
            r8.markerAnnotate((int) r2, (int) r9, (java.lang.String) r0, (int) r1)
        L_0x00f5:
            r8.markerEnd(r2, r9, r7)
            X.3Qd r0 = X.C60693Qd.A00
            X.1jB r1 = new X.1jB
            r1.<init>(r0)
            r12.A01 = r3
            r12.A00 = r5
            goto L_0x0091
        L_0x0104:
            java.lang.Throwable r1 = r2.A01
            if (r1 == 0) goto L_0x0121
            boolean r0 = r1 instanceof X.AnonymousClass665
            if (r0 == 0) goto L_0x0118
            X.665 r1 = (X.AnonymousClass665) r1
            X.C04220Ms.A0A(r1)
            int r0 = r1.A00
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            goto L_0x00dc
        L_0x0118:
            X.C04220Ms.A0A(r1)
            java.lang.String r1 = r1.getMessage()
            r10 = r3
            goto L_0x00d4
        L_0x0121:
            r10 = r3
            goto L_0x00dc
        L_0x0123:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.Exception<com.instagram.ar.features.effectinfo.effectstories.models.EffectStoriesResponse>"
            X.C04220Ms.A0C(r1, r0)
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r0 = r1.A00
            X.3XX r2 = new X.3XX
            r2.<init>((java.lang.Throwable) r0)
            goto L_0x00c1
        L_0x0136:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.features.effectinfo.effectstories.api.EffectStoriesService$requestEffectStoriesWithSimpleFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EffectStoriesService$requestEffectStoriesWithSimpleFlow$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
