package com.facebook.redex;

import X.AnonymousClass00U;
import X.AnonymousClass5rr;
import X.AnonymousClass78C;
import X.AnonymousClass8eW;
import X.C109856kj;
import X.C115446v5;
import X.C121787Id;
import X.C143998hf;
import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;

public class IDxProviderShape309S0200000_2_I2 implements C143998hf {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxProviderShape309S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object get() {
        String encodeToString;
        String encodeToString2;
        if (this.A02 != 0) {
            AnonymousClass78C r2 = (AnonymousClass78C) this.A01;
            return r2.A02.AFE(new AnonymousClass5rr((C115446v5) this.A00, r2));
        }
        C121787Id r5 = (C121787Id) this.A00;
        Context context = (Context) this.A01;
        C121787Id.A01(r5);
        byte[] bytes = r5.A04.getBytes(Charset.defaultCharset());
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        C121787Id.A01(r5);
        byte[] bytes2 = r5.A01.A01.getBytes(Charset.defaultCharset());
        if (bytes2 == null) {
            encodeToString2 = null;
        } else {
            encodeToString2 = Base64.encodeToString(bytes2, 11);
        }
        return new C109856kj(context, (AnonymousClass8eW) r5.A02.A03(AnonymousClass8eW.class), AnonymousClass00U.A0V(encodeToString, "+", encodeToString2));
    }
}
