package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.profile.edit.fragment.CompleteYourProfileFragment;

/* renamed from: X.3mS  reason: invalid class name and case insensitive filesystem */
public final class C64503mS implements TextWatcher {
    public boolean A00 = true;
    public final /* synthetic */ CompleteYourProfileFragment A01;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C64503mS(CompleteYourProfileFragment completeYourProfileFragment) {
        this.A01 = completeYourProfileFragment;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A00) {
            CompleteYourProfileFragment completeYourProfileFragment = this.A01;
            completeYourProfileFragment.A07 = true;
            CompleteYourProfileFragment.A01(completeYourProfileFragment);
        }
    }
}
