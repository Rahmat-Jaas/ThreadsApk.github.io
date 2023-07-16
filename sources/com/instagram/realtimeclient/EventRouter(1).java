package com.instagram.realtimeclient;

import X.AnonymousClass0wJ;
import X.C18200wM;
import X.C18220wO;
import java.util.HashMap;
import java.util.Map;

public class EventRouter {
    public static String fill(String str, Map map) {
        String[] split = str.split("/");
        StringBuilder A0r = C18200wM.A0r();
        for (String str2 : split) {
            if (str2.startsWith(":")) {
                A0r.append(C18220wO.A0r(str2.substring(1), map));
            } else {
                A0r.append(str2);
            }
            A0r.append("/");
        }
        String obj = A0r.toString();
        return obj.substring(0, obj.length() - 1);
    }

    public static Map match(String str, String str2) {
        String[] split = str.split("/");
        String[] split2 = str2.split("/");
        int length = split.length;
        int length2 = split2.length;
        if (length > length2 || (length < length2 && !split[length - 1].equals("*"))) {
            return null;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (int i = 0; i < length; i++) {
            if (!split[i].equals("*")) {
                String str3 = split[i];
                if (str3.startsWith(":")) {
                    A0y.put(str3.substring(1), split2[i]);
                } else if (!str3.equals(split2[i])) {
                    return null;
                }
            }
        }
        return A0y;
    }
}
