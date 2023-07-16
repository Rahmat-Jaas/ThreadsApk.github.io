package X;

import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.7yS  reason: invalid class name and case insensitive filesystem */
public abstract class C134837yS implements Comparable {
    public static final float A00 = Float.intBitsToFloat(1056964608);

    public static final float A00(short s) {
        int i;
        short s2 = s & 65535;
        short s3 = 32768 & s2;
        int i2 = (s2 >>> 10) & 31;
        short s4 = s2 & 1023;
        int i3 = 0;
        if (i2 != 0) {
            i = s4 << 13;
            if (i2 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i3 = 255;
            } else {
                i3 = (i2 - 15) + StringTreeSet.MAX_SYMBOL_COUNT;
            }
        } else if (s4 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s4 + 1056964608) - A00;
            if (s3 != 0) {
                return -intBitsToFloat;
            }
            return intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (s3 << 16) | (i3 << 23));
    }

    public static short A01(float f) {
        int i;
        int i2;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i3 = floatToRawIntBits >>> 31;
        int i4 = (floatToRawIntBits >>> 23) & 255;
        int i5 = floatToRawIntBits & 8388607;
        int i6 = 0;
        if (i4 == 255) {
            if (i5 != 0) {
                i6 = 512;
            }
            i = i6;
            i6 = 31;
        } else {
            int i7 = (i4 - 127) + 15;
            if (i7 >= 31) {
                i = 0;
                i6 = 49;
            } else if (i7 > 0) {
                i = i5 >> 13;
                if ((i5 & 4096) != 0) {
                    i = ((i7 << 10) | i) + 1;
                    i2 = i3 << 15;
                    return (short) (i | i2);
                }
                i6 = i7;
            } else if (i7 >= -10) {
                int i8 = (i5 | DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) >> (1 - i7);
                if ((i8 & 4096) != 0) {
                    i8 += 8192;
                }
                i = i8 >> 13;
            } else {
                i = 0;
            }
        }
        i2 = (i3 << 15) | (i6 << 10);
        return (short) (i | i2);
    }
}
