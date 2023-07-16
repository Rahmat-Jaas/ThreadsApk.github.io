package com.instagram.video.live.mvvm.viewmodel.comments;

import X.AnonymousClass0OU;
import X.AnonymousClass0Y0;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.comments.IgLiveCommentsViewModel$viewState$1", f = "IgLiveCommentsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveCommentsViewModel$viewState$1 extends C39142Kno implements AnonymousClass0Y0 {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;

    public IgLiveCommentsViewModel$viewState$1(C146958n9 r2) {
        super(5, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        boolean A1X2 = AnonymousClass0wJ.A1X(obj2);
        IgLiveCommentsViewModel$viewState$1 igLiveCommentsViewModel$viewState$1 = new IgLiveCommentsViewModel$viewState$1((C146958n9) obj5);
        igLiveCommentsViewModel$viewState$1.A02 = A1X;
        igLiveCommentsViewModel$viewState$1.A03 = A1X2;
        igLiveCommentsViewModel$viewState$1.A00 = obj3;
        igLiveCommentsViewModel$viewState$1.A01 = obj4;
        return igLiveCommentsViewModel$viewState$1.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        AnonymousClass0OU.A00(obj);
        boolean z2 = this.A02;
        boolean z3 = this.A03;
        Object obj2 = this.A00;
        KtCSuperShape0S0020000_I2 ktCSuperShape0S0020000_I2 = (KtCSuperShape0S0020000_I2) this.A01;
        if (ktCSuperShape0S0020000_I2.A00 || ktCSuperShape0S0020000_I2.A01 || (z2 && z3)) {
            z = false;
        } else {
            z = true;
        }
        return new KtCSuperShape0S0110000_I2(27, obj2, z);
    }
}
