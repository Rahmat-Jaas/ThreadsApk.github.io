package X;

/* renamed from: X.5qu  reason: invalid class name and case insensitive filesystem */
public final class C93685qu extends AnonymousClass6JB {
    public final String A00;

    public /* synthetic */ C93685qu(String str) {
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof AnonymousClass6JB) && this.A00.equals(((C93685qu) ((AnonymousClass6JB) obj)).A00));
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ 0;
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A0s = C18190wL.A0s("IntegrityTokenRequest{nonce=");
        A0s.append(str);
        A0s.append(", cloudProjectNumber=");
        A0s.append((Object) null);
        return C18180wK.A0i("}", A0s);
    }
}
