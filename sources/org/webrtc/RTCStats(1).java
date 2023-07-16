package org.webrtc;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import java.util.Iterator;
import java.util.Map;

public class RTCStats {
    public final String id;
    public final Map members;
    public final long timestampUs;
    public final String type;

    public static void appendValue(StringBuilder sb, Object obj) {
        char c;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                appendValue(sb, objArr[i]);
            }
            c = ']';
        } else if (obj instanceof String) {
            c = '\"';
            sb.append('\"');
            sb.append(obj);
        } else {
            sb.append(obj);
            return;
        }
        sb.append(c);
    }

    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("{ timestampUs: ");
        A0s.append(this.timestampUs);
        A0s.append(", type: ");
        A0s.append(this.type);
        A0s.append(", id: ");
        A0s.append(this.id);
        Iterator A0z = AnonymousClass0wJ.A0z(this.members);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            A0s.append(", ");
            A0s.append(C18200wM.A0p(A0o));
            A0s.append(": ");
            appendValue(A0s, A0o.getValue());
        }
        return C18180wK.A0i(" }", A0s);
    }

    public RTCStats(long j, String str, String str2, Map map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }
}
