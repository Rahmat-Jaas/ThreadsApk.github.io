package X;

import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;

/* renamed from: X.3GG  reason: invalid class name */
public final class AnonymousClass3GG {
    public AnonymousClass3YI A00;
    public AnonymousClass1XY A01;
    public String A02;
    public boolean A03 = false;
    public final TextWatcher A04 = new IDxWAdapterShape193S0100000_1_I2(this, 15);
    public final AutoCompleteTextView A05;
    public final ImageView A06;
    public final TextView A07;
    public final C34640IcN A08;
    public final C10300i6 A09;
    public final AnonymousClass265 A0A;

    public final String A00() {
        CountryCodeData countryCodeData = this.A00.A04;
        if (countryCodeData == null) {
            return "";
        }
        return C63553hn.A00(countryCodeData.A00(), C18180wK.A0f(this.A05));
    }

    public AnonymousClass3GG(AutoCompleteTextView autoCompleteTextView, ImageView imageView, TextView textView, C34640IcN icN, C10300i6 r12, CountryCodeData countryCodeData, AnonymousClass265 r14) {
        this.A09 = r12;
        this.A05 = autoCompleteTextView;
        this.A06 = imageView;
        this.A0A = r14;
        this.A07 = textView;
        this.A08 = icN;
        FragmentActivity activity = icN.getActivity();
        this.A00 = new AnonymousClass3YI(activity, autoCompleteTextView, textView, r12, countryCodeData, r14);
    }
}
