package X;

import com.facebook.common.locale.Country;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.6np  reason: invalid class name and case insensitive filesystem */
public abstract class C111526np {
    public final Object A00(Object obj) {
        if (this instanceof AnonymousClass5ra) {
            String str = (String) obj;
            String str2 = (String) C40589LjS.A02.get(str);
            if (str2 == null) {
                str2 = ".*";
            } else {
                String str3 = (String) C40589LjS.A01.get(str);
                if (str3 != null && str3.startsWith("CC")) {
                    str2 = StringFormatUtil.formatStrLocaleSafe("%s%s", str3.replace("CC", str), str2);
                }
            }
            return Pattern.compile(str2);
        } else if (this instanceof C93755rc) {
            return new Country((Locale) ((C93755rc) this).A00.A02.A00(obj));
        } else {
            return new Locale("", (String) obj);
        }
    }
}
