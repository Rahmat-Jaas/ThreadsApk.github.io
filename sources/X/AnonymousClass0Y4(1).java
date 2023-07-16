package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.0Y4  reason: invalid class name */
public final class AnonymousClass0Y4 implements AnonymousClass0O7 {
    public Iterator A00;
    public final Map A01;

    public final void reset() {
        this.A00 = null;
    }

    public final void A6C(Properties properties) {
        this.A01.putAll(properties);
    }

    public final boolean AxZ(AnonymousClass0O6 r3) {
        Iterator it = this.A00;
        if (it == null) {
            it = this.A01.entrySet().iterator();
            this.A00 = it;
        }
        if (!it.hasNext()) {
            return false;
        }
        Map.Entry entry = (Map.Entry) this.A00.next();
        r3.A00 = entry.getKey().toString();
        r3.A01 = entry.getValue().toString();
        return true;
    }

    public AnonymousClass0Y4(Properties properties) {
        this.A01 = properties;
    }

    public final String[] B4x(List list) {
        String str;
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Object obj = this.A01.get(list.get(i));
            if (obj != null) {
                str = obj.toString();
            } else {
                str = null;
            }
            strArr[i] = str;
        }
        return strArr;
    }

    public AnonymousClass0Y4() {
        this.A01 = new Properties();
    }
}
