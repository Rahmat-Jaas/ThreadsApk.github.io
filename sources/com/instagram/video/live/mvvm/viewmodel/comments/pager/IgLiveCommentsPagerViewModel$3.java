package com.instagram.video.live.mvvm.viewmodel.comments.pager;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.AnonymousClass3J5;
import X.C146958n9;
import X.C148838sG;
import X.C18180wK;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C9N;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0101000_I2_13;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.comments.pager.IgLiveCommentsPagerViewModel$3", f = "IgLiveCommentsPagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveCommentsPagerViewModel$3 extends C39142Kno implements AnonymousClass0YM {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ C9N A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveCommentsPagerViewModel$3(C9N c9n, C146958n9 r3) {
        super(3, r3);
        this.A02 = c9n;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        boolean A1X2 = AnonymousClass0wJ.A1X(obj2);
        IgLiveCommentsPagerViewModel$3 igLiveCommentsPagerViewModel$3 = new IgLiveCommentsPagerViewModel$3(this.A02, (C146958n9) obj3);
        igLiveCommentsPagerViewModel$3.A00 = A1X;
        igLiveCommentsPagerViewModel$3.A01 = A1X2;
        return igLiveCommentsPagerViewModel$3.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        boolean z = this.A00;
        boolean z2 = this.A01;
        if (z && z2) {
            C9N c9n = this.A02;
            c9n.A05.CrC(C18180wK.A0X());
            C148838sG r0 = c9n.A00;
            if (r0 != null) {
                r0.AC7((CancellationException) null);
            }
            c9n.A00 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0101000_I2_13(c9n, (C146958n9) null, 30), AnonymousClass3J5.A00(c9n), 3);
        }
        return Unit.A00;
    }
}
