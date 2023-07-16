package com.instagram.creation.capture.quickcapture.sundial.viewmodel;

import X.AnonymousClass006;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C86084wF;
import X.C8L;
import X.D0E;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0111000_I2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.TimedElementsViewModel$handleTimedElementTrim$1$1", f = "TimedElementsViewModel.kt", i = {}, l = {606}, m = "invokeSuspend", n = {}, s = {})
public final class TimedElementsViewModel$handleTimedElementTrim$1$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C8L A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimedElementsViewModel$handleTimedElementTrim$1$1(C8L c8l, C146958n9 r3, int i, int i2, boolean z, boolean z2) {
        super(2, r3);
        this.A03 = c8l;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = i;
        this.A01 = i2;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        return new TimedElementsViewModel$handleTimedElementTrim$1$1(this.A03, r9, this.A02, this.A01, this.A05, this.A04);
    }

    public final Object invokeSuspend(Object obj) {
        Integer num;
        int i;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C86084wF r5 = this.A03.A0C;
            if (this.A05) {
                num = AnonymousClass006.A01;
            } else {
                num = AnonymousClass006.A0C;
            }
            if (this.A04) {
                i = this.A02;
            } else {
                i = this.A01;
            }
            KtCSuperShape0S0111000_I2 ktCSuperShape0S0111000_I2 = new KtCSuperShape0S0111000_I2(num, i, 4, false);
            this.A00 = 1;
            if (r5.emit(ktCSuperShape0S0111000_I2, this) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TimedElementsViewModel$handleTimedElementTrim$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
