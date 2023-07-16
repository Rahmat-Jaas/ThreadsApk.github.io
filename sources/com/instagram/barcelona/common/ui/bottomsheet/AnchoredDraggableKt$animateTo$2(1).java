package com.instagram.barcelona.common.ui.bottomsheet;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass7A5;
import X.C04040Ma;
import X.C142638fL;
import X.C146958n9;
import X.C39142Kno;
import X.C86114wI;
import X.C86124wJ;
import X.D0E;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape48S0200000_I2;

@DebugMetadata(c = "com.instagram.barcelona.common.ui.bottomsheet.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {527}, m = "invokeSuspend", n = {}, s = {})
public final class AnchoredDraggableKt$animateTo$2 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ AnonymousClass7A5 A04;
    public final /* synthetic */ Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnonymousClass7A5 r2, Object obj, C146958n9 r4, float f) {
        super(3, r4);
        this.A05 = obj;
        this.A04 = r2;
        this.A03 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = this.A05;
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.A04, obj4, (C146958n9) obj3, this.A03);
        anchoredDraggableKt$animateTo$2.A01 = obj;
        anchoredDraggableKt$animateTo$2.A02 = obj2;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            Object obj2 = this.A01;
            Number A0j = C86124wJ.A0j(this.A05, (Map) this.A02);
            if (A0j != null) {
                C04040Ma r2 = new C04040Ma();
                AnonymousClass7A5 r1 = this.A04;
                float A002 = C86114wI.A00(r1.A06);
                r2.A00 = A002;
                float floatValue = A0j.floatValue();
                float f = this.A03;
                C142638fL r7 = r1.A00;
                KtLambdaShape48S0200000_I2 ktLambdaShape48S0200000_I2 = new KtLambdaShape48S0200000_I2(18, obj2, r2);
                this.A01 = null;
                this.A00 = 1;
                if (SuspendAnimationKt.A04(r7, this, ktLambdaShape48S0200000_I2, A002, floatValue, f) == d0e) {
                    return d0e;
                }
            }
        }
        return Unit.A00;
    }
}
