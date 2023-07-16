package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.barcelona.R;
import com.instagram.login.twofac.model.TrustedDevice;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.1Y5  reason: invalid class name */
public final class AnonymousClass1Y5 extends C34640IcN {
    public static final String __redex_internal_original_name = "TwoFacTrustedDevicesBottomSheetFragment";
    public TrustedDevice A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "trusted_devices";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-2057698876);
        super.onCreate(bundle);
        TrustedDevice trustedDevice = (TrustedDevice) requireArguments().getParcelable("trusted_device");
        if (trustedDevice == null) {
            trustedDevice = new TrustedDevice();
        }
        this.A00 = trustedDevice;
        C14030oh.A09(-10659869, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A04;
        int A02 = C14030oh.A02(1615699175);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.two_fac_trusted_devices_map_bottom_sheet, false);
        IgStaticMapView igStaticMapView = (IgStaticMapView) A0D.requireViewById(R.id.trusted_device_map_view);
        igStaticMapView.setEnabled(true);
        igStaticMapView.A07 = C29007Ffw.TOP_LEFT;
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("review_suspicious_login_map");
        TrustedDevice trustedDevice = this.A00;
        if (trustedDevice != null) {
            staticMapView$StaticMapOptions.A02(trustedDevice.A00, trustedDevice.A01);
            TrustedDevice trustedDevice2 = this.A00;
            if (trustedDevice2 != null) {
                staticMapView$StaticMapOptions.A01(trustedDevice2.A00 + 0.0275d, trustedDevice2.A01);
                staticMapView$StaticMapOptions.A03(11);
                igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
                TextView A0L = AnonymousClass0wJ.A0L(A0D, R.id.trusted_device_map_platform);
                TrustedDevice trustedDevice3 = this.A00;
                if (trustedDevice3 != null) {
                    A0L.setText(trustedDevice3.A05);
                    TextView textView = (TextView) AnonymousClass0wJ.A0J(A0D, R.id.trusted_device_map_time);
                    TrustedDevice trustedDevice4 = this.A00;
                    if (trustedDevice4 != null) {
                        if (trustedDevice4.A09) {
                            C18180wK.A0s(requireContext(), textView, R.color.igds_success);
                        }
                        TrustedDevice trustedDevice5 = this.A00;
                        if (trustedDevice5 != null) {
                            if (trustedDevice5.A09) {
                                A04 = C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131837160);
                            } else {
                                Context requireContext = requireContext();
                                TrustedDevice trustedDevice6 = this.A00;
                                if (trustedDevice6 != null) {
                                    A04 = C19591Ayr.A04(requireContext, (double) trustedDevice6.A02);
                                }
                            }
                            textView.setText(A04);
                            String A0g = C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131826227);
                            TrustedDevice trustedDevice7 = this.A00;
                            if (trustedDevice7 != null) {
                                AnonymousClass0wJ.A0L(A0D, R.id.trusted_device_map_location).setText(AnonymousClass00U.A0L(A0g, trustedDevice7.A07));
                                AnonymousClass0wJ.A16(A0D.requireViewById(R.id.trusted_device_map_remove_button), 553, this);
                                C14030oh.A09(841007472, A02);
                                return A0D;
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E("trustedDevice");
        throw null;
    }
}
