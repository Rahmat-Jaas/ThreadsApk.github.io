package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MD;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18210wN;
import X.C18960yI;
import X.C34640IcN;
import X.C77374fg;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

public final class ImmersiveNetegoExamplesFragment extends C34640IcN implements C82034oy {
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public String getModuleName() {
        return "immersive_netego_examples";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, getString(2131825245));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1558823987);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.igds_showcase_scrollview, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0J(inflate, R.id.igds_component_examples_container);
        C18960yI r3 = new C18960yI(requireContext());
        r3.setHeader("Suggested For You", (String) null);
        r3.setFooter("See all", C77374fg.A00);
        r3.setCardProvider(new AnonymousClass4MD(AnonymousClass0wJ.A0X(this.userSession$delegate), requireContext()));
        C18210wN.A0r(requireContext(), r3, viewGroup2, "Quad Card normal");
        C18960yI r32 = new C18960yI(requireContext());
        r32.setHeader("This is a sample headline that wraps to two lines", (String) null);
        r32.setCardProvider(new AnonymousClass4MD(AnonymousClass0wJ.A0X(this.userSession$delegate), requireContext()));
        C18210wN.A0r(requireContext(), r32, viewGroup2, "Quad Card staggered");
        C14030oh.A09(890955195, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
