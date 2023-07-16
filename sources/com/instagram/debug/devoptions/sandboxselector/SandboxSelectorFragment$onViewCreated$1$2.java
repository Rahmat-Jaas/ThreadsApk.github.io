package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass3I0;
import X.C146958n9;
import X.C39142Kno;
import X.C59513Lc;
import X.C63813iO;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$onViewCreated$1$2", f = "SandboxSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxSelectorFragment$onViewCreated$1$2 extends C39142Kno implements AnonymousClass0YP {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SandboxSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxSelectorFragment$onViewCreated$1$2(SandboxSelectorFragment sandboxSelectorFragment, C146958n9 r3) {
        super(2, r3);
        this.this$0 = sandboxSelectorFragment;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        SandboxSelectorFragment$onViewCreated$1$2 sandboxSelectorFragment$onViewCreated$1$2 = new SandboxSelectorFragment$onViewCreated$1$2(this.this$0, r4);
        sandboxSelectorFragment$onViewCreated$1$2.L$0 = obj;
        return sandboxSelectorFragment$onViewCreated$1$2;
    }

    public final Object invoke(AnonymousClass3I0 r3, C146958n9 r4) {
        return ((SandboxSelectorFragment$onViewCreated$1$2) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0OU.A00(obj);
            C63813iO.A0B(this.this$0.requireContext(), C59513Lc.A01(this.this$0, (AnonymousClass3I0) this.L$0));
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0a();
    }
}
