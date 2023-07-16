package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18240wQ;
import X.C34640IcN;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;

public final class IgdsBottomButtonExamplesFragment extends C34640IcN implements C82034oy {
    public UserSession _session;

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825230);
    }

    public String getModuleName() {
        return "igds_bottom_button_examples";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        addOnClickListener(view, R.id.test_one_action_full_width, false);
        addOnClickListener(view, R.id.test_one_action, false);
        addOnClickListener(view, R.id.test_two_actions, true);
        addOnClickListener(view, R.id.test_one_action_with_footer, false);
        addOnClickListener(view, R.id.test_two_actions_with_footer, true);
        addOnClickListener(view, R.id.test_one_action_full_width_on_media, false);
        addOnClickListener(view, R.id.test_two_actions_with_footer_on_media, true);
    }

    public C10300i6 getSession() {
        return this._session;
    }

    private final void addOnClickListener(View view, int i, boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view, i);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(IgdsBottomButtonExamplesFragment$addOnClickListener$1.INSTANCE);
        if (z) {
            igdsBottomButtonLayout.setSecondaryActionOnClickListener(IgdsBottomButtonExamplesFragment$addOnClickListener$2.INSTANCE);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1856534527);
        super.onCreate(bundle);
        this._session = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        C14030oh.A09(143525138, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1142254034);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0E = C18240wQ.A0E(layoutInflater, R.layout.igds_bottom_button_examples);
        C14030oh.A09(-2110890007, A02);
        return A0E;
    }
}
