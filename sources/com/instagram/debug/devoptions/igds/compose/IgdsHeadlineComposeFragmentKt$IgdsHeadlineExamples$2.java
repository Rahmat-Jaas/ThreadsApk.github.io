package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import android.content.Context;
import com.instagram.user.model.User;
import kotlin.Unit;

public final class IgdsHeadlineComposeFragmentKt$IgdsHeadlineExamples$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ User $user;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsHeadlineComposeFragmentKt$IgdsHeadlineExamples$2(Context context, User user, int i) {
        super(2);
        this.$context = context;
        this.$user = user;
        this.$$changed = i;
    }

    public final void invoke(C147188nY r4, int i) {
        IgdsHeadlineComposeFragmentKt.IgdsHeadlineExamples(this.$context, this.$user, r4, C115796vv.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
