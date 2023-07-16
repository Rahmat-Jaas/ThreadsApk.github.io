package X;

import android.app.Dialog;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxTListenerShape545S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;
import kotlin.jvm.internal.KtLambdaShape34S0200000_I2_18;

/* renamed from: X.1XW  reason: invalid class name */
public final class AnonymousClass1XW extends C19130zL {
    public final C04530Oa A00;

    public AnonymousClass1XW() {
        KtLambdaShape116S0100000_I2_96 ktLambdaShape116S0100000_I2_96 = new KtLambdaShape116S0100000_I2_96(this, 7);
        C04530Oa A01 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape116S0100000_I2_96(new KtLambdaShape116S0100000_I2_96(this, 4), 5));
        this.A00 = C18220wO.A0M(new KtLambdaShape116S0100000_I2_96(A01, 6), ktLambdaShape116S0100000_I2_96, new KtLambdaShape34S0200000_I2_18(2, (Object) null, A01), C18210wN.A0l(C19250zY.class));
    }

    public final Dialog A0C(Bundle bundle) {
        super.A0C(bundle);
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.language_locale_menu, (ViewGroup) null);
        C196310v r7 = new C196310v(new AnonymousClass4Kb(this));
        ColorFilter A01 = C63393hP.A01(requireContext(), R.color.igds_secondary_text);
        SearchEditText searchEditText = (SearchEditText) inflate.findViewById(R.id.search);
        searchEditText.getCompoundDrawablesRelative()[0].mutate().setColorFilter(A01);
        searchEditText.setClearButtonColorFilter(A01);
        searchEditText.A06 = new IDxTListenerShape545S0100000_1_I2(this, 3);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.language_locale_list);
        recyclerView.setAdapter(r7);
        requireContext();
        C18200wM.A1H(recyclerView, 1);
        recyclerView.A0U = true;
        recyclerView.setFocusableInTouchMode(true);
        recyclerView.requestFocus();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape22S0201000_I2_8(r7, this, (C146958n9) null, 20), AnonymousClass3J3.A00(getLifecycle()), 3);
        AnonymousClass3ZB r2 = new AnonymousClass3ZB(requireContext());
        r2.A0D.setText(C18220wO.A0u(C31103Gfm.A03(), C18180wK.A0g(this, 2131835428)));
        r2.A06.setVisibility(0);
        ViewGroup viewGroup = r2.A07;
        viewGroup.addView(inflate);
        viewGroup.setVisibility(0);
        I1U i1u = r2.A0E;
        i1u.setCancelable(true);
        i1u.setCanceledOnTouchOutside(true);
        return r2.A00();
    }

    public final void onActivityCreated(Bundle bundle) {
        int A02 = C14030oh.A02(1374451115);
        super.onActivityCreated(bundle);
        Window window = A05().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
            C14030oh.A09(1587719995, A02);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1256983218, A02);
        throw A0b;
    }
}
