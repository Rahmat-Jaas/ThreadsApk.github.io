package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass49A;
import X.AnonymousClass4u2;
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
import com.facebook.common.callercontext.CallerContext;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

public final class FXPFLinkageCacheUtilDebugFragment extends C34640IcN implements C82034oy {
    public final CallerContext callerContext = CallerContext.A01("FXPFLinkageCacheUtilDebugFragment");
    public final String callerName = FXPFLinkageCacheDebugFragment.callerName;
    public AnonymousClass49A linkageCacheUtil;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public String getModuleName() {
        return "fx_pf_linkage_cache_util_debug_tool";
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, "FX PF Linkage cache Debug Tool");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(2067922179);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fx_pf_linkage_cache_util_debug_fragment, viewGroup, false);
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        C04220Ms.A0B(A0X, 0);
        this.linkageCacheUtil = (AnonymousClass49A) A0X.A01(AnonymousClass49A.class, new KtLambdaShape75S0100000_I2_55(A0X, 41));
        AnonymousClass0wJ.A0K(inflate, R.id.compare_obid_button).setOnClickListener(new FXPFLinkageCacheUtilDebugFragment$onCreateView$1((IgEditText) AnonymousClass0wJ.A0J(inflate, R.id.obid_input_1), (IgEditText) AnonymousClass0wJ.A0J(inflate, R.id.obid_input_2), this));
        C14030oh.A09(149181256, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
