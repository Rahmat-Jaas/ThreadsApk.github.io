package com.facebook.compphoto.sdk.hollywood.data;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;

public final class StringParam extends AnonymousClass0Sf {
    public final String name;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StringParam) {
                StringParam stringParam = (StringParam) obj;
                if (!C04220Ms.A0I(this.name, stringParam.name) || !C04220Ms.A0I(this.value, stringParam.value)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ StringParam copy$default(StringParam stringParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringParam.name;
        }
        if ((i & 2) != 0) {
            str2 = stringParam.value;
        }
        AnonymousClass0wJ.A1N(str, str2);
        return new StringParam(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return C18210wN.A05(this.value, C18180wK.A03(this.name));
    }

    public StringParam(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.name = str;
        this.value = str2;
    }

    public final StringParam copy(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        return new StringParam(str, str2);
    }

    public String getValue() {
        return this.value;
    }
}
