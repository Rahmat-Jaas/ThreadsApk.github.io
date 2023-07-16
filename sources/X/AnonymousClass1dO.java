package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.instagram.barcelona.R;
import com.instagram.login.twofac.model.TrustedDevice;
import java.util.ArrayList;

/* renamed from: X.1dO  reason: invalid class name */
public final class AnonymousClass1dO extends C34640IcN implements C21735BzM, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacTrustedDevicesFragment";
    public TrustedDevice A00;
    public ListView A01;
    public C18820xx A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837165);
    }

    public final String getModuleName() {
        return "trusted_devices";
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
        TrustedDevice trustedDevice = this.A00;
        if (trustedDevice != null) {
            Integer num = trustedDevice.A03;
            if (num == null) {
                num = AnonymousClass006.A00;
                trustedDevice.A03 = num;
            }
            int intValue = num.intValue();
            if (intValue == 1) {
                C18820xx r1 = this.A02;
                if (r1 == null) {
                    C04220Ms.A0E("trustedDevicesAdapter");
                    throw null;
                }
                r1.A00.remove(trustedDevice);
                C14020og.A00(r1, -5287943);
                C63813iO.A02(requireContext(), getString(2131837162), (String) null, 0);
                C18820xx r0 = this.A02;
                if (r0 == null) {
                    C04220Ms.A0E("trustedDevicesAdapter");
                    throw null;
                } else if (r0.isEmpty()) {
                    C18190wL.A19(this);
                }
            } else if (intValue == 2) {
                C63813iO.A03(requireContext(), (String) null, 2131837161, 0);
            }
            this.A00 = null;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-816358043);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_trusted_devices_fragment, viewGroup, false);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("trusted_devices");
        if (parcelableArrayList == null) {
            parcelableArrayList = AnonymousClass0wJ.A0v();
        }
        this.A02 = new C18820xx(requireContext(), this, parcelableArrayList);
        ListView listView = (ListView) AnonymousClass0wJ.A0J(inflate, R.id.trusted_devices_listview);
        this.A01 = listView;
        if (listView == null) {
            str = "trustedDevicesListView";
        } else {
            C18820xx r0 = this.A02;
            if (r0 == null) {
                str = "trustedDevicesAdapter";
            } else {
                listView.setAdapter(r0);
                C14030oh.A09(-1968233305, A022);
                return inflate;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
