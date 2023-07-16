package com.facebook.compphoto.sdk.hollywood.data;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C18180wK;
import X.C18220wO;

public final class DoubleParam extends AnonymousClass0Sf {
    public final String name;
    public final double value;

    public DoubleParam(String str, double d) {
        C04220Ms.A0B(str, 1);
        this.name = str;
        this.value = d;
    }

    public final DoubleParam copy(String str, double d) {
        C04220Ms.A0B(str, 0);
        return new DoubleParam(str, d);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DoubleParam) {
                DoubleParam doubleParam = (DoubleParam) obj;
                if (!C04220Ms.A0I(this.name, doubleParam.name) || Double.compare(this.value, doubleParam.value) != 0) {
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

    public static /* synthetic */ DoubleParam copy$default(DoubleParam doubleParam, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = doubleParam.name;
        }
        if ((i & 2) != 0) {
            d = doubleParam.value;
        }
        C04220Ms.A0B(str, 0);
        return new DoubleParam(str, d);
    }

    public final String component1() {
        return this.name;
    }

    public final double component2() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public Double getValue() {
        return Double.valueOf(this.value);
    }

    public int hashCode() {
        return C18220wO.A06(Double.valueOf(this.value), C18180wK.A03(this.name));
    }
}
