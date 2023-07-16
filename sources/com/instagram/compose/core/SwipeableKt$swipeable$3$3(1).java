package com.instagram.compose.core;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C04220Ms;
import X.C114416tG;
import X.C146958n9;
import X.C147168nV;
import X.C147368pE;
import X.C18220wO;
import X.C39142Kno;
import X.C86154wM;
import X.D0E;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape13S0300000_I2;

@DebugMetadata(c = "com.instagram.compose.core.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {558}, m = "invokeSuspend", n = {}, s = {})
public final class SwipeableKt$swipeable$3$3 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C147168nV A02;
    public final /* synthetic */ C114416tG A03;
    public final /* synthetic */ SwipeableState A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ AnonymousClass0YP A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3$3(C147168nV r2, C114416tG r3, SwipeableState swipeableState, Map map, C146958n9 r6, AnonymousClass0YP r7, float f) {
        super(2, r6);
        this.A04 = swipeableState;
        this.A05 = map;
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = r7;
        this.A01 = f;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        SwipeableState swipeableState = this.A04;
        Map map = this.A05;
        return new SwipeableKt$swipeable$3$3(this.A02, this.A03, swipeableState, map, r10, this.A06, this.A01);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            SwipeableState swipeableState = this.A04;
            C147368pE r1 = swipeableState.A05;
            Map A0t = C86154wM.A0t(r1);
            Map map = this.A05;
            C04220Ms.A0B(map, 0);
            r1.CrC(map);
            swipeableState.A0B.CrC(this.A03);
            AnonymousClass0YP r3 = this.A06;
            C147168nV r2 = this.A02;
            swipeableState.A0C.CrC(new KtLambdaShape13S0300000_I2(11, r2, map, r3));
            C147368pE.A02(swipeableState.A0D, r2.CxL(this.A01));
            this.A00 = 1;
            if (swipeableState.A02(A0t, map, this) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SwipeableKt$swipeable$3$3) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
