package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18180wK;
import X.C34640IcN;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

public final class IGDSButtonStyleExamplesFragment extends C34640IcN implements C82034oy {
    public final C04530Oa userSession$delegate = AnonymousClass0OY.A02(new IGDSButtonStyleExamplesFragment$userSession$2(this));

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131828628);
    }

    public String getModuleName() {
        return "igbutton_examples";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1114374989);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.igds_button_style_examples, false);
        ViewGroup viewGroup2 = (ViewGroup) A0D;
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setOnClickListener(IGDSButtonStyleExamplesFragment$onCreateView$1.INSTANCE);
        }
        C14030oh.A09(-1638350646, A02);
        return A0D;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
