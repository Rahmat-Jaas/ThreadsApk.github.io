package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass72M;
import X.AnonymousClass74X;
import X.AnonymousClass7J3;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.AnonymousClass8cS;
import X.C02220Ah;
import X.C123327Wm;
import X.C146288ly;
import X.C147188nY;
import X.C86104wH;
import X.C98236Es;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public final class RepositoryInfoFragment$ExpandableColumn$1$3 extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ AnonymousClass0YP $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$ExpandableColumn$1$3(AnonymousClass0YP r2, int i) {
        super(3);
        this.$content = r2;
        this.$$dirty = i;
    }

    public final void invoke(AnonymousClass8cS r11, C147188nY r12, int i) {
        AnonymousClass0YP r9 = this.$content;
        int i2 = this.$$dirty;
        C123327Wm A00 = Modifier.A00(r12);
        C146288ly A002 = AnonymousClass72M.A00(AnonymousClass7J3.A07, r12, AnonymousClass7KV.A02);
        Object A0p = C147188nY.A0p(r12);
        Object A0n = C147188nY.A0n(r12);
        Object A0m = C147188nY.A0m(r12);
        AnonymousClass0ZU r2 = AnonymousClass74X.A00;
        AnonymousClass0YM A003 = C98236Es.A00(A00);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r12;
        C147188nY.A0w(r12, r1, r2);
        AnonymousClass7W3.A0a(r12, r1, A002, A0p);
        AnonymousClass7KP.A07(r12, A0n, A0m, A003);
        r12.Cvb(232111329);
        C86104wH.A1S(r12, r9, i2 >> 6);
        AnonymousClass7W3.A0f(r1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AnonymousClass8cS) obj, (C147188nY) obj2, AnonymousClass0wJ.A04(obj3));
        return Unit.A00;
    }
}
