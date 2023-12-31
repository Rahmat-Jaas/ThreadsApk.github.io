package com.facebook.redex;

import java.io.File;
import java.io.FilenameFilter;

public class IDxFFilterShape158S0000000_I2 implements FilenameFilter {
    public final int A00;

    public IDxFFilterShape158S0000000_I2(int i) {
        this.A00 = i;
    }

    public final boolean accept(File file, String str) {
        String str2;
        int i = this.A00;
        boolean startsWith = str.startsWith("override-");
        if (i != 0) {
            if (!startsWith) {
                return false;
            }
            str2 = ".log";
        } else if (startsWith) {
            return false;
        } else {
            if (str.endsWith(".log") || str.endsWith(".zip")) {
                return true;
            }
            str2 = ".tmp";
        }
        if (str.endsWith(str2)) {
            return true;
        }
        return false;
    }
}
