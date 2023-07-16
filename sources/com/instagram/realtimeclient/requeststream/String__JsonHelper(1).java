package com.instagram.realtimeclient.requeststream;

import X.C002801h;
import X.C18200wM;
import X.MMo;
import java.io.Reader;

public final class String__JsonHelper {
    public static int sBufferLength = 1000;

    public static String parseFromJson(String str) {
        return str;
    }

    public static String parseFromJson(MMo mMo) {
        StringBuilder A0r = C18200wM.A0r();
        int i = sBufferLength;
        char[] cArr = new char[i];
        Object A0m = mMo.A0m();
        C002801h.A02(A0m, "Created by SessionAwareJsonFactory.createParser, cannot be null");
        Reader reader = (Reader) A0m;
        try {
            reader.reset();
            for (int i2 = 0; i2 != -1; i2 = reader.read(cArr, 0, i)) {
                A0r.append(cArr, 0, i2);
            }
            reader.close();
            return A0r.toString();
        } catch (Throwable unused) {
        }
        throw th;
    }
}
