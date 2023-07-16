package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0LU;
import X.AnonymousClass3GH;
import X.AnonymousClass3IC;
import X.AnonymousClass3Iv;
import X.AnonymousClass3Iy;
import X.C04560Oe;
import X.C07950cU;
import X.C67603zp;

public class QuickExperimentDebugStore {
    public static final long NOT_FOUND_SPECIFIER = -1;
    public static final String TAG = "QuickExperimentDebugStore";
    public final AnonymousClass3Iy mOverrideUtil;
    public final C04560Oe mParamsMapProvider;

    public static QuickExperimentDebugStore create(C67603zp r3, final C67603zp r4) {
        AnonymousClass3Iv A06;
        if (r3 != null) {
            A06 = r3.A06();
        } else {
            A06 = r4.A06();
        }
        AnonymousClass3Iy r2 = new AnonymousClass3Iy(A06, r3, r4);
        if (r3 != null) {
            r4 = r3;
        }
        return new QuickExperimentDebugStore(r2, new C04560Oe() {
            public AnonymousClass3IC get() {
                return C67603zp.this.A09();
            }
        });
    }

    private long getSpecifier(C07950cU r6) {
        AnonymousClass3GH A00;
        long j = r6.mMobileConfigSpecifier;
        if (j > 0) {
            return j;
        }
        AnonymousClass3IC r4 = (AnonymousClass3IC) this.mParamsMapProvider.get();
        if (r4 == null || (A00 = r4.A00(r6.mUniverseName, r6.mName)) == null) {
            return -1;
        }
        return A00.A00();
    }

    private boolean isParamSpecifierOverridden(long j) {
        int i = (int) ((j >>> 48) & 63);
        if (i == 1) {
            return this.mOverrideUtil.A0A(j);
        }
        if (i == 2) {
            return this.mOverrideUtil.A0C(j);
        }
        if (i == 3) {
            return this.mOverrideUtil.A0D(j);
        }
        if (i != 4) {
            return false;
        }
        return this.mOverrideUtil.A0B(j);
    }

    public void removeAll() {
        this.mOverrideUtil.A03();
    }

    public QuickExperimentDebugStore(AnonymousClass3Iy r1, C04560Oe r2) {
        this.mOverrideUtil = r1;
        this.mParamsMapProvider = r2;
    }

    public String getOverriddenParameter(C07950cU r11) {
        long specifier = getSpecifier(r11);
        if (specifier == -1) {
            AnonymousClass0LU.A0O(TAG, "[getOverriddenParameter] MobileConfig failed to find %s.%s", r11.mUniverseName, r11.mName);
        } else if (isParamSpecifierOverridden(specifier)) {
            int i = (int) ((specifier >>> 48) & 63);
            if (i == 1) {
                return Boolean.toString(this.mOverrideUtil.A09(specifier));
            }
            if (i == 2) {
                return Long.toString(this.mOverrideUtil.A01(specifier));
            }
            if (i == 3) {
                return this.mOverrideUtil.A02(specifier);
            }
            if (i == 4) {
                return Double.toString(this.mOverrideUtil.A00(specifier));
            }
        }
        return null;
    }

    public boolean isParameterOverridden(C07950cU r6) {
        long specifier = getSpecifier(r6);
        if (specifier != -1) {
            return isParamSpecifierOverridden(specifier);
        }
        AnonymousClass0LU.A0O(TAG, "[isParameterOverridden] MobileConfig failed to find %s.%s", r6.mUniverseName, r6.mName);
        return false;
    }

    public void putOverriddenParameter(C07950cU r10, String str) {
        long specifier = getSpecifier(r10);
        if (specifier == -1) {
            AnonymousClass0LU.A0O(TAG, "[putOverriddenParameter] MobileConfig failed to find %s.%s", r10.mUniverseName, r10.mName);
            return;
        }
        int i = (int) ((specifier >>> 48) & 63);
        if (i == 1) {
            this.mOverrideUtil.A08(specifier, Boolean.parseBoolean(str));
        } else if (i == 2) {
            this.mOverrideUtil.A06(specifier, Long.parseLong(str));
        } else if (i == 3) {
            this.mOverrideUtil.A07(specifier, str);
        } else if (i == 4) {
            this.mOverrideUtil.A05(specifier, Double.parseDouble(str));
        }
    }

    public void removeOverriddenParameter(C07950cU r6) {
        long specifier = getSpecifier(r6);
        if (specifier != -1) {
            this.mOverrideUtil.A04(specifier);
        }
    }
}
