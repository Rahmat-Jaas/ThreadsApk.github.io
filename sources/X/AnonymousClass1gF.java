package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.1gF  reason: invalid class name */
public final class AnonymousClass1gF extends AnonymousClass436 {
    public final C11630kW A00;
    public final AnonymousClass1aS A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5L(0, obj, obj2);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gF(C11630kW r1, AnonymousClass1aS r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        LinearLayout linearLayout;
        int i2;
        IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I2;
        int A03 = C14030oh.A03(1035765544);
        AnonymousClass3CK r6 = (AnonymousClass3CK) view.getTag();
        C72144Mm r10 = (C72144Mm) obj;
        C11630kW r2 = this.A00;
        AnonymousClass1aS r5 = this.A01;
        AnonymousClass226 r11 = (AnonymousClass226) obj2;
        ImageUrl imageUrl = r10.A00.A04;
        if (imageUrl != null) {
            r6.A04.setUrl(imageUrl, r2);
        } else {
            CircularImageView circularImageView = r6.A04;
            C18180wK.A0r(circularImageView.getContext(), circularImageView, R.drawable.profile_anonymous_user);
        }
        r6.A02.setText(r10.A02());
        TextView textView = r6.A01;
        String str = r10.A00.A0D;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        int ordinal = r11.ordinal();
        if (ordinal == 1) {
            IgCheckBox igCheckBox = r6.A03;
            igCheckBox.setChecked(true);
            igCheckBox.setEnabled(true);
            linearLayout = r6.A00;
            i2 = 138;
            iDxCListenerShape70S0200000_1_I2 = new IDxCListenerShape70S0200000_1_I2(r5, r10, i2);
        } else if (ordinal != 0) {
            if (ordinal == 2) {
                IgCheckBox igCheckBox2 = r6.A03;
                igCheckBox2.setChecked(true);
                igCheckBox2.setEnabled(false);
                linearLayout = r6.A00;
                iDxCListenerShape70S0200000_1_I2 = null;
            }
            C14030oh.A0A(289050270, A03);
        } else {
            IgCheckBox igCheckBox3 = r6.A03;
            igCheckBox3.setChecked(false);
            igCheckBox3.setEnabled(true);
            linearLayout = r6.A00;
            i2 = 139;
            iDxCListenerShape70S0200000_1_I2 = new IDxCListenerShape70S0200000_1_I2(r5, r10, i2);
        }
        linearLayout.setOnClickListener(iDxCListenerShape70S0200000_1_I2);
        C14030oh.A0A(289050270, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1072609808);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_account_recovery_user_redesign);
        viewGroup2.setTag(new AnonymousClass3CK(viewGroup2));
        C14030oh.A0A(80410062, A03);
        return viewGroup2;
    }
}
