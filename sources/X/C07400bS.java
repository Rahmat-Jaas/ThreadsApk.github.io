package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0bS  reason: invalid class name and case insensitive filesystem */
public final class C07400bS {
    public final Context A00;

    public C07400bS(Context context) {
        this.A00 = context;
    }

    public static C07460bY A00(ConnectivityManager connectivityManager) {
        Integer num;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return new C07460bY(AnonymousClass006.A00, (Throwable) null, -1, false);
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                num = A01(activeNetworkInfo.getSubtype());
            } else if (type == 1) {
                num = AnonymousClass006.A0C;
            } else if (type != 6) {
                num = AnonymousClass006.A00;
            } else {
                num = AnonymousClass006.A0j;
            }
            return new C07460bY(num, (Throwable) null, activeNetworkInfo.getType(), true);
        } catch (Throwable th) {
            return new C07460bY(AnonymousClass006.A00, th, -1, false);
        }
    }

    public static Integer A01(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return AnonymousClass006.A0N;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 14:
            case 15:
            case LangUtils.HASH_SEED /*17*/:
                return AnonymousClass006.A0Y;
            case 13:
            case 18:
                return AnonymousClass006.A0j;
            case 20:
                return AnonymousClass006.A0u;
            default:
                return AnonymousClass006.A15;
        }
    }
}
