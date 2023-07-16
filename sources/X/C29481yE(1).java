package X;

import android.text.Editable;
import android.text.TextUtils;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.1yE  reason: invalid class name and case insensitive filesystem */
public final class C29481yE extends C64493mQ {
    public final /* synthetic */ C313225m A00;
    public final /* synthetic */ AnonymousClass4tH A01;
    public final /* synthetic */ EditPhoneNumberView A02;

    public C29481yE(C313225m r1, AnonymousClass4tH r2, EditPhoneNumberView editPhoneNumberView) {
        this.A02 = editPhoneNumberView;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void afterTextChanged(Editable editable) {
        C313225m r1 = this.A00;
        if (r1 == C313225m.ARGUMENT_EDIT_PROFILE_FLOW || r1 == C313225m.ARGUMENT_TWOFAC_FLOW) {
            int i = 0;
            if (TextUtils.isEmpty(editable.toString())) {
                i = 8;
            }
            this.A02.A02.setVisibility(i);
        }
        AnonymousClass4tH r0 = this.A01;
        r0.CRi();
        r0.CSm();
    }
}
