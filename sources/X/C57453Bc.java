package X;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.instagram.barcelona.R;

/* renamed from: X.3Bc  reason: invalid class name and case insensitive filesystem */
public final class C57453Bc {
    public Context A00;
    public final C34640IcN A01;
    public final AnonymousClass3HV A02;
    public final AnonymousClass3CM A03;

    public C57453Bc(View view, AutoCompleteTextView autoCompleteTextView, C34640IcN icN, C82734qB r18, C07530bf r19, AnonymousClass265 r20) {
        C34640IcN icN2 = icN;
        this.A01 = icN2;
        this.A00 = icN2.requireContext();
        Context requireContext = icN2.requireContext();
        AnonymousClass3HV r0 = AnonymousClass3HV.A04;
        if (r0 == null) {
            AnonymousClass3R8.A00(requireContext);
            r0 = new AnonymousClass3HV();
            AnonymousClass3HV.A04 = r0;
        }
        this.A02 = r0;
        AutoCompleteTextView autoCompleteTextView2 = autoCompleteTextView;
        C07530bf r8 = r19;
        AnonymousClass3CM r4 = new AnonymousClass3CM(this.A00, autoCompleteTextView2, icN2, r8, new AnonymousClass35S(AnonymousClass4EO.A00), r18, r20, AnonymousClass0wJ.A0B(icN2).getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material), true);
        this.A03 = r4;
        C34640IcN icN3 = this.A01;
        r4.A00 = new ArrayAdapter(icN3.getActivity(), R.layout.row_autocomplete_email, AnonymousClass3PY.A00(icN3.requireActivity(), r8));
        autoCompleteTextView2.addOnLayoutChangeListener(new C65573tf(AnonymousClass0wJ.A0B(icN2), view, autoCompleteTextView2));
    }
}
