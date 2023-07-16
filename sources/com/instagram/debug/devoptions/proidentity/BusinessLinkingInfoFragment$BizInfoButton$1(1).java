package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class BusinessLinkingInfoFragment$BizInfoButton$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass0ZU $onClick;
    public final /* synthetic */ String $text;
    public final /* synthetic */ BusinessLinkingInfoFragment $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessLinkingInfoFragment$BizInfoButton$1(BusinessLinkingInfoFragment businessLinkingInfoFragment, AnonymousClass0ZU r3, String str, int i) {
        super(2);
        this.$tmp0_rcvr = businessLinkingInfoFragment;
        this.$onClick = r3;
        this.$text = str;
        this.$$changed = i;
    }

    public final void invoke(C147188nY r5, int i) {
        this.$tmp0_rcvr.BizInfoButton(this.$onClick, this.$text, r5, C115796vv.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
