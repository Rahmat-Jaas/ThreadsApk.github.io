package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import kotlin.Unit;

/* renamed from: com.instagram.debug.devoptions.igds.compose.ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda-4$1$1$1  reason: invalid class name */
public final class ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda4$1$1$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ FormFieldExampleScope $this_FormFieldExample;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt$lambda4$1$1$1(FormFieldExampleScope formFieldExampleScope) {
        super(1);
        this.$this_FormFieldExample = formFieldExampleScope;
    }

    public final void invoke(String str) {
        C04220Ms.A0B(str, 0);
        this.$this_FormFieldExample.setValue(str);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.A00;
    }
}
