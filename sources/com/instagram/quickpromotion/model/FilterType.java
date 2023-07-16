package com.instagram.quickpromotion.model;

import X.AnonymousClass4WK;
import X.C18190wL;
import java.util.LinkedHashMap;
import java.util.Map;

public enum FilterType {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v2 = C18190wL.A0v(AnonymousClass4WK.A0M(r4));
        for (FilterType filterType : values()) {
            A0v2.put(filterType.A00, filterType);
        }
        A01 = A0v2;
    }

    public static FilterType A00(String str, String str2, int i) {
        return new FilterType(str, i, str2);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FilterType(String str) {
        this.A00 = str;
    }
}
