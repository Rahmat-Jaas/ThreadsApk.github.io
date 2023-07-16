package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxPCallbackShape32S0400000_2_I2;

/* renamed from: X.6Op  reason: invalid class name and case insensitive filesystem */
public final class C100776Op {
    public static Object A00(AnonymousClass601 r8, C63893iY r9) {
        FragmentActivity fragmentActivity;
        IDxPCallbackShape32S0400000_2_I2 iDxPCallbackShape32S0400000_2_I2;
        String str;
        C63893iY r7 = r9;
        Object A0B = C63893iY.A0B(r9, 4);
        if (A0B instanceof String) {
            String str2 = (String) A0B;
            AnonymousClass601 r6 = r8;
            if (str2.equals("MEDIA_PICKER")) {
                Context context = C63913ic.A0D(r8).A00;
                if (context.checkSelfPermission(AnonymousClass7CJ.A00(context)) == 0) {
                    AnonymousClass7CJ.A02(context, r6, r9);
                    return null;
                }
                C04220Ms.A0B(r6, 0);
                fragmentActivity = C63913ic.A01(r6).getActivity();
                if (fragmentActivity != null) {
                    iDxPCallbackShape32S0400000_2_I2 = new IDxPCallbackShape32S0400000_2_I2(fragmentActivity, context, r6, r7, 0);
                    str = AnonymousClass7CJ.A00(context);
                }
            } else if (str2.equals("CAMERA")) {
                Context context2 = C63913ic.A0D(r8).A00;
                str = "android.permission.CAMERA";
                if (C18180wK.A1W(context2.checkSelfPermission(str))) {
                    AnonymousClass7CJ.A01(context2, r8, r9);
                } else {
                    C04220Ms.A0B(r8, 0);
                    fragmentActivity = C63913ic.A01(r8).getActivity();
                    if (fragmentActivity != null) {
                        iDxPCallbackShape32S0400000_2_I2 = new IDxPCallbackShape32S0400000_2_I2(fragmentActivity, context2, r6, r7, 1);
                    }
                }
            }
            AnonymousClass7K8.A02(fragmentActivity, iDxPCallbackShape32S0400000_2_I2, new String[]{str});
            return null;
        }
        return null;
    }
}
