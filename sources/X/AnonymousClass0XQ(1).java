package X;

import android.app.Application;
import android.os.Build;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.0XQ  reason: invalid class name */
public final class AnonymousClass0XQ implements C04050Mb {
    public Application A00;

    public final void CWp(C04170Mn r9, AnonymousClass0ND r10) {
        String str;
        AnonymousClass0ON r6 = AnonymousClass0MU.A5e;
        String str2 = Build.TAGS;
        String str3 = "true";
        if (str2 == null || !str2.contains("test-keys")) {
            try {
                if (new File("/system/app/Superuser.apk").exists()) {
                }
            } catch (Exception unused) {
                C04790Pd.A00();
            }
            Map<String, String> map = System.getenv();
            if (map != null && (str = map.get("PATH")) != null) {
                String[] split = str.split(":");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    try {
                        if (new File(AnonymousClass00U.A0L(split[i], "/su")).exists()) {
                            break;
                        }
                        i++;
                    } catch (Exception unused2) {
                        C04790Pd.A00();
                    }
                }
            }
            str3 = "false";
        }
        r9.A03(r6, str3);
        AnonymousClass0ON r62 = AnonymousClass0MU.A4u;
        String arrays = Arrays.toString(Build.SUPPORTED_ABIS);
        int length2 = arrays.length();
        if (length2 >= 2 && arrays.charAt(0) == '[') {
            int i2 = length2 - 1;
            if (arrays.charAt(i2) == ']') {
                arrays = arrays.substring(1, i2);
            }
        }
        r9.A03(r62, arrays);
        AnonymousClass0ON r5 = AnonymousClass0MU.A4S;
        StringBuilder sb = new StringBuilder();
        for (Field field : Build.class.getFields()) {
            try {
                Object obj = field.get((Object) null);
                sb.append(field.getName());
                sb.append("=");
                if (obj instanceof Object[]) {
                    sb.append(new JSONArray(Arrays.asList((Object[]) obj)).toString());
                } else {
                    sb.append(obj.toString());
                }
            } catch (Exception unused3) {
                C04790Pd.A00();
                sb.append("unknown");
            }
            sb.append("\n");
        }
        r9.A03(r5, sb.toString());
    }

    public AnonymousClass0XQ(Application application) {
        this.A00 = application;
    }

    public final Integer Awy() {
        return AnonymousClass006.A09;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
