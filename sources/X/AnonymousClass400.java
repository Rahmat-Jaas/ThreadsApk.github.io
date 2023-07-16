package X;

import com.facebook.mobileconfig.MobileConfigConstants;
import com.facebook.mobileconfig.MobileConfigDefaults;

/* renamed from: X.400  reason: invalid class name */
public final class AnonymousClass400 implements C84594tV {
    public final int ATt(int i) {
        if (i != 1) {
            return MobileConfigConstants.SESSIONBASED.BOOLEAN_COUNT;
        }
        return MobileConfigConstants.SESSIONLESS.BOOLEAN_COUNT;
    }

    public final int Adr(int i) {
        if (i != 1) {
            return MobileConfigConstants.SESSIONBASED.DOUBLE_COUNT;
        }
        return MobileConfigConstants.SESSIONLESS.DOUBLE_COUNT;
    }

    public final int At6(int i) {
        if (i != 1) {
            return MobileConfigConstants.SESSIONBASED.LONG_COUNT;
        }
        return MobileConfigConstants.SESSIONLESS.LONG_COUNT;
    }

    public final String B8w(int i) {
        if (i != 1) {
            return MobileConfigConstants.SESSIONBASED.SCHEMA_HASH;
        }
        return MobileConfigConstants.SESSIONLESS.SCHEMA_HASH;
    }

    public final int BER(int i) {
        if (i != 1) {
            return MobileConfigConstants.SESSIONBASED.STRING_COUNT;
        }
        return MobileConfigConstants.SESSIONLESS.STRING_COUNT;
    }

    public final boolean ATq(long j) {
        return MobileConfigDefaults.getBoolDefaults(j);
    }

    public final double Adq(long j) {
        return MobileConfigDefaults.getDoubleDefaults(j);
    }

    public final long At4(long j) {
        return MobileConfigDefaults.getLongDefaults(j);
    }

    public final String BEO(long j) {
        return MobileConfigDefaults.getStringDefaults(j);
    }
}
