package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YC;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C141678cb;
import X.C147188nY;
import X.C86124wJ;
import X.C89865Hh;
import java.util.List;
import kotlin.Unit;

public final class MediaKitListLayoutKt$MediaKitListView$1$invoke$$inlined$items$default$4 extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ int $$dirty$inlined;
    public final /* synthetic */ Delegate $delegate$inlined;
    public final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitListLayoutKt$MediaKitListView$1$invoke$$inlined$items$default$4(List list, Delegate delegate, int i) {
        super(4);
        this.$items = list;
        this.$delegate$inlined = delegate;
        this.$$dirty$inlined = i;
    }

    public final void invoke(C141678cb r4, int i, C147188nY r6, int i2) {
        int i3;
        if (C86124wJ.A0G(r4, i2) == 0) {
            i3 = C147188nY.A0F(r6, r4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A04(r6, i);
        }
        if ((i3 & 731) != 146 || !r6.BCM()) {
            MediaKitListLayoutKt.MediaKitSummaryItem((C89865Hh) this.$items.get(i), this.$delegate$inlined, r6, (this.$$dirty$inlined & 112) | 8);
        } else {
            r6.CuJ();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C141678cb) obj, AnonymousClass0wJ.A04(obj2), (C147188nY) obj3, AnonymousClass0wJ.A04(obj4));
        return Unit.A00;
    }
}
