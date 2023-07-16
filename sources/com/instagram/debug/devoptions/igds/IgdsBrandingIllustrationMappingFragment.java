package com.instagram.debug.devoptions.igds;

import X.AnonymousClass00U;
import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass323;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C34640IcN;
import X.C551631z;
import X.C82034oy;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

public final class IgdsBrandingIllustrationMappingFragment extends C34640IcN implements C82034oy {
    public final C04530Oa userSession$delegate = AnonymousClass0OY.A02(new IgdsBrandingIllustrationMappingFragment$userSession$2(this));

    public String getModuleName() {
        return "igds_branding_illustrations";
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0G = C18240wQ.A0G(view, R.id.igds_component_examples_container);
        LayoutInflater A0F = C18230wP.A0F(this);
        if (AnonymousClass0wJ.A1X(AnonymousClass323.A01.getValue())) {
            str = "TEST";
        } else {
            str = "CONTROL";
        }
        IgdsBanner igdsBanner = new IgdsBanner(C18190wL.A0A(view), (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_info_outline_16);
        igdsBanner.setBody(AnonymousClass00U.A0V("This user is in the ", str, " group. Left: what the user will see based on their QE group. Right: brand refresh illustration for comparison."), false);
        A0G.addView(igdsBanner);
        Iterator A0z = AnonymousClass0wJ.A0z((Map) C551631z.A00.getValue());
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            int A04 = AnonymousClass0wJ.A04(A0o.getKey());
            int A042 = AnonymousClass0wJ.A04(A0o.getValue());
            View inflate = A0F.inflate(R.layout.igds_branding_illustration_mapping_row, A0G, false);
            C18180wK.A0G(inflate, R.id.illustration_name).setText(inflate.getResources().getResourceEntryName(A04));
            C18220wO.A0K(inflate, R.id.illustration_key).setImageResource(A04);
            C18220wO.A0K(inflate, R.id.illustration_value).setImageResource(A042);
            A0G.addView(inflate);
        }
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            r2.CtT(true);
            r2.setTitle("Branding Illustrations");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(409222238);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.igds_showcase_scrollview, viewGroup, false);
        C14030oh.A09(401879224, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
