package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass45T;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C04220Ms;
import X.C08380dH;
import X.C09120et;
import X.C14030oh;
import X.C38040KHr;
import X.C63813iO;
import X.C82394pY;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class NewUserNuxOptions implements DeveloperOptionsSection {
    public final Context context;
    public final int titleRes = 2131825335;

    public NewUserNuxOptions(Context context2) {
        C04220Ms.A0B(context2, 1);
        this.context = context2;
    }

    public final class OnboardingStatusEventListener implements C82394pY {
        public final Context context;

        public OnboardingStatusEventListener(Context context2) {
            C04220Ms.A0B(context2, 1);
            this.context = context2;
        }

        public void onEvent(AnonymousClass45T r5) {
            int A00 = AnonymousClass0wJ.A00(1210778336, r5);
            C63813iO.A0C(this.context, AnonymousClass00U.A0L("Onboarding steps updated:\n\n", r5.A00));
            C38040KHr.A01.A04(this, AnonymousClass45T.class);
            C14030oh.A0A(-872554896, A00);
        }

        public /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C14030oh.A03(1488514221);
            onEvent((AnonymousClass45T) obj);
            C14030oh.A0A(-1382473319, A03);
        }
    }

    public Integer getTitleRes() {
        return Integer.valueOf(this.titleRes);
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity) {
        AnonymousClass0wJ.A1N(userSession, fragmentActivity);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C08380dH r4 = C09120et.A3D;
        AnonymousClass4MC.A06(NewUserNuxOptions$getItems$1.INSTANCE, "Run NUX on login", A0v, AnonymousClass0wJ.A1V(r4.A00().A22));
        AnonymousClass4MC.A06(NewUserNuxOptions$getItems$2.INSTANCE, "Run NDX on cold start", A0v, AnonymousClass0wJ.A1V(r4.A00().A21));
        AnonymousClass4MC.A07(NewUserNuxOptions$getItems$3.INSTANCE, A0v, 2131825572, AnonymousClass0wJ.A1V(r4.A00().A2Y));
        AnonymousClass4MA.A02(new NewUserNuxOptions$getItems$4(this, userSession), "Request NUX Plugin Steps", A0v);
        AnonymousClass4MA.A03(new NewUserNuxOptions$getItems$5(this, userSession), A0v, 2131825301);
        AnonymousClass4MA.A03(new NewUserNuxOptions$getItems$6(this, userSession), A0v, 2131825303);
        AnonymousClass4MA.A03(new NewUserNuxOptions$getItems$7(this, userSession), A0v, 2131825302);
        AnonymousClass4MA.A03(new NewUserNuxOptions$getItems$8(this, userSession), A0v, 2131825304);
        AnonymousClass4MA.A02(new NewUserNuxOptions$getItems$9(fragmentActivity, userSession), "Open NUX Interest Picker", A0v);
        AnonymousClass4MA.A02(new NewUserNuxOptions$getItems$10(fragmentActivity, userSession), "Launch Custom NUX Flow", A0v);
        return A0v;
    }

    public /* synthetic */ boolean isEnabled(UserSession userSession) {
        return true;
    }
}
