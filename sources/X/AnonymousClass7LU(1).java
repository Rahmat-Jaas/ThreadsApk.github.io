package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.redex.IDxPCallbackShape23S1200000_2_I2;

/* renamed from: X.7LU  reason: invalid class name */
public final class AnonymousClass7LU implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C131567sP A01;
    public final /* synthetic */ String A02;

    public AnonymousClass7LU(Activity activity, C131567sP r2, String str) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C131567sP r5 = this.A01;
        C131567sP.A02(r5, "ctc_confirmation_dialog_call");
        Activity activity = this.A00;
        boolean A1W = C18180wK.A1W(activity.checkSelfPermission("android.permission.CALL_PHONE"));
        String str = this.A02;
        if (A1W) {
            C131567sP.A01(activity, r5, str);
            return;
        }
        C131567sP.A02(r5, "ctc_permission_request");
        AnonymousClass7K8.A02(activity, new IDxPCallbackShape23S1200000_2_I2(activity, r5, str, 0), new String[]{"android.permission.CALL_PHONE"});
    }
}
