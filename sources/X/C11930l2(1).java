package X;

/* renamed from: X.0l2  reason: invalid class name and case insensitive filesystem */
public final class C11930l2 extends AnonymousClass0gG {
    public final AnonymousClass0gG A00;
    public final AnonymousClass0ZU A01;
    public final AnonymousClass0ZU A02;

    public final boolean equals(Object obj) {
        return C04220Ms.A0I(this.A00, obj);
    }

    public final C05190Ru getFuryContext() {
        return this.A00.getFuryContext();
    }

    public final int getPriority() {
        return this.A00.getPriority();
    }

    public final int getRunnableId() {
        return this.A00.getRunnableId();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final boolean isMayRunDuringStartup() {
        return this.A00.isMayRunDuringStartup();
    }

    public final boolean isSendToNetworkThreadPool() {
        return this.A00.isSendToNetworkThreadPool();
    }

    public final void run() {
        this.A02.invoke();
        this.A00.run();
        this.A01.invoke();
    }

    public final void setFuryContext(C05190Ru r2) {
        this.A00.setFuryContext(r2);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C11930l2(AnonymousClass0gG r5, AnonymousClass0ZU r6, AnonymousClass0ZU r7) {
        super(r5.getRunnableId(), r5.getPriority(), r5.isSendToNetworkThreadPool(), r5.isMayRunDuringStartup());
        this.A00 = r5;
        this.A02 = r6;
        this.A01 = r7;
    }
}
