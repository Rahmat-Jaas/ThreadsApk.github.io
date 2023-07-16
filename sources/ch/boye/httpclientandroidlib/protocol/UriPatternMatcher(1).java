package ch.boye.httpclientandroidlib.protocol;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import java.util.Iterator;
import java.util.Map;

public class UriPatternMatcher {
    public final Map map = AnonymousClass0wJ.A0y();

    public synchronized Object lookup(String str) {
        Object obj;
        int length;
        if (str != null) {
            int indexOf = str.indexOf("?");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            obj = this.map.get(str);
            if (obj == null) {
                String str2 = null;
                Iterator A0x = C18220wO.A0x(this.map);
                while (A0x.hasNext()) {
                    String A0k = C18180wK.A0k(A0x);
                    if (matchUriRequestPattern(A0k, str) && (str2 == null || str2.length() < (length = A0k.length()) || (str2.length() == length && A0k.endsWith("*")))) {
                        obj = this.map.get(A0k);
                        str2 = A0k;
                    }
                }
            }
        } else {
            throw C18190wL.A0a(AnonymousClass000.A00(722));
        }
        return obj;
    }

    public synchronized void register(String str, Object obj) {
        if (str != null) {
            this.map.put(str, obj);
        } else {
            throw C18190wL.A0a("URI request pattern may not be null");
        }
    }

    public synchronized void setHandlers(Map map2) {
        if (map2 != null) {
            this.map.clear();
            this.map.putAll(map2);
        } else {
            throw C18190wL.A0a("Map of handlers may not be null");
        }
    }

    public synchronized void setObjects(Map map2) {
        if (map2 != null) {
            this.map.clear();
            this.map.putAll(map2);
        } else {
            throw C18190wL.A0a("Map of handlers may not be null");
        }
    }

    public synchronized void unregister(String str) {
        if (str != null) {
            this.map.remove(str);
        }
    }

    public boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals("*") || ((str.endsWith("*") && str2.startsWith(str.substring(0, str.length() - 1))) || (str.startsWith("*") && str2.endsWith(str.substring(1, str.length()))))) {
            return true;
        }
        return false;
    }
}
