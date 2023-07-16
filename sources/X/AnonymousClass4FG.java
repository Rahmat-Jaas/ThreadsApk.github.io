package X;

import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.4FG  reason: invalid class name */
public final class AnonymousClass4FG implements C82854qN {
    public final /* synthetic */ C201413h A00;
    public final /* synthetic */ AnonymousClass4JZ A01;

    public AnonymousClass4FG(C201413h r1, AnonymousClass4JZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void CjW(CountryCodeData countryCodeData) {
        EditPhoneNumberView editPhoneNumberView = this.A00.A00;
        if (editPhoneNumberView != null) {
            editPhoneNumberView.setCountryCodeWithCountryPrefix(countryCodeData);
        }
    }
}
