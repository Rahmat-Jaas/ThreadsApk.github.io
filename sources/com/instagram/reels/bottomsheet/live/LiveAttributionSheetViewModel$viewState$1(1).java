package com.instagram.reels.bottomsheet.live;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.AnonymousClass3HS;
import X.AnonymousClass48O;
import X.C146958n9;
import X.C19430zr;
import X.C39142Kno;
import X.C41882MfV;
import X.C76544eG;
import android.text.SpannableStringBuilder;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.reels.bottomsheet.live.LiveAttributionSheetViewModel$viewState$1", f = "LiveAttributionSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LiveAttributionSheetViewModel$viewState$1 extends C39142Kno implements AnonymousClass0YM {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ C19430zr A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ AnonymousClass3HS A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveAttributionSheetViewModel$viewState$1(C19430zr r2, User user, AnonymousClass3HS r4, C146958n9 r5) {
        super(3, r5);
        this.A03 = user;
        this.A02 = r2;
        this.A04 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        User user = this.A03;
        LiveAttributionSheetViewModel$viewState$1 liveAttributionSheetViewModel$viewState$1 = new LiveAttributionSheetViewModel$viewState$1(this.A02, user, this.A04, (C146958n9) obj3);
        liveAttributionSheetViewModel$viewState$1.A01 = A1X;
        liveAttributionSheetViewModel$viewState$1.A00 = obj2;
        return liveAttributionSheetViewModel$viewState$1.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        ImageUrl imageUrl;
        C41882MfV A002;
        AnonymousClass0OU.A00(obj);
        boolean z = this.A01;
        User user = (User) this.A00;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user2 = this.A03;
        ImageUrl B4M = user2.B4M();
        String str = null;
        if (user != null) {
            imageUrl = user.B4M();
        } else {
            imageUrl = null;
        }
        A0v.add(new AnonymousClass48O(spannableStringBuilder, B4M, imageUrl));
        int i = 2;
        if (user == null) {
            i = 1;
        }
        String BK7 = user2.BK7();
        if (user != null) {
            str = user.BK7();
        }
        KtCSuperShape0S2002000_I2 ktCSuperShape0S2002000_I2 = new KtCSuperShape0S2002000_I2(BK7, R.plurals.live_summary_broadcaster_count, i, 1, str);
        if (z && (A002 = this.A04.A00(user2, C76544eG.A00)) != null) {
            A0v.add(A002);
        }
        return new KtCSuperShape1S0200000_I2_1(32, (Object) ktCSuperShape0S2002000_I2, (Object) A0v);
    }
}
