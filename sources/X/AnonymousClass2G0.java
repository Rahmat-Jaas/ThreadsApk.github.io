package X;

import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2G0  reason: invalid class name */
public final class AnonymousClass2G0 {
    public static String A00(Map map, String str, String str2) {
        AbstractMap abstractMap;
        String str3;
        if (TextUtils.isEmpty(str2)) {
            if (map == null) {
                abstractMap = null;
            } else {
                abstractMap = (AbstractMap) map;
            }
            StringBuilder A0r = C18200wM.A0r();
            if (TextUtils.isEmpty(str)) {
                str = "appId";
            }
            A0r.append(str);
            if (abstractMap != null) {
                if (abstractMap.containsKey("_PRELOAD_ID_KEY_")) {
                    A0r.append(":");
                    A0r.append(C18240wQ.A0f("_PRELOAD_ID_KEY_", abstractMap));
                } else {
                    ArrayList A0s = C18200wM.A0s(abstractMap.keySet());
                    Collections.sort(A0s);
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        String A0f = C18240wQ.A0f(it.next(), abstractMap);
                        A0r.append(":");
                        if (A0f == null) {
                            str3 = null;
                        } else {
                            char[] charArray = A0f.toCharArray();
                            Arrays.sort(charArray);
                            str3 = new String(charArray);
                        }
                        A0r.append(str3);
                    }
                }
            }
            str2 = A0r.toString();
        }
        return AnonymousClass00U.A0L(str2, "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73");
    }
}
