package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import X.C86154wM;
import com.facebook.pando.TreeJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevServerEntityConverterKt {
    public static final List pandoToEntities(List list) {
        C04220Ms.A0B(list, 0);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TreeJNI A0G = C18210wN.A0G(it);
            String A0i = C86154wM.A0i(A0G);
            if (A0i != null) {
                String stringValueByHashCode = A0G.getStringValueByHashCode(-717251727);
                if (stringValueByHashCode != null) {
                    String stringValueByHashCode2 = A0G.getStringValueByHashCode(-1724546052);
                    if (stringValueByHashCode2 == null) {
                        stringValueByHashCode2 = "";
                    }
                    A0w.add(new DevServerEntity(A0i, stringValueByHashCode, stringValueByHashCode2, 0, 8, (DefaultConstructorMarker) null));
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        return A0w;
    }
}
