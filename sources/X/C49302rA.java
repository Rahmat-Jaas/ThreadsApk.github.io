package X;

import android.content.Context;
import android.content.DialogInterface;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.2rA  reason: invalid class name and case insensitive filesystem */
public final class C49302rA {
    public static final void A00(Context context, UserSession userSession, C23925D1n d1n) {
        int i;
        AnonymousClass0wJ.A1N(context, userSession);
        C04220Ms.A0B(d1n, 2);
        String str = null;
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131834498);
        A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
        switch (d1n.ordinal()) {
            case 0:
                i = 2131834482;
                break;
            case 1:
                i = 2131834486;
                break;
            case 2:
                i = 2131834488;
                break;
            case 3:
                i = 2131834483;
                if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36327344490948576L)) {
                    i = 2131834484;
                    break;
                }
                break;
            case 4:
                str = AnonymousClass0wJ.A0l(context, (Object) null, 2131834485);
                break;
            case 5:
                i = 2131834487;
                break;
            case 6:
                i = 2131834497;
                break;
            case 7:
                i = 2131834489;
                break;
            case 11:
                i = 2131834490;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 2131834496;
                break;
            case 13:
                i = 2131834491;
                break;
            case 14:
                i = 2131834492;
                break;
            case 15:
                i = 2131834493;
                break;
            case 16:
                i = 2131834494;
                break;
            case LangUtils.HASH_SEED /*17*/:
            case 18:
                i = 2131834495;
                break;
            case 20:
                i = 2131834499;
                break;
        }
        str = context.getString(i);
        A0W.A0p(str);
        AnonymousClass0wJ.A1K(A0W);
    }
}
