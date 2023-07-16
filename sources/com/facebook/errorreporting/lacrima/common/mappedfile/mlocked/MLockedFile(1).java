package com.facebook.errorreporting.lacrima.common.mappedfile.mlocked;

import X.C06160Xx;
import java.io.File;
import java.nio.ByteBuffer;

public class MLockedFile extends C06160Xx {
    public static volatile boolean sLibraryLoaded;

    public static native void mlockBuffer(ByteBuffer byteBuffer);

    public static native void munlockBuffer(ByteBuffer byteBuffer);

    public void mlockBuffer() {
        if (sLibraryLoaded) {
            mlockBuffer(this.A00);
        }
    }

    public MLockedFile(File file, int i) {
        super(file, i);
        mlockBuffer();
    }
}
