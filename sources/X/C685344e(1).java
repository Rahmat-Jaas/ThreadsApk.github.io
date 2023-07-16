package X;

import com.facebook.pando.TreeJNI;

/* renamed from: X.44e  reason: invalid class name and case insensitive filesystem */
public class C685344e implements C146578mT {
    public boolean mFromDiskCache = false;
    public int mResponseId = -1;
    public long mResponseTimestamp = -1;
    public long mServerElapsedTime = -1;
    public int mStatusCode = -1;

    public static TreeJNI A03(Object obj) {
        return (TreeJNI) ((AnonymousClass5z0) obj).A01;
    }

    public int getResponseId() {
        return this.mResponseId;
    }

    public long getResponseTimestamp() {
        return this.mResponseTimestamp;
    }

    public long getServerElapsedTime() {
        return this.mServerElapsedTime;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public boolean isFromDiskCache() {
        return this.mFromDiskCache;
    }

    public boolean isOk() {
        int i = this.mStatusCode;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    public void setFromDiskCache(boolean z) {
        this.mFromDiskCache = z;
    }

    public void setResponseId(int i) {
        this.mResponseId = i;
    }

    public void setResponseTimestamp(long j) {
        this.mResponseTimestamp = j;
    }

    public void setServerElapsedTime(long j) {
        this.mServerElapsedTime = j;
    }

    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }
}
