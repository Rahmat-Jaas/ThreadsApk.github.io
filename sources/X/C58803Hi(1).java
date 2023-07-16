package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;

/* renamed from: X.3Hi  reason: invalid class name and case insensitive filesystem */
public final class C58803Hi {
    public final Fragment A00(Bundle bundle, Integer num, Integer num2, String str, boolean z) {
        C04220Ms.A0B(str, 1);
        bundle.putString("phone_number_or_email", str);
        if (num != null) {
            bundle.putString("two_fac_method", C36182Qi.A00(num));
        }
        bundle.putBoolean("two_fac_should_fetch_code", z);
        bundle.putString("two_fac_confirm_code_source", C36172Qh.A00(num2));
        AnonymousClass1aN r0 = new AnonymousClass1aN();
        r0.setArguments(bundle);
        return r0;
    }

    public final Fragment A01(Integer num, boolean z, boolean z2) {
        String str;
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("skip_landing_screen", z);
        A06.putBoolean("direct_launch_backup_codes", z2);
        switch (num.intValue()) {
            case 0:
                str = "qp";
                break;
            case 1:
                str = "megaphone";
                break;
            case 2:
                str = "setting";
                break;
            case 3:
                str = "url";
                break;
            case 4:
                str = "bloks_extension";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE;
                break;
        }
        C18210wN.A0x(A06, str);
        C22761Zj r0 = new C22761Zj();
        r0.setArguments(A06);
        return r0;
    }

    public final Fragment A02(ArrayList arrayList, boolean z) {
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("arg_should_check_email", z);
        if (arrayList != null) {
            A06.putStringArrayList("arg_backup_codes", arrayList);
        } else {
            A06.putBoolean(C63833iQ.A07(0, 33, 124), true);
        }
        C23121bx r0 = new C23121bx();
        r0.setArguments(A06);
        return r0;
    }
}
