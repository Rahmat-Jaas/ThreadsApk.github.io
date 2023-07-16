package com.facebook.rsys.filelogging.gen;

import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class LogFileData {
    public final boolean isStreamValid;
    public final String line;

    public static native LogFileData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogFileData)) {
            return false;
        }
        LogFileData logFileData = (LogFileData) obj;
        return this.line.equals(logFileData.line) && this.isStreamValid == logFileData.isStreamValid;
    }

    public final int hashCode() {
        return C18210wN.A00(this.line.hashCode()) + (this.isStreamValid ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LogFileData{line=");
        A0s.append(this.line);
        A0s.append(",isStreamValid=");
        A0s.append(this.isStreamValid);
        return C18180wK.A0i("}", A0s);
    }

    public LogFileData(String str, boolean z) {
        str.getClass();
        this.line = str;
        this.isStreamValid = z;
    }
}
