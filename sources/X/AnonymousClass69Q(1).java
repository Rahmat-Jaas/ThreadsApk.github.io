package X;

/* renamed from: X.69Q  reason: invalid class name */
public enum AnonymousClass69Q {
    PRIMARY_TEXT_LINK(0, 5),
    PRIMARY_TEXT_DEEMPHASIZED(2, 0),
    PRIMARY_TEXT(0, 0),
    PRIMARY_TITLE_LINK_EMPHASIZED(5, 5),
    META_EMPHASIZED_POSITIVE(22, 53),
    META_EMPHASIZED_NEGATIVE(22, 54),
    POST_PURCHASE_ACTION_TEXT(1, 1);
    
    public final int A00;
    public final int A01;

    public static AnonymousClass69Q A00(String str, int i, int i2, int i3) {
        return new AnonymousClass69Q(str, i, i2, i3);
    }

    /* access modifiers changed from: public */
    AnonymousClass69Q(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
