package com.facebook.compphoto.sdk.hollywood.data;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C18180wK;
import X.C18220wO;

public final class BooleanParam extends AnonymousClass0Sf {
    public final String name;
    public final boolean value;

    public BooleanParam(String str, boolean z) {
        C04220Ms.A0B(str, 1);
        this.name = str;
        this.value = z;
    }

    public final BooleanParam copy(String str, boolean z) {
        C04220Ms.A0B(str, 0);
        return new BooleanParam(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BooleanParam) {
                BooleanParam booleanParam = (BooleanParam) obj;
                if (!C04220Ms.A0I(this.name, booleanParam.name) || this.value != booleanParam.value) {
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

    public static /* synthetic */ BooleanParam copy$default(BooleanParam booleanParam, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = booleanParam.name;
        }
        if ((i & 2) != 0) {
            z = booleanParam.value;
        }
        C04220Ms.A0B(str, 0);
        return new BooleanParam(str, z);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }

    public int hashCode() {
        return C18220wO.A06(Boolean.valueOf(this.value), C18180wK.A03(this.name));
    }
}
