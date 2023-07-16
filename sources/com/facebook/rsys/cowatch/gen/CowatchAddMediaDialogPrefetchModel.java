package com.facebook.rsys.cowatch.gen;

import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchAddMediaDialogPrefetchModel {
    public final ArrayList logs;
    public final int pageToPrefetch;

    public static native CowatchAddMediaDialogPrefetchModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAddMediaDialogPrefetchModel)) {
            return false;
        }
        CowatchAddMediaDialogPrefetchModel cowatchAddMediaDialogPrefetchModel = (CowatchAddMediaDialogPrefetchModel) obj;
        return this.logs.equals(cowatchAddMediaDialogPrefetchModel.logs) && this.pageToPrefetch == cowatchAddMediaDialogPrefetchModel.pageToPrefetch;
    }

    public final int hashCode() {
        return C18210wN.A00(this.logs.hashCode()) + this.pageToPrefetch;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchAddMediaDialogPrefetchModel{logs=");
        A0s.append(this.logs);
        A0s.append(",pageToPrefetch=");
        A0s.append(this.pageToPrefetch);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchAddMediaDialogPrefetchModel(ArrayList arrayList, int i) {
        arrayList.getClass();
        this.logs = arrayList;
        this.pageToPrefetch = i;
    }
}
