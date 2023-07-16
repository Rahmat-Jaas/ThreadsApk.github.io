package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.user.userlist.data.LikesListRemoteDataSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0200000_I2_8;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0301000_I2_5;

/* renamed from: X.64n  reason: invalid class name and case insensitive filesystem */
public final class C963564n extends C134647y7 implements C27921EvW {
    public final LikesListRemoteDataSource A00 = new LikesListRemoteDataSource();
    public final C86074wE A01;
    public final C86094wG A02;
    public final UserSession A03;

    public final Object AMR(C26620EOe eOe, C146958n9 r6) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0301000_I2_5(this, eOe, (C146958n9) null, 37), this.A01, 3);
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ C84714tk As1() {
        return this.A02;
    }

    public C963564n(UserSession userSession) {
        super("Profile", AnonymousClass2TZ.A00(1948631496));
        this.A03 = userSession;
        C27457Enn A0z = C18190wL.A0z(C965065f.A00);
        this.A01 = A0z;
        this.A02 = C18230wP.A0x((C148838sG) null, A0z);
        C25817DsW.A06(this.A01, C86154wM.A0O(new KtSLambdaShape13S0200000_I2_8((Object) this, (C146958n9) null, 28), AnonymousClass7E6.A00(userSession).A02(BBZ.class)));
    }

    public final void D7Q(Activity activity, User user) {
        AnonymousClass0wJ.A1N(user, activity);
        C25791Ds4.A01(activity, this.A03, user, AnonymousClass000.A00(980));
    }
}
