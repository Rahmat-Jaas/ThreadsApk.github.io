package com.instagram.debug.devoptions;

import X.AID;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import X.C23411dm;
import X.C63293hC;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableMap;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class SessionSurveyInternalSettingsFragment extends C23411dm implements C82034oy {
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825536);
    }

    public String getModuleName() {
        return "session_survey_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImmutableMap copyOf = ImmutableMap.copyOf(AID.A00(C18190wL.A0A(view), AnonymousClass0wJ.A0X(this.userSession$delegate)).A09);
        C04220Ms.A06(copyOf);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (copyOf.isEmpty()) {
            A0v.add(new C63293hC(2131825537));
        } else {
            Iterator it = copyOf.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                C63293hC.A02(AnonymousClass00U.A0V(C18200wM.A0p(A0o), " = ", C18230wP.A0u(A0o)), A0v);
            }
        }
        setItems(A0v);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
