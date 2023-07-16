package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.7LY  reason: invalid class name */
public final class AnonymousClass7LY implements DialogInterface.OnClickListener {
    public final /* synthetic */ C112556pn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass7LY(C112556pn r1, String str, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C112556pn r3 = this.A00;
        String str = this.A01;
        boolean z = this.A03;
        Intent A0B = C18190wL.A0B(str);
        Context context = r3.A02;
        if (z) {
            C16430t3.A01(context, A0B);
        } else {
            C18230wP.A0O().A09(context, A0B);
        }
        if (this.A02 && (context instanceof TransparentModalActivity)) {
            ((ModalActivity) context).finish();
        }
    }
}
