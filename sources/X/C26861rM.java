package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.barcelona.R;

/* renamed from: X.1rM  reason: invalid class name and case insensitive filesystem */
public final class C26861rM extends AnonymousClass1d9 {
    public static final String __redex_internal_original_name = "RecoveryEmailVerifyFragment";
    public String A00;
    public boolean A01;
    public Dialog A02;
    public AnonymousClass3V1 A03;

    public final AnonymousClass265 BDt() {
        return AnonymousClass265.A1C;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(186371889);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass7Ko.A07(bundle2, "Arguments in RecoveryEmailVerifyFragment cannot be null.");
        this.A02 = AnonymousClass0RA.A0C.A04(bundle2);
        this.A00 = C18190wL.A0j(bundle2, "lookup_user_input");
        this.A06 = bundle2.getString("lookup_email");
        this.A01 = C18240wQ.A1S(bundle2, "arg_is_multiple_account_recovery");
        AnonymousClass3V1 A002 = AnonymousClass3V1.A00(bundle2);
        this.A03 = A002;
        C10300i6 r2 = this.A02;
        AnonymousClass0wJ.A1N(r2, "recovery_email_code_confirmation");
        AnonymousClass3YT.A00(r2, A002, (C313625r) null, (Integer) null, "recovery_email_code_confirmation", (String) null);
        C14030oh.A09(-226510578, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(389204690);
        super.onStop();
        Dialog dialog = this.A02;
        if (dialog != null && dialog.isShowing()) {
            this.A02.dismiss();
        }
        C14030oh.A09(1519173988, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && this.A01 && this.A02 == null) {
            C25828Dsm A0W = C18190wL.A0W(activity);
            A0W.A0L(2131830195);
            A0W.A0p(AnonymousClass0wJ.A0o(this, this.A06, 2131830194));
            A0W.A0I(R.drawable.confirmation_icon);
            A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
            Dialog A0G = A0W.A0G();
            this.A02 = A0G;
            C13950oZ.A00(A0G);
            C63313hF A0B = AnonymousClass269.A0W.A0B(this.A02);
            AnonymousClass265 r0 = AnonymousClass265.A1C;
            C15730rn A05 = A0B.A05();
            C18250wR.A19(A05, r0.A01);
            this.A03.A00.putString(C18240wQ.A0g("RECOVERY_CODE_TYPE"), "email");
            this.A03.A02(A05);
            C18180wK.A1K(A05, this.A02);
        }
        AnonymousClass01V.A0p.markerAnnotate(725096125, DatePickerDialogModule.ARG_MODE, "email");
        AnonymousClass01V.A0p.markerEnd(725096125, 2);
    }
}
