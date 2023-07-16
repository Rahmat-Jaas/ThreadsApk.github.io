package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.AnonymousClass70P;
import X.AnonymousClass70Q;
import X.C02220Ah;
import X.C146818mu;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public final class IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$7 extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ Modifier $followButtonModifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$7(Modifier modifier) {
        super(3);
        this.$followButtonModifier = modifier;
    }

    public final void invoke(C146818mu r4, C147188nY r5, int i) {
        if ((i & 81) != 16 || !r5.BCM()) {
            AnonymousClass70P.A01(r5, this.$followButtonModifier, AnonymousClass70Q.A00(r5), AnonymousClass1.INSTANCE);
            return;
        }
        r5.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C146818mu) obj, (C147188nY) obj2, AnonymousClass0wJ.A04(obj3));
        return Unit.A00;
    }
}
