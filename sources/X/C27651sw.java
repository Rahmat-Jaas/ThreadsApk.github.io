package X;

import com.instagram.feed.media.ImmutablePandoMediaDict;

/* renamed from: X.1sw  reason: invalid class name and case insensitive filesystem */
public final class C27651sw extends AnonymousClass5NL implements C84014sP {
    public final BKU Atv() {
        throw new UnsupportedOperationException("Do not use. Please call toRestModel() first to access the 'media' field.");
    }

    public final AnonymousClass422 Cy6(C112176p7 r4) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) getTreeValueByHashCode(103772132, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            return new AnonymousClass422((BKU) r4.A00(new BKU(r4, immutablePandoMediaDict)), getOptionalIntValueByHashCode(3575610));
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final Integer BIt() {
        return getOptionalIntValueByHashCode(3575610);
    }
}
