package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.AnonymousClass6QR;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C34640IcN;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.service.session.UserSession;

public final class IgdsFormFieldComposeExamplesFragment extends C34640IcN implements C82034oy {
    public static final int $stable = 8;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825238);
    }

    public String getModuleName() {
        return "igds_form_field_compose_examples";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-839324319);
        ComposeView A00 = AnonymousClass6QR.A00(this, ComposableSingletons$IgdsFormFieldComposeExamplesFragmentKt.f22lambda2);
        C14030oh.A09(-512768598, A02);
        return A00;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
