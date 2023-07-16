package androidx.compose.animation.core;

import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.AnonymousClass7JH;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Animatable$snapTo$2 extends C39142Kno implements AnonymousClass0YY {
    public final /* synthetic */ AnonymousClass7JH A00;
    public final /* synthetic */ Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(AnonymousClass7JH r2, Object obj, C146958n9 r4) {
        super(1, r4);
        this.A00 = r2;
        this.A01 = obj;
    }

    public final C146958n9 create(C146958n9 r4) {
        return new Animatable$snapTo$2(this.A00, this.A01, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$snapTo$2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        AnonymousClass7JH r2 = this.A00;
        AnonymousClass7JH.A04(r2);
        Object A03 = AnonymousClass7JH.A03(r2, this.A01);
        r2.A04.A05.CrC(A03);
        r2.A0A.CrC(A03);
        return Unit.A00;
    }
}
