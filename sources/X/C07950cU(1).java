package X;

import java.util.Arrays;

/* renamed from: X.0cU  reason: invalid class name and case insensitive filesystem */
public abstract class C07950cU {
    public static final String TAG = "ExperimentParameter";
    public Object mDefaultValueOverride = null;
    public final long mMobileConfigSpecifier;
    public final String mName;
    public final C07940cT mUniverseExperimentType;
    public final String mUniverseName;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.mMobileConfigSpecifier == ((C07950cU) obj).mMobileConfigSpecifier;
        }
        return true;
    }

    public int getConfigKey() {
        try {
            return C05450Tu.A00(this.mMobileConfigSpecifier);
        } catch (AnonymousClass0Tc e) {
            AnonymousClass0LU.A0L(TAG, "Failed to get config key with specifier:%d", e, Long.valueOf(this.mMobileConfigSpecifier));
            return -1;
        }
    }

    public Object getDefaultValue() {
        Object obj = this.mDefaultValueOverride;
        if (obj != null) {
            return obj;
        }
        long j = this.mMobileConfigSpecifier;
        int i = (int) ((j >>> 48) & 63);
        if (i == 1) {
            boolean z = false;
            if (((j >>> 61) & 1) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return Long.valueOf(AnonymousClass0U4.A01(j));
        } else {
            if (i == 3) {
                return AnonymousClass0U4.A02(j);
            }
            if (i == 4) {
                return Double.valueOf(AnonymousClass0U4.A00(j));
            }
            return null;
        }
    }

    public int getParamKey() {
        return C05360Tg.A00(this.mMobileConfigSpecifier);
    }

    public int getUnitType() {
        return (int) ((this.mMobileConfigSpecifier >>> 54) & 63);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.mMobileConfigSpecifier)});
    }

    public C07950cU(String str, String str2, C07940cT r4, long j) {
        this.mName = str;
        this.mUniverseName = str2;
        this.mUniverseExperimentType = r4;
        this.mMobileConfigSpecifier = j;
    }

    public Object castStringToParameter(String str) {
        return AnonymousClass3X7.A00(str, getDefaultValue());
    }

    public long getMobileConfigSpecifier() {
        return this.mMobileConfigSpecifier;
    }

    public String getName() {
        return this.mName;
    }

    public C07940cT getUniverseExperimentType() {
        return this.mUniverseExperimentType;
    }

    public String getUniverseName() {
        return this.mUniverseName;
    }

    public void setDefaultValueOverride(Object obj) {
        this.mDefaultValueOverride = obj;
    }
}
