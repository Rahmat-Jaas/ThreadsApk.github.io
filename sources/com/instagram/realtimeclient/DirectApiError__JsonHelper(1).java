package com.instagram.realtimeclient;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18220wO;
import X.C25563Dnz;
import X.C27627Eqe;
import X.C40318LcR;
import X.MMo;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class DirectApiError__JsonHelper {
    public static DirectApiError parseFromJson(MMo mMo) {
        return (DirectApiError) C25563Dnz.A02(mMo, new C27627Eqe() {
            public DirectApiError invoke(MMo mMo) {
                return DirectApiError__JsonHelper.unsafeParseFromJson(mMo);
            }
        });
    }

    public static boolean processSingleField(DirectApiError directApiError, String str, MMo mMo) {
        if ("error_type".equals(str)) {
            directApiError.errorType = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(str)) {
            directApiError.errorDescription = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if (!C18220wO.A1T(str)) {
            return false;
        } else {
            directApiError.errorTitle = AnonymousClass0wJ.A0r(mMo);
            return true;
        }
    }

    public static DirectApiError unsafeParseFromJson(MMo mMo) {
        DirectApiError directApiError = new DirectApiError();
        if (mMo.A0f() != C40318LcR.START_OBJECT) {
            mMo.A0x();
            return null;
        }
        while (mMo.A0g() != C40318LcR.END_OBJECT) {
            processSingleField(directApiError, AnonymousClass0wJ.A0q(mMo), mMo);
            mMo.A0x();
        }
        return directApiError;
    }

    public static DirectApiError parseFromJson(String str) {
        return parseFromJson(C18180wK.A0L(str));
    }
}
