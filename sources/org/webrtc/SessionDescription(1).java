package org.webrtc;

import X.C18240wQ;
import java.util.Locale;

public class SessionDescription {
    public final String description;
    public final Type type;

    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER;

        public static Type fromCanonicalForm(String str) {
            return (Type) valueOf(Type.class, str.toUpperCase(Locale.US));
        }

        public String canonicalForm() {
            return C18240wQ.A0g(name());
        }
    }

    public String getDescription() {
        return this.description;
    }

    public String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }

    public SessionDescription(Type type2, String str) {
        this.type = type2;
        this.description = str;
    }
}
