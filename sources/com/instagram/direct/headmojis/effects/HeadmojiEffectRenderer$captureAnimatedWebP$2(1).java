package com.instagram.direct.headmojis.effects;

import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.AnonymousClass1jA;
import X.AnonymousClass1jB;
import X.AnonymousClass4VZ;
import X.C146958n9;
import X.C39142Kno;
import X.C62903b6;
import X.C86164wN;
import X.C956161k;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.headmojis.effects.HeadmojiEffectRenderer$captureAnimatedWebP$2", f = "HeadmojiEffectRenderer.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class HeadmojiEffectRenderer$captureAnimatedWebP$2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ HeadmojiEffectRenderer A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeadmojiEffectRenderer$captureAnimatedWebP$2(HeadmojiEffectRenderer headmojiEffectRenderer, C146958n9 r3, int i, int i2) {
        super(1, r3);
        this.A03 = headmojiEffectRenderer;
        this.A01 = i;
        this.A02 = i2;
    }

    public final C146958n9 create(C146958n9 r5) {
        return new HeadmojiEffectRenderer$captureAnimatedWebP$2(this.A03, r5, this.A01, this.A02);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            HeadmojiEffectRenderer headmojiEffectRenderer = this.A03;
            int i = this.A01;
            int i2 = this.A02;
            this.A00 = 1;
            obj = HeadmojiEffectRenderer.A05(headmojiEffectRenderer, this, i, i2);
            if (obj == d0e) {
                return d0e;
            }
        }
        C62903b6 r4 = (C62903b6) obj;
        if (r4 instanceof AnonymousClass1jA) {
            return r4;
        }
        if (r4 instanceof AnonymousClass1jB) {
            return C86164wN.A0R(new C956161k((Throwable) ((AnonymousClass1jB) r4).A00));
        }
        throw AnonymousClass4VZ.A00();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((HeadmojiEffectRenderer$captureAnimatedWebP$2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
