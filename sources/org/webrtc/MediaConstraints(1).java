package org.webrtc;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import java.util.List;

public class MediaConstraints {
    public final List mandatory = AnonymousClass0wJ.A0v();
    public final List optional = AnonymousClass0wJ.A0v();

    public class KeyValuePair {
        public final String key;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                KeyValuePair keyValuePair = (KeyValuePair) obj;
                if (!this.key.equals(keyValuePair.key) || !this.value.equals(keyValuePair.value)) {
                    return false;
                }
            }
            return true;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return C18210wN.A05(this.value, this.key.hashCode());
        }

        public String toString() {
            return AnonymousClass00U.A0V(this.key, ": ", this.value);
        }

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public static String stringifyKeyValuePairList(List list) {
        StringBuilder A0s = C18190wL.A0s("[");
        for (Object next : list) {
            if (A0s.length() > 1) {
                A0s.append(", ");
            }
            A0s.append(next.toString());
        }
        return C18180wK.A0i("]", A0s);
    }

    public List getMandatory() {
        return this.mandatory;
    }

    public List getOptional() {
        return this.optional;
    }

    public String toString() {
        return AnonymousClass00U.A0d("mandatory: ", stringifyKeyValuePairList(this.mandatory), ", optional: ", stringifyKeyValuePairList(this.optional));
    }
}
