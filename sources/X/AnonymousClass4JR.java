package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110;

/* renamed from: X.4JR  reason: invalid class name */
public final class AnonymousClass4JR implements C82924qU {
    public final Context A00;
    public final AnonymousClass06E A01;
    public final C11630kW A02;
    public final UserSession A03;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A03;
        String A0h = C18200wM.A0h(C63703i9.A00(C63703i9.A00, userSession), "last_shopping_story_media_id");
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3H0 r4 = (AnonymousClass3H0) userSession.A01(AnonymousClass3H0.class, new KtLambdaShape130S0100000_I2_110(userSession, 40));
        Context context = this.A00;
        C11630kW r3 = this.A02;
        AnonymousClass06E r2 = this.A01;
        r4.A00(context, r2, r3, A0h, true);
        if (A0h != null) {
            C77084fD r7 = C77084fD.A00;
            C77094fE r6 = C77094fE.A00;
            r4.A01(context, r2, r6, new C77514gi(context, r2, r3, r4, A0h, r6, r7));
        }
    }

    public AnonymousClass4JR(FragmentActivity fragmentActivity, C11630kW r3, UserSession userSession) {
        AnonymousClass06E A002 = AnonymousClass06E.A00(fragmentActivity);
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A03 = userSession;
        this.A01 = A002;
    }
}
