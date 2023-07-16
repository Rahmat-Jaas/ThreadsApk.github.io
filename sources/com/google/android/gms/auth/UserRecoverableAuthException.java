package com.google.android.gms.auth;

import X.AnonymousClass6CS;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class UserRecoverableAuthException extends AnonymousClass6CS {
    public final Intent A00;

    public UserRecoverableAuthException(Intent intent, String str) {
        super(str);
        this.A00 = intent;
    }
}
