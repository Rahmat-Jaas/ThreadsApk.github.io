package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.AnonymousClass7JR;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C34640IcN;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.service.session.UserSession;

public final class IgdsProfilePictureComposeFragment extends C34640IcN implements C82034oy {
    public static final int $stable = 8;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825249);
    }

    public String getModuleName() {
        return "igds_profile_picture_compose_examples";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1535951197);
        ComposeView composeView = new ComposeView(requireContext(), (AttributeSet) null, 0);
        composeView.setContent(AnonymousClass7JR.A03(new IgdsProfilePictureComposeFragment$onCreateView$1$1(this), -1704710390, true));
        C14030oh.A09(1311618714, A02);
        return composeView;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
