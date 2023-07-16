package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.simplewebview.SimpleWebViewActivity;
import java.util.Calendar;

/* renamed from: X.3Zk  reason: invalid class name */
public final class AnonymousClass3Zk {
    public static final void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C04220Ms.A0B(context, 0);
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A02 = context.getString(2131824246);
        C18220wO.A14(context, A0W, 2131824243);
        A0W.A0P(onClickListener, 2131824244);
        A0W.A0O(onClickListener2, 2131824245);
        A0W.A0r(false);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static final void A02(Context context, C11630kW r8, C10300i6 r9, C82594px r10, String str, String str2) {
        AnonymousClass0wJ.A1N(context, r9);
        C04220Ms.A0B(str, 2);
        C11630kW r1 = r8;
        C63093bU.A00().A04(r1, r9, AnonymousClass006.A0N, AnonymousClass006.A0C, r10.AkY(), str);
        SimpleWebViewActivity.A01.A02(context, r9, C18250wR.A0P(str, str2));
    }

    public static final int A00(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.set(i, i2, i3);
        int i4 = instance2.get(1) - instance.get(1);
        if (instance.get(2) > instance2.get(2) || (instance.get(2) == instance2.get(2) && instance.get(5) > instance2.get(5))) {
            return i4 - 1;
        }
        return i4;
    }

    public static final void A03(TextView textView, Context context) {
        boolean A1Y = AnonymousClass0wJ.A1Y(context, textView);
        if (AnonymousClass3VH.A00().A04 == AnonymousClass006.A00) {
            textView.setTextSize(A1Y ? 1 : 0, (float) context.getResources().getDimensionPixelSize(R.dimen.auth_credential_title_text_size));
            textView.setGravity(17);
        }
    }
}
