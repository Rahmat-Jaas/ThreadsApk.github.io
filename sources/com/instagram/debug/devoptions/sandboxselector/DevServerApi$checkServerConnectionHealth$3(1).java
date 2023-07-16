package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass2L8;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.DevServerApi$checkServerConnectionHealth$3", f = "DevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DevServerApi$checkServerConnectionHealth$3 extends C39142Kno implements AnonymousClass0YP {
    public int label;

    public DevServerApi$checkServerConnectionHealth$3(C146958n9 r2) {
        super(2, r2);
    }

    public final C146958n9 create(Object obj, C146958n9 r3) {
        return new DevServerApi$checkServerConnectionHealth$3(r3);
    }

    public final Object invoke(AnonymousClass2L8 r3, C146958n9 r4) {
        return new DevServerApi$checkServerConnectionHealth$3(r4).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0OU.A00(obj);
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0a();
    }
}
