package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C08380dH;
import X.C09120et;
import X.C23411dm;
import X.C63273h9;
import X.C63613hu;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public final class HomeDeliveryDebugToolFragment extends C23411dm implements C82034oy {
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public String getModuleName() {
        return "home_delivery_debug_tool";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(getMenuItems());
    }

    private final void addFeedOptions(ArrayList arrayList) {
        C63613hu.A01("Feed", arrayList);
        C08380dH r3 = C09120et.A3D;
        AnonymousClass4MC.A07(HomeDeliveryDebugToolFragment$addFeedOptions$1.INSTANCE, arrayList, 2131825318, AnonymousClass0wJ.A1V(r3.A00().A1j));
        AnonymousClass4MC.A07(HomeDeliveryDebugToolFragment$addFeedOptions$2.INSTANCE, arrayList, 2131825181, AnonymousClass0wJ.A1V(r3.A00().A0s));
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, "Home Delivery Debug Tool");
        }
    }

    private final void addStoriesOptions(ArrayList arrayList) {
        C63273h9.A02(arrayList);
        C63613hu.A01("Stories", arrayList);
        AnonymousClass4MA.A03(new HomeDeliveryDebugToolFragment$addStoriesOptions$1(this), arrayList, 2131825040);
        C08380dH r3 = C09120et.A3D;
        AnonymousClass4MC.A07(HomeDeliveryDebugToolFragment$addStoriesOptions$2.INSTANCE, arrayList, 2131825551, AnonymousClass0wJ.A1V(r3.A00().A1y));
        AnonymousClass4MC.A07(HomeDeliveryDebugToolFragment$addStoriesOptions$3.INSTANCE, arrayList, 2131825182, AnonymousClass0wJ.A1V(r3.A00().A0t));
    }

    private final ArrayList getMenuItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        addFeedOptions(A0v);
        addStoriesOptions(A0v);
        return A0v;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
