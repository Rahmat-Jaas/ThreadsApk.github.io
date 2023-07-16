package X;

/* renamed from: X.0gG  reason: invalid class name */
public abstract class AnonymousClass0gG implements Runnable {
    public volatile C05190Ru mFuryContext;
    public final boolean mMayRunDuringStartup;
    public final int mPriority;
    public final int mRunnableId;
    public final boolean mSendToNetworkThreadPool;

    public static AnonymousClass0gG create(int i, Runnable runnable) {
        return new C12340lj(runnable, i);
    }

    public AnonymousClass0gG(int i, int i2, boolean z, boolean z2) {
        this.mRunnableId = i;
        this.mPriority = i2;
        this.mSendToNetworkThreadPool = z;
        this.mMayRunDuringStartup = z2;
    }

    public C05190Ru getFuryContext() {
        return this.mFuryContext;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public int getRunnableId() {
        return this.mRunnableId;
    }

    public boolean isMayRunDuringStartup() {
        return this.mMayRunDuringStartup;
    }

    public boolean isSendToNetworkThreadPool() {
        return this.mSendToNetworkThreadPool;
    }

    public void setFuryContext(C05190Ru r1) {
        this.mFuryContext = r1;
    }

    public AnonymousClass0gG(int i) {
        this(i, 3, false, false);
    }
}
