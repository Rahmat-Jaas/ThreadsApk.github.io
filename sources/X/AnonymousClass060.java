package X;

/* renamed from: X.060  reason: invalid class name */
public enum AnonymousClass060 {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;
    
    public static final C012805y Companion = null;

    /* access modifiers changed from: public */
    static {
        Companion = new C012805y();
    }

    public final AnonymousClass061 A00() {
        switch (ordinal()) {
            case 0:
            case 4:
                return AnonymousClass061.CREATED;
            case 1:
            case 3:
                return AnonymousClass061.STARTED;
            case 2:
                return AnonymousClass061.RESUMED;
            case 5:
                return AnonymousClass061.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
