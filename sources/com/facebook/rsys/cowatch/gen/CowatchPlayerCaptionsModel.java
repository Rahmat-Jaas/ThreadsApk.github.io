package com.facebook.rsys.cowatch.gen;

import X.C18180wK;
import X.C18190wL;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchPlayerCaptionsModel {
    public final ArrayList captions;

    public static native CowatchPlayerCaptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchPlayerCaptionsModel)) {
            return false;
        }
        return this.captions.equals(((CowatchPlayerCaptionsModel) obj).captions);
    }

    public final int hashCode() {
        return 527 + this.captions.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchPlayerCaptionsModel{captions=");
        A0s.append(this.captions);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchPlayerCaptionsModel(ArrayList arrayList) {
        arrayList.getClass();
        this.captions = arrayList;
    }
}
