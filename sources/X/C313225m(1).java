package X;

import android.os.Bundle;

/* renamed from: X.25m  reason: invalid class name and case insensitive filesystem */
public enum C313225m {
    ARGUMENT_DEFAULT_FLOW,
    ARGUMENT_EDIT_PROFILE_FLOW,
    ARGUMENT_TWOFAC_FLOW,
    ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW,
    ARGUMENT_ADD_PHONE_NUMBER_FLOW;

    public static void A00(Bundle bundle, C313225m r3) {
        bundle.putInt("flow_key", r3.ordinal());
    }
}
