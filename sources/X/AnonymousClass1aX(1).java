package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.request.IDxDCallbackShape173S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2;

/* renamed from: X.1aX  reason: invalid class name */
public final class AnonymousClass1aX extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "LoginNotificationApproveFragment";
    public double A00;
    public double A01;
    public TextView A02;
    public TextView A03;
    public UserSession A04;
    public Integer A05;
    public Integer A06 = AnonymousClass006.A0C;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public View A0C;
    public View A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public IgSimpleImageView A0I;
    public String A0J;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtT(true);
        r2.Cqb(2131830151);
    }

    public final String getModuleName() {
        return "login_notification";
    }

    private void A00() {
        int i;
        TextView textView = this.A0G;
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A04;
        AnonymousClass3Zw.A03(new IDxCSpanShape63S0200000_1_I2(requireActivity, userSession, requireActivity.getColor(R.color.igds_primary_button), 11), textView, requireActivity.getString(2131830174), requireActivity.getString(2131830158));
        Integer num = this.A06;
        if (num == AnonymousClass006.A0C) {
            this.A0D.setVisibility(0);
            this.A0C.setVisibility(0);
            this.A0F.setVisibility(8);
            this.A0E.setText(2131830157);
            C18180wK.A0r(requireContext(), this.A0I, R.drawable.instagram_device_phone_outline_24);
            return;
        }
        if (num == AnonymousClass006.A0N) {
            this.A0C.setVisibility(8);
            this.A0H.setText(2131830159);
            this.A0F.setVisibility(0);
            this.A0F.setText(AnonymousClass0wJ.A0o(this, this.A0J, 2131830149));
            C18180wK.A0r(requireContext(), this.A0I, R.drawable.instagram_circle_check_pano_filled_24);
            i = 2131830155;
        } else if (num == AnonymousClass006.A0Y) {
            this.A0C.setVisibility(8);
            this.A0H.setText(2131830160);
            this.A0F.setVisibility(0);
            this.A0F.setText(AnonymousClass0wJ.A0o(this, this.A0J, 2131830164));
            C18180wK.A0r(requireContext(), this.A0I, R.drawable.instagram_circle_x_filled_24);
            i = 2131830156;
        } else {
            Integer num2 = AnonymousClass006.A00;
            this.A0D.setVisibility(8);
            Context requireContext = requireContext();
            if (num == num2) {
                C63813iO.A0A(requireContext, 2131830169, 1);
                return;
            }
            C63813iO.A03(requireContext, "something_went_wrong", 2131836068, 0);
            C10450iM.A03("login_notification", "Unknown login notification state!");
            return;
        }
        TextView textView2 = this.A0E;
        FragmentActivity requireActivity2 = requireActivity();
        UserSession userSession2 = this.A04;
        AnonymousClass3Zw.A03(new IDxCSpanShape63S0200000_1_I2(requireActivity2, userSession2, requireActivity2.getColor(R.color.igds_primary_button), 10), textView2, requireActivity2.getString(2131830170), requireActivity2.getString(i));
    }

    public static void A03(AnonymousClass1aX r3, Integer num) {
        if (r3.A0J == null) {
            r3.A0J = C19591Ayr.A05(r3.requireContext(), System.currentTimeMillis());
        }
        r3.A06 = num;
        r3.A00();
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public static void A01(Context context, AnonymousClass1aX r3) {
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131830154);
        A0W.A0K(2131830153);
        C18180wK.A1O(A0W, r3, 186, 2131830152);
        A0W.A0O((DialogInterface.OnClickListener) null, 2131830163);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static void A02(Context context, AnonymousClass1aX r3) {
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131830168);
        A0W.A0K(2131830167);
        C18180wK.A1O(A0W, r3, 185, 2131830166);
        A0W.A0O((DialogInterface.OnClickListener) null, 2131830163);
        AnonymousClass0wJ.A1K(A0W);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 168 && i2 == -1) {
            C63813iO.A00(requireContext(), 2131830162);
        }
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int i;
        int A022 = C14030oh.A02(557677236);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = C18180wK.A0V(requireArguments);
        this.A00 = requireArguments.getDouble("ARG_LOCATION_LATITUDE", 0.0d);
        this.A01 = requireArguments.getDouble("ARG_LOCATION_LONGITUDE", 0.0d);
        this.A07 = requireArguments.getString("ARG_DEVICE_NAME", "");
        this.A08 = requireArguments.getString("ARG_LOCATION_NAME", "");
        this.A0A = requireArguments.getString("ARG_TIMESTAMP", "");
        this.A09 = requireArguments.getString("ARG_REQUEST_DEVICE_ID", "");
        this.A0B = requireArguments.getString("ARG_TWO_FAC_IDENTIFIER", "");
        int i2 = requireArguments.getInt("ARG_USER_ACTION", 3);
        Integer[] A1a = C18240wQ.A1a();
        int length = A1a.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                num = A1a[i3];
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != i2) {
                    i3++;
                }
            } else {
                num = AnonymousClass006.A0N;
            }
        }
        this.A05 = num;
        C14030oh.A09(-1049868317, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1420501245);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.login_notification_approve);
        this.A0D = A0H2;
        this.A0H = AnonymousClass0wJ.A0L(A0H2, R.id.title);
        this.A0E = AnonymousClass0wJ.A0L(this.A0D, R.id.description);
        View requireViewById = this.A0D.requireViewById(R.id.map_item);
        this.A02 = AnonymousClass0wJ.A0L(requireViewById, R.id.left_button);
        this.A03 = AnonymousClass0wJ.A0L(requireViewById, R.id.right_button);
        this.A0I = (IgSimpleImageView) requireViewById.requireViewById(R.id.status_icon);
        this.A0F = AnonymousClass0wJ.A0L(requireViewById, R.id.confirm_text);
        this.A0C = requireViewById.requireViewById(R.id.button_container);
        this.A0G = AnonymousClass0wJ.A0L(this.A0D, R.id.footer);
        Context requireContext = requireContext();
        TextView A0L = AnonymousClass0wJ.A0L(requireViewById, R.id.title_message);
        TextView A0L2 = AnonymousClass0wJ.A0L(requireViewById, R.id.body_message_timestamp);
        TextView A0L3 = AnonymousClass0wJ.A0L(requireViewById, R.id.body_message_device);
        IgStaticMapView igStaticMapView = (IgStaticMapView) requireViewById.requireViewById(R.id.login_activity_map_view);
        this.A02.setText(2131830150);
        AnonymousClass0wJ.A18(this.A02, 234, requireContext, this);
        this.A03.setText(2131830165);
        AnonymousClass0wJ.A18(this.A03, 235, requireContext, this);
        igStaticMapView.A07 = C29007Ffw.TOP_RIGHT;
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("review_suspicious_login_map");
        staticMapView$StaticMapOptions.A02(this.A00, this.A01);
        A0L.setText(this.A08);
        try {
            A0L2.setText(C19591Ayr.A04(requireContext, Double.parseDouble(this.A0A)));
        } catch (NumberFormatException unused) {
            A0L2.setVisibility(8);
        }
        A0L3.setText(this.A07);
        staticMapView$StaticMapOptions.A03(11);
        igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
        A00();
        View view = this.A0D;
        C14030oh.A09(856983724, A022);
        return view;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.A06 == AnonymousClass006.A0C) {
            UserSession userSession = this.A04;
            String BK7 = C18250wR.A0R(userSession).BK7();
            String str = this.A09;
            String str2 = this.A0B;
            H1T A0N = AnonymousClass0wJ.A0N(userSession);
            A0N.A0J("two_factor/check_trusted_notification_status/");
            A0N.A0O(C63833iQ.A06(), BK7);
            A0N.A0P(C63833iQ.A09(A0N, C63833iQ.A00(), str), str2);
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C22221Tw.class, C60563Pp.class);
            A0T.A00 = new IDxDCallbackShape173S0100000_1_I2(getParentFragmentManager(), this, 10);
            schedule(A0T);
        }
    }
}
