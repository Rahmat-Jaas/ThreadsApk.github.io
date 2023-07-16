package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.task.IDxLTaskShape133S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.1x7  reason: invalid class name */
public final class AnonymousClass1x7 extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "AppUpdatesFragment";
    public AnonymousClass3TJ A00;
    public C28161tl A01;
    public C50252sh A02;
    public AnonymousClass3TL A03;
    public AnonymousClass4MC A04;
    public AnonymousClass4MC A05;
    public AnonymousClass4MC A06;
    public UserSession A07;
    public final List A08 = AnonymousClass0wJ.A0v();

    public final String getModuleName() {
        return "app_updates_settings";
    }

    public static void A0B(AnonymousClass1x7 r3) {
        boolean z = r3.A01.A00.getBoolean("oxp_allow_app_updates", true);
        List list = r3.A08;
        if (z) {
            list.remove(r3.A03);
        } else {
            list.add(1, r3.A03);
        }
        r3.setItems(list);
    }

    public static void A0C(AnonymousClass1x7 r13, boolean z) {
        if (r13.A00 != null) {
            boolean z2 = r13.A01.A00.getBoolean("oxp_allow_app_updates", true);
            AnonymousClass3TJ r1 = r13.A00;
            if (z2 != r1.A02) {
                r1.A02 = z2;
                C31155GhB.A03(new C25041le(r13, (AnonymousClass4MC) null, z2, false));
            }
            boolean z3 = r13.A01.A00.getBoolean("oxp_show_app_update_available_notifications", true);
            AnonymousClass3TJ r12 = r13.A00;
            if (z3 != r12.A04) {
                r12.A04 = z3;
                C31155GhB.A03(new C25041le(r13, (AnonymousClass4MC) null, z3, false));
            }
            boolean z4 = r13.A01.A00.getBoolean("oxp_show_app_update_installed_notifications", true);
            AnonymousClass3TJ r14 = r13.A00;
            if (z4 != r14.A05) {
                r14.A05 = z4;
                C31155GhB.A03(new C25041le(r13, (AnonymousClass4MC) null, z4, false));
            }
        }
        AnonymousClass4MC A042 = AnonymousClass4MC.A04(new IDxCListenerShape267S0100000_1_I2((Object) r13, 32), r13, 20, 2131821678, r13.A01.A00.getBoolean("oxp_allow_app_updates", true));
        r13.A06 = A042;
        if (z) {
            A042.A0E = true;
            A042.A0C = false;
        }
        List list = r13.A08;
        list.add(A042);
        C63293hC.A01(r13, list, 2131821674);
        AnonymousClass3TL r15 = new AnonymousClass3TL((CharSequence) r13.getString(2131821682));
        r13.A03 = r15;
        r15.A01 = 16;
        r15.A06 = new C57853Cs(AnonymousClass0wJ.A0B(r13).getDimensionPixelSize(R.dimen.add_account_icon_circle_radius), AnonymousClass0wJ.A0B(r13).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), AnonymousClass0wJ.A0B(r13).getDimensionPixelSize(R.dimen.add_account_icon_circle_radius), AnonymousClass0wJ.A0B(r13).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), AnonymousClass0wJ.A0B(r13).getDimensionPixelSize(R.dimen.add_account_icon_circle_radius), AnonymousClass0wJ.A0B(r13).getDimensionPixelSize(R.dimen.add_account_icon_circle_radius));
        r13.A03.A04 = new ColorDrawable(r13.getContext().getColor(R.color.row_warning_background));
        r13.A03.A03 = R.style.FullPriceSubtitleStyle;
        A0B(r13);
        C63613hu.A04(list, 2131821681);
        AnonymousClass4MC A043 = AnonymousClass4MC.A04(new IDxCListenerShape267S0100000_1_I2((Object) r13, 33), r13, 21, 2131821671, r13.A01.A00.getBoolean("oxp_show_app_update_available_notifications", true));
        r13.A04 = A043;
        if (z) {
            A043.A0E = true;
            A043.A0C = false;
        }
        list.add(A043);
        C63293hC.A01(r13, list, 2131821670);
        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18305215040066821L)) {
            AnonymousClass4MC r16 = new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new IDxCListenerShape267S0100000_1_I2((Object) r13, 34), (CharSequence) r13.getString(2131821673), r13.A01.A00.getBoolean("oxp_show_app_update_installed_notifications", true));
            r13.A05 = r16;
            if (z) {
                r16.A0E = true;
                r16.A0C = false;
            }
            list.add(r16);
            C63293hC.A01(r13, list, 2131821672);
        }
        if (z) {
            C50252sh r0 = new C50252sh();
            r13.A02 = r0;
            list.add(0, r0);
            C18200wM.A0H(r13).setPadding(0, 0, 0, C18220wO.A03(AnonymousClass0wJ.A0B(r13)));
        }
        r13.setItems(list);
    }

    public static void A0D(AnonymousClass1x7 r3, boolean z) {
        AnonymousClass0wJ.A13(C28161tl.A02(r3.A01), "oxp_show_app_update_available_notifications", z);
        r3.A00.A04 = z;
        C31155GhB.A03(new C25041le(r3, r3.A04, z, true));
    }

    public static void A0E(AnonymousClass1x7 r3, boolean z) {
        AnonymousClass0wJ.A13(C28161tl.A02(r3.A01), "oxp_allow_app_updates", z);
        r3.A00.A02 = z;
        C31155GhB.A03(new C25041le(r3, r3.A06, z, true));
        A0B(r3);
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131821355);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1906209947);
        super.onCreate(bundle);
        UserSession A0V = C18180wK.A0V(this.mArguments);
        this.A07 = A0V;
        this.A01 = AnonymousClass3WS.A01(A0V);
        C14030oh.A09(639307350, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1962246541);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.appupdate_settings_layout);
        C31155GhB.A03(new IDxLTaskShape133S0100000_1_I2(this, 2));
        C14030oh.A09(71232756, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(918940991);
        super.onResume();
        setItems(this.A08);
        C14030oh.A09(1716995254, A022);
    }
}
