package com.instagram.igsignalsproducts.clips.tab;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker$predictClipsTabOpenProbability$1$2$1", f = "IgSignalsClipsOpenTabTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgSignalsClipsOpenTabTracker$predictClipsTabOpenProbability$1$2$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ double A00;
    public final /* synthetic */ AnonymousClass0YY A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSignalsClipsOpenTabTracker$predictClipsTabOpenProbability$1$2$1(C146958n9 r2, AnonymousClass0YY r3, double d) {
        super(2, r2);
        this.A01 = r3;
        this.A00 = d;
    }

    public final C146958n9 create(Object obj, C146958n9 r6) {
        return new IgSignalsClipsOpenTabTracker$predictClipsTabOpenProbability$1$2$1(r6, this.A01, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgSignalsClipsOpenTabTracker$predictClipsTabOpenProbability$1$2$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        this.A01.invoke(new Double(this.A00));
        return Unit.A00;
    }
}
