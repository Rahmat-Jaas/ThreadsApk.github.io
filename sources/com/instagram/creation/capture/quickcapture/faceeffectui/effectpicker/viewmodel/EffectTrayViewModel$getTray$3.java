package com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel;

import X.AnonymousClass0OU;
import X.AnonymousClass0YC;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import X.C83234r0;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$3", f = "EffectTrayViewModel.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class EffectTrayViewModel$getTray$3 extends C39142Kno implements AnonymousClass0YC {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;

    public EffectTrayViewModel$getTray$3(C146958n9 r2) {
        super(4, r2);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C83234r0 r2 = (C83234r0) this.A01;
            Object obj2 = this.A02;
            if (this.A03) {
                this.A01 = null;
                this.A00 = 1;
                if (r2.emit(obj2, this) == d0e) {
                    return d0e;
                }
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1X = AnonymousClass0wJ.A1X(obj3);
        EffectTrayViewModel$getTray$3 effectTrayViewModel$getTray$3 = new EffectTrayViewModel$getTray$3((C146958n9) obj4);
        effectTrayViewModel$getTray$3.A01 = obj;
        effectTrayViewModel$getTray$3.A02 = obj2;
        effectTrayViewModel$getTray$3.A03 = A1X;
        return effectTrayViewModel$getTray$3.invokeSuspend(Unit.A00);
    }
}
