package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C23411dm;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public final class DeviceComputePlatformFragment extends C23411dm implements C82034oy {
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825136);
    }

    public String getModuleName() {
        return "device_compute_platform";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(getMenuItems());
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    private final ArrayList getMenuItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A02(new DeviceComputePlatformFragment$getMenuItems$1(this), requireContext().getString(2131825122), A0v);
        AnonymousClass4MA.A02(new DeviceComputePlatformFragment$getMenuItems$2(this), requireContext().getString(2131825109), A0v);
        AnonymousClass4MA.A02(new DeviceComputePlatformFragment$getMenuItems$3(this), requireContext().getString(2131825119), A0v);
        AnonymousClass4MA.A02(new DeviceComputePlatformFragment$getMenuItems$4(this), requireContext().getString(2131825126), A0v);
        return A0v;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
