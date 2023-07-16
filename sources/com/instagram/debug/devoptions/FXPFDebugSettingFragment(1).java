package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WZ;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C23411dm;
import X.C80644m9;
import X.C82034oy;
import X.C83964sH;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public final class FXPFDebugSettingFragment extends C23411dm implements C82034oy {
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public String getModuleName() {
        return "fx_pf_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(getMenuItems());
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, "FX Product Foundation Debugger Tool");
        }
    }

    private final ArrayList getMenuItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 fXPFDebugSettingFragment$getMenuItems$linkingCallback$1 = new FXPFDebugSettingFragment$getMenuItems$linkingCallback$1(this);
        C83964sH A01 = AnonymousClass3WZ.A01(requireActivity(), AnonymousClass0wJ.A0X(this.userSession$delegate), fXPFDebugSettingFragment$getMenuItems$linkingCallback$1);
        AnonymousClass4MA.A02(new FXPFDebugSettingFragment$getMenuItems$1(this, fXPFDebugSettingFragment$getMenuItems$linkingCallback$1, "ig_default"), "Launch linking Unified Launcher via fragment", A0v);
        AnonymousClass4MA.A02(new FXPFDebugSettingFragment$getMenuItems$2(this, fXPFDebugSettingFragment$getMenuItems$linkingCallback$1, "ig_default"), "Launch linking Unified Launcher via activity", A0v);
        AnonymousClass4MA.A02(new FXPFDebugSettingFragment$getMenuItems$3(this, fXPFDebugSettingFragment$getMenuItems$linkingCallback$1, "ig_default"), "Test Unified Launcher via SharingAccount", A0v);
        AnonymousClass4MA.A02(new FXPFDebugSettingFragment$getMenuItems$4(this, fXPFDebugSettingFragment$getMenuItems$linkingCallback$1), "Launch ig-ig linking flow(test with a linked FB account)", A0v);
        AnonymousClass4MA.A02(new FXPFDebugSettingFragment$getMenuItems$5(this, A01, "ig_default"), "Test BL linking wrapper", A0v);
        return A0v;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
