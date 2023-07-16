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
import X.C62263Ya;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

public final class IgdsBulletCellExamplesFragment extends C34640IcN implements C82034oy {
    public final C04530Oa userSession$delegate = AnonymousClass0OY.A02(new IgdsBulletCellExamplesFragment$userSession$2(this));

    public String getModuleName() {
        return "igds_bullet_cell_examples";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0G = C18240wQ.A0G(view, R.id.bullet_cell_group_container);
        C62263Ya r4 = new C62263Ya(requireContext(), false, false);
        r4.A03("Title 1", "It also has some body copy to help explain the point.", R.drawable.instagram_sparkles_pano_outline_24);
        r4.A03("Title 2", "It also has some body copy to help explain the point.", R.drawable.instagram_direct_pano_outline_24);
        r4.A03("Title 3", "It also has some body copy to help explain the point.", R.drawable.instagram_wishlist_pano_outline_24);
        r4.A03("Title 4", "It also has some body copy to help explain the point.", R.drawable.instagram_ads_pano_outline_24);
        List A01 = C62263Ya.A01(r4, "Title 5", "It also has some body copy to help explain the point.", R.drawable.instagram_alert_new_pano_outline_24);
        ArrayList A0w = AnonymousClass0wJ.A0w(A01);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            C18240wQ.A0x(A0G, it);
            A0w.add(Unit.A00);
        }
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, getString(2131825234));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(423501434);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.igds_bullet_cell_examples, false);
        C14030oh.A09(-237703986, A02);
        return A0D;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
