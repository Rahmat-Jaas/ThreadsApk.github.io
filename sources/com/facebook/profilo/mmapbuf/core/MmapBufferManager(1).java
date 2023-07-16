package com.facebook.profilo.mmapbuf.core;

import X.AnonymousClass00U;
import X.AnonymousClass0VO;
import X.C15020qa;
import com.facebook.jni.HybridData;
import java.io.File;
import java.util.UUID;

public class MmapBufferManager {
    public final AnonymousClass0VO mFileHelper;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native Buffer nativeAllocateBuffer(int i);

    private native Buffer nativeAllocateBuffer(int i, String str);

    private native boolean nativeDeallocateBuffer(Buffer buffer);

    public synchronized boolean deallocateBuffer(Buffer buffer) {
        return nativeDeallocateBuffer(buffer);
    }

    static {
        C15020qa.A0A("profilo_mmapbuf");
    }

    public Buffer allocateBuffer(int i, boolean z) {
        if (!z) {
            return nativeAllocateBuffer(i);
        }
        String A02 = this.mFileHelper.A02(AnonymousClass00U.A0L(AnonymousClass0VO.A00(UUID.randomUUID().toString()), ".buff"));
        if (A02 == null) {
            return null;
        }
        return nativeAllocateBuffer(i, A02);
    }

    public MmapBufferManager(File file) {
        this.mFileHelper = new AnonymousClass0VO(file);
    }
}
