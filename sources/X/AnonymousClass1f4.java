package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1f4  reason: invalid class name */
public final class AnonymousClass1f4 extends C24281ho {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ Fragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1f4(Dialog dialog, Context context, Fragment fragment, Fragment fragment2, UserSession userSession, String str) {
        super(context, fragment, userSession, str);
        this.A00 = dialog;
        this.A01 = fragment2;
    }

    public final void A00(C21991Sy r5) {
        int A03 = C14030oh.A03(287220822);
        super.A00(r5);
        Dialog dialog = this.A00;
        dialog.dismiss();
        Fragment fragment = this.A01;
        if (fragment instanceof DialogInterface.OnCancelListener) {
            ((DialogInterface.OnCancelListener) fragment).onCancel(dialog);
        }
        C14030oh.A0A(1545807088, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-633411296);
        super.onFinish();
        Dialog dialog = this.A00;
        View findViewById = dialog.findViewById(R.id.claim_button_spinner);
        View findViewById2 = dialog.findViewById(R.id.claim_button);
        findViewById.setVisibility(8);
        findViewById2.setVisibility(0);
        C14030oh.A0A(-1407528022, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(169740461);
        super.onStart();
        Dialog dialog = this.A00;
        View findViewById = dialog.findViewById(R.id.claim_button_spinner);
        View findViewById2 = dialog.findViewById(R.id.claim_button);
        findViewById.setVisibility(0);
        findViewById2.setVisibility(8);
        C14030oh.A0A(283914326, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(2082691434);
        A00((C21991Sy) obj);
        C14030oh.A0A(1175277846, A03);
    }
}
