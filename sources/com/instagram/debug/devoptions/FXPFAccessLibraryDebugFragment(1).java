package com.instagram.debug.devoptions;

import X.AnonymousClass00J;
import X.AnonymousClass0wJ;
import X.AnonymousClass3H2;
import X.AnonymousClass3VA;
import X.AnonymousClass3VD;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C34640IcN;
import X.C63693i8;
import X.C80644m9;
import X.C82034oy;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FXPFAccessLibraryDebugFragment extends C34640IcN implements C82034oy {
    public static final String ACCESS_TOKEN = "access token";
    public static final Companion Companion = new Companion();
    public static final String EMPTY_ACCESS_LIBRARY = "empty access library";
    public static final String EMPTY_REPLICATED_STORAGE = "empty replicated storage";
    public static final String NAME = "name";
    public static final String NULL_STRING = "null, no data";
    public static final String UID = "uid";
    public IgLinearLayout accessLibraryDataContainer;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public String getModuleName() {
        return "fx_pf_access_library_debug_tool";
    }

    public static /* synthetic */ View createTextView$default(FXPFAccessLibraryDebugFragment fXPFAccessLibraryDebugFragment, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return fXPFAccessLibraryDebugFragment.createTextView(str, z, z2);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A08(r2, "FX PF Access Library Debug Tool");
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final View createContentRow(String str, String str2) {
        IgLinearLayout igLinearLayout = new IgLinearLayout(requireContext());
        igLinearLayout.setOrientation(1);
        igLinearLayout.addView(createTextView(str, true, false));
        igLinearLayout.addView(createTextView(str2, false, true));
        return igLinearLayout;
    }

    private final View createTextView(String str, boolean z, boolean z2) {
        IgTextView igTextView = new IgTextView(requireContext());
        igTextView.setText(str);
        if (z) {
            igTextView.setTypeface((Typeface) null, 1);
        }
        if (z2) {
            igTextView.setOnClickListener(new FXPFAccessLibraryDebugFragment$createTextView$1(this, str));
        }
        return igTextView;
    }

    private final void genData() {
        View view;
        AnonymousClass3H2 r0 = (AnonymousClass3H2) AnonymousClass00J.A0D(C63693i8.A03(requireContext(), AnonymousClass0wJ.A0X(this.userSession$delegate), "fx_android_access_library_internal_settings", (String) null));
        IgLinearLayout igLinearLayout = this.accessLibraryDataContainer;
        if (r0 != null) {
            if (igLinearLayout == null) {
                C04220Ms.A0E("accessLibraryDataContainer");
                throw null;
            }
            AnonymousClass3VA r5 = r0.A01;
            AnonymousClass3VD r4 = r5.A01;
            String str = r4.A02;
            String str2 = NULL_STRING;
            if (str == null) {
                str = str2;
            }
            igLinearLayout.addView(createContentRow(UID, str));
            IgLinearLayout igLinearLayout2 = this.accessLibraryDataContainer;
            if (igLinearLayout2 == null) {
                C04220Ms.A0E("accessLibraryDataContainer");
                throw null;
            }
            String str3 = r4.A00;
            if (str3 == null) {
                str3 = str2;
            }
            igLinearLayout2.addView(createContentRow(NAME, str3));
            igLinearLayout = this.accessLibraryDataContainer;
            if (igLinearLayout == null) {
                C04220Ms.A0E("accessLibraryDataContainer");
                throw null;
            }
            String str4 = r5.A00;
            if (str4 != null) {
                str2 = str4;
            }
            view = createContentRow(ACCESS_TOKEN, str2);
        } else if (igLinearLayout == null) {
            C04220Ms.A0E("accessLibraryDataContainer");
            throw null;
        } else {
            view = createTextView(EMPTY_ACCESS_LIBRARY, false, false);
        }
        igLinearLayout.addView(view);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1058275969);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fx_pf_access_library_debug_fragment, viewGroup, false);
        this.accessLibraryDataContainer = (IgLinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.access_library_data);
        genData();
        C14030oh.A09(1112527357, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
