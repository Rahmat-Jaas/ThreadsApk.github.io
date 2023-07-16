package X;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.1xT  reason: invalid class name and case insensitive filesystem */
public final class C29191xT extends C23411dm implements C82034oy, C81404nj {
    public static final String __redex_internal_original_name = "CameraSettingsFragment";
    public C84534tJ A00;
    public int A01 = -1;
    public boolean A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C82434pc A04 = new AnonymousClass4AU(this);

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        C84534tJ r0 = this.A00;
        if (r0 != null) {
            r3.Cqb(r0.BH6());
            C84534tJ r02 = this.A00;
            if (r02 != null) {
                if (r02.Csv()) {
                    r3.CtT(true);
                    return;
                } else {
                    r3.A7X(C18190wL.A0H(this, 269), 2131826219);
                    return;
                }
            }
        }
        C04220Ms.A0E("cameraSettingsController");
        throw null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C84534tJ r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("cameraSettingsController");
            throw null;
        } else {
            setItems(r0.AvI());
        }
    }

    public final String getModuleName() {
        C84534tJ r0 = this.A00;
        if (r0 != null) {
            return r0.getModuleName();
        }
        C04220Ms.A0E("cameraSettingsController");
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        C84534tJ r6;
        int A022 = C14030oh.A02(-1638054176);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("ReelSettingsFragment.ARGUMENT_CAMERA_SETTINGS_MODE");
        if (serializable != null) {
            int ordinal = ((AnonymousClass22K) serializable).ordinal();
            if (ordinal == 0) {
                r6 = new AnonymousClass4AW(requireActivity(), requireContext(), AnonymousClass0wJ.A0X(this.A03));
            } else if (ordinal == 2) {
                r6 = new AnonymousClass4AX(requireContext(), AnonymousClass0wJ.A0B(this), requireActivity(), AnonymousClass228.CAMERA_SETTINGS, AnonymousClass0wJ.A0X(this.A03), this);
            } else {
                throw C18180wK.A0a("Not a valid camera settings mode");
            }
            C84534tJ r62 = r6;
            this.A00 = r62;
            if (r62 == null) {
                C04220Ms.A0E("cameraSettingsController");
                throw null;
            }
            r62.Cp1(this.A04);
            this.A02 = requireArguments.getBoolean("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_SCROLL_TO_AUTO_SAVE_SETTINGS", false);
            C14030oh.A09(1920119088, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1805228187, A022);
        throw A0b;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1595978341);
        super.onDestroy();
        C84534tJ r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("cameraSettingsController");
            throw null;
        }
        r0.onDestroy();
        C14030oh.A09(119752673, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(339453987);
        super.onResume();
        C84534tJ r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("cameraSettingsController");
            throw null;
        }
        List AvI = r0.AvI();
        setItems(AvI);
        int size = AvI.size() - 1;
        this.A01 = size;
        if (this.A02 && size != -1) {
            getScrollingViewProxy().Cpc(this.A01);
        }
        C14030oh.A09(1951626944, A022);
    }
}
