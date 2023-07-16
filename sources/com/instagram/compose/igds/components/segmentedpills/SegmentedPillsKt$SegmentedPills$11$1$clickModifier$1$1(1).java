package com.instagram.compose.igds.components.segmentedpills;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C147368pE;
import X.C18220wO;
import X.C39142Kno;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.igds.components.segmentedpills.SegmentedPillsKt$SegmentedPills$11$1$clickModifier$1$1", f = "SegmentedPills.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
public final class SegmentedPillsKt$SegmentedPills$11$1$clickModifier$1$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ LazyListState A04;
    public final /* synthetic */ C147368pE A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedPillsKt$SegmentedPills$11$1$clickModifier$1$1(LazyListState lazyListState, C147368pE r3, C146958n9 r4, float f, float f2, float f3) {
        super(2, r4);
        this.A04 = lazyListState;
        this.A05 = r3;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        return new SegmentedPillsKt$SegmentedPills$11$1$clickModifier$1$1(this.A04, this.A05, r9, this.A01, this.A02, this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r0 == r8) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            r2 = 1
            if (r0 == 0) goto L_0x000d
            X.AnonymousClass0OU.A00(r11)
        L_0x000a:
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        L_0x000d:
            X.AnonymousClass0OU.A00(r11)
            androidx.compose.foundation.lazy.LazyListState r9 = r10.A04
            X.8pE r0 = r10.A05
            java.lang.Object r1 = r0.getValue()
            X.76A r1 = (X.AnonymousClass76A) r1
            float r0 = r10.A01
            float r7 = r10.A02
            float r6 = r10.A03
            r10.A00 = r2
            float r5 = r1.A01
            float r4 = r1.A02
            float r5 = r5 - r4
            float r5 = r5 - r0
            r3 = 1
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r2 = X.C86124wJ.A1X(r0)
            float r1 = r1.A00
            float r1 = r1 + r4
            float r1 = r1 + r7
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0039
            r3 = 0
        L_0x0039:
            if (r2 != 0) goto L_0x003f
            if (r3 == 0) goto L_0x004d
            float r5 = r1 - r6
        L_0x003f:
            r0 = 0
            X.7Tu r0 = X.C122777Tu.A00(r0)
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollExtensionsKt.A00(r0, r9, r10, r5)
            if (r0 != r8) goto L_0x004d
        L_0x004a:
            if (r0 != r8) goto L_0x000a
            return r8
        L_0x004d:
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.igds.components.segmentedpills.SegmentedPillsKt$SegmentedPills$11$1$clickModifier$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SegmentedPillsKt$SegmentedPills$11$1$clickModifier$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
