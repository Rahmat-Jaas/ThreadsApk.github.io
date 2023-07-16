package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxTListenerShape296S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.groupprofiles.nux.GroupProfileNuxFragment$Row;
import com.instagram.igds.components.switchbutton.IgSwitch;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;
import kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12;
import kotlin.jvm.internal.KtLambdaShape77S0100000_I2_57;

/* renamed from: X.5wu  reason: invalid class name */
public final class AnonymousClass5wu extends C34640IcN {
    public static final String __redex_internal_original_name = "GroupProfileNuxFragment";
    public String A00;
    public AnonymousClass0ZU A01;
    public List A02;
    public boolean A03;
    public final C04530Oa A04 = C62373Zc.A03(C86164wN.A12(this, 36));
    public final C04530Oa A05;

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0J(view, R.id.group_profile_nux_detail_row_container);
        for (GroupProfileNuxFragment$Row A002 : this.A02) {
            LayoutInflater layoutInflater = getLayoutInflater();
            C04220Ms.A06(layoutInflater);
            viewGroup.addView(A00(layoutInflater, viewGroup, A002));
        }
        if (this.A03) {
            LayoutInflater layoutInflater2 = getLayoutInflater();
            C04220Ms.A06(layoutInflater2);
            View A003 = A00(layoutInflater2, viewGroup, new GroupProfileNuxFragment$Row(2131831918, 2131828095, R.drawable.instagram_alert_pano_outline_24));
            View A0G = C18200wM.A0G(A003, R.id.group_profile_nux_detail_switch_stub);
            C04220Ms.A0C(A0G, "null cannot be cast to non-null type com.instagram.igds.components.switchbutton.IgSwitch");
            IgSwitch igSwitch = (IgSwitch) A0G;
            igSwitch.A07 = new IDxTListenerShape296S0100000_2_I2(this, 5);
            viewGroup.addView(A003);
            AnonymousClass061 r5 = AnonymousClass061.STARTED;
            AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r5, this, viewLifecycleOwner, igSwitch, (C146958n9) null, 28), AnonymousClass067.A00(viewLifecycleOwner), 3);
        }
        C86104wH.A1C(view.requireViewById(R.id.group_profile_nux_confirm_button), 130, this);
        C86104wH.A1C(view.requireViewById(R.id.group_profile_nux_learn_more_button), 131, this);
    }

    public final String getModuleName() {
        return this.A00;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public AnonymousClass5wu() {
        KtLambdaShape77S0100000_I2_57 A12 = C86164wN.A12(this, 37);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C86164wN.A12(C86164wN.A12(this, 33), 34));
        this.A05 = C18220wO.A0M(C86164wN.A12(A012, 35), A12, new KtLambdaShape28S0200000_I2_12(32, (Object) null, (Object) A012), C18210wN.A0l(C21953C9n.class));
        this.A02 = AnonymousClass0ZV.A00;
        this.A00 = "";
    }

    public static final View A00(LayoutInflater layoutInflater, ViewGroup viewGroup, GroupProfileNuxFragment$Row groupProfileNuxFragment$Row) {
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.group_profile_nux_detail_row);
        C18200wM.A0J(A0H, R.id.group_profile_nux_detail_icon).setImageResource(groupProfileNuxFragment$Row.A01);
        AnonymousClass0wJ.A0L(A0H, R.id.group_profile_nux_detail_title).setText(groupProfileNuxFragment$Row.A02);
        AnonymousClass0wJ.A0L(A0H, R.id.group_profile_nux_detail_description).setText(groupProfileNuxFragment$Row.A00);
        return A0H;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(1441062822);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ArrayList parcelableArrayList = requireArguments.getParcelableArrayList("arg_detail_rows");
        if (parcelableArrayList != null) {
            this.A02 = parcelableArrayList;
            this.A03 = requireArguments.getBoolean("arg_is_notifications_enabled");
            String string = requireArguments().getString(AnonymousClass000.A00(126));
            if (string != null) {
                this.A00 = string;
                if (this.A03) {
                    ((C21953C9n) this.A05.getValue()).A00(C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(this.A04), 36318230571454739L));
                }
                C14030oh.A09(1834554356, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -145764957;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -314945200;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1285372017);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.group_profile_nux_fragment, false);
        C14030oh.A09(-1302151630, A022);
        return A0D;
    }
}
