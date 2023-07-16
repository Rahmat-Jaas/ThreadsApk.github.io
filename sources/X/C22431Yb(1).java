package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxTListenerShape181S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1Yb  reason: invalid class name and case insensitive filesystem */
public final class C22431Yb extends C34640IcN {
    public static final String __redex_internal_original_name = "CaaLoginOneTapLogOutFragment";
    public C63533hk A00;
    public LinearLayout A01;
    public AnonymousClass3LL A02;
    public final ArrayList A03 = AnonymousClass0wJ.A0v();
    public final ArrayList A04 = AnonymousClass0wJ.A0v();
    public final ArrayList A05 = AnonymousClass0wJ.A0v();
    public final ArrayList A06 = AnonymousClass0wJ.A0v();
    public final HashMap A07 = AnonymousClass0wJ.A0y();
    public final HashMap A08 = AnonymousClass0wJ.A0y();
    public final C04530Oa A09 = C80644m9.A00(this);

    public final String getModuleName() {
        return "caa_login_one_tap_log_out_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        IgdsListCell igdsListCell;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C04530Oa r1 = this.A09;
        C63533hk A022 = C63533hk.A02(AnonymousClass0wJ.A0U(r1));
        C04220Ms.A06(A022);
        List A042 = AnonymousClass0wJ.A0X(r1).multipleAccountHelper.A00.A04((User) null);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("uids", A042.toString());
        A0y.put("uids_count", String.valueOf(A042.size()));
        if (this.A02 == null) {
            C04220Ms.A0E("caaLoginIgNativeLogger");
            throw null;
        }
        C10300i6 A0U = AnonymousClass0wJ.A0U(r1);
        C04220Ms.A0B(A0U, 0);
        AnonymousClass3LL.A00(A0U, "logout_password_saving_multiaccount_viewed", "logout_spi", "spi", "logout_interaction", (String) null, A0y);
        LinearLayout linearLayout = this.A01;
        if (linearLayout == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        ((TextView) AnonymousClass0wJ.A0J(linearLayout, R.id.caa_login_bottom_sheet_text_message)).setText(AnonymousClass0wJ.A0B(this).getText(2131822811));
        LinearLayout linearLayout2 = this.A01;
        if (linearLayout2 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        ((TextView) AnonymousClass0wJ.A0J(linearLayout2, R.id.caa_login_sub_tittle)).setText(AnonymousClass0wJ.A0B(this).getText(2131822812));
        Context requireContext = requireContext();
        int i = 0;
        for (Object next : A042) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            User user = (User) next;
            this.A07.put(user.getId(), Boolean.valueOf(A022.A0I(user.getId())));
            HashMap hashMap = this.A08;
            hashMap.put(user.getId(), Boolean.valueOf(A022.A0I(user.getId())));
            Boolean bool = (Boolean) hashMap.get(user.getId());
            if (bool == null) {
                bool = false;
            }
            C04220Ms.A09(bool);
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                this.A03.add(user.getId());
            } else {
                this.A04.add(user.getId());
            }
            if (hashMap.get(user.getId()) != null) {
                igdsListCell = new IgdsListCell(requireContext, (AttributeSet) null);
                igdsListCell.A0H(user.BK7());
                igdsListCell.setTextCellType(AnonymousClass24V.TYPE_SWITCH);
                igdsListCell.A0D(new IDxTListenerShape181S0200000_1_I2(5, (Object) user, (Object) this));
                igdsListCell.setChecked(booleanValue);
            } else {
                igdsListCell = null;
            }
            LinearLayout linearLayout3 = this.A01;
            if (linearLayout3 == null) {
                C04220Ms.A0E("linearLayout");
                throw null;
            } else {
                linearLayout3.addView(igdsListCell, i + 2);
                i = i2;
            }
        }
        ArrayList arrayList = this.A03;
        if (arrayList.size() > 0) {
            if (this.A02 == null) {
                C04220Ms.A0E("caaLoginIgNativeLogger");
                throw null;
            }
            C10300i6 A0U2 = AnonymousClass0wJ.A0U(r1);
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            A0y2.put("uids", arrayList.toString());
            A0y2.put("uids_count", String.valueOf(arrayList.size()));
            C04220Ms.A0B(A0U2, 0);
            AnonymousClass3LL.A00(A0U2, "logout_password_saving_multiaccount_existing_opt_in", "logout_spi", "spi", "logout_interaction", (String) null, A0y2);
        }
        ArrayList arrayList2 = this.A04;
        if (arrayList2.size() <= 0) {
            return;
        }
        if (this.A02 == null) {
            C04220Ms.A0E("caaLoginIgNativeLogger");
            throw null;
        }
        C10300i6 A0U3 = AnonymousClass0wJ.A0U(r1);
        HashMap A0y3 = AnonymousClass0wJ.A0y();
        A0y3.put("uids", arrayList2.toString());
        A0y3.put("uids_count", String.valueOf(arrayList2.size()));
        C04220Ms.A0B(A0U3, 0);
        AnonymousClass3LL.A00(A0U3, "logout_password_saving_multiaccount_existing_opt_out", "logout_spi", "spi", "logout_interaction", (String) null, A0y3);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A09);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1482260208);
        super.onCreate(bundle);
        C63533hk A023 = C63533hk.A02(AnonymousClass0wJ.A0U(this.A09));
        C04220Ms.A06(A023);
        this.A00 = A023;
        this.A02 = new AnonymousClass3LL();
        C14030oh.A09(-1584959526, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-226627745);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.caa_login_one_tap_bottom_sheet, viewGroup, false);
        this.A01 = (LinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.container);
        C14030oh.A09(-388695454, A022);
        return inflate;
    }
}
