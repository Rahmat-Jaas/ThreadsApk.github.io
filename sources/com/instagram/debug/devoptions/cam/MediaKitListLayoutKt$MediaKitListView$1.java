package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YY;
import X.AnonymousClass7WY;
import X.C02220Ah;
import X.C04220Ms;
import X.C145078jn;
import java.util.List;
import kotlin.Unit;

public final class MediaKitListLayoutKt$MediaKitListView$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Delegate $delegate;
    public final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitListLayoutKt$MediaKitListView$1(List list, Delegate delegate, int i) {
        super(1);
        this.$items = list;
        this.$delegate = delegate;
        this.$$dirty = i;
    }

    public final void invoke(C145078jn r8) {
        C04220Ms.A0B(r8, 0);
        List list = this.$items;
        Delegate delegate = this.$delegate;
        int i = this.$$dirty;
        MediaKitListLayoutKt$MediaKitListView$1$invoke$$inlined$items$default$1 mediaKitListLayoutKt$MediaKitListView$1$invoke$$inlined$items$default$1 = MediaKitListLayoutKt$MediaKitListView$1$invoke$$inlined$items$default$1.INSTANCE;
        r8.Ba5((AnonymousClass0YY) null, new MediaKitListLayoutKt$MediaKitListView$1$invoke$$inlined$items$default$3(mediaKitListLayoutKt$MediaKitListView$1$invoke$$inlined$items$default$1, list), AnonymousClass7WY.A00(new MediaKitListLayoutKt$MediaKitListView$1$invoke$$inlined$items$default$4(list, delegate, i), -632812321), list.size());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C145078jn) obj);
        return Unit.A00;
    }
}
