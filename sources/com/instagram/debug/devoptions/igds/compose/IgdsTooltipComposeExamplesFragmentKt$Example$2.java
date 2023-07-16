package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass672;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import X.C305121p;
import kotlin.Unit;

public final class IgdsTooltipComposeExamplesFragmentKt$Example$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $buttonText;
    public final /* synthetic */ AnonymousClass672 $tooltipPosition;
    public final /* synthetic */ String $tooltipText;
    public final /* synthetic */ C305121p $tooltipTheme;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsTooltipComposeExamplesFragmentKt$Example$2(String str, AnonymousClass672 r3, C305121p r4, String str2, int i) {
        super(2);
        this.$tooltipText = str;
        this.$tooltipPosition = r3;
        this.$tooltipTheme = r4;
        this.$buttonText = str2;
        this.$$changed = i;
    }

    public final void invoke(C147188nY r8, int i) {
        IgdsTooltipComposeExamplesFragmentKt.Example(this.$tooltipText, this.$tooltipPosition, this.$tooltipTheme, this.$buttonText, r8, C115796vv.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
