package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import com.instagram.user.model.User;
import kotlin.Unit;

public final class IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ User $user;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$2(User user, int i) {
        super(2);
        this.$user = user;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }

    public final void invoke(C147188nY r3, int i) {
        IgdsPeopleCellComposeFragmentKt.IgdsPeopleCellExamples(this.$user, r3, C115796vv.A00(this.$$changed));
    }
}
