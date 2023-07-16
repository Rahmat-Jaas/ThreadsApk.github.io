package com.instagram.graphql.instagramschema;

import X.C313025c;
import X.C85294up;
import com.facebook.pando.TreeJNI;

public final class IGFxNativeAuthTokenVerificationQueryResponseImpl extends TreeJNI implements C85294up {
    public final String[] getScalarFields() {
        return new String[]{"fx_account_linking_native_token_verification(access_token:$access_token,account_type:$account_type)"};
    }

    public final C313025c AkL() {
        return (C313025c) getEnumValue("fx_account_linking_native_token_verification(access_token:$access_token,account_type:$account_type)", C313025c.A02);
    }
}
