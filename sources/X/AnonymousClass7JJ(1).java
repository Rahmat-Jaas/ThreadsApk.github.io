package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl;
import com.facebookpay.widget.listcell.ListCell;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.7JJ  reason: invalid class name */
public final class AnonymousClass7JJ {
    public final AddressTypeaheadRepositoryImpl A00;
    public final AnonymousClass7j5 A01;
    public final C104846cT A02;
    public final C128957ke A03;
    public final C128957ke A04;
    public final AnonymousClass6I9 A05;
    public final C120927Dd A06;
    public final ECPRepositoryImpl A07 = new ECPRepositoryImpl();
    public final C111466nj A08;
    public final C104896cY A09;
    public final OffsitePaymentRepositoryImpl A0A;
    public final C128167j4 A0B;
    public final C1200978m A0C = new C1200978m();
    public final C128157j3 A0D;
    public final C1198377e A0E;
    public final C143688h9 A0F;
    public final String A0G;
    public final C04560Oe A0H;
    public final Context A0I;
    public final C04560Oe A0J;
    public final C04560Oe A0K;

    public final Fragment A06(Bundle bundle, String str) {
        C04220Ms.A0B(str, 0);
        Fragment A012 = ((C113376rI) this.A0J.get()).A01(bundle, str);
        C04220Ms.A06(A012);
        return A012;
    }

    public AnonymousClass7JJ(Context context, C128957ke r3, C143688h9 r4, String str, C04560Oe r6, C04560Oe r7, C04560Oe r8) {
        this.A0I = context;
        this.A0J = r6;
        this.A0K = r7;
        this.A03 = r3;
        this.A0F = r4;
        this.A0G = str;
        this.A0H = r8;
        this.A01 = new AnonymousClass7j5(context);
        this.A0D = new C128157j3();
        this.A0E = new C1198377e();
        this.A0B = new C128167j4(context);
        this.A08 = new C111466nj();
        this.A0A = new OffsitePaymentRepositoryImpl();
        this.A06 = new C120927Dd(context);
        this.A05 = new AnonymousClass6I9();
        this.A00 = new AddressTypeaheadRepositoryImpl();
        this.A09 = new C104896cY();
        this.A02 = new C104846cT();
        this.A04 = r3;
    }

    public static C128957ke A00() {
        return AnonymousClass7Kz.A05().A04;
    }

    public static C128957ke A01() {
        return AnonymousClass7Kz.A05().A03;
    }

    public static ECPRepositoryImpl A02() {
        return AnonymousClass7Kz.A05().A07;
    }

    public static ListCell A03(Context context, ViewGroup viewGroup, AnonymousClass69U r2, AnonymousClass7JJ r3) {
        View A052 = r3.A05(context, viewGroup, r2);
        C04220Ms.A0C(A052, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
        return (ListCell) A052;
    }

    public static void A04(Fragment fragment, AnonymousClass7JJ r6) {
        Fragment A062 = r6.A06(fragment.requireArguments(), "blank_bottom_sheet_fragment");
        C04220Ms.A0C(A062, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        ((AnonymousClass5qq) A062).A0E(fragment.requireArguments(), fragment.getParentFragmentManager(), "content_nux_learn_more_fragment", (String) null);
    }

    public final View A05(Context context, ViewGroup viewGroup, AnonymousClass69U r6) {
        int i;
        boolean A1Y = AnonymousClass0wJ.A1Y(context, r6);
        this.A0K.get();
        LayoutInflater from = LayoutInflater.from(context);
        C04220Ms.A06(from);
        switch (r6.ordinal()) {
            case 0:
                i = R.layout.ecp_pux_banner;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 10:
            case 11:
            case Rfc3492Idn.tmax /*26*/:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                i = R.layout.ecp_pux_list_cell;
                break;
            case 6:
                i = R.layout.ecp_pux_list_cell_entity;
                break;
            case 8:
                i = R.layout.ecp_pux_price_table;
                break;
            case 9:
                i = R.layout.ecp_disclaimer;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 16:
            case LangUtils.HASH_SEED /*17*/:
            case 23:
                i = R.layout.ecp_accordion_view;
                break;
            case 24:
                i = R.layout.fbpay_button;
                break;
            case 25:
                i = R.layout.ecp_progress_icon_button;
                break;
            case 35:
                i = R.layout.ecp_confirmation_payment_section_view;
                break;
            case Rfc3492Idn.base /*36*/:
                i = R.layout.ecp_confirmation_product_upsell_section_header_view;
                break;
            case LangUtils.HASH_OFFSET /*37*/:
                i = R.layout.ecp_confirmation_product_upsell_view;
                break;
            case Rfc3492Idn.skew /*38*/:
                i = R.layout.ecp_anon_checkout_pux_link;
                break;
            case 39:
                i = R.layout.ecp_anon_checkout_toggle_shimmer;
                break;
            case Seq.NULL_REFNUM /*41*/:
                i = R.layout.ecp_inline_action_menu;
                break;
            case 43:
                i = R.layout.ecp_inline_back_button;
                break;
            case 44:
                i = R.layout.ecp_apm_view;
                break;
            case 45:
                i = R.layout.ecp_email_optin;
                break;
            default:
                throw C18190wL.A0a(AnonymousClass0wJ.A0t("{ECPWidgetFactory} Widget is not found for identifier => ", r6));
        }
        return C18180wK.A0D(from, viewGroup, i, A1Y);
    }
}
