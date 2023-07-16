package X;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.3MA  reason: invalid class name */
public final class AnonymousClass3MA {
    public static final Fragment A00(Bundle bundle, UserSession userSession, Integer num) {
        Fragment fragment;
        Bundle bundle2;
        switch (C18240wQ.A06(num, 0)) {
            case 0:
                fragment = new AnonymousClass1Xi();
                break;
            case 1:
                fragment = new AnonymousClass1dJ();
                break;
            case 2:
                fragment = new C23081bt();
                break;
            case 3:
                fragment = new AnonymousClass1oO();
                break;
            case 4:
                fragment = new AnonymousClass1oN();
                break;
            case 5:
                fragment = new AnonymousClass1oP();
                break;
            case 6:
                fragment = new CS4();
                break;
            case 7:
                fragment = new AnonymousClass1Z4();
                break;
            case 9:
                fragment = new CS8();
                break;
            case 10:
                fragment = new AnonymousClass1ZR();
                break;
            case 11:
                bundle2 = C18180wK.A06();
                AnonymousClass3W9.A02(bundle2, userSession);
                fragment = new AnonymousClass1a6();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                bundle2 = C18180wK.A06();
                AnonymousClass3W9.A02(bundle2, userSession);
                fragment = new CRW();
                break;
            case 13:
                fragment = new C22311CTq();
                break;
            case 14:
                bundle2 = C18180wK.A06();
                AnonymousClass3W9.A02(bundle2, userSession);
                fragment = new AnonymousClass1wF();
                break;
            case 15:
                fragment = new AnonymousClass1ZA();
                break;
            case 16:
                fragment = new C22279CRw();
                break;
            default:
                return null;
        }
        fragment.setArguments(bundle2);
        Fragment fragment2 = fragment;
        if (fragment2 != null) {
            fragment2.setArguments(bundle);
            return fragment2;
        }
        return null;
    }

    public static final String A01(Resources resources, Fragment fragment) {
        int i;
        if (fragment instanceof CRW) {
            i = 2131826809;
        } else if (fragment instanceof C22311CTq) {
            i = 2131826798;
        } else if (fragment instanceof CS8) {
            i = 2131832550;
        } else if (fragment instanceof CS4) {
            i = 2131832559;
        } else if (fragment instanceof AnonymousClass1Xi) {
            return "";
        } else {
            return " ";
        }
        return C18190wL.A0g(resources, i);
    }
}
