package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0RL;
import X.C10450iM;
import X.C17510v2;
import java.io.File;
import java.util.Comparator;
import java.util.Map;

public class IDxComparatorShape301S0100000_I2 implements Comparator {
    public Object A00;
    public final int A01;

    public IDxComparatorShape301S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A01) {
            case 0:
                return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
            case 4:
                return ((C17510v2) obj2).A01 - ((C17510v2) obj).A01;
            case 5:
                Map map = ((AnonymousClass0RL) this.A00).A01;
                Number number = (Number) map.get(obj);
                Number number2 = (Number) map.get(obj2);
                if (number == null || number2 == null) {
                    C10450iM.A02("AccountDataManager", AnonymousClass006.A0j, "User Access Time is null");
                    if (number != null) {
                        return -1;
                    }
                    if (number2 == null) {
                        return 0;
                    }
                    return 1;
                }
                long longValue = number2.longValue();
                long longValue2 = number.longValue();
                if (longValue < longValue2) {
                    return -1;
                }
                if (longValue == longValue2) {
                    return 0;
                }
                return 1;
            default:
                return ((File) obj).getName().compareTo(((File) obj2).getName());
        }
    }
}
