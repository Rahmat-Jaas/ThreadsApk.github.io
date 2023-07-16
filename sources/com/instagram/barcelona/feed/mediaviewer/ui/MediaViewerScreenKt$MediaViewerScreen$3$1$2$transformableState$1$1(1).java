package com.instagram.barcelona.feed.mediaviewer.ui;

import X.AnonymousClass0YP;
import X.AnonymousClass7JH;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreenKt$MediaViewerScreen$3$1$2$transformableState$1$1", f = "MediaViewerScreen.kt", i = {}, l = {123, 124}, m = "invokeSuspend", n = {}, s = {})
public final class MediaViewerScreenKt$MediaViewerScreen$3$1$2$transformableState$1$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass7JH A03;
    public final /* synthetic */ AnonymousClass7JH A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaViewerScreenKt$MediaViewerScreen$3$1$2$transformableState$1$1(AnonymousClass7JH r2, AnonymousClass7JH r3, C146958n9 r4, float f, long j) {
        super(2, r4);
        this.A03 = r2;
        this.A02 = j;
        this.A04 = r3;
        this.A01 = f;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        return new MediaViewerScreenKt$MediaViewerScreen$3$1$2$transformableState$1$1(this.A03, this.A04, r9, this.A01, this.A02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r9.A00
            r4 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0010
            if (r0 == r8) goto L_0x003e
            X.AnonymousClass0OU.A00(r10)
        L_0x000d:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0010:
            X.AnonymousClass0OU.A00(r10)
            X.7JH r7 = r9.A03
            java.lang.Object r0 = X.AnonymousClass7JH.A01(r7)
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r2 = r0.A00
            long r0 = r9.A02
            X.7JH r6 = r9.A04
            java.lang.Object r6 = X.AnonymousClass7JH.A01(r6)
            float r6 = X.C18240wQ.A00(r6)
            long r0 = X.AnonymousClass7KC.A03(r6, r0)
            long r0 = X.AnonymousClass7KC.A05(r2, r0)
            X.7KC r0 = X.C86124wJ.A0O(r0)
            r9.A00 = r8
            java.lang.Object r0 = r7.A05(r0, r9)
            if (r0 != r5) goto L_0x0041
            return r5
        L_0x003e:
            X.AnonymousClass0OU.A00(r10)
        L_0x0041:
            X.7JH r3 = r9.A04
            java.lang.Object r0 = X.AnonymousClass7JH.A01(r3)
            float r2 = X.C18240wQ.A00(r0)
            float r0 = r9.A01
            float r2 = r2 * r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = X.AnonymousClass8bI.A01(r2, r1, r0)
            java.lang.Float r0 = X.C86154wM.A0W(r0)
            r9.A00 = r4
            java.lang.Object r0 = r3.A05(r0, r9)
            if (r0 != r5) goto L_0x000d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreenKt$MediaViewerScreen$3$1$2$transformableState$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaViewerScreenKt$MediaViewerScreen$3$1$2$transformableState$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
