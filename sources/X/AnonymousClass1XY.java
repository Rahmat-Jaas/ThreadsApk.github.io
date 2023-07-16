package X;

import android.app.Dialog;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.redex.IDxCListenerShape538S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1XY  reason: invalid class name */
public final class AnonymousClass1XY extends C19130zL {
    public C10300i6 A00;
    public C82854qN A01;
    public C18780xt A02;
    public SearchEditText A03;
    public List A04;

    public final Dialog A0C(Bundle bundle) {
        super.A0C(bundle);
        AnonymousClass3ZB r4 = new AnonymousClass3ZB(getContext());
        r4.A0D.setText(getString(2131835427).toUpperCase(Locale.getDefault()));
        r4.A06.setVisibility(0);
        View A0E = C18240wQ.A0E(C18230wP.A0F(this), R.layout.dialog_country_codes);
        AbsListView absListView = (AbsListView) A0E.requireViewById(R.id.country_code_list);
        SearchEditText searchEditText = (SearchEditText) A0E.requireViewById(R.id.search);
        this.A03 = searchEditText;
        searchEditText.A06 = new AnonymousClass4MM(this);
        ColorFilter A012 = C63393hP.A01(getContext(), R.color.igds_secondary_text);
        this.A03.getCompoundDrawablesRelative()[0].mutate().setColorFilter(A012);
        this.A03.setClearButtonColorFilter(A012);
        C18780xt r0 = new C18780xt(getContext(), this.A04);
        this.A02 = r0;
        absListView.setAdapter(r0);
        ViewGroup viewGroup = r4.A07;
        viewGroup.addView(A0E);
        viewGroup.setVisibility(0);
        I1U i1u = r4.A0E;
        i1u.setCancelable(true);
        i1u.setCanceledOnTouchOutside(true);
        Dialog A002 = r4.A00();
        absListView.setOnItemClickListener(new IDxCListenerShape538S0100000_1_I2(this, 1));
        return A002;
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = C14030oh.A02(1913745824);
        super.onActivityCreated(bundle);
        this.A02.getWindow().setSoftInputMode(36);
        C14030oh.A09(-1897744351, A022);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1698677988);
        super.onCreate(bundle);
        this.A00 = C18190wL.A0S(this.mArguments);
        GQp gQp = new GQp((TelephonyManager) requireContext().getSystemService("phone"));
        PhoneNumberUtil A012 = PhoneNumberUtil.A01(getContext());
        this.A04 = AnonymousClass0wJ.A0v();
        for (Locale locale : new AnonymousClass4O3(gQp, Locale.getDefault().getLanguage())) {
            int A06 = A012.A06(locale.getCountry());
            if (A06 != 0) {
                this.A04.add(new CountryCodeData(String.valueOf(A06), locale.getDisplayCountry(), locale.getCountry()));
            }
        }
        Collections.sort(this.A04);
        C14030oh.A09(1129334271, A022);
    }
}
