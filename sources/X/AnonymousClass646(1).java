package X;

import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.feed.media.ImmutablePandoMediaDict;

/* renamed from: X.646  reason: invalid class name */
public final class AnonymousClass646 extends AnonymousClass5NL implements C146468mI {
    public final BKU B5g() {
        throw C86134wK.A0s("Do not use. Please call toRestModel() first to access the 'quotedPost' field.");
    }

    public final RepostRestrictedReason B7L() {
        return (RepostRestrictedReason) A09(C139908Pt.A00, -1057215812);
    }

    public final BKU B7M() {
        throw C86134wK.A0s("Do not use. Please call toRestModel() first to access the 'repostedPost' field.");
    }

    public final boolean AVg() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1811049390);
        if (optionalBooleanValueByHashCode != null) {
            return optionalBooleanValueByHashCode.booleanValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final boolean AVk() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1294833502);
        if (optionalBooleanValueByHashCode != null) {
            return optionalBooleanValueByHashCode.booleanValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final boolean BXt() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1017849186);
        if (optionalBooleanValueByHashCode != null) {
            return optionalBooleanValueByHashCode.booleanValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C90535Mj D4U(C112176p7 r10) {
        BKU bku;
        BKU bku2;
        boolean AVg = AVg();
        boolean AVk = AVk();
        boolean BXt = BXt();
        Class<ImmutablePandoMediaDict> cls = ImmutablePandoMediaDict.class;
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) getTreeValueByHashCode(1226924311, cls);
        if (immutablePandoMediaDict != null) {
            bku = new BKU(r10, immutablePandoMediaDict);
        } else {
            bku = null;
        }
        BKU bku3 = null;
        if (bku != null) {
            bku2 = (BKU) r10.A00.CYY(r10, bku);
        } else {
            bku2 = null;
        }
        RepostRestrictedReason B7L = B7L();
        ImmutablePandoMediaDict immutablePandoMediaDict2 = (ImmutablePandoMediaDict) getTreeValueByHashCode(-1962612851, cls);
        if (immutablePandoMediaDict2 != null) {
            bku3 = (BKU) r10.A00.CYY(r10, new BKU(r10, immutablePandoMediaDict2));
        }
        return new C90535Mj(B7L, bku2, bku3, AVg, AVk, BXt);
    }
}
