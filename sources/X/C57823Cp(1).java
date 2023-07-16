package X;

import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;

/* renamed from: X.3Cp  reason: invalid class name and case insensitive filesystem */
public final class C57823Cp {
    public C61333Su A00;
    public String A01;
    public boolean A02 = false;
    public final TextWatcher A03 = new IDxWAdapterShape193S0100000_1_I2(this, 14);
    public final AutoCompleteTextView A04;
    public final ImageView A05;

    public C57823Cp(AutoCompleteTextView autoCompleteTextView, ImageView imageView, C34640IcN icN, C10300i6 r6, AnonymousClass265 r7) {
        this.A04 = autoCompleteTextView;
        this.A05 = imageView;
        this.A00 = new C61333Su(icN.getActivity(), autoCompleteTextView, r6, r7);
    }
}
