package X;

/* renamed from: X.0iE  reason: invalid class name and case insensitive filesystem */
public enum C10370iE {
    RELEASE;
    
    public static C10370iE A00;

    public static C10370iE A00() {
        if (A00 == null) {
            synchronized (C10370iE.class) {
                if (A00 == null) {
                    A00 = RELEASE;
                }
            }
        }
        return A00;
    }
}
