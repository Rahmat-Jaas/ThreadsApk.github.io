package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

/* renamed from: X.1YS  reason: invalid class name */
public final class AnonymousClass1YS extends C34640IcN {
    public static final String __redex_internal_original_name = "OneTapUpsellLogOutFragment";
    public boolean A00;
    public LinearLayout A01;
    public User A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final String getModuleName() {
        return "one_tap_upsell_logout_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i = 0;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18296294393184475L)) {
            IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(requireContext, false);
            User user = this.A02;
            if (user == null) {
                C04220Ms.A0E("user");
                throw null;
            }
            igdsPeopleCell.A09(user.BK7(), false);
            User user2 = this.A02;
            if (user2 == null) {
                C04220Ms.A0E("user");
                throw null;
            }
            igdsPeopleCell.A01((View.OnClickListener) null, user2.B4M());
            LinearLayout linearLayout = this.A01;
            if (linearLayout == null) {
                C04220Ms.A0E("linearLayout");
                throw null;
            } else {
                linearLayout.addView(igdsPeopleCell, 0);
                i = 1;
            }
        }
        IgdsListCell igdsListCell = new IgdsListCell(requireContext, (AttributeSet) null);
        igdsListCell.A0H(C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131832011));
        C18230wP.A1N(igdsListCell, this, 19);
        igdsListCell.setChecked(this.A00);
        igdsListCell.setTextCellType(AnonymousClass24V.TYPE_SWITCH);
        LinearLayout linearLayout2 = this.A01;
        if (linearLayout2 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        linearLayout2.addView(igdsListCell, i);
        LinearLayout linearLayout3 = this.A01;
        if (linearLayout3 == null) {
            C04220Ms.A0E("linearLayout");
            throw null;
        }
        TextView textView = (TextView) AnonymousClass0wJ.A0J(linearLayout3, R.id.one_tap_upsell_bottom_sheet_text_message);
        Resources A0B = AnonymousClass0wJ.A0B(this);
        User user3 = this.A02;
        if (user3 == null) {
            C04220Ms.A0E("user");
            throw null;
        } else {
            textView.setText(C18190wL.A0h(A0B, user3.BK7(), 2131832012), TextView.BufferType.NORMAL);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1619696464);
        super.onCreate(bundle);
        this.A02 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.A03));
        C14030oh.A09(292409207, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(869693156);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.one_tap_upsell_bottom_sheet_layout, viewGroup, false);
        this.A01 = (LinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.container);
        C14030oh.A09(5794415, A022);
        return inflate;
    }
}
