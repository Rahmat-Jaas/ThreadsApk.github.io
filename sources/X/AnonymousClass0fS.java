package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Locale;

/* renamed from: X.0fS  reason: invalid class name */
public final class AnonymousClass0fS {
    public static String A06(NetworkInfo networkInfo) {
        String str;
        String str2 = null;
        if (networkInfo != null) {
            str = networkInfo.getTypeName();
            str2 = networkInfo.getSubtypeName();
        } else {
            str = null;
        }
        if (str == null) {
            return "None";
        }
        if (!TextUtils.isEmpty(str2)) {
            return String.format((Locale) null, "%s(%s)", new Object[]{str, str2});
        }
        return str;
    }

    public static String A07(NetworkInfo networkInfo) {
        String str;
        String str2 = null;
        if (networkInfo != null) {
            str = networkInfo.getTypeName();
            str2 = networkInfo.getSubtypeName();
            if (str2 != null) {
                str2 = str2.replace(".", "_").replace(" ", "_");
            }
        } else {
            str = null;
        }
        if (str == null) {
            return "None";
        }
        if (!TextUtils.isEmpty(str2)) {
            return String.format((Locale) null, "%s.%s", new Object[]{str, str2});
        }
        return str;
    }

    public static NetworkInfo A00() {
        C11310jt r1;
        synchronized (C11310jt.class) {
            C11310jt.A01();
            r1 = C11310jt.A08;
        }
        if (r1.A01) {
            r1.A07 = C11310jt.A00(r1.A05);
        }
        return r1.A07;
    }

    public static NetworkInfo A01(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Exception when in getActiveNetworkInfo() ");
                sb.append(e.getStackTrace());
                C10450iM.A03("NetworkUtil", sb.toString());
            }
        }
        return null;
    }

    public static Pair A02(NetworkInfo networkInfo) {
        String str;
        String str2;
        String str3 = NetInfoModule.CONNECTION_TYPE_NONE;
        if (networkInfo == null || !networkInfo.isConnected()) {
            str = str3;
        } else {
            if (networkInfo.getTypeName() == null || networkInfo.getTypeName().isEmpty()) {
                str2 = str3;
            } else {
                str2 = networkInfo.getTypeName().toLowerCase(Locale.US);
            }
            if (networkInfo.getSubtypeName() != null && !networkInfo.getSubtypeName().isEmpty()) {
                str3 = networkInfo.getSubtypeName().toLowerCase(Locale.US);
            }
            str = str3;
            str3 = str2;
        }
        return Pair.create(str3, str);
    }

    public static AnonymousClass0fT A03(NetworkInfo networkInfo) {
        Integer num = AnonymousClass006.A00;
        Integer num2 = AnonymousClass006.A0Y;
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            int subtype = networkInfo.getSubtype();
            if (type == 0) {
                num = AnonymousClass006.A0C;
                if (subtype != 20) {
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            num2 = AnonymousClass006.A01;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        case 14:
                        case 15:
                            num2 = num;
                            break;
                        case 13:
                            num2 = AnonymousClass006.A0N;
                            break;
                    }
                } else {
                    num2 = AnonymousClass006.A0j;
                }
            } else if (type == 1) {
                num = AnonymousClass006.A01;
            } else if (type != 6) {
                num = AnonymousClass006.A0N;
            } else {
                num = AnonymousClass006.A0C;
                num2 = AnonymousClass006.A0N;
            }
        }
        return new AnonymousClass0fT(num, num2);
    }

    public static String A04() {
        Pair A02 = A02(A00());
        return AnonymousClass00U.A0V((String) A02.first, "-", (String) A02.second);
    }

    public static String A05(Context context) {
        Pair A02 = A02(A01(context));
        return AnonymousClass00U.A0V((String) A02.first, "-", (String) A02.second);
    }

    public static boolean A08() {
        if (A03(A00()).A01 == AnonymousClass006.A01) {
            return true;
        }
        return false;
    }

    public static boolean A09(Context context) {
        if (A03(A01(context)).A01 != AnonymousClass006.A00) {
            return true;
        }
        return false;
    }

    public static boolean A0A(Context context) {
        NetworkInfo A00 = A00();
        if (A00 == null) {
            return A09(context);
        }
        return A00.isConnected();
    }

    public static boolean A0B(Context context) {
        if (A03(A01(context)).A01 == AnonymousClass006.A01) {
            return true;
        }
        return false;
    }
}
