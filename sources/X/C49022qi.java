package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.facebook.redex.IDxCListenerShape122S0000000_1_I2;
import com.facebook.redex.IDxCListenerShape2S1300000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.2qi  reason: invalid class name and case insensitive filesystem */
public final class C49022qi {
    public static Dialog A00(Activity activity, DialogInterface.OnDismissListener onDismissListener, C11630kW r11, C10300i6 r12, Integer num, String str, String str2) {
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A0L(2131834566);
        A0W.A0p(C18220wO.A0i(activity.getResources(), str, 2131834563));
        A0W.A0P(new IDxCListenerShape2S1300000_1_I2(r11, r12, num, str2, 3), 2131835182);
        A0W.A0O(new IDxCListenerShape122S0000000_1_I2(2), 2131831869);
        A0W.A0e(onDismissListener);
        A0W.A0I(R.drawable.instagram_lock_outline_96);
        return A0W.A0G();
    }
}
