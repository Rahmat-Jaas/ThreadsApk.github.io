package com.facebook.rsys.call.gen;

import X.C18180wK;
import X.C18190wL;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class CallStartContext {
    public final Map contexts;

    public static native CallStartContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallStartContext)) {
            return false;
        }
        return this.contexts.equals(((CallStartContext) obj).contexts);
    }

    public final int hashCode() {
        return 527 + this.contexts.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CallStartContext{contexts=");
        A0s.append(this.contexts);
        return C18180wK.A0i("}", A0s);
    }

    public CallStartContext(Map map) {
        map.getClass();
        this.contexts = map;
    }
}
