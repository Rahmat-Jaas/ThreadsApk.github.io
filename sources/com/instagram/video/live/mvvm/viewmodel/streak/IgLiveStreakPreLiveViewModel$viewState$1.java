package com.instagram.video.live.mvvm.viewmodel.streak;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2;
import com.instagram.barcelona.R;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.streak.IgLiveStreakPreLiveViewModel$viewState$1", f = "IgLiveStreakPreLiveViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveStreakPreLiveViewModel$viewState$1 extends C39142Kno implements AnonymousClass0YM {
    public /* synthetic */ int A00;
    public /* synthetic */ boolean A01;

    public IgLiveStreakPreLiveViewModel$viewState$1(C146958n9 r2) {
        super(3, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A04 = AnonymousClass0wJ.A04(obj);
        boolean A1X = AnonymousClass0wJ.A1X(obj2);
        IgLiveStreakPreLiveViewModel$viewState$1 igLiveStreakPreLiveViewModel$viewState$1 = new IgLiveStreakPreLiveViewModel$viewState$1((C146958n9) obj3);
        igLiveStreakPreLiveViewModel$viewState$1.A00 = A04;
        igLiveStreakPreLiveViewModel$viewState$1.A01 = A1X;
        return igLiveStreakPreLiveViewModel$viewState$1.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        int i = this.A00;
        boolean z = this.A01;
        int i2 = R.drawable.stride_flame_outline_16;
        if (z) {
            i2 = R.drawable.stride_flame_filled_16;
        }
        return new KtCSuperShape0S0002000_I2(i, i2, 14);
    }
}
