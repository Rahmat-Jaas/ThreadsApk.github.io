package X;

import com.instagram.reels.bottomsheet.live.LiveAttributionSheetViewModel$viewState$1;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1401000_I2;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

/* renamed from: X.0zr  reason: invalid class name and case insensitive filesystem */
public final class C19430zr extends C62793ak {
    public C86074wE A00 = C18190wL.A0z(C18180wK.A0X());
    public final M5J A01;
    public final C86074wE A02;

    public C19430zr(UserSession userSession, User user, IgLiveBroadcastInfoApi igLiveBroadcastInfoApi, AnonymousClass3HS r14, String str) {
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A02 = A0z;
        r14.A01(new KtLambdaShape95S0100000_I2_75(this, 41));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1401000_I2(this, userSession, igLiveBroadcastInfoApi, str, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
        this.A01 = C29110FiC.A00((C27952Ew2) null, C25807DsL.A01(new LiveAttributionSheetViewModel$viewState$1(this, user, r14, (C146958n9) null), this.A00, A0z), 3);
    }
}
