package com.facebook.redex;

import X.AnonymousClass00U;
import java.io.File;
import java.io.FileFilter;

public class IDxFFilterShape2S1000000_I2 implements FileFilter {
    public String A00;
    public final int A01;

    public IDxFFilterShape2S1000000_I2(String str, int i) {
        this.A01 = i;
        if (i != 0) {
            this.A00 = str;
        } else {
            this.A00 = str;
        }
    }

    public final boolean accept(File file) {
        boolean endsWith;
        if (this.A01 == 0) {
            String str = this.A00;
            if (file == null) {
                return false;
            }
            endsWith = file.getName().endsWith(str);
        } else if (!file.isDirectory()) {
            return false;
        } else {
            String name = file.getName();
            String str2 = this.A00;
            if (name.startsWith(AnonymousClass00U.A0V("session_", str2, "_"))) {
                return true;
            }
            endsWith = file.getName().startsWith(AnonymousClass00U.A0V("sess_", str2, "_"));
        }
        if (endsWith) {
            return true;
        }
        return false;
    }
}
