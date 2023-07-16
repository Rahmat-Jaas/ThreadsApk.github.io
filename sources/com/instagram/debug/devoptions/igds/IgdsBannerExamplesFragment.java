package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18180wK;
import X.C18240wQ;
import X.C34640IcN;
import X.C82034oy;
import X.C83594rf;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class IgdsBannerExamplesFragment extends C34640IcN implements C82034oy {
    public final C04530Oa userSession$delegate = AnonymousClass0OY.A02(new IgdsBannerExamplesFragment$userSession$2(this));

    public String getModuleName() {
        return "igds_banner_examples";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0G = C18240wQ.A0G(view, R.id.igds_component_examples_container);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int childCount = A0G.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = A0G.getChildAt(i);
            if (childAt instanceof IgdsBanner) {
                A0v.add(childAt);
            }
        }
        setClickListeners(A0v, new IgdsBannerExamplesFragment$onViewCreated$callback$1(this));
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, getString(2131825228));
        }
    }

    private final void setClickListeners(Collection collection, C83594rf r4) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((IgdsBanner) it.next()).A00 = r4;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1685678150);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.igds_banner_examples, false);
        C14030oh.A09(30267043, A02);
        return A0D;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
