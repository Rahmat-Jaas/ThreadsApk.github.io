package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class IgdsDialogComposeExamplesFragmentKt$DialogExample$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass0YM $dialogContent;
    public final /* synthetic */ String $label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsDialogComposeExamplesFragmentKt$DialogExample$2(String str, AnonymousClass0YM r3, int i) {
        super(2);
        this.$label = str;
        this.$dialogContent = r3;
        this.$$changed = i;
    }

    public final void invoke(C147188nY r4, int i) {
        IgdsDialogComposeExamplesFragmentKt.DialogExample(this.$label, this.$dialogContent, r4, C115796vv.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
