package com.instagram.comments.mvvm.data;

import X.AnonymousClass0YY;
import X.AnonymousClass93B;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1$1", f = "MediaCommentListRepository.kt", i = {0}, l = {198, 201, 204}, m = "invokeSuspend", n = {"commentRow"}, s = {"L$0"})
public final class MediaCommentListRepository$likeCommentAction$1$1 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public final /* synthetic */ MediaCommentListRepository A02;
    public final /* synthetic */ AnonymousClass93B A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$likeCommentAction$1$1(MediaCommentListRepository mediaCommentListRepository, AnonymousClass93B r3, String str, String str2, C146958n9 r6, boolean z) {
        super(1, r6);
        this.A02 = mediaCommentListRepository;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A03 = r3;
    }

    public final C146958n9 create(C146958n9 r8) {
        return new MediaCommentListRepository$likeCommentAction$1$1(this.A02, this.A03, this.A05, this.A04, r8, this.A06);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r14.A00
            r1 = 3
            r4 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r9) goto L_0x0047
            if (r0 == r4) goto L_0x0064
            X.AnonymousClass0OU.A00(r15)
        L_0x0010:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0013:
            X.AnonymousClass0OU.A00(r15)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r8 = r14.A02
            X.4wG r0 = r8.A08
            java.lang.Object r0 = r0.getValue()
            X.5HY r0 = (X.AnonymousClass5HY) r0
            java.lang.String r7 = r14.A05
            java.lang.String r6 = r14.A04
            X.9S0 r10 = X.C121407Fu.A00(r0, r7, r6)
            if (r10 == 0) goto L_0x0010
            boolean r2 = r10.A0A
            boolean r0 = r14.A06
            if (r2 != r0) goto L_0x0010
            r3 = r0 ^ 1
            r14.A01 = r10
            r14.A00 = r9
            r2 = 0
            kotlin.jvm.internal.KtLambdaShape1S2010000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape1S2010000_I2
            r0.<init>(r7, r6, r2, r3)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A00(r8, r14, r0)
            if (r0 == r5) goto L_0x0044
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0044:
            if (r0 != r5) goto L_0x004e
            return r5
        L_0x0047:
            java.lang.Object r10 = r14.A01
            X.9S0 r10 = (X.AnonymousClass9S0) r10
            X.AnonymousClass0OU.A00(r15)
        L_0x004e:
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r14.A02
            com.instagram.service.session.UserSession r12 = r0.A04
            java.lang.String r13 = r0.A05
            X.93B r11 = r14.A03
            X.93A r9 = r0.A00
            r0 = 0
            r14.A01 = r0
            r14.A00 = r4
            java.lang.Object r15 = com.instagram.comments.mvvm.data.network.LikeActionNetworkRequestsKt.A00(r9, r10, r11, r12, r13, r14)
            if (r15 != r5) goto L_0x0067
            return r5
        L_0x0064:
            X.AnonymousClass0OU.A00(r15)
        L_0x0067:
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = r14.A02
            java.lang.String r4 = r14.A05
            java.lang.String r3 = r14.A04
            boolean r2 = r14.A06
            boolean r0 = r15 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0010
            boolean r0 = r15 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x008a
            r14.A00 = r1
            r1 = 0
            kotlin.jvm.internal.KtLambdaShape1S2010000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape1S2010000_I2
            r0.<init>(r4, r3, r1, r2)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A00(r6, r14, r0)
            if (r0 == r5) goto L_0x0087
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0087:
            if (r0 != r5) goto L_0x0010
            return r5
        L_0x008a:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MediaCommentListRepository$likeCommentAction$1$1) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
